package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class a5 implements rs0 {
    public final /* synthetic */ rs0 f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ rs0 h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ d00 m;

    public a5(rs0 rs0Var, rs0 rs0Var2, rs0 rs0Var3, long j, long j2, long j3, long j4, d00 d00Var) {
        this.f = rs0Var;
        this.g = rs0Var2;
        this.h = rs0Var3;
        this.i = j;
        this.j = j2;
        this.k = j3;
        this.l = j4;
        this.m = d00Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = 1;
        int i2 = 0;
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            bq1 bq1VarI = f80.I(yp1.a, e5.a);
            qy qyVarA = oy.a(n92.d, f5.s, nv0Var, 0);
            int iC = lq.C(nv0Var);
            n52 n52VarL = nv0Var.l();
            bq1 bq1VarM = lr.M(nv0Var, bq1VarI);
            w10.c.getClass();
            nv0Var.d0();
            boolean z = nv0Var.S;
            x91 x91Var = tb1.Y;
            if (z) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            z00 z00Var = f5.E;
            y02.F(z00Var, nv0Var, qyVarA);
            z00 z00Var2 = f5.D;
            y02.F(z00Var2, nv0Var, n52VarL);
            z00 z00Var3 = f5.F;
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC))) {
                nc2.q(iC, nv0Var, iC, z00Var3);
            }
            z00 z00Var4 = f5.C;
            y02.F(z00Var4, nv0Var, bq1VarM);
            rs0 rs0Var = this.f;
            if (rs0Var == null) {
                nv0Var.a0(346092326);
            } else {
                nv0Var.a0(346092327);
                vr.c(nc2.f(this.i, t30.a), gq.N(-1128150638, new y4(i2, rs0Var), nv0Var), nv0Var, 56);
            }
            nv0Var.p(false);
            rs0 rs0Var2 = this.g;
            if (rs0Var2 == null) {
                nv0Var.a0(346396529);
            } else {
                nv0Var.a0(346396530);
                jo3.b(this.j, ql3.a(r51.x1, nv0Var), gq.N(71284337, new z4(0, rs0Var, rs0Var2), nv0Var), nv0Var, 384);
            }
            nv0Var.p(false);
            rs0 rs0Var3 = this.h;
            if (rs0Var3 == null) {
                nv0Var.a0(347174009);
            } else {
                nv0Var.a0(347174010);
                jo3.b(this.k, ql3.a(r51.z1, nv0Var), gq.N(705583346, new y4(i, rs0Var3), nv0Var), nv0Var, 384);
            }
            nv0Var.p(false);
            py0 py0Var = new py0(f5.u);
            cn1 cn1VarD = eo.d(f5.g, false);
            int iC2 = lq.C(nv0Var);
            n52 n52VarL2 = nv0Var.l();
            bq1 bq1VarM2 = lr.M(nv0Var, py0Var);
            nv0Var.d0();
            if (nv0Var.S) {
                nv0Var.k(x91Var);
            } else {
                nv0Var.m0();
            }
            y02.F(z00Var, nv0Var, cn1VarD);
            y02.F(z00Var2, nv0Var, n52VarL2);
            if (nv0Var.S || !s51.n(nv0Var.O(), Integer.valueOf(iC2))) {
                nc2.q(iC2, nv0Var, iC2, z00Var3);
            }
            y02.F(z00Var4, nv0Var, bq1VarM2);
            jo3.b(this.l, ql3.a(r51.t1, nv0Var), this.m, nv0Var, 0);
            nv0Var.p(true);
            nv0Var.p(true);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
