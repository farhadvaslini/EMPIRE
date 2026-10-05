package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q43 {
    public final ns0 a;
    public final mm0 b;

    public q43(ns0 ns0Var, mm0 mm0Var) {
        this.a = ns0Var;
        this.b = mm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q43)) {
            return false;
        }
        q43 q43Var = (q43) obj;
        return s51.n(this.a, q43Var.a) && s51.n(this.b, q43Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ")";
    }
}
