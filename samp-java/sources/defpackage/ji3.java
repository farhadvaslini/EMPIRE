package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
final class ji3 extends gq1 {
    public final boolean a;
    public final qr1 b;
    public final boolean c;
    public final no2 d;
    public final ns0 e;

    public ji3(boolean z, qr1 qr1Var, boolean z2, no2 no2Var, ns0 ns0Var) {
        this.a = z;
        this.b = qr1Var;
        this.c = z2;
        this.d = no2Var;
        this.e = ns0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ji3.class != obj.getClass()) {
            return false;
        }
        ji3 ji3Var = (ji3) obj;
        return this.a == ji3Var.a && s51.n(this.b, ji3Var.b) && this.c == ji3Var.c && this.d.equals(ji3Var.d) && this.e == ji3Var.e;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new li3(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        li3 li3Var = (li3) aq1Var;
        boolean z = li3Var.R;
        boolean z2 = this.a;
        if (z != z2) {
            li3Var.R = z2;
            y02.w(li3Var);
        }
        li3Var.S = this.e;
        li3Var.F1(this.b, null, false, this.c, null, this.d, li3Var.T);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        qr1 qr1Var = this.b;
        return this.e.hashCode() + nc2.b(this.d.a, by1.b(by1.b((iHashCode + (qr1Var != null ? qr1Var.hashCode() : 0)) * 961, 31, false), 31, this.c), 31);
    }
}
