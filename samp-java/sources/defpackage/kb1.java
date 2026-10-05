package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public interface kb1 extends ia0 {
    default int I(al1 al1Var, xm1 xm1Var, int i) {
        return t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hx1.g, ix1.g, 2), n30.b(0, i, 0, 0, 13)).d();
    }

    default int Y(al1 al1Var, xm1 xm1Var, int i) {
        return t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hx1.f, ix1.g, 2), n30.b(0, i, 0, 0, 13)).d();
    }

    default int r0(al1 al1Var, xm1 xm1Var, int i) {
        return t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hx1.f, ix1.f, 2), n30.b(0, 0, 0, i, 7)).g();
    }

    dn1 t(en1 en1Var, xm1 xm1Var, long j);

    default int y(al1 al1Var, xm1 xm1Var, int i) {
        return t(new x51(al1Var, al1Var.getLayoutDirection()), new w80(xm1Var, hx1.g, ix1.f, 2), n30.b(0, 0, 0, i, 7)).g();
    }
}
