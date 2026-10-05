package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class xo2 {
    public final yo2 a;
    public final yo2 b;
    public final Throwable c;

    public xo2(yo2 yo2Var, a30 a30Var, Throwable th) {
        this.a = yo2Var;
        this.b = a30Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo2)) {
            return false;
        }
        xo2 xo2Var = (xo2) obj;
        return s51.n(this.a, xo2Var.a) && s51.n(this.b, xo2Var.b) && s51.n(this.c, xo2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        yo2 yo2Var = this.b;
        int iHashCode2 = (iHashCode + (yo2Var == null ? 0 : yo2Var.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ xo2(yo2 yo2Var, Throwable th, int i) {
        this(yo2Var, (a30) null, (i & 4) != 0 ? null : th);
    }
}
