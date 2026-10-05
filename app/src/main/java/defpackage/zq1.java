package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public interface zq1 {
    default int a(k51 k51Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new w80((xm1) list2.get(i3), l51.g, p51.g, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList2, n30.b(0, i, 0, 0, 13)).d();
    }

    default int b(k51 k51Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new w80((xm1) list2.get(i3), l51.g, p51.f, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList2, n30.b(0, 0, 0, i, 7)).g();
    }

    dn1 c(en1 en1Var, List list, long j);

    default int d(k51 k51Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new w80((xm1) list2.get(i3), l51.f, p51.g, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList2, n30.b(0, i, 0, 0, 13)).d();
    }

    default int e(k51 k51Var, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new w80((xm1) list2.get(i3), l51.f, p51.f, 0));
            }
            arrayList2.add(arrayList3);
        }
        return c(new x51(k51Var, k51Var.getLayoutDirection()), arrayList2, n30.b(0, 0, 0, i, 7)).g();
    }
}
