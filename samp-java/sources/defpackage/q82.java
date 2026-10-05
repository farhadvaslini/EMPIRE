package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class q82 implements d92 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public q82(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str5;
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

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q82)) {
            return false;
        }
        q82 q82Var = (q82) obj;
        return this.a.equals(q82Var.a) && this.b.equals(q82Var.b) && this.c.equals(q82Var.c) && this.d.equals(q82Var.d) && this.e == q82Var.e && this.f == q82Var.f && this.g == q82Var.g && this.h.equals(q82Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + by1.b(by1.b(by1.b(by1.a(by1.a(by1.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("ConfirmButton(id=", this.a, ", title=", this.b, ", confirmation=");
        nc2.w(sbN, this.c, ", description=", this.d, ", enabled=");
        by1.k(sbN, this.e, ", visible=", this.f, ", readOnly=");
        sbN.append(this.g);
        sbN.append(", error=");
        sbN.append(this.h);
        sbN.append(")");
        return sbN.toString();
    }
}
