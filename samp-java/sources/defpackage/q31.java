package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class q31 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public q31(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q31)) {
            return false;
        }
        q31 q31Var = (q31) obj;
        return this.a == q31Var.a && this.b == q31Var.b && this.c == q31Var.c && this.d == q31Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("InsetsValues(left=", this.a, ", top=", this.b, ", right=");
        sbL.append(this.c);
        sbL.append(", bottom=");
        sbL.append(this.d);
        sbL.append(")");
        return sbL.toString();
    }
}
