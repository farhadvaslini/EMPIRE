package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class dj0 {
    public static final bl3 a = new bl3(hd.o, hd.p);
    public static final s83 b = n92.F(0.0f, 400.0f, null, 5);
    public static final s83 c = n92.F(0.0f, 400.0f, null, 5);
    public static final s83 d;
    public static final s83 e;

    static {
        jk2 jk2Var = mr3.a;
        d = n92.F(0.0f, 400.0f, new i41(4294967297L), 1);
        e = n92.F(0.0f, 400.0f, new p41(4294967297L), 1);
    }

    public static final void a(gk3 gk3Var, cs0 cs0Var, nv0 nv0Var, int i) {
        int i2;
        nv0Var.b0(-1186853286);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(gk3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            d42 d42Var = gk3Var.e;
            d42 d42Var2 = gk3Var.d;
            boolean z = d42Var.getValue() != null;
            if (s51.n(gk3Var.a.h(), d42Var2.getValue()) && !z) {
                cs0Var.a();
            }
            Object objO = nv0Var.O();
            zj zjVar = c20.a;
            Object obj = objO;
            if (objO == zjVar) {
                boolean[] zArr = {z};
                nv0Var.j0(zArr);
                obj = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj;
            Object objO2 = nv0Var.O();
            if (objO2 == zjVar) {
                objO2 = new Object[1];
                nv0Var.j0(objO2);
            }
            Object[] objArr = (Object[]) objO2;
            if (!s51.n(objArr[0], d42Var2.getValue())) {
                if (!z && !zArr2[0]) {
                    cs0Var.a();
                }
                objArr[0] = d42Var2.getValue();
            }
            zArr2[0] = z;
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new wi0(gk3Var, cs0Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.bq1 b(defpackage.gk3 r20, defpackage.ij0 r21, defpackage.ek0 r22, defpackage.cs0 r23, defpackage.u23 r24, java.lang.String r25, defpackage.nv0 r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dj0.b(gk3, ij0, ek0, cs0, u23, java.lang.String, nv0, int, int):bq1");
    }

    public static ij0 c(s83 s83Var, tm tmVar, int i) {
        tm tmVar2 = f5.u;
        int i2 = 1;
        if ((i & 1) != 0) {
            jk2 jk2Var = mr3.a;
            s83Var = n92.F(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            tmVar = tmVar2;
        }
        return d(s83Var, s51.n(tmVar, f5.s) ? f5.j : s51.n(tmVar, tmVar2) ? f5.l : f5.k, new hd(i2, 17));
    }

    public static final ij0 d(mm0 mm0Var, h5 h5Var, ns0 ns0Var) {
        return new ij0(new fk3((cl0) null, (q43) null, new hs(h5Var, ns0Var, mm0Var, true), (kr2) null, (LinkedHashMap) null, 123));
    }

    public static ij0 e(int i) {
        um umVar = f5.r;
        um umVar2 = f5.p;
        jk2 jk2Var = mr3.a;
        int i2 = 1;
        s83 s83VarF = n92.F(0.0f, 400.0f, new p41(4294967297L), 1);
        um umVar3 = (i & 2) != 0 ? umVar : umVar2;
        return d(s83VarF, s51.n(umVar3, umVar2) ? f5.h : s51.n(umVar3, umVar) ? f5.n : f5.k, new hd(i2, 18));
    }

    public static ij0 f(mm0 mm0Var, int i) {
        if ((i & 1) != 0) {
            mm0Var = n92.F(0.0f, 400.0f, null, 5);
        }
        return new ij0(new fk3(new cl0(0.0f, mm0Var), (q43) null, (hs) null, (kr2) null, (LinkedHashMap) null, 126));
    }

    public static ek0 g(mm0 mm0Var, int i) {
        if ((i & 1) != 0) {
            mm0Var = n92.F(0.0f, 400.0f, null, 5);
        }
        return new ek0(new fk3(new cl0(0.0f, mm0Var), (q43) null, (hs) null, (kr2) null, (LinkedHashMap) null, 126));
    }

    public static ek0 h(s83 s83Var, tm tmVar, int i) {
        tm tmVar2 = f5.u;
        int i2 = 1;
        if ((i & 1) != 0) {
            jk2 jk2Var = mr3.a;
            s83Var = n92.F(0.0f, 400.0f, new p41(4294967297L), 1);
        }
        if ((i & 2) != 0) {
            tmVar = tmVar2;
        }
        return i(s83Var, s51.n(tmVar, f5.s) ? f5.j : s51.n(tmVar, tmVar2) ? f5.l : f5.k, new hd(i2, 19));
    }

    public static final ek0 i(mm0 mm0Var, h5 h5Var, ns0 ns0Var) {
        return new ek0(new fk3((cl0) null, (q43) null, new hs(h5Var, ns0Var, mm0Var, true), (kr2) null, (LinkedHashMap) null, 123));
    }

    public static ek0 j(int i) {
        um umVar = f5.r;
        um umVar2 = f5.p;
        jk2 jk2Var = mr3.a;
        int i2 = 1;
        s83 s83VarF = n92.F(0.0f, 400.0f, new p41(4294967297L), 1);
        um umVar3 = (i & 2) != 0 ? umVar : umVar2;
        return i(s83VarF, s51.n(umVar3, umVar2) ? f5.h : s51.n(umVar3, umVar) ? f5.n : f5.k, new hd(i2, 20));
    }

    public static ij0 k(ns0 ns0Var) {
        jk2 jk2Var = mr3.a;
        return new ij0(new fk3((cl0) null, new q43(new cj0(ns0Var, 0), n92.F(0.0f, 400.0f, new i41(4294967297L), 1)), (hs) null, (kr2) null, (LinkedHashMap) null, 125));
    }

    public static ek0 l(ns0 ns0Var) {
        jk2 jk2Var = mr3.a;
        return new ek0(new fk3((cl0) null, new q43(new cj0(ns0Var, 1), n92.F(0.0f, 400.0f, new i41(4294967297L), 1)), (hs) null, (kr2) null, (LinkedHashMap) null, 125));
    }

    public static final ij0 m(gk3 gk3Var, ij0 ij0Var, nv0 nv0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && nv0Var.f(gk3Var)) || (i & 6) == 4;
        Object objO = nv0Var.O();
        if (z || objO == c20.a) {
            objO = b32.w(ij0Var);
            nv0Var.j0(objO);
        }
        os1 os1Var = (os1) objO;
        u10 u10Var = gk3Var.a;
        d42 d42Var = gk3Var.d;
        if (u10Var.h() == d42Var.getValue() && gk3Var.a.h() == ti0.g) {
            if (gk3Var.g()) {
                os1Var.setValue(ij0Var);
            } else {
                os1Var.setValue(ij0.b);
            }
        } else if (d42Var.getValue() != ti0.h) {
            os1Var.setValue(((ij0) os1Var.getValue()).a(ij0Var));
        }
        return (ij0) os1Var.getValue();
    }

    public static final ek0 n(gk3 gk3Var, ek0 ek0Var, nv0 nv0Var, int i) {
        q43 q43Var;
        hs hsVar;
        boolean z = (((i & 14) ^ 6) > 4 && nv0Var.f(gk3Var)) || (i & 6) == 4;
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (z || objO == zjVar) {
            objO = b32.w(ek0Var);
            nv0Var.j0(objO);
        }
        os1 os1Var = (os1) objO;
        u10 u10Var = gk3Var.a;
        d42 d42Var = gk3Var.d;
        Object objH = u10Var.h();
        Object value = d42Var.getValue();
        ti0 ti0Var = ti0.g;
        if (objH == value && gk3Var.a.h() == ti0Var) {
            nv0Var.a0(-505142498);
            nv0Var.p(false);
            if (gk3Var.g()) {
                os1Var.setValue(ek0Var);
            } else {
                os1Var.setValue(ek0.b);
            }
        } else if (d42Var.getValue() != ti0Var) {
            nv0Var.a0(-504838512);
            cl0 cl0Var = ((ek0) os1Var.getValue()).a.a;
            cl0 cl0Var2 = cl0Var != null ? new cl0(1.0f, cl0Var.b) : null;
            kr2 kr2Var = ((ek0) os1Var.getValue()).a.d;
            kr2 kr2Var2 = kr2Var != null ? new kr2(1.0f, kr2Var.b, kr2Var.c) : null;
            q43 q43Var2 = ((ek0) os1Var.getValue()).a.b;
            if (q43Var2 == null) {
                nv0Var.a0(-504119809);
                nv0Var.p(false);
                q43Var = null;
            } else {
                nv0Var.a0(-708998590);
                Object objO2 = nv0Var.O();
                if (objO2 == zjVar) {
                    objO2 = hd.r;
                    nv0Var.j0(objO2);
                }
                q43 q43Var3 = new q43((ns0) objO2, q43Var2.b);
                nv0Var.p(false);
                q43Var = q43Var3;
            }
            hs hsVar2 = ((ek0) os1Var.getValue()).a.c;
            if (hsVar2 == null) {
                nv0Var.a0(-504024174);
                nv0Var.p(false);
                hsVar = null;
            } else {
                nv0Var.a0(-708995505);
                Object objO3 = nv0Var.O();
                if (objO3 == zjVar) {
                    objO3 = hd.s;
                    nv0Var.j0(objO3);
                }
                hs hsVar3 = new hs(hsVar2.a, (ns0) objO3, hsVar2.c, hsVar2.d);
                nv0Var.p(false);
                hsVar = hsVar3;
            }
            fk3 fk3Var = ((ek0) os1Var.getValue()).a;
            os1Var.setValue(new ek0(new fk3(cl0Var2, q43Var, hsVar, kr2Var2, (LinkedHashMap) null, 96)).a(ek0Var));
            nv0Var.p(false);
        } else {
            nv0Var.a0(-503833306);
            nv0Var.p(false);
        }
        return (ek0) os1Var.getValue();
    }
}
