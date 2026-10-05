package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class x32 implements we {
    public final int a;
    public final int b;
    public final long c;
    public final fg3 d;
    public final w62 e;
    public final eg1 f;
    public final int g;
    public final int h;
    public final wg3 i;

    public x32(int i, int i2, long j, fg3 fg3Var, w62 w62Var, eg1 eg1Var, int i3, int i4, wg3 wg3Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = fg3Var;
        this.e = w62Var;
        this.f = eg1Var;
        this.g = i3;
        this.h = i4;
        this.i = wg3Var;
        if (jh3.a(j, jh3.c) || jh3.c(j) >= 0.0f) {
            return;
        }
        n21.b("lineHeight can't be negative (" + jh3.c(j) + ")");
    }

    public final x32 a(x32 x32Var) {
        return x32Var == null ? this : y32.a(this, x32Var.a, x32Var.b, x32Var.c, x32Var.d, x32Var.e, x32Var.f, x32Var.g, x32Var.h, x32Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x32)) {
            return false;
        }
        x32 x32Var = (x32) obj;
        return this.a == x32Var.a && this.b == x32Var.b && jh3.a(this.c, x32Var.c) && s51.n(this.d, x32Var.d) && s51.n(this.e, x32Var.e) && s51.n(this.f, x32Var.f) && this.g == x32Var.g && this.h == x32Var.h && s51.n(this.i, x32Var.i);
    }

    public final int hashCode() {
        int iB = nc2.b(this.b, Integer.hashCode(this.a) * 31, 31);
        kh3[] kh3VarArr = jh3.b;
        int iC = nc2.c(this.c, iB, 31);
        fg3 fg3Var = this.d;
        int iHashCode = (iC + (fg3Var != null ? fg3Var.hashCode() : 0)) * 31;
        w62 w62Var = this.e;
        int iHashCode2 = (iHashCode + (w62Var != null ? w62Var.hashCode() : 0)) * 31;
        eg1 eg1Var = this.f;
        int iB2 = nc2.b(this.h, nc2.b(this.g, (iHashCode2 + (eg1Var != null ? eg1Var.hashCode() : 0)) * 31, 31), 31);
        wg3 wg3Var = this.i;
        return iB2 + (wg3Var != null ? wg3Var.hashCode() : 0);
    }

    public final String toString() {
        String strA = ld3.a(this.a);
        String strA2 = pe3.a(this.b);
        String strD = jh3.d(this.c);
        String strA3 = zf1.a(this.g);
        String strA4 = l01.a(this.h);
        StringBuilder sbN = nc2.n("ParagraphStyle(textAlign=", strA, ", textDirection=", strA2, ", lineHeight=");
        sbN.append(strD);
        sbN.append(", textIndent=");
        sbN.append(this.d);
        sbN.append(", platformStyle=");
        sbN.append(this.e);
        sbN.append(", lineHeightStyle=");
        sbN.append(this.f);
        sbN.append(", lineBreak=");
        nc2.w(sbN, strA3, ", hyphens=", strA4, ", textMotion=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }
}
