package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yv implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;

    public /* synthetic */ yv(cs0 cs0Var, boolean z, x31 x31Var) {
        this.f = 1;
        this.g = cs0Var;
        this.h = z;
        this.i = x31Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i;
        long j;
        long j2;
        long j3;
        int i2 = this.f;
        x91 x91Var = tb1.Y;
        dm3 dm3Var = dm3.a;
        yp1 yp1Var = yp1.a;
        Object obj4 = this.g;
        boolean z = this.h;
        Object obj5 = this.i;
        switch (i2) {
            case 0:
                boolean z2 = false;
                bv bvVar = (bv) obj5;
                cs0 cs0Var = (cs0) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((nc1) obj).getClass();
                if ((iIntValue & 17) != 16) {
                    z2 = true;
                }
                if (nv0Var.R(iIntValue & 1, z2)) {
                    qy qyVarA = oy.a(new jj(8.0f, true, new c(1)), f5.s, nv0Var, 6);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, yp1Var);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(x91Var);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, qyVarA);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    mg3.b(((yu) bvVar).a, null, ((fy) nv0Var.j(hy.a)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, nv0Var, 0, 0, 262138);
                    gq.i(cs0Var, null, !z, null, null, null, null, vm1.u, nv0Var, 805306368, 506);
                    nv0Var.p(true);
                } else {
                    nv0Var.U();
                }
                return dm3Var;
            case 1:
                cs0 cs0Var2 = (cs0) obj4;
                x31 x31Var = (x31) obj5;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                    return dm3Var;
                }
                bq1 bq1VarJ = f80.J(j43.c(yp1Var, 1.0f), 16.0f);
                dp2 dp2VarA = cp2.a(n92.b, f5.q, nv0Var2, 48);
                int iHashCode2 = Long.hashCode(nv0Var2.T);
                n52 n52VarL2 = nv0Var2.l();
                bq1 bq1VarM2 = lr.M(nv0Var2, bq1VarJ);
                w10.c.getClass();
                nv0Var2.d0();
                if (nv0Var2.S) {
                    nv0Var2.k(x91Var);
                } else {
                    nv0Var2.m0();
                }
                z00 z00Var = f5.E;
                y02.F(z00Var, nv0Var2, dp2VarA);
                z00 z00Var2 = f5.D;
                y02.F(z00Var2, nv0Var2, n52VarL2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                z00 z00Var3 = f5.F;
                y02.F(z00Var3, nv0Var2, numValueOf);
                y02.C(nv0Var2);
                z00 z00Var4 = f5.C;
                y02.F(z00Var4, nv0Var2, bq1VarM2);
                s01.a(lr.G(), null, null, gq.B(nv0Var2).a, nv0Var2, 48, 4);
                bq1 bq1VarL = f80.L(new jc1(1.0f, true), 12.0f, 0.0f, 2);
                qy qyVarA2 = oy.a(n92.d, f5.s, nv0Var2, 0);
                int iHashCode3 = Long.hashCode(nv0Var2.T);
                n52 n52VarL3 = nv0Var2.l();
                bq1 bq1VarM3 = lr.M(nv0Var2, bq1VarL);
                nv0Var2.d0();
                if (nv0Var2.S) {
                    nv0Var2.k(x91Var);
                } else {
                    nv0Var2.m0();
                }
                y02.F(z00Var, nv0Var2, qyVarA2);
                y02.F(z00Var2, nv0Var2, n52VarL3);
                nc2.r(iHashCode3, nv0Var2, z00Var3, nv0Var2);
                y02.F(z00Var4, nv0Var2, bq1VarM3);
                String str = x31Var.a;
                long j4 = x31Var.c;
                lw lwVar = x31Var.b;
                mg3.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, gq.H(nv0Var2).i, nv0Var2, 0, 24960, 110590);
                int iOrdinal = lwVar.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.launcher_cleo_type_csa;
                } else if (iOrdinal == 1) {
                    i = R.string.launcher_cleo_type_csi;
                } else {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    i = R.string.launcher_cleo_type_cm;
                }
                mg3.b(oz2.N(R.string.launcher_cleo_type_format, new Object[]{oz2.M(i, nv0Var2)}, nv0Var2), null, gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 0, 0, 131066);
                String fileSize = Formatter.formatFileSize((Context) nv0Var2.j(x7.b), j4);
                fileSize.getClass();
                mg3.b(oz2.N(R.string.launcher_cleo_size_format, new Object[]{fileSize}, nv0Var2), null, gq.B(nv0Var2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var2).l, nv0Var2, 0, 0, 131066);
                nv0 nv0Var3 = nv0Var2;
                String str2 = x31Var.f;
                if (str2 == null) {
                    nv0Var3.a0(984681244);
                    nv0Var3.p(false);
                } else {
                    nv0Var3.a0(984681245);
                    mg3.b(oz2.N(R.string.launcher_cleo_version_format, new Object[]{str2}, nv0Var3), null, gq.B(nv0Var3).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gq.H(nv0Var3).l, nv0Var3, 0, 0, 131066);
                    nv0Var3 = nv0Var3;
                    nv0Var3.p(false);
                }
                String strM = oz2.M((2 > j4 || j4 >= 16777217) ? R.string.launcher_cleo_status_invalid : lwVar == lw.h ? R.string.launcher_cleo_status_auto_start : lwVar == lw.i ? R.string.launcher_cleo_status_game_menu : R.string.launcher_cleo_status_module, nv0Var3);
                gh3 gh3Var = gq.H(nv0Var3).l;
                if (2 > j4 || j4 >= 16777217) {
                    nv0Var3.a0(985729231);
                    j = gq.B(nv0Var3).w;
                    nv0Var3.p(false);
                } else {
                    nv0Var3.a0(985634340);
                    j = gq.B(nv0Var3).s;
                    nv0Var3.p(false);
                }
                nv0 nv0Var4 = nv0Var3;
                mg3.b(strM, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, gh3Var, nv0Var4, 0, 0, 131066);
                nv0Var4.p(true);
                gv3.f(cs0Var2, null, !z, null, null, vm1.q, nv0Var4, 1572864, 58);
                nv0Var4.p(true);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                en1 en1Var = (en1) obj;
                xm1 xm1Var = (xm1) obj2;
                m30 m30Var = (m30) obj3;
                int iG = n30.g(((a42) obj5).g(), m30Var.a);
                long j5 = m30Var.a;
                int iF = n30.f(((a42) obj4).g(), j5);
                int iK = z ? iG : m30.k(j5);
                if (!z) {
                    iG = m30.i(j5);
                }
                i62 i62VarT = xm1Var.t(m30.b(m30Var.a, iK, iG, 0, iF, 4));
                return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 2));
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ea1 ea1Var = (ea1) obj5;
                String str3 = (String) obj4;
                nv0 nv0Var5 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (nv0Var5.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    w01 w01Var = ea1Var.g;
                    bq1 bq1VarK = j43.k(yp1Var, 22.0f);
                    if (z) {
                        nv0Var5.a0(1832497486);
                        j2 = ((fy) nv0Var5.j(hy.a)).q;
                        nv0Var5.p(false);
                    } else {
                        nv0Var5.a0(1832593927);
                        j2 = ((fy) nv0Var5.j(hy.a)).s;
                        nv0Var5.p(false);
                    }
                    s01.a(w01Var, str3, bq1VarK, j2, nv0Var5, 384, 0);
                    if (z) {
                        nv0Var5.a0(1832823854);
                        j3 = ((fy) nv0Var5.j(hy.a)).q;
                        nv0Var5.p(false);
                    } else {
                        nv0Var5.a0(1832920295);
                        j3 = ((fy) nv0Var5.j(hy.a)).s;
                        nv0Var5.p(false);
                    }
                    mg3.b(str3, null, j3, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, ((ol3) nv0Var5.j(ql3.a)).o, nv0Var5, 0, 24960, 110586);
                } else {
                    nv0Var5.U();
                }
                return dm3Var;
            default:
                lf3 lf3Var = (lf3) obj5;
                d42 d42Var = lf3Var.f;
                qr1 qr1Var = (qr1) obj4;
                nv0 nv0Var6 = (nv0) obj2;
                ((Integer) obj3).getClass();
                nv0Var6.a0(-2137546592);
                boolean z3 = ((t02) d42Var.getValue()) == t02.f || !(nv0Var6.j(s20.n) == bb1.g);
                boolean zF = nv0Var6.f(lf3Var);
                Object objO = nv0Var6.O();
                zj zjVar = c20.a;
                if (zF || objO == zjVar) {
                    objO = new aw2(13, lf3Var);
                    nv0Var6.j0(objO);
                }
                os1 os1VarZ = b32.z((ns0) objO, nv0Var6);
                Object objO2 = nv0Var6.O();
                if (objO2 == zjVar) {
                    l90 l90Var = new l90(new zb(os1VarZ, 22));
                    nv0Var6.j0(l90Var);
                    objO2 = l90Var;
                }
                qs2 qs2Var = (qs2) objO2;
                boolean zF2 = nv0Var6.f(qs2Var) | nv0Var6.f(lf3Var);
                Object objO3 = nv0Var6.O();
                if (zF2 || objO3 == zjVar) {
                    objO3 = new kf3(qs2Var, lf3Var);
                    nv0Var6.j0(objO3);
                }
                bq1 bq1VarB = ks2.b((kf3) objO3, (t02) d42Var.getValue(), z && lf3Var.b.g() != 0.0f, z3, qr1Var);
                nv0Var6.p(false);
                return bq1VarB;
        }
    }

    public /* synthetic */ yv(lf3 lf3Var, boolean z, qr1 qr1Var) {
        this.f = 4;
        this.i = lf3Var;
        this.h = z;
        this.g = qr1Var;
    }

    public /* synthetic */ yv(Object obj, boolean z, Object obj2, int i) {
        this.f = i;
        this.i = obj;
        this.g = obj2;
        this.h = z;
    }

    public /* synthetic */ yv(boolean z, a42 a42Var, a42 a42Var2) {
        this.f = 2;
        this.h = z;
        this.i = a42Var;
        this.g = a42Var2;
    }
}
