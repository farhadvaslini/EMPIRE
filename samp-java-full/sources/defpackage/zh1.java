package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zh1 extends g0 implements RandomAccess, Serializable {
    public Object[] f;
    public final int g;
    public int h;
    public final zh1 i;
    public final ai1 j;

    public zh1(Object[] objArr, int i, int i2, zh1 zh1Var, ai1 ai1Var) {
        objArr.getClass();
        ai1Var.getClass();
        this.f = objArr;
        this.g = i;
        this.h = i2;
        this.i = zh1Var;
        this.j = ai1Var;
        ((AbstractList) this).modCount = ((AbstractList) ai1Var).modCount;
    }

    @Override // defpackage.g0
    public final int a() {
        g();
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        g();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            c.i(nc2.g(i, i2, "index: ", ", size: "));
        } else {
            f(this.g + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        g();
        int i2 = this.h;
        if (i < 0 || i > i2) {
            c.i(nc2.g(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        e(this.g + i, collection, size);
        return size > 0;
    }

    @Override // defpackage.g0
    public final Object b(int i) {
        h();
        g();
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return i(this.g + i);
        }
        c.i(nc2.g(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.g, this.h);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        ai1 ai1Var = this.j;
        zh1 zh1Var = this.i;
        if (zh1Var != null) {
            zh1Var.e(i, collection, i2);
        } else {
            ai1 ai1Var2 = ai1.i;
            ai1Var.e(i, collection, i2);
        }
        this.f = ai1Var.f;
        this.h += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f;
            int i = this.h;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (s51.n(objArr[this.g + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        ai1 ai1Var = this.j;
        zh1 zh1Var = this.i;
        if (zh1Var != null) {
            zh1Var.f(i, obj);
        } else {
            ai1 ai1Var2 = ai1.i;
            ai1Var.f(i, obj);
        }
        this.f = ai1Var.f;
        this.h++;
    }

    public final void g() {
        if (((AbstractList) this.j).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        g();
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return this.f[this.g + i];
        }
        c.i(nc2.g(i, i2, "index: ", ", size: "));
        return null;
    }

    public final void h() {
        if (this.j.h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f;
        int i = this.h;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.g + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i) {
        Object objI;
        ((AbstractList) this).modCount++;
        zh1 zh1Var = this.i;
        if (zh1Var != null) {
            objI = zh1Var.i(i);
        } else {
            ai1 ai1Var = ai1.i;
            objI = this.j.i(i);
        }
        this.h--;
        return objI;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i = 0; i < this.h; i++) {
            if (s51.n(this.f[this.g + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.h == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        zh1 zh1Var = this.i;
        if (zh1Var != null) {
            zh1Var.j(i, i2);
        } else {
            ai1 ai1Var = ai1.i;
            this.j.j(i, i2);
        }
        this.h -= i2;
    }

    public final int k(int i, int i2, Collection collection, boolean z) {
        int iK;
        zh1 zh1Var = this.i;
        if (zh1Var != null) {
            iK = zh1Var.k(i, i2, collection, z);
        } else {
            ai1 ai1Var = ai1.i;
            iK = this.j.k(i, i2, collection, z);
        }
        if (iK > 0) {
            ((AbstractList) this).modCount++;
        }
        this.h -= iK;
        return iK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i = this.h - 1; i >= 0; i--) {
            if (s51.n(this.f[this.g + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        g();
        int i2 = this.h;
        if (i >= 0 && i <= i2) {
            return new jy0(this, i);
        }
        c.i(nc2.g(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.g, this.h, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        g();
        return k(this.g, this.h, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        g();
        int i2 = this.h;
        if (i < 0 || i >= i2) {
            c.i(nc2.g(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f;
        int i3 = this.g;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        f80.y(i, i2, this.h);
        return new zh1(this.f, this.g + i, i2 - i, this, this.j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        g();
        int length = objArr.length;
        int i = this.h;
        Object[] objArr2 = this.f;
        int i2 = this.g;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        uj.J(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.h;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return lr.k(this.f, this.g, this.h, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.g + this.h, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f;
        int i = this.h;
        int i2 = this.g;
        return uj.N(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        g();
        int size = collection.size();
        e(this.g + this.h, collection, size);
        return size > 0;
    }
}
