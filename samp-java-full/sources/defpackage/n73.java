package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n73 implements n93, Map, w61 {
    public m73 f;
    public final b73 g;
    public final b73 h;
    public final b73 i;

    public n73() {
        o52 o52Var = o52.h;
        t63 t63VarJ = a73.j();
        m73 m73Var = new m73(t63VarJ.g(), o52Var);
        if (!(t63VarJ instanceof hw0)) {
            m73Var.b = new m73(1L, o52Var);
        }
        this.f = m73Var;
        this.g = new b73(this, 0);
        this.h = new b73(this, 1);
        this.i = new b73(this, 2);
    }

    public static final boolean d(n73 n73Var, m73 m73Var, int i, o52 o52Var) {
        boolean z;
        synchronized (rn.c1) {
            int i2 = m73Var.d;
            if (i2 == i) {
                m73Var.c = o52Var;
                z = true;
                m73Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.n93
    public final p93 a() {
        return this.f;
    }

    @Override // defpackage.n93
    public final void c(p93 p93Var) {
        p93Var.getClass();
        this.f = (m73) p93Var;
    }

    @Override // java.util.Map
    public final void clear() {
        t63 t63VarJ;
        m73 m73Var = this.f;
        m73Var.getClass();
        m73 m73Var2 = (m73) a73.h(m73Var);
        o52 o52Var = o52.h;
        if (o52Var != m73Var2.c) {
            m73 m73Var3 = this.f;
            m73Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                m73 m73Var4 = (m73) a73.w(m73Var3, this, t63VarJ);
                synchronized (rn.c1) {
                    m73Var4.c = o52Var;
                    m73Var4.d++;
                }
            }
            a73.n(t63VarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    public final m73 e() {
        m73 m73Var = this.f;
        m73Var.getClass();
        return (m73) a73.t(m73Var, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.g;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.h;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        o52 o52Var;
        int i;
        Object objPut;
        t63 t63VarJ;
        boolean zD;
        do {
            synchronized (rn.c1) {
                m73 m73Var = this.f;
                m73Var.getClass();
                m73 m73Var2 = (m73) a73.h(m73Var);
                o52Var = m73Var2.c;
                i = m73Var2.d;
            }
            o52Var.getClass();
            q52 q52VarB = o52Var.b();
            objPut = q52VarB.put(obj, obj2);
            o52 o52VarB = q52VarB.b();
            if (s51.n(o52VarB, o52Var)) {
                break;
            }
            m73 m73Var3 = this.f;
            m73Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zD = d(this, (m73) a73.w(m73Var3, this, t63VarJ), i, o52VarB);
            }
            a73.n(t63VarJ, this);
        } while (!zD);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        o52 o52Var;
        int i;
        t63 t63VarJ;
        boolean zD;
        do {
            synchronized (rn.c1) {
                m73 m73Var = this.f;
                m73Var.getClass();
                m73 m73Var2 = (m73) a73.h(m73Var);
                o52Var = m73Var2.c;
                i = m73Var2.d;
            }
            o52Var.getClass();
            q52 q52VarB = o52Var.b();
            q52VarB.putAll(map);
            o52 o52VarB = q52VarB.b();
            if (s51.n(o52VarB, o52Var)) {
                return;
            }
            m73 m73Var3 = this.f;
            m73Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zD = d(this, (m73) a73.w(m73Var3, this, t63VarJ), i, o52VarB);
            }
            a73.n(t63VarJ, this);
        } while (!zD);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        o52 o52Var;
        int i;
        V vRemove;
        t63 t63VarJ;
        boolean zD;
        do {
            synchronized (rn.c1) {
                m73 m73Var = this.f;
                m73Var.getClass();
                m73 m73Var2 = (m73) a73.h(m73Var);
                o52Var = m73Var2.c;
                i = m73Var2.d;
            }
            o52Var.getClass();
            q52 q52VarB = o52Var.b();
            vRemove = q52VarB.remove(obj);
            o52 o52VarB = q52VarB.b();
            if (s51.n(o52VarB, o52Var)) {
                break;
            }
            m73 m73Var3 = this.f;
            m73Var3.getClass();
            synchronized (a73.c) {
                t63VarJ = a73.j();
                zD = d(this, (m73) a73.w(m73Var3, this, t63VarJ), i, o52VarB);
            }
            a73.n(t63VarJ, this);
        } while (!zD);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        o52 o52Var = e().c;
        o52Var.getClass();
        return o52Var.g;
    }

    public final String toString() {
        m73 m73Var = this.f;
        m73Var.getClass();
        return "SnapshotStateMap(value=" + ((m73) a73.h(m73Var)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.i;
    }
}
