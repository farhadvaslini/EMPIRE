package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fb3 implements rs0 {
    public final /* synthetic */ bq1 f;
    public final /* synthetic */ z13 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ln j;
    public final /* synthetic */ qr1 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ cs0 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ d00 o;

    public fb3(bq1 bq1Var, z13 z13Var, long j, float f, ln lnVar, qr1 qr1Var, boolean z, cs0 cs0Var, float f2, d00 d00Var) {
        this.f = bq1Var;
        this.g = z13Var;
        this.h = j;
        this.i = f;
        this.j = lnVar;
        this.k = qr1Var;
        this.l = z;
        this.m = cs0Var;
        this.n = f2;
        this.o = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            ry0 ry0Var = w41.a;
            bq1 bq1VarR = lr.r(rn.x(hb3.d(this.f.d(ep1.a), this.g, hb3.e(this.h, this.i, nv0Var), this.j, ((ua0) nv0Var.j(s20.h)).T(this.n)), this.k, ko2.a(0.0f, 7, 0L, false), this.l, null, this.m, 24));
            cn1 cn1VarD = eo.d(f5.g, true);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarR);
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
            nc2.p(0, this.o, nv0Var, true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
