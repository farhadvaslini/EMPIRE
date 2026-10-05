package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ik1 extends mb3 implements rs0 {
    public int j;
    public final /* synthetic */ ie1 k;
    public final /* synthetic */ os1 l;
    public final /* synthetic */ os1 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ os1 o;
    public final /* synthetic */ b42 p;
    public final /* synthetic */ os1 q;
    public final /* synthetic */ os1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik1(ie1 ie1Var, os1 os1Var, os1 os1Var2, String str, os1 os1Var3, b42 b42Var, os1 os1Var4, os1 os1Var5, p40 p40Var) {
        super(2, p40Var);
        this.k = ie1Var;
        this.l = os1Var;
        this.m = os1Var2;
        this.n = str;
        this.o = os1Var3;
        this.p = b42Var;
        this.q = os1Var4;
        this.r = os1Var5;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((ik1) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new ik1(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, p40Var);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        int i2 = 1;
        if (i == 0) {
            y02.Q(obj);
            ie1 ie1Var = this.k;
            os1 os1Var = this.l;
            qn0 qn0Var = new qn0(3, b32.B(new me1(i2, ie1Var, os1Var)), this.m);
            fk1 fk1Var = new fk1(this.n, this.k, os1Var, this.o, this.p, this.q, this.r);
            this.j = 1;
            Object objA = qn0Var.a(fk1Var, this);
            y50 y50Var = y50.f;
            if (objA == y50Var) {
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
