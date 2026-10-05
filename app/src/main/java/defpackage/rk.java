package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rk {
    public final float a;
    public final float b;
    public final float c;
    public final int d;
    public final long e;

    public rk(kv1 kv1Var) {
        kv1Var.getClass();
        float f = kv1Var.c;
        float f2 = kv1Var.d;
        float f3 = kv1Var.b;
        int i = kv1Var.a;
        long j = kv1Var.e;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = i;
        this.e = j;
    }

    public final String toString() {
        return "BackEventCompat(touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + ", frameTimeMillis=" + this.e + ')';
    }
}
