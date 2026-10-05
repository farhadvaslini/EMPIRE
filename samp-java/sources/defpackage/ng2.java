package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ng2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ bq1 j;

    public /* synthetic */ ng2(List list, ns0 ns0Var, ns0 ns0Var2, bq1 bq1Var, int i, int i2) {
        this.f = i2;
        this.g = list;
        this.h = ns0Var;
        this.i = ns0Var2;
        this.j = bq1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(1);
                d32.d(this.g, this.h, this.i, this.j, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                d32.d(this.g, this.h, this.i, this.j, (nv0) obj, iY2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(1);
                f80.i(this.g, this.h, this.i, this.j, (nv0) obj, iY3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY4 = jo3.y(1);
                f80.i(this.g, this.h, this.i, this.j, (nv0) obj, iY4);
                break;
        }
        return dm3Var;
    }
}
