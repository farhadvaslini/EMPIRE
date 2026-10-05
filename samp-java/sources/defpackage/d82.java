package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class d82 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public d82(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d82)) {
            return false;
        }
        d82 d82Var = (d82) obj;
        return s51.n(this.a, d82Var.a) && s51.n(this.b, d82Var.b) && s51.n(this.c, d82Var.c) && this.d.equals(d82Var.d) && s51.n(this.e, d82Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + by1.a(by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("PluginControlChange(pluginId=", this.a, ", pageId=", this.b, ", controlId=");
        nc2.w(sbN, this.c, ", valueType=", this.d, ", value=");
        return nc2.j(sbN, this.e, ")");
    }
}
