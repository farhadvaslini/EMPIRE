package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nb2 {
    public final int a;

    public /* synthetic */ nb2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nb2) {
            return this.a == ((nb2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return by1.h("PointerKeyboardModifiers(packedValue=", ")", this.a);
    }
}
