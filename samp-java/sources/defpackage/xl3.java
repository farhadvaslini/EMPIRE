package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xl3 extends sr2 {
    public final ThreadLocal l;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public xl3(p40 p40Var, o50 o50Var) {
        or orVar = or.h;
        super(p40Var, o50Var.m(orVar) == null ? o50Var.k(orVar) : o50Var);
        this.l = new ThreadLocal();
        if (p40Var.i().m(f5.L) instanceof q50) {
            return;
        }
        Object objF = cl3.F(o50Var, null);
        cl3.A(o50Var, objF);
        v0(o50Var, objF);
    }

    @Override // defpackage.sr2, defpackage.q61
    public final void A(Object obj) {
        u0();
        Object objR = vp.R(obj);
        p40 p40Var = this.k;
        o50 o50VarI = p40Var.i();
        Object objF = cl3.F(o50VarI, null);
        xl3 xl3VarP = objF != cl3.v0 ? uq.P(p40Var, o50VarI, objF) : null;
        try {
            p40Var.t(objR);
            if (xl3VarP == null || xl3VarP.t0()) {
                cl3.A(o50VarI, objF);
            }
        } catch (Throwable th) {
            if (xl3VarP == null || xl3VarP.t0()) {
                cl3.A(o50VarI, objF);
            }
            throw th;
        }
    }

    @Override // defpackage.sr2
    public final void s0() {
        u0();
    }

    public final boolean t0() {
        boolean z = this.threadLocalIsSet && this.l.get() == null;
        this.l.remove();
        return !z;
    }

    public final void u0() {
        if (this.threadLocalIsSet) {
            r32 r32Var = (r32) this.l.get();
            if (r32Var != null) {
                cl3.A((o50) r32Var.f, r32Var.g);
            }
            this.l.remove();
        }
    }

    public final void v0(o50 o50Var, Object obj) {
        this.threadLocalIsSet = true;
        this.l.set(new r32(o50Var, obj));
    }
}
