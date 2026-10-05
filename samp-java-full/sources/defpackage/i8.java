package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i8 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ long g;

    public /* synthetic */ i8(int i, long j) {
        this.f = i;
        this.g = j;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        jr jrVar;
        Object qn2Var;
        int i = this.f;
        long j = this.g;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                oq oqVar = (oq) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (oqVar.f.a() >> 32)) / 2.0f;
                return oqVar.c(new j8(fIntBitsToFloat, gv3.z(oqVar, fIntBitsToFloat), new xm(5, j)));
            case 1:
                cp cpVar = (cp) obj;
                ns0 ns0Var = cpVar.b;
                if (ns0Var != null && (jrVar = cpVar.a) != null) {
                    try {
                        qn2Var = ns0Var.h(Long.valueOf(j));
                    } catch (Throwable th) {
                        qn2Var = new qn2(th);
                    }
                    jrVar.t(qn2Var);
                    break;
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((dv2) obj).a(lu2.a, new ku2(fx0.f, this.g, ju2.g, true));
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                qf0 qf0Var = (qf0) obj;
                qf0Var.getClass();
                qf0.h0(qf0Var, this.g, 0L, 0L, 0.0f, null, 0, 126);
                return dm3Var;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                qf0 qf0Var2 = (qf0) obj;
                qf0Var2.getClass();
                qf0.h0(qf0Var2, this.g, 0L, 0L, 0.0f, null, 0, 126);
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                qf0 qf0Var3 = (qf0) obj;
                qf0Var3.getClass();
                long j2 = this.g;
                if (j2 != 16) {
                    qf0.h0(qf0Var3, j2, 0L, 0L, 0.0f, null, 25, 62);
                    qf0.h0(qf0Var3, wx.b(0.75f, j2), 0L, 0L, 0.0f, null, 0, 126);
                }
                return dm3Var;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                qf0 qf0Var4 = (qf0) obj;
                qf0Var4.getClass();
                qf0.h0(qf0Var4, this.g, 0L, 0L, 0.0f, null, 0, 126);
                return dm3Var;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                vb1 vb1Var = (vb1) obj;
                vb1Var.getClass();
                qf0.h0(vb1Var, this.g, 0L, 0L, 0.0f, null, 0, 126);
                vb1Var.c();
                return dm3Var;
            default:
                qf0 qf0Var5 = (qf0) obj;
                float fMin = Math.min(qf0Var5.T(4.0f), Float.intBitsToFloat((int) (qf0Var5.a() & 4294967295L)));
                float fT = qf0Var5.T(6.0f);
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (qf0Var5.a() & 4294967295L)) - fMin) / 2.0f;
                if (fIntBitsToFloat2 <= fT) {
                    fT = fIntBitsToFloat2;
                }
                if (qf0Var5.getLayoutDirection() == bb1.g) {
                    long jY0 = qf0Var5.y0();
                    pi piVarZ = qf0Var5.Z();
                    long jA = piVarZ.A();
                    piVarZ.k().l();
                    try {
                        ((yl1) piVarZ.g).G(-1.0f, 1.0f, jY0);
                        y02.p(qf0Var5, j, fMin, fT);
                    } finally {
                        nc2.t(piVarZ, jA);
                    }
                } else {
                    y02.p(qf0Var5, j, fMin, fT);
                }
                return dm3Var;
        }
    }
}
