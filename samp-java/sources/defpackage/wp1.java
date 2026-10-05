package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wp1 {
    public final zs2 a = zs2.f;
    public final boolean b = true;
    public final boolean c = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp1)) {
            return false;
        }
        wp1 wp1Var = (wp1) obj;
        return this.a == wp1Var.a && this.c == wp1Var.c && this.b == wp1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + by1.b(this.a.hashCode() * 31, 29791, this.b);
    }
}
