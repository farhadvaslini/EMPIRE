package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class au2 {
    public final sl2 a;
    public final int b;
    public final long c;

    public au2(sl2 sl2Var, int i, long j) {
        this.a = sl2Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au2)) {
            return false;
        }
        au2 au2Var = (au2) obj;
        return this.a == au2Var.a && this.b == au2Var.b && this.c == au2Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + nc2.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ")";
    }
}
