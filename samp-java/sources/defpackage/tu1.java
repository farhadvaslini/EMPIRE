package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class tu1 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ tu1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        Object objPrevious;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj5 = this.j;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.k;
        switch (i) {
            case 0:
                sd sdVar = (sd) obj;
                qt1 qt1Var = (qt1) obj2;
                nv0 nv0Var = (nv0) obj3;
                ((Number) obj4).intValue();
                boolean zN = s51.n(((it2) obj8).c.getValue(), (qt1) obj7);
                if (!((Boolean) ((os1) obj5).getValue()).booleanValue() && !zN) {
                    List list = (List) ((e93) obj9).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            objPrevious = listIterator.previous();
                            if (s51.n(qt1Var, (qt1) objPrevious)) {
                            }
                        } else {
                            objPrevious = null;
                        }
                    }
                    qt1Var = (qt1) objPrevious;
                }
                if (qt1Var == null) {
                    nv0Var.a0(105930796);
                } else {
                    nv0Var.a0(-1520603531);
                    vp.i(qt1Var, (dq2) obj6, gq.N(-1263531443, new z4(6, qt1Var, sdVar), nv0Var), nv0Var, 384);
                }
                nv0Var.p(false);
                break;
            default:
                nc1 nc1Var = (nc1) obj;
                int iIntValue = ((Number) obj2).intValue();
                nv0 nv0Var2 = (nv0) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                ns0 ns0Var = (ns0) obj9;
                int i2 = (iIntValue2 & 6) == 0 ? (nv0Var2.f(nc1Var) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= nv0Var2.d(iIntValue) ? 32 : 16;
                }
                if (!nv0Var2.R(i2 & 1, (i2 & 147) != 146)) {
                    nv0Var2.U();
                } else {
                    qj2 qj2Var = (qj2) ((List) obj8).get(iIntValue);
                    nv0Var2.a0(144945959);
                    yv2 yv2Var = new yv2(new kq2(qj2Var.a, 0L, ak2.n(xy2.h), ""), qj2Var.b);
                    ns0 ns0Var2 = (ns0) obj7;
                    rs0 rs0Var = (rs0) obj6;
                    ns0 ns0Var3 = (ns0) obj5;
                    boolean zF = nv0Var2.f(ns0Var) | nv0Var2.h(qj2Var);
                    Object objO = nv0Var2.O();
                    if (zF || objO == c20.a) {
                        objO = new gw(8, ns0Var, qj2Var);
                        nv0Var2.j0(objO);
                    }
                    f80.o(yv2Var, ns0Var2, null, rs0Var, ns0Var3, null, (cs0) objO, qj2Var.c, nv0Var2, 197000);
                    nv0Var2.p(false);
                }
                break;
        }
        return dm3Var;
    }
}
