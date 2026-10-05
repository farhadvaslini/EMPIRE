package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jd0 implements Comparable {
    public final float f;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f, ((jd0) obj).f);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jd0) {
            return Float.compare(this.f, ((jd0) obj).f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f);
    }

    public final String toString() {
        return c(this.f);
    }
}
