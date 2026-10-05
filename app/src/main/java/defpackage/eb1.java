package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class eb1 extends gq1 {
    public final Object a;

    public eb1(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb1) && this.a.equals(((eb1) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        fb1 fb1Var = new fb1();
        fb1Var.t = this.a;
        return fb1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((fb1) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.a + ")";
    }
}
