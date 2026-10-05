package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zv1 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(yv1 yv1Var) {
        yv1Var.getClass();
        String strW = uq.w(yv1Var.getClass());
        if (strW.length() <= 0) {
            c.p("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        yv1 yv1Var2 = (yv1) linkedHashMap.get(strW);
        if (s51.n(yv1Var2, yv1Var)) {
            return;
        }
        if (yv1Var2 != null && yv1Var2.b) {
            qn1.o("Navigator ", yv1Var, " is replacing an already attached ", yv1Var2);
        } else if (yv1Var.b) {
            qn1.f(yv1Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final yv1 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            c.p("navigator name cannot be an empty string");
            return null;
        }
        yv1 yv1Var = (yv1) this.a.get(str);
        if (yv1Var != null) {
            return yv1Var;
        }
        c.q(nc2.i("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
