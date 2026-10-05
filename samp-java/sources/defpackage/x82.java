package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x82 implements d92 {
    public final String a;
    public final String b;
    public final float c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public x82(String str, String str2, float f, boolean z, String str3, boolean z2, boolean z3, boolean z4, String str4) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = str4;
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
        return this.d;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x82)) {
            return false;
        }
        x82 x82Var = (x82) obj;
        return this.a.equals(x82Var.a) && this.b.equals(x82Var.b) && Float.compare(this.c, x82Var.c) == 0 && this.d == x82Var.d && this.e.equals(x82Var.e) && this.f == x82Var.f && this.g == x82Var.g && this.h == x82Var.h && this.i.equals(x82Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + by1.b(by1.b(by1.b(by1.a(by1.b(nc2.a(by1.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Progress(id=", this.a, ", title=", this.b, ", value=");
        sbN.append(this.c);
        sbN.append(", indeterminate=");
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
