package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nb0 {
    public final boolean a = true;
    public final boolean b = true;
    public final zs2 c = zs2.f;
    public final boolean d = true;
    public final boolean e = true;
    public final String f = "";
    public final int g = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb0)) {
            return false;
        }
        nb0 nb0Var = (nb0) obj;
        return this.a == nb0Var.a && this.b == nb0Var.b && this.c == nb0Var.c && this.d == nb0Var.d && this.e == nb0Var.e && this.g == nb0Var.g;
    }

    public final int hashCode() {
        return (by1.b(by1.b((this.c.hashCode() + by1.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }
}
