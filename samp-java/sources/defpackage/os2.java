package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class os2 extends mb3 implements rs0 {
    public /* synthetic */ Object j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os2(long j, p40 p40Var) {
        super(2, p40Var);
        this.k = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        os2 os2Var = (os2) m((p40) obj2, (us2) obj);
        dm3 dm3Var = dm3.a;
        os2Var.o(dm3Var);
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        os2 os2Var = new os2(this.k, p40Var);
        os2Var.j = obj;
        return os2Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        y02.Q(obj);
        ws2 ws2Var = ((us2) this.j).a;
        ws2Var.d(ws2Var.k, this.k, 1);
        return dm3.a;
    }
}
