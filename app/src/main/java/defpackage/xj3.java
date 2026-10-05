package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xj3 {
    public final af a;
    public final iy1 b;

    public xj3(af afVar, iy1 iy1Var) {
        this.a = afVar;
        this.b = iy1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj3)) {
            return false;
        }
        xj3 xj3Var = (xj3) obj;
        return s51.n(this.a, xj3Var.a) && this.b.equals(xj3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
