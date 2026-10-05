package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x53 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z53 g;

    public x53(z53 z53Var, int i) {
        this.f = i;
        switch (i) {
            case 1:
                this.g = z53Var;
                break;
            default:
                d00 d00Var = a10.a;
                this.g = z53Var;
                break;
        }
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        z53 z53Var = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    d00 d00Var = a10.a;
                    z53Var.getClass();
                    d00Var.e(z53Var, nv0Var, 0);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    mg3.b(z53Var.a.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                }
                break;
        }
        return dm3Var;
    }
}
