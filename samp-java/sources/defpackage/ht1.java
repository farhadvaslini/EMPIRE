package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ht1 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final boolean f;

    public ht1(String str, float f, float f2, float f3, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht1)) {
            return false;
        }
        ht1 ht1Var = (ht1) obj;
        return s51.n(this.a, ht1Var.a) && Float.compare(this.b, ht1Var.b) == 0 && Float.compare(this.c, ht1Var.c) == 0 && Float.compare(this.d, ht1Var.d) == 0 && this.e == ht1Var.e && this.f == ht1Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + nc2.b(this.e, nc2.a(nc2.a(nc2.a(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NativeTextDrawRun(text=");
        sb.append(this.a);
        sb.append(", x=");
        sb.append(this.b);
        sb.append(", y=");
        nc2.v(sb, this.c, ", right=", this.d, ", color=");
        sb.append(this.e);
        sb.append(", androidGlyph=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
