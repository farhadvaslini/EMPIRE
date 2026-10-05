package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i50 implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ k50 g;

    public /* synthetic */ i50(k50 k50Var, int i) {
        this.f = i;
        this.g = k50Var;
    }

    @Override // defpackage.cs0
    public final Object a() {
        t73 t73Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        k50 k50Var = this.g;
        switch (i) {
            case 0:
                vr.T(k50Var);
                return dm3Var;
            case 1:
                k50Var.C.h(true);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                k50Var.C.d(true);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                k50Var.C.f();
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                vr.T(k50Var);
                return dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                k50Var.C.p();
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                k50Var.x.w.g.r.b(k50Var.D.e);
                break;
            default:
                ye1 ye1Var = k50Var.x;
                ip0 ip0Var = k50Var.E;
                boolean z = k50Var.y;
                if (!ye1Var.b()) {
                    ip0.a(ip0Var);
                } else if (!z && (t73Var = ye1Var.c) != null) {
                    ((ka0) t73Var).b();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
