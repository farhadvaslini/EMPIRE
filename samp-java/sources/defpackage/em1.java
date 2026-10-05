package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class em1 extends AbstractCollection implements Collection, u61 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ em1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f) {
            case 0:
                ((cm1) this.g).clear();
                break;
            default:
                ((q52) this.g).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                return ((cm1) this.g).containsValue(obj);
            default:
                return ((q52) this.g).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f) {
            case 0:
                return ((cm1) this.g).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                cm1 cm1Var = (cm1) obj;
                cm1Var.getClass();
                return new zl1(cm1Var, 2);
            default:
                q52 q52Var = (q52) obj;
                uk3[] uk3VarArr = new uk3[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    uk3VarArr[i2] = new vk3(2);
                }
                return new u52(q52Var, uk3VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f) {
            case 0:
                cm1 cm1Var = (cm1) this.g;
                cm1Var.b();
                int iG = cm1Var.g(obj);
                if (iG < 0) {
                    return false;
                }
                cm1Var.j(iG);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                ((cm1) this.g).b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                ((cm1) this.g).b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f) {
            case 0:
                return ((cm1) this.g).n;
            default:
                return ((q52) this.g).k;
        }
    }
}
