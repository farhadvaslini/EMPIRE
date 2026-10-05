package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class yn2 implements ListIterator, t61 {
    public final /* synthetic */ int f = 2;
    public final Object g;
    public final /* synthetic */ Object h;

    public yn2(qm1 qm1Var, int i) {
        this.h = qm1Var;
        this.g = ((List) qm1Var.g).listIterator(qx.l0(i, qm1Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f) {
            case 0:
                ListIterator listIterator = (ListIterator) this.g;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((ok2) obj).f < ((ma3) this.h).i - 1) {
                }
                break;
        }
        return ((ListIterator) obj).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((ok2) obj).f >= 0) {
                }
                break;
        }
        return ((ListIterator) obj).hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                ok2 ok2Var = (ok2) obj;
                int i2 = ok2Var.f + 1;
                ma3 ma3Var = (ma3) this.h;
                w7.A(i2, ma3Var.i);
                ok2Var.f = i2;
                return ma3Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int iPreviousIndex;
        int size;
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((zn2) obj).size();
                break;
            case 1:
                iPreviousIndex = ((ListIterator) obj2).previousIndex();
                size = ((qm1) obj).size();
                break;
            default:
                return ((ok2) obj2).f + 1;
        }
        return (size - 1) - iPreviousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                ok2 ok2Var = (ok2) obj;
                int i2 = ok2Var.f;
                ma3 ma3Var = (ma3) this.h;
                w7.A(i2, ma3Var.i);
                ok2Var.f = i2 - 1;
                return ma3Var.get(i2);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int iNextIndex;
        int size;
        int i = this.f;
        Object obj = this.h;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((zn2) obj).size();
                break;
            case 1:
                iNextIndex = ((ListIterator) obj2).nextIndex();
                size = ((qm1) obj).size();
                break;
            default:
                return ((ok2) obj2).f;
        }
        return (size - 1) - iNextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                ((ListIterator) this.g).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f) {
            case 0:
                ((ListIterator) this.g).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public yn2(zn2 zn2Var, int i) {
        this.h = zn2Var;
        this.g = zn2Var.f.listIterator(qx.l0(i, zn2Var));
    }

    public yn2(ok2 ok2Var, ma3 ma3Var) {
        this.g = ok2Var;
        this.h = ma3Var;
    }
}
