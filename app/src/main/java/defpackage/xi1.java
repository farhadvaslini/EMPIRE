package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi1 implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ rs0 g;

    public /* synthetic */ xi1(int i, rs0 rs0Var) {
        this.g = rs0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        gq2 gq2Var;
        int i = this.f;
        rs0 rs0Var = this.g;
        switch (i) {
            case 0:
                cq2 cq2Var = (cq2) obj;
                List list = (List) rs0Var.f(cq2Var, obj2);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (gq2Var = cq2Var.g) != null && !gq2Var.b(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                ((Integer) obj2).getClass();
                lc3.c(rs0Var, (nv0) obj, jo3.y(1));
                return dm3.a;
        }
    }

    public /* synthetic */ xi1(rs0 rs0Var) {
        this.g = rs0Var;
    }
}
