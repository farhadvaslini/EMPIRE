package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class bf {
    public static final af a = new af("");

    public static final List a(af afVar, int i, int i2, u0 u0Var) {
        List list;
        if (i == i2 || (list = afVar.f) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= afVar.g.length()) {
            if (u0Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) u0Var.h(((ze) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            ze zeVar = (ze) list.get(i3);
            if (u0Var != null ? ((Boolean) u0Var.h(zeVar.a)).booleanValue() : true) {
                int i4 = zeVar.b;
                int i5 = zeVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new ze((we) zeVar.a, y02.h(zeVar.b, i, i2) - i, y02.h(i5, i, i2) - i, zeVar.d));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
