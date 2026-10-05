package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class oy {
    public static final qy a = new qy(n92.d, f5.s);

    public static final qy a(kj kjVar, tm tmVar, nv0 nv0Var, int i) {
        if (kjVar.equals(n92.d) && tmVar.equals(f5.s)) {
            nv0Var.a0(-1446604504);
            nv0Var.p(false);
            return a;
        }
        nv0Var.a0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && nv0Var.f(kjVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !nv0Var.f(tmVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objO = nv0Var.O();
        if (z3 || objO == c20.a) {
            objO = new qy(kjVar, tmVar);
            nv0Var.j0(objO);
        }
        qy qyVar = (qy) objO;
        nv0Var.p(false);
        return qyVar;
    }
}
