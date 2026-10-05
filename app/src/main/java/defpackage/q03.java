package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q03 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ cs0 i;
    public final /* synthetic */ cs0 j;

    public /* synthetic */ q03(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, int i) {
        this.f = i;
        this.g = cs0Var;
        this.h = cs0Var2;
        this.i = cs0Var3;
        this.j = cs0Var4;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    gv3.p(gq.N(797840096, new q03(this.g, this.h, this.i, this.j, 1), nv0Var), nv0Var, 6);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    long j = wx.f;
                    ei1 ei1VarU = vr.u(j, nv0Var2);
                    cs0 cs0Var = this.g;
                    yp1 yp1Var = yp1.a;
                    vp.g(r51.O0, gv3.x(3, cs0Var, yp1Var, false), null, r51.P0, r51.Q0, ei1VarU, nv0Var2, 221190, 396);
                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var2, 6, 6);
                    vp.g(r51.R0, gv3.x(3, this.h, yp1Var, false), null, r51.S0, r51.T0, vr.u(j, nv0Var2), nv0Var2, 221190, 396);
                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var2, 6, 6);
                    vp.g(r51.U0, gv3.x(3, this.i, yp1Var, false), null, r51.V0, r51.W0, vr.u(j, nv0Var2), nv0Var2, 221190, 396);
                    gq.g(f80.L(yp1Var, 16.0f, 0.0f, 2), 0.0f, 0L, nv0Var2, 6, 6);
                    vp.g(r51.X0, gv3.x(3, this.j, yp1Var, false), null, r51.Y0, r51.Z0, vr.u(j, nv0Var2), nv0Var2, 221190, 396);
                }
                break;
        }
        return dm3Var;
    }
}
