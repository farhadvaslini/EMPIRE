package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w30 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(c72 c72Var, String str, long j, yg3 yg3Var, sf3 sf3Var, iy1 iy1Var, p40 p40Var) {
        super(2, p40Var);
        this.m = c72Var;
        this.n = str;
        this.l = j;
        this.o = yg3Var;
        this.p = sf3Var;
        this.q = iy1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((w30) m((p40) obj2, (us2) obj)).o(dm3Var);
            default:
                return ((w30) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                w30 w30Var = new w30((um3) obj5, (y30) obj4, (zo) obj3, this.l, (j61) obj2, p40Var);
                w30Var.m = obj;
                return w30Var;
            default:
                return new w30((c72) this.m, (String) obj5, this.l, (yg3) obj4, (sf3) obj3, (iy1) obj2, p40Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objG;
        String str;
        int i = this.j;
        Object obj2 = this.o;
        y50 y50Var = y50.f;
        Object obj3 = this.p;
        Object obj4 = this.n;
        Object obj5 = this.q;
        dm3 dm3Var = dm3.a;
        p40 p40Var = null;
        switch (i) {
            case 0:
                zo zoVar = (zo) obj3;
                y30 y30Var = (y30) obj2;
                um3 um3Var = (um3) obj4;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                    }
                    break;
                } else {
                    y02.Q(obj);
                    us2 us2Var = (us2) this.m;
                    um3Var.e = y30.p1(y30Var, zoVar, this.l);
                    v1 v1Var = new v1(y30Var, um3Var, (j61) obj5, us2Var);
                    ok okVar = new ok(y30Var, um3Var, zoVar, 5);
                    this.k = 1;
                    if (um3Var.a(v1Var, okVar, this) == y50Var) {
                    }
                }
                break;
            default:
                iy1 iy1Var = (iy1) obj5;
                String str2 = (String) obj4;
                sf3 sf3Var = (sf3) obj3;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y02.Q(obj);
                        objG = obj;
                        str = str2;
                    }
                    break;
                } else {
                    y02.Q(obj);
                    c72 c72Var = (c72) this.m;
                    this.k = 1;
                    c72Var.getClass();
                    if (str2.length() == 0) {
                        objG = null;
                        str = str2;
                        if (objG == y50Var) {
                        }
                    } else {
                        long j = this.l;
                        if (!yg3.c(j)) {
                            str = str2;
                            objG = cl3.G(c72Var.a, new n9(c72Var, new b72(j, (p40) null, c72Var, str2), p40Var, 10), this);
                        }
                        if (objG == y50Var) {
                        }
                    }
                }
                yg3 yg3Var = (yg3) objG;
                if (yg3Var != null) {
                    long j2 = yg3Var.a;
                    long jF = d32.f(iy1Var.n((int) (j2 >> 32)), iy1Var.n((int) (j2 & 4294967295L)));
                    if (!yg3.a(jF, (yg3) obj2) && s51.n(sf3Var.n().a.g, str) && iy1Var == sf3Var.b) {
                        sf3Var.c.h(sf3.e(sf3Var.n().a, jF));
                        sf3Var.w = new yg3(jF);
                    }
                }
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w30(um3 um3Var, y30 y30Var, zo zoVar, long j, j61 j61Var, p40 p40Var) {
        super(2, p40Var);
        this.n = um3Var;
        this.o = y30Var;
        this.p = zoVar;
        this.l = j;
        this.q = j61Var;
    }
}
