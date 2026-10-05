package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class ct0 extends yq implements bt0, s61, zs0 {
    public final int l;

    public ct0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.l = i;
    }

    @Override // defpackage.bt0
    public final int c() {
        return this.l;
    }

    @Override // defpackage.yq
    public final s61 d() {
        rk2.a.getClass();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    public final boolean equals(Object obj) {
        ?? r2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ct0) {
            ct0 ct0Var = (ct0) obj;
            return this.i.equals(ct0Var.i) && this.j.equals(ct0Var.j) && s51.n(this.g, ct0Var.g) && i().equals(ct0Var.i());
        }
        if (!(obj instanceof ct0)) {
            return false;
        }
        s61 s61Var = this.f;
        if (s61Var == null) {
            d();
            this.f = this;
            this = this;
        } else {
            r2 = s61Var;
        }
        return obj.equals(r2);
    }

    public final int hashCode() {
        i();
        return this.j.hashCode() + by1.a(i().hashCode() * 31, 31, this.i);
    }

    public final String toString() {
        s61 s61Var = this.f;
        if (s61Var == null) {
            d();
            this.f = this;
            s61Var = this;
        }
        if (s61Var != this) {
            return s61Var.toString();
        }
        String str = this.i;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : nc2.i("function ", str, " (Kotlin reflection is not available)");
    }

    public ct0(int i, Class cls, String str, String str2, int i2) {
        this(i, xq.f, cls, str, str2, i2, 0);
    }
}
