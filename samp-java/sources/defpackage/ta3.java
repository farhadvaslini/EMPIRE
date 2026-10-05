package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ta3 implements Collection, t61 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public ta3() {
        int i = s02.a;
        this.g = new bs1(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.f) {
            case 0:
                ((bs1) this.g).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).c(obj);
            default:
                return ((is1) this.g).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((bs1) obj).c(it.next())) {
                        break;
                    }
                }
                break;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((is1) obj).d(it2.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).g == 0;
            default:
                return ((is1) this.g).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                bs1 bs1Var = (bs1) this.g;
                bs1Var.getClass();
                return new yv0(new ds1(bs1Var));
            default:
                return b32.u(new jj0(this, null, 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.f) {
            case 0:
                return ((bs1) this.g).g;
            default:
                return ((is1) this.g).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f) {
            case 0:
                break;
            default:
                objArr.getClass();
                break;
        }
        return f80.S(this, objArr);
    }

    public ta3(is1 is1Var) {
        is1Var.getClass();
        this.g = is1Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.f) {
        }
        return f80.R(this);
    }
}
