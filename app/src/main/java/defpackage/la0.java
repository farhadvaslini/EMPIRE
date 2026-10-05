package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class la0 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ na0 g;

    public /* synthetic */ la0(na0 na0Var, int i) {
        this.f = i;
        this.g = na0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        na0 na0Var = this.g;
        switch (i) {
            case 0:
                ho2 ho2Var = (ho2) ur.z(na0Var, ko2.a);
                cb cbVar = na0Var.z;
                if (ho2Var == null) {
                    if (cbVar != null) {
                        na0Var.q1(cbVar);
                    }
                    na0Var.z = null;
                } else if (cbVar == null) {
                    ma0 ma0Var = new ma0(0, na0Var);
                    la0 la0Var = new la0(na0Var, 1);
                    t41 t41Var = na0Var.v;
                    boolean z = na0Var.w;
                    float f = na0Var.x;
                    zk3 zk3Var = lo2.a;
                    cb cbVar2 = new cb(t41Var, z, f, ma0Var, la0Var);
                    na0Var.p1(cbVar2);
                    na0Var.z = cbVar2;
                }
                return dm3.a;
            default:
                return rn.Y0;
        }
    }
}
