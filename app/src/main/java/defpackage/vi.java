package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vi extends gq1 implements ru2 {
    public final boolean a;
    public final ns0 b;

    public vi(ns0 ns0Var, boolean z) {
        this.a = z;
        this.b = ns0Var;
    }

    @Override // defpackage.ru2
    public final qu2 e() {
        qu2 qu2Var = new qu2();
        qu2Var.h = this.a;
        this.b.h(qu2Var);
        return qu2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi)) {
            return false;
        }
        vi viVar = (vi) obj;
        return this.a == viVar.a && this.b == viVar.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new t40(this.a, false, this.b);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        t40 t40Var = (t40) aq1Var;
        t40Var.t = this.a;
        t40Var.v = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
