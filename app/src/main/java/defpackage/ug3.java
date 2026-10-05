package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ug3 {
    public final h83 a;
    public final h83 b;
    public final h83 c;
    public final h83 d;

    public ug3(h83 h83Var, h83 h83Var2, h83 h83Var3, h83 h83Var4) {
        this.a = h83Var;
        this.b = h83Var2;
        this.c = h83Var3;
        this.d = h83Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ug3)) {
            return false;
        }
        ug3 ug3Var = (ug3) obj;
        return s51.n(this.a, ug3Var.a) && s51.n(this.b, ug3Var.b) && s51.n(this.c, ug3Var.c) && s51.n(this.d, ug3Var.d);
    }

    public final int hashCode() {
        h83 h83Var = this.a;
        int iHashCode = (h83Var != null ? h83Var.hashCode() : 0) * 31;
        h83 h83Var2 = this.b;
        int iHashCode2 = (iHashCode + (h83Var2 != null ? h83Var2.hashCode() : 0)) * 31;
        h83 h83Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (h83Var3 != null ? h83Var3.hashCode() : 0)) * 31;
        h83 h83Var4 = this.d;
        return iHashCode3 + (h83Var4 != null ? h83Var4.hashCode() : 0);
    }
}
