package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m32 implements rm0 {
    public final o63 a;
    public final i32 b;

    public m32(o63 o63Var, i32 i32Var) {
        this.a = o63Var;
        this.b = i32Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.rm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ts2 ts2Var, float f, p40 p40Var) {
        l32 l32Var;
        if (p40Var instanceof l32) {
            l32Var = (l32) p40Var;
            int i = l32Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                l32Var.k = i - Integer.MIN_VALUE;
            } else {
                l32Var = new l32(this, (q40) p40Var);
            }
        }
        Object objD = l32Var.i;
        int i2 = l32Var.k;
        p40 p40Var2 = null;
        if (i2 == 0) {
            y02.Q(objD);
            xc1 xc1Var = new xc1(13, this, ts2Var);
            l32Var.k = 1;
            objD = this.a.d(ts2Var, f, xc1Var, l32Var);
            y50 y50Var = y50.f;
            if (objD == y50Var) {
                return y50Var;
            }
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y02.Q(objD);
        }
        float fFloatValue = ((Number) objD).floatValue();
        i32 i32Var = this.b;
        if (i32Var.l() != 0.0f && Math.abs(i32Var.l()) < 0.001d) {
            int iK = i32Var.k();
            if (i32Var.k.b()) {
                cl3.t(((y22) i32Var.m.getValue()).s, null, new s22(2, p40Var2, i32Var), 3);
            }
            i32Var.t(iK, 0.0f, false);
        } else {
            new Float(i32Var.l());
        }
        return new Float(fFloatValue);
    }
}
