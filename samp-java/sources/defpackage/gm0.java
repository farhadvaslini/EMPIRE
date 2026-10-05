package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class gm0 extends gq1 {
    public final tb0 a;
    public final float b;

    public gm0(tb0 tb0Var, float f) {
        this.a = tb0Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        return this.a == gm0Var.a && this.b == gm0Var.b;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        hm0 hm0Var = new hm0();
        hm0Var.t = this.a;
        hm0Var.u = this.b;
        return hm0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        hm0 hm0Var = (hm0) aq1Var;
        hm0Var.t = this.a;
        hm0Var.u = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
