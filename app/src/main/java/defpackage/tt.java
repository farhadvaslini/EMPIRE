package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class tt extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ed l;
    public final /* synthetic */ float m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ s41 o;
    public final /* synthetic */ os1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt(ed edVar, float f, boolean z, s41 s41Var, os1 os1Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = edVar;
        this.m = f;
        this.n = z;
        this.o = s41Var;
        this.p = os1Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((tt) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        switch (this.j) {
            case 0:
                return new tt(this.l, this.m, this.n, this.o, this.p, p40Var, 0);
            default:
                return new tt(this.l, this.m, this.n, this.o, this.p, p40Var, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6.f(r12, r13) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (defpackage.hh0.a(r6, r7, r13, r11, r12) == r5) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r6.f(r12, r13) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (defpackage.hh0.a(r6, r7, r13, r11, r12) == r5) goto L37;
     */
    @Override // defpackage.ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        boolean z = this.n;
        y50 y50Var = y50.f;
        ed edVar = this.l;
        float f = this.m;
        os1 os1Var = this.p;
        s41 s41Var = this.o;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    if (!jd0.b(((jd0) edVar.e.getValue()).f, f)) {
                        if (!z) {
                            jd0 jd0Var = new jd0(f);
                            this.k = 1;
                        } else {
                            s41 s41Var2 = (s41) os1Var.getValue();
                            this.k = 2;
                        }
                    }
                } else if (i2 == 1 || i2 == 2) {
                    y02.Q(obj);
                } else {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                os1Var.setValue(s41Var);
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    if (!jd0.b(((jd0) edVar.e.getValue()).f, f)) {
                        if (!z) {
                            jd0 jd0Var2 = new jd0(f);
                            this.k = 1;
                        } else {
                            s41 s41Var3 = (s41) os1Var.getValue();
                            this.k = 2;
                        }
                    }
                } else if (i3 == 1 || i3 == 2) {
                    y02.Q(obj);
                } else {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                os1Var.setValue(s41Var);
                break;
        }
        return dm3Var;
    }
}
