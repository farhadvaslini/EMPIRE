package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class en2 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ en2(int i, boolean z) {
        this.f = i;
        this.g = z;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        boolean z = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else if (!z) {
                    nv0Var.a0(907808564);
                    mg3.b(oz2.M(R.string.launcher_action_download, nv0Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
                    nv0Var.p(false);
                } else {
                    nv0Var.a0(907509693);
                    yp1 yp1Var = yp1.a;
                    xd2.a(j43.k(yp1Var, 18.0f), 0L, 2.0f, 0L, 0, 0.0f, nv0Var, 390, 58);
                    oz2.g(nv0Var, j43.o(yp1Var, 8.0f));
                    mg3.b(oz2.M(R.string.launcher_download_downloading, nv0Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
                    nv0Var.p(false);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    mg3.b(oz2.M(z ? R.string.launcher_recommended_added : R.string.launcher_action_add_server, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                }
                break;
        }
        return dm3Var;
    }
}
