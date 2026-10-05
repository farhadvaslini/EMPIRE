package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks2 {
    public static final is2 a = new is2();
    public static final ub0 b = new ub0(1);
    public static final j32 c = new j32(1);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ws2 ws2Var, long j, q40 q40Var) {
        js2 js2Var;
        nk2 nk2Var;
        ws2 ws2Var2;
        if (q40Var instanceof js2) {
            js2Var = (js2) q40Var;
            int i = js2Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                js2Var.l = i - Integer.MIN_VALUE;
            } else {
                js2Var = new js2(q40Var);
            }
        }
        Object obj = js2Var.k;
        int i2 = js2Var.l;
        if (i2 == 0) {
            y02.Q(obj);
            nk2Var = new nk2();
            m mVar = new m(ws2Var, j, nk2Var, (p40) null, 2);
            js2Var.i = ws2Var;
            js2Var.j = nk2Var;
            js2Var.l = 1;
            Object objG = ws2Var.g(ts1.f, mVar, js2Var);
            y50 y50Var = y50.f;
            if (objG == y50Var) {
                return y50Var;
            }
            ws2Var2 = ws2Var;
        } else {
            if (i2 != 1) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nk2 nk2Var2 = js2Var.j;
            ws2 ws2Var3 = js2Var.i;
            y02.Q(obj);
            nk2Var = nk2Var2;
            ws2Var2 = ws2Var3;
        }
        return new gy1(ws2Var2.i(nk2Var.f));
    }

    public static bq1 b(kf3 kf3Var, t02 t02Var, boolean z, boolean z2, qr1 qr1Var) {
        return new hs2(kf3Var, t02Var, z, z2, qr1Var);
    }
}
