package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o71 {
    public static final o71 c = new o71(0, 0, 127);
    public final int a;
    public final int b;

    public o71(int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o71)) {
            return false;
        }
        o71 o71Var = (o71) obj;
        return this.a == o71Var.a && this.b == o71Var.b;
    }

    public final int hashCode() {
        return nc2.b(this.b, nc2.b(this.a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        String strA = p71.a(this.a);
        return nc2.j(nc2.n("KeyboardOptions(capitalization=", "Unspecified", ", autoCorrectEnabled=null, keyboardType=", strA, ", imeAction="), a11.a(this.b), ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)");
    }
}
