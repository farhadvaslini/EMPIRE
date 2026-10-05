package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gp3 {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final String i;

    public gp3(int i, int i2, float f, float f2, float f3, float f4, float f5, boolean z, String str) {
        str.getClass();
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = z;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gp3)) {
            return false;
        }
        gp3 gp3Var = (gp3) obj;
        return this.a == gp3Var.a && this.b == gp3Var.b && Float.compare(this.c, gp3Var.c) == 0 && Float.compare(this.d, gp3Var.d) == 0 && Float.compare(this.e, gp3Var.e) == 0 && Float.compare(this.f, gp3Var.f) == 0 && Float.compare(this.g, gp3Var.g) == 0 && this.h == gp3Var.h && s51.n(this.i, gp3Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + by1.b(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.b(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("VehicleInfo(id=", this.a, ", modelId=", this.b, ", distance=");
        nc2.v(sbL, this.c, ", positionX=", this.d, ", positionY=");
        nc2.v(sbL, this.e, ", positionZ=", this.f, ", health=");
        sbL.append(this.g);
        sbL.append(", occupied=");
        sbL.append(this.h);
        sbL.append(", driverName=");
        return nc2.j(sbL, this.i, ")");
    }
}
