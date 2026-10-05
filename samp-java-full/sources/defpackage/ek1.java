package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ek1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ os1 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ os1 p;
    public final /* synthetic */ os1 q;
    public final /* synthetic */ b42 r;
    public final /* synthetic */ os1 s;
    public final /* synthetic */ a42 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ek1(os1 os1Var, String str, String str2, String str3, os1 os1Var2, os1 os1Var3, b42 b42Var, os1 os1Var4, a42 a42Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = os1Var;
        this.m = str;
        this.n = str2;
        this.o = str3;
        this.p = os1Var2;
        this.q = os1Var3;
        this.r = b42Var;
        this.s = os1Var4;
        this.t = a42Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((ek1) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new ek1(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, p40Var, 0);
            default:
                return new ek1(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (uq.h(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (uq.h(this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
