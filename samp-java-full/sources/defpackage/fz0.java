package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends aq1 implements jb2 {
    public qr1 t;
    public zy0 u;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p1(fz0 fz0Var, q40 q40Var) throws Throwable {
        cz0 cz0Var;
        zy0 zy0Var;
        if (q40Var instanceof cz0) {
            cz0Var = (cz0) q40Var;
            int i = cz0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz0Var.l = i - Integer.MIN_VALUE;
            } else {
                cz0Var = new cz0(fz0Var, q40Var);
            }
        }
        Object obj = cz0Var.j;
        int i2 = cz0Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            if (fz0Var.u == null) {
                zy0 zy0Var2 = new zy0();
                qr1 qr1Var = fz0Var.t;
                cz0Var.i = zy0Var2;
                cz0Var.l = 1;
                Object objB = qr1Var.b(zy0Var2, cz0Var);
                y50 y50Var = y50.f;
                if (objB == y50Var) {
                    return y50Var;
                }
                zy0Var = zy0Var2;
            }
            return dm3.a;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        zy0Var = cz0Var.i;
        y02.Q(obj);
        fz0Var.u = zy0Var;
        return dm3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object q1(fz0 fz0Var, q40 q40Var) throws Throwable {
        dz0 dz0Var;
        if (q40Var instanceof dz0) {
            dz0Var = (dz0) q40Var;
            int i = dz0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dz0Var.k = i - Integer.MIN_VALUE;
            } else {
                dz0Var = new dz0(fz0Var, q40Var);
            }
        }
        Object obj = dz0Var.i;
        int i2 = dz0Var.k;
        if (i2 == 0) {
            y02.Q(obj);
            zy0 zy0Var = fz0Var.u;
            if (zy0Var != null) {
                az0 az0Var = new az0(zy0Var);
                qr1 qr1Var = fz0Var.t;
                dz0Var.k = 1;
                Object objB = qr1Var.b(az0Var, dz0Var);
                y50 y50Var = y50.f;
                if (objB == y50Var) {
                    return y50Var;
                }
            }
            return dm3.a;
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y02.Q(obj);
        fz0Var.u = null;
        return dm3.a;
    }

    @Override // defpackage.jb2
    public final void L0() {
        r1();
    }

    @Override // defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        if (ab2Var == ab2.g) {
            int i = za2Var.f;
            p40 p40Var = null;
            if (i == 4) {
                cl3.t(d1(), null, new ez0(this, p40Var, 0), 3);
            } else if (i == 5) {
                cl3.t(d1(), null, new ez0(this, p40Var, 1), 3);
            }
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        r1();
    }

    public final void r1() {
        zy0 zy0Var = this.u;
        if (zy0Var != null) {
            this.t.c(new az0(zy0Var));
            this.u = null;
        }
    }
}
