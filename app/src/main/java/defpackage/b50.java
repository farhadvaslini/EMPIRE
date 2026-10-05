package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b50 implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sf3 g;

    public /* synthetic */ b50(sf3 sf3Var, int i) {
        this.f = i;
        this.g = sf3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0122  */
    @Override // defpackage.ns0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj) {
        jk2 jk2Var;
        ab1 ab1VarC;
        char c;
        long j;
        float fIntBitsToFloat;
        ab1 ab1VarC2;
        ab1 ab1VarC3;
        ab1 ab1VarC4;
        ab1 ab1VarC5;
        int i = this.f;
        sf3 sf3Var = this.g;
        switch (i) {
            case 0:
                return new c4(7, sf3Var);
            case 1:
                sf3Var.r();
                return dm3.a;
            default:
                ab1 ab1Var = (ab1) obj;
                ye1 ye1Var = sf3Var.d;
                jk2 jk2Var2 = jk2.e;
                if (ye1Var == null) {
                    jk2Var = jk2Var2;
                } else {
                    if (ye1Var.p) {
                        ye1Var = null;
                    }
                    if (ye1Var != null) {
                        iy1 iy1Var = sf3Var.b;
                        long j2 = sf3Var.n().b;
                        int i2 = yg3.c;
                        int iR = iy1Var.r((int) (j2 >> 32));
                        int iR2 = sf3Var.b.r((int) (sf3Var.n().b & 4294967295L));
                        ye1 ye1Var2 = sf3Var.d;
                        long jK0 = 0;
                        long jK02 = (ye1Var2 == null || (ab1VarC5 = ye1Var2.c()) == null) ? 0L : ab1VarC5.k0(sf3Var.l(true));
                        ye1 ye1Var3 = sf3Var.d;
                        if (ye1Var3 != null && (ab1VarC4 = ye1Var3.c()) != null) {
                            jK0 = ab1VarC4.k0(sf3Var.l(false));
                        }
                        ye1 ye1Var4 = sf3Var.d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (ye1Var4 == null || (ab1VarC3 = ye1Var4.c()) == null) {
                            c = ' ';
                            j = jK0;
                            fIntBitsToFloat = 0.0f;
                        } else {
                            qg3 qg3VarD = ye1Var.d();
                            c = ' ';
                            j = jK0;
                            fIntBitsToFloat = Float.intBitsToFloat((int) (ab1VarC3.k0((((long) Float.floatToRawIntBits(qg3VarD != null ? qg3VarD.a.c(iR).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                        }
                        ye1 ye1Var5 = sf3Var.d;
                        if (ye1Var5 != null && (ab1VarC2 = ye1Var5.c()) != null) {
                            qg3 qg3VarD2 = ye1Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (ab1VarC2.k0((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(qg3VarD2 != null ? qg3VarD2.a.c(iR2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i3 = (int) (jK02 >> c);
                        int i4 = (int) (j >> c);
                        jk2Var = new jk2(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), (((ua0) ye1Var.a.d).h() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jK02 & 4294967295L)), Float.intBitsToFloat((int) (j & 4294967295L))));
                    }
                }
                ye1 ye1Var6 = sf3Var.d;
                if (ye1Var6 == null || (ab1VarC = ye1Var6.c()) == null) {
                    return null;
                }
                return (ab1VarC.t0() && ab1Var.t0()) ? b32.b(ab1Var.V(vr.y(ab1VarC).i(jk2Var.d())), jk2Var.c()) : jk2Var2;
        }
    }
}
