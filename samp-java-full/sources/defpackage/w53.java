package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w53 implements ss0 {
    public final /* synthetic */ z53 f;
    public final /* synthetic */ z53 g;
    public final /* synthetic */ el0 h;
    public final /* synthetic */ String i;

    public w53(z53 z53Var, z53 z53Var2, el0 el0Var, String str) {
        this.f = z53Var;
        this.g = z53Var2;
        this.h = el0Var;
        this.i = str;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        Object obj4;
        float f;
        ed edVar;
        Boolean bool;
        rs0 rs0Var = (rs0) obj;
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        int i = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= nv0Var.h(rs0Var) ? 4 : 2;
        }
        if (nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            z53 z53Var = this.g;
            Object obj5 = this.f;
            boolean zN = s51.n(obj5, z53Var);
            Object objR = uq.R(pq1.i, nv0Var);
            boolean zF = nv0Var.f(obj5);
            Object obj6 = this.h;
            boolean zH = zF | nv0Var.h(obj6);
            Object objO = nv0Var.O();
            Object obj7 = c20.a;
            if (zH || objO == obj7) {
                objO = new me1(24, obj5, obj6);
                nv0Var.j0(objO);
            }
            Object obj8 = (cs0) objO;
            Object objO2 = nv0Var.O();
            if (objO2 == obj7) {
                objO2 = gv3.a(!zN ? 1.0f : 0.0f, 0.01f);
                nv0Var.j0(objO2);
            }
            ed edVar2 = (ed) objO2;
            Boolean boolValueOf = Boolean.valueOf(zN);
            boolean zH2 = nv0Var.h(edVar2) | nv0Var.g(zN) | nv0Var.h(objR) | nv0Var.f(obj8);
            Object objO3 = nv0Var.O();
            if (zH2 || objO3 == obj7) {
                obj4 = obj7;
                f = 0.01f;
                edVar = edVar2;
                bool = boolValueOf;
                objO3 = new na2(edVar, zN, objR, obj8, null, 2);
                nv0Var.j0(objO3);
            } else {
                edVar = edVar2;
                obj4 = obj7;
                bool = boolValueOf;
                f = 0.01f;
            }
            rn.l((rs0) objO3, nv0Var, bool);
            pe peVar = edVar.c;
            s83 s83VarR = uq.R(pq1.g, nv0Var);
            Object objO4 = nv0Var.O();
            if (objO4 == obj4) {
                objO4 = gv3.a(zN ? 0.8f : 1.0f, f);
                nv0Var.j0(objO4);
            }
            ed edVar3 = (ed) objO4;
            Boolean boolValueOf2 = Boolean.valueOf(zN);
            boolean zH3 = nv0Var.h(edVar3) | nv0Var.g(zN) | nv0Var.h(s83VarR);
            Object objO5 = nv0Var.O();
            if (zH3 || objO5 == obj4) {
                objO5 = new y53(edVar3, zN, s83VarR, null);
                nv0Var.j0(objO5);
            }
            rn.l((rs0) objO5, nv0Var, boolValueOf2);
            pe peVar2 = edVar3.c;
            bq1 bq1VarB = vm1.B(yp1.a, ((Number) peVar2.g.getValue()).floatValue(), ((Number) peVar2.g.getValue()).floatValue(), ((Number) peVar.g.getValue()).floatValue(), 0.0f, null, 131064);
            boolean zG = nv0Var.g(zN) | nv0Var.f(obj5);
            Object obj9 = this.i;
            boolean zF2 = zG | nv0Var.f(obj9);
            Object objO6 = nv0Var.O();
            if (zF2 || objO6 == obj4) {
                objO6 = new vv(zN, obj9, obj5, i);
                nv0Var.j0(objO6);
            }
            bq1 bq1VarA = su2.a(bq1VarB, false, (ns0) objO6);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarA);
            w10.c.getClass();
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(tb1.Y);
            } else {
                nv0Var.m0();
            }
            y02.F(f5.E, nv0Var, cn1VarD);
            y02.F(f5.D, nv0Var, n52VarL);
            z00 z00Var = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var);
            }
            y02.F(f5.C, nv0Var, bq1VarM);
            rs0Var.f(nv0Var, Integer.valueOf(iIntValue & 14));
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
