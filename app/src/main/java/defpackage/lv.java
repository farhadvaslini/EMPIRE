package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lv(os1 os1Var, boolean z) {
        this.f = 0;
        this.g = z;
        this.h = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        boolean z = this.g;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                os1 os1Var = (os1) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    Object objO = nv0Var.O();
                    if (objO == c20.a) {
                        objO = new yb(os1Var, 3);
                        nv0Var.j0(objO);
                    }
                    gq.m((cs0) objO, null, !z, null, null, null, vm1.j, nv0Var, 805306374, 506);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                gq.k((sf3) obj3, z, (nv0) obj, jo3.y(1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                gq.j(z, (rs0) obj3, (nv0) obj, jo3.y(1));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                f80.k(z, (cs0) obj3, (nv0) obj, jo3.y(1));
                break;
            default:
                qf0 qf0Var = (qf0) obj;
                x43 x43Var = x43.a;
                qf0.a0(qf0Var, ((r43) obj3).a(z, true), qf0Var.T(x43.b) / 2.0f, ((gy1) obj2).a, null, 120);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ lv(r43 r43Var, boolean z) {
        this.f = 4;
        this.h = r43Var;
        this.g = z;
    }

    public /* synthetic */ lv(sf3 sf3Var, boolean z, int i) {
        this.f = 1;
        this.h = sf3Var;
        this.g = z;
    }

    public /* synthetic */ lv(boolean z, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.g = z;
        this.h = zs0Var;
    }
}
