package defpackage;

import android.R;
import android.content.res.Resources;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import top.th1nk.samp.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class k71 implements un2, md2, bk0, xi, ve, cp3 {
    public final /* synthetic */ int f;
    public Object g;

    public k71(int i) {
        this.f = i;
        switch (i) {
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                this.g = Build.VERSION.SDK_INT >= 28 ? new h01(18) : new h01(19);
                break;
            case 8:
                this.g = new xk1();
                break;
            case vr.g /* 9 */:
            case vr.h /* 10 */:
            default:
                wl1 wl1Var = new wl1();
                this.g = wl1Var;
                if (!wl1Var.g) {
                    if (wl1Var.h) {
                        zb2.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    wl1Var.a();
                    wl1Var.h = true;
                    break;
                }
                break;
            case 11:
                this.g = new LinkedHashSet();
                break;
            case vr.i /* 12 */:
                this.g = b32.w(Boolean.FALSE);
                break;
            case 13:
                this.g = new Region();
                break;
        }
    }

    public static md1 n(k71 k71Var, int i) {
        ie1 ie1Var = (ie1) k71Var.g;
        t63 t63VarL = jo3.l();
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            ee1 ee1Var = (ee1) ie1Var.f.getValue();
            jo3.v(t63VarL, t63VarS, ns0VarE);
            return ie1Var.p.a(i, ee1Var.j, ie1Var.d, new n20(i, ee1Var));
        } catch (Throwable th) {
            jo3.v(t63VarL, t63VarS, ns0VarE);
            throw th;
        }
    }

    @Override // defpackage.cp3, defpackage.zo3
    public boolean a() {
        ((pl) this.g).getClass();
        return false;
    }

    @Override // defpackage.zo3
    public long b(ue ueVar, ue ueVar2, ue ueVar3) {
        return ((pl) this.g).b(ueVar, ueVar2, ueVar3);
    }

    @Override // defpackage.bk0
    public jj2 c() throws Throwable {
        yo2 yo2VarB;
        IOException iOException = null;
        while (!((oj2) this.g).k.v) {
            try {
                yo2VarB = ((oj2) this.g).b();
            } catch (IOException e) {
                if (iOException == null) {
                    iOException = e;
                } else {
                    uq.j(iOException, e);
                }
                if (e instanceof rg0) {
                    throw iOException;
                }
                if (!((oj2) this.g).a(null)) {
                    throw iOException;
                }
            }
            if (!yo2VarB.e()) {
                xo2 xo2VarG = yo2VarB.g();
                if (xo2VarG.b == null && xo2VarG.c == null) {
                    xo2VarG = yo2VarB.c();
                }
                yo2 yo2Var = xo2VarG.b;
                Throwable th = xo2VarG.c;
                if (th != null) {
                    throw th;
                }
                if (yo2Var != null) {
                    ((oj2) this.g).p.addFirst(yo2Var);
                }
            }
            return yo2VarB.d();
        }
        c.r("Canceled");
        return null;
    }

    @Override // defpackage.xi
    public Object d(cs2 cs2Var, Float f, Float f2, ns0 ns0Var, n63 n63Var) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objY = g12.y(cs2Var, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, cl3.c(0.0f, fFloatValue2, 28), (s83) this.g, ns0Var, n63Var);
        return objY == y50.f ? objY : (le) objY;
    }

    @Override // defpackage.bk0
    public oj2 e() {
        return (oj2) this.g;
    }

    @Override // defpackage.md2
    public void f() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.md2
    public void g(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case vr.g /* 9 */:
            default:
                str = "";
                break;
            case vr.h /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.g).setResultCode(i);
    }

    @Override // defpackage.ve
    public wm0 get(int i) {
        switch (this.f) {
            case 26:
                return ((an0[]) this.g)[i];
            case 27:
                return (an0) this.g;
            default:
                return (wm0) this.g;
        }
    }

    public void h() {
        View view = (View) this.g;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void i() {
        int i;
        TypedValue typedValue = new TypedValue();
        MainActivity mainActivity = (MainActivity) this.g;
        Resources.Theme theme = mainActivity.getTheme();
        theme.resolveAttribute(2130903386, typedValue, true);
        if (theme.resolveAttribute(2130903384, typedValue, true)) {
            rn.C(mainActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(2130903301, typedValue, true);
        if (!theme.resolveAttribute(2130903270, typedValue, true) || (i = typedValue.resourceId) == 0) {
            return;
        }
        mainActivity.setTheme(i);
    }

    public g51 j(a31 a31Var, h7 h7Var) {
        long j;
        boolean z;
        long jI;
        xk1 xk1Var = (xk1) this.g;
        List list = (List) a31Var.g;
        xk1 xk1Var2 = new xk1(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            ib2 ib2Var = (ib2) list.get(i);
            long j2 = ib2Var.a;
            hb2 hb2Var = (hb2) xk1Var.b(j2);
            if (hb2Var == null) {
                j = ib2Var.b;
                jI = ib2Var.d;
                z = false;
            } else {
                long j3 = hb2Var.a;
                j = j3;
                z = hb2Var.c;
                jI = h7Var.I(hb2Var.b);
            }
            long j4 = ib2Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            xk1Var2.d(j4, new gb2(j4, ib2Var.b, ib2Var.d, ib2Var.e, ib2Var.f, j, jI, z, ib2Var.g, ib2Var.i, ib2Var.j, ib2Var.k, ib2Var.l, ib2Var.m));
            boolean z2 = ib2Var.e;
            if (z2) {
                xk1Var.d(j2, new hb2(ib2Var.b, ib2Var.c, z2));
            } else {
                xk1Var.e(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new g51(xk1Var2, a31Var);
    }

    @Override // defpackage.zo3
    public ue l(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        return ((pl) this.g).l(j, ueVar, ueVar2, ueVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(defpackage.js r21, defpackage.cs0 r22) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k71.m(js, cs0):java.lang.Object");
    }

    @Override // defpackage.zo3
    public ue p(long j, ue ueVar, ue ueVar2, ue ueVar3) {
        return ((pl) this.g).p(j, ueVar, ueVar2, ueVar3);
    }

    @Override // defpackage.zo3
    public ue q(ue ueVar, ue ueVar2, ue ueVar3) {
        return ((pl) this.g).q(ueVar, ueVar2, ueVar3);
    }

    public void r(m41 m41Var) {
        ((Region) this.g).set(m41Var.a, m41Var.b, m41Var.c, m41Var.d);
    }

    public void s() {
        View viewFindViewById;
        View view = (View) this.g;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new v(13, viewFindViewById));
    }

    public /* synthetic */ k71(int i, boolean z) {
        this.f = i;
    }

    public k71(ua0 ua0Var) {
        this.f = 20;
        this.g = new wj(q83.a, ua0Var);
    }

    public k71(View view) {
        this.f = 18;
        if (Build.VERSION.SDK_INT >= 30) {
            v73 v73Var = new v73(17, view);
            v73Var.h = view;
            this.g = v73Var;
            return;
        }
        this.g = new k71(17, view);
    }

    public /* synthetic */ k71(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    public k71(long[] jArr) {
        rr1 rr1Var;
        this.f = 16;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            rr1Var = new rr1(jArrCopyOf.length);
            int i = rr1Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = rr1Var.a;
                    if (jArr2.length < length) {
                        rr1Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = rr1Var.a;
                    int i2 = rr1Var.b;
                    if (i != i2) {
                        uj.I(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    uj.I(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    rr1Var.b += jArrCopyOf.length;
                }
            } else {
                c.i("");
                throw null;
            }
        } else {
            rr1Var = new rr1();
        }
        this.g = rr1Var;
    }

    public k71(kv3 kv3Var) {
        this.f = 22;
        this.g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), kv3Var);
    }

    public k71(float f, float f2, ue ueVar) {
        Object k71Var;
        this.f = 29;
        int[] iArr = ap3.a;
        if (ueVar == null && f == 1.0f && f2 == 1500.0f) {
            k71Var = t90.f;
        } else if (ueVar != null) {
            k71Var = new k71(ueVar, f, f2);
        } else {
            k71Var = new k71(f, f2);
        }
        this.g = new pl(11, k71Var);
    }

    public k71(ue ueVar, float f, float f2) {
        this.f = 26;
        int iB = ueVar.b();
        an0[] an0VarArr = new an0[iB];
        for (int i = 0; i < iB; i++) {
            an0VarArr[i] = new an0(f, f2, ueVar.a(i));
        }
        this.g = an0VarArr;
    }

    public k71(float f, float f2) {
        this.f = 27;
        this.g = new an0(f, f2);
    }
}
