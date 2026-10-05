package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class j4 extends gq1 {
    public final nh2 a;

    public j4(nh2 nh2Var) {
        this.a = nh2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j4) {
            return this.a == ((j4) obj).a;
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        k4 k4Var = new k4();
        k4Var.v = this.a;
        s sVar = new s(2, k4Var);
        i4 i4Var = new i4();
        i4Var.t = sVar;
        k4Var.p1(i4Var);
        return k4Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((k4) aq1Var).v = this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
