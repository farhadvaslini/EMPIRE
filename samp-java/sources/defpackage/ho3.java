package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ho3 implements m50 {
    public final ho3 f;
    public final b80 g;

    public ho3(ho3 ho3Var, b80 b80Var) {
        this.f = ho3Var;
        this.g = b80Var;
    }

    public final void a(b80 b80Var) {
        if (this.g == b80Var) {
            c.q("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        ho3 ho3Var = this.f;
        if (ho3Var != null) {
            ho3Var.a(b80Var);
        }
    }

    @Override // defpackage.m50
    public final n50 getKey() {
        return m22.A;
    }

    @Override // defpackage.o50
    public final /* bridge */ o50 k(o50 o50Var) {
        return pq.Q(this, o50Var);
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
