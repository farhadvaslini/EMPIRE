package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m90 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ e93 g;

    public /* synthetic */ m90(e93 e93Var, int i) {
        this.f = i;
        this.g = e93Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        e93 e93Var = this.g;
        switch (i) {
            case 0:
                qf0 qf0Var = (qf0) obj;
                long j = ((wx) e93Var.getValue()).a;
                if (!wx.c(j, wx.g)) {
                    qf0.h0(qf0Var, j, 0L, 0L, 0.0f, null, 0, 126);
                }
                break;
            case 1:
                uw0 uw0Var = (uw0) obj;
                uw0Var.getClass();
                uw0Var.p(fh1.d(e93Var));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                uw0 uw0Var2 = (uw0) obj;
                uw0Var2.getClass();
                uw0Var2.p(fh1.d(e93Var));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((uw0) obj).d(((Number) e93Var.getValue()).floatValue());
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((uw0) obj).d(((Number) e93Var.getValue()).floatValue());
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                uw0 uw0Var3 = (uw0) obj;
                uw0Var3.getClass();
                uw0Var3.j(((Number) e93Var.getValue()).floatValue());
                break;
            default:
                ((uw0) obj).d(((Number) e93Var.getValue()).floatValue());
                break;
        }
        return dm3Var;
    }
}
