package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class x93 implements we {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof x93) {
            return this.a.equals(((x93) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nc2.i("StringAnnotation(value=", this.a, ")");
    }
}
