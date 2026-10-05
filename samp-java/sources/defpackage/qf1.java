package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qf1 {
    public ff1 a;
    public mf1 b;

    public final void a(of1 of1Var, ef1 ef1Var) {
        ff1 ff1VarA = ef1Var.a();
        ff1 ff1Var = this.a;
        if (ff1VarA.compareTo(ff1Var) < 0) {
            ff1Var = ff1VarA;
        }
        this.a = ff1Var;
        this.b.i(of1Var, ef1Var);
        this.a = ff1VarA;
    }
}
