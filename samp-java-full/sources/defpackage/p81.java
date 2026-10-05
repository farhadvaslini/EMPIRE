package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p81 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ os1 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ os1 i;
    public final /* synthetic */ zs0 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ p81(cs0 cs0Var, x50 x50Var, vi2 vi2Var, vg2 vg2Var, os1 os1Var, os1 os1Var2, os1 os1Var3) {
        this.j = cs0Var;
        this.k = x50Var;
        this.l = vi2Var;
        this.m = vg2Var;
        this.g = os1Var;
        this.h = os1Var2;
        this.i = os1Var3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        zs0 zs0Var = this.j;
        switch (i) {
            case 0:
                us0 us0Var = (us0) zs0Var;
                os1 os1Var = (os1) obj5;
                os1 os1Var2 = (os1) obj4;
                os1 os1Var3 = (os1) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    boolean zF = nv0Var.f(us0Var);
                    Object objO = nv0Var.O();
                    if (zF || objO == zjVar) {
                        t81 t81Var = new t81(us0Var, this.g, this.h, this.i, os1Var, os1Var2, os1Var3);
                        nv0Var.j0(t81Var);
                        objO = t81Var;
                    }
                    gq.m((cs0) objO, null, false, null, null, null, rn.k, nv0Var, 805306368, 510);
                }
                break;
            default:
                cs0 cs0Var = (cs0) zs0Var;
                x50 x50Var = (x50) obj5;
                vi2 vi2Var = (vi2) obj4;
                vg2 vg2Var = (vg2) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    mg2 mg2Var = (mg2) this.h.getValue();
                    boolean zH = nv0Var2.h(x50Var) | nv0Var2.h(vi2Var) | nv0Var2.h(vg2Var);
                    Object objO2 = nv0Var2.O();
                    if (zH || objO2 == zjVar) {
                        objO2 = new uo(x50Var, vi2Var, vg2Var);
                        nv0Var2.j0(objO2);
                    }
                    cs0 cs0Var2 = (cs0) ((ct0) objO2);
                    boolean zH2 = nv0Var2.h(vi2Var);
                    Object objO3 = nv0Var2.O();
                    if (zH2 || objO3 == zjVar) {
                        c91 c91Var = new c91(0, vi2Var, vi2.class, "disconnect", "disconnect()V", 0, 0, 24);
                        nv0Var2.j0(c91Var);
                        objO3 = c91Var;
                    }
                    cs0 cs0Var3 = (cs0) ((ct0) objO3);
                    os1 os1Var4 = this.g;
                    boolean zF2 = nv0Var2.f(os1Var4) | nv0Var2.h(vg2Var);
                    Object objO4 = nv0Var2.O();
                    if (zF2 || objO4 == zjVar) {
                        objO4 = new ok(vg2Var, os1Var4, this.i, 18);
                        nv0Var2.j0(objO4);
                    }
                    oz2.e(mg2Var, cs0Var, cs0Var2, cs0Var3, null, (cs0) objO4, vg2Var.f.length() > 0, nv0Var2, 0);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ p81(us0 us0Var, os1 os1Var, os1 os1Var2, os1 os1Var3, os1 os1Var4, os1 os1Var5, os1 os1Var6) {
        this.j = us0Var;
        this.g = os1Var;
        this.h = os1Var2;
        this.i = os1Var3;
        this.k = os1Var4;
        this.l = os1Var5;
        this.m = os1Var6;
    }
}
