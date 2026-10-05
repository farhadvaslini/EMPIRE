package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class am2 extends q40 {
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a31 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am2(a31 a31Var, q40 q40Var) {
        super(q40Var);
        this.k = a31Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object objQ = this.k.q(null, this);
        return objQ == y50.f ? objQ : new rn2(objQ);
    }
}
