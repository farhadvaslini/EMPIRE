package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class x41 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ a51 g;

    public /* synthetic */ x41(a51 a51Var, int i) {
        this.f = i;
        this.g = a51Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        p40 p40Var = null;
        dm3 dm3Var = dm3.a;
        a51 a51Var = this.g;
        switch (i) {
            case 0:
                vb1 vb1Var = (vb1) obj;
                vb1Var.getClass();
                rr rrVar = vb1Var.f;
                ed edVar = a51Var.c;
                db dbVar = a51Var.f;
                float fFloatValue = ((Number) edVar.d()).floatValue();
                if (fFloatValue > 0.0f) {
                    if (dbVar != null) {
                        long j = wx.c;
                        qf0.h0(vb1Var, wx.b(0.08f * fFloatValue, j), 0L, 0L, 0.0f, null, 12, 62);
                        long j2 = ((gy1) a51Var.b.f(new h43(rrVar.a()), a51Var.d.d())).a;
                        dbVar.a.setFloatUniform("size", Float.intBitsToFloat((int) (rrVar.a() >> 32)), Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)));
                        dbVar.a.setColorUniform("color", vp.T(wx.b(fFloatValue * 0.15f, j)));
                        dbVar.a.setFloatUniform("radius", h43.b(rrVar.a()) * 1.5f);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rrVar.a() >> 32));
                        if (fIntBitsToFloat < 0.0f) {
                            fIntBitsToFloat = 0.0f;
                        }
                        if (fIntBitsToFloat <= fIntBitsToFloat2) {
                            fIntBitsToFloat2 = fIntBitsToFloat;
                        }
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (rrVar.a() & 4294967295L));
                        float f = fIntBitsToFloat3 >= 0.0f ? fIntBitsToFloat3 : 0.0f;
                        if (f <= fIntBitsToFloat4) {
                            fIntBitsToFloat4 = f;
                        }
                        dbVar.a.setFloatUniform("position", fIntBitsToFloat2, fIntBitsToFloat4);
                        qf0.S0(vb1Var, new ep(dbVar.a), 0L, 0L, 0.0f, null, 62);
                    } else {
                        qf0.h0(vb1Var, wx.b(fFloatValue * 0.25f, wx.c), 0L, 0L, 0.0f, null, 12, 62);
                    }
                }
                vb1Var.c();
                break;
            case 1:
                gb2 gb2Var = (gb2) obj;
                gb2Var.getClass();
                a51Var.e = gb2Var.c;
                cl3.t(a51Var.a, null, new z41(a51Var, p40Var, 0), 3);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((gb2) obj).getClass();
                cl3.t(a51Var.a, null, new z41(a51Var, p40Var, 1), 3);
                break;
            default:
                uw0 uw0Var = (uw0) obj;
                uw0Var.getClass();
                float fN = lq.N(1.0f, ((uw0Var.h() * 4.0f) / Float.intBitsToFloat((int) (uw0Var.a() & 4294967295L))) + 1.0f, ((Number) a51Var.c.d()).floatValue());
                float fB = h43.b(uw0Var.a());
                long j3 = ((gy1) a51Var.d.d()).a;
                uw0Var.p(((float) Math.tanh((Float.intBitsToFloat((int) (j3 >> 32)) * 0.05f) / fB)) * fB);
                uw0Var.k(fB * ((float) Math.tanh((Float.intBitsToFloat((int) (4294967295L & j3)) * 0.05f) / fB)));
                uw0Var.m(fN);
                uw0Var.s(fN);
                break;
        }
        return dm3Var;
    }
}
