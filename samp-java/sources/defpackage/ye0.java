package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ye0 extends gq1 {
    public static final n20 i = new n20(6);
    public final ef0 a;
    public final t02 b;
    public final boolean c;
    public final qr1 d;
    public final boolean e;
    public final ss0 f;
    public final ss0 g;
    public final boolean h;

    public ye0(ef0 ef0Var, t02 t02Var, boolean z, qr1 qr1Var, boolean z2, af0 af0Var, ss0 ss0Var, boolean z3) {
        this.a = ef0Var;
        this.b = t02Var;
        this.c = z;
        this.d = qr1Var;
        this.e = z2;
        this.f = af0Var;
        this.g = ss0Var;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ye0.class != obj.getClass()) {
            return false;
        }
        ye0 ye0Var = (ye0) obj;
        return s51.n(this.a, ye0Var.a) && this.b == ye0Var.b && this.c == ye0Var.c && s51.n(this.d, ye0Var.d) && this.e == ye0Var.e && s51.n(this.f, ye0Var.f) && s51.n(this.g, ye0Var.g) && this.h == ye0Var.h;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        df0 df0Var = new df0(i, this.c, this.d, this.b);
        df0Var.O = this.a;
        df0Var.P = this.e;
        df0Var.Q = this.f;
        df0Var.R = this.g;
        df0Var.S = this.h;
        return df0Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        boolean z;
        boolean z2;
        df0 df0Var = (df0) aq1Var;
        ef0 ef0Var = df0Var.O;
        ef0 ef0Var2 = this.a;
        if (s51.n(ef0Var, ef0Var2)) {
            z = false;
        } else {
            df0Var.O = ef0Var2;
            z = true;
        }
        boolean z3 = df0Var.S;
        boolean z4 = this.h;
        if (z3 != z4) {
            df0Var.S = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        df0Var.Q = this.f;
        df0Var.R = this.g;
        df0Var.P = this.e;
        df0Var.J1(i, this.c, this.d, this.b, z2);
    }

    public final int hashCode() {
        int iB = by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        qr1 qr1Var = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + by1.b((iB + (qr1Var != null ? qr1Var.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }
}
