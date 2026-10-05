package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ms2 implements dw1 {
    public final ws2 f;
    public boolean g;

    public ms2(ws2 ws2Var, boolean z) {
        this.f = ws2Var;
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.dw1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J0(long j, long j2, p40 p40Var) throws Throwable {
        ls2 ls2Var;
        long jD;
        if (p40Var instanceof ls2) {
            ls2Var = (ls2) p40Var;
            int i = ls2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ls2Var.l = i - Integer.MIN_VALUE;
            } else {
                ls2Var = new ls2(this, (q40) p40Var);
            }
        }
        Object objA = ls2Var.j;
        int i2 = ls2Var.l;
        if (i2 == 0) {
            y02.Q(objA);
            jD = 0;
            if (this.g) {
                ws2 ws2Var = this.f;
                if (!ws2Var.i) {
                    ls2Var.i = j2;
                    ls2Var.l = 1;
                    objA = ws2Var.a(j2, ls2Var);
                    y50 y50Var = y50.f;
                    if (objA == y50Var) {
                        return y50Var;
                    }
                }
                jD = lp3.d(j2, jD);
            }
            return new lp3(jD);
        }
        if (i2 != 1) {
            c.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = ls2Var.i;
        y02.Q(objA);
        jD = ((lp3) objA).a;
        jD = lp3.d(j2, jD);
        return new lp3(jD);
    }

    @Override // defpackage.dw1
    public final long l0(long j, int i, long j2) {
        if (!this.g) {
            return 0L;
        }
        ws2 ws2Var = this.f;
        if (ws2Var.a.b()) {
            return 0L;
        }
        return ws2Var.i(ws2Var.e(ws2Var.a.e(ws2Var.e(ws2Var.h(j2)))));
    }
}
