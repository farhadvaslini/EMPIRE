package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class qo extends gq1 {
    public final so a;

    public qo(so soVar) {
        this.a = soVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qo) {
            return s51.n(this.a, ((qo) obj).a);
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        to toVar = new to();
        toVar.t = this.a;
        return toVar;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        to toVar = (to) aq1Var;
        so soVar = toVar.t;
        if (soVar != null) {
            soVar.a.j(toVar);
        }
        so soVar2 = this.a;
        if (soVar2 != null) {
            soVar2.a.b(toVar);
        }
        toVar.t = soVar2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
