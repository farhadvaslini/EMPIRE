package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pe2 implements ss0 {
    public final /* synthetic */ long f;
    public final /* synthetic */ af2 g;

    public pe2(long j, af2 af2Var) {
        this.f = j;
        this.g = af2Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        nv0 nv0Var = (nv0) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= nv0Var.g(zBooleanValue) ? 4 : 2;
        }
        if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
            nv0Var.U();
        } else if (zBooleanValue) {
            nv0Var.a0(-499784343);
            xd2.a(j43.k(yp1.a, 16.0f), this.f, 2.5f, 0L, 0, 0.0f, nv0Var, 390, 56);
            nv0Var.p(false);
        } else {
            nv0Var.a0(-499540745);
            final af2 af2Var = this.g;
            boolean zF = nv0Var.f(af2Var);
            Object objO = nv0Var.O();
            if (zF || objO == c20.a) {
                objO = new ym0() { // from class: oe2
                    @Override // defpackage.ym0
                    public final float a() {
                        return ((Number) af2Var.a.d()).floatValue();
                    }
                };
                nv0Var.j0(objO);
            }
            t22.d((ym0) objO, this.f, nv0Var, 0);
            nv0Var.p(false);
        }
        return dm3.a;
    }
}
