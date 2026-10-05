package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class v30 {
    public final uo a;
    public final jr b;

    public v30(uo uoVar, jr jrVar) {
        this.a = uoVar;
        this.b = jrVar;
    }

    public final String toString() {
        jr jrVar = this.b;
        if (jrVar.j.m(t50.g) != null) {
            qn1.b();
            return null;
        }
        int iHashCode = hashCode();
        ur.r(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return "Request@" + string + "(currentBounds()=" + this.a.a() + ", continuation=" + jrVar + ")";
    }
}
