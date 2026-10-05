package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class gm1 implements Map.Entry, t61 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;

    public /* synthetic */ gm1(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && s51.n(entry.getKey(), this.g) && s51.n(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f) {
        }
        return this.g;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f) {
        }
        return this.h;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f) {
            case 0:
                Object obj = this.g;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return iHashCode ^ (value != null ? value.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f) {
            case 0:
                return this.g + "=" + getValue();
            default:
                return super.toString();
        }
    }
}
