package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rt extends gq1 {
    public final fi1 a;

    public rt(fi1 fi1Var) {
        this.a = fi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rt) {
            return this.a == ((rt) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        qt qtVar = new qt();
        qtVar.t = this.a;
        return qtVar;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        qt qtVar = (qt) aq1Var;
        qtVar.t = this.a;
        y02.w(qtVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
