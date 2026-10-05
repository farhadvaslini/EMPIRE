package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class t23 extends x0 {
    public long a;
    public jr b;

    @Override // defpackage.x0
    public final boolean a(w0 w0Var) {
        s23 s23Var = (s23) w0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = s23Var.n;
        if (j < s23Var.o) {
            s23Var.o = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.x0
    public final p40[] b(w0 w0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((s23) w0Var).v(j);
    }
}
