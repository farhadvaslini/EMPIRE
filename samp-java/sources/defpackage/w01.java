package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class w01 {
    public static int k;
    public static final h01 l = new h01(2);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final uo3 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public w01(String str, float f, float f2, float f3, float f4, uo3 uo3Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = uo3Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w01)) {
            return false;
        }
        w01 w01Var = (w01) obj;
        return s51.n(this.a, w01Var.a) && jd0.b(this.b, w01Var.b) && jd0.b(this.c, w01Var.c) && this.d == w01Var.d && this.e == w01Var.e && this.f.equals(w01Var.f) && wx.c(this.g, w01Var.g) && this.h == w01Var.h && this.i == w01Var.i;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + nc2.a(nc2.a(nc2.a(nc2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31;
        int i = wx.h;
        return Boolean.hashCode(this.i) + nc2.b(this.h, nc2.c(this.g, iHashCode, 31), 31);
    }
}
