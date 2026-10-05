package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ng1 extends og1 {
    public final String a;
    public final ug3 b;

    public ng1(String str, ug3 ug3Var) {
        this.a = str;
        this.b = ug3Var;
    }

    @Override // defpackage.og1
    public final ug3 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1)) {
            return false;
        }
        ng1 ng1Var = (ng1) obj;
        return s51.n(this.a, ng1Var.a) && s51.n(this.b, ng1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ug3 ug3Var = this.b;
        return (iHashCode + (ug3Var != null ? ug3Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return nc2.i("LinkAnnotation.Url(url=", this.a, ")");
    }
}
