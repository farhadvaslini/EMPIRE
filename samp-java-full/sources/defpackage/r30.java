package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r30 {
    public final int a;
    public final long b;
    public final s30 c;
    public final op3 d;

    public r30(int i, long j, s30 s30Var, op3 op3Var) {
        this.a = i;
        this.b = j;
        this.c = s30Var;
        this.d = op3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return this.a == r30Var.a && this.b == r30Var.b && this.c == r30Var.c && s51.n(this.d, r30Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + nc2.c(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        op3 op3Var = this.d;
        return iHashCode + (op3Var == null ? 0 : op3Var.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
