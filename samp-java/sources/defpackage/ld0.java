package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ld0 {
    public final long a;

    public static String a(long j) {
        return j != 9205357640488583168L ? by1.i("(", jd0.c(Float.intBitsToFloat((int) (j >> 32))), ", ", jd0.c(Float.intBitsToFloat((int) (j & 4294967295L))), ")") : "DpOffset.Unspecified";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ld0) {
            return this.a == ((ld0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
