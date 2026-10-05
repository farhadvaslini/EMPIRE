package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jn0 implements gn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ jd2 g;

    public /* synthetic */ jn0(jd2 jd2Var, int i) {
        this.f = i;
        this.g = jd2Var;
    }

    @Override // defpackage.gn0
    public final Object k(Object obj, p40 p40Var) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        jd2 jd2Var = this.g;
        switch (i) {
            case 0:
                jd2Var.setValue(obj);
                break;
            case 1:
                jd2Var.setValue(obj);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                jd2Var.setValue(obj);
                break;
            default:
                jd2Var.setValue(obj);
                break;
        }
        return dm3Var;
    }
}
