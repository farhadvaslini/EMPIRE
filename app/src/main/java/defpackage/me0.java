package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class me0 implements ns0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ float g;
    public final /* synthetic */ Object h;

    public /* synthetic */ me0(float f, mk2 mk2Var) {
        this.g = f;
        this.h = mk2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        boolean z;
        int i = this.f;
        float f = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                mk2 mk2Var = (mk2) obj2;
                ze0 ze0Var = (ze0) obj;
                boolean zN = s51.n(ze0Var.V0(), "waiting");
                if (ze0Var.E() == null) {
                    z = false;
                } else {
                    t02 t02VarE = ze0Var.E();
                    t02VarE.getClass();
                    af0 af0Var = bf0.a;
                    if (t02VarE != t02.g ? !(f <= 30.0f || f > 90.0f) : f <= 30.0f) {
                        z = true;
                    }
                }
                if (mk2Var.f || (zN && z)) {
                    z = true;
                }
                mk2Var.f = z;
                return Boolean.valueOf(!z);
            default:
                gk3 gk3Var = (gk3) obj2;
                long jLongValue = ((Long) obj).longValue();
                boolean zG = gk3Var.g();
                b42 b42Var = gk3Var.h;
                if (!zG) {
                    if (b42Var.g() == Long.MIN_VALUE) {
                        b42Var.h(jLongValue);
                        ((d42) gk3Var.a.a).setValue(Boolean.TRUE);
                    }
                    long jG = jLongValue - b42Var.g();
                    if (f != 0.0f) {
                        jG = vm1.N(jG / ((double) f));
                    }
                    gk3Var.n(jG);
                    gk3Var.h(jG, f == 0.0f);
                }
                return dm3.a;
        }
    }

    public /* synthetic */ me0(gk3 gk3Var, float f) {
        this.h = gk3Var;
        this.g = f;
    }
}
