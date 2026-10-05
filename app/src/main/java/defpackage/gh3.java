package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gh3 {
    public static final gh3 d = new gh3(0, 0, null, 0, 0, 0, 0, 16777215);
    public final h83 a;
    public final x32 b;
    public final k72 c;

    public gh3(long j, long j2, xq0 xq0Var, long j3, long j4, int i, long j5, int i2) {
        this(new h83((i2 & 1) != 0 ? wx.g : j, (i2 & 2) != 0 ? jh3.c : j2, (i2 & 4) != 0 ? null : xq0Var, (vq0) null, (wq0) null, (zb3) null, (String) null, (i2 & 128) != 0 ? jh3.c : j3, (nl) null, (eg3) null, (qj1) null, (i2 & 2048) != 0 ? wx.g : j4, (ne3) null, (r13) null, (f72) null), new x32((32768 & i2) != 0 ? 0 : i, 0, (i2 & 131072) != 0 ? jh3.c : j5, null, null, null, 0, 0, null), null);
    }

    public static gh3 a(gh3 gh3Var, long j, long j2, xq0 xq0Var, zb3 zb3Var, long j3, long j4, eg1 eg1Var, int i) {
        r13 r13Var;
        long j5;
        k72 k72Var = rn.h0;
        long jA = (i & 1) != 0 ? gh3Var.a.a.a() : j;
        long j6 = (i & 2) != 0 ? gh3Var.a.b : j2;
        xq0 xq0Var2 = (i & 4) != 0 ? gh3Var.a.c : xq0Var;
        h83 h83Var = gh3Var.a;
        vq0 vq0Var = h83Var.d;
        wq0 wq0Var = h83Var.e;
        zb3 zb3Var2 = (i & 32) != 0 ? h83Var.f : zb3Var;
        String str = h83Var.g;
        long j7 = (i & 128) != 0 ? h83Var.h : j3;
        nl nlVar = h83Var.i;
        eg3 eg3Var = h83Var.j;
        qj1 qj1Var = h83Var.k;
        long j8 = h83Var.l;
        ne3 ne3Var = h83Var.m;
        r13 r13Var2 = h83Var.n;
        rf0 rf0Var = h83Var.p;
        int i2 = (i & 32768) != 0 ? gh3Var.b.a : 3;
        int i3 = (i & 65536) != 0 ? gh3Var.b.b : 1;
        if ((i & 131072) != 0) {
            r13Var = r13Var2;
            j5 = gh3Var.b.c;
        } else {
            r13Var = r13Var2;
            j5 = j4;
        }
        x32 x32Var = gh3Var.b;
        fg3 fg3Var = x32Var.d;
        k72 k72Var2 = (i & 524288) != 0 ? gh3Var.c : k72Var;
        return new gh3(new h83(wx.c(jA, h83Var.a.a()) ? h83Var.a : jA != 16 ? new my(jA) : cg3.a, j6, xq0Var2, vq0Var, wq0Var, zb3Var2, str, j7, nlVar, eg3Var, qj1Var, j8, ne3Var, r13Var, k72Var2 != null ? k72Var2.a : null, rf0Var), new x32(i2, i3, j5, fg3Var, k72Var2 != null ? k72Var2.b : null, (i & 1048576) != 0 ? x32Var.f : eg1Var, x32Var.g, x32Var.h, x32Var.i), k72Var2);
    }

    public static gh3 e(gh3 gh3Var, long j, long j2, xq0 xq0Var, zb3 zb3Var, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 2) != 0 ? jh3.c : j2;
        xq0 xq0Var2 = (i2 & 4) != 0 ? null : xq0Var;
        zb3 zb3Var2 = (i2 & 32) != 0 ? null : zb3Var;
        long j6 = (i2 & 128) != 0 ? jh3.c : j3;
        long j7 = wx.g;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        long j8 = (i2 & 131072) != 0 ? jh3.c : j4;
        h83 h83VarA = i83.a(gh3Var.a, j, null, Float.NaN, j5, xq0Var2, null, null, zb3Var2, null, j6, null, null, null, j7, null, null, null, null);
        x32 x32VarA = y32.a(gh3Var.b, i3, 0, j8, null, null, null, 0, 0, null);
        return (gh3Var.a == h83VarA && gh3Var.b == x32VarA) ? gh3Var : new gh3(h83VarA, x32VarA);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(gh3 gh3Var) {
        if (this != gh3Var) {
            return s51.n(this.b, gh3Var.b) && this.a.a(gh3Var.a);
        }
        return true;
    }

    public final gh3 d(gh3 gh3Var) {
        return (gh3Var == null || gh3Var.equals(d)) ? this : new gh3(this.a.c(gh3Var.a), this.b.a(gh3Var.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh3)) {
            return false;
        }
        gh3 gh3Var = (gh3) obj;
        return s51.n(this.a, gh3Var.a) && s51.n(this.b, gh3Var.b) && s51.n(this.c, gh3Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k72 k72Var = this.c;
        return iHashCode + (k72Var != null ? k72Var.hashCode() : 0);
    }

    public final String toString() {
        String strI = wx.i(b());
        h83 h83Var = this.a;
        dp dpVarB = h83Var.a.b();
        float fT = h83Var.a.t();
        String strD = jh3.d(h83Var.b);
        xq0 xq0Var = h83Var.c;
        vq0 vq0Var = h83Var.d;
        wq0 wq0Var = h83Var.e;
        zb3 zb3Var = h83Var.f;
        String str = h83Var.g;
        String strD2 = jh3.d(h83Var.h);
        nl nlVar = h83Var.i;
        eg3 eg3Var = h83Var.j;
        qj1 qj1Var = h83Var.k;
        String strI2 = wx.i(h83Var.l);
        ne3 ne3Var = h83Var.m;
        r13 r13Var = h83Var.n;
        rf0 rf0Var = h83Var.p;
        x32 x32Var = this.b;
        String strA = ld3.a(x32Var.a);
        String strA2 = pe3.a(x32Var.b);
        String strD3 = jh3.d(x32Var.c);
        fg3 fg3Var = x32Var.d;
        eg1 eg1Var = x32Var.f;
        String strA3 = zf1.a(x32Var.g);
        String strA4 = l01.a(x32Var.h);
        wg3 wg3Var = x32Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strI);
        sb.append(", brush=");
        sb.append(dpVarB);
        sb.append(", alpha=");
        sb.append(fT);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(xq0Var);
        sb.append(", fontStyle=");
        sb.append(vq0Var);
        sb.append(", fontSynthesis=");
        sb.append(wq0Var);
        sb.append(", fontFamily=");
        sb.append(zb3Var);
        sb.append(", fontFeatureSettings=");
        nc2.w(sb, str, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(nlVar);
        sb.append(", textGeometricTransform=");
        sb.append(eg3Var);
        sb.append(", localeList=");
        sb.append(qj1Var);
        sb.append(", background=");
        sb.append(strI2);
        sb.append(", textDecoration=");
        sb.append(ne3Var);
        sb.append(", shadow=");
        sb.append(r13Var);
        sb.append(", drawStyle=");
        sb.append(rf0Var);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        nc2.w(sb, strA2, ", lineHeight=", strD3, ", textIndent=");
        sb.append(fg3Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(eg1Var);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(strA4);
        sb.append(", textMotion=");
        sb.append(wg3Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gh3(h83 h83Var, x32 x32Var) {
        f72 f72Var = h83Var.o;
        w62 w62Var = x32Var.e;
        this(h83Var, x32Var, (f72Var == null && w62Var == null) ? null : new k72(f72Var, w62Var));
    }

    public gh3(h83 h83Var, x32 x32Var, k72 k72Var) {
        this.a = h83Var;
        this.b = x32Var;
        this.c = k72Var;
    }
}
