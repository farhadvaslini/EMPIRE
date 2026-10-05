package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fz1 extends aq1 implements gn1 {
    public ns0 t;
    public long u;

    @Override // defpackage.aq1
    public final boolean e1() {
        return true;
    }

    @Override // defpackage.gn1
    public final void i(long j) {
        if (p41.b(this.u, j)) {
            return;
        }
        this.t.h(new p41(j));
        this.u = j;
    }
}
