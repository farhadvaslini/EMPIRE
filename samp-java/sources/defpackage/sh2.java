package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sh2 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ zs0 h;

    public /* synthetic */ sh2(List list, zs0 zs0Var, int i) {
        this.f = i;
        this.g = list;
        this.h = zs0Var;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        List list = this.g;
        zs0 zs0Var = this.h;
        int i2 = 1;
        switch (i) {
            case 0:
                nc1 nc1Var = (nc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                nv0 nv0Var = (nv0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (nv0Var.f(nc1Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= nv0Var.d(iIntValue) ? 32 : 16;
                }
                if (!nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
                    nv0Var.U();
                } else {
                    zx1 zx1Var = (zx1) list.get(iIntValue);
                    nv0Var.a0(-1106841483);
                    r51.c(zx1Var, (ss0) zs0Var, nv0Var, 0);
                    gq.g(null, 0.0f, 0L, nv0Var, 0, 7);
                    nv0Var.p(false);
                }
                break;
            case 1:
                nc1 nc1Var2 = (nc1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                nv0 nv0Var2 = (nv0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (nv0Var2.f(nc1Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= nv0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!nv0Var2.R(i4 & 1, (i4 & 147) != 146)) {
                    nv0Var2.U();
                } else {
                    n72 n72Var = (n72) list.get(iIntValue3);
                    nv0Var2.a0(-1202866990);
                    r51.d(n72Var, (ss0) zs0Var, nv0Var2, 0);
                    gq.g(null, 0.0f, 0L, nv0Var2, 0, 7);
                    nv0Var2.p(false);
                }
                break;
            default:
                nc1 nc1Var3 = (nc1) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                nv0 nv0Var3 = (nv0) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ns0 ns0Var = (ns0) zs0Var;
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (nv0Var3.f(nc1Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= nv0Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!nv0Var3.R(i5 & 1, (i5 & 147) != 146)) {
                    nv0Var3.U();
                } else {
                    yj1 yj1Var = (yj1) list.get(iIntValue5);
                    nv0Var3.a0(-1817015457);
                    bq1 bq1VarK = f80.K(j43.c(yp1.a, 1.0f), 16.0f, 4.0f);
                    boolean zF = nv0Var3.f(ns0Var) | nv0Var3.h(yj1Var);
                    Object objO = nv0Var3.O();
                    if (zF || objO == c20.a) {
                        objO = new gw(5, ns0Var, yj1Var);
                        nv0Var3.j0(objO);
                    }
                    gv3.h(rn.y(bq1VarK, false, null, (cs0) objO, 15), ((fy) nv0Var3.j(hy.a)).F, null, false, gq.N(-836994514, new w90(i2, yj1Var), nv0Var3), nv0Var3, 27648, 4);
                    nv0Var3.p(false);
                }
                break;
        }
        return dm3Var;
    }
}
