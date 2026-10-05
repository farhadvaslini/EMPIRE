package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t72 extends q40 {
    public /* synthetic */ Object i;
    public final /* synthetic */ v72 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t72(v72 v72Var, q40 q40Var) {
        super(q40Var);
        this.j = v72Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objC = this.j.c(null, false, null, this);
        return objC == y50.f ? objC : new rn2(objC);
    }
}
