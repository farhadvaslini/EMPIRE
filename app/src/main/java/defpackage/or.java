package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class or implements m50, n50 {
    public static final zj g = new zj(6);
    public static final or h = new or(1);
    public final /* synthetic */ int f;

    public /* synthetic */ or(int i) {
        this.f = i;
    }

    @Override // defpackage.m50
    public final n50 getKey() {
        switch (this.f) {
            case 0:
                return g;
            default:
                return this;
        }
    }

    @Override // defpackage.o50
    public final /* bridge */ o50 k(o50 o50Var) {
        switch (this.f) {
        }
        return pq.Q(this, o50Var);
    }

    @Override // defpackage.o50
    public final /* bridge */ m50 m(n50 n50Var) {
        switch (this.f) {
        }
        return pq.t(this, n50Var);
    }

    @Override // defpackage.o50
    public final Object p(rs0 rs0Var, Object obj) {
        switch (this.f) {
        }
        return rs0Var.f(obj, this);
    }

    @Override // defpackage.o50
    public final /* bridge */ o50 u(n50 n50Var) {
        switch (this.f) {
        }
        return pq.M(this, n50Var);
    }
}
