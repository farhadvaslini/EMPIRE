package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rg1 implements cn1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rg1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cn1
    public final dn1 c(final en1 en1Var, List list, long j) {
        int i;
        Float fValueOf;
        int iMax;
        int iMax2;
        int i2;
        int i3;
        int iM;
        final i62 i62VarT;
        int i4 = this.a;
        Object obj = this.b;
        oi0 oi0Var = oi0.f;
        switch (i4) {
            case 0:
                return en1Var.I0(m30.i(j), m30.h(j), oi0Var, new i(27, list, this));
            case 1:
                h53 h53Var = (h53) obj;
                int i5 = h53Var.f;
                float[] fArr = h53Var.l;
                t02 t02Var = h53Var.r;
                int size = list.size();
                for (int i6 = 0; i6 < size; i6++) {
                    xm1 xm1Var = (xm1) list.get(i6);
                    if (r51.s(xm1Var) == s43.f) {
                        final i62 i62VarT2 = xm1Var.t(j);
                        int size2 = list.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            xm1 xm1Var2 = (xm1) list.get(i7);
                            if (r51.s(xm1Var2) == s43.g) {
                                int i8 = 1;
                                t02 t02Var2 = t02.f;
                                i62 i62VarT3 = t02Var == t02Var2 ? xm1Var2.t(m30.b(n30.j(0, -i62VarT2.g, 1, j), 0, 0, 0, 0, 14)) : xm1Var2.t(m30.b(n30.j(-i62VarT2.f, 0, 2, j), 0, 0, 0, 0, 11));
                                final ok2 ok2Var = new ok2();
                                float fB = h53Var.b();
                                fArr.getClass();
                                if (fArr.length == 0) {
                                    fValueOf = null;
                                    i = 0;
                                } else {
                                    i = 0;
                                    fValueOf = Float.valueOf(fArr[0]);
                                }
                                if (!s51.m(fB, fValueOf) && !s51.m(fB, uj.X(fArr))) {
                                    i8 = i;
                                }
                                int iZ0 = i62VarT3.z0(g53.f);
                                if (iZ0 != Integer.MIN_VALUE) {
                                    i = iZ0;
                                }
                                if (t02Var == t02Var2) {
                                    iMax = Math.max(i62VarT3.f, i62VarT2.f);
                                    int i9 = i62VarT2.g;
                                    int i10 = i62VarT3.g;
                                    iMax2 = i9 + i10;
                                    i2 = (iMax - i62VarT3.f) / 2;
                                    i3 = i9 / 2;
                                    iM = (iMax - i62VarT2.f) / 2;
                                    ok2Var.f = (i5 <= 0 || i8 != 0) ? vm1.M(i10 * fB) : vm1.M((i10 - (i * 2)) * fB) + i;
                                } else {
                                    iMax = i62VarT2.f + i62VarT3.f;
                                    iMax2 = Math.max(i62VarT3.g, i62VarT2.g);
                                    i2 = i62VarT2.f / 2;
                                    i3 = (iMax2 - i62VarT3.g) / 2;
                                    iM = (i5 <= 0 || i8 != 0) ? vm1.M(i62VarT3.f * fB) : vm1.M((i62VarT3.f - (i * 2)) * fB) + i;
                                    ok2Var.f = (iMax2 - i62VarT2.g) / 2;
                                }
                                final int i11 = i3;
                                final int i12 = i2;
                                final int i13 = iM;
                                h53Var.m.h(iMax);
                                h53Var.n.h(iMax2);
                                final i62 i62Var = i62VarT3;
                                return en1Var.I0(iMax, iMax2, oi0Var, new ns0() { // from class: d53
                                    @Override // defpackage.ns0
                                    public final Object h(Object obj2) {
                                        h62 h62Var = (h62) obj2;
                                        h62.F(h62Var, i62Var, i12, i11);
                                        h62.F(h62Var, i62VarT2, i13, ok2Var.f);
                                        return dm3.a;
                                    }
                                });
                            }
                        }
                        throw nc2.x("Collection contains no element matching the predicate.");
                    }
                }
                throw nc2.x("Collection contains no element matching the predicate.");
            default:
                final i62 i62Var2 = null;
                if (((rs0) obj) != null) {
                    int size3 = list.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        xm1 xm1Var3 = (xm1) list.get(i14);
                        if (s51.n(r51.s(xm1Var3), "text")) {
                            i62VarT = xm1Var3.t(m30.b(j, 0, 0, 0, 0, 11));
                        }
                    }
                    throw nc2.x("Collection contains no element matching the predicate.");
                }
                i62VarT = null;
                final int iMax3 = Math.max(i62VarT != null ? i62VarT.f : 0, 0);
                final int iMax4 = Math.max(en1Var.p0(lc3.a), en1Var.f0(lc3.e) + 0 + (i62VarT != null ? i62VarT.g : 0));
                final Integer numValueOf = i62VarT != null ? Integer.valueOf(i62VarT.z0(l5.a)) : null;
                final Integer numValueOf2 = i62VarT != null ? Integer.valueOf(i62VarT.z0(l5.b)) : null;
                return en1Var.I0(iMax3, iMax4, oi0Var, new ns0() { // from class: kc3
                    @Override // defpackage.ns0
                    public final Object h(Object obj2) {
                        h62 h62Var = (h62) obj2;
                        i62 i62Var3 = i62VarT;
                        i62 i62Var4 = i62Var2;
                        int i15 = iMax4;
                        if (i62Var3 != null && i62Var4 != null) {
                            Integer num = numValueOf;
                            num.getClass();
                            int iIntValue = num.intValue();
                            Integer num2 = numValueOf2;
                            num2.getClass();
                            int iIntValue2 = num2.intValue();
                            float f = iIntValue == iIntValue2 ? lc3.c : lc3.d;
                            en1 en1Var2 = en1Var;
                            int iP0 = en1Var2.p0(cd2.b) + en1Var2.p0(f);
                            int iF0 = (en1Var2.f0(lc3.e) + i62Var4.g) - iIntValue;
                            int i16 = i62Var3.f;
                            int i17 = iMax3;
                            int i18 = (i15 - iIntValue2) - iP0;
                            h62.F(h62Var, i62Var3, (i17 - i16) / 2, i18);
                            h62.F(h62Var, i62Var4, (i17 - i62Var4.f) / 2, i18 - iF0);
                        } else if (i62Var3 != null) {
                            float f2 = lc3.a;
                            h62.F(h62Var, i62Var3, 0, (i15 - i62Var3.g) / 2);
                        } else if (i62Var4 != null) {
                            float f3 = lc3.a;
                            h62.F(h62Var, i62Var4, 0, (i15 - i62Var4.g) / 2);
                        }
                        return dm3.a;
                    }
                });
        }
    }
}
