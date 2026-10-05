package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l73 implements Parcelable, n93, List, RandomAccess, u61 {
    public static final Parcelable.Creator<l73> CREATOR = new k73(0);
    public k93 f;

    public l73(j0 j0Var) {
        t63 t63VarJ = a73.j();
        k93 k93Var = new k93(t63VarJ.g(), j0Var);
        if (!(t63VarJ instanceof hw0)) {
            k93Var.b = new k93(1L, j0Var);
        }
        this.f = k93Var;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.f;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            j0 j0VarC = j0Var.c(obj);
            if (j0VarC.equals(j0Var)) {
                return false;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i, j0VarC, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            j0 j0VarE = j0Var.e(collection);
            if (s51.n(j0VarE, j0Var)) {
                return false;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i, j0VarE, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
        return true;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.b = this.f;
        this.f = (k93) p93Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        t63 t63VarJ;
        k93 k93Var = this.f;
        k93Var.getClass();
        synchronized (a73.c) {
            t63VarJ = a73.j();
            k93 k93Var2 = (k93) a73.w(k93Var, this, t63VarJ);
            synchronized (w7.g0) {
                k93Var2.c = n53.g;
                k93Var2.d++;
                k93Var2.e++;
            }
        }
        a73.n(t63VarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return w7.R(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return w7.R(this).c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i3 = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            z52 z52VarF = j0Var.f();
            z52VarF.subList(i, i2).clear();
            j0 j0VarC = z52VarF.c();
            if (s51.n(j0VarC, j0Var)) {
                return;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i3, j0VarC, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return w7.R(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return w7.R(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return w7.R(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return w7.R(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new jy0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            int iIndexOf = j0Var.indexOf(obj);
            j0 j0VarH = iIndexOf != -1 ? j0Var.h(iIndexOf) : j0Var;
            if (j0VarH.equals(j0Var)) {
                return false;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i, j0VarH, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            j0 j0VarG = j0Var.g(new i0(0, collection));
            if (s51.n(j0VarG, j0Var)) {
                return false;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i, j0VarG, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return w7.W(this, new i0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        Object obj2 = get(i);
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i2 = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            j0 j0VarI = j0Var.i(i, obj);
            if (j0VarI.equals(j0Var)) {
                break;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i2, j0VarI, false);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return w7.R(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            yb2.a("fromIndex or toIndex are out of bounds");
        }
        return new ma3(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return f80.R(this);
    }

    public final String toString() {
        k93 k93Var = this.f;
        k93Var.getClass();
        return "SnapshotStateList(value=" + ((k93) a73.h(k93Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        j0 j0Var = w7.R(this).c;
        int iA = j0Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(j0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f80.S(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new jy0(this, i);
    }

    public l73() {
        this(n53.g);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i2 = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            j0 j0VarB = j0Var.b(i, obj);
            if (j0VarB.equals(j0Var)) {
                return;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i2, j0VarB, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return w7.W(this, new cp0(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        j0 j0Var;
        t63 t63VarJ;
        boolean zC;
        Object obj = get(i);
        do {
            synchronized (w7.g0) {
                k93 k93Var = this.f;
                k93Var.getClass();
                k93 k93Var2 = (k93) a73.h(k93Var);
                i2 = k93Var2.d;
                j0Var = k93Var2.c;
            }
            j0Var.getClass();
            j0 j0VarH = j0Var.h(i);
            if (j0VarH.equals(j0Var)) {
                break;
            }
            k93 k93Var3 = this.f;
            k93Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zC = w7.C((k93) a73.w(k93Var3, this, t63VarJ), i2, j0VarH, true);
            }
            a73.n(t63VarJ, this);
        } while (!zC);
        return obj;
    }
}
