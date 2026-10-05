package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r33 extends mb3 implements ts0 {
    public int j;
    public /* synthetic */ a6 k;
    public /* synthetic */ fm1 l;
    public /* synthetic */ t33 m;
    public final /* synthetic */ s33 n;
    public final /* synthetic */ float o;
    public final /* synthetic */ mm0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r33(s33 s33Var, float f, mm0 mm0Var, p40 p40Var) {
        super(4, p40Var);
        this.n = s33Var;
        this.o = f;
        this.p = mm0Var;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.o;
        mm0 mm0Var = this.p;
        r33 r33Var = new r33(this.n, f, mm0Var, (p40) obj4);
        r33Var.k = (a6) obj;
        r33Var.l = (fm1) obj2;
        r33Var.m = (t33) obj3;
        return r33Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        int i2 = 1;
        if (i == 0) {
            y02.Q(obj);
            a6 a6Var = this.k;
            float fD = this.l.d(this.m);
            if (!Float.isNaN(fD)) {
                nk2 nk2Var = new nk2();
                s33 s33Var = this.n;
                float fG = Float.isNaN(s33Var.c.j.g()) ? 0.0f : s33Var.c.j.g();
                nk2Var.f = fG;
                q5 q5Var = new q5(a6Var, nk2Var, i2);
                this.k = null;
                this.l = null;
                this.j = 1;
                Object objK = t22.k(fG, fD, this.o, this.p, q5Var, this);
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
