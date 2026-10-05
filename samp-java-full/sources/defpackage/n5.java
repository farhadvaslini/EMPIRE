package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n5 implements mo1 {
    public final tm a;
    public final tm b;
    public final int c;

    public n5(tm tmVar, tm tmVar2, int i) {
        this.a = tmVar;
        this.b = tmVar2;
        this.c = i;
    }

    @Override // defpackage.mo1
    public final int a(m41 m41Var, long j, int i, bb1 bb1Var) {
        int iA = this.b.a(0, m41Var.d(), bb1Var);
        int i2 = -this.a.a(0, i, bb1Var);
        bb1 bb1Var2 = bb1.f;
        int i3 = this.c;
        if (bb1Var != bb1Var2) {
            i3 = -i3;
        }
        return m41Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return this.a.equals(n5Var.a) && this.b.equals(n5Var.b) && this.c == n5Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + nc2.a(Float.hashCode(this.a.a) * 31, this.b.a, 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=" + this.c + ')';
    }
}
