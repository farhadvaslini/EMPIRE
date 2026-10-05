package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class mt1 {
    public final String a;
    public final int b;
    public final boolean c;

    public mt1(String str, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt1)) {
            return false;
        }
        mt1 mt1Var = (mt1) obj;
        return s51.n(this.a, mt1Var.a) && this.b == mt1Var.b && this.c == mt1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nc2.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TextCharacter(value=" + this.a + ", color=" + this.b + ", androidGlyph=" + this.c + ")";
    }
}
