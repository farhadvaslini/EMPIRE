package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class f62 implements cs0 {
    public final /* synthetic */ int f;

    public /* synthetic */ f62(int i) {
        this.f = i;
    }

    @Override // defpackage.cs0
    public final Object a() {
        Object obj = null;
        switch (this.f) {
            case 0:
                t20 t20Var = g62.a;
                return null;
            case 1:
                j90 j90Var = ac0.a;
                return x80.h;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                r93 r93Var = i72.a;
                return null;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return b32.w(z31.f);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return b32.w("");
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(l92.g.a());
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return new af2(new ed(Float.valueOf(0.0f), rn.f1, obj, 12));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return new a42(0);
            case 8:
                return new ho2();
            case vr.g /* 9 */:
                return new eq2(new LinkedHashMap());
            case vr.h /* 10 */:
                r93 r93Var2 = iq2.a;
                return null;
            case 11:
                return new es2(0);
            case vr.i /* 12 */:
                t20 t20Var2 = nu2.a;
                return null;
            case 13:
                return b32.w(jz2.f);
            case 14:
                return b32.w("");
            case jo3.g /* 15 */:
                List list = p03.a;
                return dm3.a;
            case 16:
                return new f23();
            case 17:
                return new jd0(0.0f);
            case 18:
                t20 t20Var3 = he3.a;
                return null;
            case 19:
                return sl3.a;
            case 20:
                return new i41(0L);
            case 21:
                return new i41(0L);
            case 22:
                return y90.a;
            default:
                return new ol3();
        }
    }
}
