package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kh1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ z60 g;

    public /* synthetic */ kh1(z60 z60Var, int i) {
        this.f = i;
        this.g = z60Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        pi piVarZ;
        long jA;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        z60 z60Var = this.g;
        qf0 qf0Var = (qf0) obj;
        ns0 ns0Var = (ns0) obj2;
        switch (i) {
            case 0:
                qf0Var.getClass();
                ns0Var.getClass();
                float fB = z60Var.b();
                float fN = lq.N(0.6666667f, 0.75f, fB);
                float fN2 = lq.N(0.0f, 0.75f, fB);
                long jY0 = qf0Var.y0();
                piVarZ = qf0Var.Z();
                jA = piVarZ.A();
                piVarZ.k().l();
                try {
                    ((yl1) piVarZ.g).G(fN, fN2, jY0);
                    ns0Var.h(qf0Var);
                    return dm3Var;
                } finally {
                }
            default:
                qf0Var.getClass();
                ns0Var.getClass();
                float fB2 = z60Var.b();
                float fN3 = lq.N(0.6666667f, 1.0f, fB2);
                float fN4 = lq.N(0.0f, 1.0f, fB2);
                long jY02 = qf0Var.y0();
                piVarZ = qf0Var.Z();
                jA = piVarZ.A();
                piVarZ.k().l();
                try {
                    ((yl1) piVarZ.g).G(fN3, fN4, jY02);
                    ns0Var.h(qf0Var);
                    return dm3Var;
                } finally {
                }
        }
    }
}
