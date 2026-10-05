package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lp extends q40 {
    public /* synthetic */ Object i;
    public final /* synthetic */ np j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lp(np npVar, q40 q40Var) {
        super(q40Var);
        this.j = npVar;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objH = np.H(this.j, this);
        return objH == y50.f ? objH : new vs(objH);
    }
}
