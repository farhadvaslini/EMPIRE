package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class pc0 implements gn0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ gn0 g;
    public final /* synthetic */ qk2 h;

    public pc0(qc0 qc0Var, qk2 qk2Var, gn0 gn0Var) {
        this.h = qk2Var;
        this.g = gn0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) {
        oc0 oc0Var;
        tn0 tn0Var;
        int i = this.f;
        qk2 qk2Var = this.h;
        Object obj2 = dm3.a;
        gn0 gn0Var = this.g;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                if (p40Var instanceof oc0) {
                    oc0Var = (oc0) p40Var;
                    int i2 = oc0Var.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        oc0Var.k = i2 - Integer.MIN_VALUE;
                    } else {
                        oc0Var = new oc0(this, p40Var);
                    }
                }
                Object obj3 = oc0Var.i;
                int i3 = oc0Var.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        y02.Q(obj3);
                        return obj2;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj3);
                Object obj4 = qk2Var.f;
                if (obj4 != vm1.b0 && s51.n(obj4, obj)) {
                    return obj2;
                }
                qk2Var.f = obj;
                oc0Var.k = 1;
                return gn0Var.k(obj, oc0Var) == y50Var ? y50Var : obj2;
            default:
                if (p40Var instanceof tn0) {
                    tn0Var = (tn0) p40Var;
                    int i4 = tn0Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        tn0Var.k = i4 - Integer.MIN_VALUE;
                    } else {
                        tn0Var = new tn0(this, p40Var);
                    }
                }
                Object obj5 = tn0Var.i;
                int i5 = tn0Var.k;
                try {
                    if (i5 == 0) {
                        y02.Q(obj5);
                        tn0Var.k = 1;
                        if (gn0Var.k(obj, tn0Var) == y50Var) {
                            obj2 = y50Var;
                        }
                    } else {
                        if (i5 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj5);
                    }
                    return obj2;
                } catch (Throwable th) {
                    qk2Var.f = th;
                    throw th;
                }
        }
    }

    public pc0(gn0 gn0Var, qk2 qk2Var) {
        this.g = gn0Var;
        this.h = qk2Var;
    }
}
