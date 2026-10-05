package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n61 extends jr {
    public final q61 p;

    public n61(p40 p40Var, q61 q61Var) {
        super(1, p40Var);
        this.p = q61Var;
    }

    @Override // defpackage.jr
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // defpackage.jr
    public final Throwable o(q61 q61Var) {
        Throwable thE;
        Object objS = this.p.S();
        return (!(objS instanceof p61) || (thE = ((p61) objS).e()) == null) ? objS instanceof jz ? ((jz) objS).a : q61Var.o() : thE;
    }
}
