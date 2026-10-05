package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class te1 extends aq1 implements m20, dw0 {
    public o9 t;
    public ye1 u;
    public sf3 v;
    public final d42 w = b32.w(null);

    public te1(o9 o9Var, ye1 ye1Var, sf3 sf3Var) {
        this.t = o9Var;
        this.u = ye1Var;
        this.v = sf3Var;
    }

    @Override // defpackage.dw0
    public final void O(ex1 ex1Var) {
        this.w.setValue(ex1Var);
    }

    @Override // defpackage.aq1
    public final void h1() {
        o9 o9Var = this.t;
        if (o9Var.a != null) {
            p21.c("Expected textInputModifierNode to be null");
        }
        o9Var.a = this;
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.t.k(this);
    }
}
