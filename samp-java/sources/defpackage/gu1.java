package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class gu1 {
    public final yv1 a;
    public final String b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final LinkedHashMap e = new LinkedHashMap();

    public gu1(yv1 yv1Var, String str) {
        this.a = yv1Var;
        this.b = str;
    }

    public fu1 a() {
        fu1 fu1VarB = b();
        fu1VarB.getClass();
        yf yfVar = fu1VarB.g;
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            pt1 pt1Var = (pt1) entry.getValue();
            str.getClass();
            pt1Var.getClass();
            yfVar.getClass();
            ((LinkedHashMap) yfVar.d).put(str, pt1Var);
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        final int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final cu1 cu1Var = (cu1) obj;
            cu1Var.getClass();
            yfVar.getClass();
            ArrayList arrayListM = vr.M((LinkedHashMap) yfVar.d, new ns0() { // from class: hu1
                @Override // defpackage.ns0
                public final Object h(Object obj2) {
                    boolean zContains;
                    int i3 = i;
                    cu1 cu1Var2 = cu1Var;
                    String str2 = (String) obj2;
                    switch (i3) {
                        case 0:
                            str2.getClass();
                            zContains = cu1Var2.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            zContains = cu1Var2.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListM.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + cu1Var.a + " can't be used to open destination " + ((fu1) yfVar.b) + ".\nFollowing required arguments are missing: " + arrayListM).toString());
            }
            ((ArrayList) yfVar.c).add(cu1Var);
        }
        Iterator it = this.e.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            ((Number) entry2.getKey()).intValue();
            entry2.getValue().getClass();
            qn1.b();
            return null;
        }
        String str2 = this.b;
        if (str2 != null) {
            yfVar.getClass();
            if (y93.q0(str2)) {
                c.p("Cannot have an empty route");
                return null;
            }
            String strConcat = "android-app://androidx.navigation/".concat(str2);
            final cu1 cu1Var2 = new cu1(strConcat);
            final int i3 = 1;
            ArrayList arrayListM2 = vr.M((LinkedHashMap) yfVar.d, new ns0() { // from class: hu1
                @Override // defpackage.ns0
                public final Object h(Object obj2) {
                    boolean zContains;
                    int i32 = i3;
                    cu1 cu1Var22 = cu1Var2;
                    String str22 = (String) obj2;
                    switch (i32) {
                        case 0:
                            str22.getClass();
                            zContains = cu1Var22.c().contains(str22);
                            break;
                        default:
                            str22.getClass();
                            zContains = cu1Var22.c().contains(str22);
                            break;
                    }
                    return Boolean.valueOf(!zContains);
                }
            });
            if (!arrayListM2.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str2 + "\" for destination " + ((fu1) yfVar.b) + ". Following required arguments are missing: " + arrayListM2).toString());
            }
            yfVar.f = new xb3(new it1(1, strConcat));
            yfVar.a = strConcat.hashCode();
            yfVar.e = str2;
        }
        return fu1VarB;
    }

    public fu1 b() {
        return this.a.a();
    }
}
