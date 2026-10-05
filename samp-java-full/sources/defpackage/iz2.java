package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class iz2 implements ts0 {
    public final /* synthetic */ List f;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ rs0 i;
    public final /* synthetic */ ns0 j;
    public final /* synthetic */ ns0 k;

    public iz2(List list, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3, ns0 ns0Var4) {
        this.f = list;
        this.g = ns0Var;
        this.h = ns0Var2;
        this.i = rs0Var;
        this.j = ns0Var3;
        this.k = ns0Var4;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        nc1 nc1Var = (nc1) obj;
        int iIntValue = ((Number) obj2).intValue();
        nv0 nv0Var = (nv0) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (nv0Var.f(nc1Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= nv0Var.d(iIntValue) ? 32 : 16;
        }
        if (nv0Var.R(i & 1, (i & 147) != 146)) {
            yv2 yv2Var = (yv2) this.f.get(iIntValue);
            nv0Var.a0(1977735653);
            f80.o(yv2Var, this.g, this.h, this.i, this.j, this.k, null, true, nv0Var, 14155784);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
