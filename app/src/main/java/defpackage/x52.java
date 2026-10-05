package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x52 extends v0 implements e11, Collection, t61 {
    public static final x52 i;
    public final Object f;
    public final Object g;
    public final o52 h;

    static {
        f5 f5Var = f5.V;
        i = new x52(f5Var, f5Var, o52.h);
    }

    public x52(Object obj, Object obj2, o52 o52Var) {
        this.f = obj;
        this.g = obj2;
        this.h = o52Var;
    }

    @Override // defpackage.t
    public final int a() {
        return this.h.g;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.h.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new yv0(this.f, this.h);
    }
}
