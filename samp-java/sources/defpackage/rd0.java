package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class rd0 extends aq1 implements nk3, ya1 {
    public rd0 t;
    public rd0 u;
    public long v;

    @Override // defpackage.nk3
    public final Object K() {
        return f5.Q;
    }

    @Override // defpackage.ya1, defpackage.gn1
    public final void i(long j) {
        this.v = j;
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.u = null;
        this.t = null;
    }

    public final boolean p1() {
        rd0 rd0Var = this.t;
        if (rd0Var != null) {
            return rd0Var.p1();
        }
        rd0 rd0Var2 = this.u;
        if (rd0Var2 != null) {
            return rd0Var2.p1();
        }
        return false;
    }

    public final void q1() {
        rd0 rd0Var = this.u;
        if (rd0Var != null) {
            rd0Var.q1();
            return;
        }
        rd0 rd0Var2 = this.t;
        if (rd0Var2 != null) {
            rd0Var2.q1();
        }
    }

    public final void r1() {
        rd0 rd0Var = this.u;
        if (rd0Var != null) {
            rd0Var.r1();
        }
        rd0 rd0Var2 = this.t;
        if (rd0Var2 != null) {
            rd0Var2.r1();
        }
        this.t = null;
    }

    public final void s1(yl1 yl1Var) {
        nk3 nk3Var;
        rd0 rd0Var;
        rd0 rd0Var2 = this.t;
        if (rd0Var2 == null || !br.l(rd0Var2, lr.I(yl1Var))) {
            if (this.f.s) {
                qk2 qk2Var = new qk2();
                n32.E(this, new qd0(qk2Var, this, yl1Var));
                nk3Var = (nk3) qk2Var.f;
            } else {
                nk3Var = null;
            }
            rd0Var = (rd0) nk3Var;
        } else {
            rd0Var = rd0Var2;
        }
        if (rd0Var != null && rd0Var2 == null) {
            rd0Var.q1();
            rd0Var.s1(yl1Var);
            rd0 rd0Var3 = this.u;
            if (rd0Var3 != null) {
                rd0Var3.r1();
            }
        } else if (rd0Var == null && rd0Var2 != null) {
            rd0 rd0Var4 = this.u;
            if (rd0Var4 != null) {
                rd0Var4.q1();
                rd0Var4.s1(yl1Var);
            }
            rd0Var2.r1();
        } else if (!s51.n(rd0Var, rd0Var2)) {
            if (rd0Var != null) {
                rd0Var.q1();
                rd0Var.s1(yl1Var);
            }
            if (rd0Var2 != null) {
                rd0Var2.r1();
            }
        } else if (rd0Var != null) {
            rd0Var.s1(yl1Var);
        } else {
            rd0 rd0Var5 = this.u;
            if (rd0Var5 != null) {
                rd0Var5.s1(yl1Var);
            }
        }
        this.t = rd0Var;
    }

    public final void t1() {
        rd0 rd0Var = this.u;
        if (rd0Var != null) {
            rd0Var.t1();
            return;
        }
        rd0 rd0Var2 = this.t;
        if (rd0Var2 != null) {
            rd0Var2.t1();
        }
    }
}
