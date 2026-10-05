package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qe extends ue {
    public float a;

    public qe(float f) {
        this.a = f;
    }

    @Override // defpackage.ue
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.ue
    public final int b() {
        return 1;
    }

    @Override // defpackage.ue
    public final ue c() {
        return new qe(0.0f);
    }

    @Override // defpackage.ue
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.ue
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qe) && ((qe) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
