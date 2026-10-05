package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class r21 extends cl1 {
    @Override // defpackage.al1
    public final int Q0(i5 i5Var) {
        gl1 gl1Var = this.z.z.M.q;
        gl1Var.getClass();
        ub1 ub1Var = gl1Var.w;
        if (!gl1Var.p) {
            xb1 xb1Var = gl1Var.k;
            if (xb1Var.d == pb1.g) {
                ub1Var.f = true;
                if (ub1Var.b) {
                    xb1Var.f = true;
                    xb1Var.g = true;
                }
            } else {
                ub1Var.g = true;
            }
        }
        r21 r21Var = gl1Var.I().j0;
        Boolean boolValueOf = r21Var != null ? Boolean.valueOf(r21Var.t) : null;
        r21 r21Var2 = gl1Var.I().j0;
        if (r21Var2 != null) {
            r21Var2.t = true;
        }
        gl1Var.L();
        r21 r21Var3 = gl1Var.I().j0;
        if (r21Var3 != null) {
            r21Var3.t = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) ub1Var.i.get(i5Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.E.g(iIntValue, i5Var);
        return iIntValue;
    }

    @Override // defpackage.xm1
    public final int m0(int i) {
        a31 a31VarT = this.z.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.e(tb1Var.L.d, tb1Var.l(), i);
    }

    @Override // defpackage.cl1
    public final void n1() {
        gl1 gl1Var = this.z.z.M.q;
        gl1Var.getClass();
        gl1Var.V0();
    }

    @Override // defpackage.xm1
    public final i62 t(long j) {
        M0(j);
        ex1 ex1Var = this.z;
        qs1 qs1VarZ = ex1Var.z.z();
        Object[] objArr = qs1VarZ.f;
        int i = qs1VarZ.h;
        for (int i2 = 0; i2 < i; i2++) {
            gl1 gl1Var = ((tb1) objArr[i2]).M.q;
            gl1Var.getClass();
            gl1Var.o = rb1.h;
        }
        tb1 tb1Var = ex1Var.z;
        cl1.l1(this, tb1Var.C.c(this, tb1Var.l(), j));
        return this;
    }

    @Override // defpackage.xm1
    public final int u0(int i) {
        a31 a31VarT = this.z.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.b(tb1Var.L.d, tb1Var.l(), i);
    }

    @Override // defpackage.xm1
    public final int x0(int i) {
        a31 a31VarT = this.z.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.d(tb1Var.L.d, tb1Var.l(), i);
    }

    @Override // defpackage.xm1
    public final int y(int i) {
        a31 a31VarT = this.z.z.t();
        cn1 cn1VarV = a31VarT.v();
        tb1 tb1Var = (tb1) a31VarT.g;
        return cn1VarV.a(tb1Var.L.d, tb1Var.l(), i);
    }
}
