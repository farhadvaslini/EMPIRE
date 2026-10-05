package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class a73 {
    public static final cr2 a = new cr2(29);
    public static final pi b = new pi(18);
    public static final Object c = new Object();
    public static y63 d;
    public static long e;
    public static final kc f;
    public static final h9 g;
    public static List h;
    public static List i;
    public static final hw0 j;
    public static final bk k;

    static {
        y63 y63Var = y63.j;
        d = y63Var;
        e = 2L;
        kc kcVar = new kc();
        kcVar.d = new long[16];
        kcVar.b = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        kcVar.e = iArr;
        f = kcVar;
        h9 h9Var = new h9(7);
        h9Var.c = new int[16];
        h9Var.d = new wr3[16];
        g = h9Var;
        ni0 ni0Var = ni0.f;
        h = ni0Var;
        i = ni0Var;
        long j2 = e;
        e = 1 + j2;
        hw0 hw0Var = new hw0(j2, y63Var, null, new n20(9));
        d = d.f(hw0Var.b);
        j = hw0Var;
        k = new bk(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, ns1 ns1Var, y63 y63Var) {
        long[] jArr;
        y63 y63Var2;
        long[] jArr2;
        y63 y63Var3;
        int i2;
        int i3;
        p93 p93VarS;
        js1 js1VarX = ns1Var.x();
        if (js1VarX != null) {
            long jG = ns1Var.g();
            y63 y63VarE = ns1Var.d().f(jG).e(ns1Var.j);
            Object[] objArr = js1VarX.b;
            long[] jArr3 = js1VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                n93 n93Var = (n93) objArr[(i4 << 3) + i7];
                                p93 p93VarA = n93Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                p93 p93VarS2 = s(p93VarA, j2, y63Var);
                                if (p93VarS2 == null || (p93VarS = s(p93VarA, jG, y63VarE)) == null || p93VarS2.equals(p93VarS)) {
                                    y63Var3 = y63VarE;
                                } else {
                                    y63Var3 = y63VarE;
                                    p93 p93VarS3 = s(p93VarA, jG, ns1Var.d());
                                    if (p93VarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    p93 p93VarB = n93Var.b(p93VarS, p93VarS2, p93VarS3);
                                    if (p93VarB == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(p93VarS2, p93VarB);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                y63Var3 = y63VarE;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            y63VarE = y63Var3;
                        }
                        jArr = jArr3;
                        y63Var2 = y63VarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        y63Var2 = y63VarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    y63VarE = y63Var2;
                }
            }
        }
        return null;
    }

    public static final void c(t63 t63Var) {
        Long lValueOf;
        if (d.c(t63Var.g())) {
            return;
        }
        long jG = t63Var.g();
        boolean z = t63Var.c;
        ns1 ns1Var = t63Var instanceof ns1 ? (ns1) t63Var : null;
        String strValueOf = ns1Var != null ? Boolean.valueOf(ns1Var.m) : "read-only";
        synchronized (c) {
            kc kcVar = f;
            lValueOf = Long.valueOf(kcVar.a > 0 ? ((long[]) kcVar.d)[0] : -1L);
        }
        throw new IllegalStateException(("Snapshot is not open: snapshotId=" + jG + ", disposed=" + z + ", applied=" + strValueOf + ", lowestPin=" + lValueOf).toString());
    }

    public static final y63 d(y63 y63Var, long j2, long j3) {
        while (s51.s(j2, j3) < 0) {
            y63Var = y63Var.f(j2);
            j2++;
        }
        return y63Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.ns0 r15) {
        /*
            hw0 r0 = defpackage.a73.j
            java.lang.Object r1 = defpackage.a73.c
            monitor-enter(r1)
            js1 r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            bk r3 = defpackage.a73.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.util.List r4 = defpackage.a73.h     // Catch: java.lang.Throwable -> L36
            pr2 r5 = new pr2     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L36
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L36
            r7 = r1
        L28:
            if (r7 >= r6) goto L38
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L36
            rs0 r8 = (defpackage.rs0) r8     // Catch: java.lang.Throwable -> L36
            r8.f(r5, r0)     // Catch: java.lang.Throwable -> L36
            int r7 = r7 + 1
            goto L28
        L36:
            r15 = move-exception
            goto L3e
        L38:
            bk r0 = defpackage.a73.k
            r0.addAndGet(r3)
            goto L44
        L3e:
            bk r0 = defpackage.a73.k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = defpackage.a73.c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            n93 r11 = (defpackage.n93) r11     // Catch: java.lang.Throwable -> L86
            q(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a73.e(ns0):java.lang.Object");
    }

    public static final void f() {
        h9 h9Var = g;
        int i2 = h9Var.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            wr3 wr3Var = ((wr3[]) h9Var.d)[i3];
            Object obj = wr3Var != null ? wr3Var.get() : null;
            if (obj != null && p((n93) obj)) {
                if (i4 != i3) {
                    ((wr3[]) h9Var.d)[i4] = wr3Var;
                    int[] iArr = (int[]) h9Var.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((wr3[]) h9Var.d)[i5] = null;
            ((int[]) h9Var.c)[i5] = 0;
        }
        if (i4 != i2) {
            h9Var.b = i4;
        }
    }

    public static final t63 g(t63 t63Var, ns0 ns0Var, boolean z) {
        boolean z2 = t63Var instanceof ns1;
        if (z2 || t63Var == null) {
            return new kk3(z2 ? (ns1) t63Var : null, ns0Var, null, false, z);
        }
        return new lk3(t63Var, ns0Var, false, z);
    }

    public static final p93 h(p93 p93Var) {
        p93 p93VarS;
        t63 t63VarJ = j();
        p93 p93VarS2 = s(p93Var, t63VarJ.g(), t63VarJ.d());
        if (p93VarS2 != null) {
            return p93VarS2;
        }
        synchronized (c) {
            t63 t63VarJ2 = j();
            p93VarS = s(p93Var, t63VarJ2.g(), t63VarJ2.d());
        }
        if (p93VarS != null) {
            return p93VarS;
        }
        r();
        throw null;
    }

    public static final p93 i(p93 p93Var, t63 t63Var) {
        p93 p93VarS;
        p93 p93VarS2 = s(p93Var, t63Var.g(), t63Var.d());
        if (p93VarS2 != null) {
            return p93VarS2;
        }
        synchronized (c) {
            p93VarS = s(p93Var, t63Var.g(), t63Var.d());
        }
        if (p93VarS != null) {
            return p93VarS;
        }
        r();
        throw null;
    }

    public static final t63 j() {
        t63 t63Var = (t63) b.j();
        return t63Var == null ? j : t63Var;
    }

    public static final ns0 k(ns0 ns0Var, ns0 ns0Var2, boolean z) {
        if (!z) {
            ns0Var2 = null;
        }
        return (ns0Var == null || ns0Var2 == null || ns0Var == ns0Var2) ? ns0Var == null ? ns0Var2 : ns0Var : new z63(ns0Var, ns0Var2, 0);
    }

    public static final ns0 l(ns0 ns0Var, ns0 ns0Var2) {
        return (ns0Var == null || ns0Var2 == null || ns0Var == ns0Var2) ? ns0Var == null ? ns0Var2 : ns0Var : new z63(ns0Var, ns0Var2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p93 m(defpackage.p93 r10, defpackage.n93 r11) {
        /*
            p93 r0 = r11.a()
            long r1 = defpackage.a73.e
            kc r3 = defpackage.a73.f
            int r4 = r3.a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.d
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.s51.s(r5, r1)
            if (r7 > 0) goto L48
            y63 r7 = defpackage.y63.j
            boolean r5 = r7.c(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.s51.s(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            p93 r0 = r0.b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.a = r0
            return r3
        L55:
            p93 r10 = r10.b(r0)
            p93 r0 = r11.a()
            r10.b = r0
            r11.c(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a73.m(p93, n93):p93");
    }

    public static final void n(t63 t63Var, n93 n93Var) {
        t63Var.t(t63Var.h() + 1);
        ns0 ns0VarI = t63Var.i();
        if (ns0VarI != null) {
            ns0VarI.h(n93Var);
        }
    }

    public static final p93 o(p93 p93Var, o93 o93Var, t63 t63Var, p93 p93Var2) {
        p93 p93VarM;
        if (t63Var.f()) {
            t63Var.n(o93Var);
        }
        long jG = t63Var.g();
        if (p93Var2.a == jG) {
            return p93Var2;
        }
        synchronized (c) {
            p93VarM = m(p93Var, o93Var);
        }
        p93VarM.a = jG;
        t63Var.n(o93Var);
        return p93VarM;
    }

    public static final boolean p(n93 n93Var) {
        p93 p93Var;
        long j2 = e;
        kc kcVar = f;
        if (kcVar.a > 0) {
            j2 = ((long[]) kcVar.d)[0];
        }
        p93 p93Var2 = null;
        p93 p93VarA = null;
        int i2 = 0;
        for (p93 p93VarA2 = n93Var.a(); p93VarA2 != null; p93VarA2 = p93VarA2.b) {
            long j3 = p93VarA2.a;
            if (j3 != 0) {
                if (s51.s(j3, j2) >= 0) {
                    i2++;
                } else if (p93Var2 == null) {
                    i2++;
                    p93Var2 = p93VarA2;
                } else {
                    if (s51.s(p93VarA2.a, p93Var2.a) < 0) {
                        p93Var = p93Var2;
                        p93Var2 = p93VarA2;
                    } else {
                        p93Var = p93VarA2;
                    }
                    if (p93VarA == null) {
                        p93VarA = n93Var.a();
                        p93 p93Var3 = p93VarA;
                        while (true) {
                            if (p93VarA == null) {
                                p93VarA = p93Var3;
                                break;
                            }
                            if (s51.s(p93VarA.a, j2) >= 0) {
                                break;
                            }
                            if (s51.s(p93Var3.a, p93VarA.a) < 0) {
                                p93Var3 = p93VarA;
                            }
                            p93VarA = p93VarA.b;
                        }
                    }
                    p93Var2.a = 0L;
                    p93Var2.a(p93VarA);
                    p93Var2 = p93Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(n93 n93Var) {
        if (p(n93Var)) {
            h9 h9Var = g;
            int i2 = h9Var.b;
            int iIdentityHashCode = System.identityHashCode(n93Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = h9Var.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) h9Var.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        wr3 wr3Var = ((wr3[]) h9Var.d)[i6];
                        if (n93Var == (wr3Var != null ? wr3Var.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) h9Var.c)[i8] == iIdentityHashCode; i8--) {
                                wr3 wr3Var2 = ((wr3[]) h9Var.d)[i8];
                                if ((wr3Var2 != null ? wr3Var2.get() : null) == n93Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = h9Var.b;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(h9Var.b + 1);
                                    break;
                                } else {
                                    if (((int[]) h9Var.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    wr3 wr3Var3 = ((wr3[]) h9Var.d)[i6];
                                    if ((wr3Var3 != null ? wr3Var3.get() : null) == n93Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            wr3[] wr3VarArr = (wr3[]) h9Var.d;
            int length = wr3VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                wr3[] wr3VarArr2 = new wr3[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(wr3VarArr, i10, wr3VarArr2, i12, i2 - i10);
                System.arraycopy((wr3[]) h9Var.d, 0, wr3VarArr2, 0, i10);
                uj.G(i12, i10, i2, (int[]) h9Var.c, iArr);
                uj.K(0, i10, 6, (int[]) h9Var.c, iArr);
                h9Var.d = wr3VarArr2;
                h9Var.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(wr3VarArr, i10, wr3VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) h9Var.c;
                uj.G(i13, i10, i2, iArr2, iArr2);
            }
            ((wr3[]) h9Var.d)[i10] = new wr3(n93Var);
            ((int[]) h9Var.c)[i10] = iIdentityHashCode;
            h9Var.b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final p93 s(p93 p93Var, long j2, y63 y63Var) {
        p93 p93Var2 = null;
        while (p93Var != null) {
            long j3 = p93Var.a;
            if (j3 != 0 && s51.s(j3, j2) <= 0 && !y63Var.c(j3) && (p93Var2 == null || s51.s(p93Var2.a, p93Var.a) < 0)) {
                p93Var2 = p93Var;
            }
            p93Var = p93Var.b;
        }
        if (p93Var2 != null) {
            return p93Var2;
        }
        return null;
    }

    public static final p93 t(p93 p93Var, n93 n93Var) {
        p93 p93VarS;
        t63 t63VarJ = j();
        ns0 ns0VarE = t63VarJ.e();
        if (ns0VarE != null) {
            ns0VarE.h(n93Var);
        }
        p93 p93VarS2 = s(p93Var, t63VarJ.g(), t63VarJ.d());
        if (p93VarS2 != null) {
            return p93VarS2;
        }
        synchronized (c) {
            t63 t63VarJ2 = j();
            p93 p93VarA = n93Var.a();
            p93VarA.getClass();
            p93VarS = s(p93VarA, t63VarJ2.g(), t63VarJ2.d());
            if (p93VarS == null) {
                r();
                throw null;
            }
        }
        return p93VarS;
    }

    public static final void u(int i2) {
        kc kcVar = f;
        int i3 = ((int[]) kcVar.e)[i2];
        kcVar.d(i3, kcVar.a - 1);
        kcVar.a--;
        long[] jArr = (long[]) kcVar.d;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (s51.s(jArr[i5], j2) <= 0) {
                break;
            }
            kcVar.d(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) kcVar.d;
        int i6 = kcVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < kcVar.a && s51.s(jArr2[i7], jArr2[i8]) < 0) {
                if (s51.s(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                kcVar.d(i7, i3);
                i3 = i7;
            } else {
                if (s51.s(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                kcVar.d(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) kcVar.e)[i2] = kcVar.c;
        kcVar.c = i2;
    }

    public static final Object v(hw0 hw0Var, ns0 ns0Var) {
        long j2 = hw0Var.b;
        Object objH = ns0Var.h(d.b(j2));
        long j3 = e;
        e = 1 + j3;
        y63 y63VarB = d.b(j2);
        d = y63VarB;
        hw0Var.b = j3;
        hw0Var.a = y63VarB;
        hw0Var.g = 0;
        hw0Var.h = null;
        hw0Var.o();
        d = d.f(j3);
        return objH;
    }

    public static final p93 w(p93 p93Var, n93 n93Var, t63 t63Var) {
        p93 p93VarS;
        p93 p93VarS2;
        if (t63Var.f()) {
            t63Var.n(n93Var);
        }
        long jG = t63Var.g();
        p93 p93VarS3 = s(p93Var, jG, t63Var.d());
        if (p93VarS3 == null) {
            synchronized (c) {
                t63 t63VarJ = j();
                p93 p93VarA = n93Var.a();
                p93VarA.getClass();
                p93VarS2 = s(p93VarA, t63VarJ.g(), t63VarJ.d());
                if (p93VarS2 == null) {
                    r();
                    throw null;
                }
            }
            p93VarS3 = p93VarS2;
        }
        if (p93VarS3.a == t63Var.g()) {
            return p93VarS3;
        }
        synchronized (c) {
            p93VarS = s(n93Var.a(), jG, t63Var.d());
            if (p93VarS == null) {
                r();
                throw null;
            }
            if (p93VarS.a != jG) {
                p93 p93VarM = m(p93VarS, n93Var);
                p93VarM.a(p93VarS);
                p93VarM.a = t63Var.g();
                p93VarS = p93VarM;
            }
        }
        t63Var.n(n93Var);
        return p93VarS;
    }
}
