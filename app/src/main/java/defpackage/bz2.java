package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bz2 implements ss0 {
    public final /* synthetic */ int f = 2;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ zs0 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ bz2(hd0 hd0Var, al0 al0Var, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, ns0 ns0Var2, cs0 cs0Var3, cs0 cs0Var4) {
        this.j = hd0Var;
        this.k = al0Var;
        this.g = cs0Var;
        this.h = cs0Var2;
        this.i = ns0Var;
        this.l = ns0Var2;
        this.m = cs0Var3;
        this.n = cs0Var4;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        jj jjVar;
        nv0 nv0Var;
        List list;
        nv0 nv0Var2;
        int i = this.f;
        final int i2 = 2;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        Object obj4 = this.k;
        Object obj5 = this.m;
        Object obj6 = this.h;
        zs0 zs0Var = this.l;
        Object obj7 = this.n;
        Object obj8 = this.g;
        Object obj9 = this.j;
        final int i3 = 1;
        switch (i) {
            case 0:
                vj2 vj2Var = (vj2) obj9;
                cs0 cs0Var = (cs0) obj8;
                String str = (String) obj4;
                cs0 cs0Var2 = (cs0) obj6;
                rs0 rs0Var = (rs0) obj7;
                ns0 ns0Var = (ns0) zs0Var;
                ns0 ns0Var2 = (ns0) obj5;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var3.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var3.U();
                } else {
                    gm0 gm0Var = j43.c;
                    b22 b22Var = new b22(24.0f, 24.0f, 24.0f, 24.0f);
                    jj jjVar2 = new jj(16.0f, true, new c(1));
                    boolean zH = nv0Var3.h(vj2Var) | nv0Var3.f(cs0Var) | nv0Var3.f(str) | nv0Var3.f(cs0Var2);
                    ns0 ns0Var3 = this.i;
                    boolean zF = zH | nv0Var3.f(ns0Var3) | nv0Var3.f(rs0Var) | nv0Var3.f(ns0Var) | nv0Var3.f(ns0Var2);
                    Object objO = nv0Var3.O();
                    if (zF || objO == zjVar) {
                        jjVar = jjVar2;
                        ht htVar = new ht(vj2Var, str, cs0Var, cs0Var2, ns0Var3, rs0Var, ns0Var, ns0Var2, 2);
                        nv0Var3.j0(htVar);
                        objO = htVar;
                    } else {
                        jjVar = jjVar2;
                    }
                    dn0.a(gm0Var, null, b22Var, jjVar, (ns0) objO, nv0Var3, 3462, 2);
                }
                break;
            case 1:
                List list2 = (List) obj9;
                nm2 nm2Var = (nm2) obj4;
                cs0 cs0Var3 = (cs0) obj8;
                cs0 cs0Var4 = (cs0) obj6;
                cs0 cs0Var5 = (cs0) zs0Var;
                os1 os1Var = (os1) obj5;
                kq2 kq2Var = (kq2) obj7;
                nv0 nv0Var4 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var4.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var4.U();
                } else {
                    if (list2.isEmpty()) {
                        nv0Var = nv0Var4;
                        list = list2;
                        nv0Var.a0(-1753001460);
                        nv0Var.p(false);
                    } else {
                        nv0Var4.a0(-1754593837);
                        boolean zBooleanValue = ((Boolean) os1Var.getValue()).booleanValue();
                        Object objO2 = nv0Var4.O();
                        if (objO2 == zjVar) {
                            objO2 = new zb(os1Var, 6);
                            nv0Var4.j0(objO2);
                        }
                        list = list2;
                        lr.f(zBooleanValue, (ns0) objO2, null, gq.N(-1000767993, new bd1((Object) kq2Var, os1Var, list, (Object) this.i, 2), nv0Var4), nv0Var4, 3120);
                        nv0Var = nv0Var4;
                        oz2.g(nv0Var, j43.e(yp1.a, 16.0f));
                        nv0Var.p(false);
                    }
                    vr.e(!list.isEmpty(), nm2Var instanceof mm2, cs0Var3, cs0Var4, cs0Var5, nv0Var, 0);
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                hd0 hd0Var = (hd0) obj9;
                al0 al0Var = (al0) obj4;
                cs0 cs0Var6 = (cs0) obj8;
                cs0 cs0Var7 = (cs0) obj6;
                ns0 ns0Var4 = (ns0) zs0Var;
                cs0 cs0Var8 = (cs0) obj5;
                cs0 cs0Var9 = (cs0) obj7;
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((he) obj).getClass();
                if (!nv0Var5.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nv0Var5.U();
                } else {
                    boolean zF2 = nv0Var5.f(ns0Var4);
                    Object objO3 = nv0Var5.O();
                    if (zF2 || objO3 == zjVar) {
                        objO3 = new cw0(ns0Var4, 2);
                        nv0Var5.j0(objO3);
                    }
                    ns0 ns0Var5 = this.i;
                    w7.r(hd0Var, al0Var, cs0Var6, cs0Var7, ns0Var5, (ns0) objO3, cs0Var8, cs0Var9, ns0Var5, null, nv0Var5, 0);
                }
                break;
            default:
                vy2 vy2Var = (vy2) obj9;
                final kq2 kq2Var2 = (kq2) obj8;
                rs0 rs0Var2 = (rs0) obj7;
                final ns0 ns0Var6 = (ns0) zs0Var;
                yv2 yv2Var = (yv2) obj6;
                final ns0 ns0Var7 = (ns0) obj5;
                final os1 os1Var2 = (os1) obj4;
                nv0 nv0Var6 = (nv0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var6.R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    nv0Var6.U();
                } else {
                    if (vy2Var != null) {
                        nv0Var6.a0(-1285827133);
                        d00 d00Var = rn.L;
                        final ns0 ns0Var8 = this.i;
                        boolean zF3 = nv0Var6.f(ns0Var8) | nv0Var6.h(kq2Var2);
                        Object objO4 = nv0Var6.O();
                        if (zF3 || objO4 == zjVar) {
                            final int i4 = z ? 1 : 0;
                            objO4 = new cs0() { // from class: hz2
                                @Override // defpackage.cs0
                                public final Object a() {
                                    int i5 = i4;
                                    dm3 dm3Var2 = dm3.a;
                                    os1 os1Var3 = os1Var2;
                                    kq2 kq2Var3 = kq2Var2;
                                    ns0 ns0Var9 = ns0Var8;
                                    switch (i5) {
                                        case 0:
                                            f80.p(os1Var3, false);
                                            ns0Var9.h(kq2Var3.a);
                                            break;
                                        case 1:
                                            f80.p(os1Var3, false);
                                            ns0Var9.h(kq2Var3.a);
                                            break;
                                        default:
                                            f80.p(os1Var3, false);
                                            ns0Var9.h(kq2Var3);
                                            break;
                                    }
                                    return dm3Var2;
                                }
                            };
                            nv0Var6.j0(objO4);
                        }
                        u9.b(d00Var, (cs0) objO4, null, false, null, null, nv0Var6, 6, 508);
                        nv0Var2 = nv0Var6;
                        d00 d00Var2 = rn.M;
                        boolean zF4 = nv0Var2.f(rs0Var2) | nv0Var2.h(kq2Var2) | nv0Var2.h(vy2Var);
                        Object objO5 = nv0Var2.O();
                        if (zF4 || objO5 == zjVar) {
                            objO5 = new n8(rs0Var2, kq2Var2, vy2Var, os1Var2, 8);
                            nv0Var2.j0(objO5);
                        }
                        u9.b(d00Var2, (cs0) objO5, null, false, null, null, nv0Var2, 6, 508);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2 = nv0Var6;
                        nv0Var2.a0(-1285062177);
                        nv0Var2.p(false);
                    }
                    d00 d00Var3 = rn.N;
                    boolean zF5 = nv0Var2.f(ns0Var6) | nv0Var2.h(kq2Var2);
                    Object objO6 = nv0Var2.O();
                    if (zF5 || objO6 == zjVar) {
                        objO6 = new cs0() { // from class: hz2
                            @Override // defpackage.cs0
                            public final Object a() {
                                int i5 = i3;
                                dm3 dm3Var2 = dm3.a;
                                os1 os1Var3 = os1Var2;
                                kq2 kq2Var3 = kq2Var2;
                                ns0 ns0Var9 = ns0Var6;
                                switch (i5) {
                                    case 0:
                                        f80.p(os1Var3, false);
                                        ns0Var9.h(kq2Var3.a);
                                        break;
                                    case 1:
                                        f80.p(os1Var3, false);
                                        ns0Var9.h(kq2Var3.a);
                                        break;
                                    default:
                                        f80.p(os1Var3, false);
                                        ns0Var9.h(kq2Var3);
                                        break;
                                }
                                return dm3Var2;
                            }
                        };
                        nv0Var2.j0(objO6);
                    }
                    u9.b(d00Var3, (cs0) objO6, null, !yv2Var.b.equals(sy2.a), null, null, nv0Var2, 6, 476);
                    if (ns0Var7 == null) {
                        nv0Var2.a0(-1283968001);
                        nv0Var2.p(false);
                    } else {
                        nv0Var2.a0(-1284563821);
                        d00 d00Var4 = rn.O;
                        boolean zF6 = nv0Var2.f(ns0Var7) | nv0Var2.h(kq2Var2);
                        Object objO7 = nv0Var2.O();
                        if (zF6 || objO7 == zjVar) {
                            objO7 = new cs0() { // from class: hz2
                                @Override // defpackage.cs0
                                public final Object a() {
                                    int i5 = i2;
                                    dm3 dm3Var2 = dm3.a;
                                    os1 os1Var3 = os1Var2;
                                    kq2 kq2Var3 = kq2Var2;
                                    ns0 ns0Var9 = ns0Var7;
                                    switch (i5) {
                                        case 0:
                                            f80.p(os1Var3, false);
                                            ns0Var9.h(kq2Var3.a);
                                            break;
                                        case 1:
                                            f80.p(os1Var3, false);
                                            ns0Var9.h(kq2Var3.a);
                                            break;
                                        default:
                                            f80.p(os1Var3, false);
                                            ns0Var9.h(kq2Var3);
                                            break;
                                    }
                                    return dm3Var2;
                                }
                            };
                            nv0Var2.j0(objO7);
                        }
                        u9.b(d00Var4, (cs0) objO7, null, false, null, null, nv0Var2, 6, 508);
                        nv0Var2.p(false);
                    }
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ bz2(vj2 vj2Var, cs0 cs0Var, String str, cs0 cs0Var2, ns0 ns0Var, rs0 rs0Var, ns0 ns0Var2, ns0 ns0Var3) {
        this.j = vj2Var;
        this.g = cs0Var;
        this.k = str;
        this.h = cs0Var2;
        this.i = ns0Var;
        this.n = rs0Var;
        this.l = ns0Var2;
        this.m = ns0Var3;
    }

    public /* synthetic */ bz2(vy2 vy2Var, ns0 ns0Var, kq2 kq2Var, rs0 rs0Var, ns0 ns0Var2, yv2 yv2Var, ns0 ns0Var3, os1 os1Var) {
        this.j = vy2Var;
        this.i = ns0Var;
        this.g = kq2Var;
        this.n = rs0Var;
        this.l = ns0Var2;
        this.h = yv2Var;
        this.m = ns0Var3;
        this.k = os1Var;
    }

    public /* synthetic */ bz2(List list, nm2 nm2Var, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, os1 os1Var, kq2 kq2Var, ns0 ns0Var) {
        this.j = list;
        this.k = nm2Var;
        this.g = cs0Var;
        this.h = cs0Var2;
        this.l = cs0Var3;
        this.m = os1Var;
        this.n = kq2Var;
        this.i = ns0Var;
    }
}
