package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k72 {
    public final f72 a;
    public final w62 b;

    public k72(f72 f72Var, w62 w62Var) {
        this.a = f72Var;
        this.b = w62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k72)) {
            return false;
        }
        k72 k72Var = (k72) obj;
        return s51.n(this.b, k72Var.b) && s51.n(this.a, k72Var.a);
    }

    public final int hashCode() {
        f72 f72Var = this.a;
        int iHashCode = (f72Var != null ? f72Var.hashCode() : 0) * 31;
        w62 w62Var = this.b;
        return iHashCode + (w62Var != null ? w62Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ")";
    }
}
