package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ra3 {
    public final ua3 a;
    public hc1 b;
    public final pa3 c;
    public final pa3 d;
    public final pa3 e;

    /* JADX WARN: Type inference failed for: r2v1, types: [pa3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pa3] */
    /* JADX WARN: Type inference failed for: r2v3, types: [pa3] */
    public ra3(ua3 ua3Var) {
        this.a = ua3Var;
        final int i = 0;
        this.c = new rs0(this) { // from class: pa3
            public final /* synthetic */ ra3 g;

            {
                this.g = this;
            }

            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                int i2 = i;
                dm3 dm3Var = dm3.a;
                ra3 ra3Var = this.g;
                switch (i2) {
                    case 0:
                        ua3 ua3Var2 = ra3Var.a;
                        tb1 tb1Var = (tb1) obj;
                        hc1 hc1Var = tb1Var.N;
                        if (hc1Var == null) {
                            hc1Var = new hc1(tb1Var, ua3Var2);
                            tb1Var.N = hc1Var;
                        }
                        ra3Var.b = hc1Var;
                        ra3Var.a().g();
                        hc1 hc1VarA = ra3Var.a();
                        if (hc1VarA.h != ua3Var2) {
                            hc1VarA.h = ua3Var2;
                            hc1VarA.i(false);
                            tb1.Y(hc1VarA.f, false, 7);
                        }
                        break;
                    case 1:
                        ra3Var.a().g = (g20) obj2;
                        break;
                    default:
                        hc1 hc1VarA2 = ra3Var.a();
                        ((tb1) obj).f0(new dc1(hc1VarA2, (rs0) obj2, hc1VarA2.u));
                        break;
                }
                return dm3Var;
            }
        };
        final int i2 = 1;
        this.d = new rs0(this) { // from class: pa3
            public final /* synthetic */ ra3 g;

            {
                this.g = this;
            }

            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                int i22 = i2;
                dm3 dm3Var = dm3.a;
                ra3 ra3Var = this.g;
                switch (i22) {
                    case 0:
                        ua3 ua3Var2 = ra3Var.a;
                        tb1 tb1Var = (tb1) obj;
                        hc1 hc1Var = tb1Var.N;
                        if (hc1Var == null) {
                            hc1Var = new hc1(tb1Var, ua3Var2);
                            tb1Var.N = hc1Var;
                        }
                        ra3Var.b = hc1Var;
                        ra3Var.a().g();
                        hc1 hc1VarA = ra3Var.a();
                        if (hc1VarA.h != ua3Var2) {
                            hc1VarA.h = ua3Var2;
                            hc1VarA.i(false);
                            tb1.Y(hc1VarA.f, false, 7);
                        }
                        break;
                    case 1:
                        ra3Var.a().g = (g20) obj2;
                        break;
                    default:
                        hc1 hc1VarA2 = ra3Var.a();
                        ((tb1) obj).f0(new dc1(hc1VarA2, (rs0) obj2, hc1VarA2.u));
                        break;
                }
                return dm3Var;
            }
        };
        final int i3 = 2;
        this.e = new rs0(this) { // from class: pa3
            public final /* synthetic */ ra3 g;

            {
                this.g = this;
            }

            @Override // defpackage.rs0
            public final Object f(Object obj, Object obj2) {
                int i22 = i3;
                dm3 dm3Var = dm3.a;
                ra3 ra3Var = this.g;
                switch (i22) {
                    case 0:
                        ua3 ua3Var2 = ra3Var.a;
                        tb1 tb1Var = (tb1) obj;
                        hc1 hc1Var = tb1Var.N;
                        if (hc1Var == null) {
                            hc1Var = new hc1(tb1Var, ua3Var2);
                            tb1Var.N = hc1Var;
                        }
                        ra3Var.b = hc1Var;
                        ra3Var.a().g();
                        hc1 hc1VarA = ra3Var.a();
                        if (hc1VarA.h != ua3Var2) {
                            hc1VarA.h = ua3Var2;
                            hc1VarA.i(false);
                            tb1.Y(hc1VarA.f, false, 7);
                        }
                        break;
                    case 1:
                        ra3Var.a().g = (g20) obj2;
                        break;
                    default:
                        hc1 hc1VarA2 = ra3Var.a();
                        ((tb1) obj).f0(new dc1(hc1VarA2, (rs0) obj2, hc1VarA2.u));
                        break;
                }
                return dm3Var;
            }
        };
    }

    public final hc1 a() {
        hc1 hc1Var = this.b;
        if (hc1Var != null) {
            return hc1Var;
        }
        c.p("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
