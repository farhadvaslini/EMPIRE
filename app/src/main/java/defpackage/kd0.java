package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kd0 implements l50 {
    public final float a;

    public kd0(float f) {
        this.a = f;
    }

    @Override // defpackage.l50
    public final float a(long j, ua0 ua0Var) {
        return ua0Var.T(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kd0) && jd0.b(this.a, ((kd0) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
