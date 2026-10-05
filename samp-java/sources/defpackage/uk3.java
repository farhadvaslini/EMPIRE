package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class uk3 implements Iterator, t61 {
    public Object[] f = tk3.e.d;
    public int g;
    public int h;

    public final void a(Object[] objArr, int i, int i2) {
        this.f = objArr;
        this.g = i;
        this.h = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.g;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
