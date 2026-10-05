package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class er implements qx1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ er(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((ns0) obj).getClass().getSimpleName() + '@' + f80.D(this) + ']';
            default:
                return "DisposeOnCancel[" + ((kc0) obj) + ']';
        }
    }
}
