package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
        int i2 = R.string.launcher_action_clear_search;
        int i3 = R.string.launcher_servers_search_empty_message;
        int i4 = R.string.launcher_servers_search_empty_title;
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
                    if (y93.q0(str)) {
                        i4 = R.string.launcher_recommended_empty_title;
                    }
                    String strM = oz2.M(i4, nv0Var);
                    if (y93.q0(str)) {
                        i3 = R.string.launcher_recommended_empty_message;
                    }
                    String strM2 = oz2.M(i3, nv0Var);
                    if (y93.q0(str)) {
                        i2 = R.string.launcher_action_refresh;
                    }
                    gv3.c(strM, strM2, oz2.M(i2, nv0Var), y93.q0(str) ? cs0Var2 : cs0Var, nv0Var, 0);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    if (y93.q0(str)) {
                        i4 = R.string.launcher_servers_empty_title;
                    }
                    String strM3 = oz2.M(i4, nv0Var2);
                    if (y93.q0(str)) {
                        i3 = R.string.launcher_servers_empty_message;
                    }
                    String strM4 = oz2.M(i3, nv0Var2);
                    if (y93.q0(str)) {
                        i2 = R.string.launcher_action_add_server;
                    }
                    gv3.c(strM3, strM4, oz2.M(i2, nv0Var2), y93.q0(str) ? cs0Var2 : cs0Var, nv0Var2, 0);
                }
                break;
        }
        return dm3Var;
    }
}
