package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class u5 implements gn0 {
    public final /* synthetic */ int f;
    public final Object g;
    public final Object h;
    public final Object i;

    public u5(gn0 gn0Var, o50 o50Var) {
        this.f = 3;
        this.g = o50Var;
        this.h = cl3.D(o50Var);
        this.i = new hd1(gn0Var, null, 28);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        if (r11.k(r1, r3) == r8) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r11.k(r1, r3) == r8) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00db  */
    @Override // defpackage.gn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, p40 p40Var) throws Throwable {
        t5 t5Var;
        vn0 vn0Var;
        Object obj2 = obj;
        int i = this.f;
        y50 y50Var = y50.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                qk2 qk2Var = (qk2) obj5;
                if (p40Var instanceof t5) {
                    t5Var = (t5) p40Var;
                    int i2 = t5Var.l;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        t5Var.l = i2 - Integer.MIN_VALUE;
                    } else {
                        t5Var = new t5(this, p40Var);
                    }
                }
                Object obj6 = t5Var.j;
                int i3 = t5Var.l;
                if (i3 == 0) {
                    y02.Q(obj6);
                    j61 j61Var = (j61) qk2Var.f;
                    if (j61Var != null) {
                        j61Var.c(new p5());
                        t5Var.i = obj2;
                        t5Var.l = 1;
                        if (j61Var.x(t5Var) == y50Var) {
                            return y50Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = t5Var.i;
                    y02.Q(obj6);
                }
                x50 x50Var = (x50) obj4;
                qk2Var.f = cl3.t(x50Var, null, new l((rs0) obj3, obj2, x50Var, null, 1), 1);
                return dm3Var;
            case 1:
                gk3 gk3Var = (gk3) obj4;
                ((jd2) obj5).setValue(Boolean.valueOf(((Boolean) obj2).booleanValue() ? ((Boolean) ((rs0) ((os1) obj3).getValue()).f(gk3Var.a.h(), gk3Var.d.getValue())).booleanValue() : false));
                return dm3Var;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                gn0 gn0Var = (gn0) obj4;
                mk2 mk2Var = (mk2) obj5;
                if (p40Var instanceof vn0) {
                    vn0Var = (vn0) p40Var;
                    int i4 = vn0Var.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        vn0Var.l = i4 - Integer.MIN_VALUE;
                    } else {
                        vn0Var = new vn0(this, p40Var);
                    }
                }
                Object objF = vn0Var.j;
                int i5 = vn0Var.l;
                if (i5 == 0) {
                    y02.Q(objF);
                    if (mk2Var.f) {
                        vn0Var.i = null;
                        vn0Var.l = 1;
                        break;
                    } else {
                        vn0Var.i = obj2;
                        vn0Var.l = 2;
                        objF = ((rs0) obj3).f(obj2, vn0Var);
                        if (objF != y50Var) {
                            if (!((Boolean) objF).booleanValue()) {
                            }
                            return dm3Var;
                        }
                    }
                    return y50Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        obj2 = vn0Var.i;
                        y02.Q(objF);
                        if (!((Boolean) objF).booleanValue()) {
                            mk2Var.f = true;
                            vn0Var.i = null;
                            vn0Var.l = 3;
                            break;
                        }
                        return dm3Var;
                    }
                    if (i5 != 3) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                y02.Q(objF);
                return dm3Var;
            default:
                Object objN = br.N((o50) obj5, obj2, obj4, (hd1) obj3, p40Var);
                return objN == y50Var ? objN : dm3Var;
        }
    }

    public /* synthetic */ u5(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }
}
