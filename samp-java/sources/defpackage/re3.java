package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class re3 {
    public final int a;
    public final String b;
    public final int c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final float j;
    public final float k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;

    public re3(int i, String str, int i2, long j, long j2, long j3, boolean z, boolean z2, boolean z3, float f, float f2, int i3, float f3, float f4, float f5, float f6, int i4, int i5) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = f;
        this.k = f2;
        this.l = i3;
        this.m = f3;
        this.n = f4;
        this.o = f5;
        this.p = f6;
        this.q = i4;
        this.r = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re3)) {
            return false;
        }
        re3 re3Var = (re3) obj;
        return this.a == re3Var.a && this.b.equals(re3Var.b) && this.c == re3Var.c && wx.c(this.d, re3Var.d) && wx.c(this.e, re3Var.e) && wx.c(this.f, re3Var.f) && this.g == re3Var.g && this.h == re3Var.h && this.i == re3Var.i && Float.compare(this.j, re3Var.j) == 0 && Float.compare(this.k, re3Var.k) == 0 && this.l == re3Var.l && Float.compare(this.m, re3Var.m) == 0 && Float.compare(this.n, re3Var.n) == 0 && Float.compare(this.o, re3Var.o) == 0 && Float.compare(this.p, re3Var.p) == 0 && this.q == re3Var.q && this.r == re3Var.r;
    }

    public final int hashCode() {
        int iB = nc2.b(this.c, by1.a(Integer.hashCode(this.a) * 31, 31, this.b), 31);
        int i = wx.h;
        return Integer.hashCode(this.r) + nc2.b(this.q, nc2.a(nc2.a(nc2.a(nc2.a(nc2.b(this.l, nc2.a(nc2.a(by1.b(by1.b(by1.b(nc2.c(this.f, nc2.c(this.e, nc2.c(this.d, iB, 31), 31), 31), 31, this.g), 31, this.h), 31, this.i), this.j, 31), this.k, 31), 31), this.m, 31), this.n, 31), this.o, 31), this.p, 31), 31);
    }

    public final String toString() {
        String strI = wx.i(this.d);
        String strI2 = wx.i(this.e);
        String strI3 = wx.i(this.f);
        StringBuilder sb = new StringBuilder("TextDrawData(id=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", style=");
        sb.append(this.c);
        sb.append(", letterColor=");
        sb.append(strI);
        sb.append(", boxColor=");
        nc2.w(sb, strI2, ", backgroundColor=", strI3, ", boxEnabled=");
        by1.k(sb, this.g, ", selectable=", this.h, ", isSelectMode=");
        sb.append(this.i);
        sb.append(", positionX=");
        sb.append(this.j);
        sb.append(", positionY=");
        sb.append(this.k);
        sb.append(", modelId=");
        sb.append(this.l);
        sb.append(", letterWidth=");
        nc2.v(sb, this.m, ", letterHeight=", this.n, ", lineWidth=");
        nc2.v(sb, this.o, ", lineHeight=", this.p, ", shadow=");
        sb.append(this.q);
        sb.append(", outline=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
