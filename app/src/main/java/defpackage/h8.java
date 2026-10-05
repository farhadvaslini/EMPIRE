package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h8 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h8(int i, int i2, String str) {
        this.f = 4;
        this.h = str;
        this.g = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.g;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k8.b((bq1) obj3, (nv0) obj, jo3.y(1), i2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ur.h((cs0) obj3, (nv0) obj, jo3.y(i2 | 1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                be1 be1Var = (be1) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    h51 h51VarD = be1Var.b.g.d(i2);
                    ((zd1) h51VarD.c).c.l(be1Var.c, Integer.valueOf(i2 - h51VarD.a), nv0Var, 0);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                v22 v22Var = (v22) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    h51 h51VarD2 = v22Var.b.G().d(i2);
                    ((q22) h51VarD2.c).b.l(z22.a, Integer.valueOf(i2 - h51VarD2.a), nv0Var2, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                g12.t((String) obj3, i2, (nv0) obj, jo3.y(7));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ h8(int i, int i2, Object obj) {
        this.f = i2;
        this.h = obj;
        this.g = i;
    }

    public /* synthetic */ h8(bq1 bq1Var, int i, int i2) {
        this.f = 0;
        this.h = bq1Var;
        this.g = i2;
    }
}
