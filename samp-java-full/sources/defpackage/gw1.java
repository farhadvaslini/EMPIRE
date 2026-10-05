package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gw1 {
    public kw1 a;
    public kw1 b;
    public cs0 c = new it1(2, this);
    public x50 d;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, q40 q40Var) {
        ew1 ew1Var;
        long j3;
        if (q40Var instanceof ew1) {
            ew1Var = (ew1) q40Var;
            int i = ew1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ew1Var.k = i - Integer.MIN_VALUE;
            } else {
                ew1Var = new ew1(this, q40Var);
            }
        }
        ew1 ew1Var2 = ew1Var;
        Object objJ0 = ew1Var2.i;
        int i2 = ew1Var2.k;
        if (i2 == 0) {
            y02.Q(objJ0);
            kw1 kw1Var = this.a;
            kw1 kw1VarQ1 = kw1Var != null ? kw1Var.q1() : null;
            j3 = 0;
            y50 y50Var = y50.f;
            if (kw1VarQ1 == null) {
                kw1 kw1Var2 = this.b;
                if (kw1Var2 != null) {
                    ew1Var2.k = 1;
                    objJ0 = kw1Var2.J0(j, j2, ew1Var2);
                }
            } else {
                kw1 kw1Var3 = this.a;
                kw1 kw1VarQ12 = kw1Var3 != null ? kw1Var3.q1() : null;
                if (kw1VarQ12 != null) {
                    ew1Var2.k = 2;
                    objJ0 = kw1VarQ12.J0(j, j2, ew1Var2);
                }
            }
        } else if (i2 == 1) {
            y02.Q(objJ0);
            j3 = ((lp3) objJ0).a;
        } else {
            if (i2 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objJ0);
            j3 = ((lp3) objJ0).a;
        }
        return new lp3(j3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, q40 q40Var) {
        fw1 fw1Var;
        long j2;
        if (q40Var instanceof fw1) {
            fw1Var = (fw1) q40Var;
            int i = fw1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw1Var.k = i - Integer.MIN_VALUE;
            } else {
                fw1Var = new fw1(this, q40Var);
            }
        }
        Object objG0 = fw1Var.i;
        int i2 = fw1Var.k;
        if (i2 == 0) {
            y02.Q(objG0);
            kw1 kw1Var = this.a;
            kw1 kw1VarQ1 = kw1Var != null ? kw1Var.q1() : null;
            if (kw1VarQ1 == null) {
                j2 = 0;
                return new lp3(j2);
            }
            fw1Var.k = 1;
            objG0 = kw1VarQ1.G0(j, fw1Var);
            y50 y50Var = y50.f;
            if (objG0 == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objG0);
        }
        j2 = ((lp3) objG0).a;
        return new lp3(j2);
    }

    public final x50 c() {
        x50 x50Var = (x50) this.c.a();
        if (x50Var != null) {
            return x50Var;
        }
        c.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
