package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static final bq1 b(gk3 gk3Var, ij0 ij0Var, ek0 ek0Var, cs0 cs0Var, u23 u23Var, String str, nv0 nv0Var, int i, int i2) {
        cs0 cs0Var2;
        ij0 ij0VarM;
        ek0 ek0VarN;
        bl3 bl3Var;
        boolean z;
        boolean z2;
        hs hsVar;
        fk3 fk3Var;
        bl3 bl3Var2;
        bk3 bk3Var;
        bk3 bk3Var2;
        bk3 bk3Var3;
        hs hsVar2;
        boolean z3;
        nv0 nv0Var2;
        u23 u23Var2;
        ek0 ek0Var2;
        ij0 ij0Var2;
        bq1 ip3Var;
        boolean z4;
        boolean z5;
        bq1 bq1Var;
        nv0 nv0Var3;
        u23 u23Var3;
        bl3 bl3Var3;
        bk3 bk3Var4;
        boolean z6;
        bk3 bk3VarG;
        gk3 gk3Var2;
        nv0 nv0Var4;
        bq1 bq1Var2;
        bk3 bk3Var5;
        bk3 bk3VarG2;
        boolean zH;
        Object objO;
        ij0 ij0Var3;
        ek0 ek0Var3;
        nv0 nv0Var5;
        boolean zH2;
        Object objO2;
        boolean zG;
        Object objO3;
        bl3 bl3Var4 = rn.l1;
        int i3 = 1;
        boolean z7 = (i2 & 4) != 0;
        int i4 = i2 & 8;
        zj zjVar = c20.a;
        if (i4 != 0) {
            Object objO4 = nv0Var.O();
            if (objO4 == zjVar) {
                objO4 = ca0.i;
                nv0Var.j0(objO4);
            }
            cs0Var2 = (cs0) objO4;
        } else {
            cs0Var2 = cs0Var;
        }
        u23 u23Var4 = (i2 & 16) != 0 ? null : u23Var;
        if (z7) {
            nv0Var.a0(-1491184033);
            ij0VarM = m(gk3Var, ij0Var, nv0Var, 0);
        } else {
            ij0VarM = ij0Var;
            nv0Var.a0(-1491182875);
        }
        nv0Var.p(false);
        ij0 ij0Var4 = ij0VarM;
        if (z7) {
            nv0Var.a0(-1491181156);
            ek0VarN = n(gk3Var, ek0Var, nv0Var, 0);
        } else {
            ek0VarN = ek0Var;
            nv0Var.a0(-1491180092);
        }
        nv0Var.p(false);
        ek0 ek0Var4 = ek0VarN;
        if (u23Var4 == null) {
            nv0Var.a0(-968938819);
            boolean zF = nv0Var.f(gk3Var);
            Object objO5 = nv0Var.O();
            if (zF || objO5 == zjVar) {
                objO5 = new u23();
                nv0Var.j0(objO5);
            }
            u23Var4 = (u23) objO5;
        } else {
            nv0Var.a0(-31257052);
        }
        nv0Var.p(false);
        u23 u23Var5 = u23Var4;
        u23Var5.e(gk3Var.e.getValue() != null);
        boolean zH3 = nv0Var.h(u23Var5);
        Object objO6 = nv0Var.O();
        if (zH3 || objO6 == zjVar) {
            objO6 = new aj0(u23Var5, i3);
            nv0Var.j0(objO6);
        }
        a(gk3Var, (cs0) objO6, nv0Var, 0);
        fk3 fk3Var2 = ij0Var4.a;
        hs hsVar3 = fk3Var2.c;
        fk3 fk3Var3 = ek0Var4.a;
        fk3 fk3Var4 = ek0Var4.a;
        boolean zC = wx.c(u23Var5.f, wx.f);
        if (fk3Var2.b == null && fk3Var4.b == null) {
            bl3Var = bl3Var4;
            if (i41.a(u23Var5.j, 0L)) {
                z = false;
            }
            z2 = hsVar3 == null || fk3Var4.c != null;
            if (z) {
                hsVar = hsVar3;
                fk3Var = fk3Var4;
                bl3Var2 = bl3Var;
                nv0Var.a0(1018759494);
                nv0Var.p(false);
                bk3Var = null;
            } else {
                nv0Var.a0(1018653691);
                Object objO7 = nv0Var.O();
                if (objO7 == zjVar) {
                    objO7 = str.concat(" slide");
                    nv0Var.j0(objO7);
                }
                bl3 bl3Var5 = bl3Var;
                fk3Var = fk3Var4;
                hsVar = hsVar3;
                bk3 bk3VarG3 = w7.G(gk3Var, bl3Var5, (String) objO7, nv0Var, 384, 0);
                bl3Var2 = bl3Var5;
                nv0Var.p(false);
                bk3Var = bk3VarG3;
            }
            if (z2) {
                nv0Var.a0(1018962109);
                nv0Var.p(false);
                bk3Var2 = null;
            } else {
                nv0Var.a0(1018851285);
                bl3 bl3Var6 = rn.m1;
                Object objO8 = nv0Var.O();
                if (objO8 == zjVar) {
                    objO8 = str.concat(" shrink/expand");
                    nv0Var.j0(objO8);
                }
                bk3 bk3VarG4 = w7.G(gk3Var, bl3Var6, (String) objO8, nv0Var, 384, 0);
                nv0Var.p(false);
                bk3Var2 = bk3VarG4;
            }
            if (z2) {
                nv0Var.a0(1019206141);
                nv0Var.p(false);
                bk3Var3 = null;
            } else {
                nv0Var.a0(1019035735);
                Object objO9 = nv0Var.O();
                if (objO9 == zjVar) {
                    objO9 = str.concat(" InterruptionHandlingOffset");
                    nv0Var.j0(objO9);
                }
                bk3 bk3VarG5 = w7.G(gk3Var, bl3Var2, (String) objO9, nv0Var, 384, 0);
                nv0Var.p(false);
                bk3Var3 = bk3VarG5;
            }
            z3 = (hsVar == null && !hsVar.d) || !(((hsVar2 = fk3Var.c) == null || hsVar2.d) && z2);
            eo2 eo2Var = ky.e;
            yp1 yp1Var = yp1.a;
            if (zC) {
                nv0Var.a0(1019733235);
                bl3 bl3Var7 = new bl3(hd.m, new kd(2, eo2Var));
                Object objO10 = nv0Var.O();
                if (objO10 == zjVar) {
                    objO10 = str.concat(" veil");
                    nv0Var.j0(objO10);
                }
                nv0Var2 = nv0Var;
                ip3Var = new ip3(gk3Var, w7.G(gk3Var, bl3Var7, (String) objO10, nv0Var, 384, 0), ij0Var4, ek0Var4, u23Var5);
                ij0Var2 = ij0Var4;
                ek0Var2 = ek0Var4;
                u23Var2 = u23Var5;
                nv0Var2.p(false);
            } else {
                nv0Var2 = nv0Var;
                u23Var2 = u23Var5;
                ek0Var2 = ek0Var4;
                ij0Var2 = ij0Var4;
                nv0Var2.a0(1020031362);
                nv0Var2.p(false);
                ip3Var = yp1Var;
            }
            bl3 bl3Var8 = rn.f1;
            z4 = (fk3Var2.a != null && fk3Var.a == null && u23Var2.g == 1.0f) ? false : true;
            z5 = (fk3Var2.d != null && fk3Var.d == null && u23Var2.h == 1.0f) ? false : true;
            if (z4) {
                bq1Var = ip3Var;
                nv0Var3 = nv0Var2;
                u23Var3 = u23Var2;
                bl3Var3 = bl3Var8;
                nv0Var3.a0(-1511696126);
                nv0Var3.p(false);
                bk3Var4 = null;
            } else {
                nv0Var2.a0(-1511865571);
                Object objO11 = nv0Var2.O();
                if (objO11 == zjVar) {
                    objO11 = str.concat(" alpha");
                    nv0Var2.j0(objO11);
                }
                String str2 = (String) objO11;
                nv0 nv0Var6 = nv0Var2;
                u23Var3 = u23Var2;
                bl3Var3 = bl3Var8;
                nv0Var3 = nv0Var6;
                bq1Var = ip3Var;
                bk3 bk3VarG6 = w7.G(gk3Var, bl3Var3, str2, nv0Var3, 384, 0);
                nv0Var3.p(false);
                bk3Var4 = bk3VarG6;
            }
            if (z5) {
                z6 = false;
                nv0Var3.a0(-1511459038);
                nv0Var3.p(false);
                bk3VarG = null;
            } else {
                nv0Var3.a0(-1511628483);
                Object objO12 = nv0Var3.O();
                if (objO12 == zjVar) {
                    objO12 = str.concat(" scale");
                    nv0Var3.j0(objO12);
                }
                bk3VarG = w7.G(gk3Var, bl3Var3, (String) objO12, nv0Var3, 384, 0);
                z6 = false;
                nv0Var3.p(false);
            }
            if (z5) {
                gk3Var2 = gk3Var;
                nv0Var4 = nv0Var3;
                bq1Var2 = bq1Var;
                bk3Var5 = bk3VarG;
                nv0Var4.a0(-1511209054);
                nv0Var4.p(z6);
                bk3VarG2 = null;
            } else {
                nv0Var3.a0(-1511381382);
                bq1Var2 = bq1Var;
                bk3Var5 = bk3VarG;
                gk3Var2 = gk3Var;
                bk3VarG2 = w7.G(gk3Var2, a, "TransformOriginInterruptionHandling", nv0Var3, 384, 0);
                nv0Var4 = nv0Var3;
                nv0Var4.p(z6);
            }
            zH = nv0Var4.h(bk3Var4) | nv0Var4.f(ij0Var2) | nv0Var4.f(ek0Var2) | nv0Var4.h(u23Var3) | nv0Var4.h(bk3Var5) | nv0Var4.f(gk3Var2) | nv0Var4.h(bk3VarG2);
            objO = nv0Var4.O();
            if (!zH || objO == zjVar) {
                bk3 bk3Var6 = bk3Var5;
                ij0Var3 = ij0Var2;
                ek0Var3 = ek0Var2;
                nv0Var5 = nv0Var4;
                u23 u23Var6 = u23Var3;
                vi0 vi0Var = new vi0(bk3Var4, u23Var6, bk3Var6, gk3Var, ij0Var3, ek0Var3, bk3VarG2);
                u23Var3 = u23Var6;
                nv0Var5.j0(vi0Var);
                objO = vi0Var;
            } else {
                nv0Var5 = nv0Var4;
                ij0Var3 = ij0Var2;
                ek0Var3 = ek0Var2;
            }
            vi0 vi0Var2 = (vi0) objO;
            fe2 fe2Var = da0.a;
            zH2 = nv0Var5.h(u23Var3);
            objO2 = nv0Var5.O();
            if (!zH2 || objO2 == zjVar) {
                objO2 = new aj0(u23Var3, 0);
                nv0Var5.j0(objO2);
            }
            bq1 bq1VarD = new eq1(fe2Var, (cs0) objO2).d(yp1Var);
            zG = nv0Var5.g(z3) | nv0Var5.f(cs0Var2);
            objO3 = nv0Var5.O();
            if (!zG || objO3 == zjVar) {
                objO3 = new bj0(z3, cs0Var2);
                nv0Var5.j0(objO3);
            }
            return bq1VarD.d(vm1.z(yp1Var, (ns0) objO3)).d(new ui0(gk3Var, bk3Var2, bk3Var3, bk3Var, ij0Var3, ek0Var3, u23Var3, cs0Var2, vi0Var2)).d(bq1Var2);
        }
        bl3Var = bl3Var4;
        z = true;
        if (hsVar3 == null) {
        }
        if (z) {
        }
        if (z2) {
        }
        if (z2) {
        }
        if (hsVar == null) {
        }
        eo2 eo2Var2 = ky.e;
        yp1 yp1Var2 = yp1.a;
        if (zC) {
        }
        bl3 bl3Var82 = rn.f1;
        if (fk3Var2.a != null) {
        }
        if (fk3Var2.d != null) {
        }
        if (z4) {
        }
        if (z5) {
        }
        if (z5) {
        }
        zH = nv0Var4.h(bk3Var4) | nv0Var4.f(ij0Var2) | nv0Var4.f(ek0Var2) | nv0Var4.h(u23Var3) | nv0Var4.h(bk3Var5) | nv0Var4.f(gk3Var2) | nv0Var4.h(bk3VarG2);
        objO = nv0Var4.O();
        if (zH) {
            bk3 bk3Var62 = bk3Var5;
            ij0Var3 = ij0Var2;
            ek0Var3 = ek0Var2;
            nv0Var5 = nv0Var4;
            u23 u23Var62 = u23Var3;
            vi0 vi0Var3 = new vi0(bk3Var4, u23Var62, bk3Var62, gk3Var, ij0Var3, ek0Var3, bk3VarG2);
            u23Var3 = u23Var62;
            nv0Var5.j0(vi0Var3);
            objO = vi0Var3;
        }
        vi0 vi0Var22 = (vi0) objO;
        fe2 fe2Var2 = da0.a;
        zH2 = nv0Var5.h(u23Var3);
        objO2 = nv0Var5.O();
        if (!zH2) {
            objO2 = new aj0(u23Var3, 0);
            nv0Var5.j0(objO2);
        }
        bq1 bq1VarD2 = new eq1(fe2Var2, (cs0) objO2).d(yp1Var2);
        zG = nv0Var5.g(z3) | nv0Var5.f(cs0Var2);
        objO3 = nv0Var5.O();
        if (!zG) {
            objO3 = new bj0(z3, cs0Var2);
            nv0Var5.j0(objO3);
        }
        return bq1VarD2.d(vm1.z(yp1Var2, (ns0) objO3)).d(new ui0(gk3Var, bk3Var2, bk3Var3, bk3Var, ij0Var3, ek0Var3, u23Var3, cs0Var2, vi0Var22)).d(bq1Var2);
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
