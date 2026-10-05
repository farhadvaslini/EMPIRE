package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class n71 {
    public static final n71 c = new n71(null, null, 63);
    public final ns0 a;
    public final ns0 b;

    public n71(ns0 ns0Var, ns0 ns0Var2, int i) {
        ns0Var = (i & 16) != 0 ? null : ns0Var;
        ns0Var2 = (i & 32) != 0 ? null : ns0Var2;
        this.a = ns0Var;
        this.b = ns0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n71)) {
            return false;
        }
        n71 n71Var = (n71) obj;
        return this.a == n71Var.a && this.b == n71Var.b;
    }

    public final int hashCode() {
        ns0 ns0Var = this.a;
        int iHashCode = (ns0Var != null ? ns0Var.hashCode() : 0) * 31;
        ns0 ns0Var2 = this.b;
        return iHashCode + (ns0Var2 != null ? ns0Var2.hashCode() : 0);
    }
}
