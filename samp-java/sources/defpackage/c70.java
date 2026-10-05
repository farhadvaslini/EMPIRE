package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c70 extends mb3 implements ns0 {
    public int j;

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        c70 c70Var = new c70(1, (p40) obj);
        dm3 dm3Var = dm3.a;
        c70Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            this.j = 1;
            throw null;
        }
        if (i == 1) {
            y02.Q(obj);
            return dm3.a;
        }
        c.q("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
