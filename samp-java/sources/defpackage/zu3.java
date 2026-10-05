package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class zu3 extends gq1 {
    public final float a;
    public final Object b;

    public zu3(float f, Object obj) {
        this.a = f;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zu3)) {
            return false;
        }
        zu3 zu3Var = (zu3) obj;
        return zu3Var.a == this.a && s51.n(zu3Var.b, this.b);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        av3 av3Var = new av3();
        av3Var.t = this.a;
        av3Var.u = this.b;
        return av3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        av3 av3Var = (av3) aq1Var;
        av3Var.t = this.a;
        av3Var.u = this.b;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }
}
