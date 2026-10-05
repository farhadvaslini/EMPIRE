package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class o22 implements zo {
    public final i32 b;
    public final zo c;
    public final bb1 d;

    public o22(i32 i32Var, zo zoVar, bb1 bb1Var) {
        this.b = i32Var;
        this.c = zoVar;
        this.d = bb1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    @Override // defpackage.zo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3) {
        int iP;
        int iP2;
        int iP3;
        float fA = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            jk2 jk2Var = mr3.a;
            if (f4 <= 1.0f) {
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fA);
        bb1 bb1Var = bb1.g;
        t02 t02Var = t02.g;
        bb1 bb1Var2 = this.d;
        i32 i32Var = this.b;
        if (fAbs != 0.0f && z) {
            if (bb1Var2 == bb1Var && i32Var.m().e == t02Var) {
                iP3 = i32Var.p() + (-i32Var.f);
            } else {
                iP3 = i32Var.f;
            }
            float fP = iP3 * (-1.0f);
            while (fA > 0.0f && fP < fA) {
                fP += i32Var.p();
            }
            while (fA < 0.0f && fP > fA) {
                fP -= i32Var.p();
            }
            return fP;
        }
        int i = i32Var.f;
        d42 d42Var = i32Var.D;
        if (Math.abs(i) < 1.0E-6d) {
            return 0.0f;
        }
        if (bb1Var2 == bb1Var && i32Var.m().e == t02Var) {
            iP = i32Var.p() + (-i32Var.f);
        } else {
            iP = i32Var.f;
        }
        float f5 = iP * (-1.0f);
        if (bb1Var2 == bb1Var && i32Var.m().e == t02Var) {
            if (!((Boolean) d42Var.getValue()).booleanValue()) {
                iP2 = i32Var.p();
                f5 += iP2;
            }
        } else if (((Boolean) d42Var.getValue()).booleanValue()) {
            iP2 = i32Var.p();
            f5 += iP2;
        }
        return y02.g(f5, -f3, f3);
    }
}
