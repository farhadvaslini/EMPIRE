package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kw implements ts0 {
    public final /* synthetic */ List f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ ns0 h;

    public kw(List list, boolean z, ns0 ns0Var) {
        this.f = list;
        this.g = z;
        this.h = ns0Var;
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
            x31 x31Var = (x31) this.f.get(iIntValue);
            nv0Var.a0(-902873504);
            ns0 ns0Var = this.h;
            boolean zF = nv0Var.f(ns0Var) | nv0Var.h(x31Var);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new gw(1, ns0Var, x31Var);
                nv0Var.j0(objO);
            }
            w7.l(x31Var, this.g, (cs0) objO, nv0Var, 0);
            nv0Var.p(false);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
