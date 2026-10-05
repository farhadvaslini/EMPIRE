package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends jx1 {
    public final aq1 c;
    public final s4 d;
    public final xk1 e;
    public ex1 f;
    public za2 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public xw1(aq1 aq1Var) {
        this.c = aq1Var;
        s4 s4Var = new s4();
        s4Var.b = new long[2];
        this.d = s4Var;
        this.e = new xk1(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0333  */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [aq1] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    @Override // defpackage.jx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(xk1 xk1Var, ab1 ab1Var, g51 g51Var, boolean z) {
        s4 s4Var;
        xk1 xk1Var2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        za2 za2Var;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7;
        gb2 gb2Var;
        ab1 ab1Var2 = ab1Var;
        boolean zA = super.a(xk1Var, ab1Var, g51Var, z);
        ?? J = this.c;
        if (J.s) {
            ?? qs1Var = 0;
            while (J != 0) {
                if (J instanceof jb2) {
                    this.f = vr.U((jb2) J, 16);
                } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                    aq1 aq1Var = ((ja0) J).u;
                    int i8 = 0;
                    J = J;
                    qs1Var = qs1Var;
                    while (aq1Var != null) {
                        if ((aq1Var.h & 16) != 0) {
                            i8++;
                            qs1Var = qs1Var;
                            if (i8 == 1) {
                                J = aq1Var;
                            } else {
                                if (qs1Var == 0) {
                                    qs1Var = new qs1(new aq1[16]);
                                }
                                if (J != 0) {
                                    qs1Var.b(J);
                                    J = 0;
                                }
                                qs1Var.b(aq1Var);
                            }
                        }
                        aq1Var = aq1Var.k;
                        J = J;
                        qs1Var = qs1Var;
                    }
                    if (i8 == 1) {
                    }
                }
                J = vr.j(qs1Var);
            }
            if (this.f != null) {
                int iF = xk1Var.f();
                int i9 = 0;
                while (true) {
                    s4Var = this.d;
                    xk1Var2 = this.e;
                    if (i9 >= iF) {
                        break;
                    }
                    long jC = xk1Var.c(i9);
                    gb2 gb2Var2 = (gb2) xk1Var.g(i9);
                    if (s4Var.b(jC)) {
                        long j = gb2Var2.g;
                        long j2 = gb2Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z7 = zA;
                            ArrayList arrayList = new ArrayList(gb2Var2.b().size());
                            List listB = gb2Var2.b();
                            i4 = iF;
                            int size = listB.size();
                            i5 = i9;
                            int i10 = 0;
                            while (i10 < size) {
                                List list = listB;
                                hy0 hy0Var = (hy0) listB.get(i10);
                                xk1 xk1Var3 = xk1Var2;
                                long j3 = jC;
                                long j4 = hy0Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    gb2Var = gb2Var2;
                                    long j5 = hy0Var.a;
                                    i6 = size;
                                    ex1 ex1Var = this.f;
                                    ex1Var.getClass();
                                    i7 = i10;
                                    arrayList.add(new hy0(j5, ex1Var.l0(ab1Var2, j4, true), hy0Var.c, hy0Var.d, hy0Var.e));
                                } else {
                                    i6 = size;
                                    i7 = i10;
                                    gb2Var = gb2Var2;
                                }
                                i10 = i7 + 1;
                                size = i6;
                                listB = list;
                                xk1Var2 = xk1Var3;
                                jC = j3;
                                gb2Var2 = gb2Var;
                            }
                            xk1 xk1Var4 = xk1Var2;
                            long j6 = jC;
                            ex1 ex1Var2 = this.f;
                            ex1Var2.getClass();
                            long jL0 = ex1Var2.l0(ab1Var2, j, true);
                            ex1 ex1Var3 = this.f;
                            ex1Var3.getClass();
                            gb2 gb2Var3 = new gb2(gb2Var2.a, gb2Var2.b, ex1Var3.l0(ab1Var2, j2, true), gb2Var2.d, gb2Var2.e, gb2Var2.f, jL0, gb2Var2.h, gb2Var2.i, arrayList, gb2Var2.j, gb2Var2.k, gb2Var2.l, gb2Var2.n);
                            gb2 gb2Var4 = gb2Var2.q;
                            if (gb2Var4 == null) {
                                gb2Var4 = gb2Var2;
                            }
                            gb2Var3.q = gb2Var4;
                            gb2 gb2Var5 = gb2Var2.q;
                            if (gb2Var5 != null) {
                                gb2Var2 = gb2Var5;
                            }
                            gb2Var3.q = gb2Var2;
                            xk1Var4.d(j6, gb2Var3);
                        } else {
                            z7 = zA;
                            i4 = iF;
                            i5 = i9;
                        }
                    } else {
                        z7 = zA;
                        i4 = iF;
                        i5 = i9;
                    }
                    i9 = i5 + 1;
                    ab1Var2 = ab1Var;
                    iF = i4;
                    zA = z7;
                }
                boolean z8 = zA;
                if (xk1Var2.f() == 0) {
                    s4Var.a = 0;
                    this.a.g();
                    return true;
                }
                int i11 = s4Var.a;
                while (true) {
                    i11--;
                    byte b = -1;
                    if (-1 >= i11) {
                        break;
                    }
                    long j7 = ((long[]) s4Var.b)[i11];
                    if (xk1Var.f) {
                        int i12 = xk1Var.i;
                        long[] jArr = xk1Var.g;
                        Object[] objArr = xk1Var.h;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < i12) {
                            Object obj2 = objArr[i13];
                            byte b2 = b;
                            if (obj2 != r51.D1) {
                                if (i13 != i14) {
                                    jArr[i14] = jArr[i13];
                                    objArr[i14] = obj2;
                                    objArr[i13] = null;
                                }
                                i14++;
                            }
                            i13++;
                            b = b2;
                        }
                        xk1Var.f = false;
                        xk1Var.i = i14;
                    }
                    if (w7.E(xk1Var.g, xk1Var.i, j7) < 0 && i11 < (i3 = s4Var.a)) {
                        int i15 = i3 - 1;
                        int i16 = i11;
                        while (i16 < i15) {
                            long[] jArr2 = (long[]) s4Var.b;
                            int i17 = i16 + 1;
                            jArr2[i16] = jArr2[i17];
                            i16 = i17;
                        }
                        s4Var.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(xk1Var2.f());
                int iF2 = xk1Var2.f();
                for (int i18 = 0; i18 < iF2; i18++) {
                    arrayList2.add(xk1Var2.g(i18));
                }
                za2 za2Var2 = new za2(arrayList2, g51Var);
                int size2 = arrayList2.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i19);
                    if (g51Var.a(((gb2) obj).a)) {
                        break;
                    }
                    i19++;
                }
                gb2 gb2Var6 = (gb2) obj;
                if (gb2Var6 != null) {
                    boolean z9 = gb2Var6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z9 || gb2Var6.h)) {
                            ex1 ex1Var4 = this.f;
                            ex1Var4.getClass();
                            long j8 = ex1Var4.h;
                            long j9 = gb2Var6.c;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            z3 = true;
                            this.i = !((fIntBitsToFloat < 0.0f) | (fIntBitsToFloat > ((float) ((int) (j8 >> 32)))) | (fIntBitsToFloat2 < 0.0f) | (fIntBitsToFloat2 > ((float) ((int) (j8 & 4294967295L)))));
                        }
                        z5 = this.i;
                        z6 = this.h;
                        if (z5 == z6 && ((i2 = za2Var2.f) == 3 || i2 == 4 || i2 == 5)) {
                            za2Var2.f = z5 ? 4 : 5;
                        } else {
                            i = za2Var2.f;
                            if (i != 4 && z6 && !this.j) {
                                za2Var2.f = 3;
                            } else if (i == 5 && z5 && z9) {
                                za2Var2.f = 3;
                            }
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    z3 = true;
                    z5 = this.i;
                    z6 = this.h;
                    if (z5 == z6) {
                        i = za2Var2.f;
                        if (i != 4) {
                            if (i == 5) {
                                za2Var2.f = 3;
                            }
                        }
                    }
                } else {
                    z2 = false;
                    z3 = true;
                }
                if (z8 || za2Var2.f != 3 || (za2Var = this.g) == null) {
                    z4 = z3;
                    break;
                }
                ?? r1 = za2Var.a;
                int size3 = r1.size();
                ?? r4 = za2Var2.a;
                if (size3 == r4.size()) {
                    int size4 = r4.size();
                    for (?? r5 = z2; r5 < size4; r5++) {
                        if (!gy1.b(((gb2) r1.get(r5)).c, ((gb2) r4.get(r5)).c)) {
                            z4 = z3;
                            break;
                        }
                    }
                    z4 = z2;
                }
                this.g = za2Var2;
                return z4;
            }
        }
        return true;
    }

    @Override // defpackage.jx1
    public final void b(g51 g51Var) {
        super.b(g51Var);
        za2 za2Var = this.g;
        if (za2Var == null) {
            return;
        }
        this.h = this.i;
        List list = za2Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            gb2 gb2Var = (gb2) list.get(i);
            boolean z = gb2Var.d;
            long j = gb2Var.a;
            boolean zA = g51Var.a(j);
            boolean z2 = this.i;
            if ((!z && !zA) || (!z && !z2)) {
                this.d.f(j);
            }
        }
        this.i = false;
        this.j = za2Var.f == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [aq1] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        qs1 qs1Var = this.a;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((xw1) objArr[i2]).c();
        }
        ?? J = this.c;
        ?? qs1Var2 = 0;
        while (J != 0) {
            if (J instanceof jb2) {
                ((jb2) J).L0();
            } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                aq1 aq1Var = ((ja0) J).u;
                int i3 = 0;
                qs1Var2 = qs1Var2;
                J = J;
                while (aq1Var != null) {
                    if ((aq1Var.h & 16) != 0) {
                        i3++;
                        qs1Var2 = qs1Var2;
                        if (i3 == 1) {
                            J = aq1Var;
                        } else {
                            if (qs1Var2 == 0) {
                                qs1Var2 = new qs1(new aq1[16]);
                            }
                            if (J != 0) {
                                qs1Var2.b(J);
                                J = 0;
                            }
                            qs1Var2.b(aq1Var);
                        }
                    }
                    aq1Var = aq1Var.k;
                    qs1Var2 = qs1Var2;
                    J = J;
                }
                if (i3 == 1) {
                }
            }
            J = vr.j(qs1Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [aq1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [qs1] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(g51 g51Var) {
        tb1 tb1Var;
        xk1 xk1Var = this.e;
        boolean z = false;
        z = false;
        z = false;
        if (xk1Var.f() != 0) {
            aq1 aq1Var = this.c;
            if (aq1Var.s) {
                ex1 ex1Var = aq1Var.m;
                if ((ex1Var == null || (tb1Var = ex1Var.z) == null) ? false : tb1Var.I()) {
                    za2 za2Var = this.g;
                    za2Var.getClass();
                    ex1 ex1Var2 = this.f;
                    ex1Var2.getClass();
                    long j = ex1Var2.h;
                    ?? J = aq1Var;
                    ?? qs1Var = 0;
                    while (J != 0) {
                        if (J instanceof jb2) {
                            ((jb2) J).i0(za2Var, ab2.h, j);
                        } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                            aq1 aq1Var2 = ((ja0) J).u;
                            int i = 0;
                            J = J;
                            qs1Var = qs1Var;
                            while (aq1Var2 != null) {
                                if ((aq1Var2.h & 16) != 0) {
                                    i++;
                                    qs1Var = qs1Var;
                                    if (i == 1) {
                                        J = aq1Var2;
                                    } else {
                                        if (qs1Var == 0) {
                                            qs1Var = new qs1(new aq1[16]);
                                        }
                                        if (J != 0) {
                                            qs1Var.b(J);
                                            J = 0;
                                        }
                                        qs1Var.b(aq1Var2);
                                    }
                                }
                                aq1Var2 = aq1Var2.k;
                                J = J;
                                qs1Var = qs1Var;
                            }
                            if (i == 1) {
                            }
                        }
                        J = vr.j(qs1Var);
                    }
                    if (aq1Var.s) {
                        qs1 qs1Var2 = this.a;
                        Object[] objArr = qs1Var2.f;
                        int i2 = qs1Var2.h;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((xw1) objArr[i3]).d(g51Var);
                        }
                    }
                    z = true;
                }
            }
        }
        b(g51Var);
        xk1Var.a();
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [aq1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [qs1] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [qs1] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v10, types: [aq1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [qs1] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(g51 g51Var, boolean z) {
        tb1 tb1Var;
        if (this.e.f() == 0) {
            return false;
        }
        ?? J = this.c;
        if (J.s) {
            ex1 ex1Var = J.m;
            if ((ex1Var == null || (tb1Var = ex1Var.z) == null) ? false : tb1Var.I()) {
                za2 za2Var = this.g;
                za2Var.getClass();
                ex1 ex1Var2 = this.f;
                ex1Var2.getClass();
                long j = ex1Var2.h;
                ?? J2 = J;
                ?? qs1Var = 0;
                while (J2 != 0) {
                    if (J2 instanceof jb2) {
                        ((jb2) J2).i0(za2Var, ab2.f, j);
                    } else if ((J2.h & 16) != 0 && (J2 instanceof ja0)) {
                        aq1 aq1Var = ((ja0) J2).u;
                        int i = 0;
                        J2 = J2;
                        qs1Var = qs1Var;
                        while (aq1Var != null) {
                            if ((aq1Var.h & 16) != 0) {
                                i++;
                                qs1Var = qs1Var;
                                if (i == 1) {
                                    J2 = aq1Var;
                                } else {
                                    if (qs1Var == 0) {
                                        qs1Var = new qs1(new aq1[16]);
                                    }
                                    if (J2 != 0) {
                                        qs1Var.b(J2);
                                        J2 = 0;
                                    }
                                    qs1Var.b(aq1Var);
                                }
                            }
                            aq1Var = aq1Var.k;
                            J2 = J2;
                            qs1Var = qs1Var;
                        }
                        if (i == 1) {
                        }
                    }
                    J2 = vr.j(qs1Var);
                }
                if (J.s) {
                    qs1 qs1Var2 = this.a;
                    Object[] objArr = qs1Var2.f;
                    int i2 = qs1Var2.h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        xw1 xw1Var = (xw1) objArr[i3];
                        this.f.getClass();
                        xw1Var.e(g51Var, z);
                    }
                }
                if (J.s) {
                    ?? qs1Var3 = 0;
                    while (J != 0) {
                        if (J instanceof jb2) {
                            ((jb2) J).i0(za2Var, ab2.g, j);
                        } else if ((J.h & 16) != 0 && (J instanceof ja0)) {
                            aq1 aq1Var2 = ((ja0) J).u;
                            int i4 = 0;
                            J = J;
                            qs1Var3 = qs1Var3;
                            while (aq1Var2 != null) {
                                if ((aq1Var2.h & 16) != 0) {
                                    i4++;
                                    qs1Var3 = qs1Var3;
                                    if (i4 == 1) {
                                        J = aq1Var2;
                                    } else {
                                        if (qs1Var3 == 0) {
                                            qs1Var3 = new qs1(new aq1[16]);
                                        }
                                        if (J != 0) {
                                            qs1Var3.b(J);
                                            J = 0;
                                        }
                                        qs1Var3.b(aq1Var2);
                                    }
                                }
                                aq1Var2 = aq1Var2.k;
                                J = J;
                                qs1Var3 = qs1Var3;
                            }
                            if (i4 == 1) {
                            }
                        }
                        J = vr.j(qs1Var3);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, as1 as1Var) {
        s4 s4Var = this.d;
        if (s4Var.b(j) && as1Var.h(this) < 0) {
            s4Var.f(j);
            this.e.e(j);
        }
        qs1 qs1Var = this.a;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((xw1) objArr[i2]).f(j, as1Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
