package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xl1 implements vo1 {
    public vo1[] a;

    @Override // defpackage.vo1
    public final yi2 a(Class cls) {
        for (vo1 vo1Var : this.a) {
            if (vo1Var.b(cls)) {
                return vo1Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.vo1
    public final boolean b(Class cls) {
        for (vo1 vo1Var : this.a) {
            if (vo1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
