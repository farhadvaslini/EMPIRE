package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class br3 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapB0 = om1.b0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapB0.values().iterator();
        while (it.hasNext()) {
            ((vq3) it.next()).b();
        }
    }

    public final String toString() {
        String strC = rk2.a(br3.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        ur.r(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strC + "@" + string + "(keys=" + qx.R0(this.a.keySet()) + ")";
    }
}
