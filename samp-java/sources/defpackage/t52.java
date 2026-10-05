package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class t52 implements Iterator, t61 {
    public final /* synthetic */ int f = 0;
    public final Iterator g;

    public t52(q52 q52Var) {
        uk3[] uk3VarArr = new uk3[8];
        for (int i = 0; i < 8; i++) {
            uk3VarArr[i] = new wk3(this);
        }
        this.g = new r52(q52Var, uk3VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f) {
            case 0:
                return ((r52) this.g).h;
            default:
                return this.g.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f) {
            case 0:
                return (Map.Entry) ((r52) this.g).next();
            default:
                return (wo3) this.g.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f) {
            case 0:
                ((r52) this.g).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t52(uo3 uo3Var) {
        this.g = uo3Var.o.iterator();
    }
}
