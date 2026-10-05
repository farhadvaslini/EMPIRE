package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qn0 implements fn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qn0(int i, Object obj, Object obj2) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gn0 gn0Var, p40 p40Var) {
        pn0 pn0Var;
        kp2 kp2Var;
        Throwable th;
        gn0 gn0Var2;
        wn0 wn0Var;
        yn0 yn0Var;
        d e;
        gk1 gk1Var;
        ef2 ef2Var;
        bh2 bh2Var;
        rx2 rx2Var;
        int i = this.f;
        int i2 = 0;
        dm3 dm3Var = dm3.a;
        Object obj = this.h;
        Object obj2 = this.g;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                if (p40Var instanceof pn0) {
                    pn0Var = (pn0) p40Var;
                    int i3 = pn0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        pn0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        pn0Var = new pn0(this, p40Var);
                    }
                }
                Object obj3 = pn0Var.i;
                int i4 = pn0Var.j;
                if (i4 == 0) {
                    y02.Q(obj3);
                    o50 o50Var = pn0Var.g;
                    o50Var.getClass();
                    kp2 kp2Var2 = new kp2(gn0Var, o50Var);
                    try {
                        pn0Var.l = gn0Var;
                        pn0Var.m = kp2Var2;
                        pn0Var.n = 0;
                        pn0Var.j = 1;
                        if (((k70) obj2).f(kp2Var2, pn0Var) != y50Var) {
                            gn0Var2 = gn0Var;
                            kp2Var = kp2Var2;
                            kp2Var.p();
                            pn0Var.l = null;
                            pn0Var.m = null;
                            pn0Var.n = i2;
                            pn0Var.j = 2;
                            if (((fn0) obj).a(gn0Var2, pn0Var) != y50Var) {
                            }
                        }
                    } catch (Throwable th2) {
                        kp2Var = kp2Var2;
                        th = th2;
                        kp2Var.p();
                        throw th;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            y02.Q(obj3);
                            return dm3Var;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = pn0Var.n;
                    kp2Var = pn0Var.m;
                    gn0Var2 = pn0Var.l;
                    try {
                        y02.Q(obj3);
                        kp2Var.p();
                        pn0Var.l = null;
                        pn0Var.m = null;
                        pn0Var.n = i2;
                        pn0Var.j = 2;
                        if (((fn0) obj).a(gn0Var2, pn0Var) != y50Var) {
                            return dm3Var;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        kp2Var.p();
                        throw th;
                    }
                }
                return y50Var;
            case 1:
                if (p40Var instanceof wn0) {
                    wn0Var = (wn0) p40Var;
                    int i5 = wn0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        wn0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        wn0Var = new wn0(this, p40Var);
                    }
                }
                Object obj4 = wn0Var.i;
                int i6 = wn0Var.j;
                if (i6 == 0) {
                    y02.Q(obj4);
                    qn0 qn0Var = (qn0) obj2;
                    yn0 yn0Var2 = new yn0(i2, (l70) obj, gn0Var);
                    try {
                        wn0Var.l = yn0Var2;
                        wn0Var.j = 1;
                        return qn0Var.a(yn0Var2, wn0Var) == y50Var ? y50Var : dm3Var;
                    } catch (d e2) {
                        yn0Var = yn0Var2;
                        e = e2;
                    }
                } else {
                    if (i6 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yn0Var = wn0Var.l;
                    try {
                        y02.Q(obj4);
                        return dm3Var;
                    } catch (d e3) {
                        e = e3;
                    }
                }
                if (e.f != yn0Var) {
                    throw e;
                }
                o50 o50Var2 = wn0Var.g;
                o50Var2.getClass();
                lq.r(o50Var2);
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                Object objM = uq.m(p40Var, gn0Var, gk.i, new zn0(null, (na1) obj), (fn0[]) obj2);
                return objM == y50Var ? objM : dm3Var;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                if (p40Var instanceof gk1) {
                    gk1Var = (gk1) p40Var;
                    int i7 = gk1Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        gk1Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        gk1Var = new gk1(this, p40Var);
                    }
                }
                Object obj5 = gk1Var.i;
                int i8 = gk1Var.j;
                if (i8 == 0) {
                    y02.Q(obj5);
                    yn0 yn0Var3 = new yn0(gn0Var, (os1) obj, 6);
                    gk1Var.j = 1;
                    return ((p70) obj2).a(yn0Var3, gk1Var) == y50Var ? y50Var : dm3Var;
                }
                if (i8 == 1) {
                    y02.Q(obj5);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                Object objA = ((fn0) obj).a(new yn0(gn0Var, (nm1) obj2, 7), p40Var);
                return objA == y50Var ? objA : dm3Var;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                if (p40Var instanceof ef2) {
                    ef2Var = (ef2) p40Var;
                    int i9 = ef2Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ef2Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        ef2Var = new ef2(this, p40Var);
                    }
                }
                Object obj6 = ef2Var.i;
                int i10 = ef2Var.j;
                if (i10 == 0) {
                    y02.Q(obj6);
                    yn0 yn0Var4 = new yn0(gn0Var, (String) obj2, 9);
                    ef2Var.j = 1;
                    return ((fn0) obj).a(yn0Var4, ef2Var) == y50Var ? y50Var : dm3Var;
                }
                if (i10 == 1) {
                    y02.Q(obj6);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                if (p40Var instanceof bh2) {
                    bh2Var = (bh2) p40Var;
                    int i11 = bh2Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        bh2Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        bh2Var = new bh2(this, p40Var);
                    }
                }
                Object obj7 = bh2Var.i;
                int i12 = bh2Var.j;
                if (i12 == 0) {
                    y02.Q(obj7);
                    yn0 yn0Var5 = new yn0(gn0Var, (vg2) obj2, 10);
                    bh2Var.j = 1;
                    return ((fn0) obj).a(yn0Var5, bh2Var) == y50Var ? y50Var : dm3Var;
                }
                if (i12 == 1) {
                    y02.Q(obj7);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (p40Var instanceof rx2) {
                    rx2Var = (rx2) p40Var;
                    int i13 = rx2Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        rx2Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        rx2Var = new rx2(this, p40Var);
                    }
                }
                Object obj8 = rx2Var.i;
                int i14 = rx2Var.j;
                if (i14 == 0) {
                    y02.Q(obj8);
                    ex2 ex2Var = new ex2(gn0Var, (qy2) obj, 1);
                    rx2Var.j = 1;
                    return ((t92) obj2).a(ex2Var, rx2Var) == y50Var ? y50Var : dm3Var;
                }
                if (i14 == 1) {
                    y02.Q(obj8);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ qn0(fn0 fn0Var, Object obj, int i) {
        this.f = i;
        this.h = fn0Var;
        this.g = obj;
    }
}
