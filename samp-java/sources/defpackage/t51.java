package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t51 extends on2 {
    public int g;
    public final /* synthetic */ rs0 h;
    public final /* synthetic */ p40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t51(p40 p40Var, p40 p40Var2, rs0 rs0Var) {
        super(p40Var);
        this.h = rs0Var;
        this.i = p40Var2;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.g;
        if (i != 0) {
            if (i != 1) {
                c.q("This coroutine had already completed");
                return null;
            }
            this.g = 2;
            y02.Q(obj);
            return obj;
        }
        this.g = 1;
        y02.Q(obj);
        rs0 rs0Var = this.h;
        rs0Var.getClass();
        cl3.i(2, rs0Var);
        return rs0Var.f(this.i, this);
    }
}
