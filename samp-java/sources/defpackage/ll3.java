package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ll3 {
    public final zb3 a;
    public final xq0 b;
    public final int c;
    public final int d;
    public final Object e;

    public ll3(zb3 zb3Var, xq0 xq0Var, int i, int i2, Object obj) {
        this.a = zb3Var;
        this.b = xq0Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll3)) {
            return false;
        }
        ll3 ll3Var = (ll3) obj;
        return s51.n(this.a, ll3Var.a) && s51.n(this.b, ll3Var.b) && this.c == ll3Var.c && this.d == ll3Var.d && s51.n(this.e, ll3Var.e);
    }

    public final int hashCode() {
        zb3 zb3Var = this.a;
        int iB = nc2.b(this.d, nc2.b(this.c, (((zb3Var == null ? 0 : zb3Var.hashCode()) * 31) + this.b.f) * 31, 31), 31);
        Object obj = this.e;
        return iB + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str = "Invalid";
        int i = this.c;
        String str2 = i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid";
        int i2 = this.d;
        if (i2 == 0) {
            str = "None";
        } else if (i2 == 1) {
            str = "Weight";
        } else if (i2 == 2) {
            str = "Style";
        } else if (i2 == 65535) {
            str = "All";
        }
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        nc2.w(sb, str2, ", fontSynthesis=", str, ", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
