package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n10 extends d1 {
    public final x50 c;
    public rs0 d;
    public np e;
    public w83 f;
    public boolean g;

    public n10(x50 x50Var, bc2 bc2Var) {
        super(bc2Var);
        this.c = x50Var;
        this.d = new dc(2, null, 1);
    }

    @Override // defpackage.d1
    public final void k() {
        np npVar = this.e;
        if (npVar != null) {
            npVar.i(new CancellationException("onBack cancelled"), true);
        }
        w83 w83Var = this.f;
        if (w83Var != null) {
            w83Var.c(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.d1
    public final void l() {
        if (this.e != null && !this.g) {
            k();
        }
        if (this.e == null) {
            this.g = false;
            this.e = lr.a(-2, 4, jp.f);
            this.f = cl3.t(this.c, null, new j(this, null, 12), 3);
        }
        np npVar = this.e;
        if (npVar != null) {
            lv2.q(npVar);
        }
        this.g = false;
    }

    @Override // defpackage.d1
    public final void m(rk rkVar) {
        np npVar = this.e;
        if (npVar != null) {
            npVar.l(rkVar);
        }
    }

    @Override // defpackage.d1
    public final void n() {
        k();
        if (super.j()) {
            this.g = true;
            this.e = lr.a(-2, 4, jp.f);
            this.f = cl3.t(this.c, null, new j(this, null, 12), 3);
        }
    }

    public final void r(boolean z) {
        w83 w83Var;
        if (!z && super.j() && (w83Var = this.f) != null && !w83Var.b()) {
            k();
        }
        ((tk) this.a).f(z);
        ((sk) this.b).f(z);
    }
}
