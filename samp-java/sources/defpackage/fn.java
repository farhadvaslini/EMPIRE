package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fn {
    public g9 a = null;
    public n6 b = null;
    public rr c = null;
    public da d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        return s51.n(this.a, fnVar.a) && s51.n(this.b, fnVar.b) && s51.n(this.c, fnVar.c) && s51.n(this.d, fnVar.d);
    }

    public final int hashCode() {
        g9 g9Var = this.a;
        int iHashCode = (g9Var == null ? 0 : g9Var.hashCode()) * 31;
        n6 n6Var = this.b;
        int iHashCode2 = (iHashCode + (n6Var == null ? 0 : n6Var.hashCode())) * 31;
        rr rrVar = this.c;
        int iHashCode3 = (iHashCode2 + (rrVar == null ? 0 : rrVar.hashCode())) * 31;
        da daVar = this.d;
        return iHashCode3 + (daVar != null ? daVar.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
