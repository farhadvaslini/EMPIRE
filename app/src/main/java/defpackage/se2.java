package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class se2 extends gq1 {
    public final boolean a;
    public final cs0 b;
    public final af2 c;
    public final float d;

    public se2(boolean z, cs0 cs0Var, af2 af2Var, float f) {
        this.a = z;
        this.b = cs0Var;
        this.c = af2Var;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se2)) {
            return false;
        }
        se2 se2Var = (se2) obj;
        return this.a == se2Var.a && this.b == se2Var.b && s51.n(this.c, se2Var.c) && jd0.b(this.d, se2Var.d);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new ze2(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ze2 ze2Var = (ze2) aq1Var;
        ze2Var.w = this.b;
        ze2Var.x = true;
        ze2Var.y = this.c;
        ze2Var.z = this.d;
        boolean z = ze2Var.v;
        boolean z2 = this.a;
        if (z != z2) {
            ze2Var.v = z2;
            cl3.t(ze2Var.d1(), null, new we2(ze2Var, null, 2), 3);
        }
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + by1.b(Boolean.hashCode(this.a) * 31, 31, true)) * 31)) * 31);
    }
}
