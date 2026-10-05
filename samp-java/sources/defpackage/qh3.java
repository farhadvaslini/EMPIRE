package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class qh3 {
    public static final ThreadLocal a = new ThreadLocal();

    public static qj0 a() {
        ThreadLocal threadLocal = a;
        qj0 qj0Var = (qj0) threadLocal.get();
        if (qj0Var != null) {
            return qj0Var;
        }
        bn bnVar = new bn(Thread.currentThread());
        threadLocal.set(bnVar);
        return bnVar;
    }
}
