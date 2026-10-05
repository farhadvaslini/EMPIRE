package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gt1 {
    public final int a;
    public final String b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public gt1(int i, String str, float f, float f2, float f3, float f4, int i2, int i3, int i4, int i5, int i6, int i7) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gt1)) {
            return false;
        }
        gt1 gt1Var = (gt1) obj;
        return this.a == gt1Var.a && s51.n(this.b, gt1Var.b) && Float.compare(this.c, gt1Var.c) == 0 && Float.compare(this.d, gt1Var.d) == 0 && Float.compare(this.e, gt1Var.e) == 0 && Float.compare(this.f, gt1Var.f) == 0 && this.g == gt1Var.g && this.h == gt1Var.h && this.i == gt1Var.i && this.j == gt1Var.j && this.k == gt1Var.k && this.l == gt1Var.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + nc2.b(this.k, nc2.b(this.j, nc2.b(this.i, nc2.b(this.h, nc2.b(this.g, nc2.a(nc2.a(nc2.a(nc2.a(by1.a(Integer.hashCode(this.a) * 31, 31, this.b), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeTextDraw(id=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", x=");
        nc2.v(sb, this.c, ", y=", this.d, ", letterWidth=");
        nc2.v(sb, this.e, ", letterHeight=", this.f, ", letterColor=");
        sb.append(this.g);
        sb.append(", backgroundColor=");
        sb.append(this.h);
        sb.append(", shadow=");
        sb.append(this.i);
        sb.append(", outline=");
        sb.append(this.j);
        sb.append(", style=");
        sb.append(this.k);
        sb.append(", alignment=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
