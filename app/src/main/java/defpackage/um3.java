package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class um3 {
    public static final qe f = new qe(0.0f);
    public final zo3 a;
    public long b = Long.MIN_VALUE;
    public qe c = f;
    public boolean d;
    public float e;

    public um3(oe oeVar) {
        this.a = oeVar.a(rn.f1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        if (defpackage.lq.I(r0).a(r8, r3) == r12) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
      0x007e: PHI (r0v16 ns0) = (r0v9 ns0), (r0v17 ns0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r2v5 cs0) = (r2v3 cs0), (r2v6 cs0) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r3v4 tm3) = (r3v2 tm3), (r3v5 tm3) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0076, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d6, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d6, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[Catch: all -> 0x003a, PHI: r0 r2 r3
      0x00b0: PHI (r0v12 ns0) = (r0v16 ns0), (r0v17 ns0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r2v4 cs0) = (r2v5 cs0), (r2v6 cs0) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b0: PHI (r3v3 tm3) = (r3v4 tm3), (r3v5 tm3) binds: [B:32:0x008b, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d6, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d6, B:20:0x004b, B:36:0x00a9, B:30:0x007e, B:33:0x008c, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v1 v1Var, ok okVar, q40 q40Var) {
        tm3 tm3Var;
        float f2;
        tm3 tm3Var2;
        ns0 ns0Var;
        cs0 cs0Var;
        if (q40Var instanceof tm3) {
            tm3Var = (tm3) q40Var;
            int i = tm3Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm3Var.n = i - Integer.MIN_VALUE;
            } else {
                tm3Var = new tm3(this, q40Var);
            }
        }
        Object obj = tm3Var.l;
        int i2 = tm3Var.n;
        qe qeVar = f;
        int i3 = 2;
        y50 y50Var = y50.f;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cs0Var = (cs0) tm3Var.i;
                    y02.Q(obj);
                    cs0Var.a();
                    this.b = Long.MIN_VALUE;
                    this.c = qeVar;
                    this.d = false;
                    return dm3.a;
                }
                float f3 = tm3Var.k;
                cs0 cs0Var2 = tm3Var.j;
                ns0 ns0Var2 = (ns0) tm3Var.i;
                y02.Q(obj);
                tm3Var2 = tm3Var;
                cs0Var = cs0Var2;
                f2 = f3;
                ns0Var = ns0Var2;
                cs0Var.a();
                if (f2 != 0.0f) {
                    if (Math.abs(this.e) == 0.0f) {
                        ik3 ik3Var = new ik3(i3, this, ns0Var);
                        tm3Var2.i = cs0Var;
                        tm3Var2.j = null;
                        tm3Var2.n = 2;
                        o50 o50Var = tm3Var2.g;
                        o50Var.getClass();
                    }
                } else if (Math.abs(this.e) < 0.01f) {
                    j8 j8Var = new j8(this, f2, ns0Var);
                    tm3Var2.i = ns0Var;
                    tm3Var2.j = cs0Var;
                    tm3Var2.k = f2;
                    tm3Var2.n = 1;
                    o50 o50Var2 = tm3Var2.g;
                    o50Var2.getClass();
                    if (lq.I(o50Var2).a(j8Var, tm3Var2) == y50Var) {
                        return y50Var;
                    }
                    cs0Var.a();
                    if (f2 != 0.0f) {
                    }
                } else if (Math.abs(this.e) == 0.0f) {
                }
                this.b = Long.MIN_VALUE;
                this.c = qeVar;
                this.d = false;
                return dm3.a;
            }
            y02.Q(obj);
            if (this.d) {
                p21.c("animateToZero called while previous animation is running");
            }
            o50 o50Var3 = tm3Var.g;
            o50Var3.getClass();
            iq1 iq1Var = (iq1) o50Var3.m(f5.d0);
            float fV = iq1Var != null ? iq1Var.v() : 1.0f;
            this.d = true;
            f2 = fV;
            tm3Var2 = tm3Var;
            ns0Var = v1Var;
            cs0Var = okVar;
            if (Math.abs(this.e) < 0.01f) {
            }
        } catch (Throwable th) {
            this.b = Long.MIN_VALUE;
            this.c = qeVar;
            this.d = false;
            throw th;
        }
    }
}
