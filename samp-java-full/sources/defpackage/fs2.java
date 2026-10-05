package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class fs2 extends gq1 {
    public final qs2 a;
    public final t02 b;
    public final boolean c;
    public final rm0 d;
    public final qr1 e;
    public final zo f;
    public final boolean g;
    public final w8 h;

    public fs2(w8 w8Var, zo zoVar, rm0 rm0Var, qr1 qr1Var, t02 t02Var, qs2 qs2Var, boolean z, boolean z2) {
        this.a = qs2Var;
        this.b = t02Var;
        this.c = z;
        this.d = rm0Var;
        this.e = qr1Var;
        this.f = zoVar;
        this.g = z2;
        this.h = w8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fs2.class != obj.getClass()) {
            return false;
        }
        fs2 fs2Var = (fs2) obj;
        return s51.n(this.a, fs2Var.a) && this.b == fs2Var.b && this.c == fs2Var.c && s51.n(this.d, fs2Var.d) && s51.n(this.e, fs2Var.e) && s51.n(this.f, fs2Var.f) && this.g == fs2Var.g && s51.n(this.h, fs2Var.h);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        gs2 gs2Var = new gs2();
        gs2Var.v = this.a;
        gs2Var.w = this.b;
        gs2Var.x = this.c;
        gs2Var.y = this.d;
        gs2Var.z = this.e;
        gs2Var.A = this.f;
        gs2Var.B = this.g;
        gs2Var.C = this.h;
        return gs2Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        qr1 qr1Var = this.e;
        ((gs2) aq1Var).u1(this.h, this.f, this.d, qr1Var, this.b, this.a, this.g, this.c);
    }

    public final int hashCode() {
        int iB = by1.b(by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, false);
        rm0 rm0Var = this.d;
        int iHashCode = (iB + (rm0Var != null ? rm0Var.hashCode() : 0)) * 31;
        qr1 qr1Var = this.e;
        int iHashCode2 = (iHashCode + (qr1Var != null ? qr1Var.hashCode() : 0)) * 31;
        zo zoVar = this.f;
        int iB2 = by1.b((iHashCode2 + (zoVar != null ? zoVar.hashCode() : 0)) * 31, 31, this.g);
        w8 w8Var = this.h;
        return iB2 + (w8Var != null ? w8Var.hashCode() : 0);
    }
}
