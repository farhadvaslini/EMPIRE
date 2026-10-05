package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j21 implements jp2 {
    public final LinkedHashMap f;

    public j21(int i) {
        switch (i) {
            case 1:
                this.f = new LinkedHashMap(0, 0.75f, true);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                this.f = new LinkedHashMap();
                break;
            default:
                this.f = new LinkedHashMap();
                break;
        }
    }

    public void a(lu luVar, ns0 ns0Var) {
        ns0Var.getClass();
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(luVar)) {
            c.g(nc2.i("A `initializer` with the same `clazz` has already been added: ", luVar.b(), "."));
        } else {
            linkedHashMap.put(luVar, new xq3(luVar, ns0Var));
        }
    }

    public i21 b() {
        Collection collectionValues = this.f.values();
        collectionValues.getClass();
        xq3[] xq3VarArr = (xq3[]) collectionValues.toArray(new xq3[0]);
        return new i21((xq3[]) Arrays.copyOf(xq3VarArr, xq3VarArr.length));
    }

    @Override // defpackage.jp2
    public db c(String str, String str2) {
        LinkedHashMap linkedHashMap = this.f;
        Object objA = linkedHashMap.get(str);
        if (objA == null) {
            objA = p1.a(str2);
            linkedHashMap.put(str, objA);
        }
        return (db) objA;
    }
}
