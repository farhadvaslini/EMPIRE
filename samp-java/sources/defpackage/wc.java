package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class wc implements rs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ wc(int i) {
        this.f = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        int i2 = 0;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                pq3 pq3VarZ = cl3.z((tb1) obj);
                int iOrdinal = ((bb1) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        c.k();
                    } else {
                        i2 = 1;
                    }
                }
                pq3VarZ.setLayoutDirection(i2);
                break;
            case 1:
                cl3.z((tb1) obj).setUpdateBlock((ns0) obj2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                cl3.z((tb1) obj).setReleaseBlock((ns0) obj2);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                cl3.z((tb1) obj).setModifier((bq1) obj2);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                cl3.z((tb1) obj).setDensity((ua0) obj2);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                cl3.z((tb1) obj).setLifecycleOwner((of1) obj2);
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                cl3.z((tb1) obj).setSavedStateRegistryOwner((wq2) obj2);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = (String) obj;
                m50 m50Var = (m50) obj2;
                str.getClass();
                m50Var.getClass();
                if (str.length() != 0) {
                }
                break;
            case 8:
                StringBuilder sb = (StringBuilder) obj;
                zp1 zp1Var = (zp1) obj2;
                if (sb.length() > 1) {
                    sb.append(", ");
                }
                sb.append(zp1Var);
                break;
            case vr.g /* 9 */:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                }
                break;
            case vr.h /* 10 */:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                }
                break;
            case 11:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    s01.a(d32.q(), oz2.M(2131624138, nv0Var3), null, 0L, nv0Var3, 0, 12);
                }
                break;
            case vr.i /* 12 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else {
                    s01.a(gq.E(), oz2.M(2131624134, nv0Var4), null, ((fy) nv0Var4.j(hy.a)).w, nv0Var4, 0, 4);
                }
                break;
            case 13:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    nv0Var5.U();
                } else {
                    mg3.b(oz2.M(2131624144, nv0Var5), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var5, 0, 0, 262142);
                }
                break;
            case 14:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    nv0Var6.U();
                } else {
                    s01.a(y02.r(), null, null, 0L, nv0Var6, 48, 12);
                }
                break;
            case jo3.g /* 15 */:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var7.U();
                } else {
                    mg3.b(oz2.M(2131624147, nv0Var7), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var7, 0, 0, 262142);
                }
                break;
            case 16:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var8.U();
                } else {
                    mg3.b(oz2.M(2131624223, nv0Var8), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var8, 0, 0, 262142);
                }
                break;
            case 17:
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var9.U();
                } else {
                    mg3.b(oz2.M(2131624355, nv0Var9), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var9, 0, 0, 262142);
                }
                break;
            case 18:
                nv0 nv0Var10 = (nv0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nv0Var10.U();
                } else {
                    mg3.b(oz2.M(2131624287, nv0Var10), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var10, 0, 0, 262142);
                }
                break;
            case 19:
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!nv0Var11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nv0Var11.U();
                } else {
                    mg3.b(oz2.M(2131624233, nv0Var11), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var11, 0, 0, 262142);
                }
                break;
            case 20:
                nv0 nv0Var12 = (nv0) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!nv0Var12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    nv0Var12.U();
                } else {
                    mg3.b(oz2.M(2131624235, nv0Var12), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var12, 0, 0, 262142);
                }
                break;
            case 21:
                nv0 nv0Var13 = (nv0) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!nv0Var13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    nv0Var13.U();
                } else {
                    mg3.b(oz2.M(2131624230, nv0Var13), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var13, 0, 0, 262142);
                }
                break;
            case 22:
                nv0 nv0Var14 = (nv0) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!nv0Var14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    nv0Var14.U();
                } else {
                    mg3.b(oz2.M(2131624234, nv0Var14), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var14, 0, 0, 262142);
                }
                break;
            case 23:
                nv0 nv0Var15 = (nv0) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!nv0Var15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    nv0Var15.U();
                } else {
                    mg3.b(oz2.M(2131624281, nv0Var15), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var15, 0, 0, 262142);
                }
                break;
            case 24:
                nv0 nv0Var16 = (nv0) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (!nv0Var16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    nv0Var16.U();
                } else {
                    s01.a(g12.L(), oz2.M(2131624282, nv0Var16), null, ((fy) nv0Var16.j(hy.a)).s, nv0Var16, 0, 4);
                }
                break;
            case 25:
                nv0 nv0Var17 = (nv0) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (!nv0Var17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    nv0Var17.U();
                } else {
                    s01.a(gq.E(), oz2.M(2131624109, nv0Var17), null, ((fy) nv0Var17.j(hy.a)).w, nv0Var17, 0, 4);
                }
                break;
            case 26:
                nv0 nv0Var18 = (nv0) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (!nv0Var18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    nv0Var18.U();
                } else {
                    s01.a(gv3.B(), oz2.M(2131624286, nv0Var18), null, 0L, nv0Var18, 0, 12);
                }
                break;
            case 27:
                nv0 nv0Var19 = (nv0) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (!nv0Var19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    nv0Var19.U();
                } else {
                    mg3.b(oz2.M(2131624274, nv0Var19), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var19, 0, 0, 262142);
                }
                break;
            case 28:
                nv0 nv0Var20 = (nv0) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (!nv0Var20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    nv0Var20.U();
                } else {
                    mg3.b(oz2.M(2131624252, nv0Var20), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var20, 0, 0, 262142);
                }
                break;
            default:
                nv0 nv0Var21 = (nv0) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (!nv0Var21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    nv0Var21.U();
                } else {
                    s01.a(s51.v(), oz2.M(2131624103, nv0Var21), null, 0L, nv0Var21, 0, 12);
                }
                break;
        }
        return dm3Var;
    }
}
