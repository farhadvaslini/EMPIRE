package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class p60 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ z60 l;
    public final /* synthetic */ float m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p60(z60 z60Var, float f, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = z60Var;
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
        return ((p60) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        float f = this.m;
        z60 z60Var = this.l;
        switch (i) {
            case 0:
                return new p60(z60Var, f, p40Var, 0);
            case 1:
                return new p60(z60Var, f, p40Var, 1);
            default:
                return new p60(z60Var, f, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        float f = this.m;
        y50 y50Var = y50.f;
        z60 z60Var = this.l;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ed edVar = z60Var.h;
                    Float f2 = new Float(f);
                    s83 s83Var = new s83(1.0f, 1000.0f, new Float(z60Var.c));
                    this.k = 1;
                    if (ed.c(edVar, f2, s83Var, null, this, 12) == y50Var) {
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
                    ed edVar2 = z60Var.h;
                    Float f3 = new Float(f);
                    s83 s83Var2 = new s83(1.0f, 1000.0f, new Float(z60Var.c));
                    t60 t60Var = new t60(z60Var, 2);
                    this.k = 1;
                    if (ed.c(edVar2, f3, s83Var2, t60Var, this, 4) == y50Var) {
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
                    ed edVar3 = z60Var.i;
                    Float f4 = new Float(f);
                    s83 s83Var3 = new s83(0.5f, 300.0f, new Float(z60Var.c * 10.0f));
                    this.k = 1;
                    if (ed.c(edVar3, f4, s83Var3, null, this, 12) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return y50Var;
    }
}
