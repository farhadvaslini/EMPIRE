package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ae2 extends yq implements a71 {
    public final boolean l;

    public ae2(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.l = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ae2) {
            ae2 ae2Var = (ae2) obj;
            return i().equals(ae2Var.i()) && this.i.equals(ae2Var.i) && this.j.equals(ae2Var.j) && s51.n(this.g, ae2Var.g);
        }
        if (obj instanceof a71) {
            return obj.equals(k());
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + by1.a(i().hashCode() * 31, 31, this.i);
    }

    public final s61 k() {
        if (this.l) {
            return this;
        }
        s61 s61Var = this.f;
        if (s61Var != null) {
            return s61Var;
        }
        s61 s61VarD = d();
        this.f = s61VarD;
        return s61VarD;
    }

    public final String toString() {
        s61 s61VarK = k();
        return s61VarK != this ? s61VarK.toString() : nc2.j(new StringBuilder("property "), this.i, " (Kotlin reflection is not available)");
    }
}
