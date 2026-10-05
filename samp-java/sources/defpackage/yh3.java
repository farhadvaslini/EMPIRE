package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class yh3 extends gq1 {
    public final t41 a;
    public final boolean b;
    public final s83 c;

    public yh3(t41 t41Var, boolean z, s83 s83Var) {
        this.a = t41Var;
        this.b = z;
        this.c = s83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh3)) {
            return false;
        }
        yh3 yh3Var = (yh3) obj;
        return s51.n(this.a, yh3Var.a) && this.b == yh3Var.b && this.c.equals(yh3Var.c);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        ai3 ai3Var = new ai3();
        ai3Var.t = this.a;
        ai3Var.u = this.b;
        ai3Var.v = this.c;
        ai3Var.z = Float.NaN;
        ai3Var.A = Float.NaN;
        return ai3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ai3 ai3Var = (ai3) aq1Var;
        ai3Var.t = this.a;
        boolean z = ai3Var.u;
        boolean z2 = this.b;
        if (z != z2) {
            lq.J(ai3Var);
        }
        ai3Var.u = z2;
        ai3Var.v = this.c;
        if (ai3Var.y == null && !Float.isNaN(ai3Var.A)) {
            ai3Var.y = gv3.a(ai3Var.A, 0.01f);
        }
        if (ai3Var.x != null || Float.isNaN(ai3Var.z)) {
            return;
        }
        ai3Var.x = gv3.a(ai3Var.z, 0.01f);
    }

    public final int hashCode() {
        return this.c.hashCode() + by1.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.a + ", checked=" + this.b + ", animationSpec=" + this.c + ')';
    }
}
