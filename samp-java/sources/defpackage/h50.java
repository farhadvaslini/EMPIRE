package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h50 extends gq1 {
    public final xj3 a;
    public final bg3 b;
    public final ye1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final iy1 g;
    public final sf3 h;
    public final b11 i;
    public final ip0 j;

    public h50(xj3 xj3Var, bg3 bg3Var, ye1 ye1Var, boolean z, boolean z2, boolean z3, iy1 iy1Var, sf3 sf3Var, b11 b11Var, ip0 ip0Var) {
        this.a = xj3Var;
        this.b = bg3Var;
        this.c = ye1Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = iy1Var;
        this.h = sf3Var;
        this.i = b11Var;
        this.j = ip0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h50) {
            h50 h50Var = (h50) obj;
            if (this.a.equals(h50Var.a) && this.b.equals(h50Var.b) && this.c == h50Var.c && this.d == h50Var.d && this.e == h50Var.e && this.f == h50Var.f && this.g.equals(h50Var.g) && this.h == h50Var.h && s51.n(this.i, h50Var.i) && s51.n(this.j, h50Var.j)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        k50 k50Var = new k50();
        k50Var.v = this.a;
        k50Var.w = this.b;
        k50Var.x = this.c;
        k50Var.y = this.d;
        k50Var.z = this.e;
        k50Var.A = this.f;
        k50Var.B = this.g;
        sf3 sf3Var = this.h;
        k50Var.C = sf3Var;
        k50Var.D = this.i;
        k50Var.E = this.j;
        sf3Var.g = new i50(k50Var, 4);
        return k50Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        k50 k50Var = (k50) aq1Var;
        boolean z = k50Var.z;
        int i = 0;
        boolean z2 = z && !k50Var.y;
        boolean z3 = k50Var.A;
        b11 b11Var = k50Var.D;
        sf3 sf3Var = k50Var.C;
        boolean z4 = this.d;
        boolean z5 = this.e;
        boolean z6 = z5 && !z4;
        k50Var.v = this.a;
        bg3 bg3Var = this.b;
        k50Var.w = bg3Var;
        k50Var.x = this.c;
        k50Var.y = z4;
        k50Var.z = z5;
        k50Var.B = this.g;
        sf3 sf3Var2 = this.h;
        k50Var.C = sf3Var2;
        b11 b11Var2 = this.i;
        k50Var.D = b11Var2;
        k50Var.E = this.j;
        if (z5 != z || z6 != z2 || !s51.n(b11Var2, b11Var) || this.f != z3 || !yg3.c(bg3Var.b)) {
            y02.w(k50Var);
        }
        if (sf3Var2 != sf3Var) {
            sf3Var2.g = new i50(k50Var, i);
        }
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + by1.b(by1.b(by1.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoreTextFieldSemanticsModifier(transformedText=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", state=");
        sb.append(this.c);
        sb.append(", readOnly=");
        sb.append(this.d);
        sb.append(", enabled=");
        by1.k(sb, this.e, ", isPassword=", this.f, ", offsetMapping=");
        sb.append(this.g);
        sb.append(", manager=");
        sb.append(this.h);
        sb.append(", imeOptions=");
        sb.append(this.i);
        sb.append(", focusRequester=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
