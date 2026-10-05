package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x33 extends aq1 implements kb1, tu2 {
    public float A;
    public float B;
    public float C;
    public long D;
    public z13 E;
    public boolean F;
    public u10 G;
    public long H;
    public long I;
    public int J;
    public int K;
    public yx L;
    public wa1 M;
    public aw2 N;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    @Override // defpackage.tu2
    public final boolean C() {
        return false;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        if (this.F) {
            bv2.j(dv2Var, this.E);
        }
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new er1(17, i62VarT, this));
    }

    public final String toString() {
        float f = this.t;
        float f2 = this.u;
        float f3 = this.v;
        float f4 = this.w;
        float f5 = this.x;
        float f6 = this.y;
        float f7 = this.z;
        float f8 = this.A;
        float f9 = this.B;
        float f10 = this.C;
        String strB = wj3.b(this.D);
        z13 z13Var = this.E;
        boolean z = this.F;
        u10 u10Var = this.G;
        String strI = wx.i(this.H);
        String strI2 = wx.i(this.I);
        String strH = by1.h("CompositingStrategy(value=", ")", this.J);
        String strB0 = w7.b0(this.K);
        yx yxVar = this.L;
        wa1 wa1Var = this.M;
        StringBuilder sbK = nc2.k("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        nc2.v(sbK, f3, ", translationX=", f4, ", translationY=");
        nc2.v(sbK, f5, ", shadowElevation=", f6, ", rotationX=");
        nc2.v(sbK, f7, ", rotationY=", f8, ", rotationZ=");
        nc2.v(sbK, f9, ", cameraDistance=", f10, ", transformOrigin=");
        sbK.append(strB);
        sbK.append(", shape=");
        sbK.append(z13Var);
        sbK.append(", clip=");
        sbK.append(z);
        sbK.append(", renderEffect=");
        sbK.append(u10Var);
        sbK.append(", ambientShadowColor=");
        nc2.w(sbK, strI, ", spotShadowColor=", strI2, ", compositingStrategy=");
        nc2.w(sbK, strH, ", blendMode=", strB0, ", colorFilter=");
        sbK.append(yxVar);
        sbK.append("outsets=");
        sbK.append(wa1Var);
        sbK.append(")");
        return sbK.toString();
    }
}
