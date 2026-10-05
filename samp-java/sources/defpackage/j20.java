package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j20 implements p02, m50 {
    public static final zj g = new zj(11);
    public final nv0 f;

    public j20(nv0 nv0Var) {
        this.f = nv0Var;
    }

    @Override // defpackage.p02
    public final List g(Integer num) {
        return this.f.H();
    }

    @Override // defpackage.m50
    public final n50 getKey() {
        return g;
    }

    @Override // defpackage.o50
    public final /* bridge */ o50 k(o50 o50Var) {
        return pq.Q(this, o50Var);
    }

    @Override // defpackage.p02
    public final boolean l() {
        return this.f.C;
    }

    @Override // defpackage.o50
    public final /* bridge */ m50 m(n50 n50Var) {
        return pq.t(this, n50Var);
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.o50
    public final /* bridge */ o50 u(n50 n50Var) {
        return pq.M(this, n50Var);
    }
}
