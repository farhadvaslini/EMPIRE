package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s80 implements rm0 {
    public h80 a;
    public final ub0 b;

    public s80(h80 h80Var) {
        ub0 ub0Var = ks2.b;
        this.a = h80Var;
        this.b = ub0Var;
    }

    @Override // defpackage.rm0
    public final Object a(ts2 ts2Var, float f, p40 p40Var) {
        return cl3.G(this.b, new r80(f, this, ts2Var, null), p40Var);
    }
}
