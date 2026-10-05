package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xa0 implements ua0 {
    public final float f;
    public final float g;

    public xa0(float f, float f2) {
        this.f = f;
        this.g = f2;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        return Float.compare(this.f, xa0Var.f) == 0 && Float.compare(this.g, xa0Var.g) == 0;
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + (Float.hashCode(this.f) * 31);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.f + ", fontScale=" + this.g + ")";
    }
}
