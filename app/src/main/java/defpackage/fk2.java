package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fk2 implements wi {
    public final nr1 f = new nr1();
    public final as1 g = new as1();
    public final Object h;

    public fk2(Object obj) {
        this.h = obj;
    }

    public final void a(tl3 tl3Var, zk2 zk2Var) {
        Exception exc;
        nr1 nr1Var = this.f;
        int i = nr1Var.b;
        as1 as1Var = new as1();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            as1 as1Var2 = this.g;
            if (i2 >= i) {
                if (i3 != as1Var2.b) {
                    e20.a("Applier operation size mismatch");
                }
                as1Var2.e();
                nr1Var.b = 0;
                tl3Var.g();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (nr1Var.c(i2)) {
                        case 0:
                            tl3Var.s();
                            i2 = i4;
                            break;
                        case 1:
                            int i5 = i3 + 1;
                            tl3Var.d(as1Var2.g(i3));
                            i3 = i5;
                            i2 = i4;
                            break;
                        case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                            int i6 = i2 + 2;
                            i2 += 3;
                            tl3Var.j(nr1Var.c(i4), nr1Var.c(i6));
                            break;
                        case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    tl3Var.h(nr1Var.c(i4), nr1Var.c(i7), nr1Var.c(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                            }
                            break;
                        case oc2.LONG_FIELD_NUMBER /* 4 */:
                            tl3Var.a();
                            i2 = i4;
                            break;
                        case oc2.STRING_FIELD_NUMBER /* 5 */:
                            i2 += 2;
                            int i9 = i3 + 1;
                            tl3Var.c(nr1Var.c(i4), as1Var2.g(i3));
                            i3 = i9;
                            break;
                        case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                nr1Var.c(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object objG = as1Var2.g(i3);
                            objG.getClass();
                            cl3.i(2, objG);
                            i3 += 2;
                            tl3Var.m((rs0) objG, as1Var2.g(i11));
                            i2 = i4;
                            break;
                        case 8:
                            Object obj = tl3Var.h;
                            if (obj instanceof j10) {
                                j10 j10Var = (j10) obj;
                                if (zk2Var.f.j(j10Var)) {
                                    j10Var.h();
                                }
                            }
                            as1Var.b(obj);
                            tl3Var.e();
                            i2 = i4;
                            break;
                        default:
                            i2 = i4;
                            break;
                    }
                } catch (Throwable th) {
                    tl3Var.g();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new l10(as1Var2, as1Var, nr1Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.wi
    public final void c(int i, Object obj) {
        nr1 nr1Var = this.f;
        nr1Var.a(5);
        nr1Var.a(i);
        this.g.b(obj);
    }

    @Override // defpackage.wi
    public final void d(Object obj) {
        this.f.a(1);
        this.g.b(obj);
    }

    @Override // defpackage.wi
    public final void e() {
        this.f.a(8);
    }

    @Override // defpackage.wi
    public final void f(int i, Object obj) {
        nr1 nr1Var = this.f;
        nr1Var.a(6);
        nr1Var.a(i);
        this.g.b(obj);
    }

    @Override // defpackage.wi
    public final void h(int i, int i2, int i3) {
        nr1 nr1Var = this.f;
        nr1Var.a(3);
        nr1Var.a(i);
        nr1Var.a(i2);
        nr1Var.a(i3);
    }

    @Override // defpackage.wi
    public final Object i() {
        return this.h;
    }

    @Override // defpackage.wi
    public final void j(int i, int i2) {
        nr1 nr1Var = this.f;
        nr1Var.a(2);
        nr1Var.a(i);
        nr1Var.a(i2);
    }

    @Override // defpackage.wi
    public final void m(rs0 rs0Var, Object obj) {
        this.f.a(7);
        as1 as1Var = this.g;
        as1Var.b(rs0Var);
        as1Var.b(obj);
    }

    @Override // defpackage.wi
    public final void s() {
        this.f.a(0);
    }
}
