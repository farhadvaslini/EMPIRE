package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i83 {
    public static final long a = oz2.w(14);
    public static final long b = oz2.w(0);
    public static final long c = wx.f;
    public static final dg3 d;

    static {
        long j = wx.b;
        d = j != 16 ? new my(j) : cg3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final h83 a(h83 h83Var, long j, dp dpVar, float f, long j2, xq0 xq0Var, vq0 vq0Var, wq0 wq0Var, zb3 zb3Var, String str, long j3, nl nlVar, eg3 eg3Var, qj1 qj1Var, long j4, ne3 ne3Var, r13 r13Var, f72 f72Var, rf0 rf0Var) {
        nl nlVar2;
        r13 r13Var2;
        f72 f72Var2;
        rf0 rf0Var2;
        dg3 myVar;
        dg3 dg3Var;
        boolean z;
        qj1 qj1Var2;
        long j5;
        f72 f72Var3;
        wq0 wq0Var2 = wq0Var;
        zb3 zb3Var2 = zb3Var;
        String str2 = str;
        long j6 = j3;
        kh3[] kh3VarArr = jh3.b;
        long j7 = j2 & 1095216660480L;
        if ((j7 == 0 || jh3.a(j2, h83Var.b)) && ((dpVar != null || j == 16 || wx.c(j, h83Var.a.a())) && ((vq0Var == null || vq0Var.equals(h83Var.d)) && ((xq0Var == null || xq0Var.equals(h83Var.c)) && ((zb3Var2 == null || zb3Var2 == h83Var.f) && (((j6 & 1095216660480L) == 0 || jh3.a(j6, h83Var.h)) && ((ne3Var == null || ne3Var.equals(h83Var.m)) && s51.n(dpVar, h83Var.a.b()) && ((dpVar == null || f == h83Var.a.t()) && ((wq0Var2 == null || wq0Var2.equals(h83Var.e)) && (str2 == null || str2.equals(h83Var.g))))))))))) {
            if (nlVar != null) {
                nlVar2 = nlVar;
                if (nlVar2.equals(h83Var.i)) {
                }
                cg3 cg3Var = cg3.a;
                if (dpVar != null) {
                    if (dpVar instanceof w73) {
                        long jV = b32.v(f, ((w73) dpVar).a);
                        myVar = jV != 16 ? new my(jV) : cg3Var;
                    } else {
                        if (!(dpVar instanceof o13)) {
                            c.k();
                            return null;
                        }
                        myVar = new fp((o13) dpVar, f);
                    }
                } else if (j != 16) {
                    myVar = new my(j);
                }
                dg3Var = h83Var.a;
                dg3Var.getClass();
                z = myVar instanceof fp;
                if (z && (dg3Var instanceof fp)) {
                    fp fpVar = (fp) myVar;
                    o13 o13Var = fpVar.a;
                    float f2 = fpVar.b;
                    if (Float.isNaN(f2)) {
                        f2 = ((fp) dg3Var).b;
                    }
                    myVar = new fp(o13Var, f2);
                } else if ((z || (dg3Var instanceof fp)) && ((!z && (dg3Var instanceof fp)) || myVar.equals(cg3Var))) {
                }
                if (zb3Var2 == null) {
                    zb3Var2 = h83Var.f;
                }
                long j8 = j7 == 0 ? h83Var.b : j2;
                xq0 xq0Var2 = xq0Var == null ? h83Var.c : xq0Var;
                vq0 vq0Var2 = vq0Var == null ? h83Var.d : vq0Var;
                if (wq0Var2 == null) {
                    wq0Var2 = h83Var.e;
                }
                if (str2 == null) {
                    str2 = h83Var.g;
                }
                if ((j6 & 1095216660480L) == 0) {
                    j6 = h83Var.h;
                }
                if (nlVar2 == null) {
                    nlVar2 = h83Var.i;
                }
                eg3 eg3Var2 = eg3Var == null ? h83Var.j : eg3Var;
                long j9 = j8;
                qj1 qj1Var3 = qj1Var == null ? h83Var.k : qj1Var;
                if (j4 != 16) {
                    qj1Var2 = qj1Var3;
                    j5 = j4;
                } else {
                    qj1Var2 = qj1Var3;
                    j5 = h83Var.l;
                }
                long j10 = j5;
                ne3 ne3Var2 = ne3Var == null ? h83Var.m : ne3Var;
                r13 r13Var3 = r13Var2 == null ? h83Var.n : r13Var2;
                f72Var3 = h83Var.o;
                if (f72Var3 == null) {
                    f72Var3 = f72Var2;
                }
                if (rf0Var2 == null) {
                    rf0Var2 = h83Var.p;
                }
                return new h83(myVar, j9, xq0Var2, vq0Var2, wq0Var2, zb3Var2, str2, j6, nlVar2, eg3Var2, qj1Var2, j10, ne3Var2, r13Var3, f72Var3, rf0Var2);
            }
            nlVar2 = nlVar;
            if (eg3Var == null || eg3Var.equals(h83Var.j)) {
                if (qj1Var == null || qj1Var.equals(h83Var.k)) {
                    if (j4 == 16 || wx.c(j4, h83Var.l)) {
                        r13Var2 = r13Var;
                        if (r13Var2 == null || r13Var2.equals(h83Var.n)) {
                            f72Var2 = f72Var;
                            if (f72Var2 == null || f72Var2.equals(h83Var.o)) {
                                rf0Var2 = rf0Var;
                                if (rf0Var2 == null || rf0Var2.equals(h83Var.p)) {
                                    return h83Var;
                                }
                            }
                        }
                        rf0Var2 = rf0Var;
                    }
                    f72Var2 = f72Var;
                    rf0Var2 = rf0Var;
                }
            }
            cg3 cg3Var2 = cg3.a;
            if (dpVar != null) {
            }
            dg3Var = h83Var.a;
            dg3Var.getClass();
            z = myVar instanceof fp;
            if (z) {
                myVar = z ? dg3Var : dg3Var;
            }
            if (zb3Var2 == null) {
            }
            if (j7 == 0) {
            }
            if (xq0Var == null) {
            }
            if (vq0Var == null) {
            }
            if (wq0Var2 == null) {
            }
            if (str2 == null) {
            }
            if ((j6 & 1095216660480L) == 0) {
            }
            if (nlVar2 == null) {
            }
            if (eg3Var == null) {
            }
            long j92 = j8;
            if (qj1Var == null) {
            }
            if (j4 != 16) {
            }
            long j102 = j5;
            if (ne3Var == null) {
            }
            if (r13Var2 == null) {
            }
            f72Var3 = h83Var.o;
            if (f72Var3 == null) {
            }
            if (rf0Var2 == null) {
            }
            return new h83(myVar, j92, xq0Var2, vq0Var2, wq0Var2, zb3Var2, str2, j6, nlVar2, eg3Var2, qj1Var2, j102, ne3Var2, r13Var3, f72Var3, rf0Var2);
        }
        nlVar2 = nlVar;
        r13Var2 = r13Var;
        f72Var2 = f72Var;
        rf0Var2 = rf0Var;
        cg3 cg3Var22 = cg3.a;
        if (dpVar != null) {
        }
        dg3Var = h83Var.a;
        dg3Var.getClass();
        z = myVar instanceof fp;
        if (z) {
        }
        if (zb3Var2 == null) {
        }
        if (j7 == 0) {
        }
        if (xq0Var == null) {
        }
        if (vq0Var == null) {
        }
        if (wq0Var2 == null) {
        }
        if (str2 == null) {
        }
        if ((j6 & 1095216660480L) == 0) {
        }
        if (nlVar2 == null) {
        }
        if (eg3Var == null) {
        }
        long j922 = j8;
        if (qj1Var == null) {
        }
        if (j4 != 16) {
        }
        long j1022 = j5;
        if (ne3Var == null) {
        }
        if (r13Var2 == null) {
        }
        f72Var3 = h83Var.o;
        if (f72Var3 == null) {
        }
        if (rf0Var2 == null) {
        }
        return new h83(myVar, j922, xq0Var2, vq0Var2, wq0Var2, zb3Var2, str2, j6, nlVar2, eg3Var2, qj1Var2, j1022, ne3Var2, r13Var3, f72Var3, rf0Var2);
    }

    public static final Object b(Object obj, Object obj2, float f) {
        return ((double) f) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j2, float f) {
        kh3[] kh3VarArr = jh3.b;
        long j3 = j & 1095216660480L;
        if (j3 != 0) {
            long j4 = 1095216660480L & j2;
            if (j4 != 0) {
                if (j3 == 0 || j4 == 0) {
                    o21.a("Cannot perform operation for Unspecified type.");
                }
                if (!kh3.a(jh3.b(j), jh3.b(j2))) {
                    o21.a("Cannot perform operation for " + kh3.b(jh3.b(j)) + " and " + kh3.b(jh3.b(j2)));
                }
                return oz2.D(lq.N(jh3.c(j), jh3.c(j2), f), j3);
            }
        }
        return ((jh3) b(new jh3(j), new jh3(j2), f)).a;
    }
}
