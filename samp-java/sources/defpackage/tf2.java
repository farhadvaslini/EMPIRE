package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class tf2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ bq1 h;

    public /* synthetic */ tf2(List list, bq1 bq1Var, int i, int i2) {
        this.f = i2;
        this.g = list;
        this.h = bq1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        bq1 bq1Var = this.h;
        List list = this.g;
        nv0 nv0Var = (nv0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                w7.t(list, bq1Var, nv0Var, jo3.y(1));
                break;
            case 1:
                w7.t(list, bq1Var, nv0Var, jo3.y(1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                n92.a(list, bq1Var, nv0Var, jo3.y(1));
                break;
            default:
                n92.a(list, bq1Var, nv0Var, jo3.y(1));
                break;
        }
        return dm3Var;
    }
}
