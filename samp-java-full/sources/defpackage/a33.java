package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a33 extends u71 implements ss0 {
    public final /* synthetic */ he g;
    public final /* synthetic */ ij0 h;
    public final /* synthetic */ ek0 i;
    public final /* synthetic */ y23 j;
    public final /* synthetic */ mr2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a33(he heVar, ij0 ij0Var, ek0 ek0Var, y23 y23Var, mr2 mr2Var) {
        super(3);
        this.g = heVar;
        this.h = ij0Var;
        this.i = ek0Var;
        this.j = y23Var;
        this.k = mr2Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        nv0 nv0Var = (nv0) obj2;
        ((Number) obj3).intValue();
        nv0Var.a0(-233734437);
        gk3 gk3VarA = this.g.a();
        y23 y23Var = this.j;
        boolean zH = nv0Var.h(y23Var);
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (zH || objO == zjVar) {
            objO = new z23(y23Var, 0);
            nv0Var.j0(objO);
        }
        bq1 bq1VarB = dj0.b(gk3VarA, this.h, this.i, (cs0) objO, null, "enter/exit for " + ((Object) y23Var.a), nv0Var, 0, 20);
        nv0Var.a0(-1039792755);
        boolean zH2 = nv0Var.h(y23Var);
        Object objO2 = nv0Var.O();
        if (zH2 || objO2 == zjVar) {
            objO2 = new z23(y23Var, 1);
            nv0Var.j0(objO2);
        }
        cs0 cs0Var = (cs0) objO2;
        zj zjVar2 = d40.c;
        zj zjVar3 = d40.a;
        bq1 bq1VarZ = yp1.a;
        if (zjVar2 == zjVar3) {
            bq1VarZ = vm1.z(bq1VarZ, new kd(7, cs0Var));
        }
        bq1 bq1VarD = bq1VarZ.d(new m43(this.k, cs0Var));
        nv0Var.p(false);
        bq1 bq1VarD2 = bq1VarB.d(bq1VarD);
        nv0Var.p(false);
        return bq1VarD2;
    }
}
