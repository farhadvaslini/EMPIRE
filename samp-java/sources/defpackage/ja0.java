package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ja0 extends aq1 {
    public final int t = fx1.e(this);
    public aq1 u;

    @Override // defpackage.aq1
    public final void f1() {
        super.f1();
        for (aq1 aq1Var = this.u; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.o1(this.m);
            if (!aq1Var.s) {
                aq1Var.f1();
            }
        }
    }

    @Override // defpackage.aq1
    public final void g1() {
        for (aq1 aq1Var = this.u; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.g1();
        }
        super.g1();
    }

    @Override // defpackage.aq1
    public final void k1() {
        super.k1();
        for (aq1 aq1Var = this.u; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.k1();
        }
    }

    @Override // defpackage.aq1
    public final void l1() {
        for (aq1 aq1Var = this.u; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.l1();
        }
        super.l1();
    }

    @Override // defpackage.aq1
    public final void m1() {
        super.m1();
        for (aq1 aq1Var = this.u; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.m1();
        }
    }

    @Override // defpackage.aq1
    public final void n1(aq1 aq1Var) {
        this.f = aq1Var;
        for (aq1 aq1Var2 = this.u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
            aq1Var2.n1(aq1Var);
        }
    }

    @Override // defpackage.aq1
    public final void o1(ex1 ex1Var) {
        this.m = ex1Var;
        for (aq1 aq1Var = this.u; aq1Var != null; aq1Var = aq1Var.k) {
            aq1Var.o1(ex1Var);
        }
    }

    public final ia0 p1(ia0 ia0Var) {
        aq1 aq1Var = ((aq1) ia0Var).f;
        if (aq1Var != ia0Var) {
            aq1 aq1Var2 = ia0Var instanceof aq1 ? (aq1) ia0Var : null;
            aq1 aq1Var3 = aq1Var2 != null ? aq1Var2.j : null;
            if (aq1Var != this.f || !s51.n(aq1Var3, this)) {
                c.q("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (aq1Var.s) {
                m21.c("Cannot delegate to an already attached node");
            }
            aq1Var.n1(this.f);
            int i = this.h;
            int iF = fx1.f(aq1Var);
            aq1Var.h = iF;
            int i2 = this.h;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof kb1)) {
                m21.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + aq1Var);
            }
            aq1Var.k = this.u;
            this.u = aq1Var;
            aq1Var.j = this;
            r1(iF | this.h, false);
            if (this.s) {
                if (i3 == 0 || (i & 2) != 0) {
                    o1(this.m);
                } else {
                    ax1 ax1Var = vr.X(this).L;
                    this.f.o1(null);
                    ax1Var.g();
                }
                aq1Var.f1();
                aq1Var.l1();
                if (!aq1Var.s) {
                    m21.c("autoInvalidateInsertedNode called on unattached node");
                }
                fx1.a(aq1Var, -1, 1);
            }
        }
        return ia0Var;
    }

    public final void q1(ia0 ia0Var) {
        aq1 aq1Var = null;
        for (aq1 aq1Var2 = this.u; aq1Var2 != null; aq1Var2 = aq1Var2.k) {
            if (aq1Var2 == ia0Var) {
                boolean z = aq1Var2.s;
                if (z) {
                    wr1 wr1Var = fx1.a;
                    if (!z) {
                        m21.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    fx1.a(aq1Var2, -1, 2);
                    aq1Var2.m1();
                    aq1Var2.g1();
                }
                aq1Var2.n1(aq1Var2);
                aq1Var2.i = 0;
                aq1 aq1Var3 = aq1Var2.k;
                if (aq1Var == null) {
                    this.u = aq1Var3;
                } else {
                    aq1Var.k = aq1Var3;
                }
                aq1Var2.k = null;
                aq1Var2.j = null;
                int i = this.h;
                int iF = fx1.f(this);
                r1(iF, true);
                if (this.s && (i & 2) != 0 && (iF & 2) == 0) {
                    ax1 ax1Var = vr.X(this).L;
                    this.f.o1(null);
                    ax1Var.g();
                    return;
                }
                return;
            }
            aq1Var = aq1Var2;
        }
        c.h(ia0Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [aq1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aq1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void r1(int i, boolean z) {
        aq1 aq1Var;
        int i2 = this.h;
        this.h = i;
        if (i2 != i) {
            aq1 aq1Var2 = this.f;
            if (aq1Var2 == this) {
                this.i = i;
            }
            boolean z2 = this.s;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.h;
                    r2.h = i;
                    if (r2 == aq1Var2) {
                        break;
                    } else {
                        r2 = r2.j;
                    }
                }
                if (z && r2 == aq1Var2) {
                    i = fx1.f(aq1Var2);
                    aq1Var2.h = i;
                }
                int i3 = i | ((r2 == 0 || (aq1Var = r2.k) == null) ? 0 : aq1Var.i);
                for (?? r22 = r2; r22 != 0; r22 = r22.j) {
                    i3 |= r22.h;
                    r22.i = i3;
                }
            }
        }
    }
}
