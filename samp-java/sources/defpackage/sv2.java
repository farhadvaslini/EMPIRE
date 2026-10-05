package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sv2 {
    public final String a;
    public final int b;
    public final String c;

    public sv2(int i, String str) {
        this.a = str;
        this.b = i;
        this.c = str + ":" + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv2)) {
            return false;
        }
        sv2 sv2Var = (sv2) obj;
        return this.a.equals(sv2Var.a) && this.b == sv2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ServerAddress(host=" + this.a + ", port=" + this.b + ")";
    }
}
