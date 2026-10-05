package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t0 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ps2 l;
    public /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(ps2 ps2Var, long j, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = ps2Var;
        this.m = j;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                long j = ((gy1) obj).a;
                t0 t0Var = new t0(this.l, (p40) obj2);
                t0Var.m = j;
                return t0Var.o(dm3Var);
            case 1:
                return ((t0) m((p40) obj2, (x50) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((t0) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((t0) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                t0 t0Var = new t0(this.l, p40Var);
                t0Var.m = ((gy1) obj).a;
                return t0Var;
            case 1:
                return new t0(this.l, this.m, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new t0(this.l, this.m, p40Var, 2);
            default:
                return new t0(this.l, this.m, p40Var, 3);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        ps2 ps2Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    long j = this.m;
                    this.k = 1;
                    Object objA = ks2.a(ps2Var.W, j, this);
                    if (objA == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    ws2 ws2Var = ps2Var.W;
                    os2 os2Var = new os2(this.m, null);
                    this.k = 1;
                    if (ws2Var.g(ts1.g, os2Var, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    ws2 ws2Var2 = ps2Var.W;
                    long j2 = this.m;
                    this.k = 1;
                    if (ws2Var2.c(j2, true, this) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i5 = this.k;
                if (i5 == 0) {
                    y02.Q(obj);
                    ws2 ws2Var3 = ps2Var.W;
                    long j3 = this.m;
                    this.k = 1;
                    if (ws2Var3.c(j3, false, this) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ps2 ps2Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 0;
        this.l = ps2Var;
    }
}
