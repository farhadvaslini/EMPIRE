package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ya0 implements ua0 {
    public final float f;
    public final float g;
    public final sq0 h;

    public ya0(float f, float f2, sq0 sq0Var) {
        this.f = f;
        this.g = f2;
        this.h = sq0Var;
    }

    @Override // defpackage.ua0
    public final float G() {
        return this.g;
    }

    @Override // defpackage.ua0
    public final long Q(float f) {
        return oz2.D(this.h.a(f), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya0)) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        return Float.compare(this.f, ya0Var.f) == 0 && Float.compare(this.g, ya0Var.g) == 0 && this.h.equals(ya0Var.h);
    }

    @Override // defpackage.ua0
    public final float h() {
        return this.f;
    }

    public final int hashCode() {
        return this.h.hashCode() + nc2.a(Float.hashCode(this.f) * 31, this.g, 31);
    }

    @Override // defpackage.ua0
    public final float j0(long j) {
        if (kh3.a(jh3.b(j), 4294967296L)) {
            return this.h.b(jh3.c(j));
        }
        c.q("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        StringBuilder sbK = nc2.k("DensityWithConverter(density=", this.f, ", fontScale=", this.g, ", converter=");
        sbK.append(this.h);
        sbK.append(")");
        return sbK.toString();
    }
}
