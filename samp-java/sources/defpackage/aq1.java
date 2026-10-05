package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class aq1 implements ia0 {
    public n40 g;
    public int h;
    public aq1 j;
    public aq1 k;
    public fy1 l;
    public ex1 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public u1 r;
    public boolean s;
    public aq1 f = this;
    public int i = -1;

    public final x50 d1() {
        n40 n40Var = this.g;
        if (n40Var != null) {
            return n40Var;
        }
        n40 n40VarC = ur.c(((h7) vr.Y(this)).getCoroutineContext().k(new l61((j61) ((h7) vr.Y(this)).getCoroutineContext().m(f5.b0))));
        this.g = n40VarC;
        return n40VarC;
    }

    public boolean e1() {
        return !(this instanceof il);
    }

    public void f1() {
        if (this.s) {
            m21.c("node attached multiple times");
        }
        if (this.m == null) {
            m21.c("attach invoked on a node without a coordinator");
        }
        this.s = true;
        this.p = true;
    }

    public void g1() {
        if (!this.s) {
            m21.c("Cannot detach a node that is not attached");
        }
        if (this.p) {
            m21.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.q) {
            m21.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.s = false;
        n40 n40Var = this.g;
        if (n40Var != null) {
            ur.o(n40Var, new fq1(2, "The Modifier.Node was detached"));
            this.g = null;
        }
    }

    public void k1() {
        if (!this.s) {
            m21.c("reset() called on an unattached node");
        }
        j1();
    }

    public void l1() {
        if (!this.s) {
            m21.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.p) {
            m21.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.p = false;
        h1();
        this.q = true;
    }

    public void m1() {
        if (!this.s) {
            m21.c("node detached multiple times");
        }
        if (this.m == null) {
            m21.c("detach invoked on a node without a coordinator");
        }
        if (!this.q) {
            m21.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.q = false;
        u1 u1Var = this.r;
        if (u1Var != null) {
            u1Var.a();
        }
        i1();
    }

    public void n1(aq1 aq1Var) {
        this.f = aq1Var;
    }

    public void o1(ex1 ex1Var) {
        this.m = ex1Var;
    }

    public void h1() {
    }

    public void i1() {
    }

    public void j1() {
    }
}
