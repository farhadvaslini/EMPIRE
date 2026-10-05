package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hq implements Iterator {
    public int f = 0;
    public final int g;
    public final /* synthetic */ jq h;

    public hq(jq jqVar) {
        this.h = jqVar;
        this.g = jqVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f;
        if (i < this.g) {
            this.f = i + 1;
            return Byte.valueOf(this.h.g(i));
        }
        c.n();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
