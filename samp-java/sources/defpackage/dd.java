package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dd extends mb3 implements ns0 {
    public final /* synthetic */ ed j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd(ed edVar, Object obj, p40 p40Var) {
        super(1, p40Var);
        this.j = edVar;
        this.k = obj;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        dd ddVar = new dd(this.j, this.k, (p40) obj);
        dm3 dm3Var = dm3.a;
        ddVar.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y02.Q(obj);
        ed edVar = this.j;
        ed.b(edVar);
        Object objA = ed.a(edVar, this.k);
        edVar.c.g.setValue(objA);
        edVar.e.setValue(objA);
        return dm3.a;
    }
}
