package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ae3 extends gq1 {
    public final mf3 a;

    public ae3(mf3 mf3Var) {
        this.a = mf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ae3) {
            return this.a == ((ae3) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new ce3(this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((ce3) aq1Var).v = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
