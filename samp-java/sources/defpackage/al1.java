package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class al1 extends i62 implements nq1, r12, en1 {
    public static final fi1 x = new fi1(3);
    public static final fi1 y = new fi1(4);
    public zk1 k;
    public ns0 l;
    public rs0 m;
    public ns0 n;
    public k62 o;
    public is1 p;
    public boolean q;
    public is1 r;
    public boolean s;
    public boolean t;
    public final bl1 u = new bl1(0, this);
    public yf v;
    public is1 w;

    public static void h1(ex1 ex1Var) {
        ub1 ub1Var;
        ex1 ex1Var2 = ex1Var.C;
        tb1 tb1Var = ex1Var.z;
        if (!s51.n(ex1Var2 != null ? ex1Var2.z : null, tb1Var)) {
            tb1Var.M.p.C.f();
            return;
        }
        m5 m5VarK = tb1Var.M.p.K();
        if (m5VarK == null || (ub1Var = ((bn1) m5VarK).C) == null) {
            return;
        }
        ub1Var.f();
    }

    @Override // defpackage.nq1
    public final void H(boolean z) {
        al1 al1VarE1 = e1();
        tb1 tb1VarZ0 = al1VarE1 != null ? al1VarE1.Z0() : null;
        if (s51.n(tb1VarZ0, Z0())) {
            this.q = z;
            return;
        }
        if ((tb1VarZ0 != null ? tb1VarZ0.M.d : null) != pb1.h) {
            if ((tb1VarZ0 != null ? tb1VarZ0.M.d : null) != pb1.i) {
                return;
            }
        }
        this.q = z;
    }

    @Override // defpackage.k51
    public boolean M() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N0(defpackage.tb1 r32, defpackage.uy0 r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al1.N0(tb1, uy0):void");
    }

    public abstract int Q0(i5 i5Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void R0(final k62 k62Var, final long j, final long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        tb1 tb1Var;
        int i;
        char c2;
        long j6;
        al1 al1VarE1;
        t12 snapshotObserver;
        is1 is1Var = this.w;
        yf yfVar = this.v;
        if (yfVar == null) {
            yfVar = new yf();
            this.v = yfVar;
        }
        yf yfVar2 = yfVar;
        q12 q12Var = Z0().t;
        if (q12Var != null && (snapshotObserver = ((h7) q12Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(k62Var, x, new cs0() { // from class: yk1
                @Override // defpackage.cs0
                public final Object a() {
                    al1 al1Var = this.f;
                    al1Var.g1().f = false;
                    al1Var.g1().g = j;
                    al1Var.g1().h = j2;
                    ns0 ns0VarE = k62Var.f.e();
                    if (ns0VarE != null) {
                        ns0VarE.h(al1Var.g1());
                    }
                    return dm3.a;
                }
            });
        }
        boolean zM = M();
        js1 js1Var = (js1) yfVar2.e;
        js1 js1Var2 = (js1) yfVar2.f;
        int i2 = yfVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) yfVar2.d)[i3];
            if (b == 3) {
                uy0 uy0Var = ((uy0[]) yfVar2.b)[i3];
                uy0Var.getClass();
                js1Var2.k(uy0Var);
            } else if (b != 0 && is1Var != null) {
                uy0 uy0Var2 = ((uy0[]) yfVar2.b)[i3];
                uy0Var2.getClass();
                js1 js1Var3 = (js1) is1Var.k(uy0Var2);
                if (js1Var3 != null) {
                    js1Var.j(js1Var3);
                }
            }
        }
        int i4 = yfVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) yfVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                uy0[] uy0VarArr = (uy0[]) yfVar2.b;
                uy0VarArr[i6 - i5] = uy0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = yfVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((uy0[]) yfVar2.b)[i8] = null;
        }
        yfVar2.a -= i5;
        al1 al1VarE12 = e1();
        Object[] objArr = js1Var2.b;
        long[] jArr = js1Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            uy0 uy0Var3 = (uy0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            al1 al1Var = al1VarE12 == null ? this : al1VarE12;
                            i = i9;
                            al1 al1Var2 = al1Var;
                            while (true) {
                                yf yfVar3 = al1Var2.v;
                                if ((yfVar3 != null && uj.V((uy0[]) yfVar3.b, uy0Var3) >= 0) || (al1VarE1 = al1Var2.e1()) == null) {
                                    break;
                                } else {
                                    al1Var2 = al1VarE1;
                                }
                            }
                            is1 is1Var2 = al1Var2.w;
                            js1 js1Var4 = is1Var2 != null ? (js1) is1Var2.k(uy0Var3) : null;
                            if (js1Var4 != null) {
                                al1Var.i1(js1Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        js1Var2.b();
        Object[] objArr2 = js1Var.b;
        long[] jArr2 = js1Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (tb1Var = (tb1) ((ur3) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (zM) {
                                tb1Var.V(false);
                            } else {
                                tb1Var.X(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        js1Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T0(defpackage.dn1 r28) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al1.T0(dn1):void");
    }

    @Override // defpackage.r12
    public boolean U() {
        return Z0().H();
    }

    public abstract al1 U0();

    public abstract ab1 V0();

    public abstract boolean Y0();

    public abstract tb1 Z0();

    public abstract dn1 d1();

    public abstract al1 e1();

    public abstract long f1();

    public final zk1 g1() {
        zk1 zk1Var = this.k;
        if (zk1Var != null) {
            return zk1Var;
        }
        zk1 zk1Var2 = new zk1(this);
        this.k = zk1Var2;
        return zk1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i1(js1 js1Var) {
        tb1 tb1Var;
        Object[] objArr = js1Var.b;
        long[] jArr = js1Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (tb1Var = (tb1) ((ur3) objArr[(i << 3) + i3]).get()) != null) {
                        if (M()) {
                            tb1Var.V(false);
                        } else {
                            tb1Var.X(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void j1();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k1() {
        /*
            r15 = this;
            yf r0 = r15.v
            r1 = 0
            if (r0 == 0) goto L24
            int r2 = r0.a
            r3 = r1
        L8:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r0.b
            uy0[] r4 = (defpackage.uy0[]) r4
            r5 = 0
            r4[r3] = r5
            java.lang.Object r4 = r0.c
            float[] r4 = (float[]) r4
            r5 = 2143289344(0x7fc00000, float:NaN)
            r4[r3] = r5
            java.lang.Object r4 = r0.d
            byte[] r4 = (byte[]) r4
            r4[r3] = r1
            int r3 = r3 + 1
            goto L8
        L22:
            r0.a = r1
        L24:
            is1 r0 = r15.w
            if (r0 != 0) goto L29
            return
        L29:
            java.lang.Object[] r2 = r0.c
            long[] r3 = r0.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L6d
            r5 = r1
        L33:
            r6 = r3[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L4d:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            js1 r11 = (defpackage.js1) r11
            r15.i1(r11)
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L4d
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r4) goto L6d
            int r5 = r5 + 1
            goto L33
        L6d:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al1.k1():void");
    }

    @Override // defpackage.en1
    public final dn1 o0(int i, int i2, Map map, ns0 ns0Var, ns0 ns0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            m21.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new cj(i, i2, map, ns0Var, ns0Var2, this, 1);
    }

    @Override // defpackage.i62
    public final int z0(i5 i5Var) {
        int iQ0;
        if (!Y0() || (iQ0 = Q0(i5Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = i5Var instanceof xp3;
        long j = this.j;
        return iQ0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }
}
