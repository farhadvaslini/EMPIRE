package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gm3 extends q50 {
    public static final gm3 h = new gm3();

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        j90.i.h.c(runnable, true, false);
    }

    @Override // defpackage.q50
    public final void C(o50 o50Var, Runnable runnable) {
        j90.i.h.c(runnable, true, true);
    }

    @Override // defpackage.q50
    public final q50 E(int i) {
        uq.k(i);
        return i >= kd3.d ? this : super.E(i);
    }

    @Override // defpackage.q50
    public final String toString() {
        return "Dispatchers.IO";
    }
}
