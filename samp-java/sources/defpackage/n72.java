package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n72 {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;

    public n72(int i, String str, int i2, int i3, boolean z, float f, float f2, float f3, float f4, float f5, float f6, int i4) {
        i2 = (i4 & 4) != 0 ? 0 : i2;
        i3 = (i4 & 8) != 0 ? 0 : i3;
        z = (i4 & 16) != 0 ? false : z;
        f = (i4 & 32) != 0 ? 100.0f : f;
        f2 = (i4 & 64) != 0 ? 0.0f : f2;
        f3 = (i4 & 128) != 0 ? 0.0f : f3;
        f4 = (i4 & 256) != 0 ? 0.0f : f4;
        f5 = (i4 & 512) != 0 ? 0.0f : f5;
        f6 = (i4 & 1024) != 0 ? 0.0f : f6;
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n72)) {
            return false;
        }
        n72 n72Var = (n72) obj;
        return this.a == n72Var.a && s51.n(this.b, n72Var.b) && this.c == n72Var.c && this.d == n72Var.d && this.e == n72Var.e && Float.compare(this.f, n72Var.f) == 0 && Float.compare(this.g, n72Var.g) == 0 && Float.compare(this.h, n72Var.h) == 0 && Float.compare(this.i, n72Var.i) == 0 && Float.compare(this.j, n72Var.j) == 0 && Float.compare(this.k, n72Var.k) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.k) + nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(by1.b(nc2.b(this.d, nc2.b(this.c, by1.a(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31), 31, this.e), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerInfo(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", score=");
        sb.append(this.c);
        sb.append(", ping=");
        sb.append(this.d);
        sb.append(", isLocal=");
        sb.append(this.e);
        sb.append(", health=");
        sb.append(this.f);
        sb.append(", armour=");
        nc2.v(sb, this.g, ", distance=", this.h, ", positionX=");
        nc2.v(sb, this.i, ", positionY=", this.j, ", positionZ=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
