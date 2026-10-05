package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 implements List, u61 {
    public final /* synthetic */ int f;
    public final Object g;

    public /* synthetic */ yr1(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                ((as1) obj2).b(obj);
                break;
            default:
                ((qs1) obj2).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                collection.getClass();
                as1 as1Var = (as1) obj;
                if (i < 0 || i > as1Var.b) {
                    as1Var.q(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + as1Var.b;
                Object[] objArr = as1Var.a;
                if (objArr.length < size) {
                    as1Var.n(size, objArr);
                }
                Object[] objArr2 = as1Var.a;
                if (i != as1Var.b) {
                    uj.J(objArr2, objArr2, collection.size() + i, i, as1Var.b);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        vr.b0();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                as1Var.b = collection.size() + as1Var.b;
                return true;
            default:
                return ((qs1) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((as1) obj).e();
                break;
            default:
                ((qs1) obj).g();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return ((as1) obj2).h(obj) >= 0;
            default:
                return ((qs1) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                collection.getClass();
                as1 as1Var = (as1) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (as1Var.h(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                qs1 qs1Var = (qs1) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!qs1Var.h(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                cy1.a(i, this);
                return ((as1) obj).g(i);
            default:
                rs1.a(i, this);
                return ((qs1) obj).f[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return ((as1) obj2).h(obj);
            default:
                return ((qs1) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((as1) obj).i();
            default:
                return ((qs1) obj).h == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f) {
            case 0:
                return new xr1(this, 0, 0);
            default:
                return new xr1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                as1 as1Var = (as1) obj2;
                Object[] objArr = as1Var.a;
                int i3 = as1Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                qs1 qs1Var = (qs1) obj2;
                Object[] objArr2 = qs1Var.f;
                for (int i4 = qs1Var.h - 1; i4 >= 0; i4--) {
                    if (s51.n(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f) {
            case 0:
                return new xr1(this, 0, 0);
            default:
                return new xr1(this, 0, 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                cy1.a(i, this);
                return ((as1) obj).l(i);
            default:
                rs1.a(i, this);
                return ((qs1) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                collection.getClass();
                as1 as1Var = (as1) obj;
                int i2 = as1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    as1Var.k(it.next());
                }
                if (i2 == as1Var.b) {
                    break;
                }
                break;
            default:
                qs1 qs1Var = (qs1) obj;
                if (!collection.isEmpty()) {
                    int i3 = qs1Var.h;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        qs1Var.j(it2.next());
                    }
                    if (i3 != qs1Var.h) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                collection.getClass();
                as1 as1Var = (as1) obj;
                int i2 = as1Var.b;
                Object[] objArr = as1Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        as1Var.l(i3);
                    }
                }
                if (i2 != as1Var.b) {
                }
                break;
            default:
                qs1 qs1Var = (qs1) obj;
                int i4 = qs1Var.h;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(qs1Var.f[i5])) {
                        qs1Var.k(i5);
                    }
                }
                if (i4 != qs1Var.h) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                cy1.a(i, this);
                return ((as1) obj2).o(i, obj);
            default:
                rs1.a(i, this);
                Object[] objArr = ((qs1) obj2).f;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((as1) obj).b;
            default:
                return ((qs1) obj).h;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f) {
            case 0:
                cy1.b(this, i, i2);
                return new zr1(this, i, i2, 0);
            default:
                rs1.b(this, i, i2);
                return new zr1(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f) {
            case 0:
                objArr.getClass();
                break;
        }
        return f80.S(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f) {
        }
        return f80.R(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f;
        Object obj2 = this.g;
        switch (i2) {
            case 0:
                ((as1) obj2).a(i, obj);
                break;
            default:
                ((qs1) obj2).a(i, obj);
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f) {
            case 0:
                return new xr1(this, i, 0);
            default:
                return new xr1(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return ((as1) obj2).k(obj);
            default:
                return ((qs1) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                collection.getClass();
                as1 as1Var = (as1) obj;
                int i2 = as1Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    as1Var.b(it.next());
                }
                return i2 != as1Var.b;
            default:
                qs1 qs1Var = (qs1) obj;
                return qs1Var.e(qs1Var.h, collection);
        }
    }
}
