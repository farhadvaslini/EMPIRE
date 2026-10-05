package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public class q52 extends AbstractMap implements Map, w61 {
    public o52 f;
    public h01 g = new h01(10);
    public tk3 h;
    public Object i;
    public int j;
    public int k;

    public q52(o52 o52Var) {
        this.f = o52Var;
        this.h = o52Var.f;
        this.k = o52Var.g;
    }

    /* JADX INFO: renamed from: a */
    public o52 b() {
        tk3 tk3Var = this.h;
        o52 o52Var = this.f;
        if (tk3Var != o52Var.f) {
            this.g = new h01(10);
            o52Var = new o52(this.h, this.k);
        }
        this.f = o52Var;
        return o52Var;
    }

    public /* bridge */ o52 b() {
        return b();
    }

    public final void c(int i) {
        this.k = i;
        this.j++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.h = tk3.e;
        c(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new s52(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new s52(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.i = null;
        this.h = this.h.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        o52 o52VarB = null;
        o52 o52Var = map instanceof o52 ? (o52) map : null;
        if (o52Var == null) {
            q52 q52Var = map instanceof q52 ? (q52) map : null;
            if (q52Var != null) {
                o52VarB = q52Var.b();
            }
        } else {
            o52VarB = o52Var;
        }
        if (o52VarB == null) {
            super.putAll(map);
            return;
        }
        ta0 ta0Var = new ta0();
        ta0Var.a = 0;
        int i = this.k;
        tk3 tk3Var = this.h;
        tk3 tk3Var2 = o52VarB.f;
        tk3Var2.getClass();
        this.h = tk3Var.m(tk3Var2, 0, ta0Var, this);
        int i2 = (o52VarB.g + i) - ta0Var.a;
        if (i != i2) {
            c(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.k;
        tk3 tk3VarO = this.h.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (tk3VarO == null) {
            tk3VarO = tk3.e;
        }
        this.h = tk3VarO;
        return i != this.k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new em1(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.i = null;
        tk3 tk3VarN = this.h.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (tk3VarN == null) {
            tk3VarN = tk3.e;
        }
        this.h = tk3VarN;
        return this.i;
    }
}
