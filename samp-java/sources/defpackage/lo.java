package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class lo implements io {
    public final ua0 a;
    public final long b;

    public lo(sa3 sa3Var, long j) {
        this.a = sa3Var;
        this.b = j;
    }

    @Override // defpackage.io
    public final bq1 a(bq1 bq1Var, vm vmVar) {
        return bq1Var.d(new ao(vmVar, false));
    }

    public final float b() {
        long j = this.b;
        if (!m30.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.X0(m30.i(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj;
        return s51.n(this.a, loVar.a) && m30.c(this.b, loVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + m30.l(this.b) + ")";
    }
}
