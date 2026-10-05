package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kw2(boolean z, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        es1 es1Var = (es1) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case 1:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            default:
                ((kw2) m(p40Var, es1Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                kw2 kw2Var = new kw2(this.l, p40Var, 0);
                kw2Var.k = obj;
                return kw2Var;
            case 1:
                kw2 kw2Var2 = new kw2(this.l, p40Var, 1);
                kw2Var2.k = obj;
                return kw2Var2;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                kw2 kw2Var3 = new kw2(this.l, p40Var, 2);
                kw2Var3.k = obj;
                return kw2Var3;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                kw2 kw2Var4 = new kw2(this.l, p40Var, 3);
                kw2Var4.k = obj;
                return kw2Var4;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                kw2 kw2Var5 = new kw2(this.l, p40Var, 4);
                kw2Var5.k = obj;
                return kw2Var5;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                kw2 kw2Var6 = new kw2(this.l, p40Var, 5);
                kw2Var6.k = obj;
                return kw2Var6;
            default:
                kw2 kw2Var7 = new kw2(this.l, p40Var, 6);
                kw2Var7.k = obj;
                return kw2Var7;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        boolean z = this.l;
        es1 es1Var = (es1) this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                es1Var.d(qy2.I, Boolean.valueOf(z));
                break;
            case 1:
                y02.Q(obj);
                es1Var.d(qy2.C, Boolean.valueOf(z));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                es1Var.d(qy2.G, Boolean.valueOf(z));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                es1Var.d(qy2.N, Boolean.valueOf(z));
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y02.Q(obj);
                es1Var.d(qy2.M, Boolean.valueOf(z));
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y02.Q(obj);
                es1Var.d(pi.l, Boolean.valueOf(z));
                break;
            default:
                y02.Q(obj);
                es1Var.d(pi.m, Boolean.valueOf(z));
                break;
        }
        return dm3Var;
    }
}
