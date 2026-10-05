package defpackage;

import java.util.List;
import top.th1nk.samp.feature.raksamp.RaksampNativeBridge;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni2 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ni2(vi2 vi2Var, String str, boolean z, os1 os1Var, os1 os1Var2, e93 e93Var, e93 e93Var2, e93 e93Var3) {
        this.i = vi2Var;
        this.g = str;
        this.h = z;
        this.j = os1Var;
        this.k = os1Var2;
        this.l = e93Var;
        this.m = e93Var2;
        this.n = e93Var3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        dm3 dm3Var;
        e93 e93Var;
        ns0 ns0Var;
        int i = this.f;
        dm3 dm3Var2 = dm3.a;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        Object obj6 = this.k;
        Object obj7 = this.j;
        Object obj8 = this.i;
        switch (i) {
            case 0:
                final vi2 vi2Var = (vi2) obj8;
                final os1 os1Var = (os1) obj7;
                final os1 os1Var2 = (os1) obj6;
                e93 e93Var2 = (e93) obj5;
                e93 e93Var3 = (e93) obj4;
                e93 e93Var4 = (e93) obj3;
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    boolean zBooleanValue = ((Boolean) os1Var.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) os1Var2.getValue()).booleanValue();
                    Object objO = nv0Var.O();
                    zj zjVar = c20.a;
                    if (objO == zjVar) {
                        objO = new mh2(os1Var, 9);
                        nv0Var.j0(objO);
                    }
                    cs0 cs0Var = (cs0) objO;
                    Object objO2 = nv0Var.O();
                    if (objO2 == zjVar) {
                        objO2 = new mh2(os1Var2, 10);
                        nv0Var.j0(objO2);
                    }
                    cs0 cs0Var2 = (cs0) objO2;
                    Object objO3 = nv0Var.O();
                    if (objO3 == zjVar) {
                        objO3 = new mh2(os1Var, 11);
                        nv0Var.j0(objO3);
                    }
                    cs0 cs0Var3 = (cs0) objO3;
                    Object objO4 = nv0Var.O();
                    if (objO4 == zjVar) {
                        dm3Var = dm3Var2;
                        objO4 = new mh2(os1Var2, 12);
                        nv0Var.j0(objO4);
                    } else {
                        dm3Var = dm3Var2;
                    }
                    cs0 cs0Var4 = (cs0) objO4;
                    boolean zH = nv0Var.h(vi2Var);
                    Object objO5 = nv0Var.O();
                    if (zH || objO5 == zjVar) {
                        e93Var = e93Var4;
                        final int i2 = 0;
                        objO5 = new ns0() { // from class: di2
                            @Override // defpackage.ns0
                            public final Object h(Object obj9) {
                                int i3 = i2;
                                dm3 dm3Var3 = dm3.a;
                                os1 os1Var3 = os1Var;
                                vi2 vi2Var2 = vi2Var;
                                switch (i3) {
                                    case 0:
                                        int iIntValue2 = ((Integer) obj9).intValue();
                                        i93 i93Var = vi2Var2.E;
                                        int iIntValue3 = (1 << iIntValue2) ^ ((Number) i93Var.getValue()).intValue();
                                        Integer numValueOf = Integer.valueOf(iIntValue3);
                                        i93Var.getClass();
                                        i93Var.j(null, numValueOf);
                                        RaksampNativeBridge.INSTANCE.setCustomKeys(vi2Var2.c, iIntValue3);
                                        os1Var3.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        String str = (String) obj9;
                                        str.getClass();
                                        RaksampNativeBridge.INSTANCE.sendChat(vi2Var2.c, str);
                                        os1Var3.setValue(Boolean.FALSE);
                                        break;
                                }
                                return dm3Var3;
                            }
                        };
                        nv0Var.j0(objO5);
                    } else {
                        e93Var = e93Var4;
                    }
                    ns0 ns0Var2 = (ns0) objO5;
                    List list = (List) e93Var2.getValue();
                    lf2 lf2Var = vi2Var.J;
                    boolean zH2 = nv0Var.h(vi2Var);
                    Object objO6 = nv0Var.O();
                    if (zH2 || objO6 == zjVar) {
                        final int i3 = 1;
                        objO6 = new ns0() { // from class: di2
                            @Override // defpackage.ns0
                            public final Object h(Object obj9) {
                                int i32 = i3;
                                dm3 dm3Var3 = dm3.a;
                                os1 os1Var3 = os1Var2;
                                vi2 vi2Var2 = vi2Var;
                                switch (i32) {
                                    case 0:
                                        int iIntValue2 = ((Integer) obj9).intValue();
                                        i93 i93Var = vi2Var2.E;
                                        int iIntValue3 = (1 << iIntValue2) ^ ((Number) i93Var.getValue()).intValue();
                                        Integer numValueOf = Integer.valueOf(iIntValue3);
                                        i93Var.getClass();
                                        i93Var.j(null, numValueOf);
                                        RaksampNativeBridge.INSTANCE.setCustomKeys(vi2Var2.c, iIntValue3);
                                        os1Var3.setValue(Boolean.FALSE);
                                        break;
                                    default:
                                        String str = (String) obj9;
                                        str.getClass();
                                        RaksampNativeBridge.INSTANCE.sendChat(vi2Var2.c, str);
                                        os1Var3.setValue(Boolean.FALSE);
                                        break;
                                }
                                return dm3Var3;
                            }
                        };
                        nv0Var.j0(objO6);
                    }
                    ns0 ns0Var3 = (ns0) objO6;
                    Object objO7 = nv0Var.O();
                    if (objO7 == zjVar) {
                        ns0Var = ns0Var3;
                        objO7 = new mh2(os1Var2, 13);
                        nv0Var.j0(objO7);
                    } else {
                        ns0Var = ns0Var3;
                    }
                    cs0 cs0Var5 = (cs0) objO7;
                    String str = (String) e93Var3.getValue();
                    boolean zH3 = nv0Var.h(vi2Var);
                    Object objO8 = nv0Var.O();
                    if (zH3 || objO8 == zjVar) {
                        objO8 = new e91(1, vi2Var, vi2.class, "onChatInputChange", "onChatInputChange(Ljava/lang/String;)V", 0, 0, 18);
                        nv0Var.j0(objO8);
                    }
                    ns0 ns0Var4 = (ns0) ((ct0) objO8);
                    boolean zH4 = nv0Var.h(vi2Var);
                    Object objO9 = nv0Var.O();
                    if (zH4 || objO9 == zjVar) {
                        objO9 = new c91(0, vi2Var, vi2.class, "sendChatMessage", "sendChatMessage()V", 0, 0, 28);
                        nv0Var.j0(objO9);
                    }
                    cs0 cs0Var6 = (cs0) ((ct0) objO9);
                    boolean zBooleanValue3 = ((Boolean) e93Var.getValue()).booleanValue();
                    boolean zH5 = nv0Var.h(vi2Var);
                    Object objO10 = nv0Var.O();
                    if (zH5 || objO10 == zjVar) {
                        objO10 = new c91(0, vi2Var, vi2.class, "toggleAfk", "toggleAfk()V", 0, 0, 27);
                        nv0Var.j0(objO10);
                    }
                    vm1.g(zBooleanValue, zBooleanValue2, cs0Var, cs0Var2, cs0Var3, cs0Var4, ns0Var2, list, lf2Var, this.g, ns0Var, cs0Var5, str, ns0Var4, cs0Var6, this.h, zBooleanValue3, (cs0) ((ct0) objO10), nv0Var, 224640);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                w7.v((g83) obj8, this.g, this.h, (ns0) obj7, (ns0) obj6, (cs0) obj5, (cs0) obj4, (ns0) obj3, (nv0) obj, jo3.y(1));
                break;
        }
        return dm3Var2;
    }

    public /* synthetic */ ni2(g83 g83Var, String str, boolean z, ns0 ns0Var, ns0 ns0Var2, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var3, int i) {
        this.i = g83Var;
        this.g = str;
        this.h = z;
        this.j = ns0Var;
        this.k = ns0Var2;
        this.l = cs0Var;
        this.m = cs0Var2;
        this.n = ns0Var3;
    }
}
