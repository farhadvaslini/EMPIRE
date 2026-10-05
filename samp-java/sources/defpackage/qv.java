package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class qv implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cs0 h;

    public /* synthetic */ qv(int i, cs0 cs0Var, boolean z) {
        this.f = i;
        this.g = z;
        this.h = cs0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        cs0 cs0Var = this.h;
        boolean z = this.g;
        switch (i) {
            case 0:
                if (!z) {
                    cs0Var.a();
                }
                break;
            case 1:
                if (z) {
                    cs0Var.a();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (!z) {
                    cs0Var.a();
                }
                break;
            default:
                if (!z) {
                    cs0Var.a();
                }
                break;
        }
        return dm3Var;
    }
}
