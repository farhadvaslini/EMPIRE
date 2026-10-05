package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fd0 implements hd0 {
    public final String a;
    public final bm2 b;

    public fd0(String str, bm2 bm2Var) {
        this.a = str;
        this.b = bm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) obj;
        return this.a.equals(fd0Var.a) && s51.n(this.b, fd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        bm2 bm2Var = this.b;
        return iHashCode + (bm2Var == null ? 0 : bm2Var.hashCode());
    }

    public final String toString() {
        return "Failed(message=" + this.a + ", source=" + this.b + ")";
    }
}
