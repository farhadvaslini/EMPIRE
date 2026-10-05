package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public final void N0(tb1 tb1Var, uy0 uy0Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        is1 is1Var = this.w;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (is1Var != null) {
            Object[] objArr = is1Var.c;
            long[] jArr3 = is1Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                js1 js1Var = (js1) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = js1Var.b;
                                long[] jArr4 = js1Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    tb1 tb1Var2 = (tb1) ((ur3) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (tb1Var2 != null) {
                                                        boolean zH = tb1Var2.H();
                                                        i4 = i8;
                                                        if (zH) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    js1Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        }
        is1 is1Var2 = this.w;
        if (is1Var2 != null) {
            long[] jArr5 = is1Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((js1) is1Var2.c[i18]).g()) {
                                    is1Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        is1 is1Var3 = this.w;
        if (is1Var3 == null) {
            is1Var3 = new is1();
            this.w = is1Var3;
        }
        Object objG = is1Var3.g(uy0Var);
        if (objG == null) {
            objG = new js1();
            is1Var3.m(uy0Var, objG);
        }
        ((js1) objG).k(new ur3(tb1Var));
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
    */
    public final void T0(dn1 dn1Var) {
        long j;
        char c;
        long j2;
        long j3;
        zk1 zk1Var;
        is1 is1Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        int i2;
        boolean z;
        zk1 zk1Var2;
        long j4;
        if (this.t) {
            return;
        }
        ns0 ns0VarE = dn1Var.e();
        rs0 rs0VarB = dn1Var.b();
        ns0 ns0VarF = dn1Var.f();
        long jI0 = 0;
        if (rs0VarB == null) {
            long jH = 9223372034707292159L;
            if (ns0VarE == null) {
                k1();
                this.l = null;
                this.m = null;
                this.n = null;
                zk1 zk1Var3 = this.k;
                if (zk1Var3 != null) {
                    zk1Var3.f = false;
                }
                if (zk1Var3 != null) {
                    zk1Var3.g = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.m = null;
            this.n = null;
            boolean z2 = this.l != ns0VarE;
            if (!z2 && g1().f) {
                ab1 ab1VarV0 = V0();
                jH = uq.H(ab1VarV0.i(0L));
                jI0 = ab1VarV0.i0();
                z2 = (i41.a(jH, g1().g) && p41.b(jI0, g1().h)) ? false : true;
            }
            if (z2) {
                k62 k62Var = this.o;
                if (k62Var != null) {
                    k62Var.f = dn1Var;
                } else {
                    k62Var = new k62(dn1Var, this, null);
                    this.o = k62Var;
                }
                R0(k62Var, jH, jI0);
                this.l = dn1Var.e();
                return;
            }
            return;
        }
        if (rs0VarB != this.m || ns0VarF != this.n) {
            this.m = rs0VarB;
            this.n = ns0VarF;
            k1();
            return;
        }
        is1 is1Var2 = this.r;
        long j5 = -9187201950435737472L;
        int i3 = 8;
        if (is1Var2 != null) {
            Object[] objArr3 = is1Var2.c;
            long[] jArr3 = is1Var2.a;
            j2 = 128;
            int length = jArr3.length - 2;
            if (length >= 0) {
                c = 7;
                int i4 = 0;
                zk1Var2 = null;
                while (true) {
                    long j6 = jArr3[i4];
                    j3 = 255;
                    if ((((~j6) << 7) & j6 & j5) != j5) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j6 & 255) < 128) {
                                j4 = j5;
                                zk1 zk1Var4 = (zk1) objArr3[(i4 << 3) + i6];
                                if (zk1Var4.f) {
                                    zk1Var2 = zk1Var4;
                                }
                            } else {
                                j4 = j5;
                            }
                            j6 >>= 8;
                            i6++;
                            j5 = j4;
                        }
                        j = j5;
                        if (i5 != 8) {
                            break;
                        }
                    } else {
                        j = j5;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    j5 = j;
                }
            } else {
                j = -9187201950435737472L;
                c = 7;
                j3 = 255;
                zk1Var2 = null;
            }
            zk1Var = zk1Var2;
        } else {
            j = -9187201950435737472L;
            c = 7;
            j2 = 128;
            j3 = 255;
            zk1Var = null;
        }
        if (zk1Var == null) {
            return;
        }
        ab1 ab1VarV02 = V0();
        long jH2 = uq.H(ab1VarV02.i(0L));
        long jI02 = ab1VarV02.i0();
        if ((i41.a(jH2, zk1Var.g) && p41.b(jI02, zk1Var.h)) || (is1Var = this.r) == null) {
            return;
        }
        Object[] objArr4 = is1Var.b;
        Object[] objArr5 = is1Var.c;
        long[] jArr4 = is1Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr4[i7];
            int i8 = length2;
            if ((((~j7) << c) & j7 & j) != j) {
                int i9 = 8 - ((~(i7 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j7 & j3) < j2) {
                        int i11 = (i7 << 3) + i10;
                        Object obj = objArr4[i11];
                        zk1 zk1Var5 = (zk1) objArr5[i11];
                        i2 = i3;
                        uy0 uy0Var = (uy0) obj;
                        jArr2 = jArr4;
                        if (zk1Var5.f) {
                            objArr2 = objArr4;
                            z = (p41.b(zk1Var5.h, jI02) && i41.a(zk1Var5.g, jH2)) ? false : true;
                            zk1Var5.h = jI02;
                            zk1Var5.g = jH2;
                            zk1Var5.f = false;
                            if (z) {
                                yf yfVar = this.v;
                                if (yfVar != null) {
                                    yfVar.h(uy0Var);
                                }
                                is1 is1Var3 = this.w;
                                js1 js1Var = is1Var3 != null ? (js1) is1Var3.g(uy0Var) : null;
                                if (js1Var != null) {
                                    i1(js1Var);
                                    js1Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        zk1Var5.h = jI02;
                        zk1Var5.g = jH2;
                        zk1Var5.f = false;
                        if (z) {
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                        i2 = i3;
                    }
                    j7 >>= i2;
                    i10++;
                    objArr4 = objArr2;
                    i3 = i2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i3;
            }
            length2 = i8;
            if (i7 == length2) {
                return;
            }
            i7++;
            i3 = i;
            objArr4 = objArr;
            jArr4 = jArr;
        }
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
    */
    public final void k1() {
        yf yfVar = this.v;
        if (yfVar != null) {
            int i = yfVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((uy0[]) yfVar.b)[i2] = null;
                ((float[]) yfVar.c)[i2] = Float.NaN;
                ((byte[]) yfVar.d)[i2] = 0;
            }
            yfVar.a = 0;
        }
        is1 is1Var = this.w;
        if (is1Var == null) {
            return;
        }
        Object[] objArr = is1Var.c;
        long[] jArr = is1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            i1((js1) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        is1Var.a();
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
