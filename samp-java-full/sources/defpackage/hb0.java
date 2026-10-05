package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class hb0 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;

    public hb0(int i, int i2, String str, String str2, String str3, String str4) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = jCurrentTimeMillis;
    }

    public final boolean a() {
        int i = this.b;
        return i == 2 || i == 4 || i == 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb0)) {
            return false;
        }
        hb0 hb0Var = (hb0) obj;
        return this.a == hb0Var.a && this.b == hb0Var.b && s51.n(this.c, hb0Var.c) && s51.n(this.d, hb0Var.d) && s51.n(this.e, hb0Var.e) && s51.n(this.f, hb0Var.f) && this.g == hb0Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + by1.a(by1.a(by1.a(by1.a(nc2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbL = nc2.l("DialogData(id=", this.a, ", style=", this.b, ", title=");
        nc2.w(sbL, this.c, ", message=", this.d, ", button1=");
        nc2.w(sbL, this.e, ", button2=", this.f, ", receivedAt=");
        sbL.append(this.g);
        sbL.append(")");
        return sbL.toString();
    }
}
