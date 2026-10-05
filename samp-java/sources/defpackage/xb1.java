package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xb1 {
    public final tb1 a;
    public boolean b;
    public boolean c;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public gl1 q;
    public pb1 d = pb1.j;
    public final bn1 p = new bn1(this);

    public xb1(tb1 tb1Var) {
        this.a = tb1Var;
    }

    public final ex1 a() {
        return this.a.L.d;
    }

    public final void b() {
        pb1 pb1Var = this.a.M.d;
        pb1 pb1Var2 = pb1.h;
        pb1 pb1Var3 = pb1.i;
        if (pb1Var == pb1Var2 || pb1Var == pb1Var3) {
            if (this.p.F) {
                g(true);
            } else {
                f(true);
            }
        }
        if (pb1Var == pb1Var3) {
            gl1 gl1Var = this.q;
            if (gl1Var == null || !gl1Var.z) {
                h(true);
            } else {
                i(true);
            }
        }
    }

    public final void c(long j) {
        gl1 gl1Var = this.q;
        if (gl1Var != null) {
            xb1 xb1Var = gl1Var.k;
            xb1Var.d = pb1.g;
            tb1 tb1Var = xb1Var.a;
            xb1Var.e = false;
            gl1Var.D = j;
            t12 snapshotObserver = ((h7) wb1.a(tb1Var)).getSnapshotObserver();
            el1 el1Var = gl1Var.E;
            snapshotObserver.a.d(tb1Var, snapshotObserver.b, el1Var);
            xb1Var.f = true;
            xb1Var.g = true;
            boolean zH = pq.H(tb1Var);
            bn1 bn1Var = xb1Var.p;
            if (zH) {
                bn1Var.A = true;
                bn1Var.B = true;
            } else {
                bn1Var.z = true;
            }
            xb1Var.d = pb1.j;
        }
    }

    public final void d(int i) {
        int i2 = this.l;
        this.l = i;
        if ((i2 == 0) != (i == 0)) {
            tb1 tb1VarU = this.a.u();
            xb1 xb1Var = tb1VarU != null ? tb1VarU.M : null;
            if (xb1Var != null) {
                int i3 = xb1Var.l;
                if (i == 0) {
                    xb1Var.d(i3 - 1);
                } else {
                    xb1Var.d(i3 + 1);
                }
            }
        }
    }

    public final void e(int i) {
        int i2 = this.o;
        this.o = i;
        if ((i2 == 0) != (i == 0)) {
            tb1 tb1VarU = this.a.u();
            xb1 xb1Var = tb1VarU != null ? tb1VarU.M : null;
            if (xb1Var != null) {
                int i3 = xb1Var.o;
                if (i == 0) {
                    xb1Var.e(i3 - 1);
                } else {
                    xb1Var.e(i3 + 1);
                }
            }
        }
    }

    public final void f(boolean z) {
        if (this.k != z) {
            this.k = z;
            if (z && !this.j) {
                d(this.l + 1);
            } else {
                if (z || this.j) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void g(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z && !this.k) {
                d(this.l + 1);
            } else {
                if (z || this.k) {
                    return;
                }
                d(this.l - 1);
            }
        }
    }

    public final void h(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (z && !this.m) {
                e(this.o + 1);
            } else {
                if (z || this.m) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void i(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z && !this.n) {
                e(this.o + 1);
            } else {
                if (z || this.n) {
                    return;
                }
                e(this.o - 1);
            }
        }
    }

    public final void j() {
        bn1 bn1Var = this.p;
        xb1 xb1Var = bn1Var.k;
        Object obj = bn1Var.w;
        tb1 tb1Var = this.a;
        if ((obj != null || xb1Var.a().E() != null) && bn1Var.v) {
            bn1Var.v = false;
            bn1Var.w = xb1Var.a().E();
            tb1 tb1VarU = tb1Var.u();
            if (tb1VarU != null) {
                tb1.Y(tb1VarU, false, 7);
            }
        }
        gl1 gl1Var = this.q;
        if (gl1Var != null) {
            xb1 xb1Var2 = gl1Var.k;
            if (gl1Var.C == null) {
                cl1 cl1VarU1 = xb1Var2.a().u1();
                cl1VarU1.getClass();
                if (cl1VarU1.z.E() == null) {
                    return;
                }
            }
            if (gl1Var.B) {
                gl1Var.B = false;
                cl1 cl1VarU12 = xb1Var2.a().u1();
                cl1VarU12.getClass();
                gl1Var.C = cl1VarU12.z.E();
                if (pq.H(tb1Var)) {
                    tb1 tb1VarU2 = tb1Var.u();
                    if (tb1VarU2 != null) {
                        tb1.Y(tb1VarU2, false, 7);
                        return;
                    }
                    return;
                }
                tb1 tb1VarU3 = tb1Var.u();
                if (tb1VarU3 != null) {
                    tb1.W(tb1VarU3, false, 7);
                }
            }
        }
    }
}
