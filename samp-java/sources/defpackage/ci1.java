package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ci1 {
    public static b51 a(long j, Object obj) {
        b51 b51Var = (b51) qm3.c.h(j, obj);
        if (((ce2) b51Var).f) {
            return b51Var;
        }
        ce2 ce2Var = (ce2) b51Var;
        int i = ce2Var.h;
        ce2 ce2VarC = ce2Var.c(i == 0 ? 10 : i * 2);
        qm3.o(obj, j, ce2VarC);
        return ce2VarC;
    }
}
