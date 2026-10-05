package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mu {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public mu(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            ef1 ef1Var = (ef1) entry.getValue();
            List arrayList = (List) this.a.get(ef1Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(ef1Var, arrayList);
            }
            arrayList.add((nu) entry.getKey());
        }
    }

    public static void a(List list, of1 of1Var, ef1 ef1Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nu nuVar = (nu) list.get(size);
                Method method = nuVar.b;
                try {
                    int i = nuVar.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, of1Var);
                    } else if (i == 2) {
                        method.invoke(obj, of1Var, ef1Var);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
