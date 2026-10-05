package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ai1 extends g0 implements RandomAccess, Serializable {
    public static final ai1 i;
    public Object[] f;
    public int g;
    public boolean h;

    static {
        ai1 ai1Var = new ai1(0);
        ai1Var.h = true;
        i = ai1Var;
    }

    public ai1(int i2) {
        if (i2 >= 0) {
            this.f = new Object[i2];
        } else {
            c.p("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // defpackage.g0
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        g();
        int i3 = this.g;
        if (i2 < 0 || i2 > i3) {
            c.i(nc2.g(i2, i3, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        h(i2, 1);
        this.f[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        g();
        int i3 = this.g;
        if (i2 < 0 || i2 > i3) {
            c.i(nc2.g(i2, i3, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        e(i2, collection, size);
        return size > 0;
    }

    @Override // defpackage.g0
    public final Object b(int i2) {
        g();
        int i3 = this.g;
        if (i2 >= 0 && i2 < i3) {
            return i(i2);
        }
        c.i(nc2.g(i2, i3, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.g);
    }

    public final void e(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        h(i2, i3);
        Iterator it = collection.iterator();
        for (int i4 = 0; i4 < i3; i4++) {
            this.f[i2 + i4] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f;
            int i2 = this.g;
            if (i2 == list.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (s51.n(objArr[i3], list.get(i3))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        h(i2, 1);
        this.f[i2] = obj;
    }

    public final void g() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.g;
        if (i2 >= 0 && i2 < i3) {
            return this.f[i2];
        }
        c.i(nc2.g(i2, i3, "index: ", ", size: "));
        return null;
    }

    public final void h(int i2, int i3) {
        int i4 = this.g + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f;
        if (i4 > objArr.length) {
            int length = objArr.length;
            int i5 = length + (length >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            if (i5 - 2147483639 > 0) {
                i5 = i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f = Arrays.copyOf(objArr, i5);
        }
        Object[] objArr2 = this.f;
        uj.J(objArr2, objArr2, i2 + i3, i2, this.g);
        this.g += i3;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f;
        int i2 = this.g;
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f;
        Object obj = objArr[i2];
        uj.J(objArr, objArr, i2, i2 + 1, this.g);
        Object[] objArr2 = this.f;
        int i3 = this.g - 1;
        objArr2.getClass();
        objArr2[i3] = null;
        this.g--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.g; i2++) {
            if (s51.n(this.f[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.g == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f;
        uj.J(objArr, objArr, i2, i2 + i3, this.g);
        Object[] objArr2 = this.f;
        int i4 = this.g;
        lr.P(objArr2, i4 - i3, i4);
        this.g -= i3;
    }

    public final int k(int i2, int i3, Collection collection, boolean z) {
        Object[] objArr;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr = this.f;
            if (i4 >= i3) {
                break;
            }
            int i6 = i2 + i4;
            if (collection.contains(objArr[i6]) == z) {
                Object[] objArr2 = this.f;
                i4++;
                objArr2[i5 + i2] = objArr2[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        uj.J(objArr, objArr, i2 + i5, i3 + i2, this.g);
        Object[] objArr3 = this.f;
        int i8 = this.g;
        lr.P(objArr3, i8 - i7, i8);
        if (i7 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.g - 1; i2 >= 0; i2--) {
            if (s51.n(this.f[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.g;
        if (i2 >= 0 && i2 <= i3) {
            return new jy0(this, i2);
        }
        c.i(nc2.g(i2, i3, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        g();
        return k(0, this.g, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        return k(0, this.g, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        g();
        int i3 = this.g;
        if (i2 < 0 || i2 >= i3) {
            c.i(nc2.g(i2, i3, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        f80.y(i2, i3, this.g);
        return new zh1(this.f, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.g;
        Object[] objArr2 = this.f;
        if (length < i2) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        uj.J(objArr2, objArr, 0, 0, i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return lr.k(this.f, 0, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i2 = this.g;
        ((AbstractList) this).modCount++;
        h(i2, 1);
        this.f[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return uj.N(this.f, 0, this.g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        int size = collection.size();
        e(this.g, collection, size);
        return size > 0;
    }
}
