package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l00 implements rs0 {
    public static final l00 g = new l00(0);
    public static final l00 h = new l00(1);
    public static final l00 i = new l00(2);
    public static final l00 j = new l00(3);
    public static final l00 k = new l00(4);
    public static final l00 l = new l00(5);
    public static final l00 m = new l00(6);
    public static final l00 n = new l00(7);
    public static final l00 o = new l00(8);
    public static final l00 p = new l00(9);
    public static final l00 q = new l00(10);
    public static final l00 r = new l00(11);
    public static final l00 s = new l00(12);
    public static final l00 t = new l00(13);
    public static final l00 u = new l00(14);
    public static final l00 v = new l00(15);
    public final /* synthetic */ int f;

    public /* synthetic */ l00(int i2) {
        this.f = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        String str;
        zs0 zs0Var;
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        switch (i2) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                }
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (nv0Var5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    on.a.a(0.0f, 0.0f, 196608, 0L, nv0Var5, null, null);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (nv0Var6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    on.a.a(0.0f, 0.0f, 196608, 0L, nv0Var6, null, null);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (!nv0Var7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    nv0Var7.U();
                }
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!nv0Var8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nv0Var8.U();
                }
                return dm3Var;
            case 8:
                nv0 nv0Var9 = (nv0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!nv0Var9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    nv0Var9.U();
                }
                return dm3Var;
            case vr.g /* 9 */:
                nv0 nv0Var10 = (nv0) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!nv0Var10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    nv0Var10.U();
                }
                return dm3Var;
            case vr.h /* 10 */:
                nv0 nv0Var11 = (nv0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (!nv0Var11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    nv0Var11.U();
                }
                return dm3Var;
            case 11:
                nv0 nv0Var12 = (nv0) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (nv0Var12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    qt2.a.a(6, nv0Var12);
                } else {
                    nv0Var12.U();
                }
                return dm3Var;
            case vr.i /* 12 */:
                nv0 nv0Var13 = (nv0) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                if (nv0Var13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    gq.g(null, 0.0f, 0L, nv0Var13, 0, 7);
                } else {
                    nv0Var13.U();
                }
                return dm3Var;
            case 13:
                nv0 nv0Var14 = (nv0) obj;
                ((Number) obj2).intValue();
                nv0Var14.a0(-511854661);
                on onVar = on.a;
                WeakHashMap weakHashMap = qt3.w;
                xf1 xf1Var = new xf1(ak2.e(nv0Var14).l, 48);
                nv0Var14.p(false);
                return xf1Var;
            case 14:
                long j2 = ((wx) obj2).a;
                return j2 == 16 ? Boolean.FALSE : Integer.valueOf(vp.T(j2));
            default:
                y0 y0Var = (y0) obj;
                y0 y0Var2 = (y0) obj2;
                if (y0Var == null || (str = y0Var.a) == null) {
                    str = y0Var2.a;
                }
                if (y0Var == null || (zs0Var = y0Var.b) == null) {
                    zs0Var = y0Var2.b;
                }
                return new y0(str, zs0Var);
        }
    }
}
