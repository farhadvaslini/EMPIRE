package defpackage;

import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ex1 extends al1 implements xm1, ab1 {
    public static final fi1 b0 = new fi1(26);
    public static final fi1 c0 = new fi1(27);
    public static final wn2 d0 = new wn2();
    public static final xa1 e0 = new xa1();
    public static final float[] f0 = wm1.a();
    public static final cx1 g0 = new cx1();
    public static final h01 h0 = new h01(13);
    public boolean A;
    public boolean B;
    public ex1 C;
    public ex1 D;
    public boolean E;
    public boolean F;
    public ns0 G;
    public ua0 H;
    public bb1 I;
    public dn1 K;
    public wr1 L;
    public float N;
    public hs1 O;
    public xa1 P;
    public jk2 R;
    public jk2 S;
    public boolean T;
    public boolean U;
    public qw0 V;
    public pr W;
    public y7 X;
    public final bx1 Y;
    public boolean Z;
    public p12 a0;
    public final tb1 z;
    public float J = 0.8f;
    public long M = 0;
    public z13 Q = cl3.q0;

    public ex1(tb1 tb1Var) {
        this.z = tb1Var;
        this.H = tb1Var.E;
        this.I = tb1Var.F;
        jk2 jk2Var = jk2.e;
        this.R = jk2Var;
        this.S = jk2Var;
        this.Y = new bx1(this, 1);
    }

    public static ex1 S1(ab1 ab1Var) {
        ex1 ex1Var;
        dl1 dl1Var = ab1Var instanceof dl1 ? (dl1) ab1Var : null;
        if (dl1Var != null && (ex1Var = dl1Var.f.z) != null) {
            return ex1Var;
        }
        ab1Var.getClass();
        return (ex1) ab1Var;
    }

    public final void A1(aq1 aq1Var, dx1 dx1Var, long j, ly0 ly0Var, int i, boolean z) {
        if (aq1Var == null) {
            D1(dx1Var, j, ly0Var, i, z);
            return;
        }
        if (!dx1Var.c(aq1Var)) {
            A1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z);
            return;
        }
        int i2 = ly0Var.h;
        as1 as1Var = ly0Var.f;
        ly0Var.b(i2 + 1, as1Var.b);
        ly0Var.h++;
        as1Var.b(aq1Var);
        ly0Var.g.a(lr.c(-1.0f, z, false));
        A1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z);
        ly0Var.h = i2;
    }

    @Override // defpackage.ab1
    public final long B(long j) {
        if (!w1().s) {
            m21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ab1 ab1VarY = vr.y(this);
        h7 h7Var = (h7) wb1.a(this.z);
        h7Var.C();
        return l0(ab1VarY, gy1.d(wm1.b(j, h7Var.e0), ab1VarY.k0(0L)), true);
    }

    public final void B1(aq1 aq1Var, dx1 dx1Var, long j, ly0 ly0Var, int i, boolean z, float f) {
        if (aq1Var == null) {
            D1(dx1Var, j, ly0Var, i, z);
            return;
        }
        if (!dx1Var.c(aq1Var)) {
            B1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z, f);
            return;
        }
        int i2 = ly0Var.h;
        as1 as1Var = ly0Var.f;
        ly0Var.b(i2 + 1, as1Var.b);
        ly0Var.h++;
        as1Var.b(aq1Var);
        ly0Var.g.a(lr.c(f, z, false));
        L1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z, f, true);
        ly0Var.h = i2;
    }

    public final void C1(dx1 dx1Var, long j, ly0 ly0Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        aq1 aq1VarY1 = y1(dx1Var.b());
        if (!Y1(j)) {
            if (i == 1) {
                float fO1 = o1(j, v1());
                if ((Float.floatToRawIntBits(fO1) & Integer.MAX_VALUE) < 2139095040) {
                    if (ly0Var.h != ly0Var.f.b - 1) {
                        if (vp.w(ly0Var.a(), lr.c(fO1, false, false)) <= 0) {
                            return;
                        }
                    }
                    B1(aq1VarY1, dx1Var, j, ly0Var, i, false, fO1);
                    return;
                }
                return;
            }
            return;
        }
        if (aq1VarY1 == null) {
            D1(dx1Var, j, ly0Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < G0() && fIntBitsToFloat2 < F0()) {
            A1(aq1VarY1, dx1Var, j, ly0Var, i, z);
            return;
        }
        float fO12 = i == 1 ? o1(j, v1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fO12) & Integer.MAX_VALUE) < 2139095040) {
            if (ly0Var.h != ly0Var.f.b - 1) {
                z2 = z;
                if (vp.w(ly0Var.a(), lr.c(fO12, z2, false)) > 0) {
                }
                L1(aq1VarY1, dx1Var, j, ly0Var, i, z2, fO12, z3);
            }
            z2 = z;
            z3 = true;
            L1(aq1VarY1, dx1Var, j, ly0Var, i, z2, fO12, z3);
        }
        z2 = z;
        z3 = false;
        L1(aq1VarY1, dx1Var, j, ly0Var, i, z2, fO12, z3);
    }

    @Override // defpackage.ab1
    public final long D(long j) {
        long jK0 = k0(j);
        h7 h7Var = (h7) wb1.a(this.z);
        h7Var.C();
        return wm1.b(jK0, h7Var.d0);
    }

    public void D1(dx1 dx1Var, long j, ly0 ly0Var, int i, boolean z) {
        ex1 ex1Var = this.C;
        if (ex1Var != null) {
            ex1Var.C1(dx1Var, ex1Var.t1(j, true), ly0Var, i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.i62, defpackage.xm1
    public final Object E() {
        tb1 tb1Var = this.z;
        if (!tb1Var.L.d(64)) {
            return null;
        }
        w1();
        Object objB0 = null;
        for (aq1 aq1Var = tb1Var.L.e; aq1Var != null; aq1Var = aq1Var.j) {
            if ((aq1Var.h & 64) != 0) {
                ?? J = aq1Var;
                ?? qs1Var = 0;
                while (J != 0) {
                    if (J instanceof f42) {
                        objB0 = ((f42) J).b0(tb1Var.E, objB0);
                    } else if ((J.h & 64) != 0 && (J instanceof ja0)) {
                        aq1 aq1Var2 = ((ja0) J).u;
                        int i = 0;
                        J = J;
                        qs1Var = qs1Var;
                        while (aq1Var2 != null) {
                            if ((aq1Var2.h & 64) != 0) {
                                i++;
                                qs1Var = qs1Var;
                                if (i == 1) {
                                    J = aq1Var2;
                                } else {
                                    if (qs1Var == 0) {
                                        qs1Var = new qs1(new aq1[16]);
                                    }
                                    if (J != 0) {
                                        qs1Var.b(J);
                                        J = 0;
                                    }
                                    qs1Var.b(aq1Var2);
                                }
                            }
                            aq1Var2 = aq1Var2.k;
                            J = J;
                            qs1Var = qs1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = vr.j(qs1Var);
                }
            }
        }
        return objB0;
    }

    public final void E1() {
        p12 p12Var = this.a0;
        if (p12Var != null) {
            ((tw0) p12Var).c();
            return;
        }
        ex1 ex1Var = this.D;
        if (ex1Var != null) {
            ex1Var.E1();
        }
    }

    @Override // defpackage.ab1
    public final ab1 F() {
        boolean z = w1().s;
        tb1 tb1Var = this.z;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (tb1 tb1VarU = tb1Var; tb1VarU != null; tb1VarU = tb1VarU.u()) {
                sb.append("\n|");
                sb.append(tb1VarU);
                sb.append(" isAttached=");
                sb.append(tb1VarU.H());
                sb.append(" modifier=");
                sb.append(tb1VarU.Q);
                sb.append(" tail=");
                sb.append(w1());
            }
            m21.c(sb.toString());
        }
        G1();
        return tb1Var.L.d.D;
    }

    public final boolean F1() {
        if (this.a0 != null && this.J <= 0.0f) {
            return true;
        }
        ex1 ex1Var = this.D;
        if (ex1Var != null) {
            return ex1Var.F1();
        }
        return false;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.z.E.G();
    }

    public final void G1() {
        this.z.M.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void H1() {
        aq1 aq1VarW1;
        boolean zG = fx1.g(128);
        aq1 aq1VarZ1 = z1(zG);
        if (aq1VarZ1 == null || (aq1VarZ1.f.i & 128) == 0) {
            return;
        }
        t63 t63VarL = jo3.l();
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            if (!zG) {
                aq1VarW1 = w1().j;
                if (aq1VarW1 == null) {
                }
            }
            aq1VarW1 = w1();
            for (aq1 aq1VarZ12 = z1(zG); aq1VarZ12 != null; aq1VarZ12 = aq1VarZ12.k) {
                if ((aq1VarZ12.i & 128) == 0) {
                    break;
                }
                if ((aq1VarZ12.h & 128) != 0) {
                    ?? J = aq1VarZ12;
                    ?? qs1Var = 0;
                    while (J != 0) {
                        if (J instanceof gn1) {
                            ((gn1) J).i(this.h);
                        } else if ((J.h & 128) != 0 && (J instanceof ja0)) {
                            aq1 aq1Var = ((ja0) J).u;
                            int i = 0;
                            J = J;
                            qs1Var = qs1Var;
                            while (aq1Var != null) {
                                if ((aq1Var.h & 128) != 0) {
                                    i++;
                                    qs1Var = qs1Var;
                                    if (i == 1) {
                                        J = aq1Var;
                                    } else {
                                        if (qs1Var == 0) {
                                            qs1Var = new qs1(new aq1[16]);
                                        }
                                        if (J != 0) {
                                            qs1Var.b(J);
                                            J = 0;
                                        }
                                        qs1Var.b(aq1Var);
                                    }
                                }
                                aq1Var = aq1Var.k;
                                J = J;
                                qs1Var = qs1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        J = vr.j(qs1Var);
                    }
                }
                if (aq1VarZ12 == aq1VarW1) {
                    break;
                }
            }
        } finally {
            jo3.v(t63VarL, t63VarS, ns0VarE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [aq1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void I1() {
        boolean zG = fx1.g(4194304);
        aq1 aq1VarW1 = w1();
        if (!zG && (aq1VarW1 = aq1VarW1.j) == null) {
            return;
        }
        for (aq1 aq1VarZ1 = z1(zG); aq1VarZ1 != null && (aq1VarZ1.i & 4194304) != 0; aq1VarZ1 = aq1VarZ1.k) {
            if ((aq1VarZ1.h & 4194304) != 0) {
                ?? J = aq1VarZ1;
                ?? qs1Var = 0;
                while (J != 0) {
                    if (J instanceof ya1) {
                        ((ya1) J).J(this);
                    } else if ((J.h & 4194304) != 0 && (J instanceof ja0)) {
                        aq1 aq1Var = ((ja0) J).u;
                        int i = 0;
                        J = J;
                        qs1Var = qs1Var;
                        while (aq1Var != null) {
                            if ((aq1Var.h & 4194304) != 0) {
                                i++;
                                qs1Var = qs1Var;
                                if (i == 1) {
                                    J = aq1Var;
                                } else {
                                    if (qs1Var == 0) {
                                        qs1Var = new qs1(new aq1[16]);
                                    }
                                    if (J != 0) {
                                        qs1Var.b(J);
                                        J = 0;
                                    }
                                    qs1Var.b(aq1Var);
                                }
                            }
                            aq1Var = aq1Var.k;
                            J = J;
                            qs1Var = qs1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J = vr.j(qs1Var);
                }
            }
            if (aq1VarZ1 == aq1VarW1) {
                return;
            }
        }
    }

    public final void J1() {
        this.E = true;
        this.Y.a();
        P1();
        if (i41.a(this.M, 0L)) {
            return;
        }
        this.z.N(this);
    }

    public final void K1() {
        boolean zG = fx1.g(1048576);
        aq1 aq1VarZ1 = z1(zG);
        if (aq1VarZ1 == null || (aq1VarZ1.f.i & 1048576) == 0) {
            return;
        }
        aq1 aq1VarW1 = w1();
        if (!zG && (aq1VarW1 = aq1VarW1.j) == null) {
            return;
        }
        for (aq1 aq1VarZ12 = z1(zG); aq1VarZ12 != null && (aq1VarZ12.i & 1048576) != 0; aq1VarZ12 = aq1VarZ12.k) {
            if ((aq1VarZ12.h & 1048576) != 0) {
                aq1 aq1VarJ = aq1VarZ12;
                qs1 qs1Var = null;
                while (aq1VarJ != null) {
                    if (aq1VarJ instanceof rp0) {
                    } else if ((aq1VarJ.h & 1048576) != 0 && (aq1VarJ instanceof ja0)) {
                        int i = 0;
                        for (aq1 aq1Var = ((ja0) aq1VarJ).u; aq1Var != null; aq1Var = aq1Var.k) {
                            if ((aq1Var.h & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    aq1VarJ = aq1Var;
                                } else {
                                    if (qs1Var == null) {
                                        qs1Var = new qs1(new aq1[16]);
                                    }
                                    if (aq1VarJ != null) {
                                        qs1Var.b(aq1VarJ);
                                        aq1VarJ = null;
                                    }
                                    qs1Var.b(aq1Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    aq1VarJ = vr.j(qs1Var);
                }
            }
            if (aq1VarZ12 == aq1VarW1) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d0 A[PHI: r4
      0x01d0: PHI (r4v12 ??) = (r4v1 ??), (r4v1 ??), (r4v14 ??) binds: [B:55:0x019a, B:57:0x019e, B:71:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r3v18, types: [aq1] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12, types: [qs1] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [qs1] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L1(defpackage.aq1 r19, defpackage.dx1 r20, long r21, defpackage.ly0 r23, int r24, boolean r25, float r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.L1(aq1, dx1, long, ly0, int, boolean, float, boolean):void");
    }

    public abstract void M1(pr prVar, qw0 qw0Var);

    public final void N1(long j, float f, ns0 ns0Var) {
        W1(ns0Var, false);
        boolean zA = i41.a(this.M, j);
        tb1 tb1Var = this.z;
        if (!zA) {
            ((h7) wb1.a(tb1Var)).O(-4.0f);
            this.M = j;
            p12 p12Var = this.a0;
            if (p12Var != null) {
                ((tw0) p12Var).d(j);
            } else {
                ex1 ex1Var = this.D;
                if (ex1Var != null) {
                    ex1Var.E1();
                }
            }
            tb1Var.N(this);
            al1.h1(this);
            q12 q12Var = tb1Var.t;
            if (q12Var != null) {
                ((h7) q12Var).x(tb1Var);
            }
        }
        this.N = f;
        if (this == tb1Var.L.d) {
            ((h7) wb1.a(tb1Var)).getRectManager().h(tb1Var);
        }
        if (this.t) {
            return;
        }
        T0(d1());
    }

    @Override // defpackage.ab1
    public final long O(ab1 ab1Var, long j) {
        return l0(ab1Var, j, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O1(defpackage.hs1 r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.O1(hs1, boolean, boolean):void");
    }

    public final void P1() {
        if (this.a0 != null) {
            W1(null, false);
            this.z.X(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [qs1] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [qs1] */
    public final void Q1(dn1 dn1Var) {
        ex1 ex1Var;
        dn1 dn1Var2 = this.K;
        if (dn1Var != dn1Var2) {
            this.K = dn1Var;
            tb1 tb1Var = this.z;
            int i = 0;
            if (dn1Var2 == null || dn1Var.g() != dn1Var2.g() || dn1Var.d() != dn1Var2.d()) {
                int iG = dn1Var.g();
                int iD = dn1Var.d();
                p12 p12Var = this.a0;
                if (p12Var != null) {
                    ((tw0) p12Var).e((((long) iG) << 32) | (((long) iD) & 4294967295L));
                } else if (tb1Var.I() && (ex1Var = this.D) != null) {
                    ex1Var.E1();
                }
                L0((((long) iD) & 4294967295L) | (((long) iG) << 32));
                if (this.G != null) {
                    X1(false);
                }
                boolean zG = fx1.g(4);
                aq1 aq1VarW1 = w1();
                if (zG || (aq1VarW1 = aq1VarW1.j) != null) {
                    for (aq1 aq1VarZ1 = z1(zG); aq1VarZ1 != null && (aq1VarZ1.i & 4) != 0; aq1VarZ1 = aq1VarZ1.k) {
                        if ((aq1VarZ1.h & 4) != 0) {
                            ?? J = aq1VarZ1;
                            ?? qs1Var = 0;
                            while (J != 0) {
                                if (J instanceof of0) {
                                    ((of0) J).R0();
                                } else if ((J.h & 4) != 0 && (J instanceof ja0)) {
                                    aq1 aq1Var = ((ja0) J).u;
                                    int i2 = 0;
                                    J = J;
                                    qs1Var = qs1Var;
                                    while (aq1Var != null) {
                                        if ((aq1Var.h & 4) != 0) {
                                            i2++;
                                            qs1Var = qs1Var;
                                            if (i2 == 1) {
                                                J = aq1Var;
                                            } else {
                                                if (qs1Var == 0) {
                                                    qs1Var = new qs1(new aq1[16]);
                                                }
                                                if (J != 0) {
                                                    qs1Var.b(J);
                                                    J = 0;
                                                }
                                                qs1Var.b(aq1Var);
                                            }
                                        }
                                        aq1Var = aq1Var.k;
                                        J = J;
                                        qs1Var = qs1Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                J = vr.j(qs1Var);
                            }
                        }
                        if (aq1VarZ1 == aq1VarW1) {
                            break;
                        }
                    }
                }
                q12 q12Var = tb1Var.t;
                if (q12Var != null) {
                    ((h7) q12Var).x(tb1Var);
                }
                tb1Var.N(this);
            }
            wr1 wr1Var = this.L;
            if ((wr1Var == null || wr1Var.e == 0) && dn1Var.c().isEmpty()) {
                return;
            }
            wr1 wr1Var2 = this.L;
            Map mapC = dn1Var.c();
            if (wr1Var2 != null && wr1Var2.e == mapC.size()) {
                Object[] objArr = wr1Var2.b;
                int[] iArr = wr1Var2.c;
                long[] jArr = wr1Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapC.get((i5) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            tb1Var.M.p.C.f();
            wr1 wr1Var3 = this.L;
            if (wr1Var3 == null) {
                wr1 wr1Var4 = ay1.a;
                wr1Var3 = new wr1();
                this.L = wr1Var3;
            }
            wr1Var3.a();
            for (Map.Entry entry : dn1Var.c().entrySet()) {
                wr1Var3.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void R1(aq1 aq1Var, dx1 dx1Var, long j, ly0 ly0Var, int i, boolean z, float f) {
        int i2;
        if (aq1Var == null) {
            D1(dx1Var, j, ly0Var, i, z);
            return;
        }
        if (!dx1Var.c(aq1Var)) {
            R1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z, f);
            return;
        }
        if (!dx1Var.a(aq1Var)) {
            L1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z, f, false);
            return;
        }
        rr1 rr1Var = ly0Var.g;
        as1 as1Var = ly0Var.f;
        int i3 = ly0Var.h;
        int i4 = as1Var.b;
        if (i3 != i4 - 1) {
            long jA = ly0Var.a();
            int i5 = ly0Var.h;
            int i6 = as1Var.b;
            int i7 = i6 - 1;
            ly0Var.h = i7;
            ly0Var.b(i6, as1Var.b);
            ly0Var.h++;
            as1Var.b(aq1Var);
            rr1Var.a(lr.c(f, z, false));
            L1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z, f, false);
            ly0Var.h = i7;
            long jA2 = ly0Var.a();
            if (ly0Var.h + 1 >= as1Var.b - 1 || vp.w(jA, jA2) <= 0) {
                ly0Var.b(ly0Var.h + 1, as1Var.b);
            } else {
                int i8 = i5 + 1;
                boolean zK = vp.K(jA2);
                int i9 = ly0Var.h;
                ly0Var.b(i8, zK ? i9 + 2 : i9 + 1);
            }
            ly0Var.h = i5;
            return;
        }
        int i10 = i3 + 1;
        ly0Var.b(i10, i4);
        ly0Var.h++;
        as1Var.b(aq1Var);
        rr1Var.a(lr.c(f, z, false));
        L1(lr.j(aq1Var, dx1Var.b()), dx1Var, j, ly0Var, i, z, f, false);
        ly0Var.h = i3;
        if (i10 == as1Var.b - 1 || vp.K(ly0Var.a())) {
            int i11 = ly0Var.h;
            int i12 = i11 + 1;
            as1Var.l(i12);
            if (i12 < 0 || i12 >= (i2 = rr1Var.b)) {
                c.i("Index must be between 0 and size");
                return;
            }
            long[] jArr = rr1Var.a;
            long j2 = jArr[i12];
            if (i12 != i2 - 1) {
                uj.I(jArr, jArr, i12, i11 + 2, i2);
            }
            rr1Var.b--;
        }
    }

    public final jk2 T1() {
        if (w1().s) {
            ab1 ab1VarY = vr.y(this);
            hs1 hs1Var = this.O;
            if (hs1Var == null) {
                hs1Var = new hs1();
                this.O = hs1Var;
            }
            long jN1 = n1(v1());
            float f = x1() ? this.R.a : 0.0f;
            float f2 = x1() ? this.R.b : 0.0f;
            float fG0 = x1() ? this.R.c : G0();
            float fF0 = x1() ? this.R.d : F0();
            int i = (int) (jN1 >> 32);
            hs1Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (jN1 & 4294967295L);
            hs1Var.b = f2 - Float.intBitsToFloat(i2);
            hs1Var.c = Float.intBitsToFloat(i) + fG0;
            hs1Var.d = Float.intBitsToFloat(i2) + fF0;
            while (this != ab1VarY) {
                this.O1(hs1Var, false, true);
                if (!hs1Var.b()) {
                    this = this.D;
                    this.getClass();
                }
            }
            return new jk2(hs1Var.a, hs1Var.b, hs1Var.c, hs1Var.d);
        }
        return jk2.e;
    }

    @Override // defpackage.al1, defpackage.r12
    public final boolean U() {
        return (this.a0 == null || this.E || !this.z.H()) ? false : true;
    }

    @Override // defpackage.al1
    public final al1 U0() {
        return this.C;
    }

    public final void U1(ex1 ex1Var, float[] fArr) {
        float[] fArrA;
        if (s51.n(ex1Var, this)) {
            return;
        }
        ex1 ex1Var2 = this.D;
        ex1Var2.getClass();
        ex1Var2.U1(ex1Var, fArr);
        if (!i41.a(this.M, 0L)) {
            float[] fArr2 = f0;
            wm1.d(fArr2);
            long j = this.M;
            wm1.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            wm1.e(fArr, fArr2);
        }
        p12 p12Var = this.a0;
        if (p12Var == null || (fArrA = ((tw0) p12Var).a()) == null) {
            return;
        }
        wm1.e(fArr, fArrA);
    }

    @Override // defpackage.ab1
    public final long V(long j) {
        if (!w1().s) {
            m21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return l0(vr.y(this), ((h7) wb1.a(this.z)).I(j), true);
    }

    public final void V1(ex1 ex1Var, float[] fArr) {
        while (!this.equals(ex1Var)) {
            p12 p12Var = this.a0;
            if (p12Var != null) {
                wm1.e(fArr, ((tw0) p12Var).b());
            }
            if (!i41.a(this.M, 0L)) {
                float[] fArr2 = f0;
                wm1.d(fArr2);
                wm1.f(fArr2, (int) (r0 >> 32), (int) (r0 & 4294967295L));
                wm1.e(fArr, fArr2);
            }
            this = this.D;
            this.getClass();
        }
    }

    public final void W1(ns0 ns0Var, boolean z) {
        q12 q12Var;
        qs1 qs1Var;
        Reference referencePoll;
        y7 y7Var;
        qs1 qs1Var2;
        Reference referencePoll2;
        Object obj;
        int i = 0;
        tb1 tb1Var = this.z;
        boolean z2 = (!z && this.G == ns0Var && s51.n(this.H, tb1Var.E) && this.I == tb1Var.F) ? false : true;
        this.H = tb1Var.E;
        this.I = tb1Var.F;
        boolean zH = tb1Var.H();
        bx1 bx1Var = this.Y;
        if (!zH || ns0Var == null) {
            this.G = null;
            p12 p12Var = this.a0;
            if (p12Var != null) {
                tw0 tw0Var = (tw0) p12Var;
                if (!pq.G(tw0Var.b())) {
                    tb1Var.N(this);
                }
                tw0Var.i = null;
                tw0Var.j = null;
                tw0Var.l = true;
                tw0Var.f(false);
                ow0 ow0Var = tw0Var.g;
                if (ow0Var != null) {
                    ow0Var.a(tw0Var.f);
                    h7 h7Var = tw0Var.h;
                    ar2 ar2Var = h7Var.u0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) ar2Var.h;
                        qs1Var = (qs1) ar2Var.g;
                        referencePoll = referenceQueue.poll();
                        if (referencePoll != null) {
                            qs1Var.j(referencePoll);
                        }
                    } while (referencePoll != null);
                    qs1Var.b(new WeakReference(tw0Var, (ReferenceQueue) ar2Var.h));
                    h7Var.F.k(tw0Var);
                }
                this.a0 = null;
                tb1Var.P = true;
                bx1Var.a();
                if (w1().s && tb1Var.I() && (q12Var = tb1Var.t) != null) {
                    ((h7) q12Var).x(tb1Var);
                }
            }
            this.Z = false;
            return;
        }
        this.G = ns0Var;
        if (this.a0 != null) {
            if (z2) {
                X1(true);
                return;
            }
            return;
        }
        q12 q12VarA = wb1.a(tb1Var);
        y7 y7Var2 = this.X;
        if (y7Var2 == null) {
            y7 y7Var3 = new y7(27, this, new bx1(this, i));
            this.X = y7Var3;
            y7Var = y7Var3;
        } else {
            y7Var = y7Var2;
        }
        h7 h7Var2 = (h7) q12VarA;
        ar2 ar2Var2 = h7Var2.u0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) ar2Var2.h;
            qs1Var2 = (qs1) ar2Var2.g;
            referencePoll2 = referenceQueue2.poll();
            if (referencePoll2 != null) {
                qs1Var2.j(referencePoll2);
            }
        } while (referencePoll2 != null);
        while (true) {
            int i2 = qs1Var2.h;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) qs1Var2.k(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        p12 tw0Var2 = (p12) obj;
        if (tw0Var2 != null) {
            tw0 tw0Var3 = (tw0) tw0Var2;
            ow0 ow0Var2 = tw0Var3.g;
            if (ow0Var2 == null) {
                throw nc2.d("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!tw0Var3.f.s) {
                m21.a("layer should have been released before reuse");
            }
            tw0Var3.f = ow0Var2.b();
            tw0Var3.l = false;
            tw0Var3.i = y7Var;
            tw0Var3.j = bx1Var;
            tw0Var3.v = false;
            tw0Var3.w = false;
            tw0Var3.x = true;
            wm1.d(tw0Var3.m);
            float[] fArr = tw0Var3.n;
            if (fArr != null) {
                wm1.d(fArr);
            }
            tw0Var3.t = wj3.b;
            tw0Var3.y = false;
            tw0Var3.k = 9223372034707292159L;
            tw0Var3.u = null;
            tw0Var3.s = 0;
        } else {
            tw0Var2 = new tw0(h7Var2.getGraphicsContext().b(), h7Var2.getGraphicsContext(), h7Var2, y7Var, bx1Var);
        }
        tw0 tw0Var4 = (tw0) tw0Var2;
        tw0Var4.e(this.h);
        tw0Var4.d(this.M);
        this.a0 = tw0Var2;
        X1(true);
        tb1Var.P = true;
        bx1Var.a();
    }

    public final void X1(boolean z) {
        char c;
        long j;
        tb1 tb1Var;
        mk2 mk2Var;
        boolean z2;
        tb1 tb1Var2;
        cs0 cs0Var;
        int i;
        cs0 cs0Var2;
        p12 p12Var = this.a0;
        ns0 ns0Var = this.G;
        if (p12Var == null) {
            if (ns0Var == null) {
                return;
            }
            m21.c("null layer with a non-null layerBlock");
            return;
        }
        if (ns0Var == null) {
            throw nc2.d("updateLayerParameters requires a non-null layerBlock");
        }
        wn2 wn2Var = d0;
        wn2Var.c();
        tb1 tb1Var3 = this.z;
        wn2Var.y = tb1Var3.E;
        wn2Var.z = tb1Var3.F;
        wn2Var.w = lr.T(this.h);
        mk2 mk2Var2 = new mk2();
        ((h7) wb1.a(tb1Var3)).getSnapshotObserver().a.d(this, b0, new ok(ns0Var, this, mk2Var2, 13));
        xa1 xa1Var = this.P;
        if (xa1Var == null) {
            xa1Var = new xa1();
            this.P = xa1Var;
        }
        xa1 xa1Var2 = e0;
        xa1Var2.getClass();
        xa1Var2.a = xa1Var.a;
        xa1Var2.b = xa1Var.b;
        xa1Var2.c = xa1Var.c;
        xa1Var2.d = xa1Var.d;
        xa1Var2.e = xa1Var.e;
        xa1Var2.f = xa1Var.f;
        xa1Var2.g = xa1Var.g;
        xa1Var2.h = xa1Var.h;
        xa1Var2.i = xa1Var.i;
        xa1Var.a = wn2Var.g;
        xa1Var.b = wn2Var.h;
        xa1Var.c = wn2Var.j;
        xa1Var.d = wn2Var.k;
        xa1Var.e = wn2Var.o;
        xa1Var.f = wn2Var.p;
        xa1Var.g = wn2Var.q;
        xa1Var.h = wn2Var.r;
        xa1Var.i = wn2Var.s;
        tw0 tw0Var = (tw0) p12Var;
        h7 h7Var = tw0Var.h;
        int i2 = wn2Var.f | tw0Var.s;
        tw0Var.q = wn2Var.z;
        ua0 ua0Var = wn2Var.y;
        tw0Var.p = ua0Var;
        if ((1048576 & i2) != 0) {
            qw0 qw0Var = tw0Var.f;
            wn2Var.x.getClass();
            int iP0 = ua0Var.p0(0.0f);
            wn2Var.x.getClass();
            int iP02 = ua0Var.p0(0.0f);
            wn2Var.x.getClass();
            int iP03 = ua0Var.p0(0.0f);
            wn2Var.x.getClass();
            int iP04 = ua0Var.p0(0.0f);
            qw0Var.v = iP0;
            qw0Var.w = iP02;
            qw0Var.x = iP03;
            qw0Var.y = iP04;
            qw0Var.a.y(iP0, iP02, iP03, iP04);
            tw0Var.c();
        }
        int i3 = i2 & 4096;
        if (i3 != 0) {
            tw0Var.t = wn2Var.s;
        }
        if ((i2 & 1) != 0) {
            qw0 qw0Var2 = tw0Var.f;
            float f = wn2Var.g;
            sw0 sw0Var = qw0Var2.a;
            if (sw0Var.e() != f) {
                sw0Var.m(f);
            }
        }
        if ((i2 & 2) != 0) {
            qw0 qw0Var3 = tw0Var.f;
            float f2 = wn2Var.h;
            sw0 sw0Var2 = qw0Var3.a;
            if (sw0Var2.v() != f2) {
                sw0Var2.s(f2);
            }
        }
        if ((i2 & 4) != 0) {
            tw0Var.f.f(wn2Var.i);
        }
        if ((i2 & 8) != 0) {
            qw0 qw0Var4 = tw0Var.f;
            float f3 = wn2Var.j;
            sw0 sw0Var3 = qw0Var4.a;
            if (sw0Var3.H() != f3) {
                sw0Var3.p(f3);
            }
        }
        if ((i2 & 16) != 0) {
            qw0 qw0Var5 = tw0Var.f;
            float f4 = wn2Var.k;
            sw0 sw0Var4 = qw0Var5.a;
            if (sw0Var4.z() != f4) {
                sw0Var4.k(f4);
            }
        }
        if ((i2 & 32) != 0) {
            qw0 qw0Var6 = tw0Var.f;
            float f5 = wn2Var.l;
            sw0 sw0Var5 = qw0Var6.a;
            if (sw0Var5.P() != f5) {
                sw0Var5.g(f5);
                qw0Var6.g = true;
                qw0Var6.a();
            }
            if (wn2Var.l > 0.0f && !tw0Var.y && (cs0Var2 = tw0Var.j) != null) {
                cs0Var2.a();
            }
        }
        if ((i2 & 64) != 0) {
            qw0 qw0Var7 = tw0Var.f;
            long j2 = wn2Var.m;
            sw0 sw0Var6 = qw0Var7.a;
            if (!wx.c(j2, sw0Var6.T())) {
                sw0Var6.l(j2);
            }
        }
        if ((i2 & 128) != 0) {
            qw0 qw0Var8 = tw0Var.f;
            long j3 = wn2Var.n;
            sw0 sw0Var7 = qw0Var8.a;
            if (!wx.c(j3, sw0Var7.B())) {
                sw0Var7.q(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            qw0 qw0Var9 = tw0Var.f;
            float f6 = wn2Var.q;
            sw0 sw0Var8 = qw0Var9.a;
            if (sw0Var8.R() != f6) {
                sw0Var8.j(f6);
            }
        }
        if ((i2 & 256) != 0) {
            qw0 qw0Var10 = tw0Var.f;
            float f7 = wn2Var.o;
            sw0 sw0Var9 = qw0Var10.a;
            if (sw0Var9.K() != f7) {
                sw0Var9.w(f7);
            }
        }
        if ((i2 & 512) != 0) {
            qw0 qw0Var11 = tw0Var.f;
            float f8 = wn2Var.p;
            sw0 sw0Var10 = qw0Var11.a;
            if (sw0Var10.O() != f8) {
                sw0Var10.b(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            qw0 qw0Var12 = tw0Var.f;
            float f9 = wn2Var.r;
            sw0 sw0Var11 = qw0Var12.a;
            if (sw0Var11.D() != f9) {
                sw0Var11.u(f9);
            }
        }
        if (i3 != 0) {
            j = 4294967295L;
            boolean zA = wj3.a(tw0Var.t, wj3.b);
            qw0 qw0Var13 = tw0Var.f;
            if (zA) {
                c = ' ';
                if (!gy1.b(qw0Var13.z, 9205357640488583168L)) {
                    qw0Var13.z = 9205357640488583168L;
                    qw0Var13.a.S(9205357640488583168L);
                }
            } else {
                c = ' ';
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tw0Var.t & 4294967295L)) * ((int) (tw0Var.k & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tw0Var.t >> 32)) * ((int) (tw0Var.k >> 32)))) << 32);
                if (!gy1.b(qw0Var13.z, jFloatToRawIntBits)) {
                    qw0Var13.z = jFloatToRawIntBits;
                    qw0Var13.a.S(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i2 & 16384) != 0) {
            qw0 qw0Var14 = tw0Var.f;
            boolean z3 = wn2Var.u;
            if (qw0Var14.A != z3) {
                qw0Var14.A = z3;
                qw0Var14.g = true;
                qw0Var14.a();
            }
        }
        if ((131072 & i2) != 0) {
            qw0 qw0Var15 = tw0Var.f;
            u10 u10Var = wn2Var.A;
            sw0 sw0Var12 = qw0Var15.a;
            if (!s51.n(sw0Var12.A(), u10Var)) {
                sw0Var12.r(u10Var);
            }
        }
        if ((262144 & i2) != 0) {
            qw0 qw0Var16 = tw0Var.f;
            yx yxVar = wn2Var.B;
            sw0 sw0Var13 = qw0Var16.a;
            if (!s51.n(sw0Var13.L(), yxVar)) {
                sw0Var13.f(yxVar);
            }
        }
        if ((524288 & i2) != 0) {
            qw0 qw0Var17 = tw0Var.f;
            int i4 = wn2Var.C;
            sw0 sw0Var14 = qw0Var17.a;
            if (sw0Var14.x() != i4) {
                sw0Var14.n(i4);
            }
        }
        if ((32768 & i2) != 0) {
            qw0 qw0Var18 = tw0Var.f;
            int i5 = wn2Var.v;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i5 != 2) {
                    c.q("Not supported composition strategy");
                    return;
                }
            }
            sw0 sw0Var15 = qw0Var18.a;
            if (sw0Var15.J() != i) {
                sw0Var15.M(i);
            }
        }
        if ((i2 & 7963) != 0) {
            tw0Var.v = true;
            tw0Var.w = true;
        }
        if (s51.n(tw0Var.u, wn2Var.D)) {
            tb1Var = tb1Var3;
            mk2Var = mk2Var2;
            z2 = false;
        } else {
            vr vrVar = wn2Var.D;
            tw0Var.u = vrVar;
            if (vrVar == null) {
                tb1Var = tb1Var3;
                mk2Var = mk2Var2;
            } else {
                qw0 qw0Var19 = tw0Var.f;
                if (vrVar instanceof w02) {
                    jk2 jk2Var = ((w02) vrVar).l;
                    char c2 = c;
                    float f10 = jk2Var.a;
                    float f11 = jk2Var.b;
                    qw0Var19.g((((long) Float.floatToRawIntBits(f10)) << c2) | (((long) Float.floatToRawIntBits(f11)) & j), (((long) Float.floatToRawIntBits(jk2Var.c - f10)) << c2) | (((long) Float.floatToRawIntBits(jk2Var.d - f11)) & j), 0.0f);
                } else {
                    char c3 = c;
                    if (vrVar instanceof v02) {
                        da daVar = ((v02) vrVar).l;
                        qw0Var19.k = null;
                        qw0Var19.i = 9205357640488583168L;
                        qw0Var19.h = 0L;
                        qw0Var19.j = 0.0f;
                        qw0Var19.g = true;
                        qw0Var19.n = false;
                        qw0Var19.l = daVar;
                        qw0Var19.a();
                    } else {
                        if (!(vrVar instanceof x02)) {
                            c.k();
                            return;
                        }
                        x02 x02Var = (x02) vrVar;
                        da daVar2 = x02Var.m;
                        if (daVar2 != null) {
                            qw0Var19.k = null;
                            tb1Var = tb1Var3;
                            mk2Var = mk2Var2;
                            qw0Var19.i = 9205357640488583168L;
                            qw0Var19.h = 0L;
                            qw0Var19.j = 0.0f;
                            qw0Var19.g = true;
                            qw0Var19.n = false;
                            qw0Var19.l = daVar2;
                            qw0Var19.a();
                        } else {
                            tb1Var = tb1Var3;
                            mk2Var = mk2Var2;
                            ro2 ro2Var = x02Var.l;
                            float f12 = ro2Var.b;
                            float f13 = ro2Var.a;
                            qw0Var19.g((((long) Float.floatToRawIntBits(f12)) & j) | (((long) Float.floatToRawIntBits(f13)) << c3), (((long) Float.floatToRawIntBits(ro2Var.c - f13)) << c3) | (((long) Float.floatToRawIntBits(ro2Var.d - f12)) & j), Float.intBitsToFloat((int) (ro2Var.h >> c3)));
                        }
                        if (Build.VERSION.SDK_INT < 33 && (((vrVar instanceof v02) || ((vrVar instanceof x02) && !w22.A(((x02) vrVar).l))) && (cs0Var = tw0Var.j) != null)) {
                            cs0Var.a();
                        }
                    }
                }
                tb1Var = tb1Var3;
                mk2Var = mk2Var2;
                if (Build.VERSION.SDK_INT < 33) {
                    cs0Var.a();
                }
            }
            z2 = true;
        }
        tw0Var.s = wn2Var.f;
        if (i2 != 0 || z2) {
            ViewParent parent = h7Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(h7Var, h7Var);
            }
            if (h7.n()) {
                h7Var.O(0.0f);
            }
        }
        boolean z4 = this.F;
        this.F = wn2Var.u;
        this.J = wn2Var.i;
        boolean z5 = xa1Var2.a == xa1Var.a && xa1Var2.b == xa1Var.b && xa1Var2.c == xa1Var.c && xa1Var2.d == xa1Var.d && xa1Var2.e == xa1Var.e && xa1Var2.f == xa1Var.f && xa1Var2.g == xa1Var.g && xa1Var2.h == xa1Var.h && wj3.a(xa1Var2.i, xa1Var.i);
        if (!z || (z5 && z4 == this.F && !mk2Var.f)) {
            tb1Var2 = tb1Var;
        } else {
            tb1Var2 = tb1Var;
            q12 q12Var = tb1Var2.t;
            if (q12Var != null) {
                ((h7) q12Var).x(tb1Var2);
            }
        }
        if (z5) {
            return;
        }
        tb1Var2.N(this);
        if (tb1Var2.V > 0) {
            h7 h7Var2 = (h7) wb1.a(tb1Var2);
            a31 a31Var = h7Var2.V.e;
            a31Var.getClass();
            if (tb1Var2.V > 0) {
                ((qs1) a31Var.g).b(tb1Var2);
                tb1Var2.U = true;
            }
            h7Var2.H(null);
        }
    }

    @Override // defpackage.ab1
    public final void Y(float[] fArr) {
        q12 q12VarA = wb1.a(this.z);
        ex1 ex1VarS1 = S1(vr.y(this));
        V1(ex1VarS1, fArr);
        if (q12VarA instanceof h7) {
            ((h7) q12VarA).r(fArr);
            return;
        }
        long jI = ex1VarS1.i(0L);
        if ((9223372034707292159L & jI) != 9205357640488583168L) {
            wm1.f(fArr, Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI & 4294967295L)));
        }
    }

    @Override // defpackage.al1
    public final boolean Y0() {
        return this.K != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Y1(long r24) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.Y1(long):boolean");
    }

    @Override // defpackage.al1
    public final tb1 Z0() {
        return this.z;
    }

    @Override // defpackage.ab1
    public final void b0(ab1 ab1Var, float[] fArr) {
        ex1 ex1VarS1 = S1(ab1Var);
        ex1VarS1.G1();
        ex1 ex1VarS12 = s1(ex1VarS1);
        wm1.d(fArr);
        ex1VarS1.V1(ex1VarS12, fArr);
        U1(ex1VarS12, fArr);
    }

    @Override // defpackage.ab1
    public final jk2 c0(ab1 ab1Var, boolean z) {
        if (!w1().s) {
            m21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!ab1Var.t0()) {
            m21.c("LayoutCoordinates " + ab1Var + " is not attached!");
        }
        ex1 ex1VarS1 = S1(ab1Var);
        ex1VarS1.G1();
        ex1 ex1VarS12 = s1(ex1VarS1);
        hs1 hs1Var = this.O;
        if (hs1Var == null) {
            hs1Var = new hs1();
            this.O = hs1Var;
        }
        hs1Var.a = 0.0f;
        hs1Var.b = 0.0f;
        hs1Var.c = (int) (ab1Var.i0() >> 32);
        hs1Var.d = (int) (ab1Var.i0() & 4294967295L);
        while (ex1VarS1 != ex1VarS12) {
            ex1VarS1.O1(hs1Var, z, false);
            if (hs1Var.b()) {
                return jk2.e;
            }
            ex1VarS1 = ex1VarS1.D;
            ex1VarS1.getClass();
        }
        l1(ex1VarS12, hs1Var, z);
        return new jk2(hs1Var.a, hs1Var.b, hs1Var.c, hs1Var.d);
    }

    @Override // defpackage.al1
    public final dn1 d1() {
        dn1 dn1Var = this.K;
        if (dn1Var != null) {
            return dn1Var;
        }
        c.q("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.al1
    public final al1 e1() {
        return this.D;
    }

    @Override // defpackage.al1
    public final long f1() {
        return this.M;
    }

    @Override // defpackage.k51
    public final bb1 getLayoutDirection() {
        return this.z.F;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.z.E.h();
    }

    @Override // defpackage.ab1
    public final long i(long j) {
        if (!w1().s) {
            m21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((h7) wb1.a(this.z)).s(k0(j));
    }

    @Override // defpackage.ab1
    public final long i0() {
        return this.h;
    }

    @Override // defpackage.al1
    public final void j1() {
        K0(this.M, this.N, this.G);
    }

    @Override // defpackage.ab1
    public final long k0(long j) {
        if (!w1().s) {
            m21.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G1();
        while (this != null) {
            tb1 tb1Var = this.z;
            if (this == tb1Var.L.d && !tb1Var.h) {
                long jB = ((h7) wb1.a(tb1Var)).getRectManager().b(tb1Var);
                if (!i41.a(jB, 9223372034707292159L)) {
                    return uq.E(j, jB);
                }
            }
            p12 p12Var = this.a0;
            if (p12Var != null) {
                tw0 tw0Var = (tw0) p12Var;
                float[] fArrB = tw0Var.b();
                if (!tw0Var.x) {
                    j = wm1.b(j, fArrB);
                }
            }
            j = uq.E(j, this.M);
            this = this.D;
        }
        return j;
    }

    @Override // defpackage.ab1
    public final long l0(ab1 ab1Var, long j, boolean z) {
        if (ab1Var instanceof dl1) {
            dl1 dl1Var = (dl1) ab1Var;
            dl1Var.f.z.G1();
            return dl1Var.l0(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        ex1 ex1VarS1 = S1(ab1Var);
        ex1VarS1.G1();
        ex1 ex1VarS12 = s1(ex1VarS1);
        while (ex1VarS1 != ex1VarS12) {
            p12 p12Var = ex1VarS1.a0;
            if (p12Var != null) {
                tw0 tw0Var = (tw0) p12Var;
                float[] fArrB = tw0Var.b();
                if (!tw0Var.x) {
                    j = wm1.b(j, fArrB);
                }
            }
            if (z || !ex1VarS1.q) {
                j = uq.E(j, ex1VarS1.M);
            }
            ex1VarS1 = ex1VarS1.D;
            ex1VarS1.getClass();
        }
        return m1(ex1VarS12, j, z);
    }

    public final void l1(ex1 ex1Var, hs1 hs1Var, boolean z) {
        if (ex1Var == this) {
            return;
        }
        ex1 ex1Var2 = this.D;
        if (ex1Var2 != null) {
            ex1Var2.l1(ex1Var, hs1Var, z);
        }
        long j = this.M;
        float f = (int) (j >> 32);
        hs1Var.a -= f;
        hs1Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        hs1Var.b -= f2;
        hs1Var.d -= f2;
        p12 p12Var = this.a0;
        if (p12Var != null) {
            tw0 tw0Var = (tw0) p12Var;
            float[] fArrA = tw0Var.a();
            if (!tw0Var.x) {
                if (fArrA == null) {
                    hs1Var.a = 0.0f;
                    hs1Var.b = 0.0f;
                    hs1Var.c = 0.0f;
                    hs1Var.d = 0.0f;
                } else {
                    wm1.c(fArrA, hs1Var);
                }
            }
            if (this.F && z) {
                long j2 = this.h;
                hs1Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long m1(ex1 ex1Var, long j, boolean z) {
        if (ex1Var == this) {
            return j;
        }
        ex1 ex1Var2 = this.D;
        return (ex1Var2 == null || s51.n(ex1Var, ex1Var2)) ? t1(j, z) : t1(ex1Var2.m1(ex1Var, j, z), z);
    }

    public final long n1(long j) {
        float fG0;
        float fF0;
        if (x1()) {
            jk2 jk2Var = this.R;
            fG0 = jk2Var.c - jk2Var.a;
        } else {
            fG0 = G0();
        }
        if (x1()) {
            jk2 jk2Var2 = this.R;
            fF0 = jk2Var2.d - jk2Var2.b;
        } else {
            fF0 = F0();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fG0;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fF0;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final float o1(long j, long j2) {
        if (G0() >= Float.intBitsToFloat((int) (j2 >> 32)) && F0() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jN1 = n1(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - G0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - F0()))) & 4294967295L);
        if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
            int i = (int) (jFloatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i);
                    float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
                    return (fIntBitsToFloat6 * fIntBitsToFloat6) + (fIntBitsToFloat5 * fIntBitsToFloat5);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void p1(pr prVar, qw0 qw0Var) {
        p12 p12Var = this.a0;
        if (p12Var == null) {
            long j = this.M;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            prVar.g(f, f2);
            q1(prVar, qw0Var);
            prVar.g(-f, -f2);
            return;
        }
        tw0 tw0Var = (tw0) p12Var;
        rr rrVar = tw0Var.r;
        tw0Var.g();
        tw0Var.y = tw0Var.f.a.P() > 0.0f;
        pi piVar = rrVar.g;
        piVar.M(prVar);
        piVar.h = qw0Var;
        lr.z(rrVar, tw0Var.f);
    }

    public final void q1(pr prVar, qw0 qw0Var) {
        ex1 ex1Var;
        pr prVar2;
        qw0 qw0Var2;
        aq1 aq1VarY1 = y1(4);
        if (aq1VarY1 == null) {
            M1(prVar, qw0Var);
            return;
        }
        tb1 tb1Var = this.z;
        tb1Var.getClass();
        vb1 sharedDrawScope = ((h7) wb1.a(tb1Var)).getSharedDrawScope();
        long jT = lr.T(this.h);
        sharedDrawScope.getClass();
        qs1 qs1Var = null;
        while (aq1VarY1 != null) {
            if (aq1VarY1 instanceof of0) {
                ex1Var = this;
                prVar2 = prVar;
                qw0Var2 = qw0Var;
                sharedDrawScope.i(prVar2, jT, ex1Var, (of0) aq1VarY1, qw0Var2);
            } else {
                ex1Var = this;
                prVar2 = prVar;
                qw0Var2 = qw0Var;
                if ((aq1VarY1.h & 4) != 0 && (aq1VarY1 instanceof ja0)) {
                    int i = 0;
                    for (aq1 aq1Var = ((ja0) aq1VarY1).u; aq1Var != null; aq1Var = aq1Var.k) {
                        if ((aq1Var.h & 4) != 0) {
                            i++;
                            if (i == 1) {
                                aq1VarY1 = aq1Var;
                            } else {
                                if (qs1Var == null) {
                                    qs1Var = new qs1(new aq1[16]);
                                }
                                if (aq1VarY1 != null) {
                                    qs1Var.b(aq1VarY1);
                                    aq1VarY1 = null;
                                }
                                qs1Var.b(aq1Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                prVar = prVar2;
                this = ex1Var;
                qw0Var = qw0Var2;
            }
            aq1VarY1 = vr.j(qs1Var);
            prVar = prVar2;
            this = ex1Var;
            qw0Var = qw0Var2;
        }
    }

    public abstract void r1();

    public final ex1 s1(ex1 ex1Var) {
        tb1 tb1VarU = ex1Var.z;
        tb1 tb1Var = this.z;
        if (tb1VarU == tb1Var) {
            aq1 aq1VarW1 = ex1Var.w1();
            aq1 aq1VarW12 = w1();
            if (!aq1VarW12.f.s) {
                m21.c("visitLocalAncestors called on an unattached node");
            }
            for (aq1 aq1Var = aq1VarW12.f.j; aq1Var != null; aq1Var = aq1Var.j) {
                if ((aq1Var.h & 2) != 0 && aq1Var == aq1VarW1) {
                    return ex1Var;
                }
            }
            return this;
        }
        while (tb1VarU.v > tb1Var.v) {
            tb1VarU = tb1VarU.u();
            tb1VarU.getClass();
        }
        tb1 tb1VarU2 = tb1Var;
        while (tb1VarU2.v > tb1VarU.v) {
            tb1VarU2 = tb1VarU2.u();
            tb1VarU2.getClass();
        }
        while (tb1VarU != tb1VarU2) {
            tb1VarU = tb1VarU.u();
            tb1VarU2 = tb1VarU2.u();
            if (tb1VarU == null || tb1VarU2 == null) {
                c.p("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (tb1VarU2 != tb1Var) {
            if (tb1VarU != ex1Var.z) {
                return tb1VarU.L.c;
            }
            return ex1Var;
        }
        return this;
    }

    @Override // defpackage.ab1
    public final boolean t0() {
        return w1().s;
    }

    public final long t1(long j, boolean z) {
        if (z || !this.q) {
            long j2 = this.M;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        p12 p12Var = this.a0;
        if (p12Var != null) {
            tw0 tw0Var = (tw0) p12Var;
            float[] fArrA = tw0Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!tw0Var.x) {
                return wm1.b(j, fArrA);
            }
        }
        return j;
    }

    public abstract cl1 u1();

    public final long v1() {
        return this.H.C0(this.z.G.g());
    }

    public abstract aq1 w1();

    public final boolean x1() {
        return this.T && !this.R.f();
    }

    public final aq1 y1(int i) {
        boolean zG = fx1.g(i);
        aq1 aq1VarW1 = w1();
        if (!zG && (aq1VarW1 = aq1VarW1.j) == null) {
            return null;
        }
        for (aq1 aq1VarZ1 = z1(zG); aq1VarZ1 != null && (aq1VarZ1.i & i) != 0; aq1VarZ1 = aq1VarZ1.k) {
            if ((aq1VarZ1.h & i) != 0) {
                return aq1VarZ1;
            }
            if (aq1VarZ1 == aq1VarW1) {
                return null;
            }
        }
        return null;
    }

    public final aq1 z1(boolean z) {
        aq1 aq1VarW1;
        ax1 ax1Var = this.z.L;
        if (ax1Var.d == this) {
            return ax1Var.f;
        }
        ex1 ex1Var = this.D;
        if (!z) {
            if (ex1Var != null) {
                return ex1Var.w1();
            }
            return null;
        }
        if (ex1Var == null || (aq1VarW1 = ex1Var.w1()) == null) {
            return null;
        }
        return aq1VarW1.k;
    }

    @Override // defpackage.al1
    public final ab1 V0() {
        return this;
    }
}
