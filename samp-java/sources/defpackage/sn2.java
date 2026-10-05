package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sn2 extends m61 {
    public final n61 m;

    public sn2(n61 n61Var) {
        this.m = n61Var;
    }

    @Override // defpackage.m61
    public final boolean r() {
        return false;
    }

    @Override // defpackage.m61
    public final void s(Throwable th) {
        Object objS = q().S();
        boolean z = objS instanceof jz;
        n61 n61Var = this.m;
        if (z) {
            n61Var.t(y02.l(((jz) objS).a));
        } else {
            n61Var.t(s51.K(objS));
        }
    }
}
