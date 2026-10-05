package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class xe0 extends aq1 implements kb1 {
    public d6 t;
    public rs0 u;
    public t02 v;
    public boolean w;

    @Override // defpackage.aq1
    public final void i1() {
        this.w = false;
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        if (!en1Var.M() || !this.w) {
            r32 r32Var = (r32) this.u.f(new p41((((long) i62VarT.g) & 4294967295L) | (((long) i62VarT.f) << 32)), new m30(j));
            d6 d6Var = this.t;
            fm1 fm1Var = (fm1) r32Var.f;
            Object obj = r32Var.g;
            if (!s51.n(d6Var.d(), fm1Var)) {
                d6Var.m.setValue(fm1Var);
                dt1 dt1Var = d6Var.e.b;
                boolean zG = dt1Var.g();
                if (zG) {
                    try {
                        a6 a6Var = d6Var.n;
                        float fD = d6Var.d().d(obj);
                        if (!Float.isNaN(fD)) {
                            a6.a(a6Var, fD);
                            d6Var.h(null);
                        }
                        d6Var.g(obj);
                    } finally {
                        dt1Var.i(null);
                    }
                }
                if (!zG) {
                    d6Var.h(obj);
                }
            }
        }
        this.w = en1Var.M() || this.w;
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new v1(en1Var, this, i62VarT, 9));
    }
}
