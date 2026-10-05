package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qu extends q40 {
    public /* synthetic */ Object i;
    public final /* synthetic */ tu j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(tu tuVar, q40 q40Var) {
        super(q40Var);
        this.j = tuVar;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        Object objB = this.j.b(null, this);
        return objB == y50.f ? objB : new rn2(objB);
    }
}
