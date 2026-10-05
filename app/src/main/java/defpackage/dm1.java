package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dm1 extends h0 {
    public final /* synthetic */ int f;
    public final cm1 g;

    public /* synthetic */ dm1(cm1 cm1Var, int i) {
        this.f = i;
        this.g = cm1Var;
    }

    @Override // defpackage.h0
    public final int a() {
        switch (this.f) {
        }
        return this.g.n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.f;
        collection.getClass();
        switch (i) {
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
        int i = this.f;
        cm1 cm1Var = this.g;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                cm1Var.getClass();
                int iF = cm1Var.f(entry.getKey());
                if (iF < 0) {
                    return false;
                }
                Object[] objArr = cm1Var.g;
                objArr.getClass();
                return s51.n(objArr[iF], entry.getValue());
            default:
                return cm1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                return this.g.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f) {
        }
        return this.g.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f;
        cm1 cm1Var = this.g;
        switch (i) {
            case 0:
                cm1Var.getClass();
                return new zl1(cm1Var, 0);
            default:
                cm1Var.getClass();
                return new zl1(cm1Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f;
        cm1 cm1Var = this.g;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    cm1Var.getClass();
                    cm1Var.b();
                    int iF = cm1Var.f(entry.getKey());
                    if (iF >= 0) {
                        Object[] objArr = cm1Var.g;
                        objArr.getClass();
                        if (s51.n(objArr[iF], entry.getValue())) {
                            cm1Var.j(iF);
                        }
                    }
                }
                break;
            default:
                cm1Var.b();
                int iF2 = cm1Var.f(obj);
                if (iF2 >= 0) {
                    cm1Var.j(iF2);
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f;
        cm1 cm1Var = this.g;
        collection.getClass();
        switch (i) {
            case 0:
                cm1Var.b();
                break;
            default:
                cm1Var.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f;
        cm1 cm1Var = this.g;
        collection.getClass();
        switch (i) {
            case 0:
                cm1Var.b();
                break;
            default:
                cm1Var.b();
                break;
        }
        return super.retainAll(collection);
    }
}
