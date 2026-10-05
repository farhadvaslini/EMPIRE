package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lg1 implements Iterator, t61 {
    public String f;
    public boolean g;
    public final /* synthetic */ vj h;

    public lg1(vj vjVar) {
        this.h = vjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f == null && !this.g) {
            String line = ((BufferedReader) this.h.b).readLine();
            this.f = line;
            if (line == null) {
                this.g = true;
            }
        }
        return this.f != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            c.n();
            return null;
        }
        String str = this.f;
        this.f = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
