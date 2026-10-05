package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jy0 implements ListIterator, t61 {
    public final /* synthetic */ int f;
    public int g;
    public int h;
    public int i;
    public final Object j;

    public jy0(l73 l73Var, int i) {
        this.f = 3;
        this.j = l73Var;
        this.g = i - 1;
        this.h = -1;
        this.i = w7.S(l73Var);
    }

    public void a() {
        if (((AbstractList) ((zh1) this.j).j).modCount != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.f;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                zh1 zh1Var = (zh1) obj2;
                int i2 = this.g;
                this.g = i2 + 1;
                zh1Var.add(i2, obj);
                this.h = -1;
                this.i = ((AbstractList) zh1Var).modCount;
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                ai1 ai1Var = (ai1) obj2;
                int i3 = this.g;
                this.g = i3 + 1;
                ai1Var.add(i3, obj);
                this.h = -1;
                this.i = ((AbstractList) ai1Var).modCount;
                return;
            default:
                c();
                l73 l73Var = (l73) obj2;
                l73Var.add(this.g + 1, obj);
                this.h = -1;
                this.g++;
                this.i = w7.S(l73Var);
                return;
        }
    }

    public void b() {
        if (((AbstractList) ((ai1) this.j)).modCount != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    public void c() {
        if (w7.S((l73) this.j) != this.i) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.j;
        switch (i) {
            case 0:
                if (this.g < this.i) {
                }
                break;
            case 1:
                if (this.g < ((zh1) obj).h) {
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.g < ((ai1) obj).g) {
                }
                break;
            default:
                if (this.g < ((l73) obj).size() - 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f) {
            case 0:
                if (this.g > this.h) {
                }
                break;
            case 1:
                if (this.g > 0) {
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                if (this.g > 0) {
                }
                break;
            default:
                if (this.g >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.j;
        switch (i) {
            case 0:
                as1 as1Var = ((ly0) obj).f;
                int i2 = this.g;
                this.g = i2 + 1;
                Object objG = as1Var.g(i2);
                objG.getClass();
                return (aq1) objG;
            case 1:
                a();
                int i3 = this.g;
                zh1 zh1Var = (zh1) obj;
                if (i3 >= zh1Var.h) {
                    c.n();
                    return null;
                }
                this.g = i3 + 1;
                this.h = i3;
                return zh1Var.f[zh1Var.g + i3];
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i4 = this.g;
                ai1 ai1Var = (ai1) obj;
                if (i4 >= ai1Var.g) {
                    c.n();
                    return null;
                }
                this.g = i4 + 1;
                this.h = i4;
                return ai1Var.f[i4];
            default:
                c();
                int i5 = this.g + 1;
                this.h = i5;
                l73 l73Var = (l73) obj;
                w7.A(i5, l73Var.size());
                Object obj2 = l73Var.get(i5);
                this.g = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f) {
            case 0:
                return this.g - this.h;
            case 1:
                return this.g;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return this.g;
            default:
                return this.g + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f;
        Object obj = this.j;
        switch (i) {
            case 0:
                as1 as1Var = ((ly0) obj).f;
                int i2 = this.g - 1;
                this.g = i2;
                Object objG = as1Var.g(i2);
                objG.getClass();
                return (aq1) objG;
            case 1:
                a();
                int i3 = this.g;
                if (i3 <= 0) {
                    c.n();
                    return null;
                }
                int i4 = i3 - 1;
                this.g = i4;
                this.h = i4;
                zh1 zh1Var = (zh1) obj;
                return zh1Var.f[zh1Var.g + i4];
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i5 = this.g;
                if (i5 <= 0) {
                    c.n();
                    return null;
                }
                int i6 = i5 - 1;
                this.g = i6;
                this.h = i6;
                return ((ai1) obj).f[i6];
            default:
                c();
                l73 l73Var = (l73) obj;
                w7.A(this.g, l73Var.size());
                int i7 = this.g;
                this.h = i7;
                this.g--;
                return l73Var.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f) {
            case 0:
                return (this.g - this.h) - 1;
            case 1:
                i = this.g;
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                i = this.g;
                break;
            default:
                return this.g;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.f;
        Object obj = this.j;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                zh1 zh1Var = (zh1) obj;
                a();
                int i2 = this.h;
                if (i2 == -1) {
                    c.q("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                zh1Var.b(i2);
                this.g = this.h;
                this.h = -1;
                this.i = ((AbstractList) zh1Var).modCount;
                return;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ai1 ai1Var = (ai1) obj;
                b();
                int i3 = this.h;
                if (i3 == -1) {
                    c.q("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                ai1Var.b(i3);
                this.g = this.h;
                this.h = -1;
                this.i = ((AbstractList) ai1Var).modCount;
                return;
            default:
                c();
                l73 l73Var = (l73) obj;
                l73Var.remove(this.h);
                this.g--;
                this.h = -1;
                this.i = w7.S(l73Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.f;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.h;
                if (i2 != -1) {
                    ((zh1) obj2).set(i2, obj);
                    return;
                } else {
                    c.q("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                b();
                int i3 = this.h;
                if (i3 != -1) {
                    ((ai1) obj2).set(i3, obj);
                    return;
                } else {
                    c.q("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                l73 l73Var = (l73) obj2;
                c();
                int i4 = this.h;
                if (i4 < 0) {
                    c.q("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    l73Var.set(i4, obj);
                    this.i = w7.S(l73Var);
                    return;
                }
        }
    }

    public jy0(ai1 ai1Var, int i) {
        this.f = 2;
        this.j = ai1Var;
        this.g = i;
        this.h = -1;
        this.i = ((AbstractList) ai1Var).modCount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jy0(ly0 ly0Var, int i, int i2) {
        this(ly0Var, (i2 & 1) != 0 ? 0 : i, 0, ly0Var.f.b);
        this.f = 0;
    }

    public jy0(ly0 ly0Var, int i, int i2, int i3) {
        this.f = 0;
        this.j = ly0Var;
        this.g = i;
        this.h = i2;
        this.i = i3;
    }

    public jy0(zh1 zh1Var, int i) {
        this.f = 1;
        this.j = zh1Var;
        this.g = i;
        this.h = -1;
        this.i = ((AbstractList) zh1Var).modCount;
    }
}
