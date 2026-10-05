package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wh3 {
    public final or1 a;
    public vh3 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public wh3() {
        or1 or1Var = h41.a;
        this.a = new or1();
        this.c = -1L;
        this.d = 0L;
        this.e = 0L;
    }

    public final void a(vh3 vh3Var, long j, long j2, float[] fArr, long j3) {
        long j4 = vh3Var.g;
        if (j3 - j4 > 0 || j4 == Long.MIN_VALUE) {
            vh3Var.g = j3;
            vh3Var.a(vh3Var.e, vh3Var.f, j, j2, fArr);
        }
    }

    public final boolean b(long j, long j2, float[] fArr, int i, int i2) {
        boolean z;
        if (i41.a(j2, this.d)) {
            z = false;
        } else {
            this.d = j2;
            z = true;
        }
        if (!i41.a(j, this.e)) {
            this.e = j;
            z = true;
        }
        if (fArr != null) {
            this.g = fArr;
            z = true;
        }
        long j3 = (((long) i) << 32) | (((long) i2) & 4294967295L);
        if (j3 == this.f) {
            return z;
        }
        this.f = j3;
        return true;
    }
}
