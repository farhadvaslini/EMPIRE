package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class yf3 extends gq1 {
    public final gh3 a;

    public yf3(gh3 gh3Var) {
        this.a = gh3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf3)) {
            return false;
        }
        return s51.n(this.a, ((yf3) obj).a);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new zf3(this.a);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        zf3 zf3Var = (zf3) aq1Var;
        zf3Var.getClass();
        gh3 gh3VarY = n32.y(this.a, vr.X(zf3Var).F);
        zf3Var.p1(gh3VarY, (zp0) ur.z(zf3Var, s20.k));
        d23 d23Var = zf3Var.v;
        if (d23Var == null) {
            throw nc2.y("Min size state is not set.");
        }
        d23.a(d23Var, null, null, gh3VarY, 23);
        lq.J(zf3Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
