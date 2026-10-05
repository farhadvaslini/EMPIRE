package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class aq extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ed l;
    public final /* synthetic */ float m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ s41 o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aq(ed edVar, float f, boolean z, Object obj, s41 s41Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = edVar;
        this.m = f;
        this.n = z;
        this.p = obj;
        this.o = s41Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((aq) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.p;
        switch (i) {
            case 0:
                return new aq(this.l, this.m, this.n, (bq) obj2, this.o, p40Var, 0);
            default:
                return new aq(this.l, this.m, this.n, (yr) obj2, this.o, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        s41 s41Var = this.o;
        boolean z = this.n;
        y50 y50Var = y50.f;
        Object obj2 = this.p;
        ed edVar = this.l;
        float f = this.m;
        s41 wo0Var = null;
        switch (i) {
            case 0:
                bq bqVar = (bq) obj2;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    if (!jd0.b(((jd0) edVar.e.getValue()).f, f)) {
                        if (z) {
                            float f2 = ((jd0) edVar.e.getValue()).f;
                            if (jd0.b(f2, 0.0f)) {
                                wo0Var = new zc2(0L);
                            } else if (jd0.b(f2, bqVar.a)) {
                                wo0Var = new zy0();
                            } else if (jd0.b(f2, 0.0f)) {
                                wo0Var = new wo0();
                            }
                            this.k = 2;
                            if (hh0.a(edVar, f, wo0Var, s41Var, this) != y50Var) {
                            }
                        } else {
                            jd0 jd0Var = new jd0(f);
                            this.k = 1;
                            if (edVar.f(this, jd0Var) != y50Var) {
                            }
                        }
                    }
                } else if (i2 == 1 || i2 == 2) {
                    y02.Q(obj);
                } else {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                break;
            default:
                yr yrVar = (yr) obj2;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    if (!jd0.b(((jd0) edVar.e.getValue()).f, f)) {
                        if (z) {
                            float f3 = ((jd0) edVar.e.getValue()).f;
                            if (jd0.b(f3, yrVar.b)) {
                                wo0Var = new zc2(0L);
                            } else if (jd0.b(f3, yrVar.c)) {
                                wo0Var = new zy0();
                            } else if (jd0.b(f3, 0.0f)) {
                                wo0Var = new wo0();
                            } else if (jd0.b(f3, yrVar.d)) {
                                wo0Var = new ue0();
                            }
                            this.k = 2;
                            if (hh0.a(edVar, f, wo0Var, s41Var, this) != y50Var) {
                            }
                        } else {
                            jd0 jd0Var2 = new jd0(f);
                            this.k = 1;
                            if (edVar.f(this, jd0Var2) != y50Var) {
                            }
                        }
                    }
                } else if (i3 == 1 || i3 == 2) {
                    y02.Q(obj);
                } else {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
        return y50Var;
    }
}
