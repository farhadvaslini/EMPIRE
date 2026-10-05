package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mi1 implements zq1 {
    public static int f(k51 k51Var, ArrayList arrayList, int i, rs0 rs0Var) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iL = uq.L(i, k51Var.p0(32.0f));
        xm1 xm1Var = (xm1) qx.r0(list4);
        if (xm1Var != null) {
            iIntValue = ((Number) rs0Var.f(xm1Var, Integer.valueOf(iL))).intValue();
            iL = uq.L(iL, xm1Var.u0(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        xm1 xm1Var2 = (xm1) qx.r0(list5);
        if (xm1Var2 != null) {
            iIntValue2 = ((Number) rs0Var.f(xm1Var2, Integer.valueOf(iL))).intValue();
            iL = uq.L(iL, xm1Var2.u0(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        Object obj = (xm1) qx.r0(list2);
        int iIntValue3 = obj != null ? ((Number) rs0Var.f(obj, Integer.valueOf(iL))).intValue() : 0;
        Object obj2 = (xm1) qx.r0(list);
        int iIntValue4 = obj2 != null ? ((Number) rs0Var.f(obj2, Integer.valueOf(iL))).intValue() : 0;
        Object obj3 = (xm1) qx.r0(list3);
        int iIntValue5 = obj3 != null ? ((Number) rs0Var.f(obj3, Integer.valueOf(iL))).intValue() : 0;
        boolean z = iIntValue5 > k51Var.f0(oz2.w(30));
        boolean z2 = iIntValue3 > 0;
        boolean z3 = iIntValue5 > 0;
        int i2 = ((z2 && z3) || z) ? 3 : (z2 || z3) ? 2 : 1;
        return vp.o(k51Var, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, i2, k51Var.p0((i2 == 3 ? 12.0f : 8.0f) * 2.0f), n30.b(0, 0, 0, 0, 15));
    }

    public static int g(k51 k51Var, ArrayList arrayList, int i, rs0 rs0Var) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        xm1 xm1Var = (xm1) qx.r0(list4);
        int iIntValue = xm1Var != null ? ((Number) rs0Var.f(xm1Var, Integer.valueOf(i))).intValue() : 0;
        xm1 xm1Var2 = (xm1) qx.r0(list5);
        int iIntValue2 = xm1Var2 != null ? ((Number) rs0Var.f(xm1Var2, Integer.valueOf(i))).intValue() : 0;
        xm1 xm1Var3 = (xm1) qx.r0(list);
        int iIntValue3 = xm1Var3 != null ? ((Number) rs0Var.f(xm1Var3, Integer.valueOf(i))).intValue() : 0;
        xm1 xm1Var4 = (xm1) qx.r0(list2);
        int iIntValue4 = xm1Var4 != null ? ((Number) rs0Var.f(xm1Var4, Integer.valueOf(i))).intValue() : 0;
        xm1 xm1Var5 = (xm1) qx.r0(list3);
        int iIntValue5 = xm1Var5 != null ? ((Number) rs0Var.f(xm1Var5, Integer.valueOf(i))).intValue() : 0;
        int iP0 = k51Var.p0(32.0f);
        long jB = n30.b(0, 0, 0, 0, 15);
        if (m30.e(jB)) {
            return m30.i(jB);
        }
        return iP0 + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // defpackage.zq1
    public final int a(k51 k51Var, List list, int i) {
        return f(k51Var, (ArrayList) list, i, ii1.m);
    }

    @Override // defpackage.zq1
    public final int b(k51 k51Var, List list, int i) {
        return g(k51Var, (ArrayList) list, i, ji1.m);
    }

    @Override // defpackage.zq1
    public final dn1 c(en1 en1Var, List list, long j) {
        float f;
        i62 i62VarT;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        List list6 = (List) arrayList.get(4);
        long jB = m30.b(j, 0, 0, 0, 0, 10);
        int iP0 = en1Var.p0(32.0f);
        xm1 xm1Var = (xm1) qx.r0(list5);
        int iM0 = xm1Var != null ? xm1Var.m0(m30.h(j)) : 0;
        xm1 xm1Var2 = (xm1) qx.r0(list6);
        int iL = uq.L(m30.i(jB), iM0 + (xm1Var2 != null ? xm1Var2.m0(m30.h(j)) : 0) + iP0);
        xm1 xm1Var3 = (xm1) qx.r0(list4);
        long jI = n30.i(jB, -iP0, -en1Var.p0(((((qx.r0(list3) != null) && (qx.r0(list4) != null)) || ((xm1Var3 != null ? xm1Var3.x0(iL) : 0) > en1Var.f0(oz2.w(30)))) ? 12.0f : 8.0f) * 2.0f));
        xm1 xm1Var4 = (xm1) qx.r0(list5);
        i62 i62VarT2 = xm1Var4 != null ? xm1Var4.t(jI) : null;
        int i = i62VarT2 != null ? i62VarT2.f : 0;
        xm1 xm1Var5 = (xm1) qx.r0(list6);
        if (xm1Var5 != null) {
            f = 2.0f;
            i62VarT = xm1Var5.t(n30.j(-i, 0, 2, jI));
        } else {
            f = 2.0f;
            i62VarT = null;
        }
        int i2 = i + (i62VarT != null ? i62VarT.f : 0);
        xm1 xm1Var6 = (xm1) qx.r0(list2);
        i62 i62VarT3 = xm1Var6 != null ? xm1Var6.t(n30.j(-i2, 0, 2, jI)) : null;
        int i3 = i62VarT3 != null ? i62VarT3.g : 0;
        xm1 xm1Var7 = (xm1) qx.r0(list4);
        i62 i62VarT4 = xm1Var7 != null ? xm1Var7.t(n30.i(jI, -i2, -i3)) : null;
        int i4 = i3 + (i62VarT4 != null ? i62VarT4.g : 0);
        boolean z = (i62VarT4 == null || i62VarT4.z0(l5.a) == i62VarT4.z0(l5.b)) ? false : true;
        xm1 xm1Var8 = (xm1) qx.r0(list3);
        i62 i62VarT5 = xm1Var8 != null ? xm1Var8.t(n30.i(jI, -i2, -i4)) : null;
        boolean z2 = i62VarT5 != null;
        boolean z3 = i62VarT4 != null;
        int i5 = ((z2 && z3) || z) ? 3 : (z2 || z3) ? 2 : 1;
        float f2 = i5 == 3 ? 12.0f : 8.0f;
        float f3 = f2 * f;
        final int i6 = m30.e(j) ? m30.i(j) : iP0 + (i62VarT2 != null ? i62VarT2.f : 0) + Math.max(i62VarT3 != null ? i62VarT3.f : 0, Math.max(i62VarT5 != null ? i62VarT5.f : 0, i62VarT4 != null ? i62VarT4.f : 0)) + (i62VarT != null ? i62VarT.f : 0);
        final i62 i62Var = i62VarT5;
        float f4 = f2;
        final int iO = vp.o(en1Var, i62VarT2 != null ? i62VarT2.g : 0, i62VarT != null ? i62VarT.g : 0, i62VarT3 != null ? i62VarT3.g : 0, i62VarT5 != null ? i62VarT5.g : 0, i62VarT4 != null ? i62VarT4.g : 0, i5, en1Var.p0(f3), j);
        final boolean z4 = i5 == 3;
        final int iP02 = en1Var.p0(16.0f);
        final int iP03 = en1Var.p0(16.0f);
        final int iP04 = en1Var.p0(f4);
        final i62 i62Var2 = i62VarT;
        final i62 i62Var3 = i62VarT3;
        final i62 i62Var4 = i62VarT4;
        final i62 i62Var5 = i62VarT2;
        return en1Var.I0(i6, iO, oi0.f, new ns0() { // from class: gi1
            @Override // defpackage.ns0
            public final Object h(Object obj) {
                int iRound;
                h62 h62Var = (h62) obj;
                i62 i62Var6 = i62Var5;
                int i7 = iP02;
                boolean z5 = z4;
                int iRound2 = iP04;
                int i8 = iO;
                if (i62Var6 != null) {
                    h62.F(h62Var, i62Var6, i7, z5 ? iRound2 : Math.round(((i8 - i62Var6.g) / 2.0f) * 1.0f));
                }
                int i9 = i7 + (i62Var6 != null ? i62Var6.f : 0);
                i62 i62Var7 = i62Var3;
                i62 i62Var8 = i62Var;
                i62 i62Var9 = i62Var4;
                if (z5) {
                    iRound = iRound2;
                } else {
                    iRound = Math.round(((i8 - (((i62Var7 != null ? i62Var7.g : 0) + (i62Var8 != null ? i62Var8.g : 0)) + (i62Var9 != null ? i62Var9.g : 0))) / 2.0f) * 1.0f);
                }
                if (i62Var8 != null) {
                    h62.F(h62Var, i62Var8, i9, iRound);
                }
                int i10 = iRound + (i62Var8 != null ? i62Var8.g : 0);
                if (i62Var7 != null) {
                    h62.F(h62Var, i62Var7, i9, i10);
                }
                int i11 = i10 + (i62Var7 != null ? i62Var7.g : 0);
                if (i62Var9 != null) {
                    h62.F(h62Var, i62Var9, i9, i11);
                }
                i62 i62Var10 = i62Var2;
                if (i62Var10 != null) {
                    int i12 = (i6 - iP03) - i62Var10.f;
                    if (!z5) {
                        iRound2 = Math.round(((i8 - i62Var10.g) / 2.0f) * 1.0f);
                    }
                    h62.F(h62Var, i62Var10, i12, iRound2);
                }
                return dm3.a;
            }
        });
    }

    @Override // defpackage.zq1
    public final int d(k51 k51Var, List list, int i) {
        return f(k51Var, (ArrayList) list, i, ki1.m);
    }

    @Override // defpackage.zq1
    public final int e(k51 k51Var, List list, int i) {
        return g(k51Var, (ArrayList) list, i, li1.m);
    }
}
