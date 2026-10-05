package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q10 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ float l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q10(Object obj, float f, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.m = obj;
        this.l = f;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((q10) m((p40) obj2, Float.valueOf(((Number) obj).floatValue()))).o(dm3Var);
            case 1:
                return ((q10) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((q10) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                q10 q10Var = new q10((r10) obj2, p40Var);
                q10Var.l = ((Number) obj).floatValue();
                return q10Var;
            case 1:
                return new q10((ed) obj2, this.l, p40Var, 1);
            default:
                return new q10((s33) obj2, this.l, p40Var, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        Object objB;
        int i = this.j;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.m;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                r10 r10Var = (r10) obj2;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    float f = this.l;
                    Object objG = r10Var.a.d.f.g(pu2.e);
                    rs0 rs0Var = (rs0) (objG != null ? objG : null);
                    if (rs0Var == null) {
                        throw nc2.d("Required value was null.");
                    }
                    gy1 gy1Var = new gy1((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
                    this.k = 1;
                    obj = rs0Var.f(gy1Var, this);
                    if (obj == y50Var) {
                        return y50Var;
                    }
                } else {
                    if (i2 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return new Float(Float.intBitsToFloat((int) (((gy1) obj).a & 4294967295L)));
            case 1:
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                ed edVar = (ed) obj2;
                Float f2 = new Float(((Number) edVar.d()).floatValue() + this.l);
                this.k = 1;
                return edVar.f(this, f2) == y50Var ? y50Var : dm3Var;
            default:
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                float f3 = this.l;
                this.k = 1;
                d6 d6Var = ((s33) obj2).c;
                Object value = d6Var.g.getValue();
                Object objC = d6Var.c(d6Var.f(), f3, value);
                boolean zBooleanValue = ((Boolean) d6Var.d.h(objC)).booleanValue();
                ts1 ts1Var = ts1.f;
                if (zBooleanValue) {
                    objB = d6Var.b(objC, ts1Var, new r5(d6Var, f3, null), this);
                    if (objB != y50Var) {
                        objB = dm3Var;
                    }
                    if (objB != y50Var) {
                        objB = dm3Var;
                    }
                } else {
                    objB = d6Var.b(value, ts1Var, new r5(d6Var, f3, null), this);
                    if (objB != y50Var) {
                        objB = dm3Var;
                    }
                    if (objB != y50Var) {
                    }
                }
                if (objB != y50Var) {
                    objB = dm3Var;
                }
                return objB == y50Var ? y50Var : dm3Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q10(r10 r10Var, p40 p40Var) {
        super(2, p40Var);
        this.j = 0;
        this.m = r10Var;
    }
}
