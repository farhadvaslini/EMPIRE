package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class od extends u71 implements rs0 {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ Object h;
    public final /* synthetic */ ns0 i;
    public final /* synthetic */ d00 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(Object obj, bq1 bq1Var, ns0 ns0Var, h5 h5Var, String str, ns0 ns0Var2, d00 d00Var, int i) {
        super(2);
        this.h = obj;
        this.k = bq1Var;
        this.i = ns0Var;
        this.l = h5Var;
        this.m = str;
        this.n = ns0Var2;
        this.j = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.g;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Number) obj2).intValue();
                j52 j52Var = (j52) obj5;
                zd zdVar = (zd) obj4;
                gk3 gk3Var = (gk3) obj6;
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    d42 d42Var = gk3Var.e;
                    d42 d42Var2 = gk3Var.d;
                    Object value = d42Var.getValue();
                    Object obj7 = this.h;
                    boolean zG = nv0Var.g(s51.n(obj7, value));
                    Object objO = nv0Var.O();
                    ns0 ns0Var = this.i;
                    zj zjVar = c20.a;
                    if (zG || objO == zjVar) {
                        objO = (!s51.n(obj7, d42Var.getValue()) || j52Var == null) ? (s51.n(obj7, gk3Var.f().a()) || s51.n(obj7, gk3Var.f().c())) ? (e40) ns0Var.h(zdVar) : (e40) ns0Var.h(new j52(zdVar, gk3Var.f().a(), obj7)) : (e40) ns0Var.h(j52Var);
                        nv0Var.j0(objO);
                    }
                    e40 e40Var = (e40) objO;
                    boolean zG2 = nv0Var.g(s51.n(gk3Var.f().c(), obj7)) | nv0Var.g(s51.n(obj7, d42Var.getValue()));
                    Object objO2 = nv0Var.O();
                    if (zG2 || objO2 == zjVar) {
                        objO2 = (s51.n(gk3Var.f().c(), obj7) || (s51.n(obj7, d42Var.getValue()) && j52Var != null)) ? ek0.b : (s51.n(obj7, gk3Var.f().a()) || s51.n(obj7, gk3Var.f().c())) ? ((e40) ns0Var.h(zdVar)).b : ((e40) ns0Var.h(new j52(zdVar, obj7, gk3Var.f().a()))).b;
                        nv0Var.j0(objO2);
                    }
                    ek0 ek0Var = (ek0) objO2;
                    Object objO3 = nv0Var.O();
                    if (objO3 == zjVar) {
                        objO3 = new ud(s51.n(obj7, d42Var2.getValue()));
                        nv0Var.j0(objO3);
                    }
                    ud udVar = (ud) objO3;
                    ij0 ij0Var = e40Var.a;
                    zu3 zu3Var = new zu3(e40Var.c.g(), obj7);
                    udVar.a.setValue(Boolean.valueOf(s51.n(obj7, d42Var2.getValue())));
                    udVar.b.setValue(Boolean.valueOf((!s51.n(obj7, d42Var.getValue()) || s51.n(obj7, d42Var2.getValue()) || s51.n(obj7, gk3Var.a.h())) ? false : true));
                    bq1 bq1VarD = zu3Var.d(udVar);
                    gk3 gk3Var2 = (gk3) obj6;
                    boolean zH = nv0Var.h(obj7);
                    Object objO4 = nv0Var.O();
                    if (zH || objO4 == zjVar) {
                        objO4 = new kd(0, obj7);
                        nv0Var.j0(objO4);
                    }
                    ns0 ns0Var2 = (ns0) objO4;
                    boolean zF = nv0Var.f(ek0Var);
                    Object objO5 = nv0Var.O();
                    if (zF || objO5 == zjVar) {
                        objO5 = new ld(ek0Var);
                        nv0Var.j0(objO5);
                    }
                    vm1.a(gk3Var2, ns0Var2, bq1VarD, ij0Var, ek0Var, (rs0) objO5, gq.N(1831990167, new nd(obj7, (l73) obj3, zdVar, this.j), nv0Var), nv0Var, 100663296);
                }
                break;
            default:
                ((Number) obj2).intValue();
                w7.b(this.h, (bq1) obj6, this.i, (h5) obj5, (String) obj4, (ns0) obj3, this.j, (nv0) obj, jo3.y(1597825));
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(Object obj, gk3 gk3Var, j52 j52Var, ns0 ns0Var, zd zdVar, l73 l73Var, d00 d00Var) {
        super(2);
        this.h = obj;
        this.k = gk3Var;
        this.l = j52Var;
        this.i = ns0Var;
        this.m = zdVar;
        this.n = l73Var;
        this.j = d00Var;
    }
}
