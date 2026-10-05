package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ao extends gq1 {
    public final vm a;
    public final boolean b;

    public ao(vm vmVar, boolean z) {
        this.a = vmVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ao aoVar = obj instanceof ao ? (ao) obj : null;
        return aoVar != null && this.a.equals(aoVar.a) && this.b == aoVar.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        bo boVar = new bo();
        boVar.t = this.a;
        boVar.u = this.b;
        return boVar;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        bo boVar = (bo) aq1Var;
        boVar.t = this.a;
        boVar.u = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
