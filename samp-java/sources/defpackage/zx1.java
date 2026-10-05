package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zx1 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public zx1(float f, float f2, float f3, float f4, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        return this.a == zx1Var.a && this.b == zx1Var.b && Float.compare(this.c, zx1Var.c) == 0 && Float.compare(this.d, zx1Var.d) == 0 && Float.compare(this.e, zx1Var.e) == 0 && Float.compare(this.f, zx1Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + nc2.a(nc2.a(nc2.a(nc2.b(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("ObjectInfo(id=", this.a, ", modelId=", this.b, ", distance=");
        nc2.v(sbL, this.c, ", positionX=", this.d, ", positionY=");
        sbL.append(this.e);
        sbL.append(", positionZ=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
