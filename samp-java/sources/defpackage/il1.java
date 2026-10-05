package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class il1 implements hl1 {
    @Override // defpackage.hl1
    public final ab1 c(ab1 ab1Var) {
        dl1 dl1Var;
        dl1 dl1Var2 = ab1Var instanceof dl1 ? (dl1) ab1Var : null;
        if (dl1Var2 != null) {
            return dl1Var2;
        }
        ex1 ex1Var = (ex1) ab1Var;
        cl1 cl1VarU1 = ex1Var.u1();
        return (cl1VarU1 == null || (dl1Var = cl1VarU1.C) == null) ? ex1Var : dl1Var;
    }
}
