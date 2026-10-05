package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fw implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ fw(String str, ns0 ns0Var, cs0 cs0Var, boolean z) {
        this.f = 2;
        this.h = str;
        this.i = ns0Var;
        this.j = cs0Var;
        this.g = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        zj zjVar = c20.a;
        boolean z = this.g;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                tw twVar = (tw) obj5;
                x31 x31Var = (x31) obj4;
                os1 os1Var = (os1) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    boolean zH = nv0Var.h(twVar) | nv0Var.h(x31Var);
                    Object objO = nv0Var.O();
                    if (zH || objO == zjVar) {
                        objO = new ok(twVar, x31Var, os1Var, 3);
                        nv0Var.j0(objO);
                    }
                    gq.m((cs0) objO, null, !z, null, null, null, vm1.i, nv0Var, 805306368, 506);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                yh1.b((bq1) obj5, this.g, (ss0) obj4, (d00) obj3, (nv0) obj, jo3.y(3079));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                String str = (String) obj5;
                ns0 ns0Var = (ns0) obj4;
                cs0 cs0Var = (cs0) obj3;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    b32.a(str, ns0Var, cs0Var, null, this.g, nv0Var2, 0);
                }
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                lj0 lj0Var = (lj0) obj5;
                i90 i90Var = (i90) obj4;
                x50 x50Var = (x50) obj3;
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else if (!z) {
                    nv0Var3.a0(1739473822);
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var3, 0);
                    int iHashCode = Long.hashCode(nv0Var3.T);
                    n52 n52VarL = nv0Var3.l();
                    bq1 bq1VarM = lr.M(nv0Var3, yp1.a);
                    w10.c.getClass();
                    nv0Var3.d0();
                    if (nv0Var3.S) {
                        nv0Var3.k(tb1.Y);
                    } else {
                        nv0Var3.m0();
                    }
                    y02.F(f5.E, nv0Var3, qyVarA);
                    y02.F(f5.D, nv0Var3, n52VarL);
                    y02.F(f5.F, nv0Var3, Integer.valueOf(iHashCode));
                    y02.C(nv0Var3);
                    y02.F(f5.C, nv0Var3, bq1VarM);
                    mj0 mj0Var = (mj0) lj0Var;
                    si2 si2Var = (si2) mj0Var.get(i90Var.k());
                    boolean zH2 = nv0Var3.h(x50Var) | nv0Var3.f(i90Var) | nv0Var3.h(mj0Var);
                    Object objO2 = nv0Var3.O();
                    Object obj6 = objO2;
                    if (zH2 || objO2 == zjVar) {
                        yh2 yh2Var = new yh2(x50Var, i90Var, mj0Var, z ? 1 : 0);
                        nv0Var3.j0(yh2Var);
                        obj6 = yh2Var;
                    }
                    vm1.k(si2Var, (ns0) obj6, nv0Var3, 0);
                    nv0Var3.p(true);
                    nv0Var3.p(false);
                } else {
                    nv0Var3.a0(1739887052);
                    nv0Var3.p(false);
                }
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                w7.w((List) obj5, this.g, (ns0) obj4, (bq1) obj3, (nv0) obj, jo3.y(1));
                break;
            default:
                pn3 pn3Var = (pn3) obj5;
                cs0 cs0Var2 = (cs0) obj4;
                cs0 cs0Var3 = (cs0) obj3;
                nv0 nv0Var4 = (nv0) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!nv0Var4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    nv0Var4.U();
                } else if (pn3Var instanceof ln3) {
                    nv0Var4.a0(629929014);
                    gq.m(cs0Var2, null, false, null, null, null, vm1.N, nv0Var4, 805306368, 510);
                    nv0Var4.p(false);
                } else if (!z) {
                    nv0Var4.a0(630098646);
                    gq.m(cs0Var3, null, false, null, null, null, vm1.O, nv0Var4, 805306368, 510);
                    nv0Var4.p(false);
                } else {
                    nv0Var4.a0(630246640);
                    nv0Var4.p(false);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ fw(Object obj, boolean z, zs0 zs0Var, Object obj2, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = z;
        this.i = zs0Var;
        this.j = obj2;
    }

    public /* synthetic */ fw(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.g = z;
        this.j = obj3;
    }

    public /* synthetic */ fw(boolean z, lj0 lj0Var, i90 i90Var, x50 x50Var) {
        this.f = 3;
        this.g = z;
        this.h = lj0Var;
        this.i = i90Var;
        this.j = x50Var;
    }
}
