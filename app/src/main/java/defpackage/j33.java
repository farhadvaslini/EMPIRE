package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class j33 extends aq1 implements kb1, ey1, of0, m20 {
    public c33 t;

    @Override // defpackage.aq1
    public final void h1() {
        gq.M(this, this.t.i);
        this.t.getClass();
    }

    @Override // defpackage.aq1
    public final void i1() {
        this.t.getClass();
    }

    @Override // defpackage.ey1
    public final void k0() {
        this.t.d();
        gq.M(this, this.t.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    @Override // defpackage.of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(vb1 vb1Var) throws Throwable {
        jk2 jk2VarC;
        qw0 qw0Var;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        pi piVar;
        long jFloatToRawIntBits;
        long jA;
        long j;
        vb1Var.c();
        c33 c33Var = this.t;
        ow0 ow0VarV = vr.V(this);
        rr rrVar = vb1Var.f;
        as1 as1Var = c33Var.m;
        int iG = c33Var.l.g();
        boolean z = true;
        if (c33Var.o != iG) {
            d33 d33Var = h33.a;
            int i = as1Var.b;
            for (int i2 = 1; i2 < i; i2++) {
                Object objG = as1Var.g(i2);
                int i3 = i2 - 1;
                while (i3 >= 0 && Float.compare(up0.a((o23) as1Var.g(i3)), up0.a((o23) objG)) > 0) {
                    as1Var.o(i3 + 1, as1Var.g(i3));
                    i3--;
                }
                as1Var.o(i3 + 1, objG);
            }
            c33Var.o = iG;
        }
        Object[] objArr = as1Var.a;
        int i4 = as1Var.b;
        int i5 = 0;
        while (i5 < i4) {
            o23 o23Var = (o23) objArr[i5];
            boolean zH = o23Var.h();
            d42 d42Var = o23Var.s;
            if (zH && ((qw0) d42Var.getValue()) == null) {
                d42Var.setValue(ow0VarV.b());
            }
            qw0 qw0Var2 = (qw0) d42Var.getValue();
            if (qw0Var2 != null && (jk2VarC = o23Var.f().c.a().c()) != null && o23Var.h()) {
                long jD = jk2VarC.d();
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jD >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jD & 4294967295L));
                u23 u23VarB = o23Var.b();
                ab1 ab1Var = u23VarB != null ? u23VarB.e : null;
                ab1 ab1Var2 = o23Var.f().b.j;
                if (ab1Var2 == null) {
                    c.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return;
                }
                if (u23VarB != null) {
                    wc1 wc1Var = u23VarB.c;
                    if (u23VarB.d() == z && ab1Var != null && ab1Var.t0() && ab1Var2.t0()) {
                        fG = ((Boolean) ((d42) wc1Var.c).getValue()).booleanValue() ? ((z32) wc1Var.d).g() : 1.0f;
                        if (((Boolean) ((d42) wc1Var.e).getValue()).booleanValue()) {
                            qw0Var = qw0Var2;
                            j = ((wj3) ((d42) wc1Var.f).getValue()).a;
                        } else {
                            qw0Var = qw0Var2;
                            j = wj3.b;
                        }
                        long jA2 = k23.a(ab1Var, ab1Var2, j);
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA2 >> 32));
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jA2 & 4294967295L));
                    } else {
                        qw0Var = qw0Var2;
                        fIntBitsToFloat = 0.0f;
                        fIntBitsToFloat2 = 0.0f;
                    }
                    float f = fG;
                    da daVar = o23Var.p;
                    pi piVar2 = rrVar.g;
                    pi piVar3 = rrVar.g;
                    ((yl1) piVar2.g).H(0.0f, 0.0f);
                    try {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                        try {
                            jA = piVar3.A();
                            piVar3.k().l();
                            piVar = piVar3;
                        } catch (Throwable th) {
                            th = th;
                            piVar = piVar3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        piVar = piVar3;
                    }
                    try {
                        try {
                            ((yl1) piVar.g).G(f, f, jFloatToRawIntBits);
                            if (daVar != null) {
                                jA = piVar.A();
                                piVar.k().l();
                                try {
                                    ((pi) ((yl1) piVar.g).g).k().s(daVar);
                                    ((yl1) piVar.g).H(fIntBitsToFloat3, fIntBitsToFloat4);
                                    try {
                                        lr.z(vb1Var, qw0Var);
                                    } finally {
                                    }
                                } finally {
                                    piVar.k().i();
                                    piVar.Q(jA);
                                }
                            } else {
                                qw0 qw0Var3 = qw0Var;
                                ((yl1) piVar.g).H(fIntBitsToFloat3, fIntBitsToFloat4);
                                try {
                                    lr.z(vb1Var, qw0Var3);
                                } finally {
                                }
                            }
                            ((yl1) piVar.g).H(-0.0f, -0.0f);
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        ((yl1) piVar.g).H(-0.0f, -0.0f);
                        throw th;
                    }
                }
            }
            i5++;
            z = true;
        }
    }

    @Override // defpackage.kb1
    public final dn1 t(en1 en1Var, xm1 xm1Var, long j) {
        i62 i62VarT = xm1Var.t(j);
        return en1Var.I0(i62VarT.f, i62VarT.g, oi0.f, new md(en1Var, this, i62VarT, 1));
    }
}
