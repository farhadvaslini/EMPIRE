package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class wt2 extends gq1 {
    public final boolean a;
    public final qr1 b;
    public final o11 c;
    public final boolean d;
    public final no2 e;
    public final cs0 f;

    public wt2(boolean z, qr1 qr1Var, o11 o11Var, boolean z2, no2 no2Var, cs0 cs0Var) {
        this.a = z;
        this.b = qr1Var;
        this.c = o11Var;
        this.d = z2;
        this.e = no2Var;
        this.f = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wt2.class != obj.getClass()) {
            return false;
        }
        wt2 wt2Var = (wt2) obj;
        return this.a == wt2Var.a && s51.n(this.b, wt2Var.b) && s51.n(this.c, wt2Var.c) && this.d == wt2Var.d && s51.n(this.e, wt2Var.e) && this.f == wt2Var.f;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        yt2 yt2Var = new yt2(this.b, this.c, false, this.d, null, this.e, this.f);
        yt2Var.R = this.a;
        return yt2Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        yt2 yt2Var = (yt2) aq1Var;
        boolean z = yt2Var.R;
        boolean z2 = this.a;
        if (z != z2) {
            yt2Var.R = z2;
            y02.w(yt2Var);
        }
        yt2Var.F1(this.b, this.c, false, this.d, null, this.e, this.f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        qr1 qr1Var = this.b;
        int iHashCode2 = (iHashCode + (qr1Var != null ? qr1Var.hashCode() : 0)) * 31;
        o11 o11Var = this.c;
        int iB = by1.b(by1.b((iHashCode2 + (o11Var != null ? o11Var.hashCode() : 0)) * 31, 31, false), 31, this.d);
        no2 no2Var = this.e;
        return this.f.hashCode() + ((iB + (no2Var != null ? Integer.hashCode(no2Var.a) : 0)) * 31);
    }
}
