package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o91 implements rs0 {
    public final /* synthetic */ int f = 2;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ zs0 k;
    public final /* synthetic */ Object l;

    public /* synthetic */ o91(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, cs0 cs0Var5, cs0 cs0Var6, int i) {
        this.h = cs0Var;
        this.j = cs0Var2;
        this.k = cs0Var3;
        this.l = cs0Var4;
        this.i = cs0Var5;
        this.g = cs0Var6;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        boolean z;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.g;
        Object obj4 = this.i;
        Object obj5 = this.l;
        zs0 zs0Var = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                q92 q92Var = (q92) obj4;
                String str = (String) obj3;
                cs0 cs0Var = (cs0) obj6;
                cs0 cs0Var2 = (cs0) zs0Var;
                cs0 cs0Var3 = (cs0) obj5;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    qy qyVarA = oy.a(n92.d, f5.u, nv0Var, 48);
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
                    y02.F(f5.E, nv0Var, qyVarA);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    String str2 = q92Var.f;
                    if (str2 == null) {
                        nv0Var.a0(1360764789);
                        nv0Var.p(false);
                        z = false;
                    } else {
                        nv0Var.a0(1360764790);
                        d00 d00VarN = gq.N(2037160322, new oy0(3, str2), nv0Var);
                        z = false;
                        gq.m(cs0Var3, null, false, null, null, null, d00VarN, nv0Var, 805306368, 510);
                        nv0Var.p(false);
                    }
                    if (str != null) {
                        nv0Var.a0(1361171355);
                        gq.m(this.h, null, false, null, null, null, f80.n, nv0Var, 805306368, 510);
                        nv0Var.p(z);
                    } else {
                        nv0Var.a0(1361365477);
                        nv0Var.p(z);
                    }
                    gq.m(cs0Var, null, false, null, null, null, f80.o, nv0Var, 805306368, 510);
                    gq.m(cs0Var2, null, false, null, null, null, f80.p, nv0Var, 805306368, 510);
                    nv0Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                rn.s((List) obj4, (lf2) obj6, (String) obj3, (ns0) zs0Var, this.h, (bq1) obj5, (nv0) obj, jo3.y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                p03.t(this.h, (cs0) obj6, (cs0) zs0Var, (cs0) obj5, (cs0) obj4, (cs0) obj3, (nv0) obj, jo3.y(1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ o91(q92 q92Var, String str, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4) {
        this.i = q92Var;
        this.g = str;
        this.h = cs0Var;
        this.j = cs0Var2;
        this.k = cs0Var3;
        this.l = cs0Var4;
    }

    public /* synthetic */ o91(List list, lf2 lf2Var, String str, ns0 ns0Var, cs0 cs0Var, bq1 bq1Var, int i) {
        this.i = list;
        this.j = lf2Var;
        this.g = str;
        this.k = ns0Var;
        this.h = cs0Var;
        this.l = bq1Var;
    }
}
