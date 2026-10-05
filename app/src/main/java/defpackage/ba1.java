package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ba1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public final /* synthetic */ os1 k;
    public final /* synthetic */ os1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba1(os1 os1Var, os1 os1Var2, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.k = os1Var;
        this.l = os1Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((ba1) m(p40Var, x50Var)).o(dm3Var);
                break;
            default:
                ((ba1) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        os1 os1Var = this.l;
        os1 os1Var2 = this.k;
        switch (i) {
            case 0:
                return new ba1(os1Var2, os1Var, p40Var, 0);
            default:
                return new ba1(os1Var2, os1Var, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.l;
        os1 os1Var2 = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                r93 r93Var = da1.a;
                if (((an3) os1Var2.getValue()) instanceof vm3) {
                    os1Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                y02.Q(obj);
                r93 r93Var2 = da1.a;
                if (((pn3) os1Var2.getValue()) instanceof kn3) {
                    os1Var.setValue(Boolean.FALSE);
                }
                break;
        }
        return dm3Var;
    }
}
