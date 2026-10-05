package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w90 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w90(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                long j = ((wx) obj).a;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.e(j) ? 4 : 2;
                }
                if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x90.b(((ee3) obj4).c, j, nv0Var, (iIntValue << 3) & 112);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                yj1 yj1Var = (yj1) obj4;
                ((ry) obj).getClass();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    vp.g(gq.N(-957542256, new ca1(yj1Var, 0), nv0Var2), null, gq.N(-460204115, new ca1(yj1Var, 1), nv0Var2), f80.t, null, null, nv0Var2, 27654, 486);
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ij3 ij3Var = (ij3) obj;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? nv0Var3.f(ij3Var) : nv0Var3.h(ij3Var) ? 4 : 2;
                }
                if (nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    gj3.a(ij3Var, null, 0.0f, null, 0L, 0L, gq.N(-999924215, new e90(8, (String) obj4), nv0Var3), nv0Var3, (iIntValue3 & 14) | 805306368);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            default:
                bq1 bq1Var = (bq1) obj;
                nv0 nv0Var4 = (nv0) obj2;
                ((Number) obj3).intValue();
                nv0Var4.a0(-1498516085);
                s83 s83VarR = uq.R(pq1.g, nv0Var4);
                s83 s83VarR2 = uq.R(pq1.i, nv0Var4);
                gk3 gk3Var = (gk3) obj4;
                bl3 bl3Var = rn.f1;
                u10 u10Var = gk3Var.a;
                d42 d42Var = gk3Var.d;
                boolean zBooleanValue = ((Boolean) u10Var.h()).booleanValue();
                nv0Var4.a0(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                nv0Var4.p(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) d42Var.getValue()).booleanValue();
                nv0Var4.a0(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                nv0Var4.p(false);
                Float fValueOf2 = Float.valueOf(f2);
                gk3Var.f();
                nv0Var4.a0(386845748);
                nv0Var4.p(false);
                ek3 ek3VarH = w7.H(gk3Var, fValueOf, fValueOf2, s83VarR, bl3Var, nv0Var4, 196608);
                boolean zBooleanValue3 = ((Boolean) gk3Var.a.h()).booleanValue();
                nv0Var4.a0(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                nv0Var4.p(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) d42Var.getValue()).booleanValue();
                nv0Var4.a0(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                nv0Var4.p(false);
                Float fValueOf4 = Float.valueOf(f4);
                gk3Var.f();
                nv0Var4.a0(-281714272);
                nv0Var4.p(false);
                bq1 bq1VarB = vm1.B(bq1Var, ((Number) ek3VarH.o.getValue()).floatValue(), ((Number) ek3VarH.o.getValue()).floatValue(), ((Number) w7.H(gk3Var, fValueOf3, fValueOf4, s83VarR2, bl3Var, nv0Var4, 196608).o.getValue()).floatValue(), 0.0f, null, 131064);
                nv0Var4.p(false);
                return bq1VarB;
        }
    }
}
