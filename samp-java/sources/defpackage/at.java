package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class at {
    public final String a;

    public at(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at) && this.a.equals(((at) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(-1) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nc2.i("ChatLineEntry(text=", this.a, ", color=-1)");
    }
}
