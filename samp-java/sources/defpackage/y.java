package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class y implements m50 {
    public final n50 f;

    public y(n50 n50Var) {
        this.f = n50Var;
    }

    @Override // defpackage.m50
    public final n50 getKey() {
        return this.f;
    }

    @Override // defpackage.o50
    public final /* bridge */ o50 k(o50 o50Var) {
        return pq.Q(this, o50Var);
    }

    @Override // defpackage.o50
    public /* bridge */ m50 m(n50 n50Var) {
        return pq.t(this, n50Var);
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.o50
    public /* bridge */ o50 u(n50 n50Var) {
        return pq.M(this, n50Var);
    }
}
