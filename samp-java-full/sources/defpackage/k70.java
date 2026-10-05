package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class k70 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ b80 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k70(b80 b80Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = b80Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                return ((k70) m((p40) obj2, (gn0) obj)).o(dm3Var);
            case 1:
                return ((k70) m((p40) obj2, (x50) obj)).o(dm3Var);
            default:
                return ((k70) m((p40) obj2, (x50) obj)).o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        b80 b80Var = this.l;
        switch (i) {
            case 0:
                return new k70(b80Var, p40Var, 0);
            case 1:
                return new k70(b80Var, p40Var, 1);
            default:
                return new k70(b80Var, p40Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        b80 b80Var = this.l;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    this.k = 1;
                    return b80.e(b80Var, this) == y50Var ? y50Var : dm3Var;
                }
                if (i3 == 1) {
                    y02.Q(obj);
                    return dm3Var;
                }
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    pl plVar = b80Var.h;
                    this.k = 1;
                    Object objE = ((gz) plVar.h).E(this);
                    if (objE != y50Var) {
                        objE = dm3Var;
                    }
                    if (objE != y50Var) {
                    }
                    return y50Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        y02.Q(obj);
                        return dm3Var;
                    }
                    c.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y02.Q(obj);
                fn0 fn0VarM = lr.m(b80Var.i().c, -1);
                k9 k9Var = new k9(i2, b80Var);
                this.k = 2;
                if (fn0VarM.a(k9Var, this) != y50Var) {
                    return dm3Var;
                }
                return y50Var;
            default:
                yl1 yl1Var = b80Var.g;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        y02.Q(obj);
                        if (yl1Var.A() instanceof km0) {
                            return yl1Var.A();
                        }
                        this.k = 1;
                        if (b80.f(b80Var, this) != y50Var) {
                        }
                        return y50Var;
                    }
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y02.Q(obj);
                            return (d93) obj;
                        }
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                    this.k = 2;
                    obj = b80.g(b80Var, false, this);
                } catch (Throwable th) {
                    return new zi2(th, -1);
                }
                break;
        }
    }
}
