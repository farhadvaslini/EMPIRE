package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r00 implements ss0 {
    public final /* synthetic */ int f;

    public /* synthetic */ r00(int i) {
        this.f = i;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ep2) obj).getClass();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
            mg3.b(oz2.M(R.string.game_plugins_permission_cancel, nv0Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    oz2.g(nv0Var, j43.e(yp1Var, 4.0f));
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    oz2.g(nv0Var2, j43.e(yp1Var, 8.0f));
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((he) obj).getClass();
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    xd2.a(j43.k(yp1Var, 20.0f), 0L, 2.0f, 0L, 0, 0.0f, nv0Var3, 390, 58);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    w01 w01VarB = lr.c;
                    if (w01VarB == null) {
                        v01 v01Var = new v01("Filled.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = vo3.a;
                        w73 w73Var = new w73(wx.b);
                        tx0 tx0Var = new tx0(1);
                        tx0Var.j(20.0f, 6.0f);
                        tx0Var.g(-8.0f);
                        tx0Var.i(-2.0f, -2.0f);
                        tx0Var.h(4.0f, 4.0f);
                        tx0Var.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        tx0Var.h(2.0f, 18.0f);
                        tx0Var.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        tx0Var.g(16.0f);
                        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        tx0Var.h(22.0f, 8.0f);
                        tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        tx0Var.c();
                        tx0Var.j(20.0f, 18.0f);
                        tx0Var.h(4.0f, 18.0f);
                        tx0Var.h(4.0f, 8.0f);
                        tx0Var.g(16.0f);
                        tx0Var.o(10.0f);
                        tx0Var.c();
                        v01.a(v01Var, tx0Var.a, w73Var);
                        w01VarB = v01Var.b();
                        lr.c = w01VarB;
                    }
                    s01.a(w01VarB, null, null, 0L, nv0Var4, 48, 12);
                    oz2.g(nv0Var4, j43.o(yp1Var, 8.0f));
                    mg3.b(oz2.M(R.string.launcher_action_import_local_zip, nv0Var4), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 0, 0, 262142);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_retry, nv0Var5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 0, 0, 262142);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var6 = (nv0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_extract, nv0Var6), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var6, 0, 0, 262142);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var7 = (nv0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_retry, nv0Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 0, 0, 262142);
                } else {
                    nv0Var7.U();
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var8 = (nv0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    w01 w01VarB2 = br.g;
                    if (w01VarB2 == null) {
                        v01 v01Var2 = new v01("Filled.CloudDownload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = vo3.a;
                        w73 w73Var2 = new w73(wx.b);
                        tx0 tx0Var2 = new tx0(1);
                        tx0Var2.j(19.35f, 10.04f);
                        tx0Var2.d(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
                        tx0Var2.d(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
                        tx0Var2.d(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
                        tx0Var2.e(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
                        tx0Var2.g(13.0f);
                        tx0Var2.e(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
                        tx0Var2.e(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
                        tx0Var2.c();
                        tx0Var2.j(17.0f, 13.0f);
                        tx0Var2.i(-5.0f, 5.0f);
                        tx0Var2.i(-5.0f, -5.0f);
                        tx0Var2.g(3.0f);
                        tx0Var2.n(9.0f);
                        tx0Var2.g(4.0f);
                        tx0Var2.o(4.0f);
                        tx0Var2.g(3.0f);
                        tx0Var2.c();
                        v01.a(v01Var2, tx0Var2.a, w73Var2);
                        w01VarB2 = v01Var2.b();
                        br.g = w01VarB2;
                    }
                    s01.a(w01VarB2, null, null, 0L, nv0Var8, 48, 12);
                    oz2.g(nv0Var8, j43.o(yp1Var, 8.0f));
                    mg3.b(oz2.M(R.string.launcher_action_fetch_sources, nv0Var8), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                } else {
                    nv0Var8.U();
                }
                return dm3Var;
            case 8:
                nv0 nv0Var9 = (nv0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_save, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                } else {
                    nv0Var9.U();
                }
                return dm3Var;
            case vr.g /* 9 */:
                nv0 nv0Var10 = (nv0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_cancel, nv0Var10), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var10, 0, 0, 262142);
                } else {
                    nv0Var10.U();
                }
                return dm3Var;
            case vr.h /* 10 */:
                nv0 nv0Var11 = (nv0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var11.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_close, nv0Var11), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var11, 0, 0, 262142);
                } else {
                    nv0Var11.U();
                }
                return dm3Var;
            case 11:
                nv0 nv0Var12 = (nv0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var12.R(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_close, nv0Var12), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var12, 0, 0, 262142);
                } else {
                    nv0Var12.U();
                }
                return dm3Var;
            case vr.i /* 12 */:
                nv0 nv0Var13 = (nv0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (nv0Var13.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    xd2.c(j43.c(yp1Var, 1.0f), 0L, 0L, 0, 0.0f, nv0Var13, 6);
                } else {
                    nv0Var13.U();
                }
                return dm3Var;
            case 13:
                nv0 nv0Var14 = (nv0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var14.R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    s01.a(n32.q(), null, j43.k(yp1Var, 18.0f), 0L, nv0Var14, 432, 8);
                    oz2.g(nv0Var14, j43.o(yp1Var, 4.0f));
                    mg3.b(oz2.M(R.string.launcher_action_launch, nv0Var14), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var14, 0, 0, 262142);
                } else {
                    nv0Var14.U();
                }
                return dm3Var;
            case 14:
                nv0 nv0Var15 = (nv0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var15.R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_launch, nv0Var15), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var15, 0, 0, 262142);
                } else {
                    nv0Var15.U();
                }
                return dm3Var;
            case jo3.g /* 15 */:
                nv0 nv0Var16 = (nv0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var16.R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_cancel, nv0Var16), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var16, 0, 0, 262142);
                } else {
                    nv0Var16.U();
                }
                return dm3Var;
            case 16:
                nv0 nv0Var17 = (nv0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var17.R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_launch_raksamp, nv0Var17), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var17, 0, 0, 262142);
                } else {
                    nv0Var17.U();
                }
                return dm3Var;
            case 17:
                nv0 nv0Var18 = (nv0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var18.R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_remove, nv0Var18), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var18, 0, 0, 262142);
                } else {
                    nv0Var18.U();
                }
                return dm3Var;
            case 18:
                nv0 nv0Var19 = (nv0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var19.R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.launcher_action_cancel, nv0Var19), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var19, 0, 0, 262142);
                } else {
                    nv0Var19.U();
                }
                return dm3Var;
            case 19:
                nv0 nv0Var20 = (nv0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var20.R(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_plugins_apply, nv0Var20), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var20, 0, 0, 262142);
                } else {
                    nv0Var20.U();
                }
                return dm3Var;
            case 20:
                nv0 nv0Var21 = (nv0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var21.R(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_quick_commands_cancel, nv0Var21), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var21, 0, 0, 262142);
                } else {
                    nv0Var21.U();
                }
                return dm3Var;
            case 21:
                nv0 nv0Var22 = (nv0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var22.R(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_quick_commands_delete_action, nv0Var22), null, ((fy) nv0Var22.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var22, 0, 0, 262138);
                } else {
                    nv0Var22.U();
                }
                return dm3Var;
            case 22:
                nv0 nv0Var23 = (nv0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var23.R(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_quick_commands_cancel, nv0Var23), null, wx.b(0.6f, ((fy) nv0Var23.j(hy.a)).q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var23, 0, 0, 262138);
                } else {
                    nv0Var23.U();
                }
                return dm3Var;
            case 23:
                nv0 nv0Var24 = (nv0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var24.R(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    w01 w01VarB3 = br.h;
                    if (w01VarB3 == null) {
                        v01 v01Var3 = new v01("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = vo3.a;
                        w73 w73Var3 = new w73(wx.b);
                        tx0 tx0Var3 = new tx0(1);
                        tx0Var3.j(3.0f, 17.25f);
                        tx0Var3.n(21.0f);
                        tx0Var3.g(3.75f);
                        tx0Var3.h(17.81f, 9.94f);
                        tx0Var3.i(-3.75f, -3.75f);
                        tx0Var3.h(3.0f, 17.25f);
                        tx0Var3.c();
                        tx0Var3.j(20.71f, 7.04f);
                        tx0Var3.e(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                        tx0Var3.i(-2.34f, -2.34f);
                        tx0Var3.e(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                        tx0Var3.i(-1.83f, 1.83f);
                        tx0Var3.i(3.75f, 3.75f);
                        tx0Var3.i(1.83f, -1.83f);
                        tx0Var3.c();
                        v01.a(v01Var3, tx0Var3.a, w73Var3);
                        w01VarB3 = v01Var3.b();
                        br.h = w01VarB3;
                    }
                    w01 w01Var = w01VarB3;
                    r93 r93Var = hy.a;
                    s01.a(w01Var, null, j43.k(yp1Var, 16.0f), wx.b(0.7f, ((fy) nv0Var24.j(r93Var)).q), nv0Var24, 432, 0);
                    oz2.g(nv0Var24, j43.o(yp1Var, 4.0f));
                    mg3.b(oz2.M(R.string.game_quick_commands_edit, nv0Var24), null, wx.b(0.8f, ((fy) nv0Var24.j(r93Var)).q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var24, 0, 0, 262138);
                } else {
                    nv0Var24.U();
                }
                return dm3Var;
            case 24:
                nv0 nv0Var25 = (nv0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var25.R(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    w01 w01VarE = gq.E();
                    r93 r93Var2 = hy.a;
                    s01.a(w01VarE, null, j43.k(yp1Var, 16.0f), ((fy) nv0Var25.j(r93Var2)).w, nv0Var25, 432, 0);
                    oz2.g(nv0Var25, j43.o(yp1Var, 4.0f));
                    mg3.b(oz2.M(R.string.game_quick_commands_delete_action, nv0Var25), null, ((fy) nv0Var25.j(r93Var2)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var25, 0, 0, 262138);
                } else {
                    nv0Var25.U();
                }
                return dm3Var;
            case 25:
                nv0 nv0Var26 = (nv0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var26.R(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_quick_commands_save, nv0Var26), null, ((fy) nv0Var26.j(hy.a)).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var26, 0, 0, 262138);
                } else {
                    nv0Var26.U();
                }
                return dm3Var;
            case 26:
                nv0 nv0Var27 = (nv0) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var27.R(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_quick_commands_cancel, nv0Var27), null, wx.b(0.6f, ((fy) nv0Var27.j(hy.a)).q), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var27, 0, 0, 262138);
                } else {
                    nv0Var27.U();
                }
                return dm3Var;
            case 27:
                nv0 nv0Var28 = (nv0) obj2;
                int iIntValue28 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var28.R(iIntValue28 & 1, (iIntValue28 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_plugins_permission_allow, nv0Var28), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var28, 0, 0, 262142);
                } else {
                    nv0Var28.U();
                }
                return dm3Var;
            case 28:
                return d(obj, obj2, obj3);
            default:
                nv0 nv0Var29 = (nv0) obj2;
                int iIntValue29 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (nv0Var29.R(iIntValue29 & 1, (iIntValue29 & 17) != 16)) {
                    mg3.b(oz2.M(R.string.game_plugins_apply, nv0Var29), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var29, 0, 0, 262142);
                } else {
                    nv0Var29.U();
                }
                return dm3Var;
        }
    }
}
