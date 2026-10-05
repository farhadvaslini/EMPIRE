package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class cz implements bq1 {
    public final bq1 a;
    public final bq1 b;

    public cz(bq1 bq1Var, bq1 bq1Var2) {
        this.a = bq1Var;
        this.b = bq1Var2;
    }

    @Override // defpackage.bq1
    public final Object a(rs0 rs0Var, Object obj) {
        return this.b.a(rs0Var, this.a.a(rs0Var, obj));
    }

    @Override // defpackage.bq1
    public final boolean b(ns0 ns0Var) {
        return this.a.b(ns0Var) && this.b.b(ns0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return this.a.equals(czVar.a) && s51.n(this.b, czVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = (StringBuilder) a(new wc(8), new StringBuilder("["));
        sb.append("]");
        return sb.toString();
    }
}
