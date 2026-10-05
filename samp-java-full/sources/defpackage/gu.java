package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gu {
    public static final b22 a = f80.e(2);
    public static final b22 b = f80.e(2);

    static {
        f80.e(2);
    }

    public static final void a(final d00 d00Var, final gh3 gh3Var, final long j, final long j2, final long j3, final float f, final x12 x12Var, nv0 nv0Var, final int i) {
        nv0Var.b0(-2070754602);
        int i2 = i | (nv0Var.h(d00Var) ? 4 : 2) | (nv0Var.f(gh3Var) ? 32 : 16) | (nv0Var.e(j) ? 256 : 128) | (nv0Var.h(null) ? 2048 : 1024) | (nv0Var.h(null) ? 16384 : 8192) | (nv0Var.h(null) ? 131072 : 65536) | (nv0Var.e(j2) ? 1048576 : 524288) | (nv0Var.e(j3) ? 8388608 : 4194304) | (nv0Var.c(f) ? 67108864 : 33554432) | (nv0Var.f(x12Var) ? 536870912 : 268435456);
        if (nv0Var.R(i2 & 1, (306783379 & i2) != 306783378)) {
            vr.d(new he2[]{nc2.f(j, t30.a), mg3.a.a(gh3Var)}, gq.N(-668234218, new bu(f, x12Var, j2, d00Var, j3), nv0Var), nv0Var, 56);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(gh3Var, j, j2, j3, f, x12Var, i) { // from class: zt
                public final /* synthetic */ gh3 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ float k;
                public final /* synthetic */ x12 l;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(1);
                    gu.a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(cs0 cs0Var, d00 d00Var, bq1 bq1Var, boolean z, rs0 rs0Var, z13 z13Var, st stVar, ut utVar, ln lnVar, nv0 nv0Var, int i, int i2) {
        int i3;
        d00 d00Var2;
        bq1 bq1Var2;
        int i4;
        rs0 rs0Var2;
        int i5;
        st stVarX;
        boolean z2;
        ut utVar2;
        ln lnVar2;
        rs0 rs0Var3;
        bq1 bq1Var3;
        z13 z13Var2;
        xj2 xj2VarT;
        ut utVar3;
        ln lnVarA;
        bq1 bq1Var4;
        z13 z13Var3;
        boolean z3;
        int i6;
        nv0Var.b0(1192083339);
        if ((i & 6) == 0) {
            i3 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            d00Var2 = d00Var;
            i3 |= nv0Var.h(d00Var2) ? 32 : 16;
        } else {
            d00Var2 = d00Var;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                bq1Var2 = bq1Var;
                i3 |= nv0Var.f(bq1Var2) ? 256 : 128;
            }
            int i8 = i3 | 3072;
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    rs0Var2 = rs0Var;
                    i8 |= nv0Var.h(rs0Var2) ? 16384 : 8192;
                }
                i5 = 196608 | i8;
                if ((1572864 & i) == 0) {
                    i5 = 720896 | i8;
                }
                if ((12582912 & i) == 0) {
                    if ((i2 & 128) == 0) {
                        stVarX = stVar;
                        int i9 = nv0Var.f(stVarX) ? 8388608 : 4194304;
                        i5 |= i9;
                    } else {
                        stVarX = stVar;
                    }
                    i5 |= i9;
                } else {
                    stVarX = stVar;
                }
                if ((100663296 & i) == 0) {
                    i5 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    i5 |= 268435456;
                }
                if (nv0Var.R(i5 & 1, (306783379 & i5) != 306783378)) {
                    nv0Var.W();
                    if ((i & 1) == 0 || nv0Var.A()) {
                        bq1 bq1Var5 = i7 != 0 ? yp1.a : bq1Var2;
                        if (i4 != 0) {
                            rs0Var2 = null;
                        }
                        z13 z13VarA = g23.a(cl3.b, nv0Var);
                        int i10 = i5 & (-3670017);
                        if ((i2 & 128) != 0) {
                            stVarX = vm1.x((fy) nv0Var.j(hy.a));
                            i10 = i5 & (-33030145);
                        }
                        utVar3 = new ut(cl3.e);
                        long jE = hy.e(cl3.h, nv0Var);
                        wx.b(cl3.g, hy.e(cl3.f, nv0Var));
                        int i11 = i10 & (-2113929217);
                        lnVarA = r51.a(cl3.i, jE);
                        bq1Var4 = bq1Var5;
                        z13Var3 = z13VarA;
                        z3 = true;
                        i6 = i11;
                    } else {
                        nv0Var.U();
                        int i12 = i5 & (-3670017);
                        if ((i2 & 128) != 0) {
                            i12 = i5 & (-33030145);
                        }
                        i6 = i12 & (-2113929217);
                        z3 = z;
                        z13Var3 = z13Var;
                        utVar3 = utVar;
                        lnVarA = lnVar;
                        bq1Var4 = bq1Var2;
                    }
                    st stVar2 = stVarX;
                    rs0 rs0Var4 = rs0Var2;
                    nv0Var.q();
                    gh3 gh3VarA = ql3.a(cl3.k, nv0Var);
                    long j = z3 ? stVar2.b : stVar2.f;
                    float f = vm1.j0;
                    int i13 = ((i6 >> 6) & 14) | ((i6 << 3) & 112) | ((i6 >> 3) & 896);
                    int i14 = i6 << 6;
                    c(bq1Var4, cs0Var, z3, d00Var2, gh3VarA, j, rs0Var4, z13Var3, stVar2, utVar3, lnVarA, 32.0f, a, nv0Var, i13 | (i14 & 7168) | (3670016 & i14) | (29360128 & i14) | (i14 & 1879048192), 28032);
                    bq1Var3 = bq1Var4;
                    z2 = z3;
                    rs0Var3 = rs0Var4;
                    z13Var2 = z13Var3;
                    stVarX = stVar2;
                    utVar2 = utVar3;
                    lnVar2 = lnVarA;
                } else {
                    nv0Var.U();
                    z2 = z;
                    utVar2 = utVar;
                    lnVar2 = lnVar;
                    rs0Var3 = rs0Var2;
                    bq1Var3 = bq1Var2;
                    z13Var2 = z13Var;
                }
                xj2VarT = nv0Var.t();
                if (xj2VarT != null) {
                    xj2VarT.d = new eq(cs0Var, d00Var, bq1Var3, z2, rs0Var3, z13Var2, stVarX, utVar2, lnVar2, i, i2);
                    return;
                }
                return;
            }
            i8 = i3 | 27648;
            rs0Var2 = rs0Var;
            i5 = 196608 | i8;
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if (nv0Var.R(i5 & 1, (306783379 & i5) != 306783378)) {
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT != null) {
            }
        }
        bq1Var2 = bq1Var;
        int i82 = i3 | 3072;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        rs0Var2 = rs0Var;
        i5 = 196608 | i82;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (nv0Var.R(i5 & 1, (306783379 & i5) != 306783378)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final bq1 bq1Var, final cs0 cs0Var, final boolean z, final d00 d00Var, final gh3 gh3Var, final long j, final rs0 rs0Var, final z13 z13Var, final st stVar, final ut utVar, final ln lnVar, final float f, final x12 x12Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        os1 os1Var;
        int i6;
        qr1 qr1Var;
        boolean z2;
        float f2;
        boolean zH;
        Object objO;
        int i7;
        boolean z3;
        pe peVar;
        nv0Var.b0(892465622);
        if ((i & 6) == 0) {
            i3 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.h(d00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.f(gh3Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= nv0Var.e(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= nv0Var.h(rs0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= nv0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var.f(z13Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.f(stVar) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var.f(utVar) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.f(lnVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.c(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.f(x12Var) ? 2048 : 1024;
        }
        int i8 = i3;
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var.f(null) ? 16384 : 8192;
        }
        int i9 = i4;
        boolean z4 = true;
        if (nv0Var.R(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 9363) == 9362) ? false : true)) {
            nv0Var.a0(1596346437);
            Object objO2 = nv0Var.O();
            Object obj = c20.a;
            if (objO2 == obj) {
                objO2 = nc2.e(nv0Var);
            }
            qr1 qr1Var2 = (qr1) objO2;
            nv0Var.p(false);
            Object objO3 = nv0Var.O();
            if (objO3 == obj) {
                i5 = i9;
                objO3 = new u0(24);
                nv0Var.j0(objO3);
            } else {
                i5 = i9;
            }
            bq1 bq1VarA = su2.a(bq1Var, false, (ns0) objO3);
            long j2 = z ? stVar.a : stVar.e;
            if (utVar == null) {
                nv0Var.a0(1596621344);
                nv0Var.p(false);
                qr1Var = qr1Var2;
                i7 = i8;
                peVar = null;
            } else {
                nv0Var.a0(-1333969407);
                int i10 = ((i8 >> 6) & 14) | ((i5 << 6) & 896);
                Object objO4 = nv0Var.O();
                if (objO4 == obj) {
                    objO4 = new l73();
                    nv0Var.j0(objO4);
                }
                l73 l73Var = (l73) objO4;
                Object objO5 = nv0Var.O();
                if (objO5 == obj) {
                    objO5 = b32.w(null);
                    nv0Var.j0(objO5);
                }
                os1 os1Var2 = (os1) objO5;
                boolean zF = nv0Var.f(qr1Var2);
                Object objO6 = nv0Var.O();
                if (zF || objO6 == obj) {
                    os1Var = os1Var2;
                    i6 = i10;
                    objO6 = new zp(qr1Var2, l73Var, null, 2);
                    nv0Var.j0(objO6);
                } else {
                    os1Var = os1Var2;
                    i6 = i10;
                }
                rn.l((rs0) objO6, nv0Var, qr1Var2);
                s41 s41Var = (s41) qx.z0(l73Var);
                float f3 = (!z || (s41Var instanceof zc2) || (s41Var instanceof zy0) || (s41Var instanceof wo0) || !(s41Var instanceof ue0)) ? 0.0f : utVar.a;
                Object objO7 = nv0Var.O();
                if (objO7 == obj) {
                    qr1Var = qr1Var2;
                    objO7 = new ed(new jd0(f3), rn.h1, null, 12);
                    nv0Var.j0(objO7);
                } else {
                    qr1Var = qr1Var2;
                }
                ed edVar = (ed) objO7;
                jd0 jd0Var = new jd0(f3);
                boolean zH2 = nv0Var.h(edVar) | nv0Var.c(f3);
                if (((i6 & 14) ^ 6) > 4) {
                    z2 = z;
                    if (nv0Var.g(z2)) {
                        f2 = f3;
                    }
                    zH = zH2 | z4 | nv0Var.h(s41Var);
                    objO = nv0Var.O();
                    if (!zH || objO == obj) {
                        i7 = i8;
                        z3 = false;
                        Object ttVar = new tt(edVar, f2, z2, s41Var, os1Var, null, 0);
                        nv0Var.j0(ttVar);
                        objO = ttVar;
                    } else {
                        i7 = i8;
                        z3 = false;
                    }
                    rn.l((rs0) objO, nv0Var, jd0Var);
                    peVar = edVar.c;
                    nv0Var.p(z3);
                } else {
                    z2 = z;
                }
                f2 = f3;
                if ((i6 & 6) != 4) {
                    z4 = false;
                }
                zH = zH2 | z4 | nv0Var.h(s41Var);
                objO = nv0Var.O();
                if (zH) {
                    i7 = i8;
                    z3 = false;
                    Object ttVar2 = new tt(edVar, f2, z2, s41Var, os1Var, null, 0);
                    nv0Var.j0(ttVar2);
                    objO = ttVar2;
                    rn.l((rs0) objO, nv0Var, jd0Var);
                    peVar = edVar.c;
                    nv0Var.p(z3);
                }
            }
            hb3.c(cs0Var, bq1VarA, z, z13Var, j2, 0L, peVar != null ? ((jd0) peVar.g.getValue()).f : 0.0f, lnVar, qr1Var, gq.N(-70915349, new cu(d00Var, gh3Var, j, rs0Var, stVar, z, f, x12Var), nv0Var), nv0Var, ((i7 >> 15) & 7168) | ((i7 >> 3) & 14) | (i7 & 896) | ((i5 << 21) & 234881024), 96);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: vt
                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(i | 1);
                    int iY2 = jo3.y(i2);
                    gu.c(bq1Var, cs0Var, z, d00Var, gh3Var, j, rs0Var, z13Var, stVar, utVar, lnVar, f, x12Var, (nv0) obj2, iY, iY2);
                    return dm3.a;
                }
            };
        }
    }

    public static final void d(final d00 d00Var, final gh3 gh3Var, final long j, final rs0 rs0Var, final long j2, final long j3, final float f, final x12 x12Var, nv0 nv0Var, final int i) {
        nv0Var.b0(1105630840);
        int i2 = i | (nv0Var.h(d00Var) ? 4 : 2) | (nv0Var.f(gh3Var) ? 32 : 16) | (nv0Var.e(j) ? 256 : 128) | (nv0Var.h(rs0Var) ? 2048 : 1024) | (nv0Var.h(null) ? 131072 : 65536) | (nv0Var.e(j2) ? 1048576 : 524288) | (nv0Var.e(j3) ? 8388608 : 4194304) | (nv0Var.c(f) ? 67108864 : 33554432) | (nv0Var.f(x12Var) ? 536870912 : 268435456);
        if (nv0Var.R(i2 & 1, (306783379 & i2) != 306783378)) {
            vr.d(new he2[]{nc2.f(j, t30.a), mg3.a.a(gh3Var)}, gq.N(-2130105544, new du(f, x12Var, rs0Var, j2, d00Var, j3), nv0Var), nv0Var, 56);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(gh3Var, j, rs0Var, j2, j3, f, x12Var, i) { // from class: wt
                public final /* synthetic */ gh3 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ rs0 i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ float l;
                public final /* synthetic */ x12 m;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(24577);
                    gu.d(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void e(final boolean z, final cs0 cs0Var, final d00 d00Var, bq1 bq1Var, boolean z2, z13 z13Var, ut2 ut2Var, vt2 vt2Var, ln lnVar, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final boolean z3;
        final z13 z13Var2;
        final ut2 ut2Var2;
        final vt2 vt2Var2;
        final ln lnVarA;
        boolean z4;
        int i2;
        bq1 bq1Var3;
        nv0Var.b0(-1385473344);
        int i3 = i | (nv0Var.g(z) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | 307981312;
        if (nv0Var.R(i3 & 1, (306783379 & i3) != 306783378)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                z13 z13VarA = g23.a(w7.t, nv0Var);
                fy fyVar = (fy) nv0Var.j(hy.a);
                ut2Var2 = fyVar.c0;
                if (ut2Var2 == null) {
                    long j = wx.f;
                    ut2 ut2Var3 = new ut2(j, hy.d(fyVar, w7.H), hy.d(fyVar, w7.L), hy.d(fyVar, w7.P), j, wx.b(w7.v, hy.d(fyVar, w7.u)), wx.b(w7.J, hy.d(fyVar, w7.I)), wx.b(w7.N, hy.d(fyVar, w7.M)), hy.d(fyVar, w7.B), wx.b(w7.y, hy.d(fyVar, w7.x)), hy.d(fyVar, w7.G), hy.d(fyVar, w7.K), hy.d(fyVar, w7.O));
                    fyVar.c0 = ut2Var3;
                    ut2Var2 = ut2Var3;
                }
                vt2 vt2Var3 = new vt2(w7.C, w7.w);
                int i4 = i3 & (-2143289345);
                long jE = hy.e(w7.D, nv0Var);
                long j2 = wx.f;
                wx.b(w7.A, hy.e(w7.z, nv0Var));
                float f = w7.E;
                if (z) {
                    jE = j2;
                }
                if (z) {
                    f = 0.0f;
                }
                z13Var2 = z13VarA;
                vt2Var2 = vt2Var3;
                z4 = true;
                lnVarA = r51.a(f, jE);
                i2 = i4;
                bq1Var3 = yp1.a;
            } else {
                nv0Var.U();
                z4 = z2;
                z13Var2 = z13Var;
                ut2Var2 = ut2Var;
                vt2Var2 = vt2Var;
                lnVarA = lnVar;
                i2 = i3 & (-2143289345);
                bq1Var3 = bq1Var;
            }
            nv0Var.q();
            f(z, bq1Var3, cs0Var, z4, d00Var, ql3.a(w7.F, nv0Var), z13Var2, ut2Var2, vt2Var2, lnVarA, 32.0f, b, nv0Var, ((i2 << 3) & 896) | (i2 & 14) | 12582960 | 102263808, 224256);
            bq1Var2 = bq1Var3;
            z3 = z4;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z3 = z2;
            z13Var2 = z13Var;
            ut2Var2 = ut2Var;
            vt2Var2 = vt2Var;
            lnVarA = lnVar;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z, cs0Var, d00Var, bq1Var2, z3, z13Var2, ut2Var2, vt2Var2, lnVarA, i) { // from class: xt
                public final /* synthetic */ boolean f;
                public final /* synthetic */ cs0 g;
                public final /* synthetic */ d00 h;
                public final /* synthetic */ bq1 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ z13 k;
                public final /* synthetic */ ut2 l;
                public final /* synthetic */ vt2 m;
                public final /* synthetic */ ln n;

                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iY = jo3.y(385);
                    gu.e(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, (nv0) obj, iY);
                    return dm3.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(final boolean z, final bq1 bq1Var, final cs0 cs0Var, final boolean z2, final d00 d00Var, final gh3 gh3Var, final z13 z13Var, final ut2 ut2Var, final vt2 vt2Var, final ln lnVar, final float f, final x12 x12Var, nv0 nv0Var, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        os1 os1Var;
        qr1 qr1Var;
        int i6;
        ed edVar;
        boolean z3;
        pe peVar;
        nv0Var.b0(1786844928);
        if ((i & 6) == 0) {
            i3 = (nv0Var.g(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= nv0Var.f(bq1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= nv0Var.h(cs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= nv0Var.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= nv0Var.h(d00Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= nv0Var.f(gh3Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= nv0Var.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= nv0Var.h(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= nv0Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= nv0Var.f(z13Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (nv0Var.f(ut2Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= nv0Var.f(vt2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= nv0Var.f(lnVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= nv0Var.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= nv0Var.f(x12Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= nv0Var.f(null) ? 131072 : 65536;
        }
        int i7 = i4;
        boolean z4 = true;
        if (nv0Var.R(i3 & 1, ((i3 & 306783379) == 306783378 && (i7 & 74899) == 74898) ? false : true)) {
            nv0Var.a0(73215547);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = nc2.e(nv0Var);
            }
            qr1 qr1Var2 = (qr1) objO;
            nv0Var.p(false);
            Object objO2 = nv0Var.O();
            if (objO2 == obj) {
                objO2 = new u0(25);
                nv0Var.j0(objO2);
            }
            bq1 bq1VarA = su2.a(bq1Var, false, (ns0) objO2);
            long j = !z2 ? z ? ut2Var.j : ut2Var.e : !z ? ut2Var.a : ut2Var.i;
            if (vt2Var == null) {
                nv0Var.a0(73531126);
                nv0Var.p(false);
                qr1Var = qr1Var2;
                i6 = i3;
                peVar = null;
            } else {
                nv0Var.a0(-828912021);
                int i8 = ((i7 << 3) & 896) | ((i3 >> 9) & 14);
                Object objO3 = nv0Var.O();
                if (objO3 == obj) {
                    objO3 = new l73();
                    nv0Var.j0(objO3);
                }
                l73 l73Var = (l73) objO3;
                Object objO4 = nv0Var.O();
                if (objO4 == obj) {
                    objO4 = b32.w(null);
                    nv0Var.j0(objO4);
                }
                os1 os1Var2 = (os1) objO4;
                boolean zF = nv0Var.f(qr1Var2);
                Object objO5 = nv0Var.O();
                if (zF || objO5 == obj) {
                    i5 = i8;
                    os1Var = os1Var2;
                    objO5 = new zp(qr1Var2, l73Var, null, 3);
                    nv0Var.j0(objO5);
                } else {
                    i5 = i8;
                    os1Var = os1Var2;
                }
                rn.l((rs0) objO5, nv0Var, qr1Var2);
                s41 s41Var = (s41) qx.z0(l73Var);
                if (z2 && !(s41Var instanceof zc2)) {
                    float f2 = s41Var instanceof zy0 ? vt2Var.a : (!(s41Var instanceof wo0) && (s41Var instanceof ue0)) ? vt2Var.b : 0.0f;
                    Object objO6 = nv0Var.O();
                    if (objO6 == obj) {
                        qr1Var = qr1Var2;
                        i6 = i3;
                        objO6 = new ed(new jd0(f2), rn.h1, null, 12);
                        nv0Var.j0(objO6);
                    } else {
                        qr1Var = qr1Var2;
                        i6 = i3;
                    }
                    ed edVar2 = (ed) objO6;
                    jd0 jd0Var = new jd0(f2);
                    boolean zH = nv0Var.h(edVar2) | nv0Var.c(f2);
                    if ((((i5 & 14) ^ 6) <= 4 || !nv0Var.g(z2)) && (i5 & 6) != 4) {
                        z4 = false;
                    }
                    boolean zH2 = zH | z4 | nv0Var.h(s41Var);
                    Object objO7 = nv0Var.O();
                    if (zH2 || objO7 == obj) {
                        edVar = edVar2;
                        z3 = false;
                        Object ttVar = new tt(edVar, f2, z2, s41Var, os1Var, null, 1);
                        nv0Var.j0(ttVar);
                        objO7 = ttVar;
                    } else {
                        edVar = edVar2;
                        z3 = false;
                    }
                    rn.l((rs0) objO7, nv0Var, jd0Var);
                    peVar = edVar.c;
                    nv0Var.p(z3);
                }
            }
            int i9 = i6;
            hb3.b(z, cs0Var, bq1VarA, z2, z13Var, j, 0L, peVar != null ? ((jd0) peVar.g.getValue()).f : 0.0f, lnVar, qr1Var, gq.N(-990050154, new eu(ut2Var, z2, z, d00Var, gh3Var, f, x12Var), nv0Var), nv0Var, (i9 & 14) | ((i9 >> 3) & 112) | (i9 & 7168) | ((i9 >> 15) & 57344) | ((i7 << 21) & 1879048192), 192);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: yt
                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(i | 1);
                    int iY2 = jo3.y(i2);
                    gu.f(z, bq1Var, cs0Var, z2, d00Var, gh3Var, z13Var, ut2Var, vt2Var, lnVar, f, x12Var, (nv0) obj2, iY, iY2);
                    return dm3.a;
                }
            };
        }
    }

    public static final rs0 g(rs0 rs0Var, long j, nv0 nv0Var) {
        int i = 0;
        if (rs0Var == null) {
            nv0Var.a0(1575618259);
            nv0Var.p(false);
            return null;
        }
        nv0Var.a0(1575390813);
        d00 d00VarN = gq.N(-237350650, new fu(j, rs0Var, i), nv0Var);
        nv0Var.p(false);
        return d00VarN;
    }

    public static final d00 h(long j, nv0 nv0Var) {
        nv0Var.a0(-1218863531);
        nv0Var.p(false);
        return null;
    }
}
