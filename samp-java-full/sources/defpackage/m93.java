package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m93 implements Iterator, t61 {
    public final n73 f;
    public final Iterator g;
    public int h;
    public Map.Entry i;
    public Map.Entry j;
    public final /* synthetic */ int k;

    public m93(n73 n73Var, Iterator it, int i) {
        this.k = i;
        this.f = n73Var;
        this.g = it;
        this.h = n73Var.e().d;
        a();
    }

    public final void a() {
        this.i = this.j;
        Iterator it = this.g;
        this.j = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                a();
                if (this.i != null) {
                    return new l93(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.j;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.j;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        n73 n73Var = this.f;
        if (n73Var.e().d != this.h) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.i;
        if (entry == null) {
            throw new IllegalStateException();
        }
        n73Var.remove(entry.getKey());
        this.i = null;
        this.h = n73Var.e().d;
    }
}
