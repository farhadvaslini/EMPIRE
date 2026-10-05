package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class v6 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;

    public /* synthetic */ v6(cs0 cs0Var, int i) {
        this.f = i;
        this.g = cs0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        cs0 cs0Var = this.g;
        switch (i) {
            case 0:
                cs0Var.a();
                break;
            case 1:
                cs0Var.a();
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                cs0Var.a();
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                cs0Var.a();
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                cs0Var.a();
                break;
            default:
                cs0Var.a();
                break;
        }
    }
}
