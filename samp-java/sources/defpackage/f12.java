package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class f12 implements rs0 {
    public final /* synthetic */ bq1 f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ se3 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ ns0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ gh3 n;
    public final /* synthetic */ o71 o;
    public final /* synthetic */ n71 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ nr3 t;
    public final /* synthetic */ qr1 u;
    public final /* synthetic */ rs0 v;
    public final /* synthetic */ rs0 w;
    public final /* synthetic */ rs0 x;
    public final /* synthetic */ rs0 y;
    public final /* synthetic */ z13 z;

    public f12(bq1 bq1Var, rs0 rs0Var, boolean z, se3 se3Var, String str, ns0 ns0Var, boolean z2, boolean z3, gh3 gh3Var, o71 o71Var, n71 n71Var, boolean z4, int i, int i2, nr3 nr3Var, qr1 qr1Var, rs0 rs0Var2, rs0 rs0Var3, rs0 rs0Var4, rs0 rs0Var5, z13 z13Var) {
        this.f = bq1Var;
        this.g = rs0Var;
        this.h = z;
        this.i = se3Var;
        this.j = str;
        this.k = ns0Var;
        this.l = z2;
        this.m = z3;
        this.n = gh3Var;
        this.o = o71Var;
        this.p = n71Var;
        this.q = z4;
        this.r = i;
        this.s = i2;
        this.t = nr3Var;
        this.u = qr1Var;
        this.v = rs0Var2;
        this.w = rs0Var3;
        this.x = rs0Var4;
        this.y = rs0Var5;
        this.z = z13Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        nv0 nv0Var = (nv0) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            rs0 rs0Var = this.g;
            bq1 bq1VarN = yp1.a;
            if (rs0Var != null) {
                nv0Var.a0(-903490605);
                Object objO = nv0Var.O();
                if (objO == c20.a) {
                    objO = new fi1(0);
                    nv0Var.j0(objO);
                }
                bq1 bq1VarA = su2.a(bq1VarN, true, (ns0) objO);
                long j = ((ol3) nv0Var.j(ql3.a)).l.b.c;
                long j2 = dl3.l;
                if ((1095216660480L & j) != 4294967296L) {
                    j = j2;
                }
                bq1VarN = f80.N(bq1VarA, 0.0f, ((ua0) nv0Var.j(s20.h)).j0(j) / 2.0f, 0.0f, 0.0f, 13);
                nv0Var.p(false);
            } else {
                nv0Var.a0(-903106918);
                nv0Var.p(false);
            }
            bq1 bq1VarD = this.f.d(bq1VarN);
            String strP = g12.P(2131623977, nv0Var);
            if (this.h) {
                bq1VarD = su2.a(bq1VarD, false, new im(10, strP));
            }
            bq1 bq1VarA2 = j43.a(bq1VarD, 280.0f, 56.0f);
            se3 se3Var = this.i;
            boolean z = this.h;
            w73 w73Var = new w73(z ? se3Var.j : se3Var.i);
            rs0 rs0Var2 = this.y;
            z13 z13Var = this.z;
            String str = this.j;
            boolean z2 = this.l;
            boolean z3 = this.q;
            nr3 nr3Var = this.t;
            qr1 qr1Var = this.u;
            wl.a(str, this.k, bq1VarA2, z2, this.m, this.n, this.o, this.p, z3, this.r, this.s, nr3Var, null, qr1Var, w73Var, gq.N(-1189274459, new e12(str, z2, z3, nr3Var, qr1Var, z, this.g, this.v, this.w, this.x, rs0Var2, se3Var, z13Var), nv0Var), nv0Var, 0);
        } else {
            nv0Var.U();
        }
        return dm3.a;
    }
}
