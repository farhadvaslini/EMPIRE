package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h83 implements we {
    public final dg3 a;
    public final long b;
    public final xq0 c;
    public final vq0 d;
    public final wq0 e;
    public final zb3 f;
    public final String g;
    public final long h;
    public final nl i;
    public final eg3 j;
    public final qj1 k;
    public final long l;
    public final ne3 m;
    public final r13 n;
    public final f72 o;
    public final rf0 p;

    public h83(long j, long j2, xq0 xq0Var, vq0 vq0Var, wq0 wq0Var, zb3 zb3Var, String str, long j3, nl nlVar, eg3 eg3Var, qj1 qj1Var, long j4, ne3 ne3Var, r13 r13Var, int i) {
        this((i & 1) != 0 ? wx.g : j, (i & 2) != 0 ? jh3.c : j2, (i & 4) != 0 ? null : xq0Var, (i & 8) != 0 ? null : vq0Var, (i & 16) != 0 ? null : wq0Var, (i & 32) != 0 ? null : zb3Var, (i & 64) != 0 ? null : str, (i & 128) != 0 ? jh3.c : j3, (i & 256) != 0 ? null : nlVar, (i & 512) != 0 ? null : eg3Var, (i & 1024) != 0 ? null : qj1Var, (i & 2048) != 0 ? wx.g : j4, (i & 4096) != 0 ? null : ne3Var, (i & 8192) != 0 ? null : r13Var, (f72) null);
    }

    public final boolean a(h83 h83Var) {
        if (this == h83Var) {
            return true;
        }
        return jh3.a(this.b, h83Var.b) && s51.n(this.c, h83Var.c) && s51.n(this.d, h83Var.d) && s51.n(this.e, h83Var.e) && s51.n(this.f, h83Var.f) && s51.n(this.g, h83Var.g) && jh3.a(this.h, h83Var.h) && s51.n(this.i, h83Var.i) && s51.n(this.j, h83Var.j) && s51.n(this.k, h83Var.k) && wx.c(this.l, h83Var.l) && s51.n(this.o, h83Var.o);
    }

    public final boolean b(h83 h83Var) {
        return s51.n(this.a, h83Var.a) && s51.n(this.m, h83Var.m) && s51.n(this.n, h83Var.n) && s51.n(this.p, h83Var.p);
    }

    public final h83 c(h83 h83Var) {
        if (h83Var == null) {
            return this;
        }
        dg3 dg3Var = h83Var.a;
        return i83.a(this, dg3Var.a(), dg3Var.b(), dg3Var.t(), h83Var.b, h83Var.c, h83Var.d, h83Var.e, h83Var.f, h83Var.g, h83Var.h, h83Var.i, h83Var.j, h83Var.k, h83Var.l, h83Var.m, h83Var.n, h83Var.o, h83Var.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h83)) {
            return false;
        }
        h83 h83Var = (h83) obj;
        return a(h83Var) && b(h83Var);
    }

    public final int hashCode() {
        dg3 dg3Var = this.a;
        long jA = dg3Var.a();
        int i = wx.h;
        int iHashCode = Long.hashCode(jA) * 31;
        dp dpVarB = dg3Var.b();
        int iHashCode2 = (Float.hashCode(dg3Var.t()) + ((iHashCode + (dpVarB != null ? dpVarB.hashCode() : 0)) * 31)) * 31;
        kh3[] kh3VarArr = jh3.b;
        int iC = nc2.c(this.b, iHashCode2, 31);
        xq0 xq0Var = this.c;
        int i2 = (iC + (xq0Var != null ? xq0Var.f : 0)) * 31;
        vq0 vq0Var = this.d;
        int iHashCode3 = (i2 + (vq0Var != null ? Integer.hashCode(vq0Var.a) : 0)) * 31;
        wq0 wq0Var = this.e;
        int iHashCode4 = (iHashCode3 + (wq0Var != null ? Integer.hashCode(wq0Var.a) : 0)) * 31;
        zb3 zb3Var = this.f;
        int iHashCode5 = (iHashCode4 + (zb3Var != null ? zb3Var.hashCode() : 0)) * 31;
        String str = this.g;
        int iC2 = nc2.c(this.h, (iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
        nl nlVar = this.i;
        int iHashCode6 = (iC2 + (nlVar != null ? Float.hashCode(nlVar.a) : 0)) * 31;
        eg3 eg3Var = this.j;
        int iHashCode7 = (iHashCode6 + (eg3Var != null ? eg3Var.hashCode() : 0)) * 31;
        qj1 qj1Var = this.k;
        int iC3 = nc2.c(this.l, (iHashCode7 + (qj1Var != null ? qj1Var.f.hashCode() : 0)) * 31, 31);
        ne3 ne3Var = this.m;
        int i3 = (iC3 + (ne3Var != null ? ne3Var.a : 0)) * 31;
        r13 r13Var = this.n;
        int iHashCode8 = (i3 + (r13Var != null ? r13Var.hashCode() : 0)) * 31;
        f72 f72Var = this.o;
        int iHashCode9 = (iHashCode8 + (f72Var != null ? f72Var.hashCode() : 0)) * 31;
        rf0 rf0Var = this.p;
        return iHashCode9 + (rf0Var != null ? rf0Var.hashCode() : 0);
    }

    public final String toString() {
        dg3 dg3Var = this.a;
        String strI = wx.i(dg3Var.a());
        dp dpVarB = dg3Var.b();
        float fT = dg3Var.t();
        String strD = jh3.d(this.b);
        String strD2 = jh3.d(this.h);
        String strI2 = wx.i(this.l);
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append(strI);
        sb.append(", brush=");
        sb.append(dpVarB);
        sb.append(", alpha=");
        sb.append(fT);
        sb.append(", fontSize=");
        sb.append(strD);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", fontStyle=");
        sb.append(this.d);
        sb.append(", fontSynthesis=");
        sb.append(this.e);
        sb.append(", fontFamily=");
        sb.append(this.f);
        sb.append(", fontFeatureSettings=");
        nc2.w(sb, this.g, ", letterSpacing=", strD2, ", baselineShift=");
        sb.append(this.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.j);
        sb.append(", localeList=");
        sb.append(this.k);
        sb.append(", background=");
        sb.append(strI2);
        sb.append(", textDecoration=");
        sb.append(this.m);
        sb.append(", shadow=");
        sb.append(this.n);
        sb.append(", platformStyle=");
        sb.append(this.o);
        sb.append(", drawStyle=");
        sb.append(this.p);
        sb.append(")");
        return sb.toString();
    }

    public h83(dg3 dg3Var, long j, xq0 xq0Var, vq0 vq0Var, wq0 wq0Var, zb3 zb3Var, String str, long j2, nl nlVar, eg3 eg3Var, qj1 qj1Var, long j3, ne3 ne3Var, r13 r13Var, f72 f72Var, rf0 rf0Var) {
        this.a = dg3Var;
        this.b = j;
        this.c = xq0Var;
        this.d = vq0Var;
        this.e = wq0Var;
        this.f = zb3Var;
        this.g = str;
        this.h = j2;
        this.i = nlVar;
        this.j = eg3Var;
        this.k = qj1Var;
        this.l = j3;
        this.m = ne3Var;
        this.n = r13Var;
        this.o = f72Var;
        this.p = rf0Var;
    }

    public h83(long j, long j2, xq0 xq0Var, vq0 vq0Var, wq0 wq0Var, zb3 zb3Var, String str, long j3, nl nlVar, eg3 eg3Var, qj1 qj1Var, long j4, ne3 ne3Var, r13 r13Var, f72 f72Var) {
        this(j != 16 ? new my(j) : cg3.a, j2, xq0Var, vq0Var, wq0Var, zb3Var, str, j3, nlVar, eg3Var, qj1Var, j4, ne3Var, r13Var, f72Var, null);
    }
}
