package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kn extends gq1 {
    public final float a;
    public final w73 b;
    public final z13 c;

    public kn(float f, w73 w73Var, z13 z13Var) {
        this.a = f;
        this.b = w73Var;
        this.c = z13Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return jd0.b(this.a, knVar.a) && this.b.equals(knVar.b) && s51.n(this.c, knVar.c);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        return new jn(this.a, this.b, this.c);
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        jn jnVar = (jn) aq1Var;
        float f = jnVar.w;
        nq nqVar = jnVar.z;
        float f2 = this.a;
        if (!jd0.b(f, f2)) {
            jnVar.w = f2;
            nqVar.p1();
        }
        w73 w73Var = jnVar.x;
        w73 w73Var2 = this.b;
        if (!s51.n(w73Var, w73Var2)) {
            jnVar.x = w73Var2;
            nqVar.p1();
        }
        z13 z13Var = jnVar.y;
        z13 z13Var2 = this.c;
        if (s51.n(z13Var, z13Var2)) {
            return;
        }
        jnVar.y = z13Var2;
        nqVar.p1();
        y02.w(jnVar);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + jd0.c(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }
}
