package defpackage;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class h01 implements dx1, iy1, y62, md2 {
    public final /* synthetic */ int f;

    public /* synthetic */ h01(int i) {
        this.f = i;
    }

    public static final String i(kq kqVar, kq[] kqVarArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        kq kqVar2 = ie2.b;
        int iB = kqVar.b();
        int i5 = 0;
        while (i5 < iB) {
            int i6 = (i5 + iB) / 2;
            while (i6 > -1 && kqVar.e(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (kqVar.e(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bE = kqVarArr[i10].e(i11);
                    byte[] bArr = jv3.a;
                    int i13 = bE & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bE2 = kqVar.e(i7 + i12);
                byte[] bArr2 = jv3.a;
                i4 = i3 - (bE2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (kqVarArr[i10].b() != i11) {
                    z2 = z;
                } else {
                    if (i10 == kqVarArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iB2 = kqVarArr[i10].b() - i11;
                    int length = kqVarArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iB2 += kqVarArr[i15].b();
                    }
                    if (iB2 >= i14) {
                        if (iB2 <= i14) {
                            return kqVar.i(i7, i9 + i7).h(ys.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iB = i6;
        }
        return null;
    }

    public static final void j(ak2 ak2Var) {
        i93 i93Var;
        x52 x52Var;
        x52 x52Var2;
        i93 i93Var2 = ek2.z;
        do {
            i93Var = ek2.z;
            x52Var = (x52) i93Var.getValue();
            o52 o52VarC = x52Var.h;
            qg1 qg1Var = (qg1) o52VarC.get(ak2Var);
            if (qg1Var == null) {
                x52Var2 = x52Var;
            } else {
                Object obj = qg1Var.a;
                Object obj2 = qg1Var.b;
                tk3 tk3Var = o52VarC.f;
                tk3 tk3VarV = tk3Var.v(ak2Var != null ? ak2Var.hashCode() : 0, 0, ak2Var);
                if (tk3Var != tk3VarV) {
                    o52VarC = tk3VarV == null ? o52.h : new o52(tk3VarV, o52VarC.g - 1);
                }
                f5 f5Var = f5.V;
                if (obj != f5Var) {
                    Object obj3 = o52VarC.get(obj);
                    obj3.getClass();
                    o52VarC = o52VarC.c(obj, new qg1(((qg1) obj3).a, obj2));
                }
                if (obj2 != f5Var) {
                    Object obj4 = o52VarC.get(obj2);
                    obj4.getClass();
                    o52VarC = o52VarC.c(obj2, new qg1(obj, ((qg1) obj4).b));
                }
                Object obj5 = obj != f5Var ? x52Var.f : obj2;
                if (obj2 != f5Var) {
                    obj = x52Var.g;
                }
                x52Var2 = new x52(obj5, obj, o52VarC);
            }
            if (x52Var == x52Var2) {
                return;
            }
        } while (!i93Var.h(x52Var, x52Var2));
    }

    public static ArrayList k(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((de2) obj) != de2.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(rx.d0(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((de2) obj2).f);
        }
        return arrayList2;
    }

    public static byte[] l(List list) {
        list.getClass();
        hp hpVar = new hp();
        ArrayList arrayListK = k(list);
        int size = arrayListK.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListK.get(i);
            i++;
            String str = (String) obj;
            hpVar.v(str.length());
            hpVar.E(str);
        }
        return hpVar.i(hpVar.g);
    }

    public static qt1 m(qh0 qh0Var, fu1 fu1Var, Bundle bundle, ff1 ff1Var, xt1 xt1Var) {
        String string = UUID.randomUUID().toString();
        string.getClass();
        fu1Var.getClass();
        ff1Var.getClass();
        return new qt1(qh0Var, fu1Var, bundle, ff1Var, xt1Var, string, null);
    }

    public static Typeface o(String str, xq0 xq0Var, int i) {
        if (i == 0 && s51.n(xq0Var, xq0.h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && s51.n(xq0Var, xq0.k) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), xq0Var.f, i == 1);
    }

    public static Typeface p(String str, xq0 xq0Var, int i) {
        if (i == 0 && s51.n(xq0Var, xq0.h) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iR = r51.r(xq0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iR) : Typeface.create(str, iR);
    }

    public static de2 t(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return de2.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return de2.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return de2.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return de2.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return de2.SPDY_3;
        }
        if (str.equals("quic")) {
            return de2.QUIC;
        }
        if (fa3.e0(str, "h3", false)) {
            return de2.HTTP_3;
        }
        c.r("Unexpected protocol: ".concat(str));
        return null;
    }

    @Override // defpackage.dx1
    public boolean a(aq1 aq1Var) {
        return false;
    }

    @Override // defpackage.dx1
    public int b() {
        return 8;
    }

    @Override // defpackage.dx1
    public boolean c(aq1 aq1Var) {
        return w7.U(g12.p(vr.X(aq1Var), false));
    }

    @Override // defpackage.dx1
    public void d(tb1 tb1Var, long j, ly0 ly0Var, int i, boolean z) {
        ax1 ax1Var = tb1Var.L;
        ex1 ex1Var = ax1Var.d;
        fi1 fi1Var = ex1.b0;
        ax1Var.d.C1(ex1.h0, ex1Var.t1(j, true), ly0Var, 1, z);
    }

    @Override // defpackage.dx1
    public boolean e(ly0 ly0Var, tb1 tb1Var) {
        return false;
    }

    @Override // defpackage.md2
    public void f() {
        switch (this.f) {
            case 22:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // defpackage.md2
    public void g(int i, Object obj) {
        String str;
        switch (this.f) {
            case 22:
                break;
            default:
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
                break;
        }
    }

    @Override // defpackage.dx1
    public boolean h(tb1 tb1Var) {
        qu2 qu2VarW = tb1Var.w();
        boolean z = false;
        if (qu2VarW != null && qu2VarW.i) {
            z = true;
        }
        return !z;
    }

    public Typeface q(zv0 zv0Var, xq0 xq0Var, int i) {
        switch (this.f) {
            case 18:
                return o(zv0Var.d, xq0Var, i);
            default:
                String strConcat = zv0Var.d;
                int i2 = xq0Var.f / 100;
                if (i2 >= 0 && i2 < 2) {
                    strConcat = strConcat.concat("-thin");
                } else if (2 <= i2 && i2 < 4) {
                    strConcat = strConcat.concat("-light");
                } else if (i2 != 4) {
                    if (i2 == 5) {
                        strConcat = strConcat.concat("-medium");
                    } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                        strConcat = strConcat.concat("-black");
                    }
                }
                Typeface typeface = null;
                if (strConcat.length() != 0) {
                    Typeface typefaceP = p(strConcat, xq0Var, i);
                    if (!s51.n(typefaceP, Typeface.create(Typeface.DEFAULT, r51.r(xq0Var, i))) && !s51.n(typefaceP, p(null, xq0Var, i))) {
                        typeface = typefaceP;
                    }
                }
                return typeface == null ? p(zv0Var.d, xq0Var, i) : typeface;
        }
    }

    public y92 s(ContextWrapper contextWrapper) {
        y92 y92Var;
        contextWrapper.getClass();
        y92 y92Var2 = y92.j;
        if (y92Var2 != null) {
            return y92Var2;
        }
        synchronized (this) {
            y92Var = y92.j;
            if (y92Var == null) {
                y92Var = new y92(contextWrapper);
                y92.j = y92Var;
            }
        }
        return y92Var;
    }

    public void u(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x0225, code lost:
    
        if (defpackage.c71.a(defpackage.gq.h(r15.getKeyCode()), defpackage.c71.o) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0331, code lost:
    
        if (defpackage.c71.a(r14, defpackage.c71.N) == false) goto L302;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d71 v(KeyEvent keyEvent) {
        d71 d71Var;
        int i = this.f;
        d71 d71Var2 = d71.SELECT_LINE_START;
        d71 d71Var3 = d71.SELECT_LINE_END;
        d71 d71Var4 = d71.NEW_LINE;
        d71 d71Var5 = d71.DELETE_PREV_CHAR;
        switch (i) {
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                int I = vp.I(keyEvent);
                d71 d71Var6 = d71.REDO;
                if (I != 10) {
                    d71 d71Var7 = d71.COPY;
                    d71 d71Var8 = d71.CUT;
                    d71 d71Var9 = d71.PASTE;
                    if (I == 2) {
                        long jH = gq.h(keyEvent.getKeyCode());
                        if (!c71.a(jH, c71.j) && !c71.a(jH, c71.x) && !c71.a(jH, c71.N)) {
                            if (!c71.a(jH, c71.l)) {
                                if (!c71.a(jH, c71.m)) {
                                    if (c71.a(jH, c71.i)) {
                                        return d71.SELECT_ALL;
                                    }
                                    if (!c71.a(jH, c71.n)) {
                                        if (c71.a(jH, c71.o)) {
                                            return d71.UNDO;
                                        }
                                        return null;
                                    }
                                    return d71Var6;
                                }
                                return d71Var8;
                            }
                            return d71Var9;
                        }
                        return d71Var7;
                    }
                    if (I == 8) {
                        long jH2 = gq.h(keyEvent.getKeyCode());
                        if (c71.a(jH2, c71.f) || c71.a(jH2, c71.H)) {
                            return d71.SELECT_LEFT_CHAR;
                        }
                        if (c71.a(jH2, c71.g) || c71.a(jH2, c71.I)) {
                            return d71.SELECT_RIGHT_CHAR;
                        }
                        if (c71.a(jH2, c71.d) || c71.a(jH2, c71.F)) {
                            return d71.SELECT_UP;
                        }
                        if (c71.a(jH2, c71.e) || c71.a(jH2, c71.G)) {
                            return d71.SELECT_DOWN;
                        }
                        if (c71.a(jH2, c71.C) || c71.a(jH2, c71.L)) {
                            return d71.SELECT_PAGE_UP;
                        }
                        if (c71.a(jH2, c71.D) || c71.a(jH2, c71.M)) {
                            return d71.SELECT_PAGE_DOWN;
                        }
                        if (c71.a(jH2, c71.v) || c71.a(jH2, c71.J)) {
                            return d71Var2;
                        }
                        if (c71.a(jH2, c71.w) || c71.a(jH2, c71.K)) {
                            return d71Var3;
                        }
                        if (!c71.a(jH2, c71.x)) {
                            break;
                        }
                        return d71Var9;
                    }
                    if (I == 0) {
                        long jH3 = gq.h(keyEvent.getKeyCode());
                        if (c71.a(jH3, c71.f) || c71.a(jH3, c71.H)) {
                            return d71.LEFT_CHAR;
                        }
                        if (c71.a(jH3, c71.g) || c71.a(jH3, c71.I)) {
                            return d71.RIGHT_CHAR;
                        }
                        if (c71.a(jH3, c71.d) || c71.a(jH3, c71.F)) {
                            return d71.UP;
                        }
                        if (c71.a(jH3, c71.e) || c71.a(jH3, c71.G)) {
                            return d71.DOWN;
                        }
                        if (c71.a(jH3, c71.h)) {
                            return d71.CENTER;
                        }
                        if (c71.a(jH3, c71.C) || c71.a(jH3, c71.L)) {
                            return d71.PAGE_UP;
                        }
                        if (c71.a(jH3, c71.D) || c71.a(jH3, c71.M)) {
                            return d71.PAGE_DOWN;
                        }
                        if (c71.a(jH3, c71.v) || c71.a(jH3, c71.J)) {
                            return d71.LINE_START;
                        }
                        if (c71.a(jH3, c71.w) || c71.a(jH3, c71.K)) {
                            return d71.LINE_END;
                        }
                        if (c71.a(jH3, c71.r) || c71.a(jH3, c71.E)) {
                            return d71Var4;
                        }
                        if (c71.a(jH3, c71.s)) {
                            return d71Var5;
                        }
                        if (c71.a(jH3, c71.t)) {
                            return d71.DELETE_NEXT_CHAR;
                        }
                        if (!c71.a(jH3, c71.A)) {
                            if (!c71.a(jH3, c71.y)) {
                                if (!c71.a(jH3, c71.z)) {
                                    if (c71.a(jH3, c71.p)) {
                                        return d71.TAB;
                                    }
                                }
                                return d71Var7;
                            }
                            return d71Var8;
                        }
                        return d71Var9;
                    }
                    return null;
                }
                break;
                break;
            default:
                int I2 = vp.I(keyEvent);
                if (I2 == 9) {
                    long jH4 = gq.h(keyEvent.getKeyCode());
                    d71Var = c71.a(jH4, c71.f) ? d71.SELECT_LINE_LEFT : c71.a(jH4, c71.g) ? d71.SELECT_LINE_RIGHT : c71.a(jH4, c71.d) ? d71.SELECT_HOME : c71.a(jH4, c71.e) ? d71.SELECT_END : null;
                } else if (I2 == 1) {
                    long jH5 = gq.h(keyEvent.getKeyCode());
                    if (c71.a(jH5, c71.f)) {
                        d71Var = d71.LINE_LEFT;
                    } else if (c71.a(jH5, c71.g)) {
                        d71Var = d71.LINE_RIGHT;
                    } else if (c71.a(jH5, c71.d)) {
                        d71Var = d71.HOME;
                    } else if (c71.a(jH5, c71.e)) {
                        d71Var = d71.END;
                    } else if (c71.a(jH5, c71.s)) {
                        d71Var = d71.DELETE_FROM_LINE_START;
                    }
                }
                if (d71Var != null) {
                    return d71Var;
                }
                k71 k71Var = n92.N;
                int I3 = vp.I(keyEvent);
                long jH6 = gq.h(keyEvent.getKeyCode());
                if (c71.a(jH6, c71.s)) {
                    d71Var4 = (I3 == 0 || I3 == 8 || I3 == 12) ? d71Var5 : (I3 == 2 || I3 == 10) ? d71.DELETE_PREV_WORD : null;
                } else if ((!c71.a(jH6, c71.r) && !c71.a(jH6, c71.E)) || (I3 != 0 && I3 != 8 && I3 != 2 && I3 != 10)) {
                }
                if (d71Var4 != null) {
                    return d71Var4;
                }
                int I4 = vp.I(keyEvent);
                if (I4 == 10) {
                    long jH7 = gq.h(keyEvent.getKeyCode());
                    d71Var2 = (c71.a(jH7, c71.f) || c71.a(jH7, c71.H)) ? d71.SELECT_LEFT_WORD : (c71.a(jH7, c71.g) || c71.a(jH7, c71.I)) ? d71.SELECT_RIGHT_WORD : (c71.a(jH7, c71.d) || c71.a(jH7, c71.F)) ? d71.SELECT_PREV_PARAGRAPH : (c71.a(jH7, c71.e) || c71.a(jH7, c71.G)) ? d71.SELECT_NEXT_PARAGRAPH : null;
                } else if (I4 == 2) {
                    long jH8 = gq.h(keyEvent.getKeyCode());
                    if (c71.a(jH8, c71.f) || c71.a(jH8, c71.H)) {
                        d71Var2 = d71.LEFT_WORD;
                    } else if (c71.a(jH8, c71.g) || c71.a(jH8, c71.I)) {
                        d71Var2 = d71.RIGHT_WORD;
                    } else if (c71.a(jH8, c71.d) || c71.a(jH8, c71.F)) {
                        d71Var2 = d71.PREV_PARAGRAPH;
                    } else if (c71.a(jH8, c71.e) || c71.a(jH8, c71.G)) {
                        d71Var2 = d71.NEXT_PARAGRAPH;
                    } else if (c71.a(jH8, c71.k)) {
                        d71Var2 = d71Var5;
                    } else if (c71.a(jH8, c71.t)) {
                        d71Var2 = d71.DELETE_NEXT_WORD;
                    } else if (c71.a(jH8, c71.B)) {
                        d71Var2 = d71.DESELECT;
                    }
                } else if (I4 == 8) {
                    long jH9 = gq.h(keyEvent.getKeyCode());
                    if (!c71.a(jH9, c71.v) && !c71.a(jH9, c71.J)) {
                        if (c71.a(jH9, c71.w) || c71.a(jH9, c71.K)) {
                            d71Var2 = d71Var3;
                        }
                    }
                } else if (I4 == 1 && c71.a(gq.h(keyEvent.getKeyCode()), c71.t)) {
                    d71Var2 = d71.DELETE_TO_LINE_END;
                }
                return d71Var2 == null ? ((h01) k71Var.g).v(keyEvent) : d71Var2;
        }
    }

    private final void w() {
    }

    @Override // defpackage.iy1
    public int n(int i) {
        return i;
    }

    @Override // defpackage.iy1
    public int r(int i) {
        return i;
    }

    private final void x(int i, Object obj) {
    }

    public void y(rb2 rb2Var, int i, int i2) {
    }
}
