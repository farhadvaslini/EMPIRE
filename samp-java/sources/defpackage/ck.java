package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ck {
    public final int a;

    public /* synthetic */ ck(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck) {
            return this.a == ((ck) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return by1.h("AutoClearFocusBehavior(value=", ")", this.a);
    }
}
