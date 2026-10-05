package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class jp0 extends gq1 {
    public final ip0 a;

    public jp0(ip0 ip0Var) {
        this.a = ip0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp0) && s51.n(this.a, ((jp0) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        lp0 lp0Var = new lp0();
        lp0Var.t = this.a;
        return lp0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        lp0 lp0Var = (lp0) aq1Var;
        lp0Var.t.a.j(lp0Var);
        ip0 ip0Var = this.a;
        lp0Var.t = ip0Var;
        ip0Var.a.b(lp0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ")";
    }
}
