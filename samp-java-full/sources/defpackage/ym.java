package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class ym extends gq1 {
    public final ns0 a;

    public ym(ns0 ns0Var) {
        this.a = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ym) {
            return this.a == ((ym) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new zm(this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ex1 ex1Var;
        zm zmVar = (zm) aq1Var;
        ns0 ns0Var = this.a;
        zmVar.t = ns0Var;
        if (zmVar.f.s && (ex1Var = vr.U(zmVar, 2).C) != null) {
            ex1Var.W1(ns0Var, true);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
