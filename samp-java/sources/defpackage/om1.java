package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class om1 extends vp {
    public static cm1 W(cm1 cm1Var) {
        cm1Var.b();
        cm1Var.r = true;
        if (cm1Var.n > 0) {
            return cm1Var;
        }
        cm1 cm1Var2 = cm1.s;
        cm1Var2.getClass();
        return cm1Var2;
    }

    public static int X(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map Y(r32... r32VarArr) {
        if (r32VarArr.length <= 0) {
            return oi0.f;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(X(r32VarArr.length));
        Z(linkedHashMap, r32VarArr);
        return linkedHashMap;
    }

    public static final void Z(HashMap map, r32[] r32VarArr) {
        for (r32 r32Var : r32VarArr) {
            map.put(r32Var.f, r32Var.g);
        }
    }

    public static Map a0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return oi0.f;
        }
        int i = 0;
        if (size == 1) {
            r32 r32Var = (r32) arrayList.get(0);
            r32Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(r32Var.f, r32Var.g);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(X(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            r32 r32Var2 = (r32) obj;
            linkedHashMap.put(r32Var2.f, r32Var2.g);
        }
        return linkedHashMap;
    }

    public static Map b0(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return oi0.f;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
