package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class wb3 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final s63 f;

    static {
        float f2 = gv3.o0;
        a = f2;
        b = gv3.y0;
        c = gv3.v0;
        float f3 = gv3.s0;
        d = f3;
        e = (f3 - f2) / 2.0f;
        f = new s63(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r51, final defpackage.ns0 r52, defpackage.bq1 r53, boolean r54, defpackage.tb3 r55, defpackage.nv0 r56, final int r57, final int r58) {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb3.a(boolean, ns0, bq1, boolean, tb3, nv0, int, int):void");
    }

    public static final void b(final bq1 bq1Var, final boolean z, final boolean z2, final tb3 tb3Var, final t41 t41Var, final z13 z13Var, nv0 nv0Var, final int i) {
        int i2;
        long j;
        long j2;
        nv0Var.b0(-670917213);
        if ((i & 6) == 0) {
            i2 = (nv0Var.f(bq1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= nv0Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= nv0Var.g(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= nv0Var.f(tb3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= nv0Var.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= nv0Var.f(t41Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= nv0Var.f(z13Var) ? 1048576 : 524288;
        }
        if (nv0Var.R(i2 & 1, (599187 & i2) != 599186)) {
            long j3 = z2 ? z ? tb3Var.b : tb3Var.f : z ? tb3Var.j : tb3Var.n;
            long j4 = z2 ? z ? tb3Var.a : tb3Var.e : z ? tb3Var.i : tb3Var.m;
            z13 z13VarA = g23.a(gv3.u0, nv0Var);
            float f2 = gv3.t0;
            if (z2) {
                j = j4;
                j2 = z ? tb3Var.c : tb3Var.g;
            } else {
                j = j4;
                j2 = z ? tb3Var.k : tb3Var.o;
            }
            bq1 bq1VarV = gv3.v(bq1Var.d(new kn(f2, new w73(j2), z13VarA)), j3, z13VarA);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarV);
            w10.c.getClass();
            nv0Var.d0();
            boolean z3 = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z3) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, cn1VarD);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            bq1 bq1VarV2 = gv3.v(l11.a(jo.a.a(yp1.a, f5.j).d(new yh3(t41Var, z, uq.R(pq1.g, nv0Var))), t41Var, ko2.a(gv3.r0 / 2.0f, 4, 0L, false)), j, z13Var);
            cn1 cn1VarD2 = eo.d(f5.k, false);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, bq1VarV2);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD2);
            y02.F(z00Var2, nv0Var, n52VarL2);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                nc2.q(iC2, nv0Var, iC2, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM2);
            nv0Var.a0(1236071411);
            nv0Var.p(false);
            nv0Var.p(true);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0() { // from class: vb3
                @Override // defpackage.rs0
                public final Object f(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wb3.b(bq1Var, z, z2, tb3Var, t41Var, z13Var, (nv0) obj, jo3.y(i | 1));
                    return dm3.a;
                }
            };
        }
    }
}
