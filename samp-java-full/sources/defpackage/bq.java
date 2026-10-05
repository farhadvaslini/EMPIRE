package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bq {
    public final float a;

    public bq(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof bq)) {
            return false;
        }
        return jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f) && jd0.b(this.a, ((bq) obj).a) && jd0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + nc2.a(nc2.a(nc2.a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31), this.a, 31);
    }
}
