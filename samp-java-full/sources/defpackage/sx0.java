package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sx0 {
    public static final kq d;
    public static final kq e;
    public static final kq f;
    public static final kq g;
    public static final kq h;
    public static final kq i;
    public final kq a;
    public final kq b;
    public final int c;

    static {
        kq kqVar = kq.i;
        d = zj.e(":");
        e = zj.e(":status");
        f = zj.e(":method");
        g = zj.e(":path");
        h = zj.e(":scheme");
        i = zj.e(":authority");
    }

    public sx0(kq kqVar, kq kqVar2) {
        kqVar.getClass();
        kqVar2.getClass();
        this.a = kqVar;
        this.b = kqVar2;
        this.c = kqVar2.b() + kqVar.b() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx0)) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return s51.n(this.a, sx0Var.a) && s51.n(this.b, sx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.l() + ": " + this.b.l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sx0(String str, String str2) {
        this(zj.e(str), zj.e(str2));
        kq kqVar = kq.i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sx0(kq kqVar, String str) {
        this(kqVar, zj.e(str));
        kqVar.getClass();
        str.getClass();
        kq kqVar2 = kq.i;
    }
}
