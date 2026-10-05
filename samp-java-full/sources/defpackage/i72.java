package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class i72 {
    public static final r93 a = new r93(new f62(2));

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(te1 te1Var, n9 n9Var, q40 q40Var) {
        g72 g72Var;
        if (q40Var instanceof g72) {
            g72Var = (g72) q40Var;
            int i = g72Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                g72Var.j = i - Integer.MIN_VALUE;
            } else {
                g72Var = new g72(q40Var);
            }
        }
        Object obj = g72Var.i;
        int i2 = g72Var.j;
        if (i2 != 0) {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                y02.Q(obj);
                c.d();
                return;
            }
        }
        y02.Q(obj);
        if (!te1Var.f.s) {
            c.p("establishTextInputSession called from an unattached node");
            return;
        }
        q12 q12VarY = vr.Y(te1Var);
        n52 n52Var = (n52) vr.X(te1Var).H;
        n52Var.getClass();
        if (vp.Q(n52Var, a) != null) {
            qn1.b();
        } else {
            g72Var.j = 1;
            b(q12VarY, n9Var, g72Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q12 q12Var, rs0 rs0Var, q40 q40Var) {
        h72 h72Var;
        if (q40Var instanceof h72) {
            h72Var = (h72) q40Var;
            int i = h72Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                h72Var.j = i - Integer.MIN_VALUE;
            } else {
                h72Var = new h72(q40Var);
            }
        }
        Object obj = h72Var.i;
        int i2 = h72Var.j;
        if (i2 == 0) {
            y02.Q(obj);
            h72Var.j = 1;
            ((h7) q12Var).L(rs0Var, h72Var);
        } else if (i2 == 1) {
            y02.Q(obj);
            c.d();
        } else if (i2 != 2) {
            c.q("call to 'resume' before 'invoke' with coroutine");
        } else {
            y02.Q(obj);
            c.d();
        }
    }
}
