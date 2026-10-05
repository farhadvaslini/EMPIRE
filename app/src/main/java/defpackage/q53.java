package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q53 implements Iterator {
    public int f = -1;
    public boolean g;
    public Iterator h;
    public final /* synthetic */ o53 i;

    public q53(o53 o53Var) {
        this.i = o53Var;
    }

    public final Iterator a() {
        if (this.h == null) {
            this.h = this.i.g.entrySet().iterator();
        }
        return this.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f + 1;
        o53 o53Var = this.i;
        return i < o53Var.f.size() || (!o53Var.g.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.g = true;
        int i = this.f + 1;
        this.f = i;
        o53 o53Var = this.i;
        return i < o53Var.f.size() ? (Map.Entry) o53Var.f.get(this.f) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            c.q("remove() was called before next()");
            return;
        }
        this.g = false;
        int i = o53.k;
        o53 o53Var = this.i;
        o53Var.b();
        if (this.f >= o53Var.f.size()) {
            a().remove();
            return;
        }
        int i2 = this.f;
        this.f = i2 - 1;
        o53Var.h(i2);
    }
}
