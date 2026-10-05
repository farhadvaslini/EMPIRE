package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ga3 extends rf0 {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public ga3(float f, float f2, int i, int i2, ea eaVar, int i3) {
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga3)) {
            return false;
        }
        ga3 ga3Var = (ga3) obj;
        return this.a == ga3Var.a && this.b == ga3Var.b && this.c == ga3Var.c && this.d == ga3Var.d && s51.n(null, null);
    }

    public final int hashCode() {
        return nc2.b(this.d, nc2.b(this.c, nc2.a(Float.hashCode(this.a) * 31, this.b, 31), 31), 31) + 0;
    }

    public final String toString() {
        String str = "Unknown";
        int i = this.c;
        String str2 = i == 0 ? "Butt" : i == 1 ? "Round" : i == 2 ? "Square" : "Unknown";
        int i2 = this.d;
        if (i2 == 0) {
            str = "Miter";
        } else if (i2 == 1) {
            str = "Round";
        } else if (i2 == 2) {
            str = "Bevel";
        }
        StringBuilder sbK = nc2.k("Stroke(width=", this.a, ", miter=", this.b, ", cap=");
        nc2.w(sbK, str2, ", join=", str, ", pathEffect=");
        sbK.append((Object) null);
        sbK.append(")");
        return sbK.toString();
    }
}
