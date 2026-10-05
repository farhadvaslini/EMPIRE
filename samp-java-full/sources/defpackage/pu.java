package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pu extends gq1 implements ru2 {
    public final ns0 a;

    public pu(ns0 ns0Var) {
        this.a = ns0Var;
    }

    @Override // defpackage.ru2
    public final qu2 e() {
        qu2 qu2Var = new qu2();
        qu2Var.h = false;
        qu2Var.i = true;
        this.a.h(qu2Var);
        return qu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pu) {
            return this.a == ((pu) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new t40(false, true, this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((t40) aq1Var).v = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
