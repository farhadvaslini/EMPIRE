package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class l52 {
    public final String a;
    public final int b;
    public final String c;
    public final xy2 d;
    public final String e;

    public l52(String str, int i, String str2, xy2 xy2Var, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = xy2Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l52)) {
            return false;
        }
        l52 l52Var = (l52) obj;
        return this.a.equals(l52Var.a) && this.b == l52Var.b && this.c.equals(l52Var.c) && this.d == l52Var.d && this.e.equals(l52Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + by1.a(nc2.b(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstance(host=");
        sb.append(this.a);
        sb.append(", port=");
        sb.append(this.b);
        sb.append(", nickname=");
        sb.append(this.c);
        sb.append(", textEncoding=");
        sb.append(this.d);
        sb.append(", password=");
        return nc2.j(sb, this.e, ")");
    }
}
