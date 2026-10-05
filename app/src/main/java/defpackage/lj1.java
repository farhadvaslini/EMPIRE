package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lj1 {
    public final float a;
    public final float b;
    public final boolean c;

    public lj1(float f, float f2, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj1)) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        return Float.compare(this.a, lj1Var.a) == 0 && Float.compare(this.b, lj1Var.b) == 0 && this.c == lj1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nc2.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbK = nc2.k("LocalPlayerState(health=", this.a, ", armour=", this.b, ", isDead=");
        sbK.append(this.c);
        sbK.append(")");
        return sbK.toString();
    }

    public /* synthetic */ lj1() {
        this(100.0f, 0.0f, false);
    }
}
