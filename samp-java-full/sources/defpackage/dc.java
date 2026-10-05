package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dc extends mb3 implements rs0 {
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dc(int i, p40 p40Var, int i2) {
        super(i, p40Var);
        this.j = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                break;
            case 1:
                ((dc) m((p40) obj2, (fn0) obj)).o(dm3Var);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((dc) m((p40) obj2, (cs2) obj)).o(dm3Var);
                break;
            default:
                ((dc) m((p40) obj2, (gn0) obj)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new dc(2, p40Var, 0);
            case 1:
                return new dc(2, p40Var, 1);
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return new dc(2, p40Var, 2);
            default:
                return new dc(2, p40Var, 3);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                y02.Q(obj);
                break;
            case 1:
                y02.Q(obj);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                y02.Q(obj);
                break;
            default:
                y02.Q(obj);
                break;
        }
        return dm3Var;
    }
}
