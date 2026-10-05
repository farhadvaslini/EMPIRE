package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zy extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ az l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy(az azVar, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = azVar;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((zy) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        az azVar = this.l;
        switch (i) {
            case 0:
                return new zy(azVar, p40Var, 0);
            case 1:
                return new zy(azVar, p40Var, 1);
            default:
                return new zy(azVar, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        y50 y50Var = y50.f;
        az azVar = this.l;
        switch (i) {
            case 0:
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    long jC = ((oq3) ur.z(azVar, s20.t)).c();
                    this.k = 1;
                    if (ur.A(jC, this) == y50Var) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                cs0 cs0Var = azVar.P;
                if (cs0Var != null) {
                    cs0Var.a();
                }
                if (azVar.Q) {
                    ((n62) ((px0) ur.z(azVar, s20.l))).a(0);
                }
                azVar.X = true;
                w83 w83Var = azVar.V;
                if (w83Var != null) {
                    w83Var.c(null);
                }
                azVar.V = null;
                azVar.U = null;
                break;
            case 1:
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    long jC2 = ((oq3) ur.z(azVar, s20.t)).c();
                    this.k = 1;
                    if (ur.A(jC2, this) == y50Var) {
                    }
                } else if (i3 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                cs0 cs0Var2 = azVar.P;
                if (cs0Var2 != null) {
                    cs0Var2.a();
                }
                if (azVar.Q) {
                    ((n62) ((px0) ur.z(azVar, s20.l))).a(0);
                }
                azVar.e0 = true;
                w83 w83Var2 = azVar.c0;
                if (w83Var2 != null) {
                    w83Var2.c(null);
                }
                azVar.c0 = null;
                azVar.b0 = null;
                break;
            default:
                int i4 = this.k;
                if (i4 == 0) {
                    y02.Q(obj);
                    long jC3 = ((oq3) ur.z(azVar, s20.t)).c();
                    this.k = 1;
                    if (ur.A(jC3, this) == y50Var) {
                    }
                } else if (i4 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                cs0 cs0Var3 = azVar.P;
                if (cs0Var3 != null) {
                    cs0Var3.a();
                }
                break;
        }
        return dm3Var;
    }
}
