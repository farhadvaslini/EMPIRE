package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zx2 implements fn0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ fn0 g;
    public final /* synthetic */ qy2 h;

    public /* synthetic */ zx2(fn0 fn0Var, qy2 qy2Var, int i) {
        this.f = i;
        this.g = fn0Var;
        this.h = qy2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.fn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(gn0 gn0Var, p40 p40Var) {
        cx2 cx2Var;
        cy2 cy2Var;
        gy2 gy2Var;
        int i = this.f;
        dm3 dm3Var = dm3.a;
        qy2 qy2Var = this.h;
        fn0 fn0Var = this.g;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                if (p40Var instanceof cx2) {
                    cx2Var = (cx2) p40Var;
                    int i2 = cx2Var.j;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        cx2Var.j = i2 - Integer.MIN_VALUE;
                    } else {
                        cx2Var = new cx2(this, p40Var);
                    }
                }
                Object obj = cx2Var.i;
                int i3 = cx2Var.j;
                if (i3 == 0) {
                    y02.Q(obj);
                    ex2 ex2Var = new ex2(gn0Var, qy2Var, 0);
                    cx2Var.j = 1;
                    if (fn0Var.a(ex2Var, cx2Var) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case 1:
                if (p40Var instanceof cy2) {
                    cy2Var = (cy2) p40Var;
                    int i4 = cy2Var.j;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        cy2Var.j = i4 - Integer.MIN_VALUE;
                    } else {
                        cy2Var = new cy2(this, p40Var);
                    }
                }
                Object obj2 = cy2Var.i;
                int i5 = cy2Var.j;
                if (i5 == 0) {
                    y02.Q(obj2);
                    ex2 ex2Var2 = new ex2(gn0Var, qy2Var, 2);
                    cy2Var.j = 1;
                    if (fn0Var.a(ex2Var2, cy2Var) == y50Var) {
                    }
                } else if (i5 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj2);
                }
                break;
            default:
                if (p40Var instanceof gy2) {
                    gy2Var = (gy2) p40Var;
                    int i6 = gy2Var.j;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        gy2Var.j = i6 - Integer.MIN_VALUE;
                    } else {
                        gy2Var = new gy2(this, p40Var);
                    }
                }
                Object obj3 = gy2Var.i;
                int i7 = gy2Var.j;
                if (i7 == 0) {
                    y02.Q(obj3);
                    o70 o70Var = new o70(gn0Var, qy2Var);
                    gy2Var.j = 1;
                    if (fn0Var.a(o70Var, gy2Var) == y50Var) {
                    }
                } else if (i7 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj3);
                }
                break;
        }
        return y50Var;
    }
}
