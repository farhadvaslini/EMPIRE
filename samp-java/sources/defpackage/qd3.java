package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class qd3 {
    public final af a;
    public af b;
    public boolean c = false;
    public dr1 d = null;

    public qd3(af afVar, af afVar2) {
        this.a = afVar;
        this.b = afVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd3)) {
            return false;
        }
        qd3 qd3Var = (qd3) obj;
        return s51.n(this.a, qd3Var.a) && s51.n(this.b, qd3Var.b) && this.c == qd3Var.c && s51.n(this.d, qd3Var.d);
    }

    public final int hashCode() {
        int iB = by1.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        dr1 dr1Var = this.d;
        return iB + (dr1Var == null ? 0 : dr1Var.hashCode());
    }

    public final String toString() {
        af afVar = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) afVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
