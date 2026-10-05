package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k52 implements l50 {
    public final float a;

    public k52(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            p21.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // defpackage.l50
    public final float a(long j, ua0 ua0Var) {
        return (this.a / 100.0f) * h43.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k52) && Float.compare(this.a, ((k52) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
