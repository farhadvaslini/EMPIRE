package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 implements rs0 {
    public final /* synthetic */ long f;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ s33 h;
    public final /* synthetic */ wp1 i;
    public final /* synthetic */ ed j;
    public final /* synthetic */ x50 k;
    public final /* synthetic */ ns0 l;
    public final /* synthetic */ bq1 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ z13 p;
    public final /* synthetic */ long q;
    public final /* synthetic */ long r;
    public final /* synthetic */ rs0 s;
    public final /* synthetic */ rs0 t;
    public final /* synthetic */ d00 u;

    public rp1(long j, cs0 cs0Var, s33 s33Var, wp1 wp1Var, ed edVar, x50 x50Var, ns0 ns0Var, bq1 bq1Var, float f, boolean z, z13 z13Var, long j2, long j3, rs0 rs0Var, rs0 rs0Var2, d00 d00Var) {
        this.f = j;
        this.g = cs0Var;
        this.h = s33Var;
        this.i = wp1Var;
        this.j = edVar;
        this.k = x50Var;
        this.l = ns0Var;
        this.m = bq1Var;
        this.n = f;
        this.o = z;
        this.p = z13Var;
        this.q = j2;
        this.r = j3;
        this.s = rs0Var;
        this.t = rs0Var2;
        this.u = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            bq1 bq1VarJ = n92.J(j43.c, n92.p0);
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new fi1(8);
                nv0Var.j0(objO);
            }
            bq1 bq1VarA = su2.a(bq1VarJ, false, (ns0) objO);
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
            s33 s33Var = this.h;
            boolean z = ((t33) s33Var.c.h.getValue()) != t33.f;
            boolean z2 = this.i.c;
            long j = this.f;
            cs0 cs0Var = this.g;
            vp1.c(j, cs0Var, z, z2, nv0Var, 0);
            vp1.b(this.j, this.k, cs0Var, this.l, this.m, s33Var, this.n, this.o, this.p, this.q, this.r, 0.0f, this.s, this.t, this.u, nv0Var, 70);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
