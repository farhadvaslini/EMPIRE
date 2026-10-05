package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 extends pn2 implements rs0 {
    public yv0 h;
    public ds1 i;
    public long[] j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ ds1 n;
    public final /* synthetic */ yv0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cs1(ds1 ds1Var, yv0 yv0Var, p40 p40Var) {
        super(p40Var);
        this.n = ds1Var;
        this.o = yv0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((cs1) m((p40) obj2, (ov2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        cs1 cs1Var = new cs1(this.n, this.o, p40Var);
        cs1Var.m = obj;
        return cs1Var;
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        ov2 ov2Var;
        ds1 ds1Var;
        long[] jArr;
        int i;
        yv0 yv0Var;
        int i2 = this.l;
        if (i2 == 0) {
            y02.Q(obj);
            ov2Var = (ov2) this.m;
            ds1Var = this.n;
            bs1 bs1Var = ds1Var.g;
            jArr = bs1Var.c;
            i = bs1Var.e;
            yv0Var = this.o;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.k;
            jArr = this.j;
            ds1Var = this.i;
            yv0Var = this.h;
            ov2Var = (ov2) this.m;
            y02.Q(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return dm3.a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        yv0Var.g = i;
        Object obj2 = ds1Var.g.b[i];
        this.m = ov2Var;
        this.h = yv0Var;
        this.i = ds1Var;
        this.j = jArr;
        this.k = i3;
        this.l = 1;
        ov2Var.b(obj2, this);
        return y50.f;
    }
}
