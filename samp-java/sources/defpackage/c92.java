package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class c92 implements d92 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public c92(String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2, boolean z3, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str6;
    }

    @Override // defpackage.d92
    public final boolean a() {
        return this.h;
    }

    @Override // defpackage.d92
    public final String b() {
        return this.f;
    }

    @Override // defpackage.d92
    public final String c() {
        return this.j;
    }

    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c92)) {
            return false;
        }
        c92 c92Var = (c92) obj;
        return this.a.equals(c92Var.a) && this.b.equals(c92Var.b) && this.c.equals(c92Var.c) && this.d.equals(c92Var.d) && this.e == c92Var.e && this.f.equals(c92Var.f) && this.g == c92Var.g && this.h == c92Var.h && this.i == c92Var.i && this.j.equals(c92Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + by1.b(by1.b(by1.b(by1.a(nc2.b(this.e, by1.a(by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("TextInput(id=", this.a, ", title=", this.b, ", value=");
        nc2.w(sbN, this.c, ", placeholder=", this.d, ", maxLength=");
        sbN.append(this.e);
        sbN.append(", description=");
        sbN.append(this.f);
        sbN.append(", enabled=");
        by1.k(sbN, this.g, ", visible=", this.h, ", readOnly=");
        sbN.append(this.i);
        sbN.append(", error=");
        sbN.append(this.j);
        sbN.append(")");
        return sbN.toString();
    }
}
