package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r5 extends mb3 implements ts0 {
    public int j;
    public /* synthetic */ a6 k;
    public /* synthetic */ fm1 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d6 n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(d6 d6Var, float f, p40 p40Var) {
        super(4, p40Var);
        this.n = d6Var;
        this.o = f;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        r5 r5Var = new r5(this.n, this.o, (p40) obj4);
        r5Var.k = (a6) obj;
        r5Var.l = (fm1) obj2;
        r5Var.m = obj3;
        return r5Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            a6 a6Var = this.k;
            float fD = this.l.d(this.m);
            if (!Float.isNaN(fD)) {
                nk2 nk2Var = new nk2();
                d6 d6Var = this.n;
                float fG = Float.isNaN(d6Var.j.g()) ? 0.0f : d6Var.j.g();
                nk2Var.f = fG;
                oe oeVar = ((s33) d6Var.c.g).b;
                q5 q5Var = new q5(a6Var, nk2Var, 0);
                this.k = null;
                this.l = null;
                this.j = 1;
                Object objK = t22.k(fG, fD, this.o, oeVar, q5Var, this);
                y50 y50Var = y50.f;
                if (objK == y50Var) {
                    return y50Var;
                }
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
