package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gv1 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public gv1(boolean z, boolean z2, qr1 qr1Var, se3 se3Var, z13 z13Var) {
        this.f = 2;
        this.g = z;
        this.h = z2;
        this.k = qr1Var;
        this.i = se3Var;
        this.j = z13Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        boolean z = this.h;
        boolean z2 = this.g;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.k;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    yu1 yu1Var = (yu1) obj5;
                    jo3.b(((wx) f43.a(!z ? yu1Var.g : z2 ? yu1Var.b : yu1Var.e, (s83) obj4, nv0Var).getValue()).a, ql3.a(cl3.m0, nv0Var), (rs0) obj3, nv0Var, 0);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    tv1 tv1Var = (tv1) obj5;
                    jo3.b(((wx) f43.a(!z ? tv1Var.g : z2 ? tv1Var.b : tv1Var.e, (s83) obj4, nv0Var2).getValue()).a, ql3.a(f80.x0, nv0Var2), (rs0) obj3, nv0Var2, 0);
                }
                break;
            default:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    f5.h0.f(this.g, this.h, (qr1) obj5, null, (se3) obj4, (z13) obj3, 0.0f, 0.0f, nv0Var3, 100663296, 200);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ gv1(Object obj, boolean z, boolean z2, s83 s83Var, rs0 rs0Var, int i) {
        this.f = i;
        this.k = obj;
        this.g = z;
        this.h = z2;
        this.i = s83Var;
        this.j = rs0Var;
    }
}
