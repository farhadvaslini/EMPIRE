package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w82 implements d92 {
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

    public w82(String str, String str2, float f, float f2, float f3, float f4, String str3, boolean z, boolean z2, boolean z3, String str4) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w82)) {
            return false;
        }
        w82 w82Var = (w82) obj;
        return this.a.equals(w82Var.a) && this.b.equals(w82Var.b) && Float.compare(this.c, w82Var.c) == 0 && Float.compare(this.d, w82Var.d) == 0 && Float.compare(this.e, w82Var.e) == 0 && Float.compare(this.f, w82Var.f) == 0 && this.g.equals(w82Var.g) && this.h == w82Var.h && this.i == w82Var.i && this.j == w82Var.j && this.k.equals(w82Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + by1.b(by1.b(by1.b(by1.a(nc2.a(nc2.a(nc2.a(nc2.a(by1.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = nc2.n("NumberInput(id=", this.a, ", title=", this.b, ", value=");
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
