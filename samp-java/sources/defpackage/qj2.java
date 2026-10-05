package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qj2 {
    public final sv2 a;
    public final wy2 b;
    public final boolean c;

    public qj2(sv2 sv2Var, wy2 wy2Var, boolean z) {
        this.a = sv2Var;
        this.b = wy2Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj2)) {
            return false;
        }
        qj2 qj2Var = (qj2) obj;
        return this.a.equals(qj2Var.a) && this.b.equals(qj2Var.b) && this.c == qj2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RecommendedServerListItemUiState(address=" + this.a + ", status=" + this.b + ", isAdded=" + this.c + ")";
    }
}
