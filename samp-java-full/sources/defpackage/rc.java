package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rc extends mb3 implements rs0 {
    public int j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ tc l;
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(boolean z, tc tcVar, long j, p40 p40Var) {
        super(2, p40Var);
        this.k = z;
        this.l = tcVar;
        this.m = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((rc) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new rc(this.k, this.l, this.m, p40Var);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            gw1 gw1Var = this.l.f;
            y50 y50Var = y50.f;
            if (this.k) {
                this.j = 2;
                Object objA = gw1Var.a(this.m, 0L, this);
                if (objA != y50Var) {
                    obj = objA;
                    ((lp3) obj).getClass();
                }
            } else {
                this.j = 1;
                Object objA2 = gw1Var.a(0L, this.m, this);
                if (objA2 != y50Var) {
                    obj = objA2;
                    ((lp3) obj).getClass();
                }
            }
            return y50Var;
        }
        if (i == 1) {
            y02.Q(obj);
            ((lp3) obj).getClass();
        } else {
            if (i != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(obj);
            ((lp3) obj).getClass();
        }
        return dm3.a;
    }
}
