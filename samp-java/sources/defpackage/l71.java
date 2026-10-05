package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l71 {
    public final String a;
    public final int b;

    public l71(int i, String str) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l71)) {
            return false;
        }
        l71 l71Var = (l71) obj;
        return this.a.equals(l71Var.a) && this.b == l71Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "KeyTriggerDef(label=" + this.a + ", bitIndex=" + this.b + ")";
    }
}
