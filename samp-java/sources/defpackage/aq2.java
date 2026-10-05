package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class aq2 {
    public final boolean a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public aq2(boolean z, int i, int i2, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq2)) {
            return false;
        }
        aq2 aq2Var = (aq2) obj;
        return this.a == aq2Var.a && this.b == aq2Var.b && this.c == aq2Var.c && s51.n(this.d, aq2Var.d) && s51.n(this.e, aq2Var.e) && s51.n(this.f, aq2Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + by1.a(by1.a(nc2.b(this.c, nc2.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "SampServerInfo(passworded=" + this.a + ", players=" + this.b + ", maxPlayers=" + this.c + ", hostname=" + this.d + ", gamemode=" + this.e + ", language=" + this.f + ")";
    }
}
