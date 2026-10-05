package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w72 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final r72 f;
    public final String g;
    public final String h;

    public w72(String str, String str2, String str3, String str4, String str5, r72 r72Var, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = r72Var;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w72)) {
            return false;
        }
        w72 w72Var = (w72) obj;
        return s51.n(this.a, w72Var.a) && s51.n(this.b, w72Var.b) && s51.n(this.c, w72Var.c) && this.d.equals(w72Var.d) && s51.n(this.e, w72Var.e) && s51.n(this.f, w72Var.f) && s51.n(this.g, w72Var.g) && s51.n(this.h, w72Var.h);
    }

    public final int hashCode() {
        int iA = by1.a(by1.a(by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        r72 r72Var = this.f;
        return this.h.hashCode() + by1.a((iA + (r72Var == null ? 0 : r72Var.a.hashCode())) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("PluginCatalogEntry(id=", this.a, ", name=", this.b, ", version=");
        nc2.w(sbN, this.c, ", apiVersion=", this.d, ", description=");
        sbN.append(this.e);
        sbN.append(", author=");
        sbN.append(this.f);
        sbN.append(", packageUrl=");
        sbN.append(this.g);
        sbN.append(", sha256=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
