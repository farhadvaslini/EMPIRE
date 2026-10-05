package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ul1 implements ub2 {
    public final yl1 f;
    public p41 g;
    public bb1 h;
    public p41 i;
    public i41 j;

    public ul1(yl1 yl1Var) {
        this.f = yl1Var;
    }

    @Override // defpackage.ub2
    public final long a(m41 m41Var, long j, bb1 bb1Var, long j2) {
        i41 i41Var = this.j;
        if (i41Var != null) {
            p41 p41Var = this.g;
            if ((p41Var == null ? false : p41.b(p41Var.a, j)) && this.h == bb1Var) {
                p41 p41Var2 = this.i;
                if (p41Var2 != null ? p41.b(p41Var2.a, j2) : false) {
                    return i41Var.a;
                }
            }
        }
        long jA = this.f.a(m41Var, j, bb1Var, j2);
        this.g = new p41(j);
        this.h = bb1Var;
        this.i = new p41(j2);
        this.j = new i41(jA);
        return jA;
    }
}
