package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ls1 implements x61, Set, t61 {
    public final js1 f;
    public final js1 g;

    public ls1(js1 js1Var) {
        this.f = js1Var;
        this.g = js1Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.g.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        js1 js1Var = this.g;
        int i = js1Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            js1Var.k(it.next());
        }
        return i != js1Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.g.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ls1.class != obj.getClass()) {
            return false;
        }
        return this.f.equals(((ls1) obj).f);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new yv0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.g.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        js1 js1Var = this.g;
        int i = js1Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            js1Var.i(it.next());
        }
        return i != js1Var.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        js1 js1Var = this.g;
        Object[] objArr = js1Var.b;
        int i = js1Var.d;
        long[] jArr = js1Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!qx.m0(collection, objArr[i5])) {
                                js1Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != js1Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return f80.S(this, objArr);
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return f80.R(this);
    }
}
