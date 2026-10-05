package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tm implements g5 {
    public final float a;

    public tm(float f) {
        this.a = f;
    }

    @Override // defpackage.g5
    public final int a(int i, int i2, bb1 bb1Var) {
        float f = (i2 - i) / 2.0f;
        bb1 bb1Var2 = bb1.f;
        float f2 = this.a;
        if (bb1Var != bb1Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm) && Float.compare(this.a, ((tm) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
