package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class zr1 implements List, u61 {
    public final /* synthetic */ int f;
    public final List g;
    public final int h;
    public int i;

    public /* synthetic */ zr1(List list, int i, int i2, int i3) {
        this.f = i3;
        this.g = list;
        this.h = i;
        this.i = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f;
        int i3 = this.h;
        List list = this.g;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.i++;
                break;
            default:
                list.add(i + i3, obj);
                this.i++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f;
        int i3 = this.h;
        List list = this.g;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.i = collection.size() + this.i;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.i += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f;
        List list = this.g;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.i - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.i = i2;
                break;
            default:
                int i4 = this.i - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.i = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f;
        List list = this.g;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.i;
                while (i2 < i3) {
                    if (!s51.n(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.i;
                while (i2 < i4) {
                    if (!s51.n(list.get(i2), obj)) {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
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
        int i3 = this.h;
        List list = this.g;
        switch (i2) {
            case 0:
                cy1.a(i, this);
                break;
            default:
                rs1.a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f;
        List list = this.g;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.i;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (s51.n(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.i;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (s51.n(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f) {
            case 0:
                if (this.i == this.h) {
                }
                break;
            default:
                if (this.i == this.h) {
                }
                break;
        }
        return false;
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
        int i = this.f;
        List list = this.g;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.i - 1;
                if (i2 <= i3) {
                    while (!s51.n(list.get(i3), obj)) {
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                break;
            default:
                int i4 = this.i - 1;
                if (i2 <= i4) {
                    while (!s51.n(list.get(i4), obj)) {
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                break;
        }
        return -1;
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f;
        int i2 = this.h;
        List list = this.g;
        switch (i) {
            case 0:
                int i3 = this.i;
                while (i2 < i3) {
                    if (s51.n(list.get(i2), obj)) {
                        list.remove(i2);
                        this.i--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
            default:
                int i4 = this.i;
                while (i2 < i4) {
                    if (s51.n(list.get(i2), obj)) {
                        list.remove(i2);
                        this.i--;
                    } else {
                        i2++;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f) {
            case 0:
                collection.getClass();
                int i = this.i;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i != this.i) {
                }
                break;
            default:
                int i2 = this.i;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 != this.i) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f;
        int i2 = this.h;
        List list = this.g;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.i;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.i--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 != this.i) {
                }
                break;
            default:
                int i5 = this.i;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.i--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 != this.i) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f;
        int i3 = this.h;
        List list = this.g;
        switch (i2) {
            case 0:
                cy1.a(i, this);
                break;
            default:
                rs1.a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f) {
            case 0:
                i = this.i;
                i2 = this.h;
                break;
            default:
                i = this.i;
                i2 = this.h;
                break;
        }
        return i - i2;
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
    public final ListIterator listIterator(int i) {
        switch (this.f) {
            case 0:
                return new xr1(this, i, 0);
            default:
                return new xr1(this, i, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f;
        List list = this.g;
        switch (i) {
            case 0:
                int i2 = this.i;
                this.i = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.i;
                this.i = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f;
        List list = this.g;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.i, collection);
                this.i = collection.size() + this.i;
                if (collection.size() > 0) {
                }
                break;
            default:
                list.addAll(this.i, collection);
                int size = collection.size();
                this.i += size;
                if (size > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f;
        int i3 = this.h;
        List list = this.g;
        switch (i2) {
            case 0:
                cy1.a(i, this);
                this.i--;
                return list.remove(i + i3);
            default:
                rs1.a(i, this);
                this.i--;
                return list.remove(i + i3);
        }
    }
}
