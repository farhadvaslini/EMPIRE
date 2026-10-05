package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ed0 implements hd0 {
    public final bm2 a;
    public final cd0 b;

    public ed0(bm2 bm2Var, cd0 cd0Var) {
        bm2Var.getClass();
        this.a = bm2Var;
        this.b = cd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed0)) {
            return false;
        }
        ed0 ed0Var = (ed0) obj;
        return s51.n(this.a, ed0Var.a) && this.b.equals(ed0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Downloading(source=" + this.a + ", progress=" + this.b + ")";
    }
}
