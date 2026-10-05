package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class e60 {
    public final LinkedHashMap a = new LinkedHashMap();

    public abstract Object a(ak2 ak2Var);

    public final boolean equals(Object obj) {
        if (obj instanceof e60) {
            return s51.n(this.a, ((e60) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ")";
    }
}
