package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class we2 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ze2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ we2(ze2 ze2Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = ze2Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((we2) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        ze2 ze2Var = this.l;
        switch (i) {
            case 0:
                return new we2(ze2Var, p40Var, 0);
            case 1:
                return new we2(ze2Var, p40Var, 1);
            default:
                return new we2(ze2Var, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        ze2 ze2Var = this.l;
        y50 y50Var = y50.f;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    af2 af2Var = ze2Var.y;
                    float f = ze2Var.v ? 1.0f : 0.0f;
                    this.k = 1;
                    Object objF = af2Var.a.f(this, new Float(f));
                    if (objF != y50Var) {
                        objF = dm3Var;
                    }
                    if (objF == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    if (!ze2Var.y.a.e()) {
                        af2 af2Var2 = ze2Var.y;
                        float fG = ze2Var.B.g() / ze2Var.v1();
                        this.k = 1;
                        Object objF2 = af2Var2.a.f(this, new Float(fG));
                        if (objF2 != y50Var) {
                            objF2 = dm3Var;
                        }
                        if (objF2 == y50Var) {
                        }
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    if (ze2Var.v) {
                        this.k = 2;
                        if (ze2.s1(ze2Var, this) != y50Var) {
                        }
                    } else {
                        this.k = 1;
                        if (ze2Var.t1(this) != y50Var) {
                        }
                    }
                } else if (i4 == 1 || i4 == 2) {
                    y02.Q(obj);
                } else {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                }
                break;
        }
        return y50Var;
    }
}
