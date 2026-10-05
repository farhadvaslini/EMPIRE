package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ru3 extends aq1 implements kb1 {
    public tb0 t;
    public rs0 u;

    @Override // defpackage.kb1
    public final dn1 t(final en1 en1Var, xm1 xm1Var, long j) {
        final i62 i62VarT = xm1Var.t(n30.a(this.t != tb0.f ? 0 : m30.k(j), m30.i(j), this.t == tb0.g ? m30.j(j) : 0, m30.h(j)));
        final int iH = y02.h(i62VarT.f, m30.k(j), m30.i(j));
        final int iH2 = y02.h(i62VarT.g, m30.j(j), m30.h(j));
        return en1Var.I0(iH, iH2, oi0.f, new ns0() { // from class: qu3
            @Override // defpackage.ns0
            public final Object h(Object obj) {
                rs0 rs0Var = this.f.u;
                i62 i62Var = i62VarT;
                h62.E((h62) obj, i62Var, ((i41) rs0Var.f(new p41((((long) (iH - i62Var.f)) << 32) | (((long) (iH2 - i62Var.g)) & 4294967295L)), en1Var.getLayoutDirection())).a);
                return dm3.a;
            }
        });
    }
}
