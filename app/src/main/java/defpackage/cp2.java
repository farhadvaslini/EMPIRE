package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class cp2 {
    public static final dp2 a = new dp2(n92.b, f5.p);

    public static final dp2 a(ij ijVar, um umVar, nv0 nv0Var, int i) {
        if (ijVar.equals(n92.b) && s51.n(umVar, f5.p)) {
            nv0Var.a0(-1073830487);
            nv0Var.p(false);
            return a;
        }
        nv0Var.a0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && nv0Var.f(ijVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !nv0Var.f(umVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objO = nv0Var.O();
        if (z3 || objO == c20.a) {
            objO = new dp2(ijVar, umVar);
            nv0Var.j0(objO);
        }
        dp2 dp2Var = (dp2) objO;
        nv0Var.p(false);
        return dp2Var;
    }
}
