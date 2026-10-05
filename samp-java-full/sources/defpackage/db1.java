package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class db1 {
    public final int a;
    public final int b;
    public final boolean c;

    public db1(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        return this.a == db1Var.a && this.b == db1Var.b && this.c == db1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nc2.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("BidiRun(start=", this.a, ", end=", this.b, ", isRtl=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
