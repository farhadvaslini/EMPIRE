package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class q32 extends aq1 implements kb1, of0 {
    public o32 t;
    public boolean u;
    public vm v;
    public zj w;
    public float x;
    public yx y;

    public static boolean q1(long j) {
        return !h43.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    public static boolean r1(long j) {
        return !h43.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        if (!p1()) {
            return xm1Var.y(i);
        }
        long jS1 = s1(n30.b(0, i, 0, 0, 13));
        return Math.max(m30.j(jS1), xm1Var.y(i));
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        if (!p1()) {
            return xm1Var.x0(i);
        }
        long jS1 = s1(n30.b(0, i, 0, 0, 13));
        return Math.max(m30.j(jS1), xm1Var.x0(i));
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        rr rrVar = vb1Var.f;
        long jD = this.t.d();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(r1(jD) ? Float.intBitsToFloat((int) (jD >> 32)) : Float.intBitsToFloat((int) (rrVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(q1(jD) ? Float.intBitsToFloat((int) (jD & 4294967295L)) : Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)))) & 4294967295L);
        long jF = (Float.intBitsToFloat((int) (rrVar.a() >> 32)) == 0.0f || Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)) == 0.0f) ? 0L : b32.F(jFloatToRawIntBits, this.w.c(jFloatToRawIntBits, rrVar.a()));
        long jA = this.v.a((((long) Math.round(Float.intBitsToFloat((int) (jF >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jF & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (rrVar.a() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)))) & 4294967295L), vb1Var.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f2 = (int) (jA & 4294967295L);
        ((yl1) rrVar.g.g).H(f, f2);
        try {
            this.t.c(vb1Var, jF, this.x, this.y);
            ((yl1) rrVar.g.g).H(-f, -f2);
            vb1Var.c();
        } catch (Throwable th) {
            ((yl1) rrVar.g.g).H(-f, -f2);
            throw th;
        }
    }

    public final boolean p1() {
        return this.u && this.t.d() != 9205357640488583168L;
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        if (!p1()) {
            return xm1Var.m0(i);
        }
        long jS1 = s1(n30.b(0, 0, 0, i, 7));
        return Math.max(m30.k(jS1), xm1Var.m0(i));
    }

    public final long s1(long j) {
        boolean z = false;
        boolean z2 = m30.e(j) && m30.d(j);
        if (m30.g(j) && m30.f(j)) {
            z = true;
        }
        if ((!p1() && z2) || z) {
            return m30.b(j, m30.i(j), 0, m30.h(j), 0, 10);
        }
        long jD = this.t.d();
        int iRound = r1(jD) ? Math.round(Float.intBitsToFloat((int) (jD >> 32))) : m30.k(j);
        int iRound2 = q1(jD) ? Math.round(Float.intBitsToFloat((int) (jD & 4294967295L))) : m30.j(j);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(n30.f(iRound2, j))) & 4294967295L) | (((long) Float.floatToRawIntBits(n30.g(iRound, j))) << 32);
        if (p1()) {
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!r1(this.t.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.t.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!q1(this.t.d()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.t.d() & 4294967295L)))) & 4294967295L);
            jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : b32.F(jFloatToRawIntBits2, this.w.c(jFloatToRawIntBits2, jFloatToRawIntBits));
        }
        return m30.b(j, n30.g(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), 0, n30.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(s1(j));
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 8));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.t + ", sizeToIntrinsics=" + this.u + ", alignment=" + this.v + ", alpha=" + this.x + ", colorFilter=" + this.y + ")";
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        if (!p1()) {
            return xm1Var.u0(i);
        }
        long jS1 = s1(n30.b(0, 0, 0, i, 7));
        return Math.max(m30.k(jS1), xm1Var.u0(i));
    }
}
