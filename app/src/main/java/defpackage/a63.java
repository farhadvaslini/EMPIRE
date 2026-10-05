package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a63 {
    public final String a;
    public final r53 b;

    public a63(String str, r53 r53Var) {
        this.a = str;
        this.b = r53Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a63.class != obj.getClass()) {
            return false;
        }
        a63 a63Var = (a63) obj;
        return s51.n(this.a, a63Var.a) && this.b == a63Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + by1.b(this.a.hashCode() * 961, 31, false);
    }
}
