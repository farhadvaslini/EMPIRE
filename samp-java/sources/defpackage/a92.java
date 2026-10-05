package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class a92 implements d92 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public a92(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, String str4) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str4;
    }

    @Override // defpackage.d92
    public final boolean a() {
        return this.f;
    }

    @Override // defpackage.d92
    public final String b() {
        return this.d;
    }

    @Override // defpackage.d92
    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a92)) {
            return false;
        }
        a92 a92Var = (a92) obj;
        return this.a.equals(a92Var.a) && this.b.equals(a92Var.b) && this.c == a92Var.c && this.d.equals(a92Var.d) && this.e == a92Var.e && this.f == a92Var.f && this.g == a92Var.g && this.h.equals(a92Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + by1.b(by1.b(by1.b(by1.a(by1.b(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Switch(id=", this.a, ", title=", this.b, ", value=");
        sbN.append(this.c);
        sbN.append(", description=");
        sbN.append(this.d);
        sbN.append(", enabled=");
        by1.k(sbN, this.e, ", visible=", this.f, ", readOnly=");
        sbN.append(this.g);
        sbN.append(", error=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
