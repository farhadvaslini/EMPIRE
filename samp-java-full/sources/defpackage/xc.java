package defpackage;

import java.util.Iterator;
import java.util.List;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ xc(z53 z53Var, bq1 bq1Var, int i) {
        this.f = 12;
        d00 d00Var = a10.a;
        this.h = z53Var;
        this.i = bq1Var;
        this.g = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        int i2 = 2;
        dm3 dm3Var = dm3.a;
        int i3 = this.g;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                cl3.a(jo3.y(i3 | 1), (ns0) obj4, (nv0) obj, (bq1) obj3);
                break;
            case 1:
                ((Integer) obj2).intValue();
                cf.a((af) obj4, (List) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                ((d00) obj4).i(obj3, (nv0) obj, jo3.y(i3) | 1);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).intValue();
                vr.c((he2) obj4, (rs0) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                vr.d((he2[]) obj4, (rs0) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                gv3.m((String) obj4, (d00) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ad1 ad1Var = (ad1) obj4;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    ad1Var.d(i3, obj3, nv0Var, 0);
                }
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                ((be1) obj4).d(i3, obj3, (nv0) obj, jo3.y(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((v22) obj4).d(i3, obj3, (nv0) obj, jo3.y(1));
                break;
            case vr.g /* 9 */:
                ((Integer) obj2).getClass();
                vm1.j((cs0) obj4, (bq1) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            case vr.h /* 10 */:
                ((Integer) obj2).getClass();
                f80.q((String) obj4, (w01) obj3, (nv0) obj, jo3.y(1), i3);
                break;
            case 11:
                z00 z00Var = f5.C;
                z00 z00Var2 = f5.F;
                z00 z00Var3 = f5.D;
                z00 z00Var4 = f5.E;
                List list = (List) obj3;
                ns0 ns0Var = (ns0) obj4;
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else {
                    qy qyVarA = oy.a(n92.d, f5.s, nv0Var2, 0);
                    int iHashCode = Long.hashCode(nv0Var2.T);
                    n52 n52VarL = nv0Var2.l();
                    yp1 yp1Var = yp1.a;
                    bq1 bq1VarM = lr.M(nv0Var2, yp1Var);
                    w10.c.getClass();
                    nv0Var2.d0();
                    boolean z = nv0Var2.S;
                    x91 x91Var = tb1.Y;
                    if (z) {
                        nv0Var2.k(x91Var);
                    } else {
                        nv0Var2.m0();
                    }
                    y02.F(z00Var4, nv0Var2, qyVarA);
                    y02.F(z00Var3, nv0Var2, n52VarL);
                    y02.F(z00Var2, nv0Var2, Integer.valueOf(iHashCode));
                    y02.C(nv0Var2);
                    y02.F(z00Var, nv0Var2, bq1VarM);
                    nv0Var2.a0(-1810036425);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int iIntValue3 = ((Number) it.next()).intValue();
                        bq1 bq1VarC = j43.c(yp1Var, 1.0f);
                        boolean zF = nv0Var2.f(ns0Var) | nv0Var2.d(iIntValue3);
                        Object objO = nv0Var2.O();
                        if (zF || objO == c20.a) {
                            objO = new wt0(iIntValue3, i2, ns0Var);
                            nv0Var2.j0(objO);
                        }
                        bq1 bq1VarK = f80.K(gv3.x(3, (cs0) objO, bq1VarC, false), 4.0f, 12.0f);
                        dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
                        yp1 yp1Var2 = yp1Var;
                        int iHashCode2 = Long.hashCode(nv0Var2.T);
                        n52 n52VarL2 = nv0Var2.l();
                        bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarK);
                        w10.c.getClass();
                        nv0Var2.d0();
                        if (nv0Var2.S) {
                            nv0Var2.k(x91Var);
                        } else {
                            nv0Var2.m0();
                        }
                        y02.F(z00Var4, nv0Var2, dp2VarA);
                        y02.F(z00Var3, nv0Var2, n52VarL2);
                        y02.F(z00Var2, nv0Var2, Integer.valueOf(iHashCode2));
                        y02.C(nv0Var2);
                        y02.F(z00Var, nv0Var2, bq1VarM2);
                        w22.a(iIntValue3 == i3, null, false, null, nv0Var2, 48);
                        oz2.g(nv0Var2, j43.o(yp1Var2, 16.0f));
                        nv0 nv0Var3 = nv0Var2;
                        mg3.b(oz2.N(R.string.launcher_fps_value, new Object[]{Integer.valueOf(iIntValue3)}, nv0Var2), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var2.j(ql3.a)).j, nv0Var3, 0, 0, 131070);
                        nv0Var2 = nv0Var3;
                        nv0Var2.p(true);
                        yp1Var = yp1Var2;
                        x91Var = x91Var;
                        i2 = 2;
                    }
                    nv0Var2.p(false);
                    nv0Var2.p(true);
                }
                break;
            case vr.i /* 12 */:
                d00 d00Var = a10.a;
                ((Integer) obj2).getClass();
                oz2.d((z53) obj4, (bq1) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                mg3.a((gh3) obj4, (rs0) obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((gk3) obj4).a(obj3, (nv0) obj, jo3.y(i3 | 1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ xc(int i, int i2, Object obj, Object obj2) {
        this.f = i2;
        this.h = obj;
        this.i = obj2;
        this.g = i;
    }

    public /* synthetic */ xc(int i, ad1 ad1Var, Object obj) {
        this.f = 6;
        this.h = ad1Var;
        this.g = i;
        this.i = obj;
    }

    public /* synthetic */ xc(ad1 ad1Var, int i, Object obj, int i2, int i3) {
        this.f = i3;
        this.h = ad1Var;
        this.g = i;
        this.i = obj;
    }

    public /* synthetic */ xc(int i, int i2, w01 w01Var, String str) {
        this.f = 10;
        this.h = str;
        this.i = w01Var;
        this.g = i2;
    }

    public /* synthetic */ xc(List list, ns0 ns0Var, int i) {
        this.f = 11;
        this.i = list;
        this.h = ns0Var;
        this.g = i;
    }
}
