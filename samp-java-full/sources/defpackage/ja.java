package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ ja(mc0 mc0Var, t73 t73Var) {
        this.f = 13;
        this.g = mc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0263  */
    /* JADX WARN: Type inference failed for: r0v12, types: [zt3] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r2v0, types: [p40] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        l20 l20Var;
        int i = 2;
        ?? r2 = 0;
        r2 = 0;
        switch (this.f) {
            case 0:
                ur.o(((ma) this.g).h, null);
                return dm3.a;
            case 1:
                vr.J((cb) this.g);
                return dm3.a;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((yd3) this.g).Y0();
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return dm3.a;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((kl) this.g).t.getClass();
                throw new ClassCastException();
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return (af) this.g;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return (jk2) this.g;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                cs0 cs0Var = ((az) this.g).P;
                if (cs0Var != null) {
                    cs0Var.a();
                }
                return Boolean.TRUE;
            case 8:
                a20 a20Var = (a20) this.g;
                boolean zB = p41.b(0L, 0L);
                View view = a20Var.a;
                if (!zB) {
                    return new ab0(0L, rn.f(view.getContext()).R(lr.T(0L)));
                }
                Context context = view.getContext();
                Context baseContext = context;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        r2 = baseContext;
                        if (r2 == 0) {
                        }
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() == null) {
                            if (r2 == 0) {
                                Configuration configuration = context.getResources().getConfiguration();
                                ya0 ya0VarF = rn.f(context);
                                long jB = uq.b(configuration.screenWidthDp, configuration.screenHeightDp);
                                return new ab0(lr.S(ya0VarF.C0(jB)), jB);
                            }
                            xt3.a.getClass();
                            wt3 wt3Var = wt3.a;
                            yt3 yt3Var = wt3.b;
                            yt3Var.getClass();
                            int i2 = Build.VERSION.SDK_INT;
                            vt3 vt3VarH = (i2 >= 34 ? wa0.g : i2 >= 30 ? zn.g : m22.C).h(r2, yt3Var.b);
                            long jWidth = (((long) vt3VarH.a().width()) << 32) | (((long) vt3VarH.a().height()) & 4294967295L);
                            return new ab0(jWidth, rn.f(r2).R(lr.T(jWidth)));
                        }
                        baseContext = contextWrapper.getBaseContext();
                    }
                }
                if (r2 == 0) {
                }
                break;
            case vr.g /* 9 */:
                return ((ye1) this.g).d();
            case vr.h /* 10 */:
                return new lf3((t02) this.g, 0.0f);
            case 11:
                ((je3) this.g).close();
                return dm3.a;
            case vr.i /* 12 */:
                ((if0) this.g).p1();
                return dm3.a;
            case 13:
                ((mc0) this.g).a();
                return Boolean.TRUE;
            case 14:
                File file = (File) this.g;
                synchronized (ql0.d) {
                    ql0.c.remove(file.getAbsolutePath());
                }
                return dm3.a;
            case jo3.g /* 15 */:
                ((rp0) this.g).r1();
                return dm3.a;
            case 16:
                wz0 wz0Var = (wz0) this.g;
                wz0Var.getClass();
                try {
                    wz0Var.B.j(2, 0, false);
                    break;
                } catch (IOException e) {
                    nj0 nj0Var = nj0.i;
                    wz0Var.b(nj0Var, nj0Var, e);
                }
                return dm3.a;
            case 17:
                return Float.valueOf(t22.y(((x50) this.g).h()));
            case 18:
                Object systemService = ((View) ((pi) this.g).g).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 19:
                Object systemService2 = ((View) ((a31) this.g).g).getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case 20:
                a51 a51Var = (a51) this.g;
                cl3.t(a51Var.a, null, new z41(a51Var, r2, i), 3);
                return dm3.a;
            case 21:
                return Integer.valueOf(ea1.k.indexOf((ea1) this.g));
            case 22:
                xb1 xb1Var = ((tb1) this.g).M;
                xb1Var.p.E = true;
                gl1 gl1Var = xb1Var.q;
                if (gl1Var != null) {
                    gl1Var.y = true;
                }
                return dm3.a;
            case 23:
                zb1 zb1Var = (zb1) this.g;
                if (!((Boolean) zb1Var.g.getValue()).booleanValue() && (l20Var = zb1Var.c) != null) {
                    l20Var.l();
                }
                return dm3.a;
            case 24:
                return new BaseInputConnection(((ze1) this.g).a, false);
            case 25:
                wl1 wl1Var = (wl1) ((tf1) this.g).a.g;
                if (!wl1Var.g) {
                    if (wl1Var.h) {
                        zb2.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    wl1Var.a();
                    wl1Var.h = true;
                }
                return dm3.a;
            case 26:
                return Float.valueOf(((z32) this.g).g());
            case 27:
                return (z13) this.g;
            case 28:
                ((jp1) this.g).j.a();
                return dm3.a;
            default:
                cq1 cq1Var = (cq1) this.g;
                cq1Var.f = false;
                HashSet hashSet = new HashSet();
                as1 as1Var = cq1Var.d;
                if (as1Var != null) {
                    Object[] objArr = as1Var.a;
                    int i3 = as1Var.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        tb1 tb1Var = (tb1) objArr[i4];
                        as1 as1Var2 = cq1Var.e;
                        if (as1Var2 == null) {
                            as1Var2 = new as1();
                            cq1Var.e = as1Var2;
                        }
                        fe2 fe2Var = (fe2) as1Var2.g(i4);
                        aq1 aq1Var = tb1Var.L.f;
                        if (aq1Var.s) {
                            cq1.b(aq1Var, fe2Var);
                        }
                    }
                    as1Var.e();
                    as1 as1Var3 = cq1Var.e;
                    if (as1Var3 != null) {
                        as1Var3.e();
                    }
                }
                as1 as1Var4 = cq1Var.b;
                if (as1Var4 != null) {
                    Object[] objArr2 = as1Var4.a;
                    int i5 = as1Var4.b;
                    for (int i6 = 0; i6 < i5; i6++) {
                        kl klVar = (kl) objArr2[i6];
                        as1 as1Var5 = cq1Var.c;
                        if (as1Var5 == null) {
                            as1Var5 = new as1();
                            cq1Var.c = as1Var5;
                        }
                        fe2 fe2Var2 = (fe2) as1Var5.g(i6);
                        if (klVar.s) {
                            cq1.b(klVar, fe2Var2);
                        }
                    }
                    as1Var4.e();
                    as1 as1Var6 = cq1Var.c;
                    if (as1Var6 != null) {
                        as1Var6.e();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((kl) it.next()).r1();
                }
                return dm3.a;
        }
    }

    public /* synthetic */ ja(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }
}
