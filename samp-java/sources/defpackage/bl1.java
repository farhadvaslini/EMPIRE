package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class bl1 extends h62 {
    public final /* synthetic */ int g;
    public final Object h;

    public /* synthetic */ bl1(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.h62
    public final int B() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((al1) obj).G0();
            default:
                return ((h7) obj).getRoot().M.p.f;
        }
    }

    @Override // defpackage.ua0
    public final float G() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((al1) obj).G();
            default:
                return ((h7) obj).getDensity().G();
        }
    }

    @Override // defpackage.ua0
    public final float h() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((al1) obj).h();
            default:
                return ((h7) obj).getDensity().h();
        }
    }

    @Override // defpackage.h62
    public float i(uy0 uy0Var) {
        ns0 ns0Var;
        int iV;
        t12 snapshotObserver;
        int iV2;
        switch (this.g) {
            case 0:
                rs0 rs0Var = uy0Var.a;
                if (rs0Var != null) {
                    return ((Number) rs0Var.f(this, Float.valueOf(Float.NaN))).floatValue();
                }
                al1 al1Var = (al1) this.h;
                if (al1Var.t) {
                    return Float.NaN;
                }
                qk2 qk2Var = new qk2();
                qk2Var.f = al1Var;
                while (true) {
                    yf yfVar = ((al1) qk2Var.f).v;
                    float f = (yfVar == null || (iV2 = uj.V((uy0[]) yfVar.b, uy0Var)) < 0) ? Float.NaN : ((float[]) yfVar.c)[iV2];
                    boolean zIsNaN = Float.isNaN(f);
                    Object obj = qk2Var.f;
                    if (!zIsNaN) {
                        ((al1) obj).N0(al1Var.Z0(), uy0Var);
                        return uy0Var.a(f, ((al1) qk2Var.f).V0(), al1Var.V0());
                    }
                    al1 al1Var2 = (al1) obj;
                    rs0 rs0Var2 = al1Var2.m;
                    if (rs0Var2 != null && (ns0Var = al1Var2.n) != null && ((Boolean) ns0Var.h(uy0Var)).booleanValue()) {
                        al1 al1Var3 = (al1) qk2Var.f;
                        is1 is1Var = al1Var3.p;
                        if (is1Var == null) {
                            long[] jArr = nr2.a;
                            is1Var = new is1();
                            al1Var3.p = is1Var;
                        }
                        Object objG = is1Var.g(uy0Var);
                        if (objG == null) {
                            objG = new k62(al1Var3.d1(), al1Var3, uy0Var);
                            is1Var.m(uy0Var, objG);
                        }
                        k62 k62Var = (k62) objG;
                        k62Var.f = al1Var3.d1();
                        q12 q12Var = al1Var.Z0().t;
                        if (q12Var != null && (snapshotObserver = ((h7) q12Var).getSnapshotObserver()) != null) {
                            snapshotObserver.a.d(k62Var, al1.y, new ok(rs0Var2, qk2Var, uy0Var, 11));
                        }
                        ((al1) qk2Var.f).N0(al1Var.Z0(), uy0Var);
                        yf yfVar2 = ((al1) qk2Var.f).v;
                        float f2 = (yfVar2 == null || (iV = uj.V((uy0[]) yfVar2.b, uy0Var)) < 0) ? Float.NaN : ((float[]) yfVar2.c)[iV];
                        if (!Float.isNaN(f2)) {
                            return uy0Var.a(f2, ((al1) qk2Var.f).V0(), al1Var.V0());
                        }
                    }
                    al1 al1VarE1 = ((al1) qk2Var.f).e1();
                    if (al1VarE1 == null) {
                        ((al1) qk2Var.f).N0(al1Var.Z0(), uy0Var);
                        return Float.NaN;
                    }
                    qk2Var.f = al1VarE1;
                }
                break;
            default:
                return super.i(uy0Var);
        }
    }

    @Override // defpackage.h62
    public final ab1 t() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                al1 al1Var = (al1) obj;
                ab1 ab1VarV0 = al1Var.t ? null : al1Var.V0();
                if (ab1VarV0 == null) {
                    al1Var.Z0().M.b();
                }
                return ab1VarV0;
            default:
                return ((h7) obj).getRoot().L.d;
        }
    }

    @Override // defpackage.h62
    public final bb1 y() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                return ((al1) obj).getLayoutDirection();
            default:
                return ((h7) obj).getLayoutDirection();
        }
    }
}
