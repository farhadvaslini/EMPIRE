package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class g32 extends mb3 implements rs0 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i32 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ float n;
    public final /* synthetic */ oe o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g32(i32 i32Var, int i, float f, oe oeVar, p40 p40Var) {
        super(2, p40Var);
        this.l = i32Var;
        this.m = i;
        this.n = f;
        this.o = oeVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((g32) m((p40) obj2, (cs2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        g32 g32Var = new g32(this.l, this.m, this.n, this.o, p40Var);
        g32Var.k = obj;
        return g32Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        if (i != 0) {
            if (i == 1) {
                y02.Q(obj);
                return dm3Var;
            }
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        cs2 cs2Var = (cs2) this.k;
        i32 i32Var = this.l;
        k90 k90Var = new k90(cs2Var, i32Var);
        this.j = 1;
        j32 j32Var = k32.a;
        int i2 = this.m;
        i32Var.q.h(i32Var.j(new Integer(i2).intValue()));
        boolean z = i2 > i32Var.e;
        int i3 = (((fn1) qx.y0(i32Var.m().a)).a - i32Var.e) + 1;
        if (((z && i2 > ((fn1) qx.y0(i32Var.m().a)).a) || (!z && i2 < i32Var.e)) && Math.abs(i2 - i32Var.e) >= 3) {
            int i4 = i32Var.e;
            if (z) {
                int i5 = i2 - i3;
                if (i5 >= i4) {
                    i4 = i5;
                }
            } else {
                int i6 = i3 + i2;
                if (i6 <= i4) {
                    i4 = i6;
                }
            }
            float fP = i32Var.p();
            i32Var.t(i4, fP == 0.0f ? 0.0f : 0.0f / fP, true);
        }
        Object objM = t22.m(0.0f, ((int) (y02.i(b32.h(i32Var) + ((long) vm1.M(((i32Var.p() * (i2 - i32Var.k())) - (i32Var.l() * i32Var.p())) + 0.0f)), i32Var.h, i32Var.g) - b32.h(i32Var))) + this.n, this.o, new y7(28, new nk2(), k90Var), this, 4);
        y50 y50Var = y50.f;
        if (objM != y50Var) {
            objM = dm3Var;
        }
        return objM == y50Var ? y50Var : dm3Var;
    }
}
