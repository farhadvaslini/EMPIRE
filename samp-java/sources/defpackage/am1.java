package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class am1 implements Map.Entry, v61 {
    public final cm1 f;
    public final int g;
    public final int h;

    public am1(cm1 cm1Var, int i) {
        cm1Var.getClass();
        this.f = cm1Var;
        this.g = i;
        this.h = cm1Var.m;
    }

    public final void a() {
        if (this.f.m != this.h) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return s51.n(entry.getKey(), getKey()) && s51.n(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f.f[this.g];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f.g;
        objArr.getClass();
        return objArr[this.g];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        cm1 cm1Var = this.f;
        cm1Var.b();
        Object[] objArr = cm1Var.g;
        if (objArr == null) {
            int length = cm1Var.f.length;
            if (length < 0) {
                c.p("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            cm1Var.g = objArr;
        }
        int i = this.g;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
