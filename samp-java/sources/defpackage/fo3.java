package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fo3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fo3(Object obj, boolean z, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = obj;
        this.m = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((fo3) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        boolean z = this.m;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                return new fo3((go3) obj2, z, p40Var, 0);
            case 1:
                return new fo3((go3) obj2, z, p40Var, 1);
            default:
                return new fo3((sf3) obj2, z, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        ax axVar;
        af afVarA = null;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i = this.k;
                try {
                    if (i == 0) {
                        y02.Q(obj);
                        pi piVar = ((go3) this.l).c;
                        boolean z = this.m;
                        this.k = 1;
                        if (piVar.L(z, this) == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    ti tiVar = ui.a;
                    ui.c(ti.i, "UpdateViewModel", "Unable to save update settings", e2);
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        y02.Q(obj);
                        pi piVar2 = ((go3) this.l).c;
                        boolean z2 = this.m;
                        this.k = 1;
                        if (piVar2.P(z2, this) == y50Var2) {
                            return y50Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    break;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    ti tiVar2 = ui.a;
                    ui.c(ti.i, "UpdateViewModel", "Unable to save pre-release setting", e4);
                }
                return dm3.a;
            default:
                sf3 sf3Var = (sf3) this.l;
                dm3 dm3Var = dm3.a;
                y50 y50Var3 = y50.f;
                int i3 = this.k;
                if (i3 == 0) {
                    y02.Q(obj);
                    boolean z3 = this.m;
                    if (!yg3.c(sf3Var.n().b) && !(sf3Var.f instanceof j42)) {
                        afVarA = t22.A(sf3Var.n());
                        if (z3) {
                            int iE = yg3.e(sf3Var.n().b);
                            sf3Var.c.h(sf3.e(sf3Var.n().a, d32.f(iE, iE)));
                            sf3Var.q(hx0.f);
                        }
                    }
                    if (afVarA != null && (axVar = sf3Var.h) != null) {
                        zw zwVarA0 = lq.a0(afVarA);
                        this.k = 1;
                        ((q6) axVar).a(zwVarA0);
                        if (dm3Var == y50Var3) {
                            return y50Var3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        c.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y02.Q(obj);
                }
                return dm3Var;
        }
    }
}
