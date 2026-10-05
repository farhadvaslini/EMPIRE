package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 extends u71 implements ns0 {
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ u23 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(u23 u23Var, ak3 ak3Var, ak3 ak3Var2, ak3 ak3Var3) {
        super(1);
        this.h = u23Var;
        this.i = ak3Var;
        this.j = ak3Var2;
        this.k = ak3Var3;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        long jM;
        int i = this.g;
        Object obj2 = this.j;
        Object obj3 = this.i;
        u23 u23Var = this.h;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                uw0 uw0Var = (uw0) obj;
                e93 e93Var = (e93) obj3;
                float fFloatValue = e93Var != null ? ((Number) e93Var.getValue()).floatValue() : 1.0f;
                wc1 wc1Var = u23Var.c;
                float fG = fFloatValue * ((u23Var.d() && ((Boolean) ((d42) wc1Var.a).getValue()).booleanValue()) ? ((z32) wc1Var.b).g() : 1.0f);
                if (u23Var.d()) {
                    u23Var.g = fG;
                }
                uw0Var.d(fG);
                e93 e93Var2 = (e93) obj2;
                float fFloatValue2 = e93Var2 != null ? ((Number) e93Var2.getValue()).floatValue() : 1.0f;
                boolean z = u23Var.d() && ((Boolean) ((d42) wc1Var.c).getValue()).booleanValue();
                float fG2 = fFloatValue2 * (z ? ((z32) wc1Var.d).g() : 1.0f);
                if (u23Var.d()) {
                    u23Var.h = fG2;
                    u23Var.k = z ? ((z32) wc1Var.d).g() : 1.0f;
                    if (z) {
                        if (u23Var.l == null) {
                            u23Var.l = new np3(false);
                        }
                        np3 np3Var = u23Var.l;
                        if (np3Var != null) {
                            fe2 fe2Var = da0.a;
                            long j = u23Var.d;
                            long jA = hq1.a();
                            if ((1 | (j - 1)) == Long.MAX_VALUE) {
                                long jF = br.F(j);
                                zj zjVar = ig0.f;
                                jM = ((-(jF >> 1)) << 1) + ((long) (((int) jF) & 1));
                                int i2 = kg0.a;
                            } else {
                                jM = br.M(jA, j);
                            }
                            np3Var.a(fG2, ((((int) jM) & 1) != 1 || jM == ig0.g || jM == ig0.h) ? ig0.c(jM, lg0.MILLISECONDS) : jM >> 1);
                        }
                    }
                }
                uw0Var.m(fG2);
                uw0Var.s(fG2);
                e93 e93Var3 = (e93) obj4;
                long j2 = e93Var3 != null ? ((wj3) e93Var3.getValue()).a : wj3.b;
                if (u23Var.d() && ((Boolean) ((d42) wc1Var.e).getValue()).booleanValue()) {
                    j2 = ((wj3) ((d42) wc1Var.f).getValue()).a;
                }
                if (u23Var.d()) {
                    u23Var.i = j2;
                }
                uw0Var.q0(j2);
                return dm3.a;
            default:
                ek0 ek0Var = (ek0) obj4;
                int iOrdinal = ((ti0) obj).ordinal();
                wj3 wj3Var = null;
                if (iOrdinal == 0) {
                    kr2 kr2Var = ((ij0) obj2).a.d;
                    if (kr2Var != null) {
                        wj3Var = new wj3(kr2Var.b);
                    } else {
                        kr2 kr2Var2 = ek0Var.a.d;
                        if (kr2Var2 != null) {
                            wj3Var = new wj3(kr2Var2.b);
                        }
                    }
                } else if (iOrdinal == 1) {
                    wj3Var = (wj3) obj3;
                } else {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    kr2 kr2Var3 = ek0Var.a.d;
                    wj3Var = new wj3(kr2Var3 != null ? kr2Var3.b : u23Var.i);
                }
                return new wj3(wj3Var != null ? wj3Var.a : wj3.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(wj3 wj3Var, ij0 ij0Var, ek0 ek0Var, u23 u23Var) {
        super(1);
        this.i = wj3Var;
        this.j = ij0Var;
        this.k = ek0Var;
        this.h = u23Var;
    }
}
