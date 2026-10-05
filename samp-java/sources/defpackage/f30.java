package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class f30 extends g30 {
    public final eo2 e;
    public final eo2 f;
    public final float[] g;

    public f30(eo2 eo2Var, eo2 eo2Var2) {
        float[] fArrN;
        super(eo2Var2, eo2Var, eo2Var2, null);
        this.e = eo2Var;
        this.f = eo2Var2;
        float[] fArr = e4.c.b;
        xr3 xr3Var = eo2Var.d;
        float[] fArr2 = eo2Var.i;
        xr3 xr3Var2 = eo2Var2.d;
        float[] fArr3 = eo2Var2.j;
        if (pq.p(xr3Var, xr3Var2)) {
            fArrN = pq.N(fArr3, fArr2);
        } else {
            float[] fArrA = xr3Var.a();
            float[] fArrA2 = xr3Var2.a();
            xr3 xr3Var3 = rn.k0;
            fArrN = pq.N(pq.p(xr3Var2, xr3Var3) ? fArr3 : pq.E(pq.N(pq.m(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), eo2Var2.i)), pq.p(xr3Var, xr3Var3) ? fArr2 : pq.N(pq.m(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.g = fArrN;
    }

    @Override // defpackage.g30
    public final long a(long j) {
        float fH = wx.h(j);
        float fG = wx.g(j);
        float fE = wx.e(j);
        float fD = wx.d(j);
        ao2 ao2Var = this.e.p;
        float fC = (float) ao2Var.c(fH);
        float fC2 = (float) ao2Var.c(fG);
        float fC3 = (float) ao2Var.c(fE);
        float[] fArr = this.g;
        float f = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f2 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f3 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        eo2 eo2Var = this.f;
        float fC4 = (float) eo2Var.m.c(f);
        ao2 ao2Var2 = eo2Var.m;
        return vp.a(fC4, (float) ao2Var2.c(f2), (float) ao2Var2.c(f3), fD, eo2Var);
    }
}
