package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rh1 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ float k;
    public final /* synthetic */ z60 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rh1(z60 z60Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = z60Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        float fFloatValue = ((Number) obj).floatValue();
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((rh1) m(p40Var, Float.valueOf(fFloatValue))).o(dm3Var);
                break;
            default:
                ((rh1) m(p40Var, Float.valueOf(fFloatValue))).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        z60 z60Var = this.l;
        switch (i) {
            case 0:
                rh1 rh1Var = new rh1(z60Var, p40Var, 0);
                rh1Var.k = ((Number) obj).floatValue();
                return rh1Var;
            default:
                rh1 rh1Var2 = new rh1(z60Var, p40Var, 1);
                rh1Var2.k = ((Number) obj).floatValue();
                return rh1Var2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        z60 z60Var = this.l;
        float f = this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                if (z60Var.d() != f) {
                    z60Var.h(f);
                }
                break;
            default:
                y02.Q(obj);
                z60Var.h(f);
                break;
        }
        return dm3Var;
    }
}
