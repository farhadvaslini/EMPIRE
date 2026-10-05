package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class u51 extends q40 {
    public int i;
    public final /* synthetic */ rs0 j;
    public final /* synthetic */ p40 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u51(p40 p40Var, o50 o50Var, rs0 rs0Var, p40 p40Var2) {
        super(p40Var, o50Var);
        this.j = rs0Var;
        this.k = p40Var2;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.i;
        if (i != 0) {
            if (i != 1) {
                c.q("This coroutine had already completed");
                return null;
            }
            this.i = 2;
            y02.Q(obj);
            return obj;
        }
        this.i = 1;
        y02.Q(obj);
        rs0 rs0Var = this.j;
        rs0Var.getClass();
        cl3.i(2, rs0Var);
        return rs0Var.f(this.k, this);
    }
}
