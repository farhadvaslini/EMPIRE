package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class w4 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ d00 g;

    public /* synthetic */ w4(d00 d00Var, int i) {
        this.f = i;
        this.g = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        d00 d00Var = this.g;
        nv0 nv0Var = (nv0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                e5.b(d00Var, nv0Var, jo3.y(439));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    d00Var.e(oo0.a, nv0Var, 6);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                num.getClass();
                gv3.p(d00Var, nv0Var, jo3.y(7));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                num.getClass();
                ur.d(d00Var, nv0Var, jo3.y(7));
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                int iIntValue2 = num.intValue();
                if (!nv0Var.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var.U();
                } else {
                    d00Var.f(nv0Var, 0);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                num.getClass();
                ur.e(d00Var, nv0Var, jo3.y(7));
                break;
            default:
                num.getClass();
                q33.a(d00Var, nv0Var, jo3.y(55));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ w4(d00 d00Var, int i, int i2) {
        this.f = i2;
        this.g = d00Var;
    }
}
