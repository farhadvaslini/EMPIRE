package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class dx0 implements Iterator, t61 {
    public final j53 f;
    public final int g;
    public int h;
    public final int i;

    public dx0(j53 j53Var, int i, int i2) {
        this.f = j53Var;
        this.g = i2;
        this.h = i;
        this.i = j53Var.m;
        if (j53Var.l) {
            l53.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        j53 j53Var = this.f;
        int i = j53Var.m;
        int i2 = this.i;
        if (i != i2) {
            l53.f();
        }
        int i3 = this.h;
        this.h = j53Var.f[(i3 * 5) + 3] + i3;
        return new k53(j53Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
