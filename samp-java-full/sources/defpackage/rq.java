package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rq {
    public final ai1 a;
    public final long b;

    public rq(ai1 ai1Var, long j) {
        this.a = ai1Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq)) {
            return false;
        }
        rq rqVar = (rq) obj;
        return this.a.equals(rqVar.a) && this.b == rqVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedCleoCatalog(entries=" + this.a + ", updatedAtMillis=" + this.b + ")";
    }
}
