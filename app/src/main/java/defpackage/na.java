package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class na implements eb2 {
    public final int b;

    public na(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!na.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.b == ((na) obj).b;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return by1.h("AndroidPointerIcon(type=", ")", this.b);
    }
}
