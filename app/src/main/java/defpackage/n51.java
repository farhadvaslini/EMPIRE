package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class n51 extends aq1 implements kb1 {
    public final /* synthetic */ int t;

    public int I(al1 al1Var, xm1 xm1Var, int i) {
        switch (this.t) {
        }
        return xm1Var.y(i);
    }

    public int Y(al1 al1Var, xm1 xm1Var, int i) {
        switch (this.t) {
        }
        return xm1Var.x0(i);
    }

    public abstract long p1(xm1 xm1Var, long j);

    public abstract boolean q1();

    @Override // defpackage.kb1
    public int r0(al1 al1Var, xm1 xm1Var, int i) {
        switch (this.t) {
        }
        return xm1Var.m0(i);
    }

    public dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        long jP1 = p1(xm1Var, j);
        if (q1()) {
            jP1 = n30.e(j, jP1);
        }
        i62 i62VarT = xm1Var.t(jP1);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new z6(i62VarT, 5));
    }

    @Override // defpackage.kb1
    public int y(al1 al1Var, xm1 xm1Var, int i) {
        switch (this.t) {
        }
        return xm1Var.u0(i);
    }
}
