package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rg2 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ rg2(hb0 hb0Var, String str, int i, List list, List list2, a42 a42Var, List list3, os1 os1Var) {
        this.h = hb0Var;
        this.i = str;
        this.g = i;
        this.j = list;
        this.k = list2;
        this.m = a42Var;
        this.l = list3;
        this.n = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var;
        yp1 yp1Var;
        os1 os1Var;
        int i;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        int i2;
        gh3 gh3Var;
        jc1 jc1Var;
        long j2;
        final i62 i62Var;
        int iP0;
        int iP02;
        int i3;
        bl0 bl0Var;
        final Integer numValueOf;
        final int i4;
        int iIntValue;
        int iP03;
        int iA;
        int i5 = this.f;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        int i6 = this.g;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.i;
        Object obj9 = this.h;
        switch (i5) {
            case 0:
                z00 z00Var = f5.C;
                z00 z00Var2 = f5.F;
                z00 z00Var3 = f5.D;
                z00 z00Var4 = f5.E;
                hb0 hb0Var = (hb0) obj9;
                String str = (String) obj8;
                List list = (List) obj7;
                List list2 = (List) obj6;
                final a42 a42Var = (a42) obj4;
                List list3 = (List) obj5;
                os1 os1Var2 = (os1) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    es2 es2VarA = n92.A(nv0Var2);
                    yp1 yp1Var2 = yp1.a;
                    bq1 bq1VarC = n92.C(yp1Var2, es2VarA, true);
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
                    int iHashCode = Long.hashCode(nv0Var2.T);
                    n52 n52VarL = nv0Var2.l();
                    bq1 bq1VarM = lr.M(nv0Var2, bq1VarC);
                    w10.c.getClass();
                    nv0Var2.d0();
                    boolean z4 = nv0Var2.S;
                    x91 x91Var = tb1.Y;
                    if (z4) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(z00Var4, nv0Var2, qyVarA);
                    y02.F(z00Var3, nv0Var2, n52VarL);
                    y02.F(z00Var2, nv0Var2, Integer.valueOf(iHashCode));
                    y02.C(nv0Var2);
                    y02.F(z00Var, nv0Var2, bq1VarM);
                    boolean zA = hb0Var.a();
                    int i7 = hb0Var.b;
                    if (zA) {
                        nv0Var = nv0Var2;
                        yp1Var = yp1Var2;
                        nv0Var.a0(795174195);
                        nv0Var.p(false);
                    } else {
                        nv0Var2.a0(794954529);
                        yp1Var = yp1Var2;
                        mg3.b(str, f80.N(yp1Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).k, nv0Var2, 48, 0, 131068);
                        nv0Var = nv0Var2;
                        nv0Var.p(false);
                    }
                    boolean zA2 = hb0Var.a();
                    zj zjVar = c20.a;
                    if (zA2) {
                        nv0Var.a0(795307061);
                        zv0 zv0Var = zb3.c;
                        if (i6 > 1) {
                            nv0Var.a0(795315927);
                            Iterator it = list.iterator();
                            final int i8 = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    vr.b0();
                                    throw null;
                                }
                                List list4 = (List) next;
                                boolean z5 = i7 == 5 && i8 == 0;
                                Iterator it2 = it;
                                boolean z6 = a42Var.g() == i8;
                                if (i8 > 0) {
                                    nv0Var.a0(-1603991524);
                                    gq.g(null, 0.0f, 0L, nv0Var, 0, 7);
                                    nv0Var.p(false);
                                    z3 = z5;
                                } else {
                                    z3 = z5;
                                    nv0Var.a0(1815888569);
                                    nv0Var.p(false);
                                }
                                bq1 bq1VarC2 = j43.c(yp1Var, 1.0f);
                                boolean z7 = !z3;
                                boolean zD = nv0Var.d(i8);
                                os1 os1Var3 = os1Var2;
                                Object objO = nv0Var.O();
                                if (zD || objO == zjVar) {
                                    i2 = i7;
                                    final int i10 = 0;
                                    objO = new cs0() { // from class: sg2
                                        @Override // defpackage.cs0
                                        public final Object a() {
                                            int i11 = i10;
                                            dm3 dm3Var = dm3.a;
                                            a42 a42Var2 = a42Var;
                                            int i12 = i8;
                                            switch (i11) {
                                                case 0:
                                                    a42Var2.h(i12);
                                                    break;
                                                default:
                                                    a42Var2.h(i12);
                                                    break;
                                            }
                                            return dm3Var;
                                        }
                                    };
                                    nv0Var.j0(objO);
                                } else {
                                    i2 = i7;
                                }
                                bq1 bq1VarK = f80.K(rn.y(bq1VarC2, z7, null, (cs0) objO, 14), 12.0f, 10.0f);
                                dp2 dp2VarA = cp2.a(n92.b, f5.p, nv0Var, 0);
                                int iHashCode2 = Long.hashCode(nv0Var.T);
                                n52 n52VarL2 = nv0Var.l();
                                bq1 bq1VarM2 = lr.M(nv0Var, bq1VarK);
                                w10.c.getClass();
                                nv0Var.d0();
                                if (nv0Var.S) {
                                    nv0Var.k(x91Var);
                                } else {
                                    nv0Var.m0();
                                }
                                y02.F(z00Var4, nv0Var, dp2VarA);
                                y02.F(z00Var3, nv0Var, n52VarL2);
                                y02.F(z00Var2, nv0Var, Integer.valueOf(iHashCode2));
                                y02.C(nv0Var);
                                y02.F(z00Var, nv0Var, bq1VarM2);
                                nv0Var.a0(-1628479092);
                                Iterator it3 = list4.iterator();
                                int i11 = 0;
                                while (it3.hasNext()) {
                                    Object next2 = it3.next();
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        vr.b0();
                                        throw null;
                                    }
                                    String str2 = (String) next2;
                                    float fFloatValue = ((Number) ((i11 < 0 || i11 >= list3.size()) ? Float.valueOf(1.0f / i6) : list3.get(i11))).floatValue();
                                    Iterator it4 = it3;
                                    z00 z00Var5 = z00Var;
                                    if (fFloatValue <= 0.0d) {
                                        k21.a("invalid weight; must be greater than zero");
                                    }
                                    if (fFloatValue > Float.MAX_VALUE) {
                                        fFloatValue = Float.MAX_VALUE;
                                    }
                                    jc1 jc1Var2 = new jc1(fFloatValue, true);
                                    if (z3) {
                                        nv0Var.a0(189094345);
                                        gh3Var = ((ol3) nv0Var.j(ql3.a)).i;
                                        nv0Var.p(false);
                                    } else {
                                        nv0Var.a0(189096937);
                                        gh3Var = ((ol3) nv0Var.j(ql3.a)).k;
                                        nv0Var.p(false);
                                    }
                                    gh3 gh3Var2 = gh3Var;
                                    xq0 xq0Var = z3 ? xq0.k : null;
                                    if (z3) {
                                        nv0Var.a0(189104710);
                                        jc1Var = jc1Var2;
                                        j2 = ((fy) nv0Var.j(hy.a)).a;
                                        nv0Var.p(false);
                                    } else {
                                        jc1Var = jc1Var2;
                                        if (z6) {
                                            nv0Var.a0(189107654);
                                            j2 = ((fy) nv0Var.j(hy.a)).a;
                                            nv0Var.p(false);
                                        } else {
                                            nv0Var.a0(189110408);
                                            j2 = ((fy) nv0Var.j(hy.a)).q;
                                            nv0Var.p(false);
                                        }
                                    }
                                    mg3.b(str2, jc1Var, j2, 0L, xq0Var, zv0Var, 0L, null, 0L, 0, false, 0, 0, gh3Var2, nv0Var, 0, 0, 130872);
                                    i11 = i12;
                                    z00Var = z00Var5;
                                    it3 = it4;
                                }
                                nv0Var.p(false);
                                nv0Var.p(true);
                                i8 = i9;
                                it = it2;
                                os1Var2 = os1Var3;
                                i7 = i2;
                            }
                            os1Var = os1Var2;
                            i = i7;
                            nv0Var.p(false);
                            z = false;
                        } else {
                            os1Var = os1Var2;
                            i = i7;
                            nv0Var.a0(797163155);
                            final int i13 = 0;
                            for (Object obj10 : list2) {
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    vr.b0();
                                    throw null;
                                }
                                String str3 = (String) obj10;
                                boolean z8 = a42Var.g() == i13;
                                if (i13 > 0) {
                                    nv0Var.a0(2006435782);
                                    gq.g(null, 0.0f, 0L, nv0Var, 0, 7);
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    nv0Var.a0(2069985359);
                                }
                                nv0Var.p(z2);
                                bq1 bq1VarC3 = j43.c(yp1Var, 1.0f);
                                boolean zD2 = nv0Var.d(i13);
                                Object objO2 = nv0Var.O();
                                if (zD2 || objO2 == zjVar) {
                                    final int i15 = 1;
                                    objO2 = new cs0() { // from class: sg2
                                        @Override // defpackage.cs0
                                        public final Object a() {
                                            int i112 = i15;
                                            dm3 dm3Var = dm3.a;
                                            a42 a42Var2 = a42Var;
                                            int i122 = i13;
                                            switch (i112) {
                                                case 0:
                                                    a42Var2.h(i122);
                                                    break;
                                                default:
                                                    a42Var2.h(i122);
                                                    break;
                                            }
                                            return dm3Var;
                                        }
                                    };
                                    nv0Var.j0(objO2);
                                }
                                bq1 bq1VarK2 = f80.K(rn.y(bq1VarC3, false, null, (cs0) objO2, 15), 12.0f, 10.0f);
                                gh3 gh3Var3 = ((ol3) nv0Var.j(ql3.a)).k;
                                if (z8) {
                                    nv0Var.a0(2006453530);
                                    j = ((fy) nv0Var.j(hy.a)).a;
                                    nv0Var.p(false);
                                } else {
                                    nv0Var.a0(2006456956);
                                    j = ((fy) nv0Var.j(hy.a)).q;
                                    nv0Var.p(false);
                                }
                                mg3.b(str3, bq1VarK2, j, 0L, null, zv0Var, 0L, null, 0L, 0, false, 0, 0, gh3Var3, nv0Var, 0, 0, 130936);
                                i13 = i14;
                            }
                            z = false;
                            nv0Var.p(false);
                        }
                        nv0Var.p(z);
                    } else {
                        os1Var = os1Var2;
                        i = i7;
                        z = false;
                        nv0Var.a0(798134323);
                        nv0Var.p(false);
                    }
                    int i16 = i;
                    if (i16 == 1 || i16 == 3) {
                        nv0Var.a0(798265608);
                        oz2.g(nv0Var, j43.e(yp1Var, 12.0f));
                        String str4 = (String) os1Var.getValue();
                        bq1 bq1VarC4 = j43.c(yp1Var, 1.0f);
                        nr3 j42Var = i16 == 3 ? new j42() : m22.B;
                        o71 o71Var = new o71(i16 == 3 ? 7 : 1, 7, 115);
                        Object objO3 = nv0Var.O();
                        if (objO3 == zjVar) {
                            objO3 = new zb(os1Var, 18);
                            nv0Var.j0(objO3);
                        }
                        g12.m(str4, (ns0) objO3, bq1VarC4, false, false, null, null, null, null, null, null, false, j42Var, o71Var, null, true, 0, 0, null, null, nv0Var, 432, 12582912, 8208376);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(799044979);
                        nv0Var.p(z);
                    }
                    nv0Var.p(true);
                } else {
                    nv0Var2.U();
                }
                return dm3.a;
            default:
                final js3 js3Var = (js3) obj9;
                rs0 rs0Var = (rs0) obj5;
                ir2 ir2Var = (ir2) obj4;
                rs0 rs0Var2 = (rs0) obj3;
                final sa3 sa3Var = (sa3) obj;
                m30 m30Var = (m30) obj2;
                final int i17 = m30.i(m30Var.a);
                final int iH = m30.h(m30Var.a);
                long jB = m30.b(m30Var.a, 0, 0, 0, 0, 10);
                int iD = js3Var.d(sa3Var, sa3Var.getLayoutDirection());
                int iC = js3Var.c(sa3Var, sa3Var.getLayoutDirection());
                int iA2 = js3Var.a(sa3Var);
                final i62 i62VarT = ((xm1) qx.q0(sa3Var.e0((rs0) obj8, jr2.f))).t(jB);
                int i18 = (-iD) - iC;
                int i19 = -iA2;
                final i62 i62VarT2 = ((xm1) qx.q0(sa3Var.e0((rs0) obj7, jr2.h))).t(n30.i(jB, i18, i19));
                i62 i62VarT3 = ((xm1) qx.q0(sa3Var.e0((rs0) obj6, jr2.i))).t(n30.i(jB, i18, i19));
                int i20 = i62VarT3.f;
                if (i20 == 0 && i62VarT3.g == 0) {
                    i62Var = i62VarT3;
                    bl0Var = null;
                } else {
                    int i21 = i62VarT3.g;
                    bb1 bb1Var = bb1.f;
                    if (i6 == 0) {
                        i62Var = i62VarT3;
                        if (sa3Var.getLayoutDirection() == bb1Var) {
                            iP0 = sa3Var.p0(16.0f);
                            i3 = iP0 + iD;
                        } else {
                            iP02 = sa3Var.p0(16.0f);
                            i3 = ((i17 - iP02) - i20) - iC;
                        }
                    } else {
                        i62Var = i62VarT3;
                        if (i6 != 2 && i6 != 3) {
                            i3 = (((i17 - i20) + iD) - iC) / 2;
                        } else if (sa3Var.getLayoutDirection() == bb1Var) {
                            iP02 = sa3Var.p0(16.0f);
                            i3 = ((i17 - iP02) - i20) - iC;
                        } else {
                            iP0 = sa3Var.p0(16.0f);
                            i3 = iP0 + iD;
                        }
                    }
                    bl0Var = new bl0();
                    bl0Var.a = i3;
                    bl0Var.b = i21;
                }
                final i62 i62VarT4 = ((xm1) qx.q0(sa3Var.e0(rs0Var, jr2.j))).t(jB);
                boolean z9 = i62VarT4.f == 0 && i62VarT4.g == 0;
                if (bl0Var != null) {
                    int i22 = bl0Var.b;
                    if (z9 || i6 == 3) {
                        iP03 = sa3Var.p0(16.0f) + i22;
                        iA = js3Var.a(sa3Var);
                    } else {
                        iP03 = i62VarT4.g + i22;
                        iA = sa3Var.p0(16.0f);
                    }
                    numValueOf = Integer.valueOf(iA + iP03);
                } else {
                    numValueOf = null;
                }
                int i23 = i62VarT2.g;
                if (i23 != 0) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        Integer numValueOf2 = !z9 ? Integer.valueOf(i62VarT4.g) : null;
                        iIntValue = numValueOf2 != null ? numValueOf2.intValue() : js3Var.a(sa3Var);
                    }
                    i4 = i23 + iIntValue;
                } else {
                    i4 = 0;
                }
                p31 p31Var = new p31(js3Var, sa3Var);
                ir2Var.a.setValue(new b22(f80.x(p31Var, sa3Var.getLayoutDirection()), (i62VarT.f == 0 && i62VarT.g == 0) ? p31Var.d() : sa3Var.X0(i62VarT.g), f80.w(p31Var, sa3Var.getLayoutDirection()), z9 ? p31Var.c() : sa3Var.X0(i62VarT4.g)));
                final i62 i62VarT5 = ((xm1) qx.q0(sa3Var.e0(rs0Var2, jr2.g))).t(jB);
                final bl0 bl0Var2 = bl0Var;
                return sa3Var.I0(i17, iH, oi0.f, new ns0() { // from class: gr2
                    @Override // defpackage.ns0
                    public final Object h(Object obj11) {
                        h62 h62Var = (h62) obj11;
                        h62Var.C(i62VarT5, 0, 0, 0.0f);
                        h62Var.C(i62VarT, 0, 0, 0.0f);
                        i62 i62Var2 = i62VarT2;
                        int i24 = i17 - i62Var2.f;
                        sa3 sa3Var2 = sa3Var;
                        bb1 layoutDirection = sa3Var2.getLayoutDirection();
                        js3 js3Var2 = js3Var;
                        int iD2 = ((js3Var2.d(sa3Var2, layoutDirection) + i24) - js3Var2.c(sa3Var2, sa3Var2.getLayoutDirection())) / 2;
                        int i25 = iH;
                        h62Var.C(i62Var2, iD2, i25 - i4, 0.0f);
                        i62 i62Var3 = i62VarT4;
                        h62Var.C(i62Var3, 0, i25 - i62Var3.g, 0.0f);
                        bl0 bl0Var3 = bl0Var2;
                        if (bl0Var3 != null) {
                            int i26 = bl0Var3.a;
                            Integer num = numValueOf;
                            num.getClass();
                            h62Var.C(i62Var, i26, i25 - num.intValue(), 0.0f);
                        }
                        return dm3.a;
                    }
                });
        }
    }

    public /* synthetic */ rg2(js3 js3Var, rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, int i, rs0 rs0Var4, ir2 ir2Var, rs0 rs0Var5) {
        this.h = js3Var;
        this.i = rs0Var;
        this.j = rs0Var2;
        this.k = rs0Var3;
        this.g = i;
        this.l = rs0Var4;
        this.m = ir2Var;
        this.n = rs0Var5;
    }
}
