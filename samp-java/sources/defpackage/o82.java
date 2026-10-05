package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class o82 implements d92 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public o82(String str, String str2, String str3, String str4, String str5, List list, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str5;
    }

    @Override // defpackage.d92
    public final boolean a() {
        return this.g;
    }

    @Override // defpackage.d92
    public final String b() {
        return this.e;
    }

    @Override // defpackage.d92
    public final String c() {
        return this.i;
    }

    public final boolean d() {
        return this.f;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o82)) {
            return false;
        }
        o82 o82Var = (o82) obj;
        return this.a.equals(o82Var.a) && this.b.equals(o82Var.b) && this.c.equals(o82Var.c) && this.d.equals(o82Var.d) && this.e.equals(o82Var.e) && this.f == o82Var.f && this.g == o82Var.g && this.h == o82Var.h && this.i.equals(o82Var.i);
    }

    public final List f() {
        return this.d;
    }

    public final boolean g() {
        return this.h;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + by1.b(by1.b(by1.b(by1.a((this.d.hashCode() + by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Choice(id=", this.a, ", title=", this.b, ", value=");
        sbN.append(this.c);
        sbN.append(", options=");
        sbN.append(this.d);
        sbN.append(", description=");
        sbN.append(this.e);
        sbN.append(", enabled=");
        sbN.append(this.f);
        sbN.append(", visible=");
        by1.k(sbN, this.g, ", readOnly=", this.h, ", error=");
        return nc2.j(sbN, this.i, ")");
    }
}
