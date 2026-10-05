package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dx2 extends q40 {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ ex2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx2(ex2 ex2Var, p40 p40Var) {
        super(p40Var);
        this.k = ex2Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.k(null, this);
    }
}
