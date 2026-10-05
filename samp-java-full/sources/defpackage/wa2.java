package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wa2 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ wa2(boolean z, es esVar) {
        this.f = 0;
        this.g = z;
        this.h = esVar;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        long j;
        int i3 = this.f;
        int i4 = 3;
        dm3 dm3Var = dm3.a;
        boolean z = this.g;
        Object obj4 = this.h;
        switch (i3) {
            case 0:
                es esVar = (es) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                    return dm3Var;
                }
                if (z) {
                    nv0Var.a0(-1262187022);
                    xd2.a(j43.k(yp1.a, 18.0f), 0L, 2.0f, 0L, 0, 0.0f, nv0Var, 390, 58);
                    nv0Var.p(false);
                    return dm3Var;
                }
                nv0Var.a0(-1261950399);
                int iOrdinal = esVar.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.plugins_action_install;
                } else if (iOrdinal == 1) {
                    i = R.string.plugins_action_update;
                } else if (iOrdinal == 2) {
                    i = R.string.plugins_action_latest;
                } else if (iOrdinal == 3) {
                    i = R.string.plugins_action_local_newer;
                } else {
                    if (iOrdinal != 4) {
                        c.k();
                        return null;
                    }
                    i = R.string.plugins_action_incompatible;
                }
                mg3.b(oz2.M(i, nv0Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
                nv0Var.p(false);
                return dm3Var;
            case 1:
                i62 i62VarT = ((xm1) obj2).t(((m30) obj3).a);
                return ((en1) obj).I0(i62VarT.f, i62VarT.g, oi0.f, new vv((e93) obj4, z, i62VarT, i4));
            default:
                jz2 jz2Var = (jz2) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                    return dm3Var;
                }
                int iOrdinal2 = jz2Var.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = R.string.launcher_servers_tab_saved;
                } else {
                    if (iOrdinal2 != 1) {
                        c.k();
                        return null;
                    }
                    i2 = R.string.launcher_servers_tab_recommended;
                }
                String strM = oz2.M(i2, nv0Var2);
                if (z) {
                    nv0Var2.a0(-1808468718);
                    j = ((fy) nv0Var2.j(hy.a)).q;
                    nv0Var2.p(false);
                } else {
                    nv0Var2.a0(-1808372277);
                    j = ((fy) nv0Var2.j(hy.a)).s;
                    nv0Var2.p(false);
                }
                mg3.b(strM, null, j, 0L, z ? xq0.j : xq0.h, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262074);
                return dm3Var;
        }
    }

    public /* synthetic */ wa2(int i, Object obj, boolean z) {
        this.f = i;
        this.h = obj;
        this.g = z;
    }
}
