package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class z53 {
    public final a63 a;
    public final jr b;

    public z53(a63 a63Var, jr jrVar) {
        this.a = a63Var;
        this.b = jrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z53.class == obj.getClass()) {
            z53 z53Var = (z53) obj;
            return s51.n(this.a, z53Var.a) && this.b == z53Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
