package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o72 {
    public final boolean a;
    public final sv2 b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ o72(sv2 sv2Var, List list, boolean z, int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : sv2Var, (i & 4) != 0 ? ni0.f : list, (i & 8) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o72)) {
            return false;
        }
        o72 o72Var = (o72) obj;
        return this.a == o72Var.a && s51.n(this.b, o72Var.b) && s51.n(this.c, o72Var.c) && this.d == o72Var.d && this.e == o72Var.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        sv2 sv2Var = this.b;
        return Boolean.hashCode(this.e) + by1.b((this.c.hashCode() + ((iHashCode + (sv2Var == null ? 0 : sv2Var.hashCode())) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PlayersDialogUiState(visible=" + this.a + ", address=" + this.b + ", players=" + this.c + ", loading=" + this.d + ", error=" + this.e + ")";
    }

    public o72(boolean z, sv2 sv2Var, List list, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = sv2Var;
        this.c = list;
        this.d = z2;
        this.e = z3;
    }
}
