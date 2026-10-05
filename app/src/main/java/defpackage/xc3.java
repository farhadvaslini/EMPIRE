package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xc3 extends pn2 implements rs0 {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ x50 j;
    public final /* synthetic */ xc2 k;
    public final /* synthetic */ ss0 l;
    public final /* synthetic */ ns0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc3(x50 x50Var, xc2 xc2Var, ss0 ss0Var, ns0 ns0Var, p40 p40Var) {
        super(p40Var);
        this.j = x50Var;
        this.k = xc2Var;
        this.l = ss0Var;
        this.m = ns0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((xc3) m((p40) obj2, (rb3) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        xc3 xc3Var = new xc3(this.j, this.k, this.l, this.m, p40Var);
        xc3Var.i = obj;
        return xc3Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.h;
        if (i == 0) {
            y02.Q(obj);
            rb3 rb3Var = (rb3) this.i;
            this.h = 1;
            Object objG = cd3.g(rb3Var, this.j, this.k, this.l, this.m, this);
            y50 y50Var = y50.f;
            if (objG == y50Var) {
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
