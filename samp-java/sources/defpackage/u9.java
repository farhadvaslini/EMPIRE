package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class u9 {
    public static final vb2 a = new vb2(true);

    public static final void a(final boolean z, final cs0 cs0Var, bq1 bq1Var, long j, es2 es2Var, vb2 vb2Var, z13 z13Var, long j2, float f, final d00 d00Var, nv0 nv0Var, final int i) {
        final bq1 bq1Var2;
        final long j3;
        final es2 es2Var2;
        final vb2 vb2Var2;
        final z13 z13Var2;
        final long j4;
        final float f2;
        long jFloatToRawIntBits;
        vb2 vb2Var3;
        es2 es2Var3;
        z13 z13Var3;
        long j5;
        float f3;
        bq1 bq1Var3;
        nv0Var.b0(1725609375);
        int i2 = i | (nv0Var.g(z) ? 4 : 2) | 910896512;
        int i3 = 1;
        if (nv0Var.R(i2 & 1, (306783379 & i2) != 306783378)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
                es2 es2VarA = n92.A(nv0Var);
                float f4 = on1.a;
                z13 z13VarA = g23.a(s51.w, nv0Var);
                long jE = hy.e(s51.u, nv0Var);
                float f5 = on1.a;
                yp1 yp1Var = yp1.a;
                vb2Var3 = a;
                es2Var3 = es2VarA;
                z13Var3 = z13VarA;
                j5 = jE;
                f3 = f5;
                bq1Var3 = yp1Var;
            } else {
                nv0Var.U();
                bq1Var3 = bq1Var;
                jFloatToRawIntBits = j;
                es2Var3 = es2Var;
                vb2Var3 = vb2Var;
                z13Var3 = z13Var;
                j5 = j2;
                f3 = f;
            }
            nv0Var.q();
            Object objO = nv0Var.O();
            Object obj = c20.a;
            if (objO == obj) {
                objO = new ps1(Boolean.FALSE);
                nv0Var.j0(objO);
            }
            ps1 ps1Var = (ps1) objO;
            ps1Var.c.setValue(Boolean.valueOf(z));
            if (((Boolean) ps1Var.b.getValue()).booleanValue() || ((Boolean) ps1Var.c.getValue()).booleanValue()) {
                nv0Var.a0(1165905588);
                Object objO2 = nv0Var.O();
                if (objO2 == obj) {
                    objO2 = b32.w(new wj3(wj3.b));
                    nv0Var.j0(objO2);
                }
                os1 os1Var = (os1) objO2;
                ua0 ua0Var = (ua0) nv0Var.j(s20.h);
                boolean zF = nv0Var.f(ua0Var);
                Object objO3 = nv0Var.O();
                if (zF || objO3 == obj) {
                    objO3 = new gg0(jFloatToRawIntBits, ua0Var, new l8(os1Var, i3));
                    nv0Var.j0(objO3);
                }
                xa.a((gg0) objO3, cs0Var, vb2Var3, gq.N(-917492520, new t9(bq1Var3, ps1Var, os1Var, es2Var3, z13Var3, j5, f3, d00Var), nv0Var), nv0Var, 3504, 0);
                nv0Var.p(false);
            } else {
                nv0Var.a0(1166965571);
                nv0Var.p(false);
            }
            j3 = jFloatToRawIntBits;
            vb2Var2 = vb2Var3;
            bq1Var2 = bq1Var3;
            es2Var2 = es2Var3;
            z13Var2 = z13Var3;
            j4 = j5;
            f2 = f3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            j3 = j;
            es2Var2 = es2Var;
            vb2Var2 = vb2Var;
            z13Var2 = z13Var;
            j4 = j2;
            f2 = f;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new rs0(z, cs0Var, bq1Var2, j3, es2Var2, vb2Var2, z13Var2, j4, f2, d00Var, i) { // from class: r9
                public final /* synthetic */ boolean f;
                public final /* synthetic */ cs0 g;
                public final /* synthetic */ bq1 h;
                public final /* synthetic */ long i;
                public final /* synthetic */ es2 j;
                public final /* synthetic */ vb2 k;
                public final /* synthetic */ z13 l;
                public final /* synthetic */ long m;
                public final /* synthetic */ float n;
                public final /* synthetic */ d00 o;

                @Override // defpackage.rs0
                public final Object f(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iY = jo3.y(49);
                    u9.a(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (nv0) obj2, iY);
                    return dm3.a;
                }
            };
        }
    }

    public static final void b(rs0 rs0Var, cs0 cs0Var, bq1 bq1Var, boolean z, un1 un1Var, x12 x12Var, nv0 nv0Var, int i, int i2) {
        int i3;
        bq1 bq1Var2;
        boolean z2;
        un1 un1Var2;
        x12 x12Var2;
        un1 un1VarA;
        un1 un1Var3;
        int i4;
        bq1 bq1Var3;
        x12 x12Var3;
        boolean z3;
        nv0Var.b0(-532959117);
        int i5 = i | (nv0Var.h(cs0Var) ? 32 : 16);
        int i6 = i5 | 28032;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 = i5 | 224640;
        } else {
            i3 = i6 | (nv0Var.g(z) ? 131072 : 65536);
        }
        int i8 = i3 | (((i2 & 64) == 0 && nv0Var.f(un1Var)) ? 1048576 : 524288) | 113246208;
        if (nv0Var.R(i8 & 1, (38347923 & i8) != 38347922)) {
            nv0Var.W();
            if ((i & 1) == 0 || nv0Var.A()) {
                boolean z4 = i7 == 0 ? z : true;
                if ((i2 & 64) != 0) {
                    float f = on1.a;
                    un1VarA = on1.a((fy) nv0Var.j(hy.a));
                    i8 &= -3670017;
                } else {
                    un1VarA = un1Var;
                }
                b22 b22Var = on1.b;
                un1Var3 = un1VarA;
                i4 = i8;
                bq1Var3 = yp1.a;
                x12Var3 = b22Var;
                z3 = z4;
            } else {
                nv0Var.U();
                if ((i2 & 64) != 0) {
                    i8 &= -3670017;
                }
                z3 = z;
                un1Var3 = un1Var;
                x12Var3 = x12Var;
                i4 = i8;
                bq1Var3 = bq1Var;
            }
            nv0Var.q();
            lr.e(rs0Var, cs0Var, bq1Var3, z3, un1Var3, x12Var3, nv0Var, 268435454 & i4);
            un1Var2 = un1Var3;
            x12Var2 = x12Var3;
            bq1Var2 = bq1Var3;
            z2 = z3;
        } else {
            nv0Var.U();
            bq1Var2 = bq1Var;
            z2 = z;
            un1Var2 = un1Var;
            x12Var2 = x12Var;
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new s9(rs0Var, cs0Var, bq1Var2, z2, un1Var2, x12Var2, i, i2);
        }
    }
}
