package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o61 extends m61 {
    public final q61 m;
    public final p61 n;
    public final nt o;
    public final Object p;

    public o61(q61 q61Var, p61 p61Var, nt ntVar, Object obj) {
        this.m = q61Var;
        this.n = p61Var;
        this.o = ntVar;
        this.p = obj;
    }

    @Override // defpackage.m61
    public final boolean r() {
        return false;
    }

    @Override // defpackage.m61
    public final void s(Throwable th) {
        nt ntVar = this.o;
        nt ntVarB0 = q61.b0(ntVar);
        q61 q61Var = this.m;
        p61 p61Var = this.n;
        Object obj = this.p;
        if (ntVarB0 == null || !q61Var.o0(p61Var, ntVarB0, obj)) {
            p61Var.f.e(new bi1(2), 2);
            nt ntVarB02 = q61.b0(ntVar);
            if (ntVarB02 == null || !q61Var.o0(p61Var, ntVarB02, obj)) {
                q61Var.w(q61Var.M(p61Var, obj));
            }
        }
    }
}
