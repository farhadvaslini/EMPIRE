package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uv implements ns0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ List g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ zs0 m;
    public final /* synthetic */ Object n;

    public /* synthetic */ uv(bv bvVar, String str, ns0 ns0Var, cs0 cs0Var, boolean z, List list, hv hvVar, ns0 ns0Var2) {
        this.k = bvVar;
        this.l = str;
        this.h = ns0Var;
        this.m = cs0Var;
        this.j = z;
        this.g = list;
        this.n = hvVar;
        this.i = ns0Var2;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        String str;
        r72 r72Var;
        String str2;
        int i = this.f;
        int i2 = 4;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.n;
        zs0 zs0Var = this.m;
        final ns0 ns0Var = this.h;
        Object obj3 = this.l;
        Object obj4 = this.k;
        final int i3 = 0;
        final int i4 = 1;
        switch (i) {
            case 0:
                bv bvVar = (bv) obj4;
                final String str3 = (String) obj3;
                cs0 cs0Var = (cs0) zs0Var;
                hv hvVar = (hv) obj2;
                ae1 ae1Var = (ae1) obj;
                ae1Var.getClass();
                ae1.W(ae1Var, null, new d00(317500319, new ss0() { // from class: xv
                    @Override // defpackage.ss0
                    public final Object e(Object obj5, Object obj6, Object obj7) {
                        int i5 = i3;
                        dm3 dm3Var2 = dm3.a;
                        yp1 yp1Var = yp1.a;
                        switch (i5) {
                            case 0:
                                nv0 nv0Var = (nv0) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                ((nc1) obj5).getClass();
                                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    nv0Var.U();
                                } else {
                                    g12.m(str3, ns0Var, j43.c(yp1Var, 1.0f), false, false, null, vm1.r, null, vm1.s, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 102236544, 12582912, 8257208);
                                }
                                break;
                            default:
                                nv0 nv0Var2 = (nv0) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                ((nc1) obj5).getClass();
                                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    nv0Var2.U();
                                } else {
                                    g12.m(str3, ns0Var, j43.c(yp1Var, 1.0f), false, false, null, cl3.J, null, cl3.K, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var2, 102236544, 12582912, 8257208);
                                }
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 3);
                if (s51.n(bvVar, zu.a)) {
                    ae1.W(ae1Var, null, vm1.t, 3);
                } else {
                    boolean z = bvVar instanceof yu;
                    boolean z2 = this.j;
                    if (z) {
                        ae1.W(ae1Var, null, new d00(-1480509218, new yv(bvVar, z2, cs0Var, i3), true), 3);
                    } else {
                        if (!(bvVar instanceof av)) {
                            c.k();
                            return null;
                        }
                        av avVar = (av) bvVar;
                        ai1 ai1Var = avVar.a;
                        if (avVar.c && avVar.b != null) {
                            ae1.W(ae1Var, null, new d00(807357028, new ir(1, bvVar), true), 3);
                        }
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = ai1Var.listIterator(0);
                        while (true) {
                            jy0 jy0Var = (jy0) listIterator;
                            if (jy0Var.hasNext()) {
                                Object next = jy0Var.next();
                                vu vuVar = (vu) next;
                                if (y93.q0(str3) || y93.h0(vuVar.b, str3, true) || y93.h0(vuVar.a, str3, true) || y93.h0(vuVar.e, str3, true) || ((str = vuVar.f) != null && y93.h0(str, str3, true))) {
                                    arrayList.add(next);
                                }
                            } else if (ai1Var.isEmpty()) {
                                ae1.W(ae1Var, null, vm1.v, 3);
                            } else if (arrayList.isEmpty()) {
                                ae1.W(ae1Var, null, vm1.w, 3);
                            } else {
                                ae1Var.X(arrayList.size(), new la(i2, new u0(27), arrayList), new wa(1, arrayList), new d00(802480018, new hw(arrayList, this.g, hvVar, z2, this.i, 0), true));
                            }
                        }
                    }
                }
                ae1.W(ae1Var, null, vm1.x, 3);
                return dm3Var;
            case 1:
                List list = (List) obj4;
                rs0 rs0Var = (rs0) zs0Var;
                ns0 ns0Var2 = (ns0) obj2;
                ae1 ae1Var2 = (ae1) obj;
                ae1Var2.getClass();
                ae1.W(ae1Var2, null, new d00(-1082161722, new w91(9, (z31) obj3, ns0Var), true), 3);
                if (this.g.isEmpty()) {
                    ae1.W(ae1Var2, null, cl3.G, 3);
                } else if (list.isEmpty()) {
                    ae1.W(ae1Var2, null, cl3.H, 3);
                } else {
                    ae1Var2.X(list.size(), new la(15, new s12(17), list), new jw(4, list), new d00(802480018, new hw(list, rs0Var, this.i, ns0Var2, this.j), true));
                }
                ae1.W(ae1Var2, null, cl3.I, 3);
                return dm3Var;
            default:
                c82 c82Var = (c82) obj4;
                final String str4 = (String) obj3;
                cs0 cs0Var2 = (cs0) zs0Var;
                i92 i92Var = (i92) obj2;
                ae1 ae1Var3 = (ae1) obj;
                ae1Var3.getClass();
                ae1.W(ae1Var3, null, new d00(-2104619851, new ss0() { // from class: xv
                    @Override // defpackage.ss0
                    public final Object e(Object obj5, Object obj6, Object obj7) {
                        int i5 = i4;
                        dm3 dm3Var2 = dm3.a;
                        yp1 yp1Var = yp1.a;
                        switch (i5) {
                            case 0:
                                nv0 nv0Var = (nv0) obj6;
                                int iIntValue = ((Integer) obj7).intValue();
                                ((nc1) obj5).getClass();
                                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    nv0Var.U();
                                } else {
                                    g12.m(str4, ns0Var, j43.c(yp1Var, 1.0f), false, false, null, vm1.r, null, vm1.s, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var, 102236544, 12582912, 8257208);
                                }
                                break;
                            default:
                                nv0 nv0Var2 = (nv0) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                ((nc1) obj5).getClass();
                                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    nv0Var2.U();
                                } else {
                                    g12.m(str4, ns0Var, j43.c(yp1Var, 1.0f), false, false, null, cl3.J, null, cl3.K, null, null, false, null, null, null, true, 0, 0, null, null, nv0Var2, 102236544, 12582912, 8257208);
                                }
                                break;
                        }
                        return dm3Var2;
                    }
                }, true), 3);
                if (s51.n(c82Var, a82.a)) {
                    ae1.W(ae1Var3, null, cl3.L, 3);
                } else {
                    int i5 = 8;
                    if (c82Var instanceof z72) {
                        ae1.W(ae1Var3, null, new d00(760933014, new w91(i5, c82Var, cs0Var2), true), 3);
                    } else {
                        if (!(c82Var instanceof b82)) {
                            c.k();
                            return null;
                        }
                        b82 b82Var = (b82) c82Var;
                        ai1 ai1Var2 = b82Var.a;
                        if (b82Var.c && b82Var.b != null) {
                            ae1.W(ae1Var3, null, new d00(1930770000, new ir(8, c82Var), true), 3);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ListIterator listIterator2 = ai1Var2.listIterator(0);
                        while (true) {
                            jy0 jy0Var2 = (jy0) listIterator2;
                            if (jy0Var2.hasNext()) {
                                Object next2 = jy0Var2.next();
                                w72 w72Var = (w72) next2;
                                if (y93.q0(str4) || y93.h0(w72Var.b, str4, true) || y93.h0(w72Var.a, str4, true) || y93.h0(w72Var.e, str4, true) || ((r72Var = w72Var.f) != null && (str2 = r72Var.a) != null && y93.h0(str2, str4, true))) {
                                    arrayList2.add(next2);
                                }
                            } else if (ai1Var2.isEmpty()) {
                                ae1.W(ae1Var3, null, cl3.N, 3);
                            } else if (arrayList2.isEmpty()) {
                                ae1.W(ae1Var3, null, cl3.O, 3);
                            } else {
                                ae1Var3.X(arrayList2.size(), new la(12, new s12(16), arrayList2), new wa(2, arrayList2), new d00(802480018, new hw(arrayList2, this.g, i92Var, this.j, this.i, 1), true));
                            }
                        }
                    }
                }
                ae1.W(ae1Var3, null, cl3.P, 3);
                return dm3Var;
        }
    }

    public /* synthetic */ uv(c82 c82Var, String str, ns0 ns0Var, cs0 cs0Var, List list, i92 i92Var, boolean z, ns0 ns0Var2) {
        this.k = c82Var;
        this.l = str;
        this.h = ns0Var;
        this.m = cs0Var;
        this.g = list;
        this.n = i92Var;
        this.j = z;
        this.i = ns0Var2;
    }

    public /* synthetic */ uv(List list, List list2, z31 z31Var, ns0 ns0Var, rs0 rs0Var, ns0 ns0Var2, ns0 ns0Var3, boolean z) {
        this.g = list;
        this.k = list2;
        this.l = z31Var;
        this.h = ns0Var;
        this.m = rs0Var;
        this.i = ns0Var2;
        this.n = ns0Var3;
        this.j = z;
    }
}
