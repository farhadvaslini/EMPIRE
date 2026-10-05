package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y72 {
    public final ai1 a;
    public final String b;

    public y72(ai1 ai1Var, String str) {
        this.a = ai1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y72)) {
            return false;
        }
        y72 y72Var = (y72) obj;
        return this.a.equals(y72Var.a) && this.b.equals(y72Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PluginCatalogResponse(entries=" + this.a + ", json=" + this.b + ")";
    }
}
