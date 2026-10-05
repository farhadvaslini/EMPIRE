package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class l91 implements ts0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ l91(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.ts0
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        Object next;
        Object next2;
        int i = this.f;
        ti tiVar = ti.h;
        mj0 mj0Var = ti.l;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = null;
        switch (i) {
            case 0:
                sa1 sa1Var = (sa1) obj7;
                Context context = (Context) obj6;
                nu1 nu1Var = (nu1) obj5;
                nv0 nv0Var = (nv0) obj3;
                ((Integer) obj4).getClass();
                ((sd) obj).getClass();
                ((qt1) obj2).getClass();
                os1 os1VarO = br.o(sa1Var.W, nv0Var);
                boolean zF = nv0Var.f((String) os1VarO.getValue());
                Object objO = nv0Var.O();
                if (zF || objO == zjVar) {
                    Iterator it = mj0Var.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (s51.n(((ti) next).name(), (String) os1VarO.getValue())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ti tiVar2 = (ti) next;
                    if (tiVar2 != null) {
                        tiVar = tiVar2;
                    }
                    nv0Var.j0(tiVar);
                    objO = tiVar;
                }
                ti tiVar3 = (ti) objO;
                String strM = oz2.M(2131624255, nv0Var);
                String str = context.getExternalFilesDir(null) + "/samp_log.txt";
                boolean zH = nv0Var.h(nu1Var);
                Object objO2 = nv0Var.O();
                if (zH || objO2 == zjVar) {
                    objO2 = new q91(nu1Var, 0);
                    nv0Var.j0(objO2);
                }
                cs0 cs0Var = (cs0) objO2;
                boolean zH2 = nv0Var.h(sa1Var);
                Object objO3 = nv0Var.O();
                if (zH2 || objO3 == zjVar) {
                    objO3 = new r91(sa1Var, 0);
                    nv0Var.j0(objO3);
                }
                uq.c(strM, str, true, tiVar3, cs0Var, (ns0) objO3, nv0Var, 384, 0);
                return dm3Var;
            case 1:
                sa1 sa1Var2 = (sa1) obj7;
                Context context2 = (Context) obj6;
                nu1 nu1Var2 = (nu1) obj5;
                qt1 qt1Var = (qt1) obj2;
                nv0 nv0Var2 = (nv0) obj3;
                ((Integer) obj4).getClass();
                ((sd) obj).getClass();
                qt1Var.getClass();
                Bundle bundleA = qt1Var.m.a();
                if (bundleA != null) {
                    int i2 = bundleA.getInt("nativeInstanceId");
                    os1 os1VarO2 = br.o(sa1Var2.W, nv0Var2);
                    boolean zF2 = nv0Var2.f((String) os1VarO2.getValue());
                    Object objO4 = nv0Var2.O();
                    if (zF2 || objO4 == zjVar) {
                        Iterator it2 = mj0Var.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                if (s51.n(((ti) next2).name(), (String) os1VarO2.getValue())) {
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        ti tiVar4 = (ti) next2;
                        if (tiVar4 != null) {
                            tiVar = tiVar4;
                        }
                        nv0Var2.j0(tiVar);
                        objO4 = tiVar;
                    }
                    ti tiVar5 = (ti) objO4;
                    String str2 = context2.getExternalFilesDir(null) + "/raksamp_log_" + i2 + ".txt";
                    os1 os1VarO3 = br.o(dh2.c, nv0Var2);
                    String strN = oz2.N(2131624256, new Object[]{Integer.valueOf(i2)}, nv0Var2);
                    boolean zF3 = nv0Var2.f((Map) os1VarO3.getValue()) | nv0Var2.d(i2) | nv0Var2.f(strN);
                    Object objO5 = nv0Var2.O();
                    if (zF3 || objO5 == zjVar) {
                        Iterator it3 = ((Map) os1VarO3.getValue()).values().iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                Object next3 = it3.next();
                                if (((vg2) next3).g.c == i2) {
                                    obj8 = next3;
                                }
                            }
                        }
                        vg2 vg2Var = (vg2) obj8;
                        if (vg2Var != null) {
                            strN = vg2Var.b + ":" + vg2Var.c + " (" + vg2Var.d + ")";
                        }
                        nv0Var2.j0(strN);
                        objO5 = strN;
                    }
                    String strN2 = oz2.N(2131624251, new Object[]{(String) objO5}, nv0Var2);
                    boolean zH3 = nv0Var2.h(nu1Var2);
                    Object objO6 = nv0Var2.O();
                    if (zH3 || objO6 == zjVar) {
                        objO6 = new q91(nu1Var2, 4);
                        nv0Var2.j0(objO6);
                    }
                    cs0 cs0Var2 = (cs0) objO6;
                    boolean zH4 = nv0Var2.h(sa1Var2);
                    Object objO7 = nv0Var2.O();
                    if (zH4 || objO7 == zjVar) {
                        objO7 = new r91(sa1Var2, 1);
                        nv0Var2.j0(objO7);
                    }
                    uq.c(strN2, str2, true, tiVar5, cs0Var2, (ns0) objO7, nv0Var2, 384, 0);
                }
                return dm3Var;
            default:
                lj0 lj0Var = (lj0) obj7;
                vi2 vi2Var = (vi2) obj6;
                e93 e93Var = (e93) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                nv0 nv0Var3 = (nv0) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((z22) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= nv0Var3.d(iIntValue) ? 32 : 16;
                }
                if (nv0Var3.R(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    int iOrdinal = ((si2) ((mj0) lj0Var).get(iIntValue)).ordinal();
                    if (iOrdinal == 0) {
                        nv0Var3.a0(-997175040);
                        w7.t((List) br.o(vi2Var.h, nv0Var3).getValue(), null, nv0Var3, 0);
                        nv0Var3.p(false);
                    } else if (iOrdinal == 1) {
                        nv0Var3.a0(-996923940);
                        n92.a((List) br.o(vi2Var.j, nv0Var3).getValue(), null, nv0Var3, 0);
                        nv0Var3.p(false);
                    } else if (iOrdinal == 2) {
                        nv0Var3.a0(-1279076610);
                        List list = (List) e93Var.getValue();
                        boolean zH5 = nv0Var3.h(vi2Var);
                        Object objO8 = nv0Var3.O();
                        if (zH5 || objO8 == zjVar) {
                            e91 e91Var = new e91(1, vi2Var, vi2.class, "showDeferredDialog", "showDeferredDialog(Ltop/th1nk/samp/feature/raksamp/model/DialogData;)V", 0, 0, 19);
                            nv0Var3.j0(e91Var);
                            objO8 = e91Var;
                        }
                        ns0 ns0Var = (ns0) ((ct0) objO8);
                        boolean zH6 = nv0Var3.h(vi2Var);
                        Object objO9 = nv0Var3.O();
                        if (zH6 || objO9 == zjVar) {
                            e91 e91Var2 = new e91(1, vi2Var, vi2.class, "dismissDeferredDialog", "dismissDeferredDialog(Ltop/th1nk/samp/feature/raksamp/model/DialogData;)V", 0, 0, 20);
                            nv0Var3.j0(e91Var2);
                            objO9 = e91Var2;
                        }
                        f80.i(list, ns0Var, (ns0) ((ct0) objO9), null, nv0Var3, 0);
                        nv0Var3.p(false);
                    } else if (iOrdinal == 3) {
                        nv0Var3.a0(-996350967);
                        os1 os1VarO4 = br.o(vi2Var.p, nv0Var3);
                        os1 os1VarO5 = br.o(vi2Var.C, nv0Var3);
                        List list2 = (List) os1VarO4.getValue();
                        int size = ((List) os1VarO4.getValue()).size();
                        int iIntValue3 = ((Number) os1VarO5.getValue()).intValue();
                        boolean zH7 = nv0Var3.h(vi2Var);
                        Object objO10 = nv0Var3.O();
                        if (zH7 || objO10 == zjVar) {
                            e91 e91Var3 = new e91(1, vi2Var, vi2.class, "sendClickPlayer", "sendClickPlayer(I)V", 0, 0, 21);
                            nv0Var3.j0(e91Var3);
                            objO10 = e91Var3;
                        }
                        s51.i(list2, size, iIntValue3, (ns0) ((ct0) objO10), null, nv0Var3, 0);
                        nv0Var3.p(false);
                    } else {
                        if (iOrdinal != 4) {
                            throw by1.d(nv0Var3, -1279092694, false);
                        }
                        nv0Var3.a0(-995716583);
                        os1 os1VarO6 = br.o(vi2Var.r, nv0Var3);
                        os1 os1VarO7 = br.o(vi2Var.t, nv0Var3);
                        os1 os1VarO8 = br.o(vi2Var.v, nv0Var3);
                        os1 os1VarO9 = br.o(vi2Var.x, nv0Var3);
                        List list3 = (List) os1VarO6.getValue();
                        List list4 = (List) os1VarO7.getValue();
                        List list5 = (List) os1VarO8.getValue();
                        hp3 hp3Var = (hp3) os1VarO9.getValue();
                        boolean zH8 = nv0Var3.h(vi2Var);
                        Object objO11 = nv0Var3.O();
                        if (zH8 || objO11 == zjVar) {
                            qi2 qi2Var = new qi2(3, vi2Var, vi2.class, "teleportTo", "teleportTo(FFF)V", 0, 0);
                            nv0Var3.j0(qi2Var);
                            objO11 = qi2Var;
                        }
                        ss0 ss0Var = (ss0) ((ct0) objO11);
                        boolean zH9 = nv0Var3.h(vi2Var);
                        Object objO12 = nv0Var3.O();
                        if (zH9 || objO12 == zjVar) {
                            op0 op0Var = new op0(2, vi2Var, vi2.class, "enterVehicle", "enterVehicle(IZ)V", 0, 0, 5);
                            nv0Var3.j0(op0Var);
                            objO12 = op0Var;
                        }
                        rs0 rs0Var = (rs0) ((ct0) objO12);
                        boolean zH10 = nv0Var3.h(vi2Var);
                        Object objO13 = nv0Var3.O();
                        if (zH10 || objO13 == zjVar) {
                            c91 c91Var = new c91(0, vi2Var, vi2.class, "exitVehicle", "exitVehicle()V", 0, 0, 29);
                            nv0Var3.j0(c91Var);
                            objO13 = c91Var;
                        }
                        r51.g(list3, list4, list5, hp3Var, ss0Var, rs0Var, (cs0) ((ct0) objO13), null, nv0Var3, 0);
                        nv0Var3.p(false);
                    }
                } else {
                    nv0Var3.U();
                }
                return dm3Var;
        }
    }
}
