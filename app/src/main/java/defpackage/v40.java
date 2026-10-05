package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v40 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ v40(y33 y33Var, boolean z, cs0 cs0Var, z13 z13Var, bq1 bq1Var, boolean z2, nt2 nt2Var, ln lnVar, x12 x12Var, rs0 rs0Var, d00 d00Var, int i) {
        this.j = y33Var;
        this.g = z;
        this.k = cs0Var;
        this.l = z13Var;
        this.m = bq1Var;
        this.h = z2;
        this.n = nt2Var;
        this.o = lnVar;
        this.p = x12Var;
        this.q = rs0Var;
        this.r = d00Var;
        this.i = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0129  */
    @Override // defpackage.rs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        boolean z = true;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        Object obj7 = this.n;
        Object obj8 = this.m;
        Object obj9 = this.l;
        Object obj10 = this.k;
        Object obj11 = this.j;
        switch (i) {
            case 0:
                sf3 sf3Var = (sf3) obj11;
                ye1 ye1Var = (ye1) obj10;
                hs3 hs3Var = (hs3) obj9;
                x50 x50Var = (x50) obj8;
                ns0 ns0Var = (ns0) obj7;
                bg3 bg3Var = (bg3) obj6;
                iy1 iy1Var = (iy1) obj5;
                ua0 ua0Var = (ua0) obj4;
                so soVar = (so) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                    break;
                } else {
                    c50 c50Var = new c50(ye1Var, sf3Var, hs3Var, x50Var, ns0Var, bg3Var, iy1Var, ua0Var, soVar, this.i);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, yp1.a);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(tb1.Y);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, c50Var);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    nv0Var.p(true);
                    hx0 hx0VarA = ye1Var.a();
                    hx0 hx0Var = hx0.f;
                    boolean z2 = this.g;
                    if (hx0VarA == hx0Var || ye1Var.c() == null) {
                        z = false;
                        gq.k(sf3Var, z, nv0Var, 0);
                        if (ye1Var.a() == hx0.h || this.h || !z2) {
                            nv0Var.a0(-713433638);
                            nv0Var.p(false);
                        } else {
                            nv0Var.a0(-713510518);
                            gq.n(sf3Var, nv0Var, 0);
                            nv0Var.p(false);
                        }
                        break;
                    } else {
                        ab1 ab1VarC = ye1Var.c();
                        ab1VarC.getClass();
                        if (!ab1VarC.t0() || !z2) {
                        }
                        gq.k(sf3Var, z, nv0Var, 0);
                        if (ye1Var.a() == hx0.h) {
                            nv0Var.a0(-713433638);
                            nv0Var.p(false);
                            break;
                        }
                    }
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jo3.c((y33) obj11, this.g, (cs0) obj10, (z13) obj9, (bq1) obj8, this.h, (nt2) obj7, (ln) obj6, (x12) obj5, (rs0) obj4, (d00) obj3, (nv0) obj, jo3.y(this.i | 1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ v40(sf3 sf3Var, ye1 ye1Var, boolean z, boolean z2, hs3 hs3Var, x50 x50Var, ns0 ns0Var, bg3 bg3Var, iy1 iy1Var, ua0 ua0Var, so soVar, int i) {
        this.j = sf3Var;
        this.k = ye1Var;
        this.g = z;
        this.h = z2;
        this.l = hs3Var;
        this.m = x50Var;
        this.n = ns0Var;
        this.o = bg3Var;
        this.p = iy1Var;
        this.q = ua0Var;
        this.r = soVar;
        this.i = i;
    }
}
