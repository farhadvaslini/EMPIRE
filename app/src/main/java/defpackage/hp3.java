package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hp3 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final Float d;

    public hp3(boolean z, int i, boolean z2, Float f) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp3)) {
            return false;
        }
        hp3 hp3Var = (hp3) obj;
        return this.a == hp3Var.a && this.b == hp3Var.b && this.c == hp3Var.c && s51.n(this.d, hp3Var.d);
    }

    public final int hashCode() {
        int iB = by1.b(nc2.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
        Float f = this.d;
        return iB + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "VehicleState(isInVehicle=" + this.a + ", vehicleId=" + this.b + ", isPassenger=" + this.c + ", health=" + this.d + ")";
    }

    public /* synthetic */ hp3() {
        this(false, -1, false, null);
    }
}
