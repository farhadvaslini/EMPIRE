package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class v52 extends v0 implements e11 {
    public final /* synthetic */ int f;
    public final o52 g;

    public /* synthetic */ v52(o52 o52Var, int i) {
        this.f = i;
        this.g = o52Var;
    }

    @Override // defpackage.t
    public final int a() {
        int i = this.f;
        o52 o52Var = this.g;
        switch (i) {
            case 0:
                o52Var.getClass();
                break;
            default:
                o52Var.getClass();
                break;
        }
        return o52Var.g;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.f;
        o52 o52Var = this.g;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = o52Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && o52Var.containsKey(entry.getKey());
            default:
                return o52Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                tk3 tk3Var = this.g.f;
                uk3[] uk3VarArr = new uk3[8];
                for (int i = 0; i < 8; i++) {
                    uk3VarArr[i] = new vk3(0);
                }
                return new w52(tk3Var, uk3VarArr);
            default:
                tk3 tk3Var2 = this.g.f;
                uk3[] uk3VarArr2 = new uk3[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    uk3VarArr2[i2] = new vk3(1);
                }
                return new w52(tk3Var2, uk3VarArr2);
        }
    }
}
