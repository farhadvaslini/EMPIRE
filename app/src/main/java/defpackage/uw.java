package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class uw extends gq1 {
    public final qr1 a;
    public final o11 b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final no2 f;
    public final cs0 g;

    public uw(qr1 qr1Var, o11 o11Var, boolean z, boolean z2, String str, no2 no2Var, cs0 cs0Var) {
        this.a = qr1Var;
        this.b = o11Var;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.f = no2Var;
        this.g = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uw.class != obj.getClass()) {
            return false;
        }
        uw uwVar = (uw) obj;
        return s51.n(this.a, uwVar.a) && s51.n(this.b, uwVar.b) && this.c == uwVar.c && this.d == uwVar.d && s51.n(this.e, uwVar.e) && s51.n(this.f, uwVar.f) && this.g == uwVar.g;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new xw(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ((xw) aq1Var).F1(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final int hashCode() {
        qr1 qr1Var = this.a;
        int iHashCode = (qr1Var != null ? qr1Var.hashCode() : 0) * 31;
        o11 o11Var = this.b;
        int iB = by1.b(by1.b((iHashCode + (o11Var != null ? o11Var.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iB + (str != null ? str.hashCode() : 0)) * 31;
        no2 no2Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (no2Var != null ? Integer.hashCode(no2Var.a) : 0)) * 31);
    }
}
