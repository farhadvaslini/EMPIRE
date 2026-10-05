package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class yy0 extends aq1 implements nk3, jb2, m20 {
    public nd0 t;
    public na u;
    public boolean v;

    public yy0(na naVar, nd0 nd0Var) {
        this.t = nd0Var;
        this.u = naVar;
    }

    @Override // defpackage.jb2
    public final long L() {
        if (this.t == null) {
            return nj3.a;
        }
        ua0 ua0Var = vr.X(this).E;
        int i = nj3.b;
        return ak2.k(ua0Var.p0(10.0f), ua0Var.p0(40.0f), ua0Var.p0(10.0f), ua0Var.p0(40.0f));
    }

    @Override // defpackage.jb2
    public final void L0() {
        t1();
    }

    @Override // defpackage.jb2
    public final void i0(za2 za2Var, ab2 ab2Var, long j) {
        if (ab2Var == ab2.g) {
            List list = za2Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (s1(((gb2) list.get(i)).i)) {
                    int i2 = za2Var.f;
                    if (i2 == 4) {
                        this.v = true;
                        r1();
                        return;
                    } else {
                        if (i2 == 5) {
                            t1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        t1();
    }

    public final void p1() {
        na naVar;
        qk2 qk2Var = new qk2();
        n32.C(this, new n20(qk2Var));
        yy0 yy0Var = (yy0) qk2Var.f;
        if (yy0Var == null || (naVar = yy0Var.u) == null) {
            naVar = this.u;
        }
        q1(naVar);
    }

    public abstract void q1(eb2 eb2Var);

    public final void r1() {
        mk2 mk2Var = new mk2();
        mk2Var.f = true;
        n32.E(this, new pd0(mk2Var));
        if (mk2Var.f) {
            p1();
        }
    }

    public abstract boolean s1(int i);

    public final void t1() {
        if (this.v) {
            this.v = false;
            if (this.s) {
                qk2 qk2Var = new qk2();
                n32.C(this, new t6(2, qk2Var));
                yy0 yy0Var = (yy0) qk2Var.f;
                if (yy0Var != null) {
                    yy0Var.p1();
                } else {
                    q1(null);
                }
            }
        }
    }
}
