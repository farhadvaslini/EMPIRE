package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh1 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ mh1(os1 os1Var, os1 os1Var2, int i) {
        this.f = i;
        this.g = os1Var;
        this.h = os1Var2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.h;
        os1 os1Var2 = this.g;
        switch (i) {
            case 0:
                z60 z60Var = (z60) obj;
                z60Var.getClass();
                if (((Boolean) os1Var.getValue()).booleanValue()) {
                    ((ns0) os1Var2.getValue()).h(Float.valueOf(z60Var.d()));
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                os1Var2.setValue(str);
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                String str2 = (String) obj;
                str2.getClass();
                os1Var2.setValue(str2);
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                String str3 = (String) obj;
                str3.getClass();
                os1Var2.setValue(str3);
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                String str4 = (String) obj;
                str4.getClass();
                os1Var2.setValue(str4);
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                String str5 = (String) obj;
                str5.getClass();
                os1Var2.setValue(str5);
                os1Var.setValue(Boolean.FALSE);
                break;
            default:
                String str6 = (String) obj;
                str6.getClass();
                os1Var2.setValue(y93.F0(9, str6));
                os1Var.setValue(Boolean.FALSE);
                break;
        }
        return dm3Var;
    }
}
