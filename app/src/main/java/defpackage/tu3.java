package defpackage;

import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tu3 implements f20, mf1 {
    public final h7 f;
    public final l20 g;
    public boolean h;
    public gf1 i;
    public d00 j = n92.A;

    public tu3(h7 h7Var, l20 l20Var) {
        this.f = h7Var;
        this.g = l20Var;
    }

    public final void a() {
        if (!this.h) {
            this.h = true;
            h7 h7Var = this.f;
            h7Var.getView().setTag(R.id.wrapped_composition_tag, null);
            gf1 gf1Var = this.i;
            if (gf1Var != null) {
                gf1Var.b(this);
            }
            this.i = null;
            lc0 lc0Var = h7Var.l;
            if (lc0Var != null) {
                lc0Var.g.a();
            }
            h7Var.l = null;
        }
        this.g.m();
    }

    public final void d(rs0 rs0Var) {
        this.f.setOnReadyForComposition(new ik3(4, this, (d00) rs0Var));
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        if (ef1Var == ef1.ON_DESTROY) {
            a();
        } else {
            if (ef1Var != ef1.ON_CREATE || this.h) {
                return;
            }
            d(this.j);
        }
    }
}
