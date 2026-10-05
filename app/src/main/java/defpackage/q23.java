package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class q23 implements kc0 {
    public final s23 f;
    public final long g;
    public final Object h;
    public final jr i;

    public q23(s23 s23Var, long j, Object obj, jr jrVar) {
        this.f = s23Var;
        this.g = j;
        this.h = obj;
        this.i = jrVar;
    }

    @Override // defpackage.kc0
    public final void a() {
        s23 s23Var = this.f;
        synchronized (s23Var) {
            if (this.g >= s23Var.o()) {
                Object[] objArr = s23Var.m;
                objArr.getClass();
                long j = this.g;
                if (objArr[((int) j) & (objArr.length - 1)] == this) {
                    r51.k(objArr, j, r51.H1);
                    s23Var.i();
                }
            }
        }
    }
}
