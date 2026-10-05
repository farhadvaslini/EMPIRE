package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class b73 implements Set, x61 {
    public final n73 f;
    public final /* synthetic */ int g;

    public b73(n73 n73Var, int i) {
        this.g = i;
        this.f = n73Var;
    }

    private final boolean a(Collection collection) {
        o52 o52Var;
        int i;
        t63 t63VarJ;
        boolean zD;
        Set setR0 = qx.R0(collection);
        n73 n73Var = this.f;
        boolean z = false;
        do {
            synchronized (rn.c1) {
                m73 m73Var = n73Var.f;
                m73Var.getClass();
                m73 m73Var2 = (m73) a73.h(m73Var);
                o52Var = m73Var2.c;
                i = m73Var2.d;
            }
            o52Var.getClass();
            q52 q52VarB = o52Var.b();
            Iterator it = n73Var.g.iterator();
            while (((m93) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((m93) it).next();
                if (!setR0.contains(entry.getKey())) {
                    q52VarB.remove(entry.getKey());
                    z = true;
                }
            }
            o52 o52VarB = q52VarB.b();
            if (s51.n(o52VarB, o52Var)) {
                break;
            }
            m73 m73Var3 = n73Var.f;
            m73Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zD = n73.d(n73Var, (m73) a73.w(m73Var3, n73Var, t63VarJ), i, o52VarB);
            }
            a73.n(t63VarJ, n73Var);
        } while (!zD);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.g) {
            case 0:
                rn.J();
                throw null;
            case 1:
                rn.J();
                throw null;
            default:
                rn.J();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.g) {
            case 0:
                rn.J();
                throw null;
            case 1:
                rn.J();
                throw null;
            default:
                rn.J();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.g;
        n73 n73Var = this.f;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof t61) && !(obj instanceof v61))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return s51.n(n73Var.get(entry.getKey()), entry.getValue());
            case 1:
                return n73Var.containsKey(obj);
            default:
                return n73Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.g;
        n73 n73Var = this.f;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!n73Var.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!n73Var.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.g;
        n73 n73Var = this.f;
        switch (i) {
            case 0:
                return new m93(n73Var, ((e11) n73Var.e().c.entrySet()).iterator(), 0);
            case 1:
                return new m93(n73Var, ((e11) n73Var.e().c.entrySet()).iterator(), 1);
            default:
                return new m93(n73Var, ((e11) n73Var.e().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        int i = this.g;
        n73 n73Var = this.f;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof t61) || (obj instanceof v61)) && n73Var.remove(((Map.Entry) obj).getKey()) != null) {
                    }
                }
                break;
            case 1:
                if (n73Var.remove(obj) != null) {
                }
                break;
            default:
                Iterator it = n73Var.g.iterator();
                while (true) {
                    if (((m93) it).hasNext()) {
                        next = ((m93) it).next();
                        if (s51.n(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    n73Var.remove(entry.getKey());
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        o52 o52Var;
        int i;
        t63 t63VarJ;
        boolean zD;
        boolean z = false;
        switch (this.g) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
                break;
            default:
                Set setR0 = qx.R0(collection);
                n73 n73Var = this.f;
                do {
                    synchronized (rn.c1) {
                        m73 m73Var = n73Var.f;
                        m73Var.getClass();
                        m73 m73Var2 = (m73) a73.h(m73Var);
                        o52Var = m73Var2.c;
                        i = m73Var2.d;
                    }
                    o52Var.getClass();
                    q52 q52VarB = o52Var.b();
                    Iterator it3 = n73Var.g.iterator();
                    while (((m93) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((m93) it3).next();
                        if (setR0.contains(entry.getValue())) {
                            q52VarB.remove(entry.getKey());
                            z = true;
                        }
                    }
                    o52 o52VarB = q52VarB.b();
                    if (!s51.n(o52VarB, o52Var)) {
                        m73 m73Var3 = n73Var.f;
                        m73Var3.getClass();
                        synchronized (a73.c) {
                            t63VarJ = a73.j();
                            zD = n73.d(n73Var, (m73) a73.w(m73Var3, n73Var, t63VarJ), i, o52VarB);
                        }
                        a73.n(t63VarJ, n73Var);
                    }
                    return z;
                } while (!zD);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        o52 o52Var;
        int i;
        t63 t63VarJ;
        boolean zD;
        o52 o52Var2;
        int i2;
        t63 t63VarJ2;
        boolean zD2;
        boolean z = false;
        switch (this.g) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iX = om1.X(rx.d0(collection2, 10));
                if (iX < 16) {
                    iX = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iX);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                n73 n73Var = this.f;
                do {
                    synchronized (rn.c1) {
                        m73 m73Var = n73Var.f;
                        m73Var.getClass();
                        m73 m73Var2 = (m73) a73.h(m73Var);
                        o52Var = m73Var2.c;
                        i = m73Var2.d;
                    }
                    o52Var.getClass();
                    q52 q52VarB = o52Var.b();
                    Iterator it = n73Var.g.iterator();
                    while (((m93) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((m93) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !s51.n(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            q52VarB.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    o52 o52VarB = q52VarB.b();
                    if (!s51.n(o52VarB, o52Var)) {
                        m73 m73Var3 = n73Var.f;
                        m73Var3.getClass();
                        synchronized (a73.c) {
                            t63VarJ = a73.j();
                            zD = n73.d(n73Var, (m73) a73.w(m73Var3, n73Var, t63VarJ), i, o52VarB);
                        }
                        a73.n(t63VarJ, n73Var);
                    }
                    return z;
                } while (!zD);
                return z;
            case 1:
                return a(collection);
            default:
                Set setR0 = qx.R0(collection);
                n73 n73Var2 = this.f;
                do {
                    synchronized (rn.c1) {
                        m73 m73Var4 = n73Var2.f;
                        m73Var4.getClass();
                        m73 m73Var5 = (m73) a73.h(m73Var4);
                        o52Var2 = m73Var5.c;
                        i2 = m73Var5.d;
                    }
                    o52Var2.getClass();
                    q52 q52VarB2 = o52Var2.b();
                    Iterator it2 = n73Var2.g.iterator();
                    while (((m93) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((m93) it2).next();
                        if (!setR0.contains(entry3.getValue())) {
                            q52VarB2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    o52 o52VarB2 = q52VarB2.b();
                    if (!s51.n(o52VarB2, o52Var2)) {
                        m73 m73Var6 = n73Var2.f;
                        m73Var6.getClass();
                        synchronized (a73.c) {
                            t63VarJ2 = a73.j();
                            zD2 = n73.d(n73Var2, (m73) a73.w(m73Var6, n73Var2, t63VarJ2), i2, o52VarB2);
                        }
                        a73.n(t63VarJ2, n73Var2);
                    }
                    return z;
                } while (!zD2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return f80.R(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return f80.S(this, objArr);
    }
}
