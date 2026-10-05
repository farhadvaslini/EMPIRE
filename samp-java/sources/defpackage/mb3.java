package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class mb3 extends q40 implements bt0 {
    public final int i;

    public mb3(int i, p40 p40Var) {
        super(p40Var);
        this.i = i;
    }

    @Override // defpackage.bt0
    public final int c() {
        return this.i;
    }

    @Override // defpackage.ml
    public final String toString() {
        if (this.f != null) {
            return super.toString();
        }
        rk2.a.getClass();
        return sk2.a(this);
    }
}
