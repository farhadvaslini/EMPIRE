package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vy0 implements ib1 {
    public final lf3 a;
    public final int b;
    public final xj3 c;
    public final cs0 d;

    public vy0(lf3 lf3Var, int i, xj3 xj3Var, cs0 cs0Var) {
        this.a = lf3Var;
        this.b = i;
        this.c = xj3Var;
        this.d = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vy0) {
            vy0 vy0Var = (vy0) obj;
            if (this.a == vy0Var.a && this.b == vy0Var.b && this.c.equals(vy0Var.c) && s51.n(this.d, vy0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + nc2.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    @Override // defpackage.ib1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        long j2;
        if (xm1Var.u0(m30.h(j)) < m30.i(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = m30.b(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        i62 i62VarT = xm1Var.t(j);
        int iMin = Math.min(i62VarT.f, m30.i(j2));
        return en1Var.I0(iMin, i62VarT.g, oi0.f, new b5(this, en1Var, i62VarT, iMin));
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
