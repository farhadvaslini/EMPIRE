package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v5 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d6 g;

    public /* synthetic */ v5(d6 d6Var, int i) {
        this.f = i;
        this.g = d6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i = this.f;
        float f = 0.0f;
        d6 d6Var = this.g;
        switch (i) {
            case 0:
                Object value = d6Var.l.getValue();
                if (value != null) {
                    return value;
                }
                float fG = d6Var.j.g();
                boolean zIsNaN = Float.isNaN(fG);
                d42 d42Var = d6Var.g;
                return !zIsNaN ? d6Var.c(fG, 0.0f, d42Var.getValue()) : d42Var.getValue();
            case 1:
                Object value2 = d6Var.l.getValue();
                if (value2 != null) {
                    return value2;
                }
                float fG2 = d6Var.j.g();
                boolean zIsNaN2 = Float.isNaN(fG2);
                d42 d42Var2 = d6Var.g;
                if (zIsNaN2) {
                    return d42Var2.getValue();
                }
                Object value3 = d42Var2.getValue();
                fm1 fm1VarD = d6Var.d();
                float fD = fm1VarD.d(value3);
                if (fD != fG2 && !Float.isNaN(fD)) {
                    if (fD < fG2) {
                        Object objB = fm1VarD.b(fG2, true);
                        if (objB != null) {
                            return objB;
                        }
                    } else {
                        Object objB2 = fm1VarD.b(fG2, false);
                        if (objB2 != null) {
                            return objB2;
                        }
                    }
                }
                return value3;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                float fD2 = d6Var.d().d(d6Var.g.getValue());
                float fD3 = d6Var.d().d(d6Var.i.getValue()) - fD2;
                float fAbs = Math.abs(fD3);
                if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
                    f = 1.0f;
                } else {
                    float f2 = (d6Var.f() - fD2) / fD3;
                    if (f2 >= 1.0E-6f) {
                        if (f2 <= 0.999999f) {
                            f = f2;
                        }
                    }
                }
                return Float.valueOf(f);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return d6Var.d();
            default:
                return new r32(d6Var.d(), d6Var.h.getValue());
        }
    }
}
