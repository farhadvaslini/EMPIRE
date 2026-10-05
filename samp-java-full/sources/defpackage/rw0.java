package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
final class rw0 extends gq1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final long k;
    public final z13 l;
    public final boolean m;
    public final u10 n;
    public final long o;
    public final long p;
    public final int q;
    public final int r;
    public final yx s;
    public final wa1 t;

    public rw0(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, z13 z13Var, boolean z, u10 u10Var, long j2, long j3, int i, int i2, yx yxVar, wa1 wa1Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = j;
        this.l = z13Var;
        this.m = z;
        this.n = u10Var;
        this.o = j2;
        this.p = j3;
        this.q = i;
        this.r = i2;
        this.s = yxVar;
        this.t = wa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw0)) {
            return false;
        }
        rw0 rw0Var = (rw0) obj;
        return Float.compare(this.a, rw0Var.a) == 0 && Float.compare(this.b, rw0Var.b) == 0 && Float.compare(this.c, rw0Var.c) == 0 && Float.compare(this.d, rw0Var.d) == 0 && Float.compare(this.e, rw0Var.e) == 0 && Float.compare(this.f, rw0Var.f) == 0 && Float.compare(this.g, rw0Var.g) == 0 && Float.compare(this.h, rw0Var.h) == 0 && Float.compare(this.i, rw0Var.i) == 0 && Float.compare(this.j, rw0Var.j) == 0 && wj3.a(this.k, rw0Var.k) && s51.n(this.l, rw0Var.l) && this.m == rw0Var.m && s51.n(this.n, rw0Var.n) && wx.c(this.o, rw0Var.o) && wx.c(this.p, rw0Var.p) && this.q == rw0Var.q && this.r == rw0Var.r && s51.n(this.s, rw0Var.s) && s51.n(this.t, rw0Var.t);
    }

    @Override // defpackage.gq1
    public final aq1 f() {
        x33 x33Var = new x33();
        x33Var.t = this.a;
        x33Var.u = this.b;
        x33Var.v = this.c;
        x33Var.w = this.d;
        x33Var.x = this.e;
        x33Var.y = this.f;
        x33Var.z = this.g;
        x33Var.A = this.h;
        x33Var.B = this.i;
        x33Var.C = this.j;
        x33Var.D = this.k;
        x33Var.E = this.l;
        x33Var.F = this.m;
        x33Var.G = this.n;
        x33Var.H = this.o;
        x33Var.I = this.p;
        x33Var.J = this.q;
        x33Var.K = this.r;
        x33Var.L = this.s;
        x33Var.M = this.t;
        x33Var.N = new aw2(6, x33Var);
        return x33Var;
    }

    @Override // defpackage.gq1
    public final void g(aq1 aq1Var) {
        ex1 ex1Var;
        x33 x33Var = (x33) aq1Var;
        x33Var.t = this.a;
        x33Var.u = this.b;
        x33Var.v = this.c;
        x33Var.w = this.d;
        x33Var.x = this.e;
        x33Var.y = this.f;
        x33Var.z = this.g;
        x33Var.A = this.h;
        x33Var.B = this.i;
        x33Var.C = this.j;
        x33Var.D = this.k;
        x33Var.E = this.l;
        x33Var.F = this.m;
        x33Var.G = this.n;
        x33Var.H = this.o;
        x33Var.I = this.p;
        x33Var.J = this.q;
        x33Var.K = this.r;
        x33Var.L = this.s;
        x33Var.M = this.t;
        aw2 aw2Var = x33Var.N;
        if (x33Var.f.s && (ex1Var = vr.U(x33Var, 2).C) != null) {
            ex1Var.W1(aw2Var, true);
        }
    }

    public final int hashCode() {
        int iA = nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(nc2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31);
        int i = wj3.c;
        int iB = by1.b((this.l.hashCode() + nc2.c(this.k, iA, 31)) * 31, 31, this.m);
        u10 u10Var = this.n;
        int iHashCode = (iB + (u10Var == null ? 0 : u10Var.hashCode())) * 31;
        int i2 = wx.h;
        int iB2 = nc2.b(this.r, nc2.b(this.q, nc2.c(this.p, nc2.c(this.o, iHashCode, 31), 31), 31), 31);
        yx yxVar = this.s;
        return this.t.hashCode() + ((iB2 + (yxVar != null ? yxVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strB = wj3.b(this.k);
        String strI = wx.i(this.o);
        String strI2 = wx.i(this.p);
        String strH = by1.h("CompositingStrategy(value=", ")", this.q);
        String strB0 = w7.b0(this.r);
        StringBuilder sbK = nc2.k("GraphicsLayerElement(scaleX=", this.a, ", scaleY=", this.b, ", alpha=");
        nc2.v(sbK, this.c, ", translationX=", this.d, ", translationY=");
        nc2.v(sbK, this.e, ", shadowElevation=", this.f, ", rotationX=");
        nc2.v(sbK, this.g, ", rotationY=", this.h, ", rotationZ=");
        nc2.v(sbK, this.i, ", cameraDistance=", this.j, ", transformOrigin=");
        sbK.append(strB);
        sbK.append(", shape=");
        sbK.append(this.l);
        sbK.append(", clip=");
        sbK.append(this.m);
        sbK.append(", renderEffect=");
        sbK.append(this.n);
        sbK.append(", ambientShadowColor=");
        nc2.w(sbK, strI, ", spotShadowColor=", strI2, ", compositingStrategy=");
        nc2.w(sbK, strH, ", blendMode=", strB0, ", colorFilter=");
        sbK.append(this.s);
        sbK.append(", outsets=");
        sbK.append(this.t);
        sbK.append(")");
        return sbK.toString();
    }
}
