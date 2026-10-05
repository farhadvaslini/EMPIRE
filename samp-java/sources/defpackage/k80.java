package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k80 {
    public static final k80 a = new k80();

    public final void a(pl plVar, nv0 nv0Var, int i) {
        nv0Var.b0(1565826668);
        int i2 = (nv0Var.f(plVar) ? 4 : 2) | i;
        if (nv0Var.R(i2 & 1, (i2 & 3) != 2)) {
            f80.b((cs0) plVar.g, (nb0) plVar.i, gq.N(1163527043, new e90(3, plVar), nv0Var), nv0Var, 384);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 8, this, plVar);
        }
    }
}
