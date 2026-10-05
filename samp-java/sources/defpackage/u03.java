package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class u03 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ os1 h;

    public /* synthetic */ u03(ns0 ns0Var, os1 os1Var, int i) {
        this.f = i;
        this.g = ns0Var;
        this.h = os1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.h;
        ns0 ns0Var = this.g;
        switch (i) {
            case 0:
                qp2 qp2Var = (qp2) obj;
                qp2Var.getClass();
                ns0Var.h(qp2Var);
                os1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                Integer num = (Integer) obj;
                num.getClass();
                ns0Var.h(num);
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Integer num2 = (Integer) obj;
                num2.getClass();
                ns0Var.h(num2);
                os1Var.setValue(Boolean.FALSE);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                qf2 qf2Var = (qf2) obj;
                qf2Var.getClass();
                ns0Var.h(qf2Var);
                os1Var.setValue(Boolean.FALSE);
                break;
            default:
                oh3 oh3Var = (oh3) obj;
                oh3Var.getClass();
                ns0Var.h(oh3Var);
                os1Var.setValue(Boolean.FALSE);
                break;
        }
        return dm3Var;
    }
}
