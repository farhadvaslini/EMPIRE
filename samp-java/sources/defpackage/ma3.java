package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ma3 implements List, u61 {
    public final l73 f;
    public final int g;
    public int h;
    public int i;

    public ma3(l73 l73Var, int i, int i2) {
        this.f = l73Var;
        this.g = i;
        this.h = w7.S(l73Var);
        this.i = i2 - i;
    }

    public final void a() {
        if (w7.S(this.f) != this.h) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.g + this.i;
        l73 l73Var = this.f;
        l73Var.add(i, obj);
        this.i++;
        this.h = w7.S(l73Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.g;
        l73 l73Var = this.f;
        boolean zAddAll = l73Var.addAll(i2, collection);
        if (zAddAll) {
            this.i = collection.size() + this.i;
            this.h = w7.S(l73Var);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.i > 0) {
            a();
            int i = this.i;
            int i2 = this.g;
            l73 l73Var = this.f;
            l73Var.e(i2, i + i2);
            this.i = 0;
            this.h = w7.S(l73Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a();
        w7.A(i, this.i);
        return this.f.get(this.g + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.i;
        int i2 = this.g;
        Iterator it = y02.S(i2, i + i2).iterator();
        while (((k41) it).h) {
            int iNextInt = ((e41) it).nextInt();
            if (s51.n(obj, this.f.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.i == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.i;
        int i2 = this.g;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (s51.n(obj, this.f.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ok2 ok2Var = new ok2();
        ok2Var.f = i - 1;
        return new yn2(ok2Var, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.g + i;
        l73 l73Var = this.f;
        Object objRemove = l73Var.remove(i2);
        this.i--;
        this.h = w7.S(l73Var);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        a();
        l73 l73Var = this.f;
        int i2 = this.g;
        int i3 = this.i + i2;
        int size = l73Var.size();
        do {
            synchronized (w7.g0) {
                k93 k93Var = l73Var.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            z52 z52VarF = j0Var.f();
            z52VarF.subList(i2, i3).retainAll(collection);
            j0 j0VarC = z52VarF.c();
            if (s51.n(j0VarC, j0Var)) {
                break;
            }
            k93 k93Var3 = l73Var.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, l73Var, t63VarJ), i, j0VarC, true);
            }
            a73.n(t63VarJ, l73Var);
        } while (!zC);
        int size2 = size - l73Var.size();
        if (size2 > 0) {
            this.h = w7.S(this.f);
            this.i -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        w7.A(i, this.i);
        a();
        int i2 = i + this.g;
        l73 l73Var = this.f;
        Object obj2 = l73Var.set(i2, obj);
        this.h = w7.S(l73Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.i;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.i) {
            yb2.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.g;
        return new ma3(this.f, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return f80.R(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f80.S(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.g + i;
        l73 l73Var = this.f;
        l73Var.add(i2, obj);
        this.i++;
        this.h = w7.S(l73Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.i, collection);
    }
}
