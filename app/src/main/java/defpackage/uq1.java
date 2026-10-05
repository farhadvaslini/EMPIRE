package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class uq1 extends mb3 implements rs0 {
    public mk2 j;
    public mk2 k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ nk2 o;
    public final /* synthetic */ qk2 p;
    public final /* synthetic */ qk2 q;
    public final /* synthetic */ float r;
    public final /* synthetic */ wq1 s;
    public final /* synthetic */ float t;
    public final /* synthetic */ ws2 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(nk2 nk2Var, qk2 qk2Var, qk2 qk2Var2, float f, wq1 wq1Var, float f2, ws2 ws2Var, p40 p40Var) {
        super(2, p40Var);
        this.o = nk2Var;
        this.p = qk2Var;
        this.q = qk2Var2;
        this.r = f;
        this.s = wq1Var;
        this.t = f2;
        this.u = ws2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        return ((uq1) m((p40) obj2, (us2) obj)).o(dm3.a);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        uq1 uq1Var = new uq1(this.o, this.p, this.q, this.r, this.s, this.t, this.u, p40Var);
        uq1Var.n = obj;
        return uq1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x018a -> B:36:0x018b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x019e -> B:13:0x0076). Please report as a decompilation issue!!! */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        us2 us2Var;
        mk2 mk2Var;
        nk2 nk2Var;
        qk2 qk2Var;
        int i;
        us2 us2Var2;
        int i2;
        qk2 qk2Var2;
        y50 y50Var;
        uq1 uq1Var;
        int i3;
        char c;
        wq1 wq1Var;
        boolean z;
        uq1 uq1Var2 = this;
        int i4 = uq1Var2.m;
        qk2 qk2Var3 = uq1Var2.q;
        wq1 wq1Var2 = uq1Var2.s;
        nk2 nk2Var2 = uq1Var2.o;
        char c2 = 3;
        int i5 = 2;
        int i6 = 1;
        qk2 qk2Var4 = uq1Var2.p;
        y50 y50Var2 = y50.f;
        if (i4 == 0) {
            y02.Q(obj);
            us2Var = (us2) uq1Var2.n;
            mk2 mk2Var2 = new mk2();
            mk2Var2.f = true;
            mk2Var = mk2Var2;
            z = mk2Var.f;
            dm3 dm3Var = dm3.a;
            if (!z) {
            }
        } else if (i4 == 1) {
            mk2 mk2Var3 = uq1Var2.k;
            mk2 mk2Var4 = uq1Var2.j;
            us2Var2 = (us2) uq1Var2.n;
            y02.Q(obj);
            i = 1;
            c = 3;
            wq1Var = wq1Var2;
            mk2Var = mk2Var4;
            mk2Var3.f = ((Boolean) obj).booleanValue();
            uq1Var2 = this;
            qk2Var4 = qk2Var4;
            i5 = 2;
            y50Var2 = y50Var2;
            i6 = i;
            c2 = c;
            wq1Var2 = wq1Var;
            us2Var = us2Var2;
            z = mk2Var.f;
            dm3 dm3Var2 = dm3.a;
            if (!z) {
            }
        } else if (i4 == 2) {
            i3 = uq1Var2.l;
            mk2 mk2Var5 = uq1Var2.j;
            us2Var2 = (us2) uq1Var2.n;
            y02.Q(obj);
            qk2Var2 = qk2Var4;
            uq1Var = uq1Var2;
            qk2Var = qk2Var3;
            nk2Var = nk2Var2;
            i = 1;
            y50Var = y50Var2;
            mk2Var = mk2Var5;
            i2 = 2;
            if (mk2Var.f) {
            }
        } else {
            if (i4 != 3) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mk2 mk2Var6 = uq1Var2.k;
            mk2 mk2Var7 = uq1Var2.j;
            us2Var2 = (us2) uq1Var2.n;
            y02.Q(obj);
            mk2Var = mk2Var6;
            i = 1;
            qk2 qk2Var5 = qk2Var4;
            c = 3;
            wq1Var = wq1Var2;
            y50 y50Var3 = y50Var2;
            i2 = 2;
            Object objD = obj;
            mk2Var.f = ((Boolean) objD).booleanValue();
            qk2Var4 = qk2Var5;
            i5 = i2;
            y50Var2 = y50Var3;
            mk2Var = mk2Var7;
            i6 = i;
            c2 = c;
            wq1Var2 = wq1Var;
            us2Var = us2Var2;
            z = mk2Var.f;
            dm3 dm3Var22 = dm3.a;
            if (!z) {
                mk2Var.f = false;
                float fFloatValue = nk2Var2.f - ((Number) ((pe) qk2Var4.f).g.getValue()).floatValue();
                if (!((sq1) qk2Var3.f).c) {
                    float fAbs = Math.abs(fFloatValue);
                    float f = uq1Var2.r;
                    if (fAbs >= f) {
                        float fSignum = Math.signum(fFloatValue) * f;
                        wq1Var2.e(us2Var, fSignum);
                        pe peVar = (pe) qk2Var4.f;
                        pe peVarK = cl3.k(peVar, ((Number) peVar.g.getValue()).floatValue() + fSignum, 0.0f, 30);
                        qk2Var4.f = peVarK;
                        int iM = vm1.M(Math.abs(nk2Var2.f - ((Number) peVarK.g.getValue()).floatValue()) / uq1Var2.t);
                        if (iM > 100) {
                            iM = 100;
                        }
                        pe peVar2 = (pe) qk2Var4.f;
                        float f2 = nk2Var2.f;
                        int i7 = iM;
                        qk2 qk2Var6 = qk2Var3;
                        nk2 nk2Var3 = nk2Var2;
                        y50Var = y50Var2;
                        a4 a4Var = new a4(wq1Var2, qk2Var6, nk2Var3, uq1Var2.u, mk2Var, 3);
                        qk2Var = qk2Var6;
                        nk2Var = nk2Var3;
                        mk2 mk2Var8 = mk2Var;
                        uq1Var2.n = us2Var;
                        uq1Var2.j = mk2Var8;
                        uq1Var2.k = null;
                        uq1Var2.l = i7;
                        uq1Var2.m = i5;
                        wq1 wq1Var3 = wq1Var2;
                        nk2 nk2Var4 = new nk2();
                        nk2Var4.f = ((Number) peVar2.g.getValue()).floatValue();
                        Float f3 = new Float(f2);
                        zk3 zk3VarI = n92.I(i7, i5, pg0.c);
                        us2Var2 = us2Var;
                        bd bdVar = new bd(nk2Var4, wq1Var3, us2Var2, a4Var, 6);
                        wq1Var2 = wq1Var3;
                        i2 = i5;
                        uq1 uq1Var3 = uq1Var2;
                        qk2Var2 = qk2Var4;
                        uq1Var = uq1Var3;
                        i = 1;
                        Object objO = t22.o(peVar2, f3, zk3VarI, true, bdVar, uq1Var);
                        if (objO != y50Var) {
                            objO = dm3Var22;
                        }
                        if (objO == y50Var) {
                            return y50Var;
                        }
                        i3 = i7;
                        mk2Var = mk2Var8;
                        if (mk2Var.f) {
                            long j = 50 - ((long) i3);
                            uq1Var.n = us2Var2;
                            uq1Var.j = mk2Var;
                            uq1Var.k = mk2Var;
                            uq1Var.m = 3;
                            c = 3;
                            qk2Var5 = qk2Var2;
                            wq1Var = wq1Var2;
                            uq1Var2 = uq1Var;
                            y50Var3 = y50Var;
                            qk2Var3 = qk2Var;
                            nk2Var2 = nk2Var;
                            objD = wq1.d(wq1Var, qk2Var3, nk2Var2, uq1Var.u, qk2Var5, j, uq1Var2);
                            if (objD == y50Var3) {
                                return y50Var3;
                            }
                            mk2Var7 = mk2Var;
                            mk2Var.f = ((Boolean) objD).booleanValue();
                            qk2Var4 = qk2Var5;
                            i5 = i2;
                            y50Var2 = y50Var3;
                            mk2Var = mk2Var7;
                            i6 = i;
                            c2 = c;
                            wq1Var2 = wq1Var;
                            us2Var = us2Var2;
                            z = mk2Var.f;
                            dm3 dm3Var222 = dm3.a;
                            if (!z) {
                                return dm3Var222;
                            }
                        } else {
                            qk2 qk2Var7 = qk2Var2;
                            uq1Var2 = uq1Var;
                            i5 = i2;
                            us2Var = us2Var2;
                            qk2Var3 = qk2Var;
                            nk2Var2 = nk2Var;
                            qk2Var4 = qk2Var7;
                            y50Var2 = y50Var;
                            i6 = i;
                            c2 = 3;
                            z = mk2Var.f;
                            dm3 dm3Var2222 = dm3.a;
                            if (!z) {
                            }
                        }
                    }
                }
                us2Var2 = us2Var;
                i = i6;
                qk2 qk2Var8 = qk2Var4;
                c = c2;
                wq1Var = wq1Var2;
                mk2 mk2Var9 = mk2Var;
                y50 y50Var4 = y50Var2;
                int i8 = i5;
                wq1Var.e(us2Var2, fFloatValue);
                uq1Var2.n = us2Var2;
                uq1Var2.j = mk2Var9;
                uq1Var2.k = mk2Var9;
                uq1Var2.m = i;
                Object objD2 = wq1.d(wq1Var, qk2Var3, nk2Var2, uq1Var2.u, qk2Var8, 50L, uq1Var2);
                if (objD2 == y50Var4) {
                    return y50Var4;
                }
                mk2Var = mk2Var9;
                mk2Var9.f = ((Boolean) objD2).booleanValue();
                uq1Var2 = this;
                qk2Var4 = qk2Var8;
                i5 = i8;
                y50Var2 = y50Var4;
                i6 = i;
                c2 = c;
                wq1Var2 = wq1Var;
                us2Var = us2Var2;
                z = mk2Var.f;
                dm3 dm3Var22222 = dm3.a;
                if (!z) {
                }
            }
        }
    }
}
