package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class se extends ue {
    public float a;
    public float b;
    public float c;

    public se(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.ue
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    @Override // defpackage.ue
    public final int b() {
        return 3;
    }

    @Override // defpackage.ue
    public final ue c() {
        return new se(0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.ue
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    @Override // defpackage.ue
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return seVar.a == this.a && seVar.b == this.b && seVar.c == this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nc2.a(Float.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        StringBuilder sbK = nc2.k("AnimationVector3D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbK.append(f3);
        return sbK.toString();
    }
}
