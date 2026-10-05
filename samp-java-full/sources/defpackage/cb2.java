package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cb2 extends gq1 {
    public final na a;

    public cb2(na naVar) {
        this.a = naVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb2) && this.a.equals(((cb2) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new db2(this.a, null);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        db2 db2Var = (db2) aq1Var;
        na naVar = db2Var.u;
        na naVar2 = this.a;
        if (s51.n(naVar, naVar2)) {
            return;
        }
        db2Var.u = naVar2;
        if (db2Var.v) {
            db2Var.r1();
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.a + ", overrideDescendants=false)";
    }
}
