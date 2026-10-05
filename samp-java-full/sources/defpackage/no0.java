package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class no0 implements zq1, ap2 {
    public final ij a;
    public final kj b;
    public final float c;
    public final g60 d;
    public final float e;
    public final int f;
    public final lo0 g;

    public no0(ij ijVar, kj kjVar, float f, g60 g60Var, float f2, int i, lo0 lo0Var) {
        this.a = ijVar;
        this.b = kjVar;
        this.c = f;
        this.d = g60Var;
        this.e = f2;
        this.f = i;
        this.g = lo0Var;
    }

    public static int k(List list, int i, int i2, int i3, int i4, lo0 lo0Var) {
        boolean z;
        long jA = d41.a(0, 0);
        if (!list.isEmpty()) {
            int i5 = Integer.MAX_VALUE;
            io0 io0Var = new io0(i4, lo0Var, n30.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            xm1 xm1Var = (xm1) qx.s0(0, list);
            int iX0 = xm1Var != null ? xm1Var.x0(i) : 0;
            int iM0 = xm1Var != null ? xm1Var.m0(iX0) : 0;
            int i6 = 0;
            if (io0Var.b(list.size() > 1, 0, d41.a(i, Integer.MAX_VALUE), xm1Var == null ? null : new d41(d41.a(iM0, iX0)), 0, 0, 0, false, false).b) {
                lo0Var.getClass();
                jA = jA;
            } else {
                int size = list.size();
                int i7 = i;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    int i13 = i7 - iM0;
                    int i14 = i10 + 1;
                    int iMax = Math.max(i9, iX0);
                    xm1 xm1Var2 = (xm1) qx.s0(i14, list);
                    iX0 = xm1Var2 != null ? xm1Var2.x0(i) : 0;
                    int iM02 = xm1Var2 != null ? xm1Var2.m0(iX0) + i2 : 0;
                    if (i10 + 2 < list.size()) {
                        i10 = i14;
                        z = true;
                    } else {
                        i10 = i14;
                        z = false;
                    }
                    int i15 = i10 - i12;
                    int i16 = i8;
                    int i17 = iM02;
                    ho0 ho0VarB = io0Var.b(z, i15, d41.a(i13, i5), xm1Var2 == null ? null : new d41(d41.a(iM02, iX0)), i16, i6, iMax, false, false);
                    if (ho0VarB.a) {
                        int i18 = iMax + i3 + i6;
                        io0Var.a(ho0VarB, xm1Var2 != null, i16, i18, i13, i15);
                        int i19 = i17 - i2;
                        i8 = i16 + 1;
                        if (ho0VarB.b) {
                            i11 = i10;
                            i6 = i18;
                            break;
                        }
                        i7 = i;
                        i12 = i10;
                        iM0 = i19;
                        i6 = i18;
                        i9 = 0;
                    } else {
                        iM0 = i17;
                        i7 = i13;
                        i8 = i16;
                        i9 = iMax;
                    }
                    i11 = i10;
                    i5 = Integer.MAX_VALUE;
                }
                jA = d41.a(i6 - i3, i11);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.zq1
    public final int a(k51 k51Var, List list, int i) {
        List list2 = (List) qx.s0(1, list);
        xm1 xm1Var = list2 != null ? (xm1) qx.r0(list2) : null;
        List list3 = (List) qx.s0(2, list);
        this.g.a(xm1Var, list3 != null ? (xm1) qx.r0(list3) : null, n30.b(0, i, 0, 0, 13));
        List list4 = (List) qx.r0(list);
        if (list4 == null) {
            list4 = ni0.f;
        }
        return k(list4, i, k51Var.p0(this.c), k51Var.p0(this.e), this.f, this.g);
    }

    @Override // defpackage.zq1
    public final int b(k51 k51Var, List list, int i) {
        List list2 = (List) qx.s0(1, list);
        xm1 xm1Var = list2 != null ? (xm1) qx.r0(list2) : null;
        List list3 = (List) qx.s0(2, list);
        this.g.a(xm1Var, list3 != null ? (xm1) qx.r0(list3) : null, n30.b(0, 0, 0, i, 7));
        List list4 = (List) qx.r0(list);
        if (list4 == null) {
            list4 = ni0.f;
        }
        int iP0 = k51Var.p0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iU0 = ((xm1) list4.get(i2)).u0(i) + iP0;
            int i5 = i2 + 1;
            if (i5 - i3 == this.f || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iU0) - iP0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iU0;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v7, types: [i62[]] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [i62[]] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.zq1
    public final dn1 c(en1 en1Var, List list, long j) {
        xm1 xm1Var;
        Iterator it;
        qs1 qs1Var;
        i62 i62Var;
        d41 d41Var;
        ho0 ho0Var;
        int i;
        int i2;
        char c;
        ?? r8;
        xm1 xm1Var2;
        xm1 xm1Var3;
        xm1 xm1Var4;
        d41 d41Var2;
        i62 i62Var2;
        int i3;
        d41 d41Var3;
        d41 d41Var4;
        ho0 ho0Var2;
        Integer numValueOf;
        long jA;
        long jA2;
        i62 i62VarT;
        int i4 = this.f;
        oi0 oi0Var = oi0.f;
        if (i4 != 0 && !((ArrayList) list).isEmpty()) {
            int iH = m30.h(j);
            lo0 lo0Var = this.g;
            if (iH != 0) {
                List list2 = (List) qx.q0(list);
                if (list2.isEmpty()) {
                    return en1Var.I0(0, 0, oi0Var, new u0(19));
                }
                List list3 = (List) qx.s0(1, list);
                xm1 xm1Var5 = list3 != null ? (xm1) qx.r0(list3) : null;
                List list4 = (List) qx.s0(2, list);
                xm1 xm1Var6 = list4 != null ? (xm1) qx.r0(list4) : null;
                list2.size();
                lo0Var.getClass();
                ic1 ic1Var = ic1.f;
                long jS = ur.S(ur.v(10, ur.u(j, ic1Var)));
                if (xm1Var5 != null) {
                    if (b32.s(b32.p(xm1Var5)) == 0.0f) {
                        b32.p(xm1Var5);
                        i62 i62VarT2 = xm1Var5.t(jS);
                        i62VarT2.G0();
                        i62VarT2.F0();
                        i62VarT2.G0();
                        i62VarT2.F0();
                    } else {
                        xm1Var5.x0(xm1Var5.m0(Integer.MAX_VALUE));
                    }
                }
                if (xm1Var6 != null) {
                    if (b32.s(b32.p(xm1Var6)) == 0.0f) {
                        b32.p(xm1Var6);
                        i62 i62VarT3 = xm1Var6.t(jS);
                        i62VarT3.G0();
                        i62VarT3.F0();
                        i62VarT3.G0();
                        i62VarT3.F0();
                    } else {
                        xm1Var6.x0(xm1Var6.m0(Integer.MAX_VALUE));
                    }
                }
                Iterator it2 = list2.iterator();
                long jU = ur.u(j, ic1Var);
                qs1 qs1Var2 = new qs1(new dn1[16]);
                int i5 = m30.i(jU);
                int iK = m30.k(jU);
                int iH2 = m30.h(jU);
                or1 or1Var = h41.a;
                or1 or1Var2 = new or1();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(en1Var.T(this.c));
                int iCeil2 = (int) Math.ceil(en1Var.T(this.e));
                long jA3 = n30.a(0, i5, 0, iH2);
                long jS2 = ur.S(ur.v(14, jA3));
                if (it2.hasNext()) {
                    try {
                        xm1Var = (xm1) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        xm1Var = null;
                    }
                } else {
                    xm1Var = null;
                }
                if (xm1Var != null) {
                    if (b32.s(b32.p(xm1Var)) == 0.0f) {
                        b32.p(xm1Var);
                        i62VarT = xm1Var.t(jS2);
                        it = it2;
                        jA2 = d41.a(i62VarT.G0(), i62VarT.F0());
                    } else {
                        it = it2;
                        int iM0 = xm1Var.m0(Integer.MAX_VALUE);
                        xm1 xm1Var7 = xm1Var;
                        jA2 = d41.a(iM0, xm1Var7.x0(iM0));
                        xm1Var = xm1Var7;
                        i62VarT = null;
                    }
                    qs1Var = qs1Var2;
                    d41Var = new d41(jA2);
                    i62Var = i62VarT;
                } else {
                    it = it2;
                    qs1Var = qs1Var2;
                    i62Var = null;
                    d41Var = null;
                }
                i62 i62Var3 = i62Var;
                Integer numValueOf2 = d41Var != null ? Integer.valueOf((int) (d41Var.a >> 32)) : null;
                Integer numValueOf3 = d41Var != null ? Integer.valueOf((int) (d41Var.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                xm1 xm1Var8 = xm1Var;
                pr1 pr1Var = new pr1();
                int i6 = this.f;
                lo0 lo0Var2 = this.g;
                io0 io0Var = new io0(i6, lo0Var2, jU, iCeil, iCeil2);
                d41 d41Var5 = d41Var;
                ho0 ho0VarB = io0Var.b(it.hasNext(), 0, d41.a(i5, iH2), d41Var5, 0, 0, 0, false, false);
                if (ho0VarB.b) {
                    ho0Var = ho0VarB;
                    io0Var.a(ho0Var, d41Var5 != null, -1, 0, i5, 0);
                } else {
                    ho0Var = ho0VarB;
                }
                int[] iArrCopyOf = iArr2;
                int i7 = i5;
                i62 i62Var4 = i62Var3;
                Integer num = numValueOf2;
                xm1 xm1Var9 = xm1Var8;
                int[] iArrCopyOf2 = iArr;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = iK;
                int i14 = iH2;
                pr1 pr1Var2 = pr1Var;
                ho0 ho0Var3 = ho0Var;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (!ho0Var3.b && xm1Var9 != null) {
                    num.getClass();
                    int iIntValue = num.intValue();
                    numValueOf3.getClass();
                    int iIntValue2 = numValueOf3.intValue();
                    int i18 = i16;
                    int i19 = i17 + iIntValue;
                    int iMax = Math.max(i15, iIntValue2);
                    int i20 = i7 - iIntValue;
                    int i21 = i8 + 1;
                    lo0Var2.getClass();
                    arrayList.add(xm1Var9);
                    or1Var2.i(i8, i62Var4);
                    xm1Var9.E();
                    int i22 = i21 - i10;
                    if (it.hasNext()) {
                        try {
                            xm1Var2 = (xm1) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            xm1Var2 = null;
                        }
                        xm1Var3 = xm1Var2;
                    } else {
                        xm1Var3 = null;
                    }
                    if (xm1Var3 != null) {
                        if (b32.s(b32.p(xm1Var3)) == 0.0f) {
                            b32.p(xm1Var3);
                            i62 i62VarT4 = xm1Var3.t(jS2);
                            jA = d41.a(i62VarT4.G0(), i62VarT4.F0());
                            i62Var2 = i62VarT4;
                            i8 = i21;
                            xm1Var4 = xm1Var3;
                        } else {
                            int iM02 = xm1Var3.m0(Integer.MAX_VALUE);
                            jA = d41.a(iM02, xm1Var3.x0(iM02));
                            i62Var2 = null;
                            xm1Var4 = xm1Var3;
                            i8 = i21;
                        }
                        d41Var2 = new d41(jA);
                    } else {
                        xm1Var4 = xm1Var3;
                        i8 = i21;
                        d41Var2 = null;
                        i62Var2 = null;
                    }
                    Integer numValueOf4 = d41Var2 != null ? Integer.valueOf(((int) (d41Var2.a >> 32)) + iCeil) : null;
                    Integer numValueOf5 = d41Var2 != null ? Integer.valueOf((int) (d41Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i23 = i11;
                    long jA4 = d41.a(i20, i14);
                    if (d41Var2 == null) {
                        i3 = i20;
                        d41Var3 = d41Var2;
                        d41Var4 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue3 = numValueOf4.intValue();
                        numValueOf5.getClass();
                        i3 = i20;
                        d41Var3 = d41Var2;
                        d41Var4 = new d41(d41.a(iIntValue3, numValueOf5.intValue()));
                    }
                    ho0 ho0VarB2 = io0Var.b(zHasNext, i22, jA4, d41Var4, i23, i12, iMax, false, false);
                    if (ho0VarB2.a) {
                        int iMin = Math.min(Math.max(i13, i19), i5);
                        int i24 = i12 + iMax;
                        ho0Var2 = ho0VarB2;
                        io0Var.a(ho0Var2, d41Var3 != null, i23, i24, i3, i22);
                        int i25 = i18 + 1;
                        if (iArrCopyOf.length < i25) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i25, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i18] = iMax;
                        i16 = i18 + 1;
                        i14 = (iH2 - i24) - iCeil2;
                        int i26 = i9 + 1;
                        if (iArrCopyOf2.length < i26) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i26, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i9] = i8;
                        i9++;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - iCeil) : null;
                        i11 = i23 + 1;
                        i12 = i24 + iCeil2;
                        i13 = iMin;
                        i3 = i5;
                        i10 = i8;
                        i15 = 0;
                        i17 = 0;
                    } else {
                        ho0Var2 = ho0VarB2;
                        numValueOf = numValueOf4;
                        i11 = i23;
                        i15 = iMax;
                        i17 = i19;
                        i16 = i18;
                    }
                    numValueOf3 = numValueOf5;
                    xm1Var9 = xm1Var4;
                    i62Var4 = i62Var2;
                    i7 = i3;
                    num = numValueOf;
                    ho0Var3 = ho0Var2;
                }
                int i27 = i16;
                int size = arrayList.size();
                ?? r2 = new i62[size];
                for (int i28 = 0; i28 < size; i28++) {
                    r2[i28] = or1Var2.b(i28);
                }
                int[] iArr3 = new int[i9];
                int[] iArr4 = new int[i9];
                int iMax2 = i13;
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                ?? r22 = r2;
                while (i29 < i9) {
                    int i32 = iArrCopyOf2[i29];
                    if (i29 < 0 || i29 >= (i2 = i27)) {
                        c.i("Index must be between 0 and size");
                        return null;
                    }
                    int iH3 = iArrCopyOf[i29];
                    pr1 pr1Var3 = pr1Var2;
                    if (pr1Var3.c(i29)) {
                        r8 = r22;
                        c = 65535;
                    } else {
                        if (m30.h(jA3) == Integer.MAX_VALUE) {
                            iH3 = Integer.MAX_VALUE;
                            c = 65535;
                        } else {
                            iH3 = m30.h(jA3) - i31;
                            c = 65535;
                        }
                        r8 = r22;
                    }
                    int[] iArr5 = iArrCopyOf2;
                    pr1Var2 = pr1Var3;
                    int i33 = i9;
                    int i34 = i29;
                    dn1 dn1VarU = d32.u(this, iMax2, m30.j(jA3), m30.i(jA3), iH3, iCeil, en1Var, arrayList, r8, i30, i32, iArr3, i34);
                    int iG = dn1VarU.g();
                    int iD = dn1VarU.d();
                    iArr4[i34] = iD;
                    iMax2 = Math.max(iMax2, iG);
                    qs1Var.b(dn1VarU);
                    int i35 = i34 + 1;
                    i30 = i32;
                    i27 = i2;
                    i9 = i33;
                    iArrCopyOf = iArrCopyOf;
                    iArrCopyOf2 = iArr5;
                    i31 += iD;
                    i29 = i35;
                    r22 = r8;
                }
                int i36 = i31;
                qs1 qs1Var3 = qs1Var;
                if (qs1Var3.h == 0) {
                    iMax2 = 0;
                    i = 0;
                } else {
                    i = i36;
                }
                kj kjVar = this.b;
                int iP0 = ((qs1Var3.h - 1) * en1Var.p0(kjVar.a())) + i;
                int iJ = m30.j(jU);
                int iH4 = m30.h(jU);
                if (iP0 < iJ) {
                    iP0 = iJ;
                }
                if (iP0 <= iH4) {
                    iH4 = iP0;
                }
                kjVar.g(en1Var, iH4, iArr4, iArr3);
                int iK2 = m30.k(jU);
                int i37 = m30.i(jU);
                if (iMax2 < iK2) {
                    iMax2 = iK2;
                }
                if (iMax2 <= i37) {
                    i37 = iMax2;
                }
                return en1Var.I0(i37, iH4, oi0Var, new s(24, qs1Var3));
            }
            lo0Var.getClass();
        }
        return en1Var.I0(0, 0, oi0Var, new u0(19));
    }

    @Override // defpackage.zq1
    public final int d(k51 k51Var, List list, int i) {
        List list2 = (List) qx.s0(1, list);
        xm1 xm1Var = list2 != null ? (xm1) qx.r0(list2) : null;
        List list3 = (List) qx.s0(2, list);
        this.g.a(xm1Var, list3 != null ? (xm1) qx.r0(list3) : null, n30.b(0, i, 0, 0, 13));
        List list4 = (List) qx.r0(list);
        if (list4 == null) {
            list4 = ni0.f;
        }
        return k(list4, i, k51Var.p0(this.c), k51Var.p0(this.e), this.f, this.g);
    }

    @Override // defpackage.zq1
    public final int e(k51 k51Var, List list, int i) {
        int[] iArr;
        int i2;
        List list2;
        long jA;
        int i3;
        int i4;
        int i5;
        d41 d41Var;
        no0 no0Var = this;
        List list3 = (List) qx.s0(1, list);
        xm1 xm1Var = list3 != null ? (xm1) qx.r0(list3) : null;
        List list4 = (List) qx.s0(2, list);
        no0Var.g.a(xm1Var, list4 != null ? (xm1) qx.r0(list4) : null, n30.b(0, 0, 0, i, 7));
        List list5 = (List) qx.r0(list);
        if (list5 == null) {
            list5 = ni0.f;
        }
        int iP0 = k51Var.p0(no0Var.c);
        int iP02 = k51Var.p0(no0Var.e);
        long jA2 = d41.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr2 = new int[size];
        int size2 = list5.size();
        int[] iArr3 = new int[size2];
        int size3 = list5.size();
        for (int i6 = 0; i6 < size3; i6++) {
            xm1 xm1Var2 = (xm1) list5.get(i6);
            int iM0 = xm1Var2.m0(i);
            iArr2[i6] = iM0;
            iArr3[i6] = xm1Var2.x0(iM0);
        }
        int size4 = list5.size();
        lo0 lo0Var = no0Var.g;
        if (Integer.MAX_VALUE < size4) {
            lo0Var.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            lo0Var.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += iArr2[i8];
        }
        int size5 = ((list5.size() - 1) * iP0) + i7;
        if (size2 == 0) {
            c.n();
            return 0;
        }
        int i9 = iArr3[0];
        int i10 = size2 - 1;
        int i11 = 0;
        if (1 <= i10) {
            int i12 = i9;
            int i13 = 1;
            while (true) {
                int i14 = iArr3[i13];
                if (i12 < i14) {
                    i12 = i14;
                }
                if (i13 == i10) {
                    break;
                }
                i13++;
            }
            i9 = i12;
        }
        if (size == 0) {
            c.n();
            return 0;
        }
        int i15 = iArr2[0];
        int i16 = size - 1;
        if (1 <= i16) {
            int i17 = 1;
            while (true) {
                int i18 = iArr2[i17];
                if (i15 < i18) {
                    i15 = i18;
                }
                if (i17 == i16) {
                    break;
                }
                i17++;
            }
        }
        int i19 = size5;
        int i20 = i9;
        while (i15 <= i19 && i20 != i) {
            int i21 = (i15 + i19) / 2;
            if (list5.isEmpty()) {
                i2 = i19;
                list2 = list5;
                jA = jA2;
                iArr = iArr3;
            } else {
                int i22 = i11;
                iArr = iArr3;
                io0 io0Var = new io0(no0Var.f, lo0Var, n30.a(i22, i21, i22, Integer.MAX_VALUE), iP0, iP02);
                xm1 xm1Var3 = (xm1) qx.s0(i22, list5);
                int i23 = xm1Var3 != null ? iArr[i22] : i22;
                int i24 = xm1Var3 != null ? iArr2[i22] : 0;
                i2 = i19;
                int i25 = 0;
                int i26 = 0;
                int iMax = 0;
                if (io0Var.b(list5.size() > 1, 0, d41.a(i21, Integer.MAX_VALUE), xm1Var3 == null ? null : new d41(d41.a(i24, i23)), 0, 0, 0, false, false).b) {
                    lo0Var.getClass();
                    list2 = list5;
                    jA = jA2;
                } else {
                    int size6 = list5.size();
                    int i27 = i21;
                    int i28 = i24;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = i23;
                    int i32 = 0;
                    while (true) {
                        int i33 = iMax;
                        if (i30 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i34 = i27 - i28;
                        int i35 = size6;
                        int i36 = i30 + 1;
                        iMax = Math.max(i33, i31);
                        xm1 xm1Var4 = (xm1) qx.s0(i36, list5);
                        int i37 = xm1Var4 != null ? iArr[i36] : 0;
                        if (xm1Var4 != null) {
                            i3 = i36;
                            i4 = iArr2[i36] + iP0;
                        } else {
                            i3 = i36;
                            i4 = 0;
                        }
                        int i38 = i29;
                        boolean z = i30 + 2 < list5.size();
                        int i39 = i3 - i38;
                        long jA3 = d41.a(i34, Integer.MAX_VALUE);
                        if (xm1Var4 == null) {
                            i5 = i4;
                            list2 = list5;
                            d41Var = null;
                        } else {
                            list2 = list5;
                            i5 = i4;
                            d41Var = new d41(d41.a(i4, i37));
                        }
                        ho0 ho0VarB = io0Var.b(z, i39, jA3, d41Var, i25, i26, iMax, false, false);
                        if (ho0VarB.a) {
                            int i40 = iMax + iP02 + i26;
                            int i41 = i25;
                            io0Var.a(ho0VarB, xm1Var4 != null, i41, i40, i34, i39);
                            int i42 = i5 - iP0;
                            i25 = i41 + 1;
                            if (ho0VarB.b) {
                                i26 = i40;
                                i32 = i3;
                                break;
                            }
                            i5 = i42;
                            i27 = i21;
                            i26 = i40;
                            i29 = i3;
                            iMax = 0;
                        } else {
                            i27 = i34;
                            i29 = i38;
                        }
                        list5 = list2;
                        i31 = i37;
                        size6 = i35;
                        i30 = i3;
                        i32 = i30;
                        i28 = i5;
                    }
                    jA = d41.a(i26 - iP02, i32);
                }
            }
            int i43 = (int) (jA >> 32);
            int i44 = (int) (jA & 4294967295L);
            if (i43 > i || i44 < iMin) {
                i15 = i21 + 1;
                if (i15 > i2) {
                    return i15;
                }
                no0Var = this;
                i19 = i2;
            } else {
                if (i43 >= i) {
                    return i21;
                }
                i19 = i21 - 1;
                no0Var = this;
            }
            size5 = i21;
            iArr3 = iArr;
            i11 = 0;
            i20 = i43;
            list5 = list2;
        }
        return size5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no0)) {
            return false;
        }
        no0 no0Var = (no0) obj;
        return this.a.equals(no0Var.a) && this.b.equals(no0Var.b) && jd0.b(this.c, no0Var.c) && this.d.equals(no0Var.d) && jd0.b(this.e, no0Var.e) && this.f == no0Var.f && s51.n(this.g, no0Var.g);
    }

    @Override // defpackage.ap2
    public final void f(int i, int[] iArr, int[] iArr2, en1 en1Var) {
        this.a.f(en1Var, i, iArr, en1Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.ap2
    public final long g(int i, int i2, int i3, boolean z) {
        dp2 dp2Var = cp2.a;
        return !z ? n30.a(i, i2, 0, i3) : lq.y(i, i2, 0, i3);
    }

    @Override // defpackage.ap2
    public final int h(i62 i62Var) {
        return i62Var.F0();
    }

    public final int hashCode() {
        return this.g.hashCode() + nc2.b(Integer.MAX_VALUE, nc2.b(this.f, nc2.a((this.d.hashCode() + nc2.a((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, this.c, 31)) * 31, this.e, 31), 31), 31);
    }

    @Override // defpackage.ap2
    public final int i(i62 i62Var) {
        return i62Var.G0();
    }

    @Override // defpackage.ap2
    public final dn1 j(final i62[] i62VarArr, en1 en1Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final bb1 bb1Var = bb1.f;
        return en1Var.I0(i, i2, oi0.f, new ns0() { // from class: mo0
            @Override // defpackage.ns0
            public final Object h(Object obj) {
                vr vrVar;
                h62 h62Var = (h62) obj;
                int[] iArr3 = iArr2;
                int i6 = iArr3 != null ? iArr3[i3] : 0;
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    i62 i62Var = i62VarArr[i8];
                    i62Var.getClass();
                    Object objE = i62Var.E();
                    bp2 bp2Var = objE instanceof bp2 ? (bp2) objE : null;
                    if (bp2Var == null || (vrVar = bp2Var.c) == null) {
                        vrVar = this.d;
                    }
                    h62Var.C(i62Var, iArr[i8 - i7], vrVar.l(i2, i62Var.F0(), bb1Var) + i6, 0.0f);
                }
                return dm3.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + jd0.c(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + jd0.c(this.e) + ", maxItemsInMainAxis=" + this.f + ", maxLines=2147483647, overflow=" + this.g + ")";
    }
}
