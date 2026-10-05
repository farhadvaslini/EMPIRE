package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b11 {
    public static final b11 g = new b11(false, 0, true, 1, 1, qj1.h);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final qj1 f;

    public b11(boolean z, int i, boolean z2, int i2, int i3, qj1 qj1Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = qj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b11)) {
            return false;
        }
        b11 b11Var = (b11) obj;
        return this.a == b11Var.a && this.b == b11Var.b && this.c == b11Var.c && this.d == b11Var.d && this.e == b11Var.e && s51.n(this.f, b11Var.f);
    }

    public final int hashCode() {
        return this.f.f.hashCode() + nc2.b(this.e, nc2.b(this.d, by1.b(nc2.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        int i = this.b;
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + (i == -1 ? "Unspecified" : i == 0 ? "None" : i == 1 ? "Characters" : i == 2 ? "Words" : i == 3 ? "Sentences" : "Invalid") + ", autoCorrect=" + this.c + ", keyboardType=" + p71.a(this.d) + ", imeAction=" + a11.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
