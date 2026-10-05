package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hd2 {
    public final int a;

    public hd2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hd2) {
            return this.a == ((hd2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
