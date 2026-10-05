package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class na1 extends mb3 implements us0 {
    public /* synthetic */ List j;
    public /* synthetic */ rj2 k;
    public /* synthetic */ List l;
    public /* synthetic */ Map m;

    @Override // defpackage.us0
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        na1 na1Var = new na1(5, (p40) obj5);
        na1Var.j = (List) obj;
        na1Var.k = (rj2) obj2;
        na1Var.l = (List) obj3;
        na1Var.m = (Map) obj4;
        return na1Var.o(dm3.a);
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        List<sv2> list = this.j;
        rj2 rj2Var = this.k;
        List list2 = this.l;
        Map map = this.m;
        y02.Q(obj);
        HashSet hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            hashSet.add(((kq2) it.next()).e);
        }
        ArrayList arrayList = new ArrayList(rx.d0(list, 10));
        for (sv2 sv2Var : list) {
            String str = sv2Var.c;
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            wy2 wy2Var = (wy2) map.get(lowerCase);
            if (wy2Var == null) {
                wy2Var = ty2.a;
            }
            String lowerCase2 = sv2Var.c.toLowerCase(locale);
            lowerCase2.getClass();
            arrayList.add(new qj2(sv2Var, wy2Var, hashSet.contains(lowerCase2)));
        }
        rj2 rj2Var2 = rj2.g;
        if (rj2Var == rj2Var2 && list.isEmpty()) {
            return uj2.a;
        }
        rj2 rj2Var3 = rj2.i;
        if (rj2Var == rj2Var3 && list.isEmpty()) {
            return tj2.a;
        }
        return new sj2(arrayList, rj2Var == rj2Var2, rj2Var == rj2Var3);
    }
}
