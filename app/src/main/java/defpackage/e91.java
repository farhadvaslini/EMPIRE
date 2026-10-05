package defpackage;

import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e91 extends ct0 implements ns0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e91(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.m = i4;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        Object value;
        int i = this.m;
        int i2 = 5;
        int i3 = 0;
        int i4 = 1;
        int i5 = 3;
        p40 p40Var = null;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                sa1 sa1Var = (sa1) obj2;
                sa1Var.getClass();
                i93 i93Var = sa1Var.o;
                do {
                    value = i93Var.getValue();
                } while (!i93Var.h(value, g4.a((g4) value, str, null, null, 5)));
                return dm3Var;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ((sa1) obj2).p(str2);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                String str3 = (String) obj;
                str3.getClass();
                ((sa1) obj2).m(str3);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                sa1 sa1Var2 = (sa1) obj2;
                sa1Var2.getClass();
                cl3.t(f80.F(sa1Var2), null, new ma1(sa1Var2, zBooleanValue, p40Var, i2), 3);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                sa1 sa1Var3 = (sa1) obj2;
                sa1Var3.getClass();
                cl3.t(f80.F(sa1Var3), null, new ma1(sa1Var3, zBooleanValue2, p40Var, 4), 3);
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                String str4 = (String) obj;
                str4.getClass();
                sa1 sa1Var4 = (sa1) obj2;
                sa1Var4.getClass();
                cl3.t(f80.F(sa1Var4), null, new qa1(sa1Var4, str4, p40Var, i5), 3);
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                qp2 qp2Var = (qp2) obj;
                qp2Var.getClass();
                sa1 sa1Var5 = (sa1) obj2;
                sa1Var5.getClass();
                cl3.t(f80.F(sa1Var5), null, new j(sa1Var5, qp2Var, p40Var, 26), 3);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                String str5 = (String) obj;
                str5.getClass();
                sa1 sa1Var6 = (sa1) obj2;
                sa1Var6.getClass();
                i93 i93Var2 = sa1Var6.w;
                qy2 qy2Var = sa1Var6.c;
                qp2 qp2Var2 = (qp2) sa1Var6.v.getValue();
                qy2Var.getClass();
                String strF = qy2.f(str5, qp2Var2);
                i93Var2.getClass();
                i93Var2.j(null, strF);
                cl3.t(f80.F(sa1Var6), null, new qa1(sa1Var6, str5, p40Var, i3), 3);
                return dm3Var;
            case 8:
                oh3 oh3Var = (oh3) obj;
                oh3Var.getClass();
                sa1 sa1Var7 = (sa1) obj2;
                sa1Var7.getClass();
                cl3.t(f80.F(sa1Var7), null, new j(sa1Var7, oh3Var, p40Var, 29), 3);
                return dm3Var;
            case vr.g /* 9 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                go3 go3Var = (go3) obj2;
                go3Var.getClass();
                cl3.t(f80.F(go3Var), null, new fo3(go3Var, zBooleanValue3, p40Var, i3), 3);
                return dm3Var;
            case vr.h /* 10 */:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                go3 go3Var2 = (go3) obj2;
                go3Var2.getClass();
                cl3.t(f80.F(go3Var2), null, new fo3(go3Var2, zBooleanValue4, p40Var, i4), 3);
                return dm3Var;
            case 11:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                sa1 sa1Var8 = (sa1) obj2;
                sa1Var8.getClass();
                cl3.t(f80.F(sa1Var8), null, new ma1(sa1Var8, zBooleanValue5, p40Var, 2), 3);
                return dm3Var;
            case vr.i /* 12 */:
                boolean zBooleanValue6 = ((Boolean) obj).booleanValue();
                sa1 sa1Var9 = (sa1) obj2;
                sa1Var9.getClass();
                cl3.t(f80.F(sa1Var9), null, new ma1(sa1Var9, zBooleanValue6, p40Var, i5), 3);
                return dm3Var;
            case 13:
                qf2 qf2Var = (qf2) obj;
                qf2Var.getClass();
                sa1 sa1Var10 = (sa1) obj2;
                sa1Var10.getClass();
                i93 i93Var3 = sa1Var10.C;
                i93Var3.getClass();
                i93Var3.j(null, qf2Var);
                cl3.t(f80.F(sa1Var10), null, new j(sa1Var10, qf2Var, p40Var, 27), 3);
                return dm3Var;
            case 14:
                boolean zBooleanValue7 = ((Boolean) obj).booleanValue();
                sa1 sa1Var11 = (sa1) obj2;
                sa1Var11.getClass();
                cl3.t(f80.F(sa1Var11), null, new ma1(sa1Var11, zBooleanValue7, p40Var, i4), 3);
                return dm3Var;
            case jo3.g /* 15 */:
                int iIntValue = ((Number) obj).intValue();
                sa1 sa1Var12 = (sa1) obj2;
                sa1Var12.getClass();
                cl3.t(f80.F(sa1Var12), null, new ra1(sa1Var12, iIntValue, p40Var, i4), 3);
                return dm3Var;
            case 16:
                int iIntValue2 = ((Number) obj).intValue();
                sa1 sa1Var13 = (sa1) obj2;
                sa1Var13.getClass();
                cl3.t(f80.F(sa1Var13), null, new ra1(sa1Var13, iIntValue2, p40Var, i3), 3);
                return dm3Var;
            case 17:
                w72 w72Var = (w72) obj;
                w72Var.getClass();
                oa2 oa2Var = (oa2) obj2;
                oa2Var.getClass();
                i93 i93Var4 = oa2Var.o;
                if (!(i93Var4.getValue() instanceof i92)) {
                    i93Var4.j(null, new i92(f92.g, w72Var.a));
                    w83 w83VarT = cl3.t(f80.F(oa2Var), null, new m9(oa2Var, w72Var, p40Var, 8), 3);
                    oa2Var.g = w83VarT;
                    w83VarT.r(new ma2(oa2Var, w83VarT, i4));
                }
                return dm3Var;
            case 18:
                String str6 = (String) obj;
                str6.getClass();
                vi2 vi2Var = (vi2) obj2;
                vi2Var.getClass();
                i93 i93Var5 = vi2Var.z;
                i93Var5.getClass();
                i93Var5.j(null, str6);
                return dm3Var;
            case 19:
                hb0 hb0Var = (hb0) obj;
                hb0Var.getClass();
                ((vi2) obj2).j(hb0Var);
                return dm3Var;
            case 20:
                hb0 hb0Var2 = (hb0) obj;
                hb0Var2.getClass();
                ((vi2) obj2).i(hb0Var2);
                return dm3Var;
            case 21:
                int iIntValue3 = ((Number) obj).intValue();
                vi2 vi2Var2 = (vi2) obj2;
                vi2Var2.getClass();
                RaksampNativeBridge.INSTANCE.nativeSendClickPlayer(vi2Var2.c, iIntValue3);
                return dm3Var;
            case 22:
                hb0 hb0Var3 = (hb0) obj;
                hb0Var3.getClass();
                ((vi2) obj2).j(hb0Var3);
                return dm3Var;
            case 23:
                hb0 hb0Var4 = (hb0) obj;
                hb0Var4.getClass();
                ((vi2) obj2).i(hb0Var4);
                return dm3Var;
            case 24:
                kq2 kq2Var = (kq2) obj;
                kq2Var.getClass();
                return qy2.c((qy2) obj2, kq2Var);
            case 25:
                String str7 = (String) obj;
                str7.getClass();
                return qy2.b((qy2) obj2, str7);
            case 26:
                String str8 = (String) obj;
                str8.getClass();
                return qy2.b((qy2) obj2, str8);
            case 27:
                kq2 kq2Var2 = (kq2) obj;
                kq2Var2.getClass();
                return qy2.c((qy2) obj2, kq2Var2);
            case 28:
                kq2 kq2Var3 = (kq2) obj;
                kq2Var3.getClass();
                return qy2.c((qy2) obj2, kq2Var3);
            default:
                String str9 = (String) obj;
                str9.getClass();
                return qy2.b((qy2) obj2, str9);
        }
    }
}
