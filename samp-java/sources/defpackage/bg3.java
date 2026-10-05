package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bg3 {
    public final af a;
    public final long b;
    public final yg3 c;

    public bg3(af afVar, long j, yg3 yg3Var) {
        yg3 yg3Var2;
        this.a = afVar;
        this.b = d32.i(afVar.g.length(), j);
        if (yg3Var != null) {
            yg3Var2 = new yg3(d32.i(afVar.g.length(), yg3Var.a));
        } else {
            yg3Var2 = null;
        }
        this.c = yg3Var2;
    }

    public static bg3 a(bg3 bg3Var, af afVar, long j, int i) {
        if ((i & 1) != 0) {
            afVar = bg3Var.a;
        }
        if ((i & 2) != 0) {
            j = bg3Var.b;
        }
        yg3 yg3Var = (i & 4) != 0 ? bg3Var.c : null;
        bg3Var.getClass();
        return new bg3(afVar, j, yg3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg3)) {
            return false;
        }
        bg3 bg3Var = (bg3) obj;
        return yg3.b(this.b, bg3Var.b) && s51.n(this.c, bg3Var.c) && s51.n(this.a, bg3Var.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = yg3.c;
        int iC = nc2.c(this.b, iHashCode, 31);
        yg3 yg3Var = this.c;
        return iC + (yg3Var != null ? Long.hashCode(yg3Var.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + yg3.h(this.b) + ", composition=" + this.c + ")";
    }

    public bg3(String str, long j, int i) {
        this(new af((i & 1) != 0 ? "" : str), (i & 2) != 0 ? yg3.b : j, (yg3) null);
    }
}
