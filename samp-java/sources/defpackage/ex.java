package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ex implements fx {
    public final float f;
    public final float g;

    public ex(float f, float f2) {
        this.f = f;
        this.g = f2;
    }

    public static boolean c(Float f, Float f2) {
        return f.floatValue() <= f2.floatValue();
    }

    @Override // defpackage.fx
    public final Comparable a() {
        return Float.valueOf(this.f);
    }

    @Override // defpackage.fx
    public final Comparable b() {
        return Float.valueOf(this.g);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ex)) {
            return false;
        }
        if (isEmpty() && ((ex) obj).isEmpty()) {
            return true;
        }
        ex exVar = (ex) obj;
        return this.f == exVar.f && this.g == exVar.g;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Float.hashCode(this.g) + (Float.hashCode(this.f) * 31);
    }

    @Override // defpackage.fx
    public final boolean isEmpty() {
        return this.f > this.g;
    }

    public final String toString() {
        return this.f + ".." + this.g;
    }
}
