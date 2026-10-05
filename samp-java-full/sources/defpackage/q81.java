package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q81 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a42 g;

    public /* synthetic */ q81(a42 a42Var, int i) {
        this.f = i;
        this.g = a42Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        a42 a42Var = this.g;
        switch (i) {
            case 0:
                a42Var.h((int) (((p41) obj).a & 4294967295L));
                break;
            case 1:
                ab1 ab1Var = (ab1) obj;
                ab1Var.getClass();
                ab1 ab1VarF = ab1Var.F();
                int iM = vm1.M(Float.intBitsToFloat((int) ((ab1VarF != null ? ab1VarF.O(ab1Var, 0L) : 0L) & 4294967295L)));
                if (a42Var.g() != iM) {
                    a42Var.h(iM);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                a42Var.h((int) (((p41) obj).a >> 32));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                a42Var.h(((Integer) obj).intValue());
                break;
            default:
                a42Var.h((int) (((p41) obj).a & 4294967295L));
                break;
        }
        return dm3Var;
    }
}
