package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import top.th1nk.samp.R;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class da1 {
    public static final r93 a = new r93(new x91(0));
    public static final r93 b = new r93(new x91(0));

    public static final void a(int i, nv0 nv0Var) {
        Object qn2Var;
        nv0Var.b0(-781346680);
        int i2 = 1;
        byte b2 = 0;
        if (nv0Var.R(i & 1, i != 0)) {
            ee2 ee2Var = x7.b;
            Context context = (Context) nv0Var.j(ee2Var);
            Object[] objArrCopyOf = Arrays.copyOf(new yv1[0], 0);
            ar2 ar2Var = new ar2(0, new z00(28, b2), new xc1(10, context));
            boolean zH = nv0Var.h(context);
            Object objO = nv0Var.O();
            Object obj = c20.a;
            Object obj2 = objO;
            if (zH || objO == obj) {
                Object v91Var = new v91(context, i2);
                nv0Var.j0(v91Var);
                obj2 = v91Var;
            }
            nu1 nu1Var = (nu1) oz2.I(objArrCopyOf, ar2Var, (cs0) obj2, nv0Var, 0, 4);
            cr3 cr3VarA = oj1.a(nv0Var);
            if (cr3VarA == null) {
                c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            Boolean bool = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            sa1 sa1Var = (sa1) g12.h0(rk2.a(sa1.class), cr3VarA, null, jo3.m(cr3VarA), nv0Var);
            cr3 cr3VarA2 = oj1.a(nv0Var);
            if (cr3VarA2 == null) {
                c.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            go3 go3Var = (go3) g12.h0(rk2.a(go3.class), cr3VarA2, null, jo3.m(cr3VarA2), nv0Var);
            os1 os1VarO = br.o(sa1Var.Z, nv0Var);
            Context context2 = (Context) nv0Var.j(ee2Var);
            os1 os1VarO2 = br.o(sa1Var.h0, nv0Var);
            boolean zH2 = nv0Var.h(context2);
            Object objO2 = nv0Var.O();
            Object obj3 = objO2;
            if (zH2 || objO2 == obj) {
                Object pwVar = new pw(context2, z ? 1 : 0, 6);
                nv0Var.j0(pwVar);
                obj3 = pwVar;
            }
            dm3 dm3Var = dm3.a;
            rn.l((rs0) obj3, nv0Var, dm3Var);
            boolean zH3 = nv0Var.h(go3Var);
            Object objO3 = nv0Var.O();
            int i3 = 2;
            Object obj4 = objO3;
            if (zH3 || objO3 == obj) {
                Object hmVar = new hm(go3Var, z2 ? 1 : 0, i3);
                nv0Var.j0(hmVar);
                obj4 = hmVar;
            }
            rn.l((rs0) obj4, nv0Var, dm3Var);
            os1 os1VarO3 = br.o(go3Var.j, nv0Var);
            os1 os1VarO4 = br.o(go3Var.l, nv0Var);
            Object objO4 = nv0Var.O();
            Object obj5 = objO4;
            if (objO4 == obj) {
                Object objW = b32.w(Boolean.FALSE);
                nv0Var.j0(objW);
                obj5 = objW;
            }
            os1 os1Var = (os1) obj5;
            an3 an3Var = (an3) os1VarO3.getValue();
            boolean zF = nv0Var.f(os1VarO3);
            Object objO5 = nv0Var.O();
            Object obj6 = objO5;
            if (zF || objO5 == obj) {
                Object ba1Var = new ba1(os1VarO3, os1Var, null, 0);
                nv0Var.j0(ba1Var);
                obj6 = ba1Var;
            }
            rn.l((rs0) obj6, nv0Var, an3Var);
            Object objO6 = nv0Var.O();
            if (objO6 == obj) {
                try {
                    qn2Var = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                } catch (Throwable th) {
                    qn2Var = new qn2(th);
                }
                if (qn2Var instanceof qn2) {
                    qn2Var = null;
                }
                objO6 = (String) qn2Var;
                if (objO6 == null) {
                    objO6 = "";
                }
                nv0Var.j0(objO6);
            }
            String str = (String) objO6;
            pn3 pn3Var = (pn3) os1VarO4.getValue();
            boolean zF2 = nv0Var.f(os1VarO4);
            Object objO7 = nv0Var.O();
            Object obj7 = objO7;
            if (zF2 || objO7 == obj) {
                Object ba1Var2 = new ba1(os1VarO4, os1Var, null, 1);
                nv0Var.j0(ba1Var2);
                obj7 = ba1Var2;
            }
            rn.l((rs0) obj7, nv0Var, pn3Var);
            os1 os1VarO5 = br.o(sa1Var.W, nv0Var);
            String str2 = (String) os1VarO5.getValue();
            boolean zF3 = nv0Var.f(os1VarO5);
            Object objO8 = nv0Var.O();
            Object obj8 = objO8;
            if (zF3 || objO8 == obj) {
                Object hmVar2 = new hm(os1VarO5, z3 ? 1 : 0, 3);
                nv0Var.j0(hmVar2);
                obj8 = hmVar2;
            }
            rn.l((rs0) obj8, nv0Var, str2);
            int iOrdinal = ((oh3) os1VarO.getValue()).ordinal();
            if (iOrdinal == 1) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 2) {
                bool = Boolean.TRUE;
            }
            nh3.a(bool, ((oh3) os1VarO.getValue()) == oh3.j, gq.N(2058571603, new t91(nu1Var, sa1Var, context2, go3Var, os1VarO3, str, os1VarO2, os1Var, os1VarO4, 0), nv0Var), nv0Var, 384);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new z00(i);
        }
    }

    public static final void b(q92 q92Var, cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, nv0 nv0Var, int i) {
        String strF;
        nv0Var.b0(-279942433);
        int i2 = 4;
        int i3 = i | (nv0Var.h(q92Var) ? 4 : 2) | (nv0Var.h(cs0Var) ? 32 : 16) | (nv0Var.h(cs0Var2) ? 256 : 128) | (nv0Var.h(cs0Var3) ? 2048 : 1024) | (nv0Var.h(cs0Var4) ? 16384 : 8192);
        byte b2 = 0;
        if (nv0Var.R(i3 & 1, (i3 & 9363) != 9362)) {
            String str = q92Var.d;
            String str2 = q92Var.e;
            if (str != null && str2 != null) {
                nv0Var.a0(1558274579);
                strF = oz2.N(R.string.launcher_plugin_recovery_suspected_callback, new Object[]{str, str2}, nv0Var);
                nv0Var.p(false);
            } else if (str != null) {
                nv0Var.a0(1558280496);
                strF = oz2.N(R.string.launcher_plugin_recovery_suspected, new Object[]{str}, nv0Var);
                nv0Var.p(false);
            } else {
                strF = by1.f(nv0Var, 1558284600, R.string.launcher_plugin_recovery_unknown, nv0Var, false);
            }
            String str3 = strF;
            Object objO = nv0Var.O();
            if (objO == c20.a) {
                objO = new q20(29);
                nv0Var.j0(objO);
            }
            rn.a((cs0) objO, gq.N(243540775, new o91(q92Var, str, cs0Var2, cs0Var3, cs0Var4, cs0Var), nv0Var), null, null, null, f80.q, gq.N(1019193196, new z71(str3, i2, b2), nv0Var), null, 0L, 0L, 0L, 0L, null, nv0Var, 1769526, 16284);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new r81(q92Var, cs0Var, cs0Var2, cs0Var3, cs0Var4, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(List list, Map map, cs0 cs0Var, ns0 ns0Var, nv0 nv0Var, int i) {
        Integer numF0;
        yj1 yj1Var;
        Object obj;
        nv0Var.b0(2051803477);
        int i2 = i | (nv0Var.f(list) ? 4 : 2) | (nv0Var.f(map) ? 32 : 16) | (nv0Var.h(cs0Var) ? 256 : 128) | (nv0Var.h(ns0Var) ? 2048 : 1024);
        boolean z = false;
        if (nv0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            String strM = oz2.M(R.string.launcher_log_unknown_instance, nv0Var);
            String strM2 = oz2.M(R.string.launcher_raksamp_disconnected, nv0Var);
            boolean zF = ((i2 & 112) == 32) | ((i2 & 14) == 4) | nv0Var.f(strM) | nv0Var.f(strM2);
            Object objO = nv0Var.O();
            if (!zF) {
                Object obj2 = objO;
                if (objO == c20.a) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        File file = (File) it.next();
                        String name = file.getName();
                        if (s51.n(name, "raksamp_log.txt")) {
                            numF0 = null;
                        } else {
                            name.getClass();
                            if (fa3.e0(name, "raksamp_log_", z) && fa3.Y(name, ".txt", z)) {
                                numF0 = fa3.f0(y93.w0(y93.v0(name, "raksamp_log_"), ".txt"));
                            }
                        }
                        if (numF0 != null) {
                            int iIntValue = numF0.intValue();
                            Iterator it2 = map.values().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next = it2.next();
                                if (((vg2) next).g.c == iIntValue) {
                                    obj = next;
                                    break;
                                }
                            }
                            vg2 vg2Var = (vg2) obj;
                            if (vg2Var != null) {
                                yj1Var = new yj1(iIntValue, vg2Var.b + ":" + vg2Var.c, vg2Var.d, file);
                            } else {
                                yj1Var = new yj1(iIntValue, String.format(Locale.getDefault(), strM, Arrays.copyOf(new Object[]{numF0}, 1)), strM2, file);
                            }
                        } else {
                            yj1Var = null;
                        }
                        if (yj1Var != null) {
                            arrayList.add(yj1Var);
                        }
                        z = false;
                    }
                    nv0Var.j0(arrayList);
                    obj2 = arrayList;
                }
                w22.c(null, gq.N(-626833903, new k91(cs0Var, 1), nv0Var), null, null, null, 0, 0L, 0L, null, gq.N(-2030093978, new w91(0, (List) obj2, ns0Var), nv0Var), nv0Var, 805306416, 509);
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ul(list, map, cs0Var, ns0Var, i, 4);
        }
    }
}
