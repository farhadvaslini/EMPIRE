package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 extends gq {
    public final kv1 h;

    public sv1(kv1 kv1Var) {
        kv1Var.getClass();
        this.h = kv1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && sv1.class == obj.getClass() && s51.n(this.h, ((sv1) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.h + ", direction=-1)";
    }
}
