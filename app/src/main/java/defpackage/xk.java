package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ zs0 h;
    public final /* synthetic */ int i;

    public /* synthetic */ xk(int i, boolean z, cs0 cs0Var, int i2) {
        this.f = 2;
        this.i = i;
        this.g = z;
        this.h = cs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.i;
        zs0 zs0Var = this.h;
        boolean z = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                gv3.b(z, (cs0) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                w7.d(z, (cs0) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                r51.i(i2, z, (cs0) zs0Var, (nv0) obj, jo3.y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                t22.e(z, (rs0) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ xk(boolean z, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.g = z;
        this.h = zs0Var;
        this.i = i;
    }
}
