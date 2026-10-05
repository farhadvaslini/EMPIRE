package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class i51 extends gq1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i51 ? (i51) obj : null) != null;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        j51 j51Var = new j51(0);
        j51Var.u = m51.f;
        j51Var.v = true;
        return j51Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        j51 j51Var = (j51) aq1Var;
        j51Var.u = m51.f;
        j51Var.v = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (m51.f.hashCode() * 31);
    }
}
