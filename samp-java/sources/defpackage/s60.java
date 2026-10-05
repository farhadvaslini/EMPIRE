package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class s60 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 1;
    public int k;
    public float l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(float f, it2 it2Var, qt1 qt1Var, p40 p40Var) {
        super(2, p40Var);
        this.l = f;
        this.m = it2Var;
        this.n = qt1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((s60) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                s60 s60Var = new s60((z60) obj2, this.l, p40Var);
                s60Var.m = obj;
                return s60Var;
            case 1:
                return new s60(this.l, (it2) this.m, (qt1) obj2, p40Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new s60((ot) this.m, this.l, (oe) obj2, p40Var);
            default:
                s60 s60Var2 = new s60((gk3) obj2, p40Var);
                s60Var2.m = obj;
                return s60Var2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        Object objA;
        x50 x50Var;
        float fY;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.n;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                x50 x50Var2 = (x50) this.m;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    z60 z60Var = (z60) obj2;
                    zs1 zs1Var = z60Var.m;
                    r60 r60Var = new r60(z60Var, this.l, x50Var2, null);
                    this.m = null;
                    this.k = 1;
                    zs1Var.getClass();
                    if (ur.w(new e51(ts1.f, zs1Var, r60Var, null, 1), this) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case 1:
                it2 it2Var = (it2) this.m;
                float f = this.l;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    if (f > 0.0f) {
                        this.k = 1;
                        if (it2Var.w(f, it2Var.b.getValue(), this) != y50Var) {
                        }
                    }
                } else if (i3 == 1) {
                    y02.Q(obj);
                } else if (i3 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                if (f == 0.0f) {
                    qt1 qt1Var = (qt1) obj2;
                    this.k = 2;
                    gk3 gk3Var = it2Var.e;
                    if (gk3Var == null || ((s51.n(it2Var.c.getValue(), qt1Var) && s51.n(it2Var.b.getValue(), qt1Var)) || (objA = at1.a(it2Var.l, new ct2(it2Var, qt1Var, gk3Var, null, 1), this)) != y50Var)) {
                        objA = dm3Var;
                    }
                    if (objA != y50Var) {
                    }
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    if (ed.c((ed) ((ot) this.m).c, new Float(this.l), (oe) obj2, null, this, 12) == y50Var) {
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
                    x50 x50Var3 = (x50) this.m;
                    x50Var = x50Var3;
                    fY = t22.y(x50Var3.h());
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fY = this.l;
                    x50Var = (x50) this.m;
                    y02.Q(obj);
                }
                while (ur.H(x50Var)) {
                    me0 me0Var = new me0((gk3) obj2, fY);
                    this.m = x50Var;
                    this.l = fY;
                    this.k = 1;
                    o50 o50Var = this.g;
                    o50Var.getClass();
                    if (lq.I(o50Var).a(me0Var, this) == y50Var) {
                        break;
                    }
                }
                break;
        }
        return y50Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(ot otVar, float f, oe oeVar, p40 p40Var) {
        super(2, p40Var);
        this.m = otVar;
        this.l = f;
        this.n = oeVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(z60 z60Var, float f, p40 p40Var) {
        super(2, p40Var);
        this.n = z60Var;
        this.l = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(gk3 gk3Var, p40 p40Var) {
        super(2, p40Var);
        this.n = gk3Var;
    }
}
