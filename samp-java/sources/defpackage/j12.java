package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j12 implements cn1 {
    public final ns0 a;
    public final boolean b;
    public final ef3 c;
    public final bf3 d;
    public final x12 e;
    public final float f;

    public j12(ns0 ns0Var, boolean z, ef3 ef3Var, bf3 bf3Var, x12 x12Var, float f) {
        this.a = ns0Var;
        this.b = z;
        this.c = ef3Var;
        this.d = bf3Var;
        this.e = x12Var;
        this.f = f;
    }

    public static final int j(int i, j12 j12Var, int i2, int i3, i62 i62Var, i62 i62Var2) {
        if (j12Var.b) {
            i3 = Math.round(((i2 - i62Var2.g) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (i62Var != null ? i62Var.g : 0) / 2);
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        return h(k51Var, list, i, new h12(1));
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        return i(k51Var, list, i, new h12(0));
    }

    @Override // defpackage.cn1
    public final dn1 c(final en1 en1Var, List list, long j) {
        Object obj;
        Object obj2;
        i62 i62Var;
        int i;
        i62 i62VarT;
        Object obj3;
        i62 i62Var2;
        int i2;
        i62 i62VarT2;
        Object obj4;
        i62 i62Var3;
        int i3;
        i62 i62VarT3;
        Object obj5;
        long jFloatToRawIntBits;
        Object obj6;
        Object obj7;
        i62 i62Var4;
        int i4;
        qk2 qk2Var;
        int i5;
        qk2 qk2Var2;
        i62 i62Var5;
        int i6;
        long j2;
        int i7;
        i62 i62Var6;
        i62 i62Var7;
        int i8;
        i62 i62Var8;
        xm1 xm1Var;
        j12 j12Var;
        en1 en1Var2;
        i62 i62Var9;
        int i9;
        i62 i62Var10;
        i62 i62Var11;
        int i10;
        int i11;
        int i12;
        qk2 qk2Var3;
        int i13;
        j12 j12Var2;
        i62 i62Var12;
        i62 i62Var13;
        int i14;
        i62 i62Var14;
        int i15;
        en1 en1Var3;
        float f;
        List list2 = list;
        float fA = this.d.a();
        x12 x12Var = this.e;
        int iP0 = en1Var.p0(x12Var.c());
        long jB = m30.b(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i16);
            if (s51.n(r51.s((xm1) obj), "Leading")) {
                break;
            }
            i16++;
        }
        xm1 xm1Var2 = (xm1) obj;
        i62 i62VarT4 = xm1Var2 != null ? xm1Var2.t(jB) : null;
        int i17 = i62VarT4 != null ? i62VarT4.f : 0;
        int iMax = Math.max(0, i62VarT4 != null ? i62VarT4.g : 0);
        int size2 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list2.get(i18);
            if (s51.n(r51.s((xm1) obj2), "Trailing")) {
                break;
            }
            i18++;
        }
        xm1 xm1Var3 = (xm1) obj2;
        if (xm1Var3 != null) {
            i62Var = i62VarT4;
            i = i17;
            i62VarT = xm1Var3.t(n30.j(-i17, 0, 2, jB));
        } else {
            i62Var = i62VarT4;
            i = i17;
            i62VarT = null;
        }
        int i19 = i + (i62VarT != null ? i62VarT.f : 0);
        int iMax2 = Math.max(iMax, i62VarT != null ? i62VarT.g : 0);
        int size3 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i20);
            int i21 = size3;
            if (s51.n(r51.s((xm1) obj3), "Prefix")) {
                break;
            }
            i20++;
            size3 = i21;
        }
        xm1 xm1Var4 = (xm1) obj3;
        if (xm1Var4 != null) {
            i62Var2 = i62VarT;
            i2 = i19;
            i62VarT2 = xm1Var4.t(n30.j(-i19, 0, 2, jB));
        } else {
            i62Var2 = i62VarT;
            i2 = i19;
            i62VarT2 = null;
        }
        int i22 = i2 + (i62VarT2 != null ? i62VarT2.f : 0);
        int iMax3 = Math.max(iMax2, i62VarT2 != null ? i62VarT2.g : 0);
        int size4 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i23);
            int i24 = size4;
            if (s51.n(r51.s((xm1) obj4), "Suffix")) {
                break;
            }
            i23++;
            size4 = i24;
        }
        xm1 xm1Var5 = (xm1) obj4;
        if (xm1Var5 != null) {
            i62Var3 = i62VarT2;
            i3 = i22;
            i62VarT3 = xm1Var5.t(n30.j(-i22, 0, 2, jB));
        } else {
            i62Var3 = i62VarT2;
            i3 = i22;
            i62VarT3 = null;
        }
        int i25 = i3 + (i62VarT3 != null ? i62VarT3.f : 0);
        int iMax4 = Math.max(iMax3, i62VarT3 != null ? i62VarT3.g : 0);
        int size5 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i26);
            int i27 = size5;
            if (s51.n(r51.s((xm1) obj5), "Label")) {
                break;
            }
            i26++;
            size5 = i27;
        }
        xm1 xm1Var6 = (xm1) obj5;
        qk2 qk2Var4 = new qk2();
        int iP02 = en1Var.p0(x12Var.b(en1Var.getLayoutDirection())) + en1Var.p0(x12Var.a(en1Var.getLayoutDirection()));
        int i28 = -lq.O(i25 + iP02, fA, iP02);
        int i29 = -iP0;
        i62 i62VarT5 = xm1Var6 != null ? xm1Var6.t(n30.i(jB, i28, i29)) : null;
        qk2Var4.f = i62VarT5;
        if (i62VarT5 != null) {
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i62VarT5.g)) & 4294967295L) | (((long) Float.floatToRawIntBits(i62VarT5.f)) << 32);
        } else {
            jFloatToRawIntBits = 0;
        }
        this.a.h(new h43(jFloatToRawIntBits));
        int size6 = list2.size();
        int i30 = 0;
        while (true) {
            if (i30 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i30);
            if (s51.n(r51.s((xm1) obj6), "Supporting")) {
                break;
            }
            i30++;
        }
        xm1 xm1Var7 = (xm1) obj6;
        int iX0 = xm1Var7 != null ? xm1Var7.x0(m30.k(j)) : 0;
        i62 i62Var15 = (i62) qk2Var4.f;
        int iMax5 = Math.max((i62Var15 != null ? i62Var15.g : 0) / 2, en1Var.p0(x12Var.d()));
        long j3 = j;
        long jI = n30.i(j3, -i25, (i29 - iMax5) - iX0);
        xm1 xm1Var8 = xm1Var7;
        long jB2 = m30.b(jI, 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i31 = 0;
        while (i31 < size7) {
            xm1 xm1Var9 = xm1Var8;
            xm1 xm1Var10 = (xm1) list2.get(i31);
            int i32 = iMax5;
            int i33 = size7;
            if (s51.n(r51.s(xm1Var10), "TextField")) {
                i62 i62VarT6 = xm1Var10.t(jB2);
                long jB3 = m30.b(jB2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i34 = 0;
                while (true) {
                    if (i34 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj8 = list2.get(i34);
                    int i35 = size8;
                    if (s51.n(r51.s((xm1) obj8), "Hint")) {
                        obj7 = obj8;
                        break;
                    }
                    i34++;
                    size8 = i35;
                }
                xm1 xm1Var11 = (xm1) obj7;
                i62 i62VarT7 = xm1Var11 != null ? xm1Var11.t(jB3) : null;
                int iMax6 = Math.max(iMax4, Math.max(i62VarT6.g, i62VarT7 != null ? i62VarT7.g : 0) + i32 + iP0);
                int i36 = i62Var != null ? i62Var.f : 0;
                i62 i62Var16 = i62Var2;
                int i37 = i62Var2 != null ? i62Var16.f : 0;
                i62 i62Var17 = i62Var3;
                int i38 = i62Var3 != null ? i62Var17.f : 0;
                if (i62VarT3 != null) {
                    i4 = i62VarT3.f;
                    i62Var4 = i62Var16;
                } else {
                    i62Var4 = i62Var16;
                    i4 = 0;
                }
                int i39 = i62VarT6.f;
                i62 i62Var18 = i62Var4;
                i62 i62Var19 = (i62) qk2Var4.f;
                if (i62Var19 != null) {
                    i5 = i62Var19.f;
                    qk2Var = qk2Var4;
                } else {
                    qk2Var = qk2Var4;
                    i5 = 0;
                }
                if (i62VarT7 != null) {
                    i62Var5 = i62VarT6;
                    i6 = i36;
                    qk2Var2 = qk2Var;
                    j2 = j3;
                    i7 = i62VarT7.f;
                    i62Var6 = i62VarT7;
                    i62Var7 = i62VarT3;
                    i8 = i38;
                    i62Var8 = i62Var17;
                    xm1Var = xm1Var9;
                    j12Var = this;
                    i62Var9 = i62Var;
                    i9 = iMax6;
                    i62Var10 = i62Var18;
                    en1Var2 = en1Var;
                } else {
                    qk2Var2 = qk2Var;
                    i62Var5 = i62VarT6;
                    i6 = i36;
                    j2 = j3;
                    i7 = 0;
                    i62Var6 = i62VarT7;
                    i62Var7 = i62VarT3;
                    i8 = i38;
                    i62Var8 = i62Var17;
                    xm1Var = xm1Var9;
                    j12Var = this;
                    en1Var2 = en1Var;
                    i62Var9 = i62Var;
                    i9 = iMax6;
                    i62Var10 = i62Var18;
                }
                final int iG = j12Var.g(en1Var2, i6, i37, i8, i4, i39, i5, i7, j2, fA);
                final i62 i62VarT8 = xm1Var != null ? xm1Var.t(m30.b(n30.j(0, -i9, 1, jB), 0, iG, 0, 0, 9)) : null;
                int i40 = i62VarT8 != null ? i62VarT8.g : 0;
                i62 i62Var20 = i62Var9;
                int i41 = i62Var9 != null ? i62Var20.g : 0;
                final i62 i62Var21 = i62Var10;
                int i42 = i62Var10 != null ? i62Var21.g : 0;
                i62 i62Var22 = i62Var8;
                int i43 = i62Var22 != null ? i62Var22.g : 0;
                i62 i62Var23 = i62Var7;
                int i44 = i62Var23 != null ? i62Var23.g : 0;
                i62 i62Var24 = i62Var5;
                int i45 = i62Var24.g;
                qk2 qk2Var5 = qk2Var2;
                i62 i62Var25 = (i62) qk2Var5.f;
                int i46 = i62Var25 != null ? i62Var25.g : 0;
                int i47 = i40;
                final i62 i62Var26 = i62Var6;
                if (i62Var26 != null) {
                    i62Var11 = i62Var23;
                    i10 = i44;
                    i11 = i45;
                    i12 = i62Var26.g;
                } else {
                    i62Var11 = i62Var23;
                    i10 = i44;
                    i11 = i45;
                    i12 = 0;
                }
                if (i62VarT8 != null) {
                    qk2Var3 = qk2Var5;
                    i13 = i62VarT8.g;
                    i62Var12 = i62Var22;
                    i62Var13 = i62Var24;
                    i14 = i46;
                    i62Var14 = i62Var20;
                    i15 = 0;
                    en1Var3 = en1Var;
                    f = fA;
                    j12Var2 = this;
                } else {
                    qk2Var3 = qk2Var5;
                    i13 = 0;
                    j12Var2 = this;
                    i62Var12 = i62Var22;
                    i62Var13 = i62Var24;
                    i14 = i46;
                    i62Var14 = i62Var20;
                    i15 = 0;
                    en1Var3 = en1Var;
                    f = fA;
                }
                final int iF = j12Var2.f(en1Var3, i41, i42, i43, i10, i11, i14, i12, i13, j, f);
                final float f2 = f;
                int i48 = iF - i47;
                int size9 = list.size();
                int i49 = i15;
                while (i49 < size9) {
                    xm1 xm1Var12 = (xm1) list.get(i49);
                    if (s51.n(r51.s(xm1Var12), "Container")) {
                        final i62 i62VarT9 = xm1Var12.t(n30.a(iG != Integer.MAX_VALUE ? iG : i15, iG, i48 != Integer.MAX_VALUE ? i48 : i15, i48));
                        final i62 i62Var27 = i62Var14;
                        final i62 i62Var28 = i62Var12;
                        final i62 i62Var29 = i62Var11;
                        final qk2 qk2Var6 = qk2Var3;
                        final i62 i62Var30 = i62Var13;
                        return en1Var.I0(iG, iF, oi0.f, new ns0() { // from class: i12
                            @Override // defpackage.ns0
                            public final Object h(Object obj9) {
                                int i50;
                                j12 j12Var3;
                                int i51;
                                int i52;
                                j12 j12Var4;
                                int i53;
                                float f3;
                                float f4;
                                float f5;
                                h62 h62Var = (h62) obj9;
                                i62 i62Var31 = (i62) qk2Var6.f;
                                en1 en1Var4 = en1Var;
                                float fH = en1Var4.h();
                                bb1 layoutDirection = en1Var4.getLayoutDirection();
                                j12 j12Var5 = this.f;
                                float fT = en1Var4.T(j12Var5.f);
                                ef3 ef3Var = j12Var5.c;
                                x12 x12Var2 = j12Var5.e;
                                h62Var.C(i62VarT9, 0, 0, 0.0f);
                                i62 i62Var32 = i62VarT8;
                                int i54 = iF - (i62Var32 != null ? i62Var32.g : 0);
                                int iM = vm1.M(x12Var2.d() * fH);
                                i62 i62Var33 = i62Var27;
                                if (i62Var33 != null) {
                                    h62.F(h62Var, i62Var33, 0, Math.round(((i54 - i62Var33.g) / 2.0f) * 1.0f));
                                }
                                int i55 = iG;
                                i62 i62Var34 = i62Var21;
                                if (i62Var31 != null) {
                                    int iRound = j12Var5.b ? Math.round(((i54 - i62Var31.g) / 2.0f) * 1.0f) : iM;
                                    int i56 = -(i62Var31.g / 2);
                                    i50 = i55;
                                    float f6 = f2;
                                    int iO = lq.O(iRound, f6, i56);
                                    float fX = f80.x(x12Var2, layoutDirection) * fH;
                                    float fW = f80.w(x12Var2, layoutDirection) * fH;
                                    if (i62Var33 == null) {
                                        f4 = fX;
                                        f3 = 0.0f;
                                    } else {
                                        f3 = 0.0f;
                                        float f7 = i62Var33.f;
                                        float f8 = fX - fT;
                                        if (f8 < 0.0f) {
                                            f8 = 0.0f;
                                        }
                                        f4 = f7 + f8;
                                    }
                                    if (i62Var34 == null) {
                                        j12Var3 = j12Var5;
                                        f5 = fW;
                                    } else {
                                        j12Var3 = j12Var5;
                                        float f9 = i62Var34.f;
                                        float f10 = fW - fT;
                                        if (f10 < f3) {
                                            f10 = f3;
                                        }
                                        f5 = f9 + f10;
                                    }
                                    bb1 bb1Var = bb1.f;
                                    h62Var.C(i62Var31, vm1.M(lq.N(ef3Var.b.a(i62Var31.f, i50 - vm1.M(f4 + f5), layoutDirection) + (layoutDirection == bb1Var ? f4 : f5), ((tm) oz2.s(ef3Var)).a(i62Var31.f, i50 - vm1.M(fX + fW), layoutDirection) + (layoutDirection == bb1Var ? fX : fW), f6)), iO, f3);
                                } else {
                                    i50 = i55;
                                    j12Var3 = j12Var5;
                                }
                                i62 i62Var35 = i62Var28;
                                if (i62Var35 != null) {
                                    i51 = iM;
                                    i52 = i54;
                                    j12Var4 = j12Var3;
                                    i53 = 0;
                                    h62.F(h62Var, i62Var35, i62Var33 != null ? i62Var33.f : 0, j12.j(0, j12Var4, i52, i51, i62Var31, i62Var35));
                                } else {
                                    i51 = iM;
                                    i52 = i54;
                                    j12Var4 = j12Var3;
                                    i53 = 0;
                                }
                                int i57 = (i62Var33 != null ? i62Var33.f : 0) + (i62Var35 != null ? i62Var35.f : 0);
                                i62 i62Var36 = i62Var30;
                                h62.F(h62Var, i62Var36, i57, j12.j(i53, j12Var4, i52, i51, i62Var31, i62Var36));
                                i62 i62Var37 = i62Var26;
                                if (i62Var37 != null) {
                                    h62.F(h62Var, i62Var37, i57, j12.j(i53, j12Var4, i52, i51, i62Var31, i62Var37));
                                }
                                i62 i62Var38 = i62Var29;
                                if (i62Var38 != null) {
                                    h62.F(h62Var, i62Var38, (i50 - (i62Var34 != null ? i62Var34.f : 0)) - i62Var38.f, j12.j(i53, j12Var4, i52, i51, i62Var31, i62Var38));
                                }
                                if (i62Var34 != null) {
                                    h62.F(h62Var, i62Var34, i50 - i62Var34.f, Math.round(((i52 - i62Var34.g) / 2.0f) * 1.0f));
                                }
                                if (i62Var32 != null) {
                                    h62.F(h62Var, i62Var32, 0, i52);
                                }
                                return dm3.a;
                            }
                        });
                    }
                    i49++;
                    iF = iF;
                }
                throw nc2.x("Collection contains no element matching the predicate.");
            }
            i31++;
            j3 = j;
            xm1Var8 = xm1Var9;
            size7 = i33;
            i62Var3 = i62Var3;
            list2 = list2;
            iMax5 = i32;
        }
        throw nc2.x("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        return h(k51Var, list, i, new z00(29, (byte) 0));
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
        return i(k51Var, list, i, new h12(2));
    }

    public final int f(k51 k51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, lq.O(i6, f, 0)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        x12 x12Var = this.e;
        float fT = k51Var.T(x12Var.d());
        return n30.f(Math.max(i, Math.max(i2, vm1.M(lq.N(fT, Math.max(fT, i6 / 2.0f), f) + i5 + k51Var.T(x12Var.c())))) + i8, j);
    }

    public final int g(k51 k51Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, lq.O(i6, f, 0))) + i + i2;
        x12 x12Var = this.e;
        bb1 bb1Var = bb1.f;
        return n30.g(Math.max(iMax, vm1.M((i6 + k51Var.T(x12Var.b(bb1Var) + x12Var.a(bb1Var))) * f)), j);
    }

    public final int h(k51 k51Var, List list, int i, rs0 rs0Var) {
        Object obj;
        int iL;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        Object obj6;
        Object obj7;
        j12 j12Var = this;
        float fA = j12Var.d.a();
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (s51.n(uq.v((xm1) obj), "Leading")) {
                break;
            }
            i2++;
        }
        xm1 xm1Var = (xm1) obj;
        if (xm1Var != null) {
            iL = uq.L(i, xm1Var.u0(Integer.MAX_VALUE));
            iIntValue = ((Number) rs0Var.f(xm1Var, Integer.valueOf(i))).intValue();
        } else {
            iL = i;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i3);
            if (s51.n(uq.v((xm1) obj2), "Trailing")) {
                break;
            }
            i3++;
        }
        xm1 xm1Var2 = (xm1) obj2;
        if (xm1Var2 != null) {
            iL = uq.L(iL, xm1Var2.u0(Integer.MAX_VALUE));
            iIntValue2 = ((Number) rs0Var.f(xm1Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i4);
            if (s51.n(uq.v((xm1) obj3), "Label")) {
                break;
            }
            i4++;
        }
        Object obj8 = (xm1) obj3;
        int iIntValue5 = obj8 != null ? ((Number) rs0Var.f(obj8, Integer.valueOf(lq.O(iL, fA, i)))).intValue() : 0;
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i5);
            if (s51.n(uq.v((xm1) obj4), "Prefix")) {
                break;
            }
            i5++;
        }
        xm1 xm1Var3 = (xm1) obj4;
        if (xm1Var3 != null) {
            iIntValue3 = ((Number) rs0Var.f(xm1Var3, Integer.valueOf(iL))).intValue();
            iL = uq.L(iL, xm1Var3.u0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i6);
            if (s51.n(uq.v((xm1) obj5), "Suffix")) {
                break;
            }
            i6++;
        }
        xm1 xm1Var4 = (xm1) obj5;
        if (xm1Var4 != null) {
            iIntValue4 = ((Number) rs0Var.f(xm1Var4, Integer.valueOf(iL))).intValue();
            iL = uq.L(iL, xm1Var4.u0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (i7 < size6) {
            Object obj9 = list.get(i7);
            if (s51.n(uq.v((xm1) obj9), "TextField")) {
                int iIntValue6 = ((Number) rs0Var.f(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i8);
                    if (s51.n(uq.v((xm1) obj6), "Hint")) {
                        break;
                    }
                    i8++;
                }
                Object obj10 = (xm1) obj6;
                int iIntValue7 = obj10 != null ? ((Number) rs0Var.f(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i9);
                    if (s51.n(uq.v((xm1) obj7), "Supporting")) {
                        break;
                    }
                    i9++;
                }
                Object obj11 = (xm1) obj7;
                return j12Var.f(k51Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, iIntValue6, iIntValue5, iIntValue7, obj11 != null ? ((Number) rs0Var.f(obj11, Integer.valueOf(i))).intValue() : 0, n30.b(0, 0, 0, 0, 15), fA);
            }
            i7++;
            iIntValue4 = iIntValue4;
            j12Var = this;
            iIntValue3 = iIntValue3;
        }
        throw nc2.x("Collection contains no element matching the predicate.");
    }

    public final int i(k51 k51Var, List list, int i, rs0 rs0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (s51.n(uq.v((xm1) obj7), "TextField")) {
                int iIntValue = ((Number) rs0Var.f(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (s51.n(uq.v((xm1) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                xm1 xm1Var = (xm1) obj2;
                int iIntValue2 = xm1Var != null ? ((Number) rs0Var.f(xm1Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (s51.n(uq.v((xm1) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                xm1 xm1Var2 = (xm1) obj3;
                int iIntValue3 = xm1Var2 != null ? ((Number) rs0Var.f(xm1Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (s51.n(uq.v((xm1) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                xm1 xm1Var3 = (xm1) obj4;
                int iIntValue4 = xm1Var3 != null ? ((Number) rs0Var.f(xm1Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (s51.n(uq.v((xm1) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                xm1 xm1Var4 = (xm1) obj5;
                int iIntValue5 = xm1Var4 != null ? ((Number) rs0Var.f(xm1Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (s51.n(uq.v((xm1) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                xm1 xm1Var5 = (xm1) obj6;
                int iIntValue6 = xm1Var5 != null ? ((Number) rs0Var.f(xm1Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (s51.n(uq.v((xm1) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                xm1 xm1Var6 = (xm1) obj;
                return g(k51Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, xm1Var6 != null ? ((Number) rs0Var.f(xm1Var6, Integer.valueOf(i))).intValue() : 0, n30.b(0, 0, 0, 0, 15), this.d.a());
            }
        }
        throw nc2.x("Collection contains no element matching the predicate.");
    }
}
