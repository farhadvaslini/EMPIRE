package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class mj extends g0 {
    public static final Object[] i = new Object[0];
    public int f;
    public Object[] g;
    public int h;

    public mj(int i2) {
        Object[] objArr;
        if (i2 == 0) {
            objArr = i;
        } else {
            if (i2 <= 0) {
                c.p(by1.e(i2, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i2];
        }
        this.g = objArr;
    }

    @Override // defpackage.g0
    public final int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.h;
        if (i2 < 0 || i2 > i3) {
            c.i(nc2.g(i2, i3, "index: ", ", size: "));
            return;
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        l();
        e(this.h + 1);
        int iK = k(this.f + i2);
        int i4 = this.h;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iK == 0) {
                Object[] objArr = this.g;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iK - 1;
            }
            int length2 = this.f;
            if (length2 == 0) {
                Object[] objArr2 = this.g;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i5 = length2 - 1;
            int i6 = this.f;
            Object[] objArr3 = this.g;
            if (length >= i6) {
                objArr3[i5] = objArr3[i6];
                uj.J(objArr3, objArr3, i6, i6 + 1, length + 1);
            } else {
                uj.J(objArr3, objArr3, i6 - 1, i6, objArr3.length);
                Object[] objArr4 = this.g;
                objArr4[objArr4.length - 1] = objArr4[0];
                uj.J(objArr4, objArr4, 0, 1, length + 1);
            }
            this.g[length] = obj;
            this.f = i5;
        } else {
            int iK2 = k(i4 + this.f);
            Object[] objArr5 = this.g;
            if (iK < iK2) {
                uj.J(objArr5, objArr5, iK + 1, iK, iK2);
            } else {
                uj.J(objArr5, objArr5, 1, 0, iK2);
                Object[] objArr6 = this.g;
                objArr6[0] = objArr6[objArr6.length - 1];
                uj.J(objArr6, objArr6, iK + 1, iK, objArr6.length - 1);
            }
            this.g[iK] = obj;
        }
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        collection.getClass();
        int i3 = this.h;
        if (i2 < 0 || i2 > i3) {
            c.i(nc2.g(i2, i3, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.h) {
            return addAll(collection);
        }
        l();
        e(collection.size() + this.h);
        int iK = k(this.h + this.f);
        int iK2 = k(this.f + i2);
        int size = collection.size();
        if (i2 >= ((this.h + 1) >> 1)) {
            int i4 = iK2 + size;
            Object[] objArr = this.g;
            if (iK2 < iK) {
                int i5 = size + iK;
                if (i5 <= objArr.length) {
                    uj.J(objArr, objArr, i4, iK2, iK);
                } else if (i4 >= objArr.length) {
                    uj.J(objArr, objArr, i4 - objArr.length, iK2, iK);
                } else {
                    int length = iK - (i5 - objArr.length);
                    uj.J(objArr, objArr, 0, length, iK);
                    Object[] objArr2 = this.g;
                    uj.J(objArr2, objArr2, i4, iK2, length);
                }
            } else {
                uj.J(objArr, objArr, size, 0, iK);
                Object[] objArr3 = this.g;
                if (i4 >= objArr3.length) {
                    uj.J(objArr3, objArr3, i4 - objArr3.length, iK2, objArr3.length);
                } else {
                    uj.J(objArr3, objArr3, 0, objArr3.length - size, objArr3.length);
                    Object[] objArr4 = this.g;
                    uj.J(objArr4, objArr4, i4, iK2, objArr4.length - size);
                }
            }
            c(iK2, collection);
            return true;
        }
        int i6 = this.f;
        int length2 = i6 - size;
        Object[] objArr5 = this.g;
        if (iK2 < i6) {
            uj.J(objArr5, objArr5, length2, i6, objArr5.length);
            Object[] objArr6 = this.g;
            if (size >= iK2) {
                uj.J(objArr6, objArr6, objArr6.length - size, 0, iK2);
            } else {
                uj.J(objArr6, objArr6, objArr6.length - size, 0, size);
                Object[] objArr7 = this.g;
                uj.J(objArr7, objArr7, 0, size, iK2);
            }
        } else if (length2 >= 0) {
            uj.J(objArr5, objArr5, length2, i6, iK2);
        } else {
            length2 += objArr5.length;
            int i7 = iK2 - i6;
            int length3 = objArr5.length - length2;
            if (length3 >= i7) {
                uj.J(objArr5, objArr5, length2, i6, iK2);
            } else {
                uj.J(objArr5, objArr5, length2, i6, i6 + length3);
                Object[] objArr8 = this.g;
                uj.J(objArr8, objArr8, 0, this.f + length3, iK2);
            }
        }
        this.f = length2;
        c(i(iK2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        e(this.h + 1);
        int length = this.f;
        if (length == 0) {
            Object[] objArr = this.g;
            objArr.getClass();
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f = i2;
        this.g[i2] = obj;
        this.h++;
    }

    public final void addLast(Object obj) {
        l();
        e(a() + 1);
        this.g[k(a() + this.f)] = obj;
        this.h = a() + 1;
    }

    @Override // defpackage.g0
    public final Object b(int i2) {
        int i3 = this.h;
        if (i2 < 0 || i2 >= i3) {
            c.i(nc2.g(i2, i3, "index: ", ", size: "));
            return null;
        }
        if (i2 == a() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        l();
        int iK = k(this.f + i2);
        Object[] objArr = this.g;
        Object obj = objArr[iK];
        int i4 = this.h >> 1;
        int i5 = this.f;
        if (i2 < i4) {
            if (iK >= i5) {
                uj.J(objArr, objArr, i5 + 1, i5, iK);
            } else {
                uj.J(objArr, objArr, 1, 0, iK);
                Object[] objArr2 = this.g;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i6 = this.f;
                uj.J(objArr2, objArr2, i6 + 1, i6, objArr2.length - 1);
            }
            Object[] objArr3 = this.g;
            int i7 = this.f;
            objArr3[i7] = null;
            this.f = g(i7);
        } else {
            int iK2 = k((a() - 1) + i5);
            Object[] objArr4 = this.g;
            if (iK <= iK2) {
                uj.J(objArr4, objArr4, iK, iK + 1, iK2 + 1);
            } else {
                uj.J(objArr4, objArr4, iK, iK + 1, objArr4.length);
                Object[] objArr5 = this.g;
                objArr5[objArr5.length - 1] = objArr5[0];
                uj.J(objArr5, objArr5, 0, 1, iK2 + 1);
            }
            this.g[iK2] = null;
        }
        this.h--;
        return obj;
    }

    public final void c(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.g.length;
        while (i2 < length && it.hasNext()) {
            this.g[i2] = it.next();
            i2++;
        }
        int i3 = this.f;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.g[i4] = it.next();
        }
        this.h = collection.size() + this.h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.f, k(a() + this.f));
        }
        this.f = 0;
        this.h = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i2) {
        if (i2 < 0) {
            c.q("Deque is too big.");
            return;
        }
        Object[] objArr = this.g;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == i) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.g = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        uj.J(objArr, objArr2, 0, this.f, objArr.length);
        Object[] objArr3 = this.g;
        int length2 = objArr3.length;
        int i4 = this.f;
        uj.J(objArr3, objArr2, length2 - i4, 0, i4);
        this.f = 0;
        this.g = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.g[this.f];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.g[this.f];
        }
        c.m("ArrayDeque is empty.");
        return null;
    }

    public final int g(int i2) {
        this.g.getClass();
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int iA = a();
        if (i2 >= 0 && i2 < iA) {
            return this.g[k(this.f + i2)];
        }
        c.i(nc2.g(i2, iA, "index: ", ", size: "));
        return null;
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.g[k((size() - 1) + this.f)];
    }

    public final int i(int i2) {
        return i2 < 0 ? i2 + this.g.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iK = k(a() + this.f);
        int length = this.f;
        if (length < iK) {
            while (length < iK) {
                if (s51.n(obj, this.g[length])) {
                    i2 = this.f;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f) < iK) {
            return -1;
        }
        int length2 = this.g.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iK; i3++) {
                    if (s51.n(obj, this.g[i3])) {
                        length = i3 + this.g.length;
                        i2 = this.f;
                    }
                }
                return -1;
            }
            if (s51.n(obj, this.g[length])) {
                i2 = this.f;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i2, int i3) {
        Object[] objArr = this.g;
        if (i2 < i3) {
            uj.O(i2, i3, null, objArr);
        } else {
            uj.O(i2, objArr.length, null, objArr);
            uj.O(0, i3, null, this.g);
        }
    }

    public final int k(int i2) {
        Object[] objArr = this.g;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            c.m("ArrayDeque is empty.");
            return null;
        }
        return this.g[k((size() - 1) + this.f)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iK = k(this.h + this.f);
        int i3 = this.f;
        if (i3 < iK) {
            length = iK - 1;
            if (i3 <= length) {
                while (!s51.n(obj, this.g[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f;
                return length - i2;
            }
            return -1;
        }
        if (!isEmpty() && this.f >= iK) {
            while (true) {
                iK--;
                Object[] objArr = this.g;
                if (-1 >= iK) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i4 = this.f;
                    if (i4 <= length) {
                        while (!s51.n(obj, this.g[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i2 = this.f;
                    }
                } else if (s51.n(obj, objArr[iK])) {
                    length = iK + this.g.length;
                    i2 = this.f;
                    break;
                }
            }
            return length - i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iK;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.g.length != 0) {
            int iK2 = k(a() + this.f);
            int i2 = this.f;
            if (i2 < iK2) {
                iK = i2;
                while (true) {
                    objArr = this.g;
                    if (i2 >= iK2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.g[iK] = obj;
                        iK++;
                    }
                    i2++;
                }
                uj.O(iK, iK2, null, objArr);
            } else {
                int length = this.g.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.g;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.g[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iK = k(i3);
                for (int i4 = 0; i4 < iK2; i4++) {
                    Object[] objArr3 = this.g;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.g[iK] = obj3;
                        iK = g(iK);
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.h = i(iK - this.f);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            c.m("ArrayDeque is empty.");
            return null;
        }
        l();
        Object[] objArr = this.g;
        int i2 = this.f;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f = g(i2);
        this.h = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            c.m("ArrayDeque is empty.");
            return null;
        }
        l();
        int iK = k((size() - 1) + this.f);
        Object[] objArr = this.g;
        Object obj = objArr[iK];
        objArr[iK] = null;
        this.h = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        f80.y(i2, i3, this.h);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.h) {
            clear();
            return;
        }
        if (i4 == 1) {
            b(i2);
            return;
        }
        l();
        int i5 = this.h - i3;
        int i6 = this.f;
        if (i2 < i5) {
            int iK = k((i2 - 1) + i6);
            int iK2 = k(this.f + (i3 - 1));
            while (i2 > 0) {
                int i7 = iK + 1;
                int iMin = Math.min(i2, Math.min(i7, iK2 + 1));
                Object[] objArr = this.g;
                int i8 = iK2 - iMin;
                int i9 = iK - iMin;
                uj.J(objArr, objArr, i8 + 1, i9 + 1, i7);
                iK = i(i9);
                iK2 = i(i8);
                i2 -= iMin;
            }
            int iK3 = k(this.f + i4);
            j(this.f, iK3);
            this.f = iK3;
        } else {
            int iK4 = k(i6 + i3);
            int iK5 = k(this.f + i2);
            int i10 = this.h;
            while (true) {
                i10 -= i3;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.g;
                i3 = Math.min(i10, Math.min(objArr2.length - iK4, objArr2.length - iK5));
                Object[] objArr3 = this.g;
                int i11 = iK4 + i3;
                uj.J(objArr3, objArr3, iK5, iK4, i11);
                iK4 = k(i11);
                iK5 = k(iK5 + i3);
            }
            int iK6 = k(this.h + this.f);
            j(i(iK6 - i4), iK6);
        }
        this.h -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iK;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.g.length != 0) {
            int iK2 = k(a() + this.f);
            int i2 = this.f;
            if (i2 < iK2) {
                iK = i2;
                while (true) {
                    objArr = this.g;
                    if (i2 >= iK2) {
                        break;
                    }
                    Object obj = objArr[i2];
                    if (collection.contains(obj)) {
                        this.g[iK] = obj;
                        iK++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                uj.O(iK, iK2, null, objArr);
            } else {
                int length = this.g.length;
                boolean z2 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.g;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.g[i3] = obj2;
                        i3++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                iK = k(i3);
                for (int i4 = 0; i4 < iK2; i4++) {
                    Object[] objArr3 = this.g;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.g[iK] = obj3;
                        iK = g(iK);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                l();
                this.h = i(iK - this.f);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int iA = a();
        if (i2 < 0 || i2 >= iA) {
            c.i(nc2.g(i2, iA, "index: ", ", size: "));
            return null;
        }
        int iK = k(this.f + i2);
        Object[] objArr = this.g;
        Object obj2 = objArr[iK];
        objArr[iK] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i2 = this.h;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iK = k(this.h + this.f);
        int i3 = this.f;
        if (i3 < iK) {
            uj.L(this.g, objArr, i3, iK, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.g;
            uj.J(objArr2, objArr, 0, this.f, objArr2.length);
            Object[] objArr3 = this.g;
            uj.J(objArr3, objArr, objArr3.length - this.f, 0, iK);
        }
        int i4 = this.h;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public mj() {
        this.g = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        l();
        e(collection.size() + a());
        c(k(a() + this.f), collection);
        return true;
    }
}
