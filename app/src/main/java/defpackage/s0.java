package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends mb3 implements rs0 {
    public int j;
    public final /* synthetic */ ps2 k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(ps2 ps2Var, float f, float f2, p40 p40Var) {
        super(2, p40Var);
        this.k = ps2Var;
        this.l = f;
        this.m = f2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((s0) m((p40) obj2, (x50) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        return new s0(this.k, this.l, this.m, p40Var);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        if (i == 0) {
            y02.Q(obj);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.l)) << 32) | (((long) Float.floatToRawIntBits(this.m)) & 4294967295L);
            this.j = 1;
            Object objA = ks2.a(this.k.W, jFloatToRawIntBits, this);
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
