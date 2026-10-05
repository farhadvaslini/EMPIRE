package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class j0 extends d0 {
    public abstract j0 b(int i, Object obj);

    public abstract j0 c(Object obj);

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public j0 e(Collection collection) {
        z52 z52VarF = f();
        z52VarF.addAll(collection);
        return z52VarF.c();
    }

    public abstract z52 f();

    public abstract j0 g(i0 i0Var);

    public abstract j0 h(int i);

    public abstract j0 i(int i, Object obj);

    @Override // defpackage.d0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.d0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.d0, java.util.List
    public final List subList(int i, int i2) {
        return new d11(this, i, i2);
    }
}
