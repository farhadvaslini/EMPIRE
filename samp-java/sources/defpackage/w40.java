package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class w40 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ ye1 g;

    public /* synthetic */ w40(ye1 ye1Var, int i) {
        this.f = i;
        this.g = ye1Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        ye1 ye1Var = this.g;
        switch (i) {
            case 0:
                ab1 ab1Var = (ab1) obj;
                qg3 qg3VarD = ye1Var.d();
                if (qg3VarD != null) {
                    qg3VarD.c = ab1Var;
                }
                return dm3Var;
            case 1:
                d42 d42Var = ye1Var.t;
                bg3 bg3Var = (bg3) obj;
                String str = bg3Var.a.g;
                af afVar = ye1Var.j;
                if (!s51.n(str, afVar != null ? afVar.g : null)) {
                    ye1Var.k.setValue(hx0.f);
                    if (((Boolean) d42Var.getValue()).booleanValue()) {
                        d42Var.setValue(Boolean.FALSE);
                    } else {
                        ye1Var.s.setValue(Boolean.FALSE);
                    }
                }
                long j = yg3.b;
                ye1Var.f(j);
                ye1Var.e(j);
                ye1Var.u.h(bg3Var);
                xj2 xj2Var = ye1Var.b;
                l20 l20Var = xj2Var.a;
                if (l20Var != null) {
                    l20Var.s(xj2Var, null);
                }
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ye1Var.r.b(((a11) obj).a);
                return dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return Boolean.valueOf(ye1Var.r.b(((a11) obj).a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ye1Var.q.setValue(bool);
                return dm3Var;
        }
    }
}
