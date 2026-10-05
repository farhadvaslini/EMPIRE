package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class cb1 extends gq1 {
    public final ss0 a;

    public cb1(ss0 ss0Var) {
        this.a = ss0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cb1) {
            return this.a == ((cb1) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        jb1 jb1Var = new jb1();
        jb1Var.t = this.a;
        return jb1Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((jb1) aq1Var).t = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
