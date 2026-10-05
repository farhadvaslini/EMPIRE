package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements Iterator, t61 {
    public final /* synthetic */ int f = 0;
    public final Iterator g;
    public int h;

    public dg0(eg0 eg0Var, byte b) {
        this.h = eg0Var.c;
        this.g = eg0Var.b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f;
        Iterator it = this.g;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                return this.h > 0 && it.hasNext();
        }
        while (this.h > 0 && it.hasNext()) {
            it.next();
            this.h--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        Iterator it = this.g;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.h;
                this.h = i2 + 1;
                if (i2 >= 0) {
                    return new k11(i2, it.next());
                }
                vr.b0();
                throw null;
            default:
                int i3 = this.h;
                if (i3 != 0) {
                    this.h = i3 - 1;
                    return it.next();
                }
                c.n();
                return null;
        }
        while (this.h > 0 && it.hasNext()) {
            it.next();
            this.h--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dg0(Iterator it) {
        it.getClass();
        this.g = it;
    }

    public dg0(eg0 eg0Var) {
        this.g = eg0Var.b.iterator();
        this.h = eg0Var.c;
    }
}
