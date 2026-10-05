package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ei3 extends sr2 implements Runnable {
    public final long l;

    public ei3(long j, q40 q40Var) {
        super(q40Var, q40Var.i());
        this.l = j;
    }

    @Override // defpackage.q61
    public final String a0() {
        return super.a0() + "(timeMillis=" + this.l + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        o50 o50Var = this.j;
        ur.D(o50Var);
        if (o50Var.m(t50.g) != null) {
            qn1.b();
            return;
        }
        F(new di3("Timed out waiting for " + this.l + " ms", this));
    }
}
