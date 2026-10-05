package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 implements Map, t61 {
    public final is1 f;
    public kj0 g;
    public kj0 h;
    public ta3 i;

    public lm1(is1 is1Var) {
        is1Var.getClass();
        this.f = is1Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f.c(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f.d(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        kj0 kj0Var = this.g;
        if (kj0Var != null) {
            return kj0Var;
        }
        kj0 kj0Var2 = new kj0(this.f, 0);
        this.g = kj0Var2;
        return kj0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lm1.class != obj.getClass()) {
            return false;
        }
        return s51.n(this.f, ((lm1) obj).f);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f.g(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f.i();
    }

    @Override // java.util.Map
    public final Set keySet() {
        kj0 kj0Var = this.h;
        if (kj0Var != null) {
            return kj0Var;
        }
        kj0 kj0Var2 = new kj0(this.f, 1);
        this.h = kj0Var2;
        return kj0Var2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f.e;
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ta3 ta3Var = this.i;
        if (ta3Var != null) {
            return ta3Var;
        }
        ta3 ta3Var2 = new ta3(this.f);
        this.i = ta3Var2;
        return ta3Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
