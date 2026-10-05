package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bo1 implements ns0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ bo1(mk2 mk2Var, mk2 mk2Var2, wt1 wt1Var, boolean z, mj mjVar) {
        this.h = mk2Var;
        this.i = mk2Var2;
        this.j = wt1Var;
        this.g = z;
        this.k = mjVar;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj2 = this.k;
        boolean z = this.g;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                d42 d42Var = ((ps1) obj5).c;
                os1 os1Var = (os1) obj4;
                e93 e93Var = (e93) obj3;
                e93 e93Var2 = (e93) obj2;
                uw0 uw0Var = (uw0) obj;
                float fFloatValue = 0.8f;
                float fFloatValue2 = 1.0f;
                uw0Var.m(!z ? ((Number) e93Var.getValue()).floatValue() : ((Boolean) d42Var.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    fFloatValue = ((Number) e93Var.getValue()).floatValue();
                } else if (((Boolean) d42Var.getValue()).booleanValue()) {
                    fFloatValue = 1.0f;
                }
                uw0Var.s(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) e93Var2.getValue()).floatValue();
                } else if (!((Boolean) d42Var.getValue()).booleanValue()) {
                    fFloatValue2 = 0.0f;
                }
                uw0Var.d(fFloatValue2);
                uw0Var.q0(((wj3) os1Var.getValue()).a);
                break;
            default:
                qt1 qt1Var = (qt1) obj;
                qt1Var.getClass();
                ((mk2) obj5).f = true;
                ((mk2) obj4).f = true;
                ((wt1) obj3).n(qt1Var, z, (mj) obj2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ bo1(boolean z, ps1 ps1Var, os1 os1Var, ek3 ek3Var, ek3 ek3Var2) {
        this.g = z;
        this.h = ps1Var;
        this.i = os1Var;
        this.j = ek3Var;
        this.k = ek3Var2;
    }
}
