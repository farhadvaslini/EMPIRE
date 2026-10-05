package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vs {
    public static final us b = new us();
    public final Object a;

    public /* synthetic */ vs(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof us) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vs) {
            return s51.n(this.a, ((vs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof ts) {
            return ((ts) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
