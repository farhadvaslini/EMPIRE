package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y42 extends e52 {
    public final float c;
    public final float d;

    public y42(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y42)) {
            return false;
        }
        y42 y42Var = (y42) obj;
        return Float.compare(this.c, y42Var.c) == 0 && Float.compare(this.d, y42Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
