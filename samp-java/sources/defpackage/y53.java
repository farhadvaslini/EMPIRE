package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y53 extends mb3 implements rs0 {
    public int j;
    public final /* synthetic */ ed k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ s83 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y53(ed edVar, boolean z, s83 s83Var, p40 p40Var) {
        super(2, p40Var);
        this.k = edVar;
        this.l = z;
        this.m = s83Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((y53) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new y53(this.k, this.l, this.m, p40Var);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            Float f = new Float(this.l ? 1.0f : 0.8f);
            this.j = 1;
            Object objC = ed.c(this.k, f, this.m, null, this, 12);
            y50 y50Var = y50.f;
            if (objC == y50Var) {
                return y50Var;
            }
        } else {
            if (i != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
        }
        return dm3.a;
    }
}
