package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kk1 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    public /* synthetic */ kk1(int i, List list) {
        this.f = i;
        this.g = list;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        List list = this.g;
        switch (i) {
            case 0:
                nc1 nc1Var = (nc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                nv0 nv0Var = (nv0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (nv0Var.f(nc1Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= nv0Var.d(iIntValue) ? 32 : 16;
                }
                if (!nv0Var.R(i2 & 1, (i2 & 147) != 146)) {
                    nv0Var.U();
                } else {
                    String str = (String) list.get(iIntValue);
                    nv0Var.a0(-500331209);
                    mg3.b(str, null, 0L, oz2.w(10), null, zb3.c, 0L, null, oz2.w(14), 0, false, 0, 0, null, nv0Var, 24576, 48, 259950);
                    nv0Var.p(false);
                }
                break;
            case 1:
                nc1 nc1Var2 = (nc1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                nv0 nv0Var2 = (nv0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (nv0Var2.f(nc1Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= nv0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!nv0Var2.R(i3 & 1, (i3 & 147) != 146)) {
                    nv0Var2.U();
                } else {
                    up2 up2Var = (up2) list.get(iIntValue3);
                    nv0Var2.a0(633995682);
                    bq1 bq1VarC = j43.c(yp1.a, 1.0f);
                    dp2 dp2VarA = cp2.a(n92.f, f5.p, nv0Var2, 6);
                    int iHashCode = Long.hashCode(nv0Var2.T);
                    n52 n52VarL = nv0Var2.l();
                    bq1 bq1VarM = lr.M(nv0Var2, bq1VarC);
                    w10.c.getClass();
                    nv0Var2.d0();
                    if (nv0Var2.S) {
                        nv0Var2.k(tb1.Y);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(f5.E, nv0Var2, dp2VarA);
                    y02.F(f5.D, nv0Var2, n52VarL);
                    y02.F(f5.F, nv0Var2, Integer.valueOf(iHashCode));
                    y02.C(nv0Var2);
                    y02.F(f5.C, nv0Var2, bq1VarM);
                    String str2 = up2Var.a;
                    r93 r93Var = ql3.a;
                    mg3.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).k, nv0Var2, 0, 0, 131070);
                    mg3.b(String.valueOf(up2Var.b), null, 0L, 0L, xq0.i, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(r93Var)).k, nv0Var2, 1572864, 0, 131006);
                    nv0Var2.p(true);
                    nv0Var2.p(false);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                nc1 nc1Var3 = (nc1) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                nv0 nv0Var3 = (nv0) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (nv0Var3.f(nc1Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= nv0Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!nv0Var3.R(i4 & 1, (i4 & 147) != 146)) {
                    nv0Var3.U();
                } else {
                    Map.Entry entry = (Map.Entry) list.get(iIntValue5);
                    nv0Var3.a0(1242169593);
                    gv3.q((String) entry.getKey(), (String) entry.getValue(), nv0Var3, 0);
                    nv0Var3.p(false);
                }
                break;
            default:
                nc1 nc1Var4 = (nc1) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                nv0 nv0Var4 = (nv0) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i5 = (iIntValue8 & 6) == 0 ? iIntValue8 | (nv0Var4.f(nc1Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= nv0Var4.d(iIntValue7) ? 32 : 16;
                }
                if (!nv0Var4.R(i5 & 1, (i5 & 147) != 146)) {
                    nv0Var4.U();
                } else {
                    re3 re3Var = (re3) ((ArrayList) list).get(iIntValue7);
                    nv0Var4.a0(-794141929);
                    nv0Var4.a0(-793962813);
                    nv0Var4.p(false);
                    n92.d(re3Var, null, nv0Var4, 0);
                    nv0Var4.p(false);
                }
                break;
        }
        return dm3Var;
    }
}
