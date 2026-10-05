package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cx2 extends q40 {
    public /* synthetic */ Object i;
    public int j;
    public final /* synthetic */ zx2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx2(zx2 zx2Var, p40 p40Var) {
        super(p40Var);
        this.k = zx2Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
