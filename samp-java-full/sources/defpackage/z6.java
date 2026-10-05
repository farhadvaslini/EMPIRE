package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z6 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ i62 g;

    public /* synthetic */ z6(i62 i62Var, int i) {
        this.f = i;
        this.g = i62Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        i62 i62Var = this.g;
        h62 h62Var = (h62) obj;
        switch (i) {
            case 0:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case 1:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                h62.F(h62Var, i62Var, 0, 0);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                h62.F(h62Var, i62Var, 0, 0);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                if (h62Var.y() == bb1.f || h62Var.B() == 0) {
                    h62.c(h62Var, i62Var);
                    i62Var.K0(i41.c(0L, i62Var.j), 0.0f, null);
                } else {
                    long jB = ((long) (h62Var.B() - i62Var.f)) << 32;
                    h62.c(h62Var, i62Var);
                    i62Var.K0(i41.c(jB, i62Var.j), 0.0f, null);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                h62Var.getClass();
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case 8:
                h62.F(h62Var, i62Var, 0, 0);
                break;
            case vr.g /* 9 */:
                h62.H(h62Var, i62Var, 0, 0);
                break;
            case vr.h /* 10 */:
                h62.F(h62Var, i62Var, 0, 0);
                break;
            case 11:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case vr.i /* 12 */:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case 13:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            case 14:
                h62.F(h62Var, i62Var, 0, 0);
                break;
            case jo3.g /* 15 */:
                h62Var.C(i62Var, 0, 0, 0.0f);
                break;
            default:
                h62.F(h62Var, i62Var, 0, 0);
                break;
        }
        return dm3Var;
    }
}
