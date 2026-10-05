package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o53 extends AbstractMap {
    public static final /* synthetic */ int k = 0;
    public List f;
    public Map g;
    public boolean h;
    public volatile nj i;
    public Map j;

    public static o53 f() {
        o53 o53Var = new o53();
        o53Var.f = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        o53Var.g = map;
        o53Var.j = map;
        return o53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int size = this.f.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = comparable.compareTo(((p53) this.f.get(i4)).f);
                if (iCompareTo < 0) {
                    i3 = i4 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    i = i4 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((p53) this.f.get(i3)).f);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i = 0;
                while (i <= i3) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.h) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f.isEmpty()) {
            this.f.clear();
        }
        if (this.g.isEmpty()) {
            return;
        }
        this.g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.g.containsKey(comparable);
    }

    public final Set d() {
        return this.g.isEmpty() ? Collections.EMPTY_SET : this.g.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.g.isEmpty() && !(this.g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.g = treeMap;
            this.j = treeMap.descendingMap();
        }
        return (SortedMap) this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.i == null) {
            this.i = new nj(this, 1);
        }
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o53)) {
            return super.equals(obj);
        }
        o53 o53Var = (o53) obj;
        int size = size();
        if (size == o53Var.size()) {
            int size2 = this.f.size();
            if (size2 != o53Var.f.size()) {
                return ((AbstractSet) entrySet()).equals(o53Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(o53Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.g.equals(o53Var.g);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((p53) this.f.get(iA)).setValue(obj);
        }
        b();
        if (this.f.isEmpty() && !(this.f instanceof ArrayList)) {
            this.f = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f.size() == 16) {
            p53 p53Var = (p53) this.f.remove(15);
            e().put(p53Var.f, p53Var.g);
        }
        this.f.add(i, new p53(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((p53) this.f.get(iA)).g : this.g.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((p53) this.f.remove(i)).g;
        if (!this.g.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new p53(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((p53) this.f.get(i)).hashCode();
        }
        return this.g.size() > 0 ? this.g.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.g.isEmpty()) {
            return null;
        }
        return this.g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.g.size() + this.f.size();
    }
}
