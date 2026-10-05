package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class s23 extends w0 implements ms1, fn0, dt0 {
    public final int j;
    public final int k;
    public final jp l;
    public Object[] m;
    public long n;
    public long o;
    public int p;
    public int q;

    public s23(int i, int i2, jp jpVar) {
        this.j = i;
        this.k = i2;
        this.l = jpVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:53)|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|55|25|26))(1:29)|51|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b1, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0076, B:35:0x0080, B:39:0x0093, B:42:0x009a, B:43:0x009e, B:44:0x009f, B:22:0x0047), top: B:53:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4, types: [gn0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [s23] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [gn0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [x0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [t23] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [t23] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.s23 r8, defpackage.gn0 r9, defpackage.p40 r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof defpackage.r23
            if (r0 == 0) goto L13
            r0 = r10
            r23 r0 = (defpackage.r23) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            r23 r0 = new r23
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.m
            int r1 = r0.o
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            j61 r8 = r0.l
            t23 r9 = r0.k
            gn0 r1 = r0.j
            s23 r4 = r0.i
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L73
        L36:
            r8 = move-exception
            goto Lb3
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.q(r8)
            return
        L3f:
            j61 r8 = r0.l
            t23 r9 = r0.k
            gn0 r1 = r0.j
            s23 r4 = r0.i
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L36
            goto L76
        L4b:
            t23 r9 = r0.k
            gn0 r8 = r0.j
            s23 r1 = r0.i
            defpackage.y02.Q(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb3
        L5a:
            defpackage.y02.Q(r10)
            x0 r10 = r8.c()
            t23 r10 = (defpackage.t23) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            o50 r1 = r0.g     // Catch: java.lang.Throwable -> Lb0
            r1.getClass()     // Catch: java.lang.Throwable -> Lb0
            f5 r4 = defpackage.f5.b0     // Catch: java.lang.Throwable -> Lb0
            m50 r1 = r1.m(r4)     // Catch: java.lang.Throwable -> Lb0
            j61 r1 = (defpackage.j61) r1     // Catch: java.lang.Throwable -> Lb0
        L73:
            r4 = r8
            r8 = r1
            r1 = r10
        L76:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            ai0 r5 = defpackage.r51.H1     // Catch: java.lang.Throwable -> L36
            y50 r6 = defpackage.y50.f
            if (r10 != r5) goto L91
            r0.i = r4     // Catch: java.lang.Throwable -> L36
            r0.j = r1     // Catch: java.lang.Throwable -> L36
            r0.k = r9     // Catch: java.lang.Throwable -> L36
            r0.l = r8     // Catch: java.lang.Throwable -> L36
            r0.o = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.h(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L76
            goto Laf
        L91:
            if (r8 == 0) goto L9f
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L9a
            goto L9f
        L9a:
            java.util.concurrent.CancellationException r8 = r8.o()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9f:
            r0.i = r4     // Catch: java.lang.Throwable -> L36
            r0.j = r1     // Catch: java.lang.Throwable -> L36
            r0.k = r9     // Catch: java.lang.Throwable -> L36
            r0.l = r8     // Catch: java.lang.Throwable -> L36
            r0.o = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.k(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Laf:
            return
        Lb0:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb3:
            r4.f(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s23.j(s23, gn0, p40):void");
    }

    @Override // defpackage.fn0
    public final Object a(gn0 gn0Var, p40 p40Var) throws Throwable {
        j(this, gn0Var, p40Var);
        return y50.f;
    }

    @Override // defpackage.dt0
    public final fn0 b(o50 o50Var, int i, jp jpVar) {
        return ((i == 0 || i == -3) && jpVar == jp.f) ? this : new os(this, o50Var, i, jpVar);
    }

    @Override // defpackage.w0
    public final x0 d() {
        t23 t23Var = new t23();
        t23Var.a = -1L;
        return t23Var;
    }

    @Override // defpackage.w0
    public final x0[] e() {
        return new t23[2];
    }

    public final Object h(t23 t23Var, r23 r23Var) {
        jr jrVar = new jr(1, vr.I(r23Var));
        jrVar.s();
        synchronized (this) {
            try {
                if (s(t23Var) < 0) {
                    t23Var.b = jrVar;
                } else {
                    jrVar.t(dm3.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objQ = jrVar.q();
        return objQ == y50.f ? objQ : dm3.a;
    }

    public final void i() {
        if (this.k != 0 || this.q > 1) {
            Object[] objArr = this.m;
            objArr.getClass();
            while (this.q > 0) {
                long jO = o();
                int i = this.p;
                int i2 = this.q;
                if (objArr[((int) ((jO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != r51.H1) {
                    return;
                }
                this.q = i2 - 1;
                r51.k(objArr, o() + ((long) (this.p + this.q)), null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r8, defpackage.p40 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.q(r8)
            if (r0 == 0) goto L9
            dm3 r7 = defpackage.dm3.a
            return r7
        L9:
            jr r5 = new jr
            p40 r9 = defpackage.vr.I(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.s()
            p40[] r9 = defpackage.r51.a
            monitor-enter(r7)
            boolean r0 = r7.r(r8)     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L30
            dm3 r8 = defpackage.dm3.a     // Catch: java.lang.Throwable -> L2b
            r5.t(r8)     // Catch: java.lang.Throwable -> L2b
            p40[] r8 = r7.n(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8d
        L30:
            q23 r0 = new q23     // Catch: java.lang.Throwable -> L8a
            long r1 = r7.o()     // Catch: java.lang.Throwable -> L8a
            int r3 = r7.p     // Catch: java.lang.Throwable -> L85
            int r4 = r7.q     // Catch: java.lang.Throwable -> L85
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.m(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.q     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.q = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.k     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            p40[] r9 = r1.n(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8d
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L64
            er r7 = new er
            r7.<init>(r6, r9)
            r5.w(r7)
        L64:
            int r7 = r8.length
            r9 = 0
        L66:
            if (r9 >= r7) goto L74
            r0 = r8[r9]
            if (r0 == 0) goto L71
            dm3 r1 = defpackage.dm3.a
            r0.t(r1)
        L71:
            int r9 = r9 + 1
            goto L66
        L74:
            java.lang.Object r7 = r5.q()
            y50 r8 = defpackage.y50.f
            if (r7 != r8) goto L7d
            goto L7f
        L7d:
            dm3 r7 = defpackage.dm3.a
        L7f:
            if (r7 != r8) goto L82
            return r7
        L82:
            dm3 r7 = defpackage.dm3.a
            return r7
        L85:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8d
        L8a:
            r0 = move-exception
            r1 = r7
            goto L55
        L8d:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s23.k(java.lang.Object, p40):java.lang.Object");
    }

    public final void l() {
        x0[] x0VarArr;
        Object[] objArr = this.m;
        objArr.getClass();
        r51.k(objArr, o(), null);
        this.p--;
        long jO = o() + 1;
        if (this.n < jO) {
            this.n = jO;
        }
        if (this.o < jO) {
            if (this.g != 0 && (x0VarArr = this.f) != null) {
                for (x0 x0Var : x0VarArr) {
                    if (x0Var != null) {
                        t23 t23Var = (t23) x0Var;
                        long j = t23Var.a;
                        if (0 <= j && j < jO) {
                            t23Var.a = jO;
                        }
                    }
                }
            }
            this.o = jO;
        }
    }

    public final void m(Object obj) {
        int i = this.p + this.q;
        Object[] objArrP = this.m;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length * 2);
        }
        r51.k(objArrP, o() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [p40[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final p40[] n(p40[] p40VarArr) {
        x0[] x0VarArr;
        t23 t23Var;
        jr jrVar;
        int length = p40VarArr.length;
        if (this.g != 0 && (x0VarArr = this.f) != null) {
            int length2 = x0VarArr.length;
            int i = 0;
            p40VarArr = p40VarArr;
            while (i < length2) {
                x0 x0Var = x0VarArr[i];
                if (x0Var != null && (jrVar = (t23Var = (t23) x0Var).b) != null && s(t23Var) >= 0) {
                    int length3 = p40VarArr.length;
                    p40VarArr = p40VarArr;
                    if (length >= length3) {
                        p40VarArr = Arrays.copyOf((Object[]) p40VarArr, Math.max(2, p40VarArr.length * 2));
                    }
                    ((p40[]) p40VarArr)[length] = jrVar;
                    t23Var.b = null;
                    length++;
                }
                i++;
                p40VarArr = p40VarArr;
            }
        }
        return (p40[]) p40VarArr;
    }

    public final long o() {
        return Math.min(this.o, this.n);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            c.q("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.m = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jO;
                r51.k(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        p40[] p40VarArrN = r51.a;
        synchronized (this) {
            if (r(obj)) {
                p40VarArrN = n(p40VarArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (p40 p40Var : p40VarArrN) {
            if (p40Var != null) {
                p40Var.t(dm3.a);
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.g
            int r2 = r12.j
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.m(r13)
            int r1 = r12.p
            int r1 = r1 + r9
            r12.p = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.p
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.o = r1
            return r9
        L23:
            int r1 = r12.p
            int r3 = r12.k
            if (r1 < r3) goto L46
            long r4 = r12.o
            long r6 = r12.n
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            jp r1 = r12.l
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7e
        L3f:
            defpackage.c.k()
            r0 = 0
            return r0
        L44:
            r0 = 0
            return r0
        L46:
            r12.m(r13)
            int r1 = r12.p
            int r1 = r1 + r9
            r12.p = r1
            if (r1 <= r3) goto L53
            r12.l()
        L53:
            long r3 = r12.o()
            int r1 = r12.p
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.n
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.o
            long r5 = r12.o()
            int r7 = r12.p
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.p
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.q
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.u(r1, r3, r5, r7)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s23.r(java.lang.Object):boolean");
    }

    public final long s(t23 t23Var) {
        long j = t23Var.a;
        if (j >= o() + ((long) this.p) && (this.k > 0 || j > o() || this.q == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(t23 t23Var) {
        Object obj;
        p40[] p40VarArrV = r51.a;
        synchronized (this) {
            try {
                long jS = s(t23Var);
                if (jS < 0) {
                    obj = r51.H1;
                } else {
                    long j = t23Var.a;
                    Object[] objArr = this.m;
                    objArr.getClass();
                    Object obj2 = objArr[((int) jS) & (objArr.length - 1)];
                    if (obj2 instanceof q23) {
                        obj2 = ((q23) obj2).h;
                    }
                    t23Var.a = jS + 1;
                    Object obj3 = obj2;
                    p40VarArrV = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (p40 p40Var : p40VarArrV) {
            if (p40Var != null) {
                p40Var.t(dm3.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.m;
            objArr.getClass();
            r51.k(objArr, jO, null);
        }
        this.n = j;
        this.o = j2;
        this.p = (int) (j3 - jMin);
        this.q = (int) (j4 - j3);
    }

    public final p40[] v(long j) {
        long j2;
        long j3;
        int i;
        long j4;
        p40[] p40VarArr;
        p40[] p40VarArr2;
        x0[] x0VarArr;
        ai0 ai0Var = r51.H1;
        p40[] p40VarArr3 = r51.a;
        if (j <= this.o) {
            long jO = o();
            long j5 = ((long) this.p) + jO;
            int i2 = this.k;
            if (i2 == 0 && this.q > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.g != 0 && (x0VarArr = this.f) != null) {
                for (x0 x0Var : x0VarArr) {
                    if (x0Var != null) {
                        long j6 = ((t23) x0Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.o) {
                long jO2 = o() + ((long) this.p);
                int i4 = this.g;
                int iMin = this.q;
                if (i4 > 0) {
                    j2 = 1;
                    iMin = Math.min(iMin, i2 - ((int) (jO2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.q) + jO2;
                if (iMin > 0) {
                    p40[] p40VarArr4 = new p40[iMin];
                    Object[] objArr = this.m;
                    objArr.getClass();
                    j3 = j5;
                    long j8 = jO2;
                    while (true) {
                        if (jO2 >= j7) {
                            p40VarArr2 = p40VarArr4;
                            i = i2;
                            j4 = j7;
                            break;
                        }
                        p40VarArr2 = p40VarArr4;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != ai0Var) {
                            obj.getClass();
                            q23 q23Var = (q23) obj;
                            i = i2;
                            int i5 = i3 + 1;
                            j4 = j7;
                            p40VarArr2[i3] = q23Var.i;
                            r51.k(objArr, jO2, ai0Var);
                            r51.k(objArr, j8, q23Var.h);
                            j8 += j2;
                            if (i5 >= iMin) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i = i2;
                            j4 = j7;
                        }
                        jO2 += j2;
                        p40VarArr4 = p40VarArr2;
                        i2 = i;
                        j7 = j4;
                    }
                    jO2 = j8;
                    p40VarArr = p40VarArr2;
                } else {
                    j3 = j5;
                    i = i2;
                    j4 = j7;
                    p40VarArr = p40VarArr3;
                }
                long jMax = Math.max(this.n, Math.max(jO, jO2 - ((long) this.j)));
                if (i == 0 && jMax < j4) {
                    Object[] objArr2 = this.m;
                    objArr2.getClass();
                    if (s51.n(objArr2[((int) jMax) & (objArr2.length - 1)], ai0Var)) {
                        jO2 += j2;
                        jMax += j2;
                    }
                }
                long j9 = jO2;
                u(jMax, this.g == 0 ? j9 : j3, j9, j4);
                i();
                return p40VarArr.length == 0 ? p40VarArr : n(p40VarArr);
            }
        }
        return p40VarArr3;
    }
}
