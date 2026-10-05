package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wk2 extends n32 {
    public final n32 b;
    public final int c;

    public wk2(n32 n32Var, int i) {
        this.b = n32Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wk2)) {
            return false;
        }
        wk2 wk2Var = (wk2) obj;
        return wk2Var.b.equals(this.b) && wk2Var.c == this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.c * 31);
    }
}
