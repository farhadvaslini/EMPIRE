package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class xa {
    public static final t20 a = new t20(new v3(9));
    public static final t20 b = new t20(new v3(10));

    /* JADX WARN: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ub2 ub2Var, cs0 cs0Var, vb2 vb2Var, d00 d00Var, nv0 nv0Var, int i, int i2) {
        int i3;
        cs0 cs0Var2;
        vb2 vb2Var2;
        int i4;
        cs0 cs0Var3;
        xj2 xj2VarT;
        String str;
        int i5;
        int i6;
        rb2 rb2Var;
        bb1 bb1Var;
        ub2 ub2Var2 = ub2Var;
        nv0Var.b0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (nv0Var.f(ub2Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                cs0Var2 = cs0Var;
                i3 |= nv0Var.h(cs0Var2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                vb2Var2 = vb2Var;
                i3 |= nv0Var.f(vb2Var2) ? 256 : 128;
            } else {
                vb2Var2 = vb2Var;
            }
            if ((i & 3072) == 0) {
                i3 |= nv0Var.h(d00Var) ? 2048 : 1024;
            }
            i4 = i3;
            if (nv0Var.R(i4 & 1, (i4 & 1171) == 1170)) {
                nv0Var.U();
                cs0Var3 = cs0Var2;
            } else {
                cs0 cs0Var4 = i7 != 0 ? null : cs0Var2;
                View view = (View) nv0Var.j(x7.f);
                ua0 ua0Var = (ua0) nv0Var.j(s20.h);
                String str2 = (String) nv0Var.j(a);
                bb1 bb1Var2 = (bb1) nv0Var.j(s20.n);
                lv0 lv0VarW = lq.W(nv0Var);
                os1 os1VarZ = b32.z(d00Var, nv0Var);
                Object[] objArr = new Object[0];
                Object objO = nv0Var.O();
                Object obj = c20.a;
                Object obj2 = objO;
                if (objO == obj) {
                    Object v3Var = new v3(11);
                    nv0Var.j0(v3Var);
                    obj2 = v3Var;
                }
                UUID uuid = (UUID) oz2.G(objArr, (cs0) obj2, nv0Var);
                boolean zBooleanValue = ((Boolean) nv0Var.j(b)).booleanValue();
                Object objO2 = nv0Var.O();
                if (objO2 == obj) {
                    str = str2;
                    i5 = 0;
                    rb2 rb2Var2 = new rb2(cs0Var4, vb2Var2, str, view, ua0Var, ub2Var2, uuid, zBooleanValue);
                    ub2Var2 = ub2Var2;
                    rb2Var2.n(lv0VarW, new d00(-297523940, new pa(rb2Var2, os1VarZ, i5), true));
                    nv0Var.j0(rb2Var2);
                    objO2 = rb2Var2;
                } else {
                    str = str2;
                    i5 = 0;
                }
                rb2 rb2Var3 = (rb2) objO2;
                int i8 = i4 & 112;
                int i9 = i4 & 896;
                int i10 = (nv0Var.h(rb2Var3) ? 1 : 0) | (i8 == 32 ? 1 : i5) | (i9 == 256 ? 1 : i5) | (nv0Var.f(str) ? 1 : 0) | (nv0Var.d(bb1Var2.ordinal()) ? 1 : 0);
                Object objO3 = nv0Var.O();
                if (i10 != 0 || objO3 == obj) {
                    i6 = i4;
                    rb2Var = rb2Var3;
                    Object a4Var = new a4(rb2Var, cs0Var4, vb2Var, str, bb1Var2);
                    nv0Var.j0(a4Var);
                    objO3 = a4Var;
                } else {
                    i6 = i4;
                    rb2Var = rb2Var3;
                }
                rn.g(rb2Var, (ns0) objO3, nv0Var);
                int i11 = (nv0Var.h(rb2Var) ? 1 : 0) | (i8 == 32 ? 1 : i5) | (i9 == 256 ? 1 : i5) | (nv0Var.f(str) ? 1 : 0) | (nv0Var.d(bb1Var2.ordinal()) ? 1 : 0);
                Object objO4 = nv0Var.O();
                if (i11 != 0 || objO4 == obj) {
                    Object qaVar = new qa(rb2Var, cs0Var4, vb2Var, str, bb1Var2, 0);
                    bb1Var = bb1Var2;
                    nv0Var.j0(qaVar);
                    objO4 = qaVar;
                } else {
                    bb1Var = bb1Var2;
                }
                rn.t((cs0) objO4, nv0Var);
                int i12 = (nv0Var.h(rb2Var) ? 1 : 0) | ((i6 & 14) == 4 ? 1 : i5);
                Object objO5 = nv0Var.O();
                Object obj3 = objO5;
                if (i12 != 0 || objO5 == obj) {
                    Object iVar = new i(3, rb2Var, ub2Var2);
                    nv0Var.j0(iVar);
                    obj3 = iVar;
                }
                rn.g(ub2Var2, (ns0) obj3, nv0Var);
                boolean zH = nv0Var.h(rb2Var);
                Object objO6 = nv0Var.O();
                Object obj4 = objO6;
                if (zH || objO6 == obj) {
                    Object jVar = new j(rb2Var, null, 4);
                    nv0Var.j0(jVar);
                    obj4 = jVar;
                }
                rn.l((rs0) obj4, nv0Var, rb2Var);
                boolean zH2 = nv0Var.h(rb2Var);
                Object objO7 = nv0Var.O();
                Object obj5 = objO7;
                if (zH2 || objO7 == obj) {
                    Object oaVar = new oa(rb2Var, 1);
                    nv0Var.j0(oaVar);
                    obj5 = oaVar;
                }
                bq1 bq1VarU = n92.u(yp1.a, (ns0) obj5);
                boolean zH3 = nv0Var.h(rb2Var) | nv0Var.d(bb1Var.ordinal());
                Object objO8 = nv0Var.O();
                Object obj6 = objO8;
                if (zH3 || objO8 == obj) {
                    Object saVar = new sa(i5, rb2Var, bb1Var);
                    nv0Var.j0(saVar);
                    obj6 = saVar;
                }
                cn1 cn1Var = (cn1) obj6;
                int iHashCode = Long.hashCode(nv0Var.T);
                n52 n52VarL = nv0Var.l();
                bq1 bq1VarM = lr.M(nv0Var, bq1VarU);
                w10.c.getClass();
                nv0Var.d0();
                if (nv0Var.S) {
                    nv0Var.k(tb1.Y);
                } else {
                    nv0Var.m0();
                }
                y02.F(f5.E, nv0Var, cn1Var);
                y02.F(f5.D, nv0Var, n52VarL);
                y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                y02.C(nv0Var);
                y02.F(f5.C, nv0Var, bq1VarM);
                nv0Var.p(true);
                cs0Var3 = cs0Var4;
            }
            xj2VarT = nv0Var.t();
            if (xj2VarT == null) {
                xj2VarT.d = new ra(ub2Var2, cs0Var3, vb2Var, d00Var, i, i2, 0);
                return;
            }
            return;
        }
        i3 |= 48;
        cs0Var2 = cs0Var;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) == 0) {
        }
        i4 = i3;
        if (nv0Var.R(i4 & 1, (i4 & 1171) == 1170)) {
        }
        xj2VarT = nv0Var.t();
        if (xj2VarT == null) {
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
