package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class g4 {
    public final boolean a;
    public final String b;
    public final String c;
    public final h4 d;

    public /* synthetic */ g4(int i) {
        this((i & 1) == 0, "", "", null);
    }

    public static g4 a(g4 g4Var, String str, String str2, h4 h4Var, int i) {
        boolean z = g4Var.a;
        if ((i & 2) != 0) {
            str = g4Var.b;
        }
        if ((i & 4) != 0) {
            str2 = g4Var.c;
        }
        g4Var.getClass();
        str.getClass();
        str2.getClass();
        return new g4(z, str, str2, h4Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return this.a == g4Var.a && s51.n(this.b, g4Var.b) && s51.n(this.c, g4Var.c) && this.d == g4Var.d;
    }

    public final int hashCode() {
        int iA = by1.a(by1.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        h4 h4Var = this.d;
        return iA + (h4Var == null ? 0 : h4Var.hashCode());
    }

    public final String toString() {
        return "AddServerDialogUiState(visible=" + this.a + ", host=" + this.b + ", port=" + this.c + ", error=" + this.d + ")";
    }

    public g4(boolean z, String str, String str2, h4 h4Var) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = h4Var;
    }
}
