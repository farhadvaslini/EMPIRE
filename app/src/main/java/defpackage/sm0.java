package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sm0 {
    public final float a;
    public final float b;
    public final long c;

    public sm0(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm0)) {
            return false;
        }
        sm0 sm0Var = (sm0) obj;
        return Float.compare(this.a, sm0Var.a) == 0 && Float.compare(this.b, sm0Var.b) == 0 && this.c == sm0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + nc2.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbK = nc2.k("FlingInfo(initialVelocity=", this.a, ", distance=", this.b, ", duration=");
        sbK.append(this.c);
        sbK.append(")");
        return sbK.toString();
    }
}
