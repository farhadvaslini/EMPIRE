package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class cf1 {
    public static ef1 a(ff1 ff1Var) {
        ff1Var.getClass();
        int iOrdinal = ff1Var.ordinal();
        if (iOrdinal == 2) {
            return ef1.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return ef1.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return ef1.ON_PAUSE;
    }
}
