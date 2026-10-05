package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fq implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ zs0 i;

    public /* synthetic */ fq(long j, Object obj, zs0 zs0Var, int i) {
        this.f = i;
        this.g = j;
        this.h = obj;
        this.i = zs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.i;
        Object obj3 = this.h;
        int i2 = 2;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    jo3.b(this.g, ((ol3) nv0Var.j(ql3.a)).m, gq.N(417635459, new z4(i2, (x12) obj3, (ss0) zs0Var), nv0Var), nv0Var, 384);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    oz2.b(this.g, (gh3) obj3, (rs0) zs0Var, nv0Var2, 0);
                }
                break;
        }
        return dm3Var;
    }
}
