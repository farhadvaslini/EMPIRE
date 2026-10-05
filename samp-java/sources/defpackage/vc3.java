package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class vc3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ xc2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc3(xc2 xc2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = xc2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            case 1:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
            default:
                ((vc3) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        xc2 xc2Var = this.k;
        switch (i) {
            case 0:
                return new vc3(xc2Var, p40Var, 0);
            case 1:
                return new vc3(xc2Var, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new vc3(xc2Var, p40Var, 2);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return new vc3(xc2Var, p40Var, 3);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return new vc3(xc2Var, p40Var, 4);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return new vc3(xc2Var, p40Var, 5);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new vc3(xc2Var, p40Var, 6);
            default:
                return new vc3(xc2Var, p40Var, 7);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        xc2 xc2Var = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                xc2Var.c();
                break;
            case 1:
                y02.Q(obj);
                xc2Var.i();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                xc2Var.i();
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                y02.Q(obj);
                xc2Var.c();
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                y02.Q(obj);
                xc2Var.i();
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                y02.Q(obj);
                xc2Var.i();
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                y02.Q(obj);
                xc2Var.c();
                break;
            default:
                y02.Q(obj);
                xc2Var.i();
                break;
        }
        return dm3Var;
    }
}
