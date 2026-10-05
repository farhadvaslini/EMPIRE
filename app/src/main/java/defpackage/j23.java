package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j23 extends gq1 {
    public final o23 a;

    public j23(o23 o23Var) {
        this.a = o23Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j23) && this.a == ((j23) obj).a;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new i23(this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        i23 i23Var = (i23) aq1Var;
        o23 o23Var = i23Var.x;
        o23 o23Var2 = this.a;
        if (o23Var2 != o23Var) {
            o23Var.f.setValue(Boolean.FALSE);
            i23Var.x = o23Var2;
            o23Var2.f.setValue(Boolean.valueOf(i23Var.s));
            if (i23Var.s) {
                i23Var.t1();
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.a + ")";
    }
}
