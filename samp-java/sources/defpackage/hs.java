package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hs {
    public final h5 a;
    public final ns0 b;
    public final mm0 c;
    public final boolean d;

    public hs(h5 h5Var, ns0 ns0Var, mm0 mm0Var, boolean z) {
        this.a = h5Var;
        this.b = ns0Var;
        this.c = mm0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs)) {
            return false;
        }
        hs hsVar = (hs) obj;
        return s51.n(this.a, hsVar.a) && s51.n(this.b, hsVar.b) && s51.n(this.c, hsVar.c) && this.d == hsVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=" + this.d + ")";
    }
}
