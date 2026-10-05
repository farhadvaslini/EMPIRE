package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class c63 {
    public final dt1 a = new dt1();
    public final d42 b = b32.w(null);

    public static Object b(c63 c63Var, String str, q40 q40Var) {
        c63Var.getClass();
        return c63Var.a(new a63(str, r53.f), q40Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [c63] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a63 a63Var, q40 q40Var) {
        b63 b63Var;
        bt1 bt1Var;
        if (q40Var instanceof b63) {
            b63Var = (b63) q40Var;
            int i = b63Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                b63Var.m = i - Integer.MIN_VALUE;
            } else {
                b63Var = new b63(this, q40Var);
            }
        }
        Object objQ = b63Var.k;
        int i2 = b63Var.m;
        d42 d42Var = this.b;
        y50 y50Var = y50.f;
        try {
            try {
                if (i2 == 0) {
                    y02.Q(objQ);
                    b63Var.i = a63Var;
                    dt1 dt1Var = this.a;
                    b63Var.j = dt1Var;
                    b63Var.m = 1;
                    Object objF = dt1Var.f(b63Var);
                    bt1Var = dt1Var;
                    if (objF != y50Var) {
                    }
                    return y50Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bt1 bt1Var2 = b63Var.j;
                    y02.Q(objQ);
                    this = bt1Var2;
                    return objQ;
                }
                bt1 bt1Var3 = b63Var.j;
                a63Var = b63Var.i;
                y02.Q(objQ);
                bt1Var = bt1Var3;
                b63Var.i = a63Var;
                b63Var.j = bt1Var;
                b63Var.m = 2;
                jr jrVar = new jr(1, vr.I(b63Var));
                jrVar.s();
                d42Var.setValue(new z53(a63Var, jrVar));
                objQ = jrVar.q();
                this = bt1Var;
            } finally {
                d42Var.setValue(null);
            }
        } finally {
            ((dt1) this).i(null);
        }
    }
}
