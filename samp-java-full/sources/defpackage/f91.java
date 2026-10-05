package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class f91 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ zs0 h;
    public final /* synthetic */ Object i;

    public /* synthetic */ f91(List list, zs0 zs0Var, Object obj, int i) {
        this.f = i;
        this.g = list;
        this.h = zs0Var;
        this.i = obj;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f;
        int i2 = 3;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.h;
        List list = this.g;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                nc1 nc1Var = (nc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                nv0 nv0Var = (nv0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ns0 ns0Var = (ns0) zs0Var;
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (nv0Var.f(nc1Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= nv0Var.d(iIntValue) ? 32 : 16;
                }
                if (!nv0Var.R(i3 & 1, (i3 & 147) != 146)) {
                    nv0Var.U();
                } else {
                    vg2 vg2Var = (vg2) list.get(iIntValue);
                    nv0Var.a0(1120899471);
                    boolean zF = nv0Var.f(ns0Var) | nv0Var.h(vg2Var);
                    Object objO = nv0Var.O();
                    if (zF || objO == zjVar) {
                        objO = new gw(3, ns0Var, vg2Var);
                        nv0Var.j0(objO);
                    }
                    cs0 cs0Var = (cs0) objO;
                    boolean zH = nv0Var.h(vg2Var);
                    Object objO2 = nv0Var.O();
                    if (zH || objO2 == zjVar) {
                        objO2 = new p90(2, vg2Var);
                        nv0Var.j0(objO2);
                    }
                    cs0 cs0Var2 = (cs0) objO2;
                    boolean zH2 = nv0Var.h(vg2Var);
                    Object objO3 = nv0Var.O();
                    if (zH2 || objO3 == zjVar) {
                        objO3 = new gw(4, vg2Var, (os1) obj5);
                        nv0Var.j0(objO3);
                    }
                    w7.n(vg2Var, cs0Var, cs0Var2, (cs0) objO3, nv0Var, 8);
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
                    gp3 gp3Var = (gp3) list.get(iIntValue3);
                    nv0Var2.a0(-1113828084);
                    r51.e(gp3Var, (ss0) zs0Var, (rs0) obj5, nv0Var2, 0);
                    gq.g(null, 0.0f, 0L, nv0Var2, 0, 7);
                    nv0Var2.p(false);
                }
                break;
            default:
                nc1 nc1Var3 = (nc1) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                nv0 nv0Var3 = (nv0) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                a42 a42Var = (a42) obj5;
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (nv0Var3.f(nc1Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= nv0Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!nv0Var3.R(i5 & 1, (i5 & 147) != 146)) {
                    nv0Var3.U();
                } else {
                    n72 n72Var = (n72) list.get(iIntValue5);
                    nv0Var3.a0(-2024209800);
                    boolean z = n72Var.a == a42Var.g();
                    ns0 ns0Var2 = (ns0) zs0Var;
                    Object objO4 = nv0Var3.O();
                    if (objO4 == zjVar) {
                        objO4 = new va(i2, a42Var);
                        nv0Var3.j0(objO4);
                    }
                    s51.h(n72Var, iIntValue5, z, ns0Var2, (ns0) objO4, nv0Var3, 24576 | (i5 & 112));
                    gq.g(null, 0.0f, 0L, nv0Var3, 0, 7);
                    nv0Var3.p(false);
                }
                break;
        }
        return dm3Var;
    }
}
