package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l93 implements Map.Entry, v61 {
    public final Object f;
    public Object g;
    public final /* synthetic */ m93 h;

    public l93(m93 m93Var) {
        this.h = m93Var;
        Map.Entry entry = m93Var.i;
        entry.getClass();
        this.f = entry.getKey();
        Map.Entry entry2 = m93Var.i;
        entry2.getClass();
        this.g = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        m93 m93Var = this.h;
        n73 n73Var = m93Var.f;
        if (n73Var.e().d != m93Var.h) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.g;
        n73Var.put(this.f, obj);
        this.g = obj;
        return obj2;
    }
}
