package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public interface zq3 {
    default vq3 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default vq3 b(Class cls, lr1 lr1Var) {
        return a(cls);
    }

    default vq3 c(lu luVar, lr1 lr1Var) {
        return b(uq.t(luVar), lr1Var);
    }
}
