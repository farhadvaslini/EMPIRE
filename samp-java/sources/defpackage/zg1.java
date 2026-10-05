package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class zg1 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a42 g;

    public /* synthetic */ zg1(a42 a42Var, int i) {
        this.f = i;
        this.g = a42Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int iG;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        a42 a42Var = this.g;
        switch (i) {
            case 0:
                r93 r93Var = fh1.a;
                iG = a42Var.g();
                break;
            case 1:
                a42Var.h(1);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                a42Var.h(2);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                iG = a42Var.g();
                break;
            default:
                a42Var.h(0);
                return dm3Var;
        }
        return Integer.valueOf(iG);
    }
}
