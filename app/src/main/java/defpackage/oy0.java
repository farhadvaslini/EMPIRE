package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy0 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;

    public /* synthetic */ oy0(int i, String str) {
        this.f = i;
        this.g = str;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        String str = this.g;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    w01 w01VarQ = n32.q();
                    yp1 yp1Var = yp1.a;
                    s01.a(w01VarQ, null, j43.k(yp1Var, 24.0f), 0L, nv0Var, 432, 8);
                    oz2.g(nv0Var, j43.o(yp1Var, 8.0f));
                    mg3.b(this.g, null, 0L, 0L, xq0.j, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var.j(ql3.a)).h, nv0Var, 1572864, 0, 131006);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    mg3.b(this.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nv0Var3.U();
                } else {
                    gv3.j(str, nv0Var3, 0);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nv0Var4.U();
                } else {
                    mg3.b(oz2.N(R.string.launcher_plugin_recovery_rollback, new Object[]{str}, nv0Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 0, 0, 262142);
                }
                break;
            default:
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    nv0Var5.U();
                } else {
                    mg3.b(this.g, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 0, 0, 262142);
                }
                break;
        }
        return dm3Var;
    }
}
