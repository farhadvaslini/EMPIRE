package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class bu2 {
    public final au2 a;
    public final au2 b;
    public final boolean c;

    public bu2(au2 au2Var, au2 au2Var2, boolean z) {
        this.a = au2Var;
        this.b = au2Var2;
        this.c = z;
    }

    public static bu2 a(bu2 bu2Var, au2 au2Var, au2 au2Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            au2Var = bu2Var.a;
        }
        if ((i & 2) != 0) {
            au2Var2 = bu2Var.b;
        }
        bu2Var.getClass();
        return new bu2(au2Var, au2Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2)) {
            return false;
        }
        bu2 bu2Var = (bu2) obj;
        return s51.n(this.a, bu2Var.a) && s51.n(this.b, bu2Var.b) && this.c == bu2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}
