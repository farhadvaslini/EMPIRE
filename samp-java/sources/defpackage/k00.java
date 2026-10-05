package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class k00 implements rs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ k00(int i) {
        this.f = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    w01 w01VarB = pq.c;
                    if (w01VarB == null) {
                        v01 v01Var = new v01("Filled.Description", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = vo3.a;
                        w73 w73Var = new w73(wx.b);
                        tx0 tx0Var = new tx0(1);
                        tx0Var.j(14.0f, 2.0f);
                        tx0Var.h(6.0f, 2.0f);
                        tx0Var.e(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        tx0Var.h(4.0f, 20.0f);
                        tx0Var.e(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                        tx0Var.h(18.0f, 22.0f);
                        tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        tx0Var.h(20.0f, 8.0f);
                        tx0Var.i(-6.0f, -6.0f);
                        tx0Var.c();
                        tx0Var.j(16.0f, 18.0f);
                        tx0Var.h(8.0f, 18.0f);
                        tx0Var.o(-2.0f);
                        tx0Var.g(8.0f);
                        tx0Var.o(2.0f);
                        tx0Var.c();
                        tx0Var.j(16.0f, 14.0f);
                        tx0Var.h(8.0f, 14.0f);
                        tx0Var.o(-2.0f);
                        tx0Var.g(8.0f);
                        tx0Var.o(2.0f);
                        tx0Var.c();
                        tx0Var.j(13.0f, 9.0f);
                        tx0Var.h(13.0f, 3.5f);
                        tx0Var.h(18.5f, 9.0f);
                        tx0Var.h(13.0f, 9.0f);
                        tx0Var.c();
                        v01.a(v01Var, tx0Var.a, w73Var);
                        w01VarB = v01Var.b();
                        pq.c = w01VarB;
                    }
                    s01.a(w01VarB, null, null, 0L, nv0Var, 48, 12);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    s01.a(s51.v(), oz2.M(2131624103, nv0Var3), null, 0L, nv0Var3, 0, 12);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    w01 w01VarB2 = pq.b;
                    if (w01VarB2 == null) {
                        v01 v01Var2 = new v01("Filled.ContentCopy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = vo3.a;
                        w73 w73Var2 = new w73(wx.b);
                        tx0 tx0Var2 = new tx0(1);
                        tx0Var2.j(16.0f, 1.0f);
                        tx0Var2.h(4.0f, 1.0f);
                        tx0Var2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        tx0Var2.o(14.0f);
                        tx0Var2.g(2.0f);
                        tx0Var2.h(4.0f, 3.0f);
                        tx0Var2.g(12.0f);
                        tx0Var2.h(16.0f, 1.0f);
                        tx0Var2.c();
                        tx0Var2.j(19.0f, 5.0f);
                        tx0Var2.h(8.0f, 5.0f);
                        tx0Var2.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        tx0Var2.o(14.0f);
                        tx0Var2.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        tx0Var2.g(11.0f);
                        tx0Var2.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        tx0Var2.h(21.0f, 7.0f);
                        tx0Var2.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        tx0Var2.c();
                        tx0Var2.j(19.0f, 21.0f);
                        tx0Var2.h(8.0f, 21.0f);
                        tx0Var2.h(8.0f, 7.0f);
                        tx0Var2.g(11.0f);
                        tx0Var2.o(14.0f);
                        tx0Var2.c();
                        v01.a(v01Var2, tx0Var2.a, w73Var2);
                        w01VarB2 = v01Var2.b();
                        pq.b = w01VarB2;
                    }
                    s01.a(w01VarB2, oz2.M(2131624108, nv0Var4), null, 0L, nv0Var4, 0, 12);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    da1.a(0, nv0Var5);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var6.U();
                } else {
                    s01.a(d32.q(), oz2.M(2131624475, nv0Var6), null, 0L, nv0Var6, 0, 12);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var7.U();
                } else {
                    s01.a(gq.E(), oz2.M(2131624477, nv0Var7), null, ((fy) nv0Var7.j(hy.a)).w, nv0Var7, 0, 4);
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var8.U();
                } else {
                    mg3.b(oz2.M(2131624533, nv0Var8), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                }
                break;
            case 8:
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var9.U();
                } else {
                    mg3.b(oz2.M(2131624513, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                }
                break;
            case vr.g /* 9 */:
                nv0 nv0Var10 = (nv0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nv0Var10.U();
                } else {
                    mg3.b(oz2.M(2131624522, nv0Var10), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var10, 0, 0, 262142);
                }
                break;
            case vr.h /* 10 */:
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!nv0Var11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nv0Var11.U();
                } else {
                    mg3.b(oz2.M(2131624482, nv0Var11), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var11, 0, 0, 262142);
                }
                break;
            case 11:
                nv0 nv0Var12 = (nv0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!nv0Var12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    nv0Var12.U();
                } else {
                    s01.a(y02.r(), null, null, 0L, nv0Var12, 48, 12);
                }
                break;
            case vr.i /* 12 */:
                nv0 nv0Var13 = (nv0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!nv0Var13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    nv0Var13.U();
                } else {
                    mg3.b(oz2.M(2131624548, nv0Var13), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var13, 0, 0, 262142);
                }
                break;
            case 13:
                nv0 nv0Var14 = (nv0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!nv0Var14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    nv0Var14.U();
                } else {
                    s01.a(w22.v(), oz2.M(2131624541, nv0Var14), null, 0L, nv0Var14, 0, 12);
                }
                break;
            case 14:
                nv0 nv0Var15 = (nv0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!nv0Var15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    nv0Var15.U();
                } else {
                    s01.a(gv3.B(), oz2.M(2131624549, nv0Var15), null, 0L, nv0Var15, 0, 12);
                }
                break;
            case jo3.g /* 15 */:
                nv0 nv0Var16 = (nv0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!nv0Var16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    nv0Var16.U();
                } else {
                    mg3.b(oz2.M(2131624557, nv0Var16), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var16, 0, 0, 262142);
                }
                break;
            case 16:
                nv0 nv0Var17 = (nv0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!nv0Var17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    nv0Var17.U();
                } else {
                    mg3.b(oz2.M(2131624559, nv0Var17), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var17, 0, 0, 262142);
                }
                break;
            case 17:
                nv0 nv0Var18 = (nv0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!nv0Var18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    nv0Var18.U();
                } else {
                    s01.a(pq.u(), null, j43.o(j43.e(yp1Var, 16.0f), 16.0f), 0L, nv0Var18, 432, 8);
                }
                break;
            case 18:
                nv0 nv0Var19 = (nv0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!nv0Var19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    nv0Var19.U();
                } else {
                    s01.a(pq.u(), null, null, 0L, nv0Var19, 48, 12);
                }
                break;
            case 19:
                nv0 nv0Var20 = (nv0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!nv0Var20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    nv0Var20.U();
                } else {
                    s01.a(pq.C(), "Actions", j43.k(yp1Var, 20.0f), 0L, nv0Var20, 432, 8);
                }
                break;
            case 20:
                nv0 nv0Var21 = (nv0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!nv0Var21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    nv0Var21.U();
                } else {
                    mg3.b(oz2.M(2131624572, nv0Var21), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var21, 0, 0, 262142);
                }
                break;
            case 21:
                nv0 nv0Var22 = (nv0) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (!nv0Var22.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    nv0Var22.U();
                } else {
                    s01.a(pq.C(), "Actions", j43.k(yp1Var, 20.0f), 0L, nv0Var22, 432, 8);
                }
                break;
            case 22:
                nv0 nv0Var23 = (nv0) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (!nv0Var23.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    nv0Var23.U();
                } else {
                    mg3.b(oz2.M(2131624572, nv0Var23), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var23, 0, 0, 262142);
                }
                break;
            case 23:
                nv0 nv0Var24 = (nv0) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (!nv0Var24.R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    nv0Var24.U();
                } else {
                    mg3.b(oz2.M(2131624570, nv0Var24), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var24, 0, 0, 262142);
                }
                break;
            case 24:
                nv0 nv0Var25 = (nv0) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (!nv0Var25.R(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    nv0Var25.U();
                } else {
                    mg3.b(oz2.M(2131624571, nv0Var25), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var25, 0, 0, 262142);
                }
                break;
            case 25:
                nv0 nv0Var26 = (nv0) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (!nv0Var26.R(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    nv0Var26.U();
                } else {
                    s01.a(pq.C(), "Actions", j43.k(yp1Var, 20.0f), 0L, nv0Var26, 432, 8);
                }
                break;
            case 26:
                nv0 nv0Var27 = (nv0) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (!nv0Var27.R(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    nv0Var27.U();
                } else {
                    mg3.b(oz2.M(2131624572, nv0Var27), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var27, 0, 0, 262142);
                }
                break;
            case 27:
                nv0 nv0Var28 = (nv0) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (!nv0Var28.R(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    nv0Var28.U();
                }
                break;
            case 28:
                nv0 nv0Var29 = (nv0) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                if (!nv0Var29.R(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    nv0Var29.U();
                } else {
                    s01.a(s51.v(), null, null, 0L, nv0Var29, 48, 12);
                }
                break;
            default:
                nv0 nv0Var30 = (nv0) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                if (!nv0Var30.R(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    nv0Var30.U();
                } else {
                    mg3.b(oz2.M(2131624586, nv0Var30), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var30, 0, 0, 262142);
                }
                break;
        }
        return dm3Var;
    }
}
