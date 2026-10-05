package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jb0 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ jb0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
        this.k = obj5;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                mb0 mb0Var = (mb0) obj6;
                qt1 qt1Var = (qt1) obj7;
                int i2 = 3;
                if ((((Number) obj2).intValue() & 3) == 2 && nv0Var.D()) {
                    nv0Var.U();
                } else {
                    boolean zH = nv0Var.h(qt1Var) | nv0Var.h(mb0Var);
                    l73 l73Var = (l73) obj4;
                    Object objO = nv0Var.O();
                    if (zH || objO == c20.a) {
                        objO = new v1(l73Var, qt1Var, mb0Var, 8);
                        nv0Var.j0(objO);
                    }
                    rn.g(qt1Var, (ns0) objO, nv0Var);
                    vp.i(qt1Var, (dq2) obj5, gq.N(-497631156, new z4(i2, (lb0) obj3, qt1Var), nv0Var), nv0Var, 384);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!nv0Var2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    vp.h((rs0) obj7, (rs0) obj6, (d00) obj5, (rs0) obj4, (rs0) obj3, nv0Var2, 384);
                }
                break;
        }
        return dm3Var;
    }
}
