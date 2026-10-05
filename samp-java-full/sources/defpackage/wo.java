package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wo extends aq1 implements no, ya1 {
    public y30 t;
    public boolean u;

    public static final jk2 p1(wo woVar, ex1 ex1Var, u1 u1Var) {
        jk2 jk2Var;
        if (woVar.s && woVar.u) {
            ex1 ex1VarW = vr.W(woVar);
            if (!ex1Var.w1().s) {
                ex1Var = null;
            }
            if (ex1Var != null && (jk2Var = (jk2) u1Var.a()) != null) {
                return jk2Var.i(ex1VarW.c0(ex1Var, false).d());
            }
        }
        return null;
    }

    @Override // defpackage.ya1
    public final void J(ab1 ab1Var) {
        this.u = true;
    }

    @Override // defpackage.no
    public final Object U0(ex1 ex1Var, u1 u1Var, q40 q40Var) {
        Object objW = ur.w(new vo(this, ex1Var, u1Var, new ok(this, ex1Var, u1Var, 2), null, 0), q40Var);
        return objW == y50.f ? objW : dm3.a;
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }
}
