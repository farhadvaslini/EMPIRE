package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class le3 extends gq1 {
    public final ar2 a;
    public final r70 b;
    public final nf3 c;
    public final b50 d;

    public le3(ar2 ar2Var, r70 r70Var, nf3 nf3Var, b50 b50Var) {
        this.a = ar2Var;
        this.b = r70Var;
        this.c = nf3Var;
        this.d = b50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le3)) {
            return false;
        }
        le3 le3Var = (le3) obj;
        return this.a == le3Var.a && this.b == le3Var.b && this.c == le3Var.c && this.d == le3Var.d;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new me3(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        me3 me3Var = (me3) aq1Var;
        me3Var.v.g = null;
        ar2 ar2Var = this.a;
        me3Var.v = ar2Var;
        ar2Var.g = me3Var;
        ar2Var.h = me3Var.s ? yi3.h : yi3.g;
        me3Var.w = this.b;
        me3Var.x = this.c;
        me3Var.y = this.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
