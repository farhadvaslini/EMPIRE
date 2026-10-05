package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class as2 extends aq1 implements kb1, tu2 {
    public es2 t;
    public boolean u;

    @Override // defpackage.kb1
    public final int I(al1 al1Var, xm1 xm1Var, int i) {
        if (!this.u) {
            i = Integer.MAX_VALUE;
        }
        return xm1Var.y(i);
    }

    @Override // defpackage.tu2
    public final void K0(dv2 dv2Var) {
        bv2.l(dv2Var);
        final int i = 0;
        final int i2 = 1;
        tr2 tr2Var = new tr2(new cs0(this) { // from class: zr2
            public final /* synthetic */ as2 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int iG;
                int i3 = i;
                as2 as2Var = this.g;
                switch (i3) {
                    case 0:
                        iG = as2Var.t.a.g();
                        break;
                    default:
                        iG = as2Var.t.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        }, new cs0(this) { // from class: zr2
            public final /* synthetic */ as2 g;

            {
                this.g = this;
            }

            @Override // defpackage.cs0
            public final Object a() {
                int iG;
                int i3 = i2;
                as2 as2Var = this.g;
                switch (i3) {
                    case 0:
                        iG = as2Var.t.a.g();
                        break;
                    default:
                        iG = as2Var.t.f.g();
                        break;
                }
                return Float.valueOf(iG);
            }
        });
        if (this.u) {
            cv2 cv2Var = zu2.w;
            a71 a71Var = bv2.a[13];
            cv2Var.getClass();
            dv2Var.a(cv2Var, tr2Var);
            return;
        }
        cv2 cv2Var2 = zu2.v;
        a71 a71Var2 = bv2.a[12];
        cv2Var2.getClass();
        dv2Var.a(cv2Var2, tr2Var);
    }

    @Override // defpackage.kb1
    public final int Y(al1 al1Var, xm1 xm1Var, int i) {
        if (!this.u) {
            i = Integer.MAX_VALUE;
        }
        return xm1Var.x0(i);
    }

    @Override // defpackage.kb1
    public final int r0(al1 al1Var, xm1 xm1Var, int i) {
        if (this.u) {
            i = Integer.MAX_VALUE;
        }
        return xm1Var.m0(i);
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        gq.s(j, this.u ? t02.f : t02.g);
        i62 i62VarT = xm1Var.t(m30.b(j, 0, this.u ? m30.i(j) : Integer.MAX_VALUE, 0, this.u ? Integer.MAX_VALUE : m30.h(j), 5));
        int i = i62VarT.f;
        int i2 = m30.i(j);
        if (i > i2) {
            i = i2;
        }
        int i3 = i62VarT.g;
        int iH = m30.h(j);
        if (i3 > iH) {
            i3 = iH;
        }
        int i4 = i62VarT.g - i3;
        int i5 = i62VarT.f - i;
        if (!this.u) {
            i4 = i5;
        }
        es2 es2Var = this.t;
        a42 a42Var = es2Var.f;
        a42 a42Var2 = es2Var.a;
        a42Var.h(i4);
        t63 t63VarL = jo3.l();
        ns0 ns0VarE = t63VarL != null ? t63VarL.e() : null;
        t63 t63VarS = jo3.s(t63VarL);
        try {
            if (a42Var2.g() > i4) {
                a42Var2.h(i4);
            }
            jo3.v(t63VarL, t63VarS, ns0VarE);
            this.t.b.h(this.u ? i3 : i);
            this.t.c.h(this.u ? i62VarT.g : i62VarT.f);
            this.t.d.setValue(Boolean.FALSE);
            return en1Var.I0(i, i3, oi0.f, new wj2(i4, 1, this, i62VarT));
        } catch (Throwable th) {
            jo3.v(t63VarL, t63VarS, ns0VarE);
            throw th;
        }
    }

    @Override // defpackage.kb1
    public final int y(al1 al1Var, xm1 xm1Var, int i) {
        if (this.u) {
            i = Integer.MAX_VALUE;
        }
        return xm1Var.u0(i);
    }
}
