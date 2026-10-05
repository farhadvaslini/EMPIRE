package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ae1 extends vp {
    public final h9 g = new h9();

    public ae1(ns0 ns0Var) {
        ns0Var.h(this);
    }

    public static void W(ae1 ae1Var, String str, ss0 ss0Var, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        int i2 = 2;
        ae1Var.g.a(1, new zd1(str != null ? new xc1(i2, str) : null, new n20(20), new d00(-857469575, new ba(i2, ss0Var), true)));
    }

    @Override // defpackage.vp
    public final h9 G() {
        return this.g;
    }

    public final void X(int i, ns0 ns0Var, ns0 ns0Var2, d00 d00Var) {
        this.g.a(i, new zd1(ns0Var, ns0Var2, d00Var));
    }
}
