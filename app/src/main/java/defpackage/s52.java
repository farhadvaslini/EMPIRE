package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class s52 extends h0 {
    public final /* synthetic */ int f;
    public final q52 g;

    public /* synthetic */ s52(int i, q52 q52Var) {
        this.f = i;
        this.g = q52Var;
    }

    @Override // defpackage.h0
    public final int a() {
        switch (this.f) {
        }
        return this.g.k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f) {
            case 0:
                this.g.clear();
                break;
            default:
                this.g.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                q52 q52Var = this.g;
                Object obj2 = q52Var.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && q52Var.containsKey(entry.getKey());
            default:
                return this.g.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                return new t52(this.g);
            default:
                uk3[] uk3VarArr = new uk3[8];
                for (int i = 0; i < 8; i++) {
                    uk3VarArr[i] = new vk3(1);
                }
                return new u52(this.g, uk3VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.g.remove(entry.getKey(), entry.getValue());
            default:
                q52 q52Var = this.g;
                if (!q52Var.containsKey(obj)) {
                    return false;
                }
                q52Var.remove(obj);
                return true;
        }
    }
}
