package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh2 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;

    public /* synthetic */ mh2(os1 os1Var, int i) {
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
                os1Var.setValue(Boolean.TRUE);
                break;
            case 1:
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                os1Var.setValue(Boolean.TRUE);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                os1Var.setValue(Boolean.TRUE);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case 8:
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case vr.g /* 9 */:
                os1Var.setValue(Boolean.TRUE);
                break;
            case vr.h /* 10 */:
                os1Var.setValue(Boolean.TRUE);
                break;
            case 11:
                os1Var.setValue(Boolean.FALSE);
                break;
            case vr.i /* 12 */:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 13:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 14:
                os1Var.setValue(Boolean.FALSE);
                break;
            case jo3.g /* 15 */:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 16:
                os1Var.setValue(Boolean.valueOf(!((Boolean) os1Var.getValue()).booleanValue()));
                break;
            case 17:
                os1Var.setValue(Boolean.TRUE);
                break;
            case 18:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 19:
                break;
            case 20:
                os1Var.setValue("");
                break;
            case 21:
                os1Var.setValue("");
                break;
            case 22:
                os1Var.setValue("");
                break;
            case 23:
                f80.p(os1Var, true);
                break;
            case 24:
                f80.p(os1Var, false);
                break;
            case 25:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 26:
                os1Var.setValue(Boolean.FALSE);
                break;
            case 27:
                os1Var.setValue(null);
                break;
            case 28:
                os1Var.setValue(null);
                break;
            default:
                os1Var.setValue("");
                break;
        }
        return dm3Var;
    }
}
