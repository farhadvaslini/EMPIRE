package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class gx0 implements ub2 {
    public final h5 f;
    public final jy1 g;
    public long h = 0;

    public gx0(h5 h5Var, jy1 jy1Var) {
        this.f = h5Var;
        this.g = jy1Var;
    }

    @Override // defpackage.ub2
    public final long a(m41 m41Var, long j, bb1 bb1Var, long j2) {
        long jA = this.g.a();
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            jA = this.h;
        }
        this.h = jA;
        return i41.c(i41.c(m41Var.c(), uq.H(jA)), this.f.a(j2, 0L, bb1Var));
    }
}
