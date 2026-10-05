package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class op3 {
    public final Object a;

    public op3() {
        this.a = new ol1();
    }

    public long a(long j) {
        ol1 ol1Var = (ol1) this.a;
        ol1Var.getClass();
        if (lp3.b(j) <= 0.0f || lp3.c(j) <= 0.0f) {
            m21.c("maximumVelocity should be a positive value. You specified=".concat(lp3.g(j)));
        }
        return d32.h(ol1Var.a.c(lp3.b(j)), ol1Var.b.c(lp3.c(j)));
    }

    public /* synthetic */ op3(Object obj) {
        this.a = obj;
    }
}
