package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class he0 extends pn2 implements rs0 {
    public final /* synthetic */ int h;
    public int i;
    public /* synthetic */ Object j;
    public Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ zs0 m;
    public final /* synthetic */ zs0 n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he0(q20 q20Var, ir irVar, u uVar, vk1 vk1Var, s sVar, p40 p40Var) {
        super(p40Var);
        this.h = 0;
        this.k = q20Var;
        this.l = irVar;
        this.m = uVar;
        this.n = vk1Var;
        this.o = sVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.h;
        dm3 dm3Var = dm3.a;
        rb3 rb3Var = (rb3) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((he0) m(p40Var, rb3Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.h;
        Object obj2 = this.o;
        zs0 zs0Var = this.n;
        zs0 zs0Var2 = this.m;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                he0 he0Var = new he0((q20) this.k, (ir) obj3, (u) zs0Var2, (vk1) zs0Var, (s) obj2, p40Var);
                he0Var.j = obj;
                return he0Var;
            case 1:
                he0 he0Var2 = new he0((t60) obj3, (bh1) zs0Var2, (ch1) zs0Var, (ch1) obj2, p40Var, 1);
                he0Var2.j = obj;
                return he0Var2;
            default:
                he0 he0Var3 = new he0((x50) obj3, (hf3) zs0Var2, (zb) zs0Var, (xc2) obj2, p40Var, 2);
                he0Var3.j = obj;
                return he0Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (r3 == r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        if (r0 == r9) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0129  */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        rb3 rb3Var;
        Object objA;
        rb3 rb3Var2;
        Object objB;
        Object objB2;
        rb3 rb3Var3;
        nk2 nk2Var;
        gb2 gb2Var;
        Object objF;
        rb3 rb3Var4;
        j61 j61VarT;
        Object objB3;
        p40 p40Var;
        Object objI;
        int i = this.h;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.n;
        zs0 zs0Var2 = this.m;
        y50 y50Var = y50.f;
        Object obj2 = this.o;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                int i2 = this.i;
                if (i2 == 0) {
                    y02.Q(obj);
                    rb3Var = (rb3) this.j;
                    this.j = rb3Var;
                    this.i = 1;
                    objA = cd3.a(rb3Var, false, ab2.f, this);
                    if (objA != y50Var) {
                    }
                } else if (i2 == 1) {
                    rb3Var = (rb3) this.j;
                    y02.Q(obj);
                    objA = obj;
                } else if (i2 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                this.j = null;
                this.i = 2;
                if (le0.i(rb3Var, (gb2) objA, (q20) this.k, (ir) obj3, (u) zs0Var2, (vk1) zs0Var, (s) obj2, this) != y50Var) {
                }
                break;
            case 1:
                bh1 bh1Var = (bh1) zs0Var2;
                int i3 = this.i;
                if (i3 == 0) {
                    y02.Q(obj);
                    rb3Var2 = (rb3) this.j;
                    this.j = rb3Var2;
                    this.i = 1;
                    objB = cd3.b(rb3Var2, this, 2);
                    if (objB != y50Var) {
                    }
                } else if (i3 == 1) {
                    rb3Var2 = (rb3) this.j;
                    y02.Q(obj);
                    objB = obj;
                } else if (i3 == 2) {
                    nk2Var = (nk2) this.k;
                    rb3 rb3Var5 = (rb3) this.j;
                    y02.Q(obj);
                    rb3Var3 = rb3Var5;
                    objB2 = obj;
                    gb2Var = (gb2) objB2;
                    if (gb2Var == null) {
                        ((t60) obj3).g.f();
                        bh1Var.f(gb2Var, new Float(nk2Var.f));
                        long j = gb2Var.a;
                        s sVar = new s(21, bh1Var);
                        this.j = null;
                        this.k = null;
                        this.i = 3;
                        objF = le0.f(rb3Var3, j, sVar, this);
                    }
                } else if (i3 != 3) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                    objF = obj;
                    if (!((Boolean) objF).booleanValue()) {
                        ((ch1) obj2).a();
                    } else {
                        ((ch1) zs0Var).a();
                    }
                }
                gb2 gb2Var2 = (gb2) objB;
                nk2 nk2Var2 = new nk2();
                long j2 = gb2Var2.a;
                int i4 = gb2Var2.i;
                u uVar = new u(12, nk2Var2);
                this.j = rb3Var2;
                this.k = nk2Var2;
                this.i = 2;
                objB2 = le0.b(rb3Var2, j2, i4, uVar, this);
                if (objB2 != y50Var) {
                    rb3Var3 = rb3Var2;
                    nk2Var = nk2Var2;
                    gb2Var = (gb2) objB2;
                    if (gb2Var == null) {
                    }
                }
                break;
            default:
                x50 x50Var = (x50) obj3;
                xc2 xc2Var = (xc2) obj2;
                int i5 = this.i;
                p40 p40Var2 = null;
                if (i5 == 0) {
                    y02.Q(obj);
                    rb3Var4 = (rb3) this.j;
                    j61VarT = cl3.t(x50Var, null, new wc3(xc2Var, null, 0), 1);
                    this.j = rb3Var4;
                    this.k = j61VarT;
                    this.i = 1;
                    objB3 = cd3.b(rb3Var4, this, 3);
                    if (objB3 != y50Var) {
                    }
                } else if (i5 == 1) {
                    j61VarT = (w83) this.k;
                    rb3Var4 = (rb3) this.j;
                    y02.Q(obj);
                    objB3 = obj;
                } else if (i5 != 2) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    j61VarT = (j61) this.j;
                    y02.Q(obj);
                    objI = obj;
                    p40Var = null;
                    gb2 gb2Var3 = (gb2) objI;
                    if (gb2Var3 != null) {
                        gb2Var3.a();
                        cd3.f(x50Var, j61VarT, new vc3(xc2Var, p40Var, 1));
                        ((zb) zs0Var).h(new gy1(gb2Var3.c));
                    } else {
                        cd3.f(x50Var, j61VarT, new vc3(xc2Var, p40Var, 0));
                    }
                }
                gb2 gb2Var4 = (gb2) objB3;
                gb2Var4.a();
                hf3 hf3Var = (hf3) zs0Var2;
                if (hf3Var != cd3.a) {
                    p40Var = null;
                    cd3.f(x50Var, j61VarT, new ri2(hf3Var, xc2Var, gb2Var4, p40Var2, 8));
                } else {
                    p40Var = null;
                }
                this.j = j61VarT;
                this.k = p40Var;
                this.i = 2;
                objI = cd3.i(rb3Var4, ab2.g, this);
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he0(Object obj, zs0 zs0Var, zs0 zs0Var2, Object obj2, p40 p40Var, int i) {
        super(p40Var);
        this.h = i;
        this.l = obj;
        this.m = zs0Var;
        this.n = zs0Var2;
        this.o = obj2;
    }
}
