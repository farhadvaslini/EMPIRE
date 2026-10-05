package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zp3 implements ib1 {
    public final lf3 a;
    public final int b;
    public final xj3 c;
    public final cs0 d;

    public zp3(lf3 lf3Var, int i, xj3 xj3Var, cs0 cs0Var) {
        this.a = lf3Var;
        this.b = i;
        this.c = xj3Var;
        this.d = cs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zp3) {
            zp3 zp3Var = (zp3) obj;
            if (this.a == zp3Var.a && this.b == zp3Var.b && this.c.equals(zp3Var.c) && s51.n(this.d, zp3Var.d)) {
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
        i62 i62VarT = xm1Var.t(m30.b(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(i62VarT.g, m30.h(j));
        return en1Var.I0(i62VarT.f, iMin, oi0.f, new wj2(this, i62VarT, iMin));
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ")";
    }
}
