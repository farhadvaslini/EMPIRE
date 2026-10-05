package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vt2 {
    public final float a;
    public final float b;

    public vt2(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof vt2)) {
            return false;
        }
        return jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f) && jd0.b(this.a, ((vt2) obj).a) && jd0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + nc2.a(nc2.a(nc2.a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31), this.a, 31);
    }
}
