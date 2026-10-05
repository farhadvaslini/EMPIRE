package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ns extends ls {
    public final fn0 i;

    public ns(fn0 fn0Var, o50 o50Var, int i, jp jpVar) {
        super(o50Var, i, jpVar);
        this.i = fn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    @Override // defpackage.ls, defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gn0 gn0Var, p40 p40Var) throws Throwable {
        int i = this.g;
        y50 y50Var = y50.f;
        if (i == -3) {
            o50 o50VarI = p40Var.i();
            Boolean bool = Boolean.FALSE;
            z00 z00Var = new z00(14, (byte) 0);
            o50 o50Var = this.f;
            o50 o50VarK = !((Boolean) o50Var.p(z00Var, bool)).booleanValue() ? o50VarI.k(o50Var) : uq.p(o50VarI, o50Var, false);
            if (s51.n(o50VarK, o50VarI)) {
                Object objH = h(gn0Var, p40Var);
                if (objH == y50Var) {
                    return objH;
                }
            } else {
                f5 f5Var = f5.L;
                if (s51.n(o50VarK.m(f5Var), o50VarI.m(f5Var))) {
                    o50 o50VarI2 = p40Var.i();
                    if (!(gn0Var instanceof mv2) && !(gn0Var instanceof px1)) {
                        gn0Var = new u5(gn0Var, o50VarI2);
                    }
                    Object objN = br.N(o50VarK, gn0Var, cl3.D(o50VarK), new j(this, null, 9), p40Var);
                    if (objN == y50Var) {
                        return objN;
                    }
                } else {
                    Object objA = super.a(gn0Var, p40Var);
                    if (objA == y50Var) {
                        return objA;
                    }
                }
            }
        }
        return dm3.a;
    }

    @Override // defpackage.ls
    public final Object d(kd2 kd2Var, p40 p40Var) {
        Object objH = h(new mv2(kd2Var), p40Var);
        return objH == y50.f ? objH : dm3.a;
    }

    public abstract Object h(gn0 gn0Var, p40 p40Var);

    @Override // defpackage.ls
    public final String toString() {
        return this.i + " -> " + super.toString();
    }
}
