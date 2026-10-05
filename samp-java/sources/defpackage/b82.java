package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class b82 implements c82 {
    public final ai1 a;
    public final Long b;
    public final boolean c;

    public b82(ai1 ai1Var, Long l, boolean z) {
        this.a = ai1Var;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b82)) {
            return false;
        }
        b82 b82Var = (b82) obj;
        return this.a.equals(b82Var.a) && s51.n(this.b, b82Var.b) && this.c == b82Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "Ready(plugins=" + this.a + ", cachedAtMillis=" + this.b + ", offline=" + this.c + ")";
    }
}
