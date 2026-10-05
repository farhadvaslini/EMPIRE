package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class h23 extends u71 implements ns0 {
    public final /* synthetic */ int g = 0;
    public final /* synthetic */ i62 h;
    public final /* synthetic */ i23 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h23(i23 i23Var, i62 i62Var) {
        super(1);
        this.i = i23Var;
        this.h = i62Var;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        ab1 ab1Var;
        float f;
        long j;
        long jB;
        ab1 ab1VarT;
        int i = this.g;
        dm3 dm3Var = dm3.a;
        i23 i23Var = this.i;
        i62 i62Var = this.h;
        switch (i) {
            case 0:
                h62 h62Var = (h62) obj;
                i23Var.w = true;
                i23Var.v = null;
                k33 k33VarA = i23Var.x.f().c.a();
                if (!i23Var.x.k()) {
                    h62Var.C(i62Var, 0, 0, 0.0f);
                } else if (!k33VarA.d()) {
                    h62Var.C(i62Var, 0, 0, 0.0f);
                } else {
                    pl plVarE = k33VarA.e();
                    if (plVarE != null) {
                        jk2 jk2VarC = k33VarA.c();
                        if (jk2VarC == null) {
                            qn1.n(k33VarA, "Match State is configured, but current bounds is null. State = ");
                        } else if (i23Var.x.f().b.a()) {
                            ab1 ab1VarT2 = h62Var.t();
                            if (ab1VarT2 != null) {
                                boolean zB = i23Var.x.f().c.a().b();
                                long jO = i23Var.r1().O(ab1VarT2, 0L);
                                w22.w(plVarE);
                                o23 o23Var = i23Var.x;
                                if (zB) {
                                    ab1Var = ab1VarT2;
                                    f = 0.0f;
                                    j = jO;
                                    o23Var.c().a(jk2VarC, w22.w(plVarE), null, i23Var.t, i23Var.u);
                                } else {
                                    f = 0.0f;
                                    ab1Var = ab1VarT2;
                                    j = jO;
                                    o23Var.c().a(jk2VarC, w22.w(plVarE), new r03(2), i23Var.t, i23Var.u);
                                }
                                i23Var.t = null;
                                i23Var.u = null;
                                jk2 jk2VarC2 = i23Var.x.c().c();
                                gy1 gy1Var = jk2VarC2 != null ? new gy1(gy1.e(gy1.d(jk2VarC2.d(), ((gy1) ((d42) plVarE.h).getValue()).a), ((gy1) ((d42) plVarE.j).getValue()).a)) : null;
                                if (i23Var.x.c().b() || !zB) {
                                    jB = gy1Var != null ? gy1Var.a : j;
                                    i23Var.x.f().c.a().i(gy1Var == null ? b32.b(j, lr.T(ab1Var.i0())) : b32.b(gy1Var.a, jk2VarC2.c()));
                                } else {
                                    jB = gy1Var != null ? gy1Var.a : jk2VarC.d();
                                }
                                u23 u23VarB = i23Var.x.b();
                                if (u23VarB != null) {
                                    wc1 wc1Var = u23VarB.c;
                                    if (u23VarB.d()) {
                                        if (i23Var.x.c().d()) {
                                            j = jB;
                                        }
                                        ab1 ab1Var2 = u23VarB.e;
                                        if (ab1Var2 != null && ab1Var2.t0() && i23Var.r1().t0()) {
                                            float fG = ((Boolean) ((d42) wc1Var.c).getValue()).booleanValue() ? ((z32) wc1Var.d).g() : 1.0f;
                                            wc1Var.getClass();
                                            jB = k23.b(jB, k23.a(ab1Var2, i23Var.r1(), ((Boolean) ((d42) wc1Var.e).getValue()).booleanValue() ? ((wj3) ((d42) wc1Var.f).getValue()).a : wj3.b), fG);
                                        } else {
                                            jB = j;
                                        }
                                    }
                                }
                                long jO2 = ab1Var.O(i23Var.r1(), jB);
                                h62Var.C(i62Var, Math.round(Float.intBitsToFloat((int) (jO2 >> 32))), Math.round(Float.intBitsToFloat((int) (jO2 & 4294967295L))), f);
                            } else {
                                h62Var.C(i62Var, 0, 0, 0.0f);
                            }
                        } else if (!i23Var.x.c().b()) {
                            ab1 ab1VarT3 = h62Var.t();
                            long jH = ab1VarT3 != null ? uq.H(gy1.d(jk2VarC.d(), i23Var.r1().O(ab1VarT3, 0L))) : 0L;
                            h62Var.C(i62Var, (int) (jH >> 32), (int) (jH & 4294967295L), 0.0f);
                        } else {
                            h62Var.C(i62Var, 0, 0, 0.0f);
                        }
                    } else {
                        qn1.n(k33VarA, "Match State is configured, but target data is null. State = ");
                    }
                }
                break;
            default:
                h62 h62Var2 = (h62) obj;
                h62Var2.C(i62Var, 0, 0, 0.0f);
                m23 m23VarF = i23Var.x.f();
                o23 o23Var2 = i23Var.x;
                l33 l33Var = m23VarF.c;
                l33Var.c();
                if (!s51.n(l33Var.a(), vw1.a) && o23Var2.k()) {
                    k33 k33VarA2 = l33Var.a();
                    if (o23Var2.c().b() && k33VarA2.b() && (ab1VarT = h62Var2.t()) != null) {
                        long jT = lr.T(ab1VarT.i0());
                        c33 c33Var = o23Var2.f().b;
                        ab1 ab1Var3 = o23Var2.f().b.k;
                        if (ab1Var3 != null) {
                            long jI = c33Var.f.i(ab1Var3, ab1VarT);
                            c33 c33Var2 = o23Var2.f().b;
                            ab1 ab1Var4 = o23Var2.f().b.k;
                            if (ab1Var4 != null) {
                                long jL0 = ab1Var4.l0(ab1VarT, 0L, (6 & 4) != 0);
                                k33 k33VarA3 = l33Var.a();
                                m23 m23Var = l33Var.a;
                                i23 i23Var2 = l33Var.f;
                                i23Var2.getClass();
                                l33Var.b.setValue(k33VarA3.a(m23Var, i23Var2, jT, jI, jL0));
                            } else {
                                c.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                            }
                        } else {
                            c.p("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        break;
                    }
                }
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h23(i62 i62Var, i23 i23Var) {
        super(1);
        this.h = i62Var;
        this.i = i23Var;
    }
}
