package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sj extends w33 implements Map {
    public nj i;
    public pj j;
    public rj k;

    @Override // java.util.Map
    public final Set entrySet() {
        nj njVar = this.i;
        if (njVar != null) {
            return njVar;
        }
        nj njVar2 = new nj(this, 0);
        this.i = njVar2;
        return njVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        pj pjVar = this.j;
        if (pjVar != null) {
            return pjVar;
        }
        pj pjVar2 = new pj(this);
        this.j = pjVar2;
        return pjVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.h;
        int i = this.h;
        int[] iArr = this.f;
        if (iArr.length < size) {
            this.f = Arrays.copyOf(iArr, size);
            this.g = Arrays.copyOf(this.g, size * 2);
        }
        if (this.h != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        rj rjVar = this.k;
        if (rjVar != null) {
            return rjVar;
        }
        rj rjVar2 = new rj(this);
        this.k = rjVar2;
        return rjVar2;
    }
}
