package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class eb3 implements rs0 {
    public final /* synthetic */ bq1 f;
    public final /* synthetic */ z13 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ln j;
    public final /* synthetic */ float k;
    public final /* synthetic */ d00 l;

    public eb3(bq1 bq1Var, z13 z13Var, long j, float f, ln lnVar, float f2, d00 d00Var) {
        this.f = bq1Var;
        this.g = z13Var;
        this.h = j;
        this.i = f;
        this.j = lnVar;
        this.k = f2;
        this.l = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        boolean zR = nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2);
        dm3 dm3Var = dm3.a;
        if (!zR) {
            nv0Var.U();
            return dm3Var;
        }
        bq1 bq1VarD = hb3.d(this.f, this.g, hb3.e(this.h, this.i, nv0Var), this.j, ((ua0) nv0Var.j(s20.h)).T(this.k));
        Object objO = nv0Var.O();
        zj zjVar = c20.a;
        if (objO == zjVar) {
            objO = new db3(0);
            nv0Var.j0(objO);
        }
        bq1 bq1VarA = su2.a(bq1VarD, false, (ns0) objO);
        Object objO2 = nv0Var.O();
        if (objO2 == zjVar) {
            objO2 = o90.c;
            nv0Var.j0(objO2);
        }
        bq1 bq1VarA2 = ob3.a(bq1VarA, dm3Var, (PointerInputEventHandler) objO2);
        cn1 cn1VarD = eo.d(f5.g, true);
        int iC = lq.C(nv0Var);
        n52 n52VarL = nv0Var.l();
        bq1 bq1VarM = lr.M(nv0Var, bq1VarA2);
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
        nc2.p(0, this.l, nv0Var, true);
        return dm3Var;
    }
}
