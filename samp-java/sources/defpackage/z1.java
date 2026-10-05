package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class z1 implements ss0 {
    public final /* synthetic */ int f;

    public /* synthetic */ z1(int i) {
        this.f = i;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        oi0 oi0Var = oi0.f;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        final int i2 = 1;
        switch (i) {
            case 0:
                en1 en1Var = (en1) obj;
                final int iP0 = en1Var.p0(10.0f);
                int i3 = iP0 * 2;
                final i62 i62VarT = ((xm1) obj2).t(n30.i(((m30) obj3).a, i3, 0));
                break;
            case 1:
                en1 en1Var2 = (en1) obj;
                final int iP02 = en1Var2.p0(10.0f);
                int i4 = iP02 * 2;
                final i62 i62VarT2 = ((xm1) obj2).t(n30.i(((m30) obj3).a, 0, i4));
                int i5 = i62VarT2.g - i4;
                int i6 = i62VarT2.f;
                final int i7 = z ? 1 : 0;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                i62 i62VarT3 = ((xm1) obj2).t(((m30) obj3).a);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    mg3.b(oz2.M(2131624134, nv0Var), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262142);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    mg3.b(oz2.M(2131624104, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var2, 0, 0, 262142);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nv0Var3.U();
                } else {
                    mg3.b(oz2.M(2131624164, nv0Var3), null, ((fy) nv0Var3.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var3, 0, 0, 262138);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nv0Var4.U();
                } else {
                    oz2.g(nv0Var4, j43.e(yp1Var, 16.0f));
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    nv0Var5.U();
                } else {
                    bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                    dp2 dp2VarA = cp2.a(n92.e, f5.p, nv0Var5, 6);
                    int iHashCode = Long.hashCode(nv0Var5.T);
                    n52 n52VarL = nv0Var5.l();
                    bq1 bq1VarM = lr.M(nv0Var5, bq1VarC);
                    w10.c.getClass();
                    nv0Var5.d0();
                    if (nv0Var5.S) {
                        nv0Var5.k(tb1.Y);
                    } else {
                        nv0Var5.m0();
                    }
                    y02.F(f5.E, nv0Var5, dp2VarA);
                    y02.F(f5.D, nv0Var5, n52VarL);
                    y02.F(f5.F, nv0Var5, Integer.valueOf(iHashCode));
                    y02.C(nv0Var5);
                    y02.F(f5.C, nv0Var5, bq1VarM);
                    xd2.a(null, 0L, 0.0f, 0L, 0, 0.0f, nv0Var5, 0, 63);
                    nv0Var5.p(true);
                }
                break;
            case 8:
                nv0 nv0Var6 = (nv0) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    nv0Var6.U();
                } else {
                    mg3.b(oz2.M(2131624139, nv0Var6), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var6, 0, 0, 262142);
                }
                break;
            case vr.g /* 9 */:
                nv0 nv0Var7 = (nv0) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    nv0Var7.U();
                } else {
                    mg3.b(oz2.M(2131624143, nv0Var7), null, ((fy) nv0Var7.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 0, 0, 262138);
                }
                break;
            case vr.h /* 10 */:
                nv0 nv0Var8 = (nv0) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    nv0Var8.U();
                } else {
                    mg3.b(oz2.M(2131624145, nv0Var8), null, ((fy) nv0Var8.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262138);
                }
                break;
            case 11:
                nv0 nv0Var9 = (nv0) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    nv0Var9.U();
                } else {
                    oz2.g(nv0Var9, j43.e(yp1Var, 16.0f));
                }
                break;
            case vr.i /* 12 */:
                nv0 nv0Var10 = (nv0) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    nv0Var10.U();
                } else {
                    mg3.b(oz2.M(2131624104, nv0Var10), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var10, 0, 0, 262142);
                }
                break;
            case 13:
                nv0 nv0Var11 = (nv0) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var11.R(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    nv0Var11.U();
                } else {
                    s01.a(gq.F(), null, null, 0L, nv0Var11, 48, 12);
                    mg3.b(oz2.M(2131624135, nv0Var11), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var11, 0, 0, 262142);
                }
                break;
            case 14:
                j40 j40Var = (j40) obj;
                nv0 nv0Var12 = (nv0) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= nv0Var12.f(j40Var) ? 4 : 2;
                }
                if (!nv0Var12.R(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    nv0Var12.U();
                } else {
                    eo.a(gv3.v(j43.e(j43.c(f80.L(yp1Var, 0.0f, l40.g, 1), 1.0f), l40.f), j40Var.c, cl3.q0), nv0Var12, 0);
                }
                break;
            case jo3.g /* 15 */:
                nv0 nv0Var13 = (nv0) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var13.R(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    nv0Var13.U();
                } else {
                    mg3.b(oz2.M(2131624105, nv0Var13), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, nv0Var13, 0, 24960, 241662);
                }
                break;
            case 16:
                nv0 nv0Var14 = (nv0) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var14.R(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    nv0Var14.U();
                } else {
                    s01.a(gv3.B(), null, j43.k(yp1Var, 18.0f), 0L, nv0Var14, 432, 8);
                    mg3.b(oz2.M(2131624286, nv0Var14), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var14, 0, 0, 262142);
                }
                break;
            case 17:
                nv0 nv0Var15 = (nv0) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var15.R(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    nv0Var15.U();
                } else {
                    mg3.b(oz2.M(2131624109, nv0Var15), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var15, 0, 0, 262142);
                }
                break;
            case 18:
                nv0 nv0Var16 = (nv0) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var16.R(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    nv0Var16.U();
                } else {
                    mg3.b(oz2.M(2131624104, nv0Var16), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var16, 0, 0, 262142);
                }
                break;
            case 19:
                nv0 nv0Var17 = (nv0) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if (!nv0Var17.R(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    nv0Var17.U();
                } else {
                    mg3.b(oz2.M(2131624285, nv0Var17), f80.N(yp1.a, 0.0f, 0.0f, 0.0f, 8.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var17.j(ql3.a)).h, nv0Var17, 48, 0, 131068);
                }
                break;
            case 20:
                nv0 nv0Var18 = (nv0) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var18.R(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    nv0Var18.U();
                } else {
                    mg3.b(oz2.M(2131624117, nv0Var18), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var18, 0, 0, 262142);
                }
                break;
            case 21:
                nv0 nv0Var19 = (nv0) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var19.R(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    nv0Var19.U();
                } else {
                    mg3.b(oz2.M(2131624104, nv0Var19), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var19, 0, 0, 262142);
                }
                break;
            case 22:
                nv0 nv0Var20 = (nv0) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var20.R(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    nv0Var20.U();
                } else {
                    mg3.b(oz2.M(2131624270, nv0Var20), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var20, 0, 0, 262142);
                }
                break;
            case 23:
                nv0 nv0Var21 = (nv0) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var21.R(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    nv0Var21.U();
                } else {
                    mg3.b(oz2.M(2131624269, nv0Var21), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var21, 0, 0, 262142);
                }
                break;
            case 24:
                nv0 nv0Var22 = (nv0) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var22.R(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    nv0Var22.U();
                } else {
                    mg3.b(oz2.M(2131624268, nv0Var22), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var22, 0, 0, 262142);
                }
                break;
            case 25:
                nv0 nv0Var23 = (nv0) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var23.R(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    nv0Var23.U();
                }
                break;
            case 26:
                nv0 nv0Var24 = (nv0) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var24.R(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    nv0Var24.U();
                } else {
                    yh1.a(null, nv0Var24, 0);
                }
                break;
            case 27:
                nv0 nv0Var25 = (nv0) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var25.R(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    nv0Var25.U();
                } else {
                    s01.a(d32.q(), null, j43.k(yp1Var, 18.0f), 0L, nv0Var25, 432, 8);
                    oz2.g(nv0Var25, j43.k(yp1Var, 4.0f));
                    mg3.b(oz2.M(2131624254, nv0Var25), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var25, 0, 0, 262142);
                }
                break;
            case 28:
                nv0 nv0Var26 = (nv0) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var26.R(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    nv0Var26.U();
                } else {
                    s01.a(gq.E(), null, j43.k(yp1Var, 18.0f), 0L, nv0Var26, 432, 8);
                    oz2.g(nv0Var26, j43.k(yp1Var, 4.0f));
                    mg3.b(oz2.M(2131624244, nv0Var26), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var26, 0, 0, 262142);
                }
                break;
            default:
                nv0 nv0Var27 = (nv0) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((ep2) obj).getClass();
                if (!nv0Var27.R(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    nv0Var27.U();
                } else {
                    s01.a(gq.F(), null, null, 0L, nv0Var27, 48, 12);
                    mg3.b(oz2.M(2131624470, nv0Var27), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var27, 0, 0, 262142);
                }
                break;
        }
        return dm3Var;
    }
}
