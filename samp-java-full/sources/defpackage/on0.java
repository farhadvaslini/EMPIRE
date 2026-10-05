package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class on0 implements fn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fn0 g;
    public final /* synthetic */ ss0 h;

    public /* synthetic */ on0(fn0 fn0Var, ss0 ss0Var, int i) {
        this.f = i;
        this.g = fn0Var;
        this.h = ss0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gn0 gn0Var, p40 p40Var) {
        nn0 nn0Var;
        kp2 kp2Var;
        kp2 kp2Var2;
        rn0 rn0Var;
        gn0 gn0Var2 = gn0Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        ss0 ss0Var = this.h;
        fn0 fn0Var = this.g;
        int i2 = 0;
        Object obj = y50.f;
        switch (i) {
            case 0:
                if (p40Var instanceof nn0) {
                    nn0Var = (nn0) p40Var;
                    int i3 = nn0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nn0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        nn0Var = new nn0(this, p40Var);
                    }
                }
                Object obj2 = nn0Var.i;
                int i4 = nn0Var.j;
                try {
                } catch (Throwable th) {
                    xh3 xh3Var = new xh3(th);
                    nn0Var.l = null;
                    nn0Var.m = th;
                    nn0Var.n = i2;
                    nn0Var.j = 2;
                    if (vr.i(xh3Var, ss0Var, th, nn0Var) != obj) {
                        throw th;
                    }
                }
                try {
                    if (i4 == 0) {
                        y02.Q(obj2);
                        nn0Var.l = gn0Var2;
                        nn0Var.n = 0;
                        nn0Var.j = 1;
                        if (fn0Var.a(gn0Var2, nn0Var) != obj) {
                        }
                        return obj;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Throwable th2 = (Throwable) nn0Var.m;
                            y02.Q(obj2);
                            throw th2;
                        }
                        if (i4 != 3) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kp2Var2 = (kp2) nn0Var.m;
                        try {
                            y02.Q(obj2);
                            kp2Var2.p();
                            return dm3Var;
                        } catch (Throwable th3) {
                            th = th3;
                            kp2Var2.p();
                            throw th;
                        }
                    }
                    i2 = nn0Var.n;
                    gn0Var2 = nn0Var.l;
                    y02.Q(obj2);
                    nn0Var.l = null;
                    nn0Var.m = kp2Var;
                    nn0Var.n = i2;
                    nn0Var.j = 3;
                    if (ss0Var.e(kp2Var, null, nn0Var) != obj) {
                        kp2Var2 = kp2Var;
                        kp2Var2.p();
                        return dm3Var;
                    }
                    return obj;
                } catch (Throwable th4) {
                    th = th4;
                    kp2Var2 = kp2Var;
                    kp2Var2.p();
                    throw th;
                }
                o50 o50Var = nn0Var.g;
                o50Var.getClass();
                kp2Var = new kp2(gn0Var2, o50Var);
            default:
                if (p40Var instanceof rn0) {
                    rn0Var = (rn0) p40Var;
                    int i5 = rn0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rn0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rn0Var = new rn0(this, p40Var);
                    }
                }
                Object objP = rn0Var.i;
                int i6 = rn0Var.j;
                if (i6 == 0) {
                    y02.Q(objP);
                    rn0Var.l = gn0Var2;
                    rn0Var.m = 0;
                    rn0Var.j = 1;
                    objP = lr.p(fn0Var, gn0Var2, rn0Var);
                    if (objP != obj) {
                    }
                    return obj;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        y02.Q(objP);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = rn0Var.m;
                gn0Var2 = rn0Var.l;
                y02.Q(objP);
                Throwable th5 = (Throwable) objP;
                if (th5 == null) {
                    return dm3Var;
                }
                rn0Var.l = null;
                rn0Var.m = i2;
                rn0Var.j = 2;
                if (ss0Var.e(gn0Var2, th5, rn0Var) != obj) {
                    return dm3Var;
                }
                return obj;
        }
    }
}
