package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hw implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ List h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ns0 j;
    public final /* synthetic */ Object k;

    public hw(List list, rs0 rs0Var, ns0 ns0Var, ns0 ns0Var2, boolean z) {
        this.f = 2;
        this.h = list;
        this.g = rs0Var;
        this.j = ns0Var;
        this.k = ns0Var2;
        this.i = z;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        Object next2;
        int i = this.f;
        boolean z = this.i;
        dm3 dm3Var = dm3.a;
        List list = this.h;
        zj zjVar = c20.a;
        Object obj5 = this.g;
        ns0 ns0Var = this.j;
        Object obj6 = this.k;
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
                    vu vuVar = (vu) ((ArrayList) obj5).get(iIntValue);
                    nv0Var.a0(-407809528);
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (s51.n(((x31) next).e, vuVar.a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    x31 x31Var = (x31) next;
                    String str = x31Var != null ? x31Var.f : null;
                    hv hvVar = (hv) obj6;
                    boolean zN = s51.n(hvVar != null ? hvVar.b : null, vuVar.a);
                    boolean z2 = !z;
                    boolean zF = nv0Var.f(ns0Var) | nv0Var.h(vuVar);
                    Object objO = nv0Var.O();
                    if (zF || objO == zjVar) {
                        objO = new gw(0, ns0Var, vuVar);
                        nv0Var.j0(objO);
                    }
                    w7.e(vuVar, str, zN, z2, (cs0) objO, nv0Var, 0);
                    nv0Var.p(false);
                }
                break;
            case 1:
                nc1 nc1Var2 = (nc1) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                nv0 nv0Var2 = (nv0) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                i92 i92Var = (i92) obj6;
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (nv0Var2.f(nc1Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= nv0Var2.d(iIntValue3) ? 32 : 16;
                }
                if (!nv0Var2.R(i3 & 1, (i3 & 147) != 146)) {
                    nv0Var2.U();
                } else {
                    w72 w72Var = (w72) ((ArrayList) obj5).get(iIntValue3);
                    nv0Var2.a0(-1643022898);
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (s51.n(((y31) next2).a.b, w72Var.a)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    y31 y31Var = (y31) next2;
                    String str2 = y31Var != null ? y31Var.a.d : null;
                    boolean z3 = s51.n(i92Var != null ? i92Var.b : null, w72Var.a) && oz2.L(f92.g, f92.h).contains(i92Var.a);
                    boolean z4 = !z;
                    boolean zF2 = nv0Var2.f(ns0Var) | nv0Var2.h(w72Var);
                    Object objO2 = nv0Var2.O();
                    if (zF2 || objO2 == zjVar) {
                        objO2 = new gw(6, ns0Var, w72Var);
                        nv0Var2.j0(objO2);
                    }
                    rn.c(w72Var, str2, z3, z4, (cs0) objO2, nv0Var2, 8);
                    nv0Var2.p(false);
                }
                break;
            default:
                nc1 nc1Var3 = (nc1) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                nv0 nv0Var3 = (nv0) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ns0 ns0Var2 = (ns0) obj6;
                rs0 rs0Var = (rs0) obj5;
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (nv0Var3.f(nc1Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= nv0Var3.d(iIntValue5) ? 32 : 16;
                }
                if (!nv0Var3.R(i4 & 1, (i4 & 147) != 146)) {
                    nv0Var3.U();
                } else {
                    y31 y31Var2 = (y31) list.get(iIntValue5);
                    nv0Var3.a0(1073579071);
                    boolean zF3 = nv0Var3.f(rs0Var) | nv0Var3.h(y31Var2);
                    Object objO3 = nv0Var3.O();
                    if (zF3 || objO3 == zjVar) {
                        objO3 = new la(13, rs0Var, y31Var2);
                        nv0Var3.j0(objO3);
                    }
                    ns0 ns0Var3 = (ns0) objO3;
                    boolean zF4 = nv0Var3.f(ns0Var) | nv0Var3.h(y31Var2);
                    Object objO4 = nv0Var3.O();
                    if (zF4 || objO4 == zjVar) {
                        objO4 = new gw(7, ns0Var, y31Var2);
                        nv0Var3.j0(objO4);
                    }
                    cs0 cs0Var = (cs0) objO4;
                    boolean zF5 = nv0Var3.f(ns0Var2) | nv0Var3.h(y31Var2);
                    Object objO5 = nv0Var3.O();
                    if (zF5 || objO5 == zjVar) {
                        objO5 = new la(14, ns0Var2, y31Var2);
                        nv0Var3.j0(objO5);
                    }
                    rn.j(y31Var2, ns0Var3, cs0Var, (ns0) objO5, this.i, nv0Var3, 0);
                    nv0Var3.p(false);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ hw(ArrayList arrayList, List list, Object obj, boolean z, ns0 ns0Var, int i) {
        this.f = i;
        this.g = arrayList;
        this.h = list;
        this.k = obj;
        this.i = z;
        this.j = ns0Var;
    }
}
