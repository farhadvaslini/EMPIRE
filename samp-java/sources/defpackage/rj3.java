package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rj3 {
    public final long a;
    public final long b;
    public final boolean c;

    public rj3(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final rj3 a(rj3 rj3Var) {
        return new rj3(gy1.e(this.a, rj3Var.a), Math.max(this.b, rj3Var.b), this.c || rj3Var.c);
    }
}
