package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class n91 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ n91(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        nv0 nv0Var;
        boolean z;
        l73 l73Var;
        float f;
        zj zjVar;
        int i;
        boolean z2;
        boolean z3;
        int i2 = this.f;
        dm3 dm3Var = dm3.a;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        switch (i2) {
            case 0:
                sd sdVar = (sd) obj;
                nv0 nv0Var2 = (nv0) obj3;
                ((Integer) obj4).getClass();
                sdVar.getClass();
                ((qt1) obj2).getClass();
                vr.d(new he2[]{da1.a.a((c33) obj9), da1.b.a(sdVar)}, gq.N(-375221647, new ul((sa1) obj8, (go3) obj7, (nu1) obj6, (Context) obj5, 3), nv0Var2), nv0Var2, 48);
                return dm3Var;
            default:
                es2 es2Var = (es2) obj9;
                os1 os1Var = (os1) obj8;
                final l73 l73Var2 = (l73) obj7;
                final gt0 gt0Var = (gt0) obj6;
                os1 os1Var2 = (os1) obj5;
                qw1 qw1Var = (qw1) obj2;
                nv0 nv0Var3 = (nv0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                List list = p03.a;
                ((sd) obj).getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= nv0Var3.d(qw1Var == null ? -1 : qw1Var.ordinal()) ? 32 : 16;
                }
                if (nv0Var3.R(iIntValue & 1, (iIntValue & 145) != 144)) {
                    float f2 = 1.0f;
                    bq1 bq1VarK = f80.K(n92.C(new jc1(1.0f, false), es2Var, true), 16.0f, 8.0f);
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var3, 0);
                    int iHashCode = Long.hashCode(nv0Var3.T);
                    n52 n52VarL = nv0Var3.l();
                    bq1 bq1VarM = lr.M(nv0Var3, bq1VarK);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(tb1.Y);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, qyVarA);
                    y02.F(f5.D, nv0Var3, n52VarL);
                    y02.F(f5.F, nv0Var3, Integer.valueOf(iHashCode));
                    y02.C(nv0Var3);
                    y02.F(f5.C, nv0Var3, bq1VarM);
                    String string = y93.G0((String) os1Var.getValue()).toString();
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = string.toLowerCase(locale);
                    lowerCase.getClass();
                    int length = lowerCase.length();
                    yp1 yp1Var = yp1.a;
                    zj zjVar2 = c20.a;
                    float f3 = 0.0f;
                    if (length > 0) {
                        nv0Var3.a0(1589331057);
                        list.getClass();
                        ArrayList arrayList = new ArrayList();
                        dg0 dg0Var = new dg0(list.iterator());
                        while (dg0Var.g.hasNext()) {
                            Object next = dg0Var.next();
                            rw1 rw1Var = (rw1) ((k11) next).b;
                            if (!y93.h0(String.valueOf(rw1Var.d), lowerCase, false)) {
                                String str = rw1Var.e;
                                Locale locale2 = Locale.ROOT;
                                locale2.getClass();
                                String lowerCase2 = str.toLowerCase(locale2);
                                lowerCase2.getClass();
                                if (y93.h0(lowerCase2, lowerCase, false)) {
                                }
                            }
                            arrayList.add(next);
                        }
                        if (arrayList.isEmpty()) {
                            nv0Var3.a0(1589599672);
                            String strM = oz2.M(2131624033, nv0Var3);
                            long jB = wx.b(0.55f, ((fy) nv0Var3.j(hy.a)).q);
                            z3 = true;
                            z2 = false;
                            mg3.b(strM, f80.L(j43.c(yp1Var, 1.0f), 0.0f, 28.0f, 1), jB, 0L, null, null, 0L, new ld3(3), 0L, 0, false, 0, 0, null, nv0Var3, 48, 0, 261112);
                            nv0Var = nv0Var3;
                            nv0Var.p(false);
                        } else {
                            z2 = false;
                            nv0Var = nv0Var3;
                            z3 = true;
                            nv0Var.a0(1590027348);
                            int size = arrayList.size();
                            int i3 = 0;
                            while (i3 < size) {
                                Object obj10 = arrayList.get(i3);
                                i3++;
                                k11 k11Var = (k11) obj10;
                                final int i4 = k11Var.a;
                                final rw1 rw1Var2 = (rw1) k11Var.b;
                                boolean zBooleanValue = ((Boolean) l73Var2.get(i4)).booleanValue();
                                boolean zF = nv0Var.f(l73Var2) | nv0Var.d(i4) | nv0Var.f(gt0Var) | nv0Var.f(rw1Var2);
                                Object objO = nv0Var.O();
                                if (zF || objO == zjVar2) {
                                    final int i5 = 0;
                                    ns0 ns0Var = new ns0() { // from class: f03
                                        @Override // defpackage.ns0
                                        public final Object h(Object obj11) {
                                            int i6 = i5;
                                            dm3 dm3Var2 = dm3.a;
                                            rw1 rw1Var3 = rw1Var2;
                                            gt0 gt0Var2 = gt0Var;
                                            int i7 = i4;
                                            l73 l73Var3 = l73Var2;
                                            Boolean bool = (Boolean) obj11;
                                            bool.getClass();
                                            switch (i6) {
                                                case 0:
                                                    l73Var3.set(i7, bool);
                                                    gt0Var2.l(Integer.valueOf(rw1Var3.b), Integer.valueOf(rw1Var3.c), Integer.valueOf(rw1Var3.d), bool);
                                                    break;
                                                default:
                                                    l73Var3.set(i7, bool);
                                                    gt0Var2.l(Integer.valueOf(rw1Var3.b), Integer.valueOf(rw1Var3.c), Integer.valueOf(rw1Var3.d), bool);
                                                    break;
                                            }
                                            return dm3Var2;
                                        }
                                    };
                                    nv0Var.j0(ns0Var);
                                    objO = ns0Var;
                                }
                                p03.f(rw1Var2, zBooleanValue, (ns0) objO, nv0Var, 0);
                            }
                            nv0Var.p(false);
                        }
                        nv0Var.p(z2);
                        z = z3;
                    } else {
                        boolean z4 = false;
                        nv0Var = nv0Var3;
                        if (qw1Var == null) {
                            nv0Var.a0(1590629151);
                            for (final qw1 qw1Var2 : qw1.p) {
                                list.getClass();
                                final ArrayList arrayList2 = new ArrayList();
                                dg0 dg0Var2 = new dg0(list.iterator());
                                while (dg0Var2.g.hasNext()) {
                                    Object next2 = dg0Var2.next();
                                    if (((rw1) ((k11) next2).b).a == qw1Var2) {
                                        arrayList2.add(next2);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    l73Var = l73Var2;
                                    f = f3;
                                    zjVar = zjVar2;
                                } else {
                                    if (arrayList2.isEmpty()) {
                                        i = 0;
                                    } else {
                                        int size2 = arrayList2.size();
                                        i = 0;
                                        int i6 = 0;
                                        while (i6 < size2) {
                                            Object obj11 = arrayList2.get(i6);
                                            i6++;
                                            if (((Boolean) l73Var2.get(((k11) obj11).a)).booleanValue() && (i = i + 1) < 0) {
                                                throw new ArithmeticException("Count overflow has happened.");
                                            }
                                        }
                                    }
                                    bq1 bq1VarT = gq.t(f80.L(j43.c(yp1Var, f2), f3, 4.0f, 1), uo2.a(12.0f));
                                    Object objO2 = nv0Var.O();
                                    if (objO2 == zjVar2) {
                                        objO2 = nc2.e(nv0Var);
                                    }
                                    qr1 qr1Var = (qr1) objO2;
                                    boolean zD = nv0Var.d(qw1Var2.ordinal());
                                    Object objO3 = nv0Var.O();
                                    if (zD || objO3 == zjVar2) {
                                        objO3 = new me1(19, qw1Var2, os1Var2);
                                        nv0Var.j0(objO3);
                                    }
                                    bq1 bq1VarX = rn.x(bq1VarT, qr1Var, null, false, null, (cs0) objO3, 28);
                                    r93 r93Var = hy.a;
                                    l73Var = l73Var2;
                                    xr xrVarQ = gq.q(wx.b(0.045f, ((fy) nv0Var.j(r93Var)).q), nv0Var);
                                    final int i7 = i;
                                    ln lnVarA = r51.a(0.5f, wx.b(0.06f, ((fy) nv0Var.j(r93Var)).q));
                                    d00 d00VarN = gq.N(-703500391, new ss0() { // from class: g03
                                        @Override // defpackage.ss0
                                        public final Object e(Object obj12, Object obj13, Object obj14) {
                                            long jB2;
                                            nv0 nv0Var4 = (nv0) obj13;
                                            int iIntValue2 = ((Integer) obj14).intValue();
                                            ((ry) obj12).getClass();
                                            if (nv0Var4.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                bq1 bq1VarK2 = f80.K(j43.c(yp1.a, 1.0f), 14.0f, 13.0f);
                                                dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var4, 48);
                                                int iHashCode2 = Long.hashCode(nv0Var4.T);
                                                n52 n52VarL2 = nv0Var4.l();
                                                bq1 bq1VarM2 = lr.M(nv0Var4, bq1VarK2);
                                                w10.c.getClass();
                                                nv0Var4.d0();
                                                if (nv0Var4.S) {
                                                    nv0Var4.k(tb1.Y);
                                                } else {
                                                    nv0Var4.m0();
                                                }
                                                y02.F(f5.E, nv0Var4, dp2VarA);
                                                y02.F(f5.D, nv0Var4, n52VarL2);
                                                y02.F(f5.F, nv0Var4, Integer.valueOf(iHashCode2));
                                                y02.C(nv0Var4);
                                                y02.F(f5.C, nv0Var4, bq1VarM2);
                                                String strM2 = oz2.M(qw1Var2.f, nv0Var4);
                                                r93 r93Var2 = hy.a;
                                                mg3.b(strM2, new jc1(1.0f, true), ((fy) nv0Var4.j(r93Var2)).q, oz2.w(14), xq0.i, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 1597440, 0, 262056);
                                                int i8 = i7;
                                                String strN = oz2.N(2131624024, new Object[]{Integer.valueOf(i8), Integer.valueOf(arrayList2.size())}, nv0Var4);
                                                if (i8 == 0) {
                                                    nv0Var4.a0(-480988240);
                                                    jB2 = wx.b(0.38f, ((fy) nv0Var4.j(r93Var2)).q);
                                                    nv0Var4.p(false);
                                                } else {
                                                    nv0Var4.a0(-480985596);
                                                    jB2 = ((fy) nv0Var4.j(r93Var2)).a;
                                                    nv0Var4.p(false);
                                                }
                                                mg3.b(strN, null, jB2, oz2.w(12), null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var4, 24576, 0, 262122);
                                                nv0Var4.p(true);
                                            } else {
                                                nv0Var4.U();
                                            }
                                            return dm3.a;
                                        }
                                    }, nv0Var);
                                    zjVar = zjVar2;
                                    nv0 nv0Var4 = nv0Var;
                                    f = 0.0f;
                                    lq.g(bq1VarX, null, xrVarQ, null, lnVarA, d00VarN, nv0Var4, 196608, 10);
                                    nv0Var = nv0Var4;
                                }
                                zjVar2 = zjVar;
                                f3 = f;
                                l73Var2 = l73Var;
                                z4 = false;
                                f2 = 1.0f;
                            }
                            nv0Var.p(z4);
                        } else {
                            l73 l73Var3 = l73Var2;
                            nv0Var.a0(1593002232);
                            list.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            dg0 dg0Var3 = new dg0(list.iterator());
                            while (dg0Var3.g.hasNext()) {
                                Object next3 = dg0Var3.next();
                                if (((rw1) ((k11) next3).b).a == qw1Var) {
                                    arrayList3.add(next3);
                                }
                            }
                            int size3 = arrayList3.size();
                            int i8 = 0;
                            while (i8 < size3) {
                                Object obj12 = arrayList3.get(i8);
                                i8++;
                                k11 k11Var2 = (k11) obj12;
                                final int i9 = k11Var2.a;
                                final rw1 rw1Var3 = (rw1) k11Var2.b;
                                final l73 l73Var4 = l73Var3;
                                boolean zBooleanValue2 = ((Boolean) l73Var4.get(i9)).booleanValue();
                                boolean zF2 = nv0Var.f(l73Var4) | nv0Var.d(i9) | nv0Var.f(gt0Var) | nv0Var.f(rw1Var3);
                                Object objO4 = nv0Var.O();
                                if (zF2 || objO4 == zjVar2) {
                                    final int i10 = 1;
                                    objO4 = new ns0() { // from class: f03
                                        @Override // defpackage.ns0
                                        public final Object h(Object obj112) {
                                            int i62 = i10;
                                            dm3 dm3Var2 = dm3.a;
                                            rw1 rw1Var32 = rw1Var3;
                                            gt0 gt0Var2 = gt0Var;
                                            int i72 = i9;
                                            l73 l73Var32 = l73Var4;
                                            Boolean bool = (Boolean) obj112;
                                            bool.getClass();
                                            switch (i62) {
                                                case 0:
                                                    l73Var32.set(i72, bool);
                                                    gt0Var2.l(Integer.valueOf(rw1Var32.b), Integer.valueOf(rw1Var32.c), Integer.valueOf(rw1Var32.d), bool);
                                                    break;
                                                default:
                                                    l73Var32.set(i72, bool);
                                                    gt0Var2.l(Integer.valueOf(rw1Var32.b), Integer.valueOf(rw1Var32.c), Integer.valueOf(rw1Var32.d), bool);
                                                    break;
                                            }
                                            return dm3Var2;
                                        }
                                    };
                                    nv0Var.j0(objO4);
                                }
                                p03.f(rw1Var3, zBooleanValue2, (ns0) objO4, nv0Var, 0);
                                l73Var3 = l73Var4;
                            }
                            nv0Var.p(false);
                        }
                        z = true;
                    }
                    nv0Var.p(z);
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
        }
    }
}
