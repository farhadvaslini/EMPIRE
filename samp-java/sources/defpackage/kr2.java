package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kr2 {
    public final float a;
    public final long b;
    public final mm0 c;

    public kr2(float f, long j, mm0 mm0Var) {
        this.a = f;
        this.b = j;
        this.c = mm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr2)) {
            return false;
        }
        kr2 kr2Var = (kr2) obj;
        return Float.compare(this.a, kr2Var.a) == 0 && wj3.a(this.b, kr2Var.b) && s51.n(this.c, kr2Var.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = wj3.c;
        return this.c.hashCode() + nc2.c(this.b, iHashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + wj3.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
