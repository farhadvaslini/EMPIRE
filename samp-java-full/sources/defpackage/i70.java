package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class i70 {
    public final /* synthetic */ bt1 a;
    public final /* synthetic */ mk2 b;
    public final /* synthetic */ qk2 c;
    public final /* synthetic */ b80 d;

    public i70(bt1 bt1Var, mk2 mk2Var, qk2 qk2Var, b80 b80Var) {
        this.a = bt1Var;
        this.b = mk2Var;
        this.c = qk2Var;
        this.d = b80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:21:0x004e, B:35:0x00aa, B:37:0x00b2), top: B:53:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(m9 m9Var, q40 q40Var) throws Throwable {
        h70 h70Var;
        mk2 mk2Var;
        qk2 qk2Var;
        b80 b80Var;
        bt1 bt1Var;
        rs0 rs0Var;
        bt1 bt1Var2;
        bt1 bt1Var3;
        qk2 qk2Var2;
        Object obj;
        bt1 bt1Var4;
        if (q40Var instanceof h70) {
            h70Var = (h70) q40Var;
            int i = h70Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                h70Var.p = i - Integer.MIN_VALUE;
            } else {
                h70Var = new h70(this, q40Var);
            }
        }
        Object obj2 = h70Var.n;
        int i2 = h70Var.p;
        y50 y50Var = y50.f;
        try {
            if (i2 == 0) {
                y02.Q(obj2);
                h70Var.i = m9Var;
                bt1 bt1Var5 = this.a;
                h70Var.j = bt1Var5;
                mk2Var = this.b;
                h70Var.k = mk2Var;
                qk2Var = this.c;
                h70Var.l = qk2Var;
                b80Var = this.d;
                h70Var.m = b80Var;
                h70Var.p = 1;
                dt1 dt1Var = (dt1) bt1Var5;
                Object objF = dt1Var.f(h70Var);
                rs0Var = m9Var;
                bt1Var = dt1Var;
                if (objF != y50Var) {
                }
                return y50Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = h70Var.k;
                    qk2Var2 = (qk2) h70Var.j;
                    bt1Var2 = (bt1) h70Var.i;
                    try {
                        y02.Q(obj2);
                        bt1Var4 = bt1Var2;
                        qk2Var2.f = obj;
                        bt1Var2 = bt1Var4;
                        Object obj3 = qk2Var2.f;
                        ((dt1) bt1Var2).i(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((dt1) bt1Var2).i(null);
                        throw th;
                    }
                }
                b80Var = (b80) h70Var.k;
                qk2Var2 = (qk2) h70Var.j;
                bt1Var3 = (bt1) h70Var.i;
                try {
                    y02.Q(obj2);
                    bt1Var3 = bt1Var3;
                    if (!s51.n(obj2, qk2Var2.f)) {
                        bt1Var2 = bt1Var3;
                        Object obj32 = qk2Var2.f;
                        ((dt1) bt1Var2).i(null);
                        return obj32;
                    }
                    h70Var.i = bt1Var3;
                    h70Var.j = qk2Var2;
                    h70Var.k = obj2;
                    h70Var.p = 3;
                    if (b80Var.k(obj2, false, h70Var) != y50Var) {
                        obj = obj2;
                        bt1Var4 = bt1Var3;
                        qk2Var2.f = obj;
                        bt1Var2 = bt1Var4;
                        Object obj322 = qk2Var2.f;
                        ((dt1) bt1Var2).i(null);
                        return obj322;
                    }
                    return y50Var;
                } catch (Throwable th2) {
                    th = th2;
                    bt1Var2 = bt1Var3;
                    ((dt1) bt1Var2).i(null);
                    throw th;
                }
            }
            b80Var = h70Var.m;
            qk2 qk2Var3 = h70Var.l;
            mk2Var = (mk2) h70Var.k;
            bt1 bt1Var6 = (bt1) h70Var.j;
            rs0 rs0Var2 = (rs0) h70Var.i;
            y02.Q(obj2);
            qk2Var = qk2Var3;
            rs0Var = rs0Var2;
            bt1Var = bt1Var6;
            if (mk2Var.f) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj4 = qk2Var.f;
            h70Var.i = bt1Var;
            h70Var.j = qk2Var;
            h70Var.k = b80Var;
            h70Var.l = null;
            h70Var.m = null;
            h70Var.p = 2;
            Object objF2 = rs0Var.f(obj4, h70Var);
            if (objF2 != y50Var) {
                bt1Var3 = bt1Var;
                obj2 = objF2;
                qk2Var2 = qk2Var;
                if (!s51.n(obj2, qk2Var2.f)) {
                }
            }
            return y50Var;
        } catch (Throwable th3) {
            th = th3;
            bt1Var2 = bt1Var;
            ((dt1) bt1Var2).i(null);
            throw th;
        }
    }
}
