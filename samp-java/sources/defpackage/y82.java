package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class y82 implements d92 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public y82(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str4;
    }

    @Override // defpackage.d92
    public final boolean a() {
        return this.e;
    }

    @Override // defpackage.d92
    public final String b() {
        return this.c;
    }

    @Override // defpackage.d92
    public final String c() {
        return this.g;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y82)) {
            return false;
        }
        y82 y82Var = (y82) obj;
        return this.a.equals(y82Var.a) && this.b.equals(y82Var.b) && this.c.equals(y82Var.c) && this.d == y82Var.d && this.e == y82Var.e && this.f == y82Var.f && this.g.equals(y82Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + by1.b(by1.b(by1.b(by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Section(id=", this.a, ", title=", this.b, ", description=");
        sbN.append(this.c);
        sbN.append(", enabled=");
        sbN.append(this.d);
        sbN.append(", visible=");
        by1.k(sbN, this.e, ", readOnly=", this.f, ", error=");
        return nc2.j(sbN, this.g, ")");
    }
}
