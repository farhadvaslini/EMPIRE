package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 extends ja0 implements m20, ey1 {
    public zo A;
    public boolean B;
    public w8 C;
    public ps2 D;
    public ia0 E;
    public x8 F;
    public w8 G;
    public boolean H;
    public qs2 v;
    public t02 w;
    public boolean x;
    public rm0 y;
    public qr1 z;

    @Override // defpackage.ia0
    public final void Z0() {
        boolean zT1 = t1();
        if (this.H != zT1) {
            this.H = zT1;
            qs2 qs2Var = this.v;
            t02 t02Var = this.w;
            boolean z = this.B;
            w8 w8Var = z ? this.G : this.C;
            u1(w8Var, this.A, this.y, this.z, t02Var, qs2Var, z, this.x);
        }
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.aq1
    public final void h1() {
        this.H = t1();
        s1();
        if (this.D == null) {
            qs2 qs2Var = this.v;
            w8 w8Var = this.B ? this.G : this.C;
            ps2 ps2Var = new ps2(w8Var, this.A, this.y, this.z, this.w, qs2Var, this.x, this.H);
            p1(ps2Var);
            this.D = ps2Var;
        }
    }

    @Override // defpackage.aq1
    public final void i1() {
        ia0 ia0Var = this.E;
        if (ia0Var != null) {
            q1(ia0Var);
        }
    }

    @Override // defpackage.ey1
    public final void k0() {
        x8 x8Var = (x8) ur.z(this, m12.a);
        if (s51.n(x8Var, this.F)) {
            return;
        }
        this.F = x8Var;
        this.G = null;
        ia0 ia0Var = this.E;
        if (ia0Var != null) {
            q1(ia0Var);
        }
        this.E = null;
        s1();
        ps2 ps2Var = this.D;
        if (ps2Var != null) {
            qs2 qs2Var = this.v;
            t02 t02Var = this.w;
            w8 w8Var = this.B ? this.G : this.C;
            ps2Var.K1(w8Var, this.A, this.y, this.z, t02Var, qs2Var, this.x, this.H);
        }
    }

    public final void s1() {
        ia0 ia0Var = this.E;
        if (ia0Var != null) {
            if (((aq1) ia0Var).f.s) {
                return;
            }
            p1(ia0Var);
            return;
        }
        if (this.B) {
            gq.M(this, new it1(15, this));
        }
        w8 w8Var = this.B ? this.G : this.C;
        if (w8Var != null) {
            ja0 ja0Var = w8Var.i;
            if (ja0Var.f.s) {
                return;
            }
            p1(ja0Var);
            this.E = ja0Var;
        }
    }

    public final boolean t1() {
        return (this.s ? vr.X(this).F : bb1.f) != bb1.g || this.w == t02.f;
    }

    public final void u1(w8 w8Var, zo zoVar, rm0 rm0Var, qr1 qr1Var, t02 t02Var, qs2 qs2Var, boolean z, boolean z2) {
        boolean z3;
        this.v = qs2Var;
        this.w = t02Var;
        boolean z4 = true;
        if (this.B != z) {
            this.B = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (s51.n(this.C, w8Var)) {
            z4 = false;
        } else {
            this.C = w8Var;
        }
        if (z3 || (z4 && !z)) {
            ia0 ia0Var = this.E;
            if (ia0Var != null) {
                q1(ia0Var);
            }
            this.E = null;
            s1();
        }
        this.x = z2;
        this.y = rm0Var;
        this.z = qr1Var;
        this.A = zoVar;
        boolean zT1 = t1();
        this.H = zT1;
        ps2 ps2Var = this.D;
        if (ps2Var != null) {
            ps2Var.K1(this.B ? this.G : this.C, zoVar, rm0Var, qr1Var, t02Var, qs2Var, z2, zT1);
        }
    }
}
