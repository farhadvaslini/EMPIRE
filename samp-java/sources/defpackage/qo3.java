package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class qo3 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ro3 g;

    public /* synthetic */ qo3(ro3 ro3Var, int i) {
        this.f = i;
        this.g = ro3Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        ro3 ro3Var = this.g;
        switch (i) {
            case 0:
                ro3Var.d = true;
                ro3Var.f.a();
                return dm3Var;
            default:
                qf0 qf0Var = (qf0) obj;
                bx0 bx0Var = ro3Var.b;
                float f = ro3Var.k;
                float f2 = ro3Var.l;
                pi piVarZ = qf0Var.Z();
                long jA = piVarZ.A();
                piVarZ.k().l();
                try {
                    ((yl1) piVarZ.g).G(f, f2, 0L);
                    bx0Var.a(qf0Var);
                    return dm3Var;
                } finally {
                    nc2.t(piVarZ, jA);
                }
        }
    }
}
