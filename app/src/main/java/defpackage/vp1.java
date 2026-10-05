package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class vp1 {
    public static final long a = d32.g(0.5f, 0.0f);
    public static final /* synthetic */ int b = 0;

    public static final void a(final cs0 cs0Var, bq1 bq1Var, s33 s33Var, float f, boolean z, z13 z13Var, long j, long j2, long j3, rs0 rs0Var, rs0 rs0Var2, wp1 wp1Var, final d00 d00Var, nv0 nv0Var, final int i) {
        int i2;
        bq1 bq1Var2;
        final s33 s33Var2;
        final float f2;
        final boolean z2;
        final z13 z13Var2;
        final long j4;
        final long j5;
        final long j6;
        final rs0 rs0Var3;
        final rs0 rs0Var4;
        final wp1 wp1Var2;
        int i3;
        float f3;
        long j7;
        rs0 rs0Var5;
        z13 z13Var3;
        long j8;
        long j9;
        rs0 rs0Var6;
        wp1 wp1Var3;
        boolean z3;
        nv0Var.b0(1904798512);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (nv0Var.h(cs0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i & 384) == 0) {
            i5 = i2 | 176;
        }
        int i6 = i5 | 27648;
        if ((196608 & i) == 0) {
            i6 = 93184 | i5;
        }
        if ((1572864 & i) == 0) {
            i6 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i6 |= 4194304;
        }
        int i7 = 100663296 | i6;
        if ((805306368 & i) == 0) {
            i7 = 369098752 | i6;
        }
        final int i8 = 0;
        final int i9 = 1;
        if (nv0Var.R(i7 & 1, (306783379 & i7) != 306783378)) {
            nv0Var.W();
            int i10 = i & 1;
            Object obj = c20.a;
            if (i10 == 0 || nv0Var.A()) {
                Object objO = nv0Var.O();
                if (objO == obj) {
                    objO = new fi1(7);
                    nv0Var.j0(objO);
                }
                ns0 ns0Var = (ns0) objO;
                zk3 zk3Var = q33.a;
                final float f4 = on.c;
                final float f5 = on.d;
                final ua0 ua0Var = (ua0) nv0Var.j(s20.h);
                boolean zF = nv0Var.f(ua0Var) | nv0Var.c(f4);
                Object objO2 = nv0Var.O();
                if (zF || objO2 == obj) {
                    objO2 = new cs0() { // from class: o33
                        @Override // defpackage.cs0
                        public final Object a() {
                            float fT;
                            int i11 = i8;
                            float f6 = f4;
                            ua0 ua0Var2 = ua0Var;
                            switch (i11) {
                                case 0:
                                    fT = ua0Var2.T(f6);
                                    break;
                                default:
                                    fT = ua0Var2.T(f6);
                                    break;
                            }
                            return Float.valueOf(fT);
                        }
                    };
                    nv0Var.j0(objO2);
                }
                cs0 cs0Var2 = (cs0) objO2;
                boolean zF2 = nv0Var.f(ua0Var) | nv0Var.c(f5);
                Object objO3 = nv0Var.O();
                if (zF2 || objO3 == obj) {
                    objO3 = new cs0() { // from class: o33
                        @Override // defpackage.cs0
                        public final Object a() {
                            float fT;
                            int i11 = i9;
                            float f6 = f5;
                            ua0 ua0Var2 = ua0Var;
                            switch (i11) {
                                case 0:
                                    fT = ua0Var2.T(f6);
                                    break;
                                default:
                                    fT = ua0Var2.T(f6);
                                    break;
                            }
                            return Float.valueOf(fT);
                        }
                    };
                    nv0Var.j0(objO3);
                }
                cs0 cs0Var3 = (cs0) objO3;
                Object[] objArr = {false, ns0Var, Boolean.FALSE};
                ar2 ar2Var = new ar2(0, new av2(3), new v1(cs0Var2, cs0Var3, ns0Var));
                boolean zG = nv0Var.g(false) | nv0Var.f(cs0Var2) | nv0Var.f(cs0Var3) | nv0Var.f(ns0Var) | nv0Var.g(false);
                Object objO4 = nv0Var.O();
                if (zG || objO4 == obj) {
                    objO4 = new n8(cs0Var2, cs0Var3, t33.f, ns0Var);
                    nv0Var.j0(objO4);
                }
                s33Var2 = (s33) oz2.H(objArr, ar2Var, (cs0) objO4, nv0Var, 0);
                float f6 = on.b;
                on onVar = on.a;
                z13 z13VarA = g23.a(s51.J, nv0Var);
                long jE = hy.e(s51.I, nv0Var);
                long jB = hy.b(jE, nv0Var);
                long jB2 = wx.b(0.32f, hy.e(vm1.g0, nv0Var));
                i3 = i7 & (-1912537985);
                d00 d00Var2 = n00.a;
                f3 = f6;
                j7 = jB2;
                rs0Var5 = d00Var2;
                z13Var3 = z13VarA;
                j8 = jE;
                j9 = jB;
                rs0Var6 = l00.t;
                wp1Var3 = new wp1();
                bq1Var2 = yp1.a;
                z3 = true;
            } else {
                nv0Var.U();
                bq1Var2 = bq1Var;
                f3 = f;
                z3 = z;
                z13Var3 = z13Var;
                j8 = j;
                j9 = j2;
                j7 = j3;
                rs0Var5 = rs0Var;
                rs0Var6 = rs0Var2;
                wp1Var3 = wp1Var;
                i3 = i7 & (-1912537985);
                s33Var2 = s33Var;
            }
            nv0Var.q();
            pq1 pq1Var = pq1.f;
            Object objR = uq.R(pq1Var, nv0Var);
            Object objR2 = uq.R(pq1Var, nv0Var);
            Object objR3 = uq.R(pq1.i, nv0Var);
            boolean zF3 = nv0Var.f(s33Var2) | nv0Var.h(objR2) | nv0Var.h(objR3) | nv0Var.h(objR);
            Object objO5 = nv0Var.O();
            if (zF3 || objO5 == obj) {
                objO5 = new n8(s33Var2, objR2, objR3, objR, 4);
                nv0Var.j0(objO5);
            }
            rn.t((cs0) objO5, nv0Var);
            Object objO6 = nv0Var.O();
            if (objO6 == obj) {
                objO6 = rn.A(nv0Var);
                nv0Var.j0(objO6);
            }
            x50 x50Var = (x50) objO6;
            int i11 = i3 & 14;
            boolean zF4 = nv0Var.f(s33Var2) | nv0Var.h(x50Var) | (i11 == 4);
            Object objO7 = nv0Var.O();
            if (zF4 || objO7 == obj) {
                objO7 = new np1(s33Var2, x50Var, cs0Var);
                nv0Var.j0(objO7);
            }
            cs0 cs0Var4 = (cs0) objO7;
            boolean zH = nv0Var.h(x50Var) | nv0Var.f(s33Var2) | (i11 == 4);
            Object objO8 = nv0Var.O();
            if (zH || objO8 == obj) {
                objO8 = new v1(x50Var, s33Var2, cs0Var, 17);
                nv0Var.j0(objO8);
            }
            ns0 ns0Var2 = (ns0) objO8;
            Object objO9 = nv0Var.O();
            if (objO9 == obj) {
                objO9 = gv3.a(0.0f, 0.01f);
                nv0Var.j0(objO9);
            }
            ed edVar = (ed) objO9;
            boolean zF5 = nv0Var.f(s33Var2) | nv0Var.h(x50Var) | nv0Var.h(edVar) | (i11 == 4);
            Object objO10 = nv0Var.O();
            if (zF5 || objO10 == obj) {
                objO10 = new n8(s33Var2, x50Var, edVar, cs0Var);
                nv0Var.j0(objO10);
            }
            vp.j((cs0) objO10, j9, wp1Var3, edVar, gq.N(1010026864, new rp1(j7, cs0Var4, s33Var2, wp1Var3, edVar, x50Var, ns0Var2, bq1Var2, f3, z3, z13Var3, j8, j9, rs0Var5, rs0Var6, d00Var), nv0Var), nv0Var, 29056);
            if (s33Var2.c.d().a.containsKey(t33.g)) {
                nv0Var.a0(748459762);
                boolean zF6 = nv0Var.f(s33Var2);
                Object objO11 = nv0Var.O();
                if (zF6 || objO11 == obj) {
                    objO11 = new qp1(s33Var2, null, i4);
                    nv0Var.j0(objO11);
                }
                rn.l((rs0) objO11, nv0Var, s33Var2);
                nv0Var.p(false);
            } else {
                nv0Var.a0(748521266);
                nv0Var.p(false);
            }
            j6 = j7;
            wp1Var2 = wp1Var3;
            f2 = f3;
            z2 = z3;
            z13Var2 = z13Var3;
            j4 = j8;
            j5 = j9;
            rs0Var3 = rs0Var5;
            rs0Var4 = rs0Var6;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            s33Var2 = s33Var;
            f2 = f;
            z2 = z;
            z13Var2 = z13Var;
            j4 = j;
            j5 = j2;
            j6 = j3;
            rs0Var3 = rs0Var;
            rs0Var4 = rs0Var2;
            wp1Var2 = wp1Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            final bq1 bq1Var3 = bq1Var2;
            xj2VarT.d = new rs0() { // from class: op1
                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(i | 1);
                    vp1.a(cs0Var, bq1Var3, s33Var2, f2, z2, z13Var2, j4, j5, j6, rs0Var3, rs0Var4, wp1Var2, d00Var, (nv0) obj2, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(final ed edVar, final x50 x50Var, final cs0 cs0Var, final ns0 ns0Var, final bq1 bq1Var, final s33 s33Var, final float f, final boolean z, final z13 z13Var, final long j, final long j2, final float f2, final rs0 rs0Var, final rs0 rs0Var2, final d00 d00Var, nv0 nv0Var, final int i) {
        nv0Var.b0(-37400432);
        int i2 = i | (nv0Var.h(edVar) ? 32 : 16) | (nv0Var.h(x50Var) ? 256 : 128) | (nv0Var.h(cs0Var) ? 2048 : 1024) | (nv0Var.h(ns0Var) ? 16384 : 8192) | (nv0Var.f(bq1Var) ? 131072 : 65536) | (nv0Var.f(s33Var) ? 1048576 : 524288) | (nv0Var.c(f) ? 8388608 : 4194304) | (nv0Var.g(z) ? 67108864 : 33554432) | (nv0Var.f(z13Var) ? 536870912 : 268435456);
        int i3 = (nv0Var.e(j) ? 4 : 2) | (nv0Var.e(j2) ? 32 : 16) | (nv0Var.c(f2) ? 256 : 128) | (nv0Var.h(rs0Var) ? 2048 : 1024) | (nv0Var.h(rs0Var2) ? 16384 : 8192) | (nv0Var.h(d00Var) ? 131072 : 65536);
        if (nv0Var.R(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            nv0Var.W();
            if ((i & 1) != 0 && !nv0Var.A()) {
                nv0Var.U();
            }
            nv0Var.q();
            String strP = g12.P(R.string.m3c_bottom_sheet_pane_title, nv0Var);
            bq1 bq1VarC = j43.c(j43.q(jo.a.a(bq1Var, f5.h), 0.0f, f, 1), 1.0f);
            bq1 bq1VarV = yp1.a;
            Object obj = c20.a;
            if (z) {
                nv0Var.a0(-1582035383);
                boolean z2 = (((i2 & 3670016) ^ 1572864) > 1048576 && nv0Var.f(s33Var)) || (i2 & 1572864) == 1048576;
                Object objO = nv0Var.O();
                if (z2 || objO == obj) {
                    zk3 zk3Var = q33.a;
                    objO = new p33(s33Var, ns0Var);
                    nv0Var.j0(objO);
                }
                bq1VarV = r51.v(bq1VarV, (dw1) objO, null);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1582020872);
                nv0Var.p(false);
            }
            bq1 bq1VarD = bq1VarC.d(bq1VarV);
            d6 d6Var = s33Var.c;
            d6 d6Var2 = s33Var.c;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && nv0Var.f(s33Var)) || (i2 & 1572864) == 1048576;
            Object objO2 = nv0Var.O();
            if (z3 || objO2 == obj) {
                objO2 = new u(21, s33Var);
                nv0Var.j0(objO2);
            }
            bq1 bq1VarT = s51.t(bq1VarD, d6Var, (rs0) objO2);
            a31 a31Var = d6Var2.f;
            boolean z4 = z && s33Var.d();
            boolean z5 = d6Var2.l.getValue() != null;
            boolean z6 = (i2 & 57344) == 16384;
            Object objO3 = nv0Var.O();
            if (z6 || objO3 == obj) {
                objO3 = new sp1(ns0Var, null);
                nv0Var.j0(objO3);
            }
            bq1 bq1VarA = bf0.a(bq1VarT, a31Var, t02.f, z4, null, z5, (ss0) objO3, false, 168);
            boolean zF = nv0Var.f(strP);
            Object objO4 = nv0Var.O();
            int i5 = 6;
            if (zF || objO4 == obj) {
                objO4 = new im(i5, strP);
                nv0Var.j0(objO4);
            }
            bq1 bq1VarA2 = su2.a(bq1VarA, false, (ns0) objO4);
            int iG = (int) d6Var2.j.g();
            if (iG < 0) {
                iG = 0;
            }
            bq1 bq1VarS = vm1.s(bq1VarA2, new om0(iG));
            boolean z7 = ((i4 > 1048576 && nv0Var.f(s33Var)) || (i2 & 1572864) == 1048576) | ((i2 & 112) == 32 || nv0Var.h(edVar));
            Object objO5 = nv0Var.O();
            if (z7 || objO5 == obj) {
                objO5 = new i(28, s33Var, edVar);
                nv0Var.j0(objO5);
            }
            int i6 = i3 << 6;
            hb3.a(vm1.z(vm1.z(bq1VarS, (ns0) objO5), new pn(s33Var, 0)), z13Var, j, j2, f2, 0.0f, null, gq.N(728743275, new up1(rs0Var2, edVar, s33Var, rs0Var, d00Var, cs0Var, x50Var, z), nv0Var), nv0Var, ((i2 >> 24) & 112) | 12582912 | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 96);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(x50Var, cs0Var, ns0Var, bq1Var, s33Var, f, z, z13Var, j, j2, f2, rs0Var, rs0Var2, d00Var, i) { // from class: mp1
                public final /* synthetic */ x50 g;
                public final /* synthetic */ cs0 h;
                public final /* synthetic */ ns0 i;
                public final /* synthetic */ bq1 j;
                public final /* synthetic */ s33 k;
                public final /* synthetic */ float l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ z13 n;
                public final /* synthetic */ long o;
                public final /* synthetic */ long p;
                public final /* synthetic */ float q;
                public final /* synthetic */ rs0 r;
                public final /* synthetic */ rs0 s;
                public final /* synthetic */ d00 t;

                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(71);
                    vp1.b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, (nv0) obj2, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void c(final long j, final cs0 cs0Var, final boolean z, final boolean z2, nv0 nv0Var, final int i) {
        nv0Var.b0(-391613911);
        int i2 = i | (nv0Var.e(j) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.g(z) ? 256 : 128) | (nv0Var.g(z2) ? 2048 : 1024);
        if (!nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            nv0Var.U();
        } else if (j != 16) {
            nv0Var.a0(-1438582326);
            final e93 e93VarB = gd.b(z ? 1.0f : 0.0f, uq.R(pq1.h, nv0Var), null, nv0Var, 0, 28);
            Object objP = g12.P(R.string.close_sheet, nv0Var);
            bq1 bq1VarA = yp1.a;
            Object obj = c20.a;
            if (z2) {
                nv0Var.a0(-1438283579);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objO = nv0Var.O();
                if (z3 || objO == obj) {
                    objO = new v8(5, cs0Var);
                    nv0Var.j0(objO);
                }
                bq1 bq1VarA2 = ob3.a(bq1VarA, cs0Var, (PointerInputEventHandler) objO);
                boolean zF = (i3 == 32) | nv0Var.f(objP);
                Object objO2 = nv0Var.O();
                if (zF || objO2 == obj) {
                    objO2 = new i(29, objP, cs0Var);
                    nv0Var.j0(objO2);
                }
                bq1VarA = su2.a(bq1VarA2, true, (ns0) objO2);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-1437857391);
                nv0Var.p(false);
            }
            bq1 bq1VarD = j43.c.d(bq1VarA);
            boolean zF2 = nv0Var.f(e93VarB) | ((i2 & 14) == 4);
            Object objO3 = nv0Var.O();
            if (zF2 || objO3 == obj) {
                objO3 = new ns0() { // from class: kp1
                    @Override // defpackage.ns0
                    public final Object h(Object obj2) {
                        qf0.h0((qf0) obj2, j, 0L, 0L, y02.g(((Number) e93VarB.getValue()).floatValue(), 0.0f, 1.0f), null, 0, 118);
                        return dm3.a;
                    }
                };
                nv0Var.j0(objO3);
            }
            vr.a(0, (ns0) objO3, nv0Var, bq1VarD);
            nv0Var.p(false);
        } else {
            nv0Var.a0(-1437676103);
            nv0Var.p(false);
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(j, cs0Var, z, z2, i) { // from class: lp1
                public final /* synthetic */ long f;
                public final /* synthetic */ cs0 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ boolean i;

                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(1);
                    vp1.c(this.f, this.g, this.h, this.i, (nv0) obj2, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final float d(uw0 uw0Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (uw0Var.a() >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (lq.N(0.0f, Math.min(uw0Var.h() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(uw0 uw0Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (lq.N(0.0f, Math.min(uw0Var.h() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }
}
