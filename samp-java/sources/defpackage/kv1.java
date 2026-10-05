package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kv1 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public kv1(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kv1.class == obj.getClass()) {
            kv1 kv1Var = (kv1) obj;
            return this.c == kv1Var.c && this.d == kv1Var.d && this.b == kv1Var.b && this.a == kv1Var.a && this.e == kv1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + nc2.b(this.a, nc2.a(nc2.a(Float.hashCode(this.c) * 31, this.d, 31), this.b, 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
