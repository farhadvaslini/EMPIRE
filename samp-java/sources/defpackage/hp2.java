package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hp2 {
    public final boolean a;
    public final sv2 b;
    public final Map c;

    public hp2(boolean z, sv2 sv2Var, Map map) {
        map.getClass();
        this.a = z;
        this.b = sv2Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp2)) {
            return false;
        }
        hp2 hp2Var = (hp2) obj;
        return this.a == hp2Var.a && s51.n(this.b, hp2Var.b) && s51.n(this.c, hp2Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        sv2 sv2Var = this.b;
        return this.c.hashCode() + ((iHashCode + (sv2Var == null ? 0 : sv2Var.hashCode())) * 31);
    }

    public final String toString() {
        return "RulesDialogUiState(visible=" + this.a + ", address=" + this.b + ", rules=" + this.c + ")";
    }

    public /* synthetic */ hp2() {
        this(false, null, oi0.f);
    }
}
