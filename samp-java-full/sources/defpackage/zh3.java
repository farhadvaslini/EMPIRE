package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zh3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ai3 l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh3(ai3 ai3Var, float f, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = ai3Var;
        this.m = f;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((zh3) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        float f = this.m;
        ai3 ai3Var = this.l;
        switch (i) {
            case 0:
                return new zh3(ai3Var, f, p40Var, 0);
            default:
                return new zh3(ai3Var, f, p40Var, 1);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        float f = this.m;
        y50 y50Var = y50.f;
        ai3 ai3Var = this.l;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ed edVar = ai3Var.y;
                    if (edVar != null) {
                        Float f2 = new Float(f);
                        oe oeVar = ai3Var.w ? wb3.f : ai3Var.v;
                        this.k = 1;
                        obj = ed.c(edVar, f2, oeVar, null, this, 12);
                        if (obj == y50Var) {
                        }
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    ed edVar2 = ai3Var.x;
                    if (edVar2 != null) {
                        Float f3 = new Float(f);
                        oe oeVar2 = ai3Var.w ? wb3.f : ai3Var.v;
                        this.k = 1;
                        obj = ed.c(edVar2, f3, oeVar2, null, this, 12);
                        if (obj == y50Var) {
                        }
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return dm3Var;
    }
}
