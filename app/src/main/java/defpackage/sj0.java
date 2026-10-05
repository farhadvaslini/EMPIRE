package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sj0 extends tj0 {
    public final ei3 h;

    public sj0(long j, ei3 ei3Var) {
        super(j);
        this.h = ei3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.run();
    }

    @Override // defpackage.tj0
    public final String toString() {
        return super.toString() + this.h;
    }
}
