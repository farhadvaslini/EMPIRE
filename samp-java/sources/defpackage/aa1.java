package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class aa1 implements ss0 {
    public final /* synthetic */ int f = 2;
    public final /* synthetic */ String g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ aa1(nu1 nu1Var, sa1 sa1Var, Context context, go3 go3Var, os1 os1Var, String str, e93 e93Var, os1 os1Var2, os1 os1Var3) {
        this.h = nu1Var;
        this.i = sa1Var;
        this.j = context;
        this.k = go3Var;
        this.l = os1Var;
        this.g = str;
        this.o = e93Var;
        this.m = os1Var2;
        this.n = os1Var3;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        nu1 nu1Var;
        go3 go3Var;
        gm0 gm0Var;
        sa1 sa1Var;
        os1 os1Var;
        go3 go3Var2;
        jj jjVar;
        int i = this.f;
        zj zjVar = c20.a;
        dm3 dm3Var = dm3.a;
        Object obj4 = this.o;
        Object obj5 = this.n;
        Object obj6 = this.l;
        Object obj7 = this.m;
        Object obj8 = this.k;
        Object obj9 = this.j;
        Object obj10 = this.i;
        Object obj11 = this.h;
        switch (i) {
            case 0:
                nu1 nu1Var2 = (nu1) obj11;
                sa1 sa1Var2 = (sa1) obj10;
                Context context = (Context) obj9;
                go3 go3Var3 = (go3) obj8;
                os1 os1Var2 = (os1) obj6;
                e93 e93Var = (e93) obj4;
                os1 os1Var3 = (os1) obj7;
                os1 os1Var4 = (os1) obj5;
                c33 c33Var = (c33) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c33Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(c33Var) ? 4 : 2;
                }
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nv0Var.U();
                } else {
                    gm0 gm0Var2 = j43.c;
                    cn1 cn1VarD = eo.d(f5.g, false);
                    int iHashCode = Long.hashCode(nv0Var.T);
                    n52 n52VarL = nv0Var.l();
                    bq1 bq1VarM = lr.M(nv0Var, gm0Var2);
                    w10.c.getClass();
                    nv0Var.d0();
                    if (nv0Var.S) {
                        nv0Var.k(tb1.Y);
                    } else {
                        nv0Var.m0();
                    }
                    y02.F(f5.E, nv0Var, cn1VarD);
                    y02.F(f5.D, nv0Var, n52VarL);
                    y02.F(f5.F, nv0Var, Integer.valueOf(iHashCode));
                    y02.C(nv0Var);
                    y02.F(f5.C, nv0Var, bq1VarM);
                    Object objO = nv0Var.O();
                    if (objO == zjVar) {
                        objO = new n20(18);
                        nv0Var.j0(objO);
                    }
                    ns0 ns0Var = (ns0) objO;
                    Object objO2 = nv0Var.O();
                    if (objO2 == zjVar) {
                        objO2 = new n20(14);
                        nv0Var.j0(objO2);
                    }
                    ns0 ns0Var2 = (ns0) objO2;
                    Object objO3 = nv0Var.O();
                    if (objO3 == zjVar) {
                        objO3 = new n20(15);
                        nv0Var.j0(objO3);
                    }
                    ns0 ns0Var3 = (ns0) objO3;
                    Object objO4 = nv0Var.O();
                    if (objO4 == zjVar) {
                        objO4 = new n20(16);
                        nv0Var.j0(objO4);
                    }
                    ns0 ns0Var4 = (ns0) objO4;
                    boolean zH = ((iIntValue & 14) == 4) | nv0Var.h(nu1Var2) | nv0Var.h(sa1Var2) | nv0Var.h(context) | nv0Var.h(go3Var3) | nv0Var.f(os1Var2);
                    Object objO5 = nv0Var.O();
                    if (zH || objO5 == zjVar) {
                        nu1Var = nu1Var2;
                        go3Var = go3Var3;
                        gm0Var = gm0Var2;
                        go goVar = new go(c33Var, nu1Var, sa1Var2, context, go3Var, os1Var2, 1);
                        sa1Var = sa1Var2;
                        os1Var = os1Var2;
                        nv0Var.j0(goVar);
                        objO5 = goVar;
                    } else {
                        nu1Var = nu1Var2;
                        os1Var = os1Var2;
                        go3Var = go3Var3;
                        sa1Var = sa1Var2;
                        gm0Var = gm0Var2;
                    }
                    sa1 sa1Var3 = sa1Var;
                    go3 go3Var4 = go3Var;
                    ur.f(nu1Var, gm0Var, null, ns0Var, ns0Var2, ns0Var3, ns0Var4, (ns0) objO5, nv0Var, 115016112);
                    q92 q92Var = (q92) e93Var.getValue();
                    if (q92Var == null) {
                        nv0Var.a0(-543557773);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-543557772);
                        boolean zH2 = nv0Var.h(sa1Var3);
                        Object objO6 = nv0Var.O();
                        if (zH2 || objO6 == zjVar) {
                            objO6 = new c91(0, sa1Var3, sa1.class, "rollbackSuspectedPlugin", "rollbackSuspectedPlugin()V", 0, 0, 15);
                            nv0Var.j0(objO6);
                        }
                        cs0 cs0Var = (cs0) ((ct0) objO6);
                        boolean zH3 = nv0Var.h(sa1Var3);
                        Object objO7 = nv0Var.O();
                        if (zH3 || objO7 == zjVar) {
                            objO7 = new c91(0, sa1Var3, sa1.class, "disableSuspectedPlugin", "disableSuspectedPlugin()V", 0, 0, 16);
                            nv0Var.j0(objO7);
                        }
                        cs0 cs0Var2 = (cs0) ((ct0) objO7);
                        boolean zH4 = nv0Var.h(sa1Var3);
                        Object objO8 = nv0Var.O();
                        if (zH4 || objO8 == zjVar) {
                            objO8 = new c91(0, sa1Var3, sa1.class, "disableSessionPlugins", "disableSessionPlugins()V", 0, 0, 17);
                            nv0Var.j0(objO8);
                        }
                        cs0 cs0Var3 = (cs0) ((ct0) objO8);
                        boolean zH5 = nv0Var.h(sa1Var3);
                        Object objO9 = nv0Var.O();
                        if (zH5 || objO9 == zjVar) {
                            objO9 = new c91(0, sa1Var3, sa1.class, "acknowledgePluginRecovery", "acknowledgePluginRecovery()V", 0, 0, 18);
                            nv0Var.j0(objO9);
                        }
                        da1.b(q92Var, cs0Var, cs0Var2, cs0Var3, (cs0) ((ct0) objO9), nv0Var, 0);
                        nv0Var.p(false);
                    }
                    if (((Boolean) os1Var3.getValue()).booleanValue()) {
                        nv0Var.a0(-543067755);
                        an3 an3Var = (an3) os1Var.getValue();
                        pn3 pn3Var = (pn3) os1Var4.getValue();
                        boolean zH6 = nv0Var.h(go3Var4);
                        Object objO10 = nv0Var.O();
                        if (zH6 || objO10 == zjVar) {
                            objO10 = new g91(go3Var4, 0);
                            nv0Var.j0(objO10);
                        }
                        cs0 cs0Var4 = (cs0) objO10;
                        boolean zH7 = nv0Var.h(go3Var4);
                        Object objO11 = nv0Var.O();
                        if (zH7 || objO11 == zjVar) {
                            objO11 = new c91(0, go3Var4, go3.class, "cancelDownload", "cancelDownload()V", 0, 0, 19);
                            go3Var2 = go3Var4;
                            nv0Var.j0(objO11);
                        } else {
                            go3Var2 = go3Var4;
                        }
                        cs0 cs0Var5 = (cs0) ((ct0) objO11);
                        boolean zH8 = nv0Var.h(go3Var2);
                        Object objO12 = nv0Var.O();
                        if (zH8 || objO12 == zjVar) {
                            objO12 = new u1(27, go3Var2, os1Var3);
                            nv0Var.j0(objO12);
                        }
                        oz2.h(an3Var, pn3Var, this.g, cs0Var4, cs0Var5, (cs0) objO12, nv0Var, 384);
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-542453676);
                        nv0Var.p(false);
                    }
                    nv0Var.p(true);
                }
                break;
            case 1:
                List list = (List) obj11;
                cs0 cs0Var6 = (cs0) obj10;
                cs0 cs0Var7 = (cs0) obj9;
                ns0 ns0Var5 = (ns0) obj8;
                ns0 ns0Var6 = (ns0) obj6;
                rs0 rs0Var = (rs0) obj7;
                ns0 ns0Var7 = (ns0) obj5;
                ns0 ns0Var8 = (ns0) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    gm0 gm0Var3 = j43.c;
                    b22 b22Var = new b22(24.0f, 24.0f, 24.0f, 24.0f);
                    jj jjVar2 = new jj(16.0f, true, new c(1));
                    boolean zH9 = nv0Var2.h(list);
                    String str = this.g;
                    boolean zF = zH9 | nv0Var2.f(str) | nv0Var2.f(cs0Var6) | nv0Var2.f(cs0Var7) | nv0Var2.f(ns0Var5) | nv0Var2.f(ns0Var6) | nv0Var2.f(rs0Var) | nv0Var2.f(ns0Var7) | nv0Var2.f(ns0Var8);
                    Object objO13 = nv0Var2.O();
                    if (zF || objO13 == zjVar) {
                        jjVar = jjVar2;
                        ck2 ck2Var = new ck2(list, str, cs0Var6, cs0Var7, ns0Var5, ns0Var6, rs0Var, ns0Var7, ns0Var8);
                        nv0Var2.j0(ck2Var);
                        objO13 = ck2Var;
                    } else {
                        jjVar = jjVar2;
                    }
                    dn0.a(gm0Var3, null, b22Var, jjVar, (ns0) objO13, nv0Var2, 3462, 2);
                }
                break;
            default:
                nm2 nm2Var = (nm2) obj11;
                cs0 cs0Var8 = (cs0) obj10;
                List list2 = (List) obj9;
                cs0 cs0Var9 = (cs0) obj8;
                cs0 cs0Var10 = (cs0) obj7;
                os1 os1Var5 = (os1) obj6;
                kq2 kq2Var = (kq2) obj5;
                ns0 ns0Var9 = (ns0) obj4;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ry) obj).getClass();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nv0Var3.U();
                } else {
                    nv0Var3.a0(849232755);
                    String strM = this.g;
                    if (y93.q0(strM)) {
                        strM = oz2.M(2131624349, nv0Var3);
                    }
                    nv0Var3.p(false);
                    mg3.b(oz2.N(2131624220, new Object[]{strM}, nv0Var3), null, ((fy) nv0Var3.j(hy.a)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((ol3) nv0Var3.j(ql3.a)).h, nv0Var3, 0, 0, 131066);
                    vr.g(nm2Var, cs0Var8, nv0Var3, 0);
                    gv3.m(oz2.M(2131624218, nv0Var3), gq.N(-1550606826, new bz2(list2, nm2Var, cs0Var9, cs0Var10, cs0Var8, os1Var5, kq2Var, ns0Var9), nv0Var3), nv0Var3, 48);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ aa1(String str, nm2 nm2Var, cs0 cs0Var, List list, cs0 cs0Var2, cs0 cs0Var3, os1 os1Var, kq2 kq2Var, ns0 ns0Var) {
        this.g = str;
        this.h = nm2Var;
        this.i = cs0Var;
        this.j = list;
        this.k = cs0Var2;
        this.m = cs0Var3;
        this.l = os1Var;
        this.n = kq2Var;
        this.o = ns0Var;
    }

    public /* synthetic */ aa1(List list, String str, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var, ns0 ns0Var2, rs0 rs0Var, ns0 ns0Var3, ns0 ns0Var4) {
        this.h = list;
        this.g = str;
        this.i = cs0Var;
        this.j = cs0Var2;
        this.k = ns0Var;
        this.l = ns0Var2;
        this.m = rs0Var;
        this.n = ns0Var3;
        this.o = ns0Var4;
    }
}
