package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
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
    */
    public static void j(s23 s23Var, gn0 gn0Var, p40 p40Var) throws Throwable {
        r23 r23Var;
        ?? r4;
        ?? r10;
        s23 s23Var2;
        j61 j61Var;
        j61 j61Var2;
        ?? r1;
        Object objT;
        ai0 ai0Var;
        y50 y50Var;
        ?? r102;
        ?? r9;
        ?? r8;
        if (p40Var instanceof r23) {
            r23Var = (r23) p40Var;
            int i = r23Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                r23Var.o = i - Integer.MIN_VALUE;
            } else {
                r23Var = new r23(s23Var, p40Var);
            }
        }
        Object obj = r23Var.m;
        int i2 = r23Var.o;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 == 0) {
            y02.Q(obj);
            r10 = gn0Var;
            gn0Var = (t23) s23Var.c();
            s23Var2 = s23Var;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    j61Var2 = r23Var.l;
                    t23 t23Var = r23Var.k;
                    gn0 gn0Var2 = r23Var.j;
                    s23 s23Var3 = r23Var.i;
                    y02.Q(obj);
                    r1 = gn0Var2;
                    r4 = s23Var3;
                    gn0Var = t23Var;
                    do {
                        objT = r4.t(gn0Var);
                        ai0Var = r51.H1;
                        y50Var = y50.f;
                        if (objT == ai0Var) {
                        }
                        r4.f(gn0Var);
                        throw th;
                    } while (r4.h(gn0Var, r23Var) != y50Var);
                }
                if (i2 != 3) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
                j61Var2 = r23Var.l;
                t23 t23Var2 = r23Var.k;
                gn0 gn0Var3 = r23Var.j;
                s23 s23Var4 = r23Var.i;
                y02.Q(obj);
                ?? r12 = gn0Var3;
                ?? r42 = s23Var4;
                ?? r92 = t23Var2;
                r102 = r12;
                j61Var = j61Var2;
                r8 = r42;
                r9 = r92;
                r4 = r8;
                j61Var2 = j61Var;
                r1 = r102;
                gn0Var = r9;
                do {
                    objT = r4.t(gn0Var);
                    ai0Var = r51.H1;
                    y50Var = y50.f;
                    if (objT == ai0Var) {
                        if (j61Var2 != null && !j61Var2.b()) {
                            throw j61Var2.o();
                        }
                        r23Var.i = r4;
                        r23Var.j = r1;
                        r23Var.k = gn0Var;
                        r23Var.l = j61Var2;
                        r23Var.o = 3;
                        Object objK = r1.k(objT, r23Var);
                        r12 = r1;
                        r42 = r4;
                        r92 = gn0Var;
                        if (objK == y50Var) {
                            return;
                        }
                        r102 = r12;
                        j61Var = j61Var2;
                        r8 = r42;
                        r9 = r92;
                        r4 = r8;
                        j61Var2 = j61Var;
                        r1 = r102;
                        gn0Var = r9;
                        objT = r4.t(gn0Var);
                        ai0Var = r51.H1;
                        y50Var = y50.f;
                        if (objT == ai0Var) {
                            r23Var.i = r4;
                            r23Var.j = r1;
                            r23Var.k = gn0Var;
                            r23Var.l = j61Var2;
                            r23Var.o = 2;
                        }
                    }
                    r4.f(gn0Var);
                    throw th;
                } while (r4.h(gn0Var, r23Var) != y50Var);
            }
            gn0Var = r23Var.k;
            gn0 gn0Var4 = r23Var.j;
            s23 s23Var5 = r23Var.i;
            try {
                y02.Q(obj);
                r10 = gn0Var4;
                s23Var2 = s23Var5;
                gn0Var = gn0Var;
            } catch (Throwable th2) {
                th = th2;
                r4 = s23Var5;
            }
        }
        o50 o50Var = r23Var.g;
        o50Var.getClass();
        j61Var = (j61) o50Var.m(f5.b0);
        r8 = s23Var2;
        r9 = gn0Var;
        r102 = r10;
        r4 = r8;
        j61Var2 = j61Var;
        r1 = r102;
        gn0Var = r9;
        do {
            objT = r4.t(gn0Var);
            ai0Var = r51.H1;
            y50Var = y50.f;
            if (objT == ai0Var) {
            }
            r4.f(gn0Var);
            throw th;
        } while (r4.h(gn0Var, r23Var) != y50Var);
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
    */
    public final Object k(Object obj, p40 p40Var) throws Throwable {
        s23 s23Var;
        Throwable th;
        p40[] p40VarArrN;
        q23 q23Var;
        Object objQ;
        y50 y50Var;
        if (q(obj)) {
            return dm3.a;
        }
        int i = 1;
        jr jrVar = new jr(1, vr.I(p40Var));
        jrVar.s();
        p40[] p40VarArrN2 = r51.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        jrVar.t(dm3.a);
                        p40VarArrN = n(p40VarArrN2);
                        q23Var = null;
                        s23Var = this;
                        if (q23Var != null) {
                            jrVar.w(new er(i, q23Var));
                        }
                        for (p40 p40Var2 : p40VarArrN) {
                            if (p40Var2 != null) {
                                p40Var2.t(dm3.a);
                            }
                        }
                        objQ = jrVar.q();
                        y50Var = y50.f;
                        if (objQ != y50Var) {
                            objQ = dm3.a;
                        }
                        return objQ != y50Var ? objQ : dm3.a;
                    } catch (Throwable th2) {
                        th = th2;
                        s23Var = this;
                    }
                } else {
                    try {
                        s23Var = this;
                        try {
                            q23 q23Var2 = new q23(s23Var, o() + ((long) (this.p + this.q)), obj, jrVar);
                            s23Var.m(q23Var2);
                            s23Var.q++;
                            if (s23Var.k == 0) {
                                p40VarArrN2 = s23Var.n(p40VarArrN2);
                            }
                            p40VarArrN = p40VarArrN2;
                            q23Var = q23Var2;
                            if (q23Var != null) {
                            }
                            while (i < r7) {
                            }
                            objQ = jrVar.q();
                            y50Var = y50.f;
                            if (objQ != y50Var) {
                            }
                            if (objQ != y50Var) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        s23Var = this;
                        th = th4;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                s23Var = this;
            }
            th = th;
            throw th;
        }
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
    */
    public final boolean r(Object obj) {
        int i = this.g;
        int i2 = this.j;
        if (i != 0) {
            int i3 = this.p;
            int i4 = this.k;
            if (i3 < i4 || this.o > this.n) {
                m(obj);
                int i5 = this.p + 1;
                this.p = i5;
                if (i5 > i4) {
                    l();
                }
                long jO = o() + ((long) this.p);
                long j = this.n;
                if (((int) (jO - j)) > i2) {
                    u(1 + j, this.o, o() + ((long) this.p), o() + ((long) this.p) + ((long) this.q));
                }
            } else {
                int iOrdinal = this.l.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c.k();
                        return false;
                    }
                }
            }
        } else if (i2 != 0) {
            m(obj);
            int i6 = this.p + 1;
            this.p = i6;
            if (i6 > i2) {
                l();
            }
            this.o = o() + ((long) this.p);
            return true;
        }
        return true;
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
