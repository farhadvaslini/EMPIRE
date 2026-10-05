package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class o93 implements n93 {
    public final bk f = new bk(0);

    public final boolean e(int i) {
        return (this.f.get() & i) != 0;
    }

    public final void f(int i) {
        bk bkVar;
        int i2;
        do {
            bkVar = this.f;
            i2 = bkVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!bkVar.compareAndSet(i2, i2 | i));
    }
}
