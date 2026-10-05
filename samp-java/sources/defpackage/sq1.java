package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sq1 {
    public final long a;
    public final long b;
    public final boolean c;

    public sq1(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final sq1 a(sq1 sq1Var) {
        return new sq1(gy1.e(this.a, sq1Var.a), Math.max(this.b, sq1Var.b), this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq1)) {
            return false;
        }
        sq1 sq1Var = (sq1) obj;
        return gy1.b(this.a, sq1Var.a) && this.b == sq1Var.b && this.c == sq1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nc2.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + gy1.g(this.a) + ", timeMillis=" + this.b + ", shouldApplyImmediately=" + this.c + ")";
    }
}
