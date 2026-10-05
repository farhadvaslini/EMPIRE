package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class te extends ue {
    public float a;
    public float b;
    public float c;
    public float d;

    public te(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ue
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.d;
    }

    @Override // defpackage.ue
    public final int b() {
        return 4;
    }

    @Override // defpackage.ue
    public final ue c() {
        return new te(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // defpackage.ue
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // defpackage.ue
    public final void e(float f, int i) {
        if (i == 0) {
            this.a = f;
            return;
        }
        if (i == 1) {
            this.b = f;
        } else if (i == 2) {
            this.c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.d = f;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return teVar.a == this.a && teVar.b == this.b && teVar.c == this.c && teVar.d == this.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        float f = this.a;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = this.d;
        StringBuilder sbK = nc2.k("AnimationVector4D: v1 = ", f, ", v2 = ", f2, ", v3 = ");
        sbK.append(f3);
        sbK.append(", v4 = ");
        sbK.append(f4);
        return sbK.toString();
    }
}
