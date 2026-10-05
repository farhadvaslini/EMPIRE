package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class jz1 extends o02 {
    public static final jz1 c = new jz1(0, 2, 1);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        iv0 iv0Var = (iv0) lxVar.e(0);
        Object objE = lxVar.e(1);
        if (objE instanceof rv0) {
            rv0 rv0Var = (rv0) objE;
            zk2Var.e.b(rv0Var);
            zk2Var.d.a(rv0Var);
        }
        if (m53Var.n != 0) {
            e20.a("Can only append a slot if not current inserting");
        }
        int i = m53Var.i;
        int i2 = m53Var.j;
        int iC = m53Var.c(iv0Var);
        int iG = m53Var.g(m53Var.b, m53Var.r(iC + 1));
        m53Var.i = iG;
        m53Var.j = iG;
        m53Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        m53Var.c[iG] = objE;
        m53Var.i = i;
        m53Var.j = i2;
    }
}
