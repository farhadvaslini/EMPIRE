package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yv2 {
    public final kq2 a;
    public final wy2 b;

    public yv2(kq2 kq2Var, wy2 wy2Var) {
        this.a = kq2Var;
        this.b = wy2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv2)) {
            return false;
        }
        yv2 yv2Var = (yv2) obj;
        return this.a.equals(yv2Var.a) && this.b.equals(yv2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerListItemUiState(server=" + this.a + ", status=" + this.b + ")";
    }
}
