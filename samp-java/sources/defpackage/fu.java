package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fu implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;
    public final /* synthetic */ rs0 h;

    public /* synthetic */ fu(long j, rs0 rs0Var, int i) {
        this.f = i;
        this.g = j;
        this.h = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        rs0 rs0Var = this.h;
        long j = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    vr.c(nc2.f(j, t30.a), rs0Var, nv0Var, 8);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    oz2.c(j, rs0Var, nv0Var2, 0);
                }
                break;
            default:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    oz2.c(j, rs0Var, nv0Var3, 0);
                }
                break;
        }
        return dm3Var;
    }
}
