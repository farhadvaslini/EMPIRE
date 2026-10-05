package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class eh3 {
    public final String a;
    public String b;
    public boolean c = false;
    public w32 d = null;

    public eh3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh3)) {
            return false;
        }
        eh3 eh3Var = (eh3) obj;
        return s51.n(this.a, eh3Var.a) && s51.n(this.b, eh3Var.b) && this.c == eh3Var.c && s51.n(this.d, eh3Var.d);
    }

    public final int hashCode() {
        int iB = by1.b(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        w32 w32Var = this.d;
        return iB + (w32Var == null ? 0 : w32Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
