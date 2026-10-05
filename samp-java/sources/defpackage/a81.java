package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class a81 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public /* synthetic */ a81(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        String str = this.h;
        String str2 = this.g;
        nv0 nv0Var = (nv0) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                gv3.q(str2, str, nv0Var, jo3.y(1));
                break;
            default:
                int iIntValue = num.intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    g12.u(str2, str, nv0Var, 0);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ a81(String str, String str2, int i) {
        this.g = str;
        this.h = str2;
    }
}
