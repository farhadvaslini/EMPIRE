package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hl2 implements mf1 {
    public final /* synthetic */ ef1 f;
    public final /* synthetic */ qk2 g;
    public final /* synthetic */ x50 h;
    public final /* synthetic */ ef1 i;
    public final /* synthetic */ jr j;
    public final /* synthetic */ dt1 k;
    public final /* synthetic */ l l;

    public hl2(ef1 ef1Var, qk2 qk2Var, x50 x50Var, ef1 ef1Var2, jr jrVar, dt1 dt1Var, l lVar) {
        this.f = ef1Var;
        this.g = qk2Var;
        this.h = x50Var;
        this.i = ef1Var2;
        this.j = jrVar;
        this.k = dt1Var;
        this.l = lVar;
    }

    @Override // defpackage.mf1
    public final void i(of1 of1Var, ef1 ef1Var) {
        ef1 ef1Var2 = this.f;
        qk2 qk2Var = this.g;
        if (ef1Var == ef1Var2) {
            qk2Var.f = cl3.t(this.h, null, new n9(this.k, this.l, (p40) null, 13), 3);
            return;
        }
        if (ef1Var == this.i) {
            j61 j61Var = (j61) qk2Var.f;
            if (j61Var != null) {
                j61Var.c(null);
            }
            qk2Var.f = null;
        }
        if (ef1Var == ef1.ON_DESTROY) {
            this.j.t(dm3.a);
        }
    }
}
