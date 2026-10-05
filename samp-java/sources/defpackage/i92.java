package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class i92 implements k92 {
    public final f92 a;
    public final String b;

    public i92(f92 f92Var) {
        this.a = f92Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i92)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        return this.a == i92Var.a && s51.n(this.b, i92Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Running(phase=" + this.a + ", pluginId=" + this.b + ")";
    }

    public i92(f92 f92Var, String str) {
        this.a = f92Var;
        this.b = str;
    }
}
