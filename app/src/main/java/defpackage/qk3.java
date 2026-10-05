package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class qk3 extends gq1 {
    public final mi3 a;
    public final qr1 b;
    public final o11 c;
    public final boolean d;
    public final no2 e;
    public final cs0 f;

    public qk3(mi3 mi3Var, qr1 qr1Var, o11 o11Var, boolean z, no2 no2Var, cs0 cs0Var) {
        this.a = mi3Var;
        this.b = qr1Var;
        this.c = o11Var;
        this.d = z;
        this.e = no2Var;
        this.f = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qk3.class != obj.getClass()) {
            return false;
        }
        qk3 qk3Var = (qk3) obj;
        return this.a == qk3Var.a && s51.n(this.b, qk3Var.b) && s51.n(this.c, qk3Var.c) && this.d == qk3Var.d && this.e.equals(qk3Var.e) && this.f == qk3Var.f;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        rk3 rk3Var = new rk3(this.b, this.c, false, this.d, null, this.e, this.f);
        rk3Var.R = this.a;
        return rk3Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        rk3 rk3Var = (rk3) aq1Var;
        mi3 mi3Var = rk3Var.R;
        mi3 mi3Var2 = this.a;
        if (mi3Var != mi3Var2) {
            rk3Var.R = mi3Var2;
            y02.w(rk3Var);
        }
        rk3Var.F1(this.b, this.c, false, this.d, null, this.e, this.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qr1 qr1Var = this.b;
        int iHashCode2 = (iHashCode + (qr1Var != null ? qr1Var.hashCode() : 0)) * 31;
        o11 o11Var = this.c;
        return this.f.hashCode() + nc2.b(this.e.a, by1.b(by1.b((iHashCode2 + (o11Var != null ? o11Var.hashCode() : 0)) * 31, 31, false), 31, this.d), 31);
    }
}
