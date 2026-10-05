package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hv1 implements cn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs0 b;
    public final /* synthetic */ rs0 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ hv1(cs0 cs0Var, rs0 rs0Var, boolean z, int i) {
        this.a = i;
        this.b = cs0Var;
        this.c = rs0Var;
        this.d = z;
    }

    @Override // defpackage.cn1
    public final dn1 c(final en1 en1Var, List list, long j) {
        Object obj;
        final i62 i62VarT;
        Object obj2;
        i62 i62VarT2;
        hv1 hv1Var = this;
        int i = hv1Var.a;
        cs0 cs0Var = hv1Var.b;
        rs0 rs0Var = hv1Var.c;
        i62 i62VarT3 = null;
        oi0 oi0Var = oi0.f;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) cs0Var.a()).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                long jB = m30.b(j, 0, 0, 0, 0, 10);
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    xm1 xm1Var = (xm1) list.get(i2);
                    final float f = fFloatValue;
                    if (s51.n(r51.s(xm1Var), "icon")) {
                        final i62 i62VarT4 = xm1Var.t(jB);
                        int iP0 = en1Var.p0(iv1.d * 2.0f) + i62VarT4.f;
                        int iM = vm1.M(iP0 * f);
                        int iP02 = en1Var.p0(iv1.e * 2.0f) + i62VarT4.g;
                        int size2 = list.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            int i4 = size2;
                            xm1 xm1Var2 = (xm1) list.get(i3);
                            int i5 = i3;
                            if (s51.n(r51.s(xm1Var2), "indicatorRipple")) {
                                if (!((iP0 >= 0) & (iP02 >= 0))) {
                                    o21.a("width and height must be >= 0");
                                }
                                final i62 i62VarT5 = xm1Var2.t(n30.h(iP0, iP0, iP02, iP02));
                                int size3 = list.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 < size3) {
                                        obj = list.get(i6);
                                        if (!s51.n(r51.s((xm1) obj), "indicator")) {
                                            i6++;
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                xm1 xm1Var3 = (xm1) obj;
                                if (xm1Var3 != null) {
                                    if (!((iM >= 0) & (iP02 >= 0))) {
                                        o21.a("width and height must be >= 0");
                                    }
                                    i62VarT = xm1Var3.t(n30.h(iM, iM, iP02, iP02));
                                } else {
                                    i62VarT = null;
                                }
                                if (rs0Var != null) {
                                    int size4 = list.size();
                                    for (int i7 = 0; i7 < size4; i7++) {
                                        xm1 xm1Var4 = (xm1) list.get(i7);
                                        if (s51.n(r51.s(xm1Var4), "label")) {
                                            i62VarT3 = xm1Var4.t(jB);
                                        }
                                    }
                                    throw nc2.x("Collection contains no element matching the predicate.");
                                }
                                final i62 i62Var = i62VarT3;
                                if (rs0Var == null) {
                                    final int iP03 = m30.i(j) == Integer.MAX_VALUE ? (en1Var.p0(iv1.g) * 2) + i62VarT4.f : m30.i(j);
                                    final int iF = n30.f(en1Var.p0(iv1.a), j);
                                    final int i8 = (iP03 - i62VarT4.f) / 2;
                                    final int i9 = (iF - i62VarT4.g) / 2;
                                    final int i10 = (iP03 - i62VarT5.f) / 2;
                                    final int i11 = (iF - i62VarT5.g) / 2;
                                    final int i12 = 0;
                                    return en1Var.I0(iP03, iF, oi0Var, new ns0() { // from class: ev1
                                        @Override // defpackage.ns0
                                        public final Object h(Object obj3) {
                                            int i13 = i12;
                                            dm3 dm3Var = dm3.a;
                                            int i14 = iF;
                                            int i15 = iP03;
                                            int i16 = i11;
                                            int i17 = i10;
                                            i62 i62Var2 = i62VarT5;
                                            int i18 = i9;
                                            int i19 = i8;
                                            i62 i62Var3 = i62VarT4;
                                            i62 i62Var4 = i62VarT;
                                            h62 h62Var = (h62) obj3;
                                            switch (i13) {
                                                case 0:
                                                    if (i62Var4 != null) {
                                                        h62.F(h62Var, i62Var4, (i15 - i62Var4.f) / 2, (i14 - i62Var4.g) / 2);
                                                    }
                                                    h62.F(h62Var, i62Var3, i19, i18);
                                                    h62.F(h62Var, i62Var2, i17, i16);
                                                    break;
                                                default:
                                                    if (i62Var4 != null) {
                                                        h62.F(h62Var, i62Var4, (i15 - i62Var4.f) / 2, (i14 - i62Var4.g) / 2);
                                                    }
                                                    h62.F(h62Var, i62Var3, i19, i18);
                                                    h62.F(h62Var, i62Var2, i17, i16);
                                                    break;
                                            }
                                            return dm3Var;
                                        }
                                    });
                                }
                                final i62 i62Var2 = i62VarT;
                                i62Var.getClass();
                                float f2 = i62VarT4.g;
                                float f3 = iv1.e;
                                float fT = en1Var.T(f3) + f2;
                                float f4 = iv1.c;
                                float fT2 = en1Var.T(f4) + fT + i62Var.g;
                                float fJ = (m30.j(j) - fT2) / 2.0f;
                                float fT3 = en1Var.T(f3);
                                if (fJ < fT3) {
                                    fJ = fT3;
                                }
                                float f5 = (fJ * 2.0f) + fT2;
                                final boolean z = this.d;
                                final float f6 = (1.0f - f) * ((z ? fJ : (f5 - i62VarT4.g) / 2.0f) - fJ);
                                final float fT4 = en1Var.T(f4) + en1Var.T(f3) + i62VarT4.g + fJ;
                                int iP04 = m30.i(j) == Integer.MAX_VALUE ? (en1Var.p0(iv1.g) * 2) + i62VarT4.f : m30.i(j);
                                final int i13 = (iP04 - i62Var.f) / 2;
                                final int i14 = (iP04 - i62VarT4.f) / 2;
                                final int i15 = (iP04 - i62VarT5.f) / 2;
                                final float fT5 = fJ - en1Var.T(f3);
                                final float f7 = fJ;
                                final int i16 = iP04;
                                final int i17 = 0;
                                return en1Var.I0(i16, vm1.M(f5), oi0Var, new ns0() { // from class: dv1
                                    @Override // defpackage.ns0
                                    public final Object h(Object obj3) {
                                        int i18 = i17;
                                        dm3 dm3Var = dm3.a;
                                        en1 en1Var2 = en1Var;
                                        int i19 = i16;
                                        float f8 = fT5;
                                        int i20 = i15;
                                        i62 i62Var3 = i62VarT5;
                                        float f9 = f7;
                                        int i21 = i14;
                                        i62 i62Var4 = i62VarT4;
                                        float f10 = f6;
                                        float f11 = fT4;
                                        int i22 = i13;
                                        i62 i62Var5 = i62Var;
                                        float f12 = f;
                                        boolean z2 = z;
                                        i62 i62Var6 = i62Var2;
                                        switch (i18) {
                                            case 0:
                                                h62 h62Var = (h62) obj3;
                                                if (i62Var6 != null) {
                                                    h62.F(h62Var, i62Var6, (i19 - i62Var6.f) / 2, vm1.M((f9 - en1Var2.p0(iv1.e)) + f10));
                                                }
                                                if (z2 || f12 != 0.0f) {
                                                    h62.F(h62Var, i62Var5, i22, vm1.M(f11 + f10));
                                                }
                                                h62.F(h62Var, i62Var4, i21, vm1.M(f9 + f10));
                                                h62.F(h62Var, i62Var3, i20, vm1.M(f8 + f10));
                                                break;
                                            default:
                                                h62 h62Var2 = (h62) obj3;
                                                if (i62Var6 != null) {
                                                    h62.F(h62Var2, i62Var6, (i19 - i62Var6.f) / 2, vm1.M((f9 - en1Var2.T(wv1.e)) + f10));
                                                }
                                                if (z2 || f12 != 0.0f) {
                                                    h62.F(h62Var2, i62Var5, i22, vm1.M(f11 + f10));
                                                }
                                                h62.F(h62Var2, i62Var4, i21, vm1.M(f9 + f10));
                                                h62.F(h62Var2, i62Var3, i20, vm1.M(f8 + f10));
                                                break;
                                        }
                                        return dm3Var;
                                    }
                                });
                            }
                            i3 = i5 + 1;
                            size2 = i4;
                        }
                        throw nc2.x("Collection contains no element matching the predicate.");
                    }
                    i2++;
                    fFloatValue = f;
                }
                throw nc2.x("Collection contains no element matching the predicate.");
            default:
                float fFloatValue2 = ((Number) cs0Var.a()).floatValue();
                float f8 = fFloatValue2 < 0.0f ? 0.0f : fFloatValue2;
                long jB2 = m30.b(j, 0, 0, 0, 0, 10);
                int size5 = list.size();
                int i18 = 0;
                while (i18 < size5) {
                    xm1 xm1Var5 = (xm1) list.get(i18);
                    if (s51.n(r51.s(xm1Var5), "icon")) {
                        final i62 i62VarT6 = xm1Var5.t(jB2);
                        int iP05 = en1Var.p0(wv1.d * 2.0f) + i62VarT6.f;
                        int iM2 = vm1.M(iP05 * f8);
                        int iP06 = en1Var.p0((rs0Var == null ? wv1.f : wv1.e) * 2.0f) + i62VarT6.g;
                        int size6 = list.size();
                        int i19 = 0;
                        while (i19 < size6) {
                            int i20 = i19;
                            xm1 xm1Var6 = (xm1) list.get(i19);
                            int i21 = size6;
                            if (s51.n(r51.s(xm1Var6), "indicatorRipple")) {
                                if (!((iP05 >= 0) & (iP06 >= 0))) {
                                    o21.a("width and height must be >= 0");
                                }
                                final i62 i62VarT7 = xm1Var6.t(n30.h(iP05, iP05, iP06, iP06));
                                int size7 = list.size();
                                int i22 = 0;
                                while (true) {
                                    if (i22 < size7) {
                                        obj2 = list.get(i22);
                                        if (!s51.n(r51.s((xm1) obj2), "indicator")) {
                                            i22++;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                xm1 xm1Var7 = (xm1) obj2;
                                if (xm1Var7 != null) {
                                    if (!((iM2 >= 0) & (iP06 >= 0))) {
                                        o21.a("width and height must be >= 0");
                                    }
                                    i62VarT2 = xm1Var7.t(n30.h(iM2, iM2, iP06, iP06));
                                } else {
                                    i62VarT2 = null;
                                }
                                if (rs0Var != null) {
                                    int size8 = list.size();
                                    for (int i23 = 0; i23 < size8; i23++) {
                                        xm1 xm1Var8 = (xm1) list.get(i23);
                                        if (s51.n(r51.s(xm1Var8), "label")) {
                                            i62VarT3 = xm1Var8.t(jB2);
                                        }
                                    }
                                    throw nc2.x("Collection contains no element matching the predicate.");
                                }
                                final i62 i62Var3 = i62VarT3;
                                if (rs0Var == null) {
                                    final int iG = n30.g(Math.max(i62VarT6.f, Math.max(i62VarT7.f, i62VarT2 != null ? i62VarT2.f : 0)), j);
                                    final int iF2 = n30.f(en1Var.p0(wv1.b), j);
                                    final int i24 = (iG - i62VarT6.f) / 2;
                                    final int i25 = (iF2 - i62VarT6.g) / 2;
                                    final int i26 = (iG - i62VarT7.f) / 2;
                                    final int i27 = (iF2 - i62VarT7.g) / 2;
                                    final int i28 = 1;
                                    final i62 i62Var4 = i62VarT2;
                                    return en1Var.I0(iG, iF2, oi0Var, new ns0() { // from class: ev1
                                        @Override // defpackage.ns0
                                        public final Object h(Object obj3) {
                                            int i132 = i28;
                                            dm3 dm3Var = dm3.a;
                                            int i142 = iF2;
                                            int i152 = iG;
                                            int i162 = i27;
                                            int i172 = i26;
                                            i62 i62Var22 = i62VarT7;
                                            int i182 = i25;
                                            int i192 = i24;
                                            i62 i62Var32 = i62VarT6;
                                            i62 i62Var42 = i62Var4;
                                            h62 h62Var = (h62) obj3;
                                            switch (i132) {
                                                case 0:
                                                    if (i62Var42 != null) {
                                                        h62.F(h62Var, i62Var42, (i152 - i62Var42.f) / 2, (i142 - i62Var42.g) / 2);
                                                    }
                                                    h62.F(h62Var, i62Var32, i192, i182);
                                                    h62.F(h62Var, i62Var22, i172, i162);
                                                    break;
                                                default:
                                                    if (i62Var42 != null) {
                                                        h62.F(h62Var, i62Var42, (i152 - i62Var42.f) / 2, (i142 - i62Var42.g) / 2);
                                                    }
                                                    h62.F(h62Var, i62Var32, i192, i182);
                                                    h62.F(h62Var, i62Var22, i172, i162);
                                                    break;
                                            }
                                            return dm3Var;
                                        }
                                    });
                                }
                                final i62 i62Var5 = i62VarT2;
                                i62Var3.getClass();
                                float f9 = i62VarT6.g;
                                float f10 = wv1.e;
                                float fT6 = en1Var.T(f10) + f9;
                                float f11 = wv1.c;
                                float fT7 = en1Var.T(f11) + fT6 + i62Var3.g;
                                float fJ2 = (m30.j(j) - fT7) / 2.0f;
                                final float fT8 = en1Var.T(f10);
                                if (fJ2 >= fT8) {
                                    fT8 = fJ2;
                                }
                                float f12 = (fT8 * 2.0f) + fT7;
                                final boolean z2 = this.d;
                                final float f13 = (1.0f - f8) * ((z2 ? fT8 : (f12 - i62VarT6.g) / 2.0f) - fT8);
                                final float fT9 = en1Var.T(f11) + en1Var.T(f10) + i62VarT6.g + fT8;
                                final int iG2 = n30.g(Math.max(i62VarT6.f, Math.max(i62Var3.f, i62Var5 != null ? i62Var5.f : 0)), j);
                                final int i29 = (iG2 - i62Var3.f) / 2;
                                final int i30 = (iG2 - i62VarT6.f) / 2;
                                final int i31 = (iG2 - i62VarT7.f) / 2;
                                final float fT10 = fT8 - en1Var.T(f10);
                                int iM3 = vm1.M(f12);
                                final int i32 = 1;
                                final float f14 = f8;
                                return en1Var.I0(iG2, iM3, oi0Var, new ns0() { // from class: dv1
                                    @Override // defpackage.ns0
                                    public final Object h(Object obj3) {
                                        int i182 = i32;
                                        dm3 dm3Var = dm3.a;
                                        en1 en1Var2 = en1Var;
                                        int i192 = iG2;
                                        float f82 = fT10;
                                        int i202 = i31;
                                        i62 i62Var32 = i62VarT7;
                                        float f92 = fT8;
                                        int i212 = i30;
                                        i62 i62Var42 = i62VarT6;
                                        float f102 = f13;
                                        float f112 = fT9;
                                        int i222 = i29;
                                        i62 i62Var52 = i62Var3;
                                        float f122 = f14;
                                        boolean z22 = z2;
                                        i62 i62Var6 = i62Var5;
                                        switch (i182) {
                                            case 0:
                                                h62 h62Var = (h62) obj3;
                                                if (i62Var6 != null) {
                                                    h62.F(h62Var, i62Var6, (i192 - i62Var6.f) / 2, vm1.M((f92 - en1Var2.p0(iv1.e)) + f102));
                                                }
                                                if (z22 || f122 != 0.0f) {
                                                    h62.F(h62Var, i62Var52, i222, vm1.M(f112 + f102));
                                                }
                                                h62.F(h62Var, i62Var42, i212, vm1.M(f92 + f102));
                                                h62.F(h62Var, i62Var32, i202, vm1.M(f82 + f102));
                                                break;
                                            default:
                                                h62 h62Var2 = (h62) obj3;
                                                if (i62Var6 != null) {
                                                    h62.F(h62Var2, i62Var6, (i192 - i62Var6.f) / 2, vm1.M((f92 - en1Var2.T(wv1.e)) + f102));
                                                }
                                                if (z22 || f122 != 0.0f) {
                                                    h62.F(h62Var2, i62Var52, i222, vm1.M(f112 + f102));
                                                }
                                                h62.F(h62Var2, i62Var42, i212, vm1.M(f92 + f102));
                                                h62.F(h62Var2, i62Var32, i202, vm1.M(f82 + f102));
                                                break;
                                        }
                                        return dm3Var;
                                    }
                                });
                            }
                            f8 = f8;
                            i19 = i20 + 1;
                            size6 = i21;
                        }
                        throw nc2.x("Collection contains no element matching the predicate.");
                    }
                    i18++;
                    hv1Var = hv1Var;
                }
                throw nc2.x("Collection contains no element matching the predicate.");
        }
    }
}
