package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hg2 implements ts0 {
    public final /* synthetic */ List f;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ x50 i;
    public final /* synthetic */ lf2 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ os1 l;
    public final /* synthetic */ os1 m;

    public hg2(List list, ns0 ns0Var, cs0 cs0Var, x50 x50Var, lf2 lf2Var, String str, os1 os1Var, os1 os1Var2) {
        this.f = list;
        this.g = ns0Var;
        this.h = cs0Var;
        this.i = x50Var;
        this.j = lf2Var;
        this.k = str;
        this.l = os1Var;
        this.m = os1Var2;
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
            cf2 cf2Var = (cf2) this.f.get(iIntValue);
            nv0Var.a0(2072339680);
            ns0 ns0Var = this.g;
            boolean zF = nv0Var.f(ns0Var) | nv0Var.h(cf2Var);
            cs0 cs0Var = this.h;
            boolean zF2 = zF | nv0Var.f(cs0Var);
            Object objO = nv0Var.O();
            if (zF2 || objO == c20.a) {
                objO = new eg2(ns0Var, cf2Var, cs0Var);
                nv0Var.j0(objO);
            }
            lq.f((cs0) objO, j43.c(yp1.a, 1.0f), false, uo2.a(10.0f), gq.q(((fy) nv0Var.j(hy.a)).G, nv0Var), null, gq.N(-564354218, new gg2(cf2Var, this.i, this.j, this.k, this.l, this.m), nv0Var), nv0Var, 100663344);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
