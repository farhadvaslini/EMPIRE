package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class np1 implements cs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ s33 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ x50 i;

    public /* synthetic */ np1(s33 s33Var, x50 x50Var, cs0 cs0Var) {
        this.g = s33Var;
        this.i = x50Var;
        this.h = cs0Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        x50 x50Var = this.i;
        cs0 cs0Var = this.h;
        s33 s33Var = this.g;
        switch (i) {
            case 0:
                if (((Boolean) s33Var.c.d.h(t33.f)).booleanValue()) {
                    cl3.t(x50Var, null, new qp1(s33Var, null, 3), 3).r(new pp1(s33Var, cs0Var, 0));
                }
                break;
            default:
                int iOrdinal = ((t33) s33Var.c.g.getValue()).ordinal();
                if (iOrdinal == 1) {
                    cs0Var.a();
                } else if (iOrdinal == 2) {
                    cl3.t(x50Var, null, new qp1(s33Var, null, 4), 3);
                } else {
                    cl3.t(x50Var, null, new qp1(s33Var, null, 5), 3);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ np1(s33 s33Var, cs0 cs0Var, x50 x50Var) {
        this.g = s33Var;
        this.h = cs0Var;
        this.i = x50Var;
    }
}
