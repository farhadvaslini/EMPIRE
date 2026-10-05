package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zm extends aq1 implements kb1, tu2 {
    public ns0 t;

    public zm(ns0 ns0Var) {
        this.t = ns0Var;
    }

    @Override // defpackage.tu2
    public final boolean C() {
        return false;
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        z13 z13Var;
        boolean z;
        ex1 ex1VarU = vr.U(this, 2);
        if (ex1VarU.U) {
            z13Var = ex1VarU.Q;
            z = ex1VarU.T;
        } else {
            wn2 wn2Var = vm1.Y;
            if (wn2Var == null) {
                vm1.Y = new wn2();
            } else {
                wn2Var.c();
            }
            wn2 wn2Var2 = vm1.Y;
            wn2Var2.getClass();
            wn2Var2.y = ex1VarU.z.E;
            wn2Var2.w = lr.T(ex1VarU.h);
            t63 t63VarL = jo3.l();
            ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
            t63 t63VarS = jo3.s(t63VarL);
            try {
                this.t.h(wn2Var2);
                jo3.v(t63VarL, t63VarS, ns0VarE);
                z13Var = wn2Var2.t;
                z = wn2Var2.u;
            } catch (Throwable th) {
                jo3.v(t63VarL, t63VarS, ns0VarE);
                throw th;
            }
        }
        if (z) {
            bv2.j(dv2Var, z13Var);
        }
    }

    @Override // defpackage.aq1
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new i(8, i62VarT, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.t + ")";
    }
}
