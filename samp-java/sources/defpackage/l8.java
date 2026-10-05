package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class l8 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ os1 g;

    public /* synthetic */ l8(os1 os1Var, int i) {
        this.f = i;
        this.g = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        int i2 = 26;
        x91 x91Var = tb1.Y;
        yp1 yp1Var = yp1.a;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new u0(8);
                        nv0Var.j0(objO);
                    }
                    f80.c(su2.a(yp1Var, false, (ns0) objO), (rs0) os1Var.getValue(), nv0Var, 0);
                }
                break;
            case 1:
                os1Var.setValue(new wj3(lr.o((m41) obj, (m41) obj2)));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                os1Var.setValue(new wj3(lr.o((m41) obj, (m41) obj2)));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    kk0.a.a(((Boolean) os1Var.getValue()).booleanValue(), null, nv0Var2, 384);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    Object objO2 = nv0Var3.O();
                    if (objO2 == zjVar) {
                        objO2 = new yb(os1Var, 14);
                        nv0Var3.j0(objO2);
                    }
                    gq.m((cs0) objO2, null, false, null, null, null, rn.l, nv0Var3, 805306374, 510);
                }
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    Object objO3 = nv0Var4.O();
                    if (objO3 == zjVar) {
                        objO3 = new yb(os1Var, 13);
                        nv0Var4.j0(objO3);
                    }
                    gq.m((cs0) objO3, null, false, null, null, null, rn.s, nv0Var4, 805306374, 510);
                }
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    kk0.a.a(((Boolean) os1Var.getValue()).booleanValue(), null, nv0Var5, 384);
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var6.U();
                } else {
                    Object objO4 = nv0Var6.O();
                    if (objO4 == zjVar) {
                        objO4 = new yb(os1Var, 26);
                        nv0Var6.j0(objO4);
                    }
                    gq.m((cs0) objO4, null, false, null, null, null, cl3.y, nv0Var6, 805306374, 510);
                }
                break;
            case 8:
                String str = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str.getClass();
                os1Var.setValue(zBooleanValue ? oz2.F((Set) os1Var.getValue(), str) : oz2.A((Set) os1Var.getValue(), str));
                break;
            case vr.g /* 9 */:
                String str2 = (String) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                str2.getClass();
                os1Var.setValue(zBooleanValue2 ? oz2.F((Set) os1Var.getValue(), str2) : oz2.A((Set) os1Var.getValue(), str2));
                break;
            case vr.h /* 10 */:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var7.U();
                } else {
                    Object objO5 = nv0Var7.O();
                    if (objO5 == zjVar) {
                        objO5 = new yb(os1Var, 25);
                        nv0Var7.j0(objO5);
                    }
                    gq.m((cs0) objO5, null, false, null, null, null, cl3.B, nv0Var7, 805306374, 510);
                }
                break;
            case 11:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var8.U();
                } else {
                    Object objO6 = nv0Var8.O();
                    if (objO6 == zjVar) {
                        objO6 = new yb(os1Var, 24);
                        nv0Var8.j0(objO6);
                    }
                    gq.m((cs0) objO6, null, false, null, null, null, cl3.E, nv0Var8, 805306374, 510);
                }
                break;
            case vr.i /* 12 */:
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var9.U();
                } else {
                    qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var9, 6);
                    int iHashCode = Long.hashCode(nv0Var9.T);
                    n52 n52VarL = nv0Var9.l();
                    bq1 bq1VarM = lr.M(nv0Var9, yp1Var);
                    w10.c.getClass();
                    nv0Var9.d0();
                    if (nv0Var9.S) {
                        nv0Var9.k(x91Var);
                    } else {
                        nv0Var9.m0();
                    }
                    y02.F(f5.E, nv0Var9, qyVarA);
                    y02.F(f5.D, nv0Var9, n52VarL);
                    y02.F(f5.F, nv0Var9, Integer.valueOf(iHashCode));
                    y02.C(nv0Var9);
                    y02.F(f5.C, nv0Var9, bq1VarM);
                    String str3 = (String) os1Var.getValue();
                    j42 j42Var = new j42();
                    o71 o71Var = new o71(7, 0, 123);
                    bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                    Object objO7 = nv0Var9.O();
                    if (objO7 == zjVar) {
                        objO7 = new zb(os1Var, 19);
                        nv0Var9.j0(objO7);
                    }
                    g12.m(str3, (ns0) objO7, bq1VarC, false, false, null, n92.z, null, null, null, null, false, j42Var, o71Var, null, true, 0, 0, null, null, nv0Var9, 1573296, 12779520, 8208312);
                    mg3.b(oz2.M(2131624583, nv0Var9), null, ((fy) nv0Var9.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var9.j(ql3.a)).l, nv0Var9, 0, 0, 131066);
                    nv0Var9.p(true);
                }
                break;
            case 13:
                nv0 nv0Var10 = (nv0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nv0Var10.U();
                } else {
                    kk0.a.a(((Boolean) os1Var.getValue()).booleanValue(), null, nv0Var10, 384);
                }
                break;
            case 14:
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!nv0Var11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nv0Var11.U();
                } else {
                    boolean zF = nv0Var11.f(os1Var);
                    Object objO8 = nv0Var11.O();
                    if (zF || objO8 == zjVar) {
                        objO8 = new mh2(os1Var, 22);
                        nv0Var11.j0(objO8);
                    }
                    gv3.f((cs0) objO8, null, false, null, null, rn.E, nv0Var11, 1572864, 62);
                }
                break;
            case jo3.g /* 15 */:
                nv0 nv0Var12 = (nv0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!nv0Var12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    nv0Var12.U();
                } else {
                    kk0.a.a(((Boolean) os1Var.getValue()).booleanValue(), null, nv0Var12, 384);
                }
                break;
            case 16:
                nv0 nv0Var13 = (nv0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!nv0Var13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    nv0Var13.U();
                } else {
                    Object objO9 = nv0Var13.O();
                    if (objO9 == zjVar) {
                        objO9 = new d03(os1Var, 2);
                        nv0Var13.j0(objO9);
                    }
                    gq.m((cs0) objO9, null, false, null, null, null, f80.R, nv0Var13, 805306374, 510);
                }
                break;
            case 17:
                nv0 nv0Var14 = (nv0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!nv0Var14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    nv0Var14.U();
                } else {
                    Object objO10 = nv0Var14.O();
                    if (objO10 == zjVar) {
                        objO10 = new d03(os1Var, 3);
                        nv0Var14.j0(objO10);
                    }
                    gq.m((cs0) objO10, null, false, null, null, null, f80.J, nv0Var14, 805306374, 510);
                }
                break;
            case 18:
                nv0 nv0Var15 = (nv0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!nv0Var15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    nv0Var15.U();
                } else {
                    Object objO11 = nv0Var15.O();
                    if (objO11 == zjVar) {
                        objO11 = new mh2(os1Var, 29);
                        nv0Var15.j0(objO11);
                    }
                    gv3.f((cs0) objO11, null, false, null, null, f80.D, nv0Var15, 1572870, 62);
                }
                break;
            case 19:
                nv0 nv0Var16 = (nv0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!nv0Var16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    nv0Var16.U();
                } else {
                    Object objO12 = nv0Var16.O();
                    if (objO12 == zjVar) {
                        objO12 = new mh2(os1Var, 25);
                        nv0Var16.j0(objO12);
                    }
                    gq.m((cs0) objO12, null, false, null, null, null, f80.P, nv0Var16, 805306374, 510);
                }
                break;
            case 20:
                nv0 nv0Var17 = (nv0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!nv0Var17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    nv0Var17.U();
                } else {
                    String str4 = (String) os1Var.getValue();
                    str4.getClass();
                    byte[] bytes = str4.getBytes(ys.a);
                    bytes.getClass();
                    mg3.b(oz2.N(2131624185, new Object[]{Integer.valueOf(bytes.length), 24}, nv0Var17), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var17, 0, 0, 262142);
                }
                break;
            case 21:
                nv0 nv0Var18 = (nv0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!nv0Var18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    nv0Var18.U();
                } else {
                    String str5 = (String) os1Var.getValue();
                    bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                    boolean zF2 = nv0Var18.f(os1Var);
                    Object objO13 = nv0Var18.O();
                    if (zF2 || objO13 == zjVar) {
                        objO13 = new zb(os1Var, 27);
                        nv0Var18.j0(objO13);
                    }
                    g12.m(str5, (ns0) objO13, bq1VarC2, false, false, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var18, 384, 12582912, 8257528);
                }
                break;
            case 22:
                nv0 nv0Var19 = (nv0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!nv0Var19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    nv0Var19.U();
                } else {
                    qy qyVarA2 = oy.a(n92.d, f5.s, nv0Var19, 0);
                    int iHashCode2 = Long.hashCode(nv0Var19.T);
                    n52 n52VarL2 = nv0Var19.l();
                    bq1 bq1VarM2 = lr.M(nv0Var19, yp1Var);
                    w10.c.getClass();
                    nv0Var19.d0();
                    if (nv0Var19.S) {
                        nv0Var19.k(x91Var);
                    } else {
                        nv0Var19.m0();
                    }
                    y02.F(f5.E, nv0Var19, qyVarA2);
                    y02.F(f5.D, nv0Var19, n52VarL2);
                    y02.F(f5.F, nv0Var19, Integer.valueOf(iHashCode2));
                    y02.C(nv0Var19);
                    y02.F(f5.C, nv0Var19, bq1VarM2);
                    mg3.b(oz2.M(2131624187, nv0Var19), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var19, 0, 0, 262142);
                    oz2.g(nv0Var19, j43.e(yp1Var, 12.0f));
                    String str6 = (String) os1Var.getValue();
                    bq1 bq1VarC3 = j43.c(yp1Var, 1.0f);
                    boolean zF3 = nv0Var19.f(os1Var);
                    Object objO14 = nv0Var19.O();
                    if (zF3 || objO14 == zjVar) {
                        objO14 = new zb(os1Var, i2);
                        nv0Var19.j0(objO14);
                    }
                    g12.m(str6, (ns0) objO14, bq1VarC3, false, false, null, null, null, null, null, gq.N(-56083721, new l8(os1Var, 20), nv0Var19), false, null, null, null, true, 0, 0, null, null, nv0Var19, 384, 12583296, 8253432);
                    nv0Var19.p(true);
                }
                break;
            default:
                nv0 nv0Var20 = (nv0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!nv0Var20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    nv0Var20.U();
                } else {
                    Object objO15 = nv0Var20.O();
                    if (objO15 == zjVar) {
                        objO15 = new d03(os1Var, 17);
                        nv0Var20.j0(objO15);
                    }
                    gq.m((cs0) objO15, null, false, null, null, null, r51.a0, nv0Var20, 805306374, 510);
                }
                break;
        }
        return dm3Var;
    }
}
