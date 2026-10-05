package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ov2 implements Iterator, p40, t61 {
    public int f;
    public Object g;
    public p40 h;

    public final RuntimeException a() {
        int i = this.f;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f);
    }

    public final void b(Object obj, pn2 pn2Var) {
        this.g = obj;
        this.f = 3;
        this.h = pn2Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f;
            if (i != 0) {
                break;
            }
            this.f = 5;
            p40 p40Var = this.h;
            p40Var.getClass();
            this.h = null;
            p40Var.t(dm3.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // defpackage.p40
    public final o50 i() {
        return li0.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            c.n();
            return null;
        }
        if (i == 2) {
            this.f = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.f = 0;
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.p40
    public final void t(Object obj) {
        y02.Q(obj);
        this.f = 4;
    }
}
