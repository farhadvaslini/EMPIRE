package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ku2 {
    public final fx0 a;
    public final long b;
    public final ju2 c;
    public final boolean d;

    public ku2(fx0 fx0Var, long j, ju2 ju2Var, boolean z) {
        this.a = fx0Var;
        this.b = j;
        this.c = ju2Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku2)) {
            return false;
        }
        ku2 ku2Var = (ku2) obj;
        return this.a == ku2Var.a && gy1.b(this.b, ku2Var.b) && this.c == ku2Var.c && this.d == ku2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + nc2.c(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + gy1.g(this.b) + ", anchor=" + this.c + ", visible=" + this.d + ")";
    }
}
