package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nb1 extends ex1 {
    public static final w9 m0;
    public kb1 i0;
    public m30 j0;
    public lb1 k0;
    public dj l0;

    static {
        w9 w9VarD = cl3.d();
        int i = wx.h;
        w9VarD.h(wx.e);
        w9VarD.o(1.0f);
        w9VarD.p(1);
        m0 = w9VarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nb1(tb1 tb1Var, kb1 kb1Var) {
        super(tb1Var);
        this.i0 = kb1Var;
        this.k0 = tb1Var.n != null ? new lb1(this) : null;
        this.l0 = (((aq1) kb1Var).f.h & 512) != 0 ? new dj(this, (i23) kb1Var) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // defpackage.i62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(long r5, float r7, defpackage.ns0 r8) {
        /*
            r4 = this;
            boolean r0 = r4.A
            if (r0 == 0) goto L11
            cl1 r5 = r4.u1()
            r5.getClass()
            long r5 = r5.A
            r4.N1(r5, r7, r8)
            goto L14
        L11:
            r4.N1(r5, r7, r8)
        L14:
            boolean r5 = r4.s
            if (r5 == 0) goto L19
            goto L74
        L19:
            r4.I1()
            ex1 r5 = r4.C
            r5.getClass()
            dj r6 = r4.l0
            r7 = 0
            if (r6 == 0) goto L63
            lb1 r8 = r4.k0
            r8.getClass()
            boolean r6 = r6.h
            if (r6 != 0) goto L60
            long r0 = r4.h
            lb1 r6 = r4.k0
            r8 = 0
            if (r6 == 0) goto L40
            long r2 = r6.m1()
            p41 r6 = new p41
            r6.<init>(r2)
            goto L41
        L40:
            r6 = r8
        L41:
            boolean r6 = defpackage.p41.a(r0, r6)
            if (r6 == 0) goto L60
            long r0 = r5.h
            cl1 r6 = r5.u1()
            if (r6 == 0) goto L58
            long r2 = r6.m1()
            p41 r8 = new p41
            r8.<init>(r2)
        L58:
            boolean r6 = defpackage.p41.a(r0, r8)
            if (r6 == 0) goto L60
            r6 = 1
            goto L61
        L60:
            r6 = r7
        L61:
            r5.A = r6
        L63:
            boolean r6 = r5.t
            boolean r8 = r4.t
            r5.t = r8
            dn1 r4 = r4.d1()
            r4.a()
            r5.t = r6
            r5.A = r7
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb1.K0(long, float, ns0):void");
    }

    @Override // defpackage.ex1
    public final void M1(pr prVar, qw0 qw0Var) {
        ex1 ex1Var;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1Var2.p1(prVar, qw0Var);
        if (!((h7) wb1.a(this.z)).getShowLayoutBounds() || (ex1Var = this.C) == null) {
            return;
        }
        if (p41.b(this.h, ex1Var.h) && i41.a(ex1Var.M, 0L)) {
            return;
        }
        long j = this.h;
        prVar.p(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, m0);
    }

    @Override // defpackage.al1
    public final int Q0(i5 i5Var) {
        lb1 lb1Var = this.k0;
        if (lb1Var == null) {
            return gq.o(this, i5Var);
        }
        wr1 wr1Var = lb1Var.E;
        int iD = wr1Var.d(i5Var);
        if (iD >= 0) {
            return wr1Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z1(kb1 kb1Var) {
        if (!kb1Var.equals(this.i0)) {
            if ((((aq1) kb1Var).f.h & 512) != 0) {
                i23 i23Var = (i23) kb1Var;
                dj djVar = this.l0;
                if (djVar != null) {
                    djVar.g = i23Var;
                } else {
                    djVar = new dj(this, i23Var);
                }
                this.l0 = djVar;
            } else {
                this.l0 = null;
            }
        }
        this.i0 = kb1Var;
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.r0(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.m0(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.f, ix1.f, 2), n30.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.ex1
    public final void r1() {
        if (this.k0 == null) {
            this.k0 = new lb1(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    @Override // defpackage.xm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.i62 t(long r9) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb1.t(long):i62");
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.y(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.u0(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.g, ix1.f, 2), n30.b(0, 0, 0, i, 7)).g();
    }

    @Override // defpackage.ex1
    public final cl1 u1() {
        return this.k0;
    }

    @Override // defpackage.ex1
    public final aq1 w1() {
        return ((aq1) this.i0).f;
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.Y(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.x0(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.f, ix1.g, 2), n30.b(0, i, 0, 0, 13)).d();
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        dj djVar = this.l0;
        if (djVar == null) {
            kb1 kb1Var = this.i0;
            ex1 ex1Var = this.C;
            ex1Var.getClass();
            return kb1Var.I(this, ex1Var, i);
        }
        i23 i23Var = djVar.g;
        ex1 ex1Var2 = this.C;
        ex1Var2.getClass();
        ex1 ex1Var3 = i23Var.f.m;
        ex1Var3.getClass();
        cl1 cl1VarU1 = ex1Var3.u1();
        cl1VarU1.getClass();
        if (!cl1VarU1.Y0()) {
            return ex1Var2.y(i);
        }
        return i23Var.p1(new aj(djVar, djVar.getLayoutDirection()), new w80(ex1Var2, hx1.g, ix1.g, 2), n30.b(0, i, 0, 0, 13)).d();
    }
}
