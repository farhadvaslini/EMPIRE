package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y7 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ y7(int i, int i2, Object obj, Object obj2) {
        this.f = i2;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                c8 c8Var = (c8) obj3;
                int iIntValue = ((Integer) obj).intValue();
                vu2 vu2Var = (vu2) obj2;
                if (!((wu2) obj4).b.c(vu2Var.f)) {
                    c8Var.l(iIntValue, vu2Var);
                    c8Var.m.l(dm3Var);
                }
                return dm3Var;
            case 1:
                ((Integer) obj2).getClass();
                f80.c((bq1) obj4, (rs0) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                sa3 sa3Var = (sa3) obj;
                m30 m30Var = (m30) obj2;
                return ((cn1) obj4).c(sa3Var, sa3Var.e0(new d00(-431986394, new y7(3, (d00) obj3, new lo(sa3Var, m30Var.a)), true), dm3Var), m30Var.a);
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                d00 d00Var = (d00) obj4;
                Object obj5 = (lo) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d00Var.e(obj5, nv0Var, 0);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                w7.g((hv) obj4, (cs0) obj3, (nv0) obj, jo3.y(9));
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                i90 i90Var = (i90) obj4;
                x50 x50Var = (x50) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int i2 = 0;
                    for (Object obj6 : kv.h) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            vr.b0();
                            throw null;
                        }
                        kv kvVar = (kv) obj6;
                        boolean z = i90Var.k() == i2;
                        boolean zH = nv0Var2.h(x50Var) | nv0Var2.f(i90Var) | nv0Var2.d(i2);
                        Object objO = nv0Var2.O();
                        if (zH || objO == zjVar) {
                            objO = new nv(x50Var, i90Var, i2, false ? 1 : 0);
                            nv0Var2.j0(objO);
                        }
                        lc3.b(z, (cs0) objO, null, false, gq.N(1227390386, new u(4, kvVar), nv0Var2), 0L, 0L, nv0Var2, 24576);
                        i2 = i3;
                    }
                } else {
                    nv0Var2.U();
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                ((k40) obj4).a((j40) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                z60 z60Var = (z60) obj4;
                ((gb2) obj).getClass();
                z60Var.g.e(z60Var, new p41(((sb3) ((kb2) obj3)).D), (gy1) obj2);
                return dm3Var;
            case 8:
                ((Integer) obj2).getClass();
                ((k80) obj4).a((pl) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case vr.g /* 9 */:
                ((Integer) obj2).getClass();
                ((d90) obj4).a((jv1) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case vr.h /* 10 */:
                ((Integer) obj2).getClass();
                ((f90) obj4).a((jv1) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case 11:
                ((Integer) obj2).getClass();
                ((q90) obj4).a((d43) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case vr.i /* 12 */:
                yd3 yd3Var = (yd3) obj4;
                je3 je3Var = (je3) obj3;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (nv0Var3.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean zF = nv0Var3.f(yd3Var);
                    Object objO2 = nv0Var3.O();
                    if (zF || objO2 == zjVar) {
                        objO2 = b32.j(new c7(0, yd3Var, yd3.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 7));
                        nv0Var3.j0(objO2);
                    }
                    x90.a(je3Var, (xd3) ((e93) objO2).getValue(), nv0Var3, 0);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
            case 13:
                ((Integer) obj2).getClass();
                x90.a((je3) obj4, (xd3) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case 14:
                ((Integer) obj2).getClass();
                uq.e((List) obj4, (Collection) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case jo3.g /* 15 */:
                zk2 zk2Var = (zk2) obj4;
                m53 m53Var = (m53) obj3;
                int iIntValue5 = ((Integer) obj).intValue();
                if (obj2 instanceof j10) {
                    zk2Var.f.b((j10) obj2);
                } else if (!(obj2 instanceof vn2)) {
                    if (obj2 instanceof rv0) {
                        s51.z(m53Var, iIntValue5, obj2);
                        zk2Var.e((rv0) obj2);
                    } else if (obj2 instanceof xj2) {
                        s51.z(m53Var, iIntValue5, obj2);
                        ((xj2) obj2).c();
                    }
                }
                return dm3Var;
            case 16:
                ((Integer) obj2).getClass();
                vr.g((nm2) obj4, (cs0) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case 17:
                ((Integer) obj2).getClass();
                gv3.i((String) obj4, (d00) obj3, (nv0) obj, jo3.y(49));
                return dm3Var;
            case 18:
                ((Integer) obj2).getClass();
                w7.q((ea1) obj4, (ns0) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case 19:
                ((Integer) obj2).getClass();
                w7.s((ns0) obj4, (us0) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case 20:
                vg2 vg2Var = (vg2) obj4;
                os1 os1Var = (os1) obj3;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (nv0Var4.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zH2 = nv0Var4.h(vg2Var);
                    Object objO3 = nv0Var4.O();
                    if (zH2 || objO3 == zjVar) {
                        objO3 = new u1(25, vg2Var, os1Var);
                        nv0Var4.j0(objO3);
                    }
                    gq.m((cs0) objO3, null, false, null, null, null, rn.r, nv0Var4, 805306368, 510);
                } else {
                    nv0Var4.U();
                }
                return dm3Var;
            case 21:
                ea1 ea1Var = (ea1) obj4;
                String str = (String) obj3;
                nv0 nv0Var5 = (nv0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (nv0Var5.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    s01.a(ea1Var.g, str, null, 0L, nv0Var5, 0, 12);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            case 22:
                zb1 zb1Var = (zb1) obj4;
                rs0 rs0Var = (rs0) obj3;
                nv0 nv0Var6 = (nv0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (nv0Var6.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Boolean bool = (Boolean) zb1Var.g.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    nv0Var6.c0(bool);
                    boolean zG = nv0Var6.g(zBooleanValue);
                    if (zBooleanValue) {
                        rs0Var.f(nv0Var6, 0);
                    } else {
                        if (nv0Var6.l != 0) {
                            e20.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!nv0Var6.S) {
                            if (zG) {
                                i53 i53Var = nv0Var6.G;
                                int i4 = i53Var.g;
                                int i5 = i53Var.h;
                                d20 d20Var = nv0Var6.M;
                                d20Var.getClass();
                                d20Var.d(false);
                                d20Var.b.k.S(nz1.c);
                                s51.k(nv0Var6.s, i4, i5);
                                nv0Var6.G.t();
                            } else {
                                nv0Var6.T();
                            }
                        }
                    }
                    if (nv0Var6.y && nv0Var6.G.i == nv0Var6.z) {
                        nv0Var6.z = -1;
                        nv0Var6.y = false;
                    }
                    nv0Var6.p(false);
                } else {
                    nv0Var6.U();
                }
                return dm3Var;
            case 23:
                zc1 zc1Var = (zc1) obj4;
                yc1 yc1Var = (yc1) obj3;
                nv0 nv0Var7 = (nv0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (nv0Var7.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ad1 ad1Var = (ad1) zc1Var.b.a();
                    int iE = yc1Var.c;
                    Object obj7 = yc1Var.a;
                    if ((iE >= ad1Var.a() || !ad1Var.b(iE).equals(obj7)) && (iE = ad1Var.e(obj7)) != -1) {
                        yc1Var.c = iE;
                    }
                    int i6 = iE;
                    if (i6 != -1) {
                        nv0Var7.a0(-1664741271);
                        gq.l(ad1Var, zc1Var.a, i6, yc1Var.a, nv0Var7, 0);
                        nv0Var7.p(false);
                    } else {
                        nv0Var7.a0(-1664505826);
                        nv0Var7.p(false);
                    }
                    boolean zH3 = nv0Var7.h(yc1Var);
                    Object objO4 = nv0Var7.O();
                    if (zH3 || objO4 == zjVar) {
                        objO4 = new xc1(false ? 1 : 0, yc1Var);
                        nv0Var7.j0(objO4);
                    }
                    rn.g(obj7, (ns0) objO4, nv0Var7);
                } else {
                    nv0Var7.U();
                }
                return dm3Var;
            case 24:
                return ((cd1) obj3).a(new dd1((zc1) obj4, (sa3) obj), ((m30) obj2).a);
            case 25:
                d00 d00Var2 = (d00) obj4;
                Object obj8 = (le1) obj3;
                nv0 nv0Var8 = (nv0) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (nv0Var8.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    d00Var2.e(obj8, nv0Var8, 0);
                } else {
                    nv0Var8.U();
                }
                return dm3Var;
            case 26:
                ((Integer) obj2).getClass();
                vp.l((dq2) obj4, (d00) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
            case 27:
                ex1 ex1Var = (ex1) obj4;
                bx1 bx1Var = (bx1) obj3;
                pr prVar = (pr) obj;
                qw0 qw0Var = (qw0) obj2;
                tb1 tb1Var = ex1Var.z;
                if (tb1Var.I()) {
                    ex1Var.W = prVar;
                    ex1Var.V = qw0Var;
                    ((h7) wb1.a(tb1Var)).getSnapshotObserver().a.d(ex1Var, ex1.c0, bx1Var);
                    ex1Var.Z = false;
                } else {
                    ex1Var.Z = true;
                }
                return dm3Var;
            case 28:
                nk2 nk2Var = (nk2) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                nk2Var.f += ((cs2) ((k90) obj3).b).a(fFloatValue - nk2Var.f);
                return dm3Var;
            default:
                ((Integer) obj2).getClass();
                r51.d((n72) obj4, (ss0) obj3, (nv0) obj, jo3.y(1));
                return dm3Var;
        }
    }

    public /* synthetic */ y7(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }
}
