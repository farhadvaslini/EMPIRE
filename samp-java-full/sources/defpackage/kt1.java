package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kt1 {
    public final String a;
    public final float b;
    public final float c;

    public kt1(String str, float f, float f2) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt1)) {
            return false;
        }
        kt1 kt1Var = (kt1) obj;
        return s51.n(this.a, kt1Var.a) && Float.compare(this.b, kt1Var.b) == 0 && Float.compare(this.c, kt1Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nc2.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "LayoutKey(text=" + this.a + ", letterWidth=" + this.b + ", letterHeight=" + this.c + ")";
    }
}
