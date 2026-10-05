package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wm2 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a42 g;

    public /* synthetic */ wm2(a42 a42Var, int i) {
        this.f = i;
        this.g = a42Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        long j3;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        a42 a42Var = this.g;
        int i2 = 0;
        int i3 = 1;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    String strM = oz2.M(R.string.launcher_resources_section_cleo, nv0Var);
                    if (a42Var.g() == 1) {
                        nv0Var.a0(-1087881650);
                        j = ((fy) nv0Var.j(hy.a)).q;
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-1087793145);
                        j = ((fy) nv0Var.j(hy.a)).s;
                        nv0Var.p(false);
                    }
                    mg3.b(strM, null, j, 0L, a42Var.g() == 1 ? xq0.j : xq0.h, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262074);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    String strM2 = oz2.M(R.string.launcher_resources_section_plugins, nv0Var2);
                    if (a42Var.g() == 2) {
                        nv0Var2.a0(1970230575);
                        j2 = ((fy) nv0Var2.j(hy.a)).q;
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(1970319080);
                        j2 = ((fy) nv0Var2.j(hy.a)).s;
                        nv0Var2.p(false);
                    }
                    mg3.b(strM2, null, j2, 0L, a42Var.g() == 2 ? xq0.j : xq0.h, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262074);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ep2 ep2Var = (ep2) obj;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ep2Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= nv0Var3.f(ep2Var) ? 4 : 2;
                }
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    nv0Var3.U();
                } else {
                    boolean zF = nv0Var3.f(a42Var);
                    Object objO = nv0Var3.O();
                    zj zjVar = c20.a;
                    if (zF || objO == zjVar) {
                        objO = new zg1(a42Var, 4);
                        nv0Var3.j0(objO);
                    }
                    int i4 = (iIntValue3 & 14) | 3072;
                    fh1.a(ep2Var, (cs0) objO, null, gq.N(-1876119976, new wm2(a42Var, 3), nv0Var3), nv0Var3, i4);
                    boolean zF2 = nv0Var3.f(a42Var);
                    Object objO2 = nv0Var3.O();
                    if (zF2 || objO2 == zjVar) {
                        objO2 = new zg1(a42Var, 1);
                        nv0Var3.j0(objO2);
                    }
                    fh1.a(ep2Var, (cs0) objO2, null, gq.N(1859755969, new wm2(a42Var, i2), nv0Var3), nv0Var3, i4);
                    boolean zF3 = nv0Var3.f(a42Var);
                    Object objO3 = nv0Var3.O();
                    if (zF3 || objO3 == zjVar) {
                        objO3 = new zg1(a42Var, 2);
                        nv0Var3.j0(objO3);
                    }
                    fh1.a(ep2Var, (cs0) objO3, null, gq.N(1168852000, new wm2(a42Var, i3), nv0Var3), nv0Var3, i4);
                }
                break;
            default:
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nv0Var4.U();
                } else {
                    String strM3 = oz2.M(R.string.launcher_resources_section_game, nv0Var4);
                    if (a42Var.g() == 0) {
                        nv0Var4.a0(-1080617897);
                        j3 = ((fy) nv0Var4.j(hy.a)).q;
                        nv0Var4.p(false);
                    } else {
                        nv0Var4.a0(-1080529392);
                        j3 = ((fy) nv0Var4.j(hy.a)).s;
                        nv0Var4.p(false);
                    }
                    mg3.b(strM3, null, j3, 0L, a42Var.g() == 0 ? xq0.j : xq0.h, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 0, 0, 262074);
                }
                break;
        }
        return dm3Var;
    }
}
