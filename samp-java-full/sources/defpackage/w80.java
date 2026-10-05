package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class w80 implements xm1 {
    public final /* synthetic */ int f;
    public final xm1 g;
    public final Enum h;
    public final Enum i;

    public /* synthetic */ w80(xm1 xm1Var, Enum r2, Enum r3, int i) {
        this.f = i;
        this.g = xm1Var;
        this.h = r2;
        this.i = r3;
    }

    @Override // defpackage.xm1
    public final Object E() {
        switch (this.f) {
        }
        return this.g.E();
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        switch (this.f) {
        }
        return this.g.m0(i);
    }

    @Override // defpackage.xm1
    public final i62 t(long j) {
        int i = this.f;
        Enum r1 = this.h;
        Enum r2 = this.i;
        xm1 xm1Var = this.g;
        switch (i) {
            case 0:
                p51 p51Var = (p51) r2;
                l51 l51Var = (l51) r1;
                l51 l51Var2 = l51.g;
                if (p51Var == p51.f) {
                    return new pm0(l51Var == l51Var2 ? xm1Var.u0(m30.h(j)) : xm1Var.m0(m30.h(j)), m30.d(j) ? m30.h(j) : 32767, 0);
                }
                return new pm0(m30.e(j) ? m30.i(j) : 32767, l51Var == l51Var2 ? xm1Var.y(m30.i(j)) : xm1Var.x0(m30.i(j)), 0);
            case 1:
                in1 in1Var = (in1) r2;
                hn1 hn1Var = (hn1) r1;
                hn1 hn1Var2 = hn1.g;
                if (in1Var == in1.f) {
                    return new pm0(hn1Var == hn1Var2 ? xm1Var.u0(m30.h(j)) : xm1Var.m0(m30.h(j)), m30.d(j) ? m30.h(j) : 32767, 1);
                }
                return new pm0(m30.e(j) ? m30.i(j) : 32767, hn1Var == hn1Var2 ? xm1Var.y(m30.i(j)) : xm1Var.x0(m30.i(j)), 1);
            default:
                ix1 ix1Var = (ix1) r2;
                hx1 hx1Var = (hx1) r1;
                hx1 hx1Var2 = hx1.g;
                if (ix1Var == ix1.f) {
                    return new pm0(hx1Var == hx1Var2 ? xm1Var.u0(m30.h(j)) : xm1Var.m0(m30.h(j)), m30.d(j) ? m30.h(j) : 32767, 2);
                }
                return new pm0(m30.e(j) ? m30.i(j) : 32767, hx1Var == hx1Var2 ? xm1Var.y(m30.i(j)) : xm1Var.x0(m30.i(j)), 2);
        }
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        switch (this.f) {
        }
        return this.g.u0(i);
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        switch (this.f) {
        }
        return this.g.x0(i);
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        switch (this.f) {
        }
        return this.g.y(i);
    }
}
