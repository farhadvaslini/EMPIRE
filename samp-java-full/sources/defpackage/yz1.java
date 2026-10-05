package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yz1 extends o02 {
    public static final yz1 c = new yz1(0, 3, 1);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        a31 a31Var;
        j53 j53Var = (j53) lxVar.e(1);
        iv0 iv0Var = (iv0) lxVar.e(0);
        qm0 qm0Var = (qm0) lxVar.e(2);
        m53 m53VarE = j53Var.e();
        if (p02Var != null) {
            try {
                a31Var = new a31(p02Var, false, m53Var, 23);
            } catch (Throwable th) {
                m53VarE.e(false);
                throw th;
            }
        } else {
            a31Var = null;
        }
        if (!qm0Var.l.R()) {
            e20.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        qm0Var.k.Q(wiVar, m53VarE, zk2Var, a31Var);
        m53VarE.e(true);
        m53Var.d();
        iv0Var.getClass();
        m53Var.A(j53Var, j53Var.a(iv0Var));
        m53Var.k();
    }
}
