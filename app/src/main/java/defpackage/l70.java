package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l70 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l70(int i, p40 p40Var, int i2) {
        super(i, p40Var);
        this.j = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((l70) m((p40) obj2, (d93) obj)).o(dm3Var);
            case 1:
                return ((l70) m((p40) obj2, (bk2) obj)).o(dm3Var);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return ((l70) m((p40) obj2, (m33) obj)).o(dm3Var);
            default:
                ((l70) m((p40) obj2, (es1) obj)).o(dm3Var);
                return dm3Var;
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                l70 l70Var = new l70(2, p40Var, 0);
                l70Var.k = obj;
                return l70Var;
            case 1:
                l70 l70Var2 = new l70(2, p40Var, 1);
                l70Var2.k = obj;
                return l70Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                l70 l70Var3 = new l70(2, p40Var, 2);
                l70Var3.k = obj;
                return l70Var3;
            default:
                l70 l70Var4 = new l70(2, p40Var, 3);
                l70Var4.k = obj;
                return l70Var4;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        switch (this.j) {
            case 0:
                y02.Q(obj);
                return Boolean.valueOf(!(((d93) this.k) instanceof km0));
            case 1:
                y02.Q(obj);
                return Boolean.valueOf(((bk2) this.k) == bk2.f);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                m33 m33Var = (m33) this.k;
                y02.Q(obj);
                return Boolean.valueOf(m33Var != m33.f);
            default:
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                es1Var.d(pi.n, new Long(System.currentTimeMillis()));
                return dm3.a;
        }
    }
}
