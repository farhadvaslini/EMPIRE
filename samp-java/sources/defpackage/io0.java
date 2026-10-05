package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class io0 {
    public final int a;
    public final lo0 b;
    public final long c;
    public final int d;
    public final int e;

    public io0(int i, lo0 lo0Var, long j, int i2, int i3) {
        this.a = i;
        this.b = lo0Var;
        this.c = j;
        this.d = i2;
        this.e = i3;
    }

    public final vp a(ho0 ho0Var, boolean z, int i, int i2, int i3, int i4) {
        if (!ho0Var.b) {
            return null;
        }
        this.b.getClass();
        return null;
    }

    public final ho0 b(boolean z, int i, long j, d41 d41Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (d41Var == null) {
            return new ho0(true, true);
        }
        long j2 = d41Var.a;
        this.b.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new ho0(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new ho0(true, true) : new ho0(true, b(z, 0, d41.a(m30.i(this.c), (((int) (j & 4294967295L)) - this.e) - i4), new d41(d41.a(((int) (j2 >> 32)) - this.d, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new ho0(false, false);
    }
}
