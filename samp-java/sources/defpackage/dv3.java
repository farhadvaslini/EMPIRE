package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dv3 implements fv3 {
    public final int a;
    public final int b;

    public dv3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv3)) {
            return false;
        }
        dv3 dv3Var = (dv3) obj;
        return this.a == dv3Var.a && this.b == dv3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nc2.h("Invalid(foundDirs=", this.a, ", foundFiles=", this.b, ")");
    }
}
