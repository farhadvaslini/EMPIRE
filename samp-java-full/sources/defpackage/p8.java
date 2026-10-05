package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p8 implements cn1 {
    public static final p8 b = new p8(0);
    public static final p8 c = new p8(1);
    public static final p8 d = new p8(2);
    public static final p8 e = new p8(3);
    public static final p8 f = new p8(4);
    public static final u0 g = new u0(19);
    public static final p8 h = new p8(5);
    public static final p8 i = new p8(6);
    public final /* synthetic */ int a;

    public /* synthetic */ p8(int i2) {
        this.a = i2;
    }

    public static final void f(ArrayList arrayList, ok2 ok2Var, en1 en1Var, ArrayList arrayList2, ArrayList arrayList3, ok2 ok2Var2, ArrayList arrayList4, ok2 ok2Var3, ok2 ok2Var4) {
        if (!arrayList.isEmpty()) {
            ok2Var.f = en1Var.p0(12.0f) + ok2Var.f;
        }
        arrayList.add(0, qx.N0(arrayList2));
        arrayList3.add(Integer.valueOf(ok2Var2.f));
        arrayList4.add(Integer.valueOf(ok2Var.f));
        ok2Var.f += ok2Var2.f;
        ok2Var3.f = Math.max(ok2Var3.f, ok2Var4.f);
        arrayList2.clear();
        ok2Var4.f = 0;
        ok2Var2.f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0117 A[PHI: r6 r8
      0x0117: PHI (r6v19 int) = (r6v18 int), (r6v23 int), (r6v23 int) binds: [B:69:0x0132, B:62:0x010b, B:64:0x0111] A[DONT_GENERATE, DONT_INLINE]
      0x0117: PHI (r8v12 int) = (r8v11 int), (r8v17 int), (r8v17 int) binds: [B:69:0x0132, B:62:0x010b, B:64:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.cn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn1 c(en1 en1Var, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        Object obj2;
        int iP0;
        int iMax;
        int i2;
        int iZ0;
        int i3 = this.a;
        oi0 oi0Var = oi0.f;
        switch (i3) {
            case 0:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                int iK = 0;
                int iJ = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i62 i62VarT = ((xm1) list.get(i4)).t(j);
                    iK = Math.max(iK, i62VarT.f);
                    iJ = Math.max(iJ, i62VarT.g);
                    arrayList3.add(i62VarT);
                }
                if (list.isEmpty()) {
                    iK = m30.k(j);
                    iJ = m30.j(j);
                }
                return en1Var.I0(iK, iJ, oi0Var, new o8(0, arrayList3));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return en1Var.I0(0, 0, oi0Var, ua.g);
                }
                if (size2 == 1) {
                    i62 i62VarT2 = ((xm1) list.get(0)).t(j);
                    return en1Var.I0(i62VarT2.f, i62VarT2.g, oi0Var, new va(0, i62VarT2));
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax2 = 0;
                int iMax3 = 0;
                for (int i5 = 0; i5 < size3; i5++) {
                    i62 i62VarT3 = ((xm1) list.get(i5)).t(j);
                    iMax2 = Math.max(iMax2, i62VarT3.f);
                    iMax3 = Math.max(iMax3, i62VarT3.g);
                    arrayList4.add(i62VarT3);
                }
                return en1Var.I0(iMax2, iMax3, oi0Var, new wa(0, arrayList4));
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ArrayList arrayList5 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    arrayList5.add(((xm1) list.get(i6)).t(j));
                }
                return en1Var.I0(m30.i(j), m30.h(j), oi0Var, new o8(1, arrayList5));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return en1Var.I0(m30.k(j), m30.j(j), oi0Var, new u0(19));
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return en1Var.I0(m30.i(j), m30.h(j), oi0Var, g);
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ArrayList arrayList6 = new ArrayList(list.size());
                int size5 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                for (int i7 = 0; i7 < size5; i7++) {
                    i62 i62VarT4 = ((xm1) list.get(i7)).t(j);
                    iMax4 = Math.max(iMax4, i62VarT4.f);
                    iMax5 = Math.max(iMax5, i62VarT4.g);
                    arrayList6.add(i62VarT4);
                }
                return en1Var.I0(iMax4, iMax5, oi0Var, new o8(4, arrayList6));
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return en1Var.I0(m30.g(j) ? m30.i(j) : 0, m30.f(j) ? m30.h(j) : 0, oi0Var, new u0(19));
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                ok2 ok2Var = new ok2();
                ok2 ok2Var2 = new ok2();
                ArrayList arrayList10 = new ArrayList();
                ok2 ok2Var3 = new ok2();
                ok2 ok2Var4 = new ok2();
                int size6 = list.size();
                int i8 = 0;
                while (i8 < size6) {
                    i62 i62VarT5 = ((xm1) list.get(i8)).t(j);
                    if (!arrayList10.isEmpty()) {
                        ArrayList arrayList11 = arrayList7;
                        ok2 ok2Var5 = ok2Var2;
                        if (en1Var.p0(8.0f) + ok2Var3.f + i62VarT5.f <= m30.i(j)) {
                            arrayList7 = arrayList11;
                            ok2Var2 = ok2Var5;
                        } else {
                            arrayList7 = arrayList11;
                            ok2Var2 = ok2Var5;
                            f(arrayList7, ok2Var2, en1Var, arrayList10, arrayList8, ok2Var4, arrayList9, ok2Var, ok2Var3);
                        }
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2 = arrayList7;
                    } else {
                        arrayList2 = arrayList7;
                        ok2Var3.f = en1Var.p0(8.0f) + ok2Var3.f;
                    }
                    arrayList10.add(i62VarT5);
                    ok2Var3.f += i62VarT5.f;
                    ok2Var4.f = Math.max(ok2Var4.f, i62VarT5.g);
                    i8++;
                    arrayList7 = arrayList2;
                }
                ArrayList arrayList12 = arrayList7;
                if (arrayList10.isEmpty()) {
                    arrayList = arrayList12;
                } else {
                    arrayList = arrayList12;
                    f(arrayList, ok2Var2, en1Var, arrayList10, arrayList8, ok2Var4, arrayList9, ok2Var, ok2Var3);
                }
                int iMax6 = Math.max(ok2Var.f, m30.k(j));
                return en1Var.I0(iMax6, Math.max(ok2Var2.f, m30.j(j)), oi0Var, new b5(arrayList, en1Var, iMax6, arrayList9));
            default:
                int iMin = Math.min(m30.i(j), en1Var.p0(600.0f));
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size7) {
                        obj = list.get(i9);
                        if (!s51.n(r51.s((xm1) obj), "action")) {
                            i9++;
                        }
                    } else {
                        obj = null;
                    }
                }
                xm1 xm1Var = (xm1) obj;
                i62 i62VarT6 = xm1Var != null ? xm1Var.t(j) : null;
                int size8 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size8) {
                        obj2 = list.get(i10);
                        if (!s51.n(r51.s((xm1) obj2), "dismissAction")) {
                            i10++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                xm1 xm1Var2 = (xm1) obj2;
                i62 i62VarT7 = xm1Var2 != null ? xm1Var2.t(j) : null;
                int i11 = i62VarT6 != null ? i62VarT6.f : 0;
                int i12 = i62VarT6 != null ? i62VarT6.g : 0;
                int i13 = i62VarT7 != null ? i62VarT7.f : 0;
                int i14 = i62VarT7 != null ? i62VarT7.g : 0;
                int iP02 = ((iMin - i11) - i13) - (i13 == 0 ? en1Var.p0(8.0f) : 0);
                int iK2 = m30.k(j);
                if (iP02 < iK2) {
                    iP02 = iK2;
                }
                int size9 = list.size();
                int i15 = 0;
                while (i15 < size9) {
                    xm1 xm1Var3 = (xm1) list.get(i15);
                    if (s51.n(r51.s(xm1Var3), "text")) {
                        int i16 = i14;
                        int i17 = i12;
                        final i62 i62VarT8 = xm1Var3.t(m30.b(j, 0, iP02, 0, 0, 9));
                        ry0 ry0Var = l5.a;
                        int iZ02 = i62VarT8.z0(ry0Var);
                        int iZ03 = i62VarT8.z0(l5.b);
                        final int i18 = iMin - i13;
                        final int i19 = i18 - i11;
                        if (iZ02 == iZ03 || !(iZ02 != Integer.MIN_VALUE && iZ03 != Integer.MIN_VALUE)) {
                            iMax = Math.max(en1Var.p0(gv3.X), Math.max(i17, i16));
                            iP0 = (iMax - i62VarT8.g) / 2;
                            i2 = (i62VarT6 == null || (iZ0 = i62VarT6.z0(ry0Var)) == Integer.MIN_VALUE) ? 0 : (iZ02 + iP0) - iZ0;
                        } else {
                            iP0 = en1Var.p0(30.0f) - iZ02;
                            iMax = Math.max(en1Var.p0(gv3.Y), i62VarT8.g + iP0);
                            if (i62VarT6 != null) {
                                i2 = (iMax - i62VarT6.g) / 2;
                            }
                        }
                        final int i20 = i2;
                        final int i21 = iP0;
                        final int i22 = i62VarT7 != null ? (iMax - i62VarT7.g) / 2 : 0;
                        final i62 i62Var = i62VarT7;
                        final i62 i62Var2 = i62VarT6;
                        return en1Var.I0(iMin, iMax, oi0Var, new ns0() { // from class: g63
                            @Override // defpackage.ns0
                            public final Object h(Object obj3) {
                                h62 h62Var = (h62) obj3;
                                h62.F(h62Var, i62VarT8, 0, i21);
                                i62 i62Var3 = i62Var;
                                if (i62Var3 != null) {
                                    h62.F(h62Var, i62Var3, i18, i22);
                                }
                                i62 i62Var4 = i62Var2;
                                if (i62Var4 != null) {
                                    h62.F(h62Var, i62Var4, i19, i20);
                                }
                                return dm3.a;
                            }
                        });
                    }
                    i15++;
                    i14 = i14;
                    i62VarT7 = i62VarT7;
                    i62VarT6 = i62VarT6;
                }
                throw nc2.x("Collection contains no element matching the predicate.");
        }
    }
}
