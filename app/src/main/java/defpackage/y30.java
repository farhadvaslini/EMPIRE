package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y30 extends aq1 implements m20, gn1 {
    public boolean B;
    public t02 t;
    public final ws2 u;
    public boolean v;
    public zo w;
    public final ns2 x;
    public boolean z;
    public final po y = new po(0);
    public long A = -1;

    public y30(t02 t02Var, ws2 ws2Var, boolean z, zo zoVar, ns2 ns2Var) {
        this.t = t02Var;
        this.u = ws2Var;
        this.v = z;
        this.w = zoVar;
        this.x = ns2Var;
    }

    public static final float p1(y30 y30Var, zo zoVar, long j) {
        float f;
        jk2 jk2Var;
        int iCompare;
        long j2 = y30Var.A;
        qs1 qs1Var = y30Var.y.a;
        int i = qs1Var.h - 1;
        Object[] objArr = qs1Var.f;
        if (i < objArr.length) {
            jk2Var = null;
            while (true) {
                if (i < 0) {
                    f = 0.0f;
                    break;
                }
                jk2 jk2Var2 = (jk2) ((v30) objArr[i]).a.a();
                if (jk2Var2 != null) {
                    long jC = jk2Var2.c();
                    long jT = lr.T(y30Var.q1());
                    f = 0.0f;
                    int iOrdinal = y30Var.t.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC & 4294967295L)), Float.intBitsToFloat((int) (jT & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            c.k();
                            return 0.0f;
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jC >> 32)), Float.intBitsToFloat((int) (jT >> 32)));
                    }
                    if (iCompare <= 0) {
                        jk2Var = jk2Var2;
                    } else if (jk2Var == null) {
                        jk2Var = jk2Var2;
                    }
                }
                i--;
            }
        } else {
            f = 0.0f;
            jk2Var = null;
        }
        if (jk2Var == null) {
            jk2 jk2Var3 = y30Var.z ? (jk2) y30Var.x.a() : null;
            if (jk2Var3 == null) {
                return f;
            }
            jk2Var = jk2Var3;
        }
        long jT2 = lr.T(j2);
        int iOrdinal2 = y30Var.t.ordinal();
        if (iOrdinal2 == 0) {
            float f2 = jk2Var.b;
            return zoVar.a(f2 - ((int) (j & 4294967295L)), jk2Var.d - f2, Float.intBitsToFloat((int) (jT2 & 4294967295L)));
        }
        if (iOrdinal2 == 1) {
            float f3 = jk2Var.a;
            return zoVar.a(f3 - ((int) (j >> 32)), jk2Var.c - f3, Float.intBitsToFloat((int) (jT2 >> 32)));
        }
        c.k();
        return f;
    }

    public static boolean r1(y30 y30Var, jk2 jk2Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = y30Var.q1();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jT1 = y30Var.t1(jk2Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (jT1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jT1 & 4294967295L))) <= 0.5f;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.gn1
    public final void i(long j) {
        int iR;
        long jQ1 = q1();
        this.A = j;
        int iOrdinal = this.t.ordinal();
        if (iOrdinal == 0) {
            iR = s51.r((int) (j & 4294967295L), (int) (jQ1 & 4294967295L));
        } else {
            if (iOrdinal != 1) {
                c.k();
                return;
            }
            iR = s51.r((int) (j >> 32), (int) (jQ1 >> 32));
        }
        if (iR >= 0) {
            return;
        }
        long j2 = !this.v ? this.t == t02.f ? ((long) (((int) (jQ1 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jQ1 >> 32)) - ((int) (j >> 32)))) << 32 : 0L;
        jk2 jk2Var = (jk2) this.x.a();
        if (jk2Var == null || this.B || this.z || !r1(this, jk2Var, jQ1, 0L, 2) || r1(this, jk2Var, 0L, j2, 1)) {
            return;
        }
        this.z = true;
        s1(j2);
    }

    public final long q1() {
        long j = this.A;
        if (p41.b(j, -1L)) {
            return 0L;
        }
        return j;
    }

    public final void s1(long j) {
        zo zoVar = this.w;
        if (zoVar == null) {
            zoVar = (zo) ur.z(this, bp.a);
        }
        zo zoVar2 = zoVar;
        if (this.B) {
            p21.c("launchAnimation called when previous animation was running");
        }
        zo zoVar3 = this.w;
        if (zoVar3 == null) {
            zoVar3 = (zo) ur.z(this, bp.a);
        }
        zoVar3.getClass();
        zo.a.getClass();
        cl3.t(d1(), null, new x30(this, new um3(yo.b), zoVar2, j, null), 1);
    }

    public final long t1(jk2 jk2Var, long j, long j2) {
        long jT = lr.T(j);
        int iOrdinal = this.t.ordinal();
        if (iOrdinal == 0) {
            zo zoVar = this.w;
            if (zoVar == null) {
                zoVar = (zo) ur.z(this, bp.a);
            }
            float f = jk2Var.b;
            return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(zoVar.a(f - ((int) (j2 & 4294967295L)), jk2Var.d - f, Float.intBitsToFloat((int) (jT & 4294967295L))))) & 4294967295L);
        }
        if (iOrdinal != 1) {
            c.k();
            return 0L;
        }
        zo zoVar2 = this.w;
        if (zoVar2 == null) {
            zoVar2 = (zo) ur.z(this, bp.a);
        }
        float f2 = jk2Var.a;
        return (((long) Float.floatToRawIntBits(zoVar2.a(f2 - ((int) (j2 >> 32)), jk2Var.c - f2, Float.intBitsToFloat((int) (jT >> 32))))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
    }
}
