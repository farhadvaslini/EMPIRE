package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class e6 extends n32 {
    public final int b;

    public e6(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e6) && ((e6) obj).b == this.b;
    }

    public final int hashCode() {
        return this.b * 31;
    }
}
