package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class p11 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof p11) {
            return this.a == ((p11) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return by1.h("IndirectPointerEventPrimaryDirectionalMotionAxis(value=", ")", this.a);
    }
}
