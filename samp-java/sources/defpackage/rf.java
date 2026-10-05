package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class rf implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;

    public /* synthetic */ rf(cs0 cs0Var, int i) {
        this.f = i;
        this.g = cs0Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        cs0 cs0Var = this.g;
        switch (i) {
            case 0:
                ((uw0) obj).d(((Number) cs0Var.a()).floatValue());
                return dm3Var;
            case 1:
                uw0 uw0Var = (uw0) obj;
                uw0Var.getClass();
                float fFloatValue = ((Number) cs0Var.a()).floatValue();
                uw0Var.m(fFloatValue);
                uw0Var.s(fFloatValue);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                cs0Var.a();
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                cs0Var.a();
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                dv2 dv2Var = (dv2) obj;
                Object objA = cs0Var.a();
                if (Float.isNaN(((Number) objA).floatValue())) {
                    objA = null;
                }
                Float f = (Float) objA;
                bv2.h(dv2Var, new qd2(f != null ? f.floatValue() : 0.0f, new ex(0.0f, 1.0f), 0));
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((m71) obj).getClass();
                cs0Var.a();
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) cs0Var.a()).floatValue());
            default:
                return (gy1) cs0Var.a();
        }
    }
}
