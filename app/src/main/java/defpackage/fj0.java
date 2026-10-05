package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fj0 extends u71 implements ns0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ hj0 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj0(hj0 hj0Var, long j, int i) {
        super(1);
        this.g = i;
        this.h = hj0Var;
        this.i = j;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        ns0 ns0Var;
        ns0 ns0Var2;
        ns0 ns0Var3;
        ns0 ns0Var4;
        int iOrdinal;
        int i = this.g;
        long j = this.i;
        long jB = 0;
        hj0 hj0Var = this.h;
        switch (i) {
            case 0:
                int iOrdinal2 = ((ti0) obj).ordinal();
                if (iOrdinal2 == 0) {
                    hs hsVar = hj0Var.y.a.c;
                    if (hsVar != null && (ns0Var = hsVar.b) != null) {
                        j = ((p41) ns0Var.h(new p41(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        c.k();
                        return null;
                    }
                    hs hsVar2 = hj0Var.z.a.c;
                    if (hsVar2 != null && (ns0Var2 = hsVar2.b) != null) {
                        j = ((p41) ns0Var2.h(new p41(j))).a;
                    }
                }
                return new p41(j);
            case 1:
                ti0 ti0Var = (ti0) obj;
                if (ti0Var == ti0.h && hj0Var.z.a.b == null) {
                    jB = hj0Var.A.j;
                } else {
                    q43 q43Var = hj0Var.y.a.b;
                    long j2 = (q43Var == null || (ns0Var4 = q43Var.a) == null) ? 0L : ((i41) ns0Var4.h(new p41(j))).a;
                    q43 q43Var2 = hj0Var.z.a.b;
                    long j3 = (q43Var2 == null || (ns0Var3 = q43Var2.a) == null) ? 0L : ((i41) ns0Var3.h(new p41(j))).a;
                    int iOrdinal3 = ti0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jB = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            c.k();
                            return null;
                        }
                        jB = j3;
                    }
                }
                return new i41(jB);
            default:
                ti0 ti0Var2 = (ti0) obj;
                if (hj0Var.E != null && hj0Var.r1() != null && !s51.n(hj0Var.E, hj0Var.r1()) && (iOrdinal = ti0Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        c.k();
                        return null;
                    }
                    hs hsVar3 = hj0Var.z.a.c;
                    if (hsVar3 != null) {
                        ns0 ns0Var5 = hsVar3.b;
                        long j4 = this.i;
                        long j5 = ((p41) ns0Var5.h(new p41(j4))).a;
                        h5 h5VarR1 = hj0Var.r1();
                        h5VarR1.getClass();
                        bb1 bb1Var = bb1.f;
                        long jA = h5VarR1.a(j4, j5, bb1Var);
                        h5 h5Var = hj0Var.E;
                        h5Var.getClass();
                        jB = i41.b(jA, h5Var.a(j4, j5, bb1Var));
                    }
                }
                return new i41(jB);
        }
    }
}
