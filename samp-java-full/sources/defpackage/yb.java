package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yb implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;

    public /* synthetic */ yb(os1 os1Var, int i) {
        this.f = i;
        this.g = os1Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.g;
        switch (i) {
            case 0:
                ab1 ab1Var = (ab1) os1Var.getValue();
                if (ab1Var == null) {
                    p21.d("Required value was null.");
                    c.d();
                }
                break;
            case 1:
                ab1 ab1Var2 = (ab1) os1Var.getValue();
                if (ab1Var2 == null) {
                    p21.d("Required value was null.");
                    c.d();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (os1Var != null) {
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                os1Var.setValue(null);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                Boolean bool = (Boolean) os1Var.getValue();
                bool.booleanValue();
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                os1Var.setValue(dm3Var);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((hk0) os1Var.getValue()).getClass();
                os1Var.setValue(new hk0());
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 8:
                os1Var.setValue(Boolean.valueOf(!gv3.l(os1Var)));
                break;
            case vr.g /* 9 */:
                os1Var.setValue(Boolean.valueOf(!gv3.l(os1Var)));
                break;
            case vr.h /* 10 */:
                os1Var.setValue(Boolean.TRUE);
                break;
            case 11:
                os1Var.setValue(Boolean.FALSE);
                break;
            case vr.i /* 12 */:
                os1Var.setValue(null);
                break;
            case 13:
                os1Var.setValue(null);
                break;
            case 14:
                os1Var.setValue(Boolean.FALSE);
                break;
            case jo3.g /* 15 */:
                os1Var.setValue(Boolean.TRUE);
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                r93 r93Var = fh1.a;
                break;
            case 19:
                break;
            case 20:
                Boolean bool2 = (Boolean) os1Var.getValue();
                bool2.getClass();
                break;
            case 21:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 22:
                ab1 ab1Var3 = (ab1) os1Var.getValue();
                if (ab1Var3 == null) {
                    p21.d("Required value was null.");
                    c.d();
                }
                break;
            case 23:
                os1Var.setValue(null);
                break;
            case 24:
                os1Var.setValue(null);
                break;
            case 25:
                os1Var.setValue(null);
                break;
            case 26:
                os1Var.setValue(null);
                break;
            case 27:
                os1Var.setValue(null);
                break;
            case 28:
                os1Var.setValue(null);
                break;
            default:
                os1Var.setValue(Boolean.TRUE);
                break;
        }
        return dm3Var;
    }
}
