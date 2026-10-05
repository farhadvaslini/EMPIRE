package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cp1 {
    public static cp1 h;
    public final bb1 a;
    public final gh3 b;
    public final xa0 c;
    public final zp0 d;
    public final gh3 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public cp1(bb1 bb1Var, gh3 gh3Var, xa0 xa0Var, zp0 zp0Var) {
        this.a = bb1Var;
        this.b = gh3Var;
        this.c = xa0Var;
        this.d = zp0Var;
        this.e = n32.y(gh3Var, bb1Var);
    }

    public final long a(int i, long j) {
        int iJ;
        float f = this.g;
        float f2 = this.f;
        int i2 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = dp1.a;
            gh3 gh3Var = this.e;
            ni0 ni0Var = ni0.f;
            zp0 zp0Var = this.d;
            xa0 xa0Var = this.c;
            y9 y9Var = new y9(new ca(str, gh3Var, ni0Var, ni0Var, zp0Var, xa0Var, false), 1, 1, n30.b(0, 0, 0, 0, 15));
            i2 = 1;
            float f3 = new y9(new ca(dp1.b, this.e, ni0Var, ni0Var, this.d, xa0Var, true), 2, 1, n30.b(0, 0, 0, 0, 15)).f;
            float f4 = y9Var.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i2) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = m30.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = m30.j(j);
        }
        return n30.a(m30.k(j), m30.i(j), iJ, m30.h(j));
    }
}
