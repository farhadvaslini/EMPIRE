package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class qj0 extends q50 {
    public static final /* synthetic */ int k = 0;
    public long h;
    public boolean i;
    public mj j;

    public final void F(boolean z) {
        long j = this.h - (z ? 4294967296L : 1L);
        this.h = j;
        if (j <= 0 && this.i) {
            shutdown();
        }
    }

    public final void G(yb0 yb0Var) {
        mj mjVar = this.j;
        if (mjVar == null) {
            mjVar = new mj();
            this.j = mjVar;
        }
        mjVar.addLast(yb0Var);
    }

    public final void H(boolean z) {
        this.h = (z ? 4294967296L : 1L) + this.h;
        if (z) {
            return;
        }
        this.i = true;
    }

    public abstract long I();

    public final boolean J() {
        mj mjVar = this.j;
        if (mjVar == null) {
            return false;
        }
        yb0 yb0Var = (yb0) (mjVar.isEmpty() ? null : mjVar.removeFirst());
        if (yb0Var == null) {
            return false;
        }
        yb0Var.run();
        return true;
    }

    public abstract void shutdown();
}
