package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class dz2 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ cs0 i;

    public /* synthetic */ dz2(String str, cs0 cs0Var, cs0 cs0Var2, int i) {
        this.f = i;
        this.g = str;
        this.h = cs0Var;
        this.i = cs0Var2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        cs0 cs0Var = this.i;
        cs0 cs0Var2 = this.h;
        String str = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    gv3.c(oz2.M(y93.q0(str) ? 2131624293 : 2131624325, nv0Var), oz2.M(y93.q0(str) ? 2131624292 : 2131624324, nv0Var), oz2.M(y93.q0(str) ? 2131624120 : 2131624106, nv0Var), y93.q0(str) ? cs0Var2 : cs0Var, nv0Var, 0);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    gv3.c(oz2.M(y93.q0(str) ? 2131624323 : 2131624325, nv0Var2), oz2.M(y93.q0(str) ? 2131624322 : 2131624324, nv0Var2), oz2.M(y93.q0(str) ? 2131624102 : 2131624106, nv0Var2), y93.q0(str) ? cs0Var2 : cs0Var, nv0Var2, 0);
                }
                break;
        }
        return dm3Var;
    }
}
