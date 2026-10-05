package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class kl0 implements Map.Entry, t61 {
    public final Object f;
    public final qf1 g;
    public kl0 h;
    public kl0 i;
    public boolean j;

    public kl0(nf1 nf1Var, qf1 qf1Var) {
        this.f = nf1Var;
        this.g = qf1Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kl0) {
            kl0 kl0Var = (kl0) obj;
            return s51.n(this.f, kl0Var.f) && this.g == kl0Var.g;
        }
        return false;
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
    public final int hashCode() {
        Object obj = this.f;
        return this.g.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.f + ", value=" + this.g + ")";
    }
}
