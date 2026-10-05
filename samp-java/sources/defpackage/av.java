package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class av implements bv {
    public final ai1 a;
    public final Long b;
    public final boolean c;

    public av(ai1 ai1Var, Long l, boolean z) {
        this.a = ai1Var;
        this.b = l;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return this.a.equals(avVar.a) && s51.n(this.b, avVar.b) && this.c == avVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "Ready(scripts=" + this.a + ", cachedAtMillis=" + this.b + ", offline=" + this.c + ")";
    }
}
