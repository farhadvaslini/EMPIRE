package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public interface cn1 {
    default int a(k51 k51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new w80((xm1) list.get(i3), l51.g, p51.g, i2));
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList, n30.b(0, i, 0, 0, 13)).d();
    }

    default int b(k51 k51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new w80((xm1) list.get(i3), l51.g, p51.f, i2));
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList, n30.b(0, 0, 0, i, 7)).g();
    }

    dn1 c(en1 en1Var, List list, long j);

    default int d(k51 k51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new w80((xm1) list.get(i3), l51.f, p51.g, i2));
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList, n30.b(0, i, 0, 0, 13)).d();
    }

    default int e(k51 k51Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new w80((xm1) list.get(i3), l51.f, p51.f, i2));
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList, n30.b(0, 0, 0, i, 7)).g();
    }
}
