package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class og3 {
    public final af a;
    public final gh3 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final ua0 g;
    public final bb1 h;
    public final zp0 i;
    public final long j;

    public og3(af afVar, gh3 gh3Var, List list, int i, boolean z, int i2, ua0 ua0Var, bb1 bb1Var, zp0 zp0Var, long j) {
        this.a = afVar;
        this.b = gh3Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = ua0Var;
        this.h = bb1Var;
        this.i = zp0Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3)) {
            return false;
        }
        og3 og3Var = (og3) obj;
        return s51.n(this.a, og3Var.a) && s51.n(this.b, og3Var.b) && s51.n(this.c, og3Var.c) && this.d == og3Var.d && this.e == og3Var.e && this.f == og3Var.f && s51.n(this.g, og3Var.g) && this.h == og3Var.h && s51.n(this.i, og3Var.i) && m30.c(this.j, og3Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + nc2.b(this.f, by1.b((((this.c.hashCode() + by1.c(this.b, this.a.hashCode() * 31, 31)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        int i = this.f;
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid") + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + m30.l(this.j) + ")";
    }
}
