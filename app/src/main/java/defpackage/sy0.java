package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sy0 {
    public int a;
    public float b;
    public final Object c;

    public sy0(ng3 ng3Var) {
        this.c = ng3Var;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ng3 ng3Var = (ng3) this.c;
        int i2 = 1;
        if (z) {
            int iF = ur.F(ng3Var.f, i, z);
            z4 = i == ng3Var.f.getLineStart(iF) || i == ng3Var.f(iF);
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.a == i4) {
            return this.b;
        }
        float fJ = z3 ? ng3Var.j(i, z) : ng3Var.k(i, z);
        if (z2) {
            this.a = i4;
            this.b = fJ;
        }
        return fJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, q40 q40Var) {
        yk2 yk2Var;
        if (q40Var instanceof yk2) {
            yk2Var = (yk2) q40Var;
            int i = yk2Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                yk2Var.k = i - Integer.MIN_VALUE;
            } else {
                yk2Var = new yk2(this, q40Var);
            }
        }
        Object objF = yk2Var.i;
        int i2 = yk2Var.k;
        if (i2 == 0) {
            y02.Q(objF);
            q10 q10Var = (q10) this.c;
            Float f2 = new Float(f);
            yk2Var.k = 1;
            objF = q10Var.f(f2, yk2Var);
            y50 y50Var = y50.f;
            if (objF == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objF);
        }
        this.b += ((Number) objF).floatValue();
        return dm3.a;
    }

    public sy0(int i, q10 q10Var) {
        this.a = i;
        this.c = q10Var;
    }
}
