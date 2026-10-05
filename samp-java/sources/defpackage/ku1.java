package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ku1 implements Iterator, t61 {
    public int f = -1;
    public boolean g;
    public final /* synthetic */ lu1 h;

    public ku1(lu1 lu1Var) {
        this.h = lu1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f + 1 < this.h.b.e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            c.n();
            return null;
        }
        this.g = true;
        l83 l83Var = this.h.b;
        int i = this.f + 1;
        this.f = i;
        return (fu1) l83Var.f(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            c.q("You must call next() before you can remove an element");
            return;
        }
        l83 l83Var = this.h.b;
        ((fu1) l83Var.f(this.f)).h = null;
        int i = this.f;
        Object[] objArr = l83Var.h;
        Object obj = objArr[i];
        Object obj2 = r51.I1;
        if (obj != obj2) {
            objArr[i] = obj2;
            l83Var.f = true;
        }
        this.f = i - 1;
        this.g = false;
    }
}
