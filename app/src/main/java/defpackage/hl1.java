package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public interface hl1 {
    ab1 c(ab1 ab1Var);

    default long i(ab1 ab1Var, ab1 ab1Var2) {
        ab1 ab1VarC = c(ab1Var);
        ab1 ab1VarC2 = c(ab1Var2);
        return ab1VarC instanceof dl1 ? ((dl1) ab1VarC).l0(ab1VarC2, 0L, true) : ab1VarC2 instanceof dl1 ? ((dl1) ab1VarC2).l0(ab1VarC, 0L, true) ^ (-9223372034707292160L) : ab1VarC.l0(ab1VarC, 0L, true);
    }
}
