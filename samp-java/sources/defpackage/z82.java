package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z82 implements d92 {
    public final String a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;

    public z82(String str, String str2, float f, float f2, float f3, float f4, String str3, boolean z, boolean z2, boolean z3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = str3;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = str4;
    }

    @Override // defpackage.d92
    public final boolean a() {
        return this.i;
    }

    @Override // defpackage.d92
    public final String b() {
        return this.g;
    }

    @Override // defpackage.d92
    public final String c() {
        return this.k;
    }

    public final boolean d() {
        return this.h;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z82)) {
            return false;
        }
        z82 z82Var = (z82) obj;
        return this.a.equals(z82Var.a) && this.b.equals(z82Var.b) && Float.compare(this.c, z82Var.c) == 0 && Float.compare(this.d, z82Var.d) == 0 && Float.compare(this.e, z82Var.e) == 0 && Float.compare(this.f, z82Var.f) == 0 && this.g.equals(z82Var.g) && this.h == z82Var.h && this.i == z82Var.i && this.j == z82Var.j && this.k.equals(z82Var.k);
    }

    public final boolean f() {
        return this.j;
    }

    public final float g() {
        return this.f;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.k.hashCode() + by1.b(by1.b(by1.b(by1.a(nc2.a(nc2.a(nc2.a(nc2.a(by1.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("Slider(id=", this.a, ", title=", this.b, ", value=");
        nc2.v(sbN, this.c, ", min=", this.d, ", max=");
        nc2.v(sbN, this.e, ", step=", this.f, ", description=");
        sbN.append(this.g);
        sbN.append(", enabled=");
        sbN.append(this.h);
        sbN.append(", visible=");
        by1.k(sbN, this.i, ", readOnly=", this.j, ", error=");
        return nc2.j(sbN, this.k, ")");
    }
}
