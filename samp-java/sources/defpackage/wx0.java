package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class wx0 extends gq1 {
    public final gh3 a;
    public final int b;
    public final int c;

    public wx0(gh3 gh3Var, int i, int i2) {
        this.a = gh3Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx0)) {
            return false;
        }
        wx0 wx0Var = (wx0) obj;
        return s51.n(this.a, wx0Var.a) && this.b == wx0Var.b && this.c == wx0Var.c;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        yx0 yx0Var = new yx0();
        yx0Var.t = this.a;
        yx0Var.u = this.b;
        yx0Var.v = this.c;
        yx0Var.x = -1;
        yx0Var.y = -1;
        return yx0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        yx0 yx0Var = (yx0) aq1Var;
        gh3 gh3Var = yx0Var.t;
        gh3 gh3Var2 = this.a;
        boolean zN = s51.n(gh3Var, gh3Var2);
        int i = this.b;
        int i2 = this.c;
        if (zN && yx0Var.u == i && yx0Var.v == i2) {
            return;
        }
        yx0Var.t = gh3Var2;
        yx0Var.u = i;
        yx0Var.v = i2;
        yx0Var.z = n32.y(gh3Var2, vr.X(yx0Var).F);
        yx0Var.w = true;
        lq.J(yx0Var);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }
}
