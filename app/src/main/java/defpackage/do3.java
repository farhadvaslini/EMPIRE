package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class do3 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ go3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ do3(go3 go3Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = go3Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
        }
        return ((do3) m(p40Var, x50Var)).o(dm3Var);
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        go3 go3Var = this.l;
        switch (i) {
            case 0:
                return new do3(go3Var, p40Var, 0);
            case 1:
                return new do3(go3Var, p40Var, 1);
            default:
                return new do3(go3Var, p40Var, 2);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = 1;
        switch (this.j) {
            case 0:
                y50 y50Var = y50.f;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        y02.Q(obj);
                        go3 go3Var = this.l;
                        t92 t92Var = (t92) go3Var.c.h;
                        co3 co3Var = new co3(go3Var, 0);
                        this.k = 1;
                        if (t92Var.a(co3Var, this) == y50Var) {
                            return y50Var;
                        }
                    } else {
                        if (i2 != 1) {
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
                    ui.c(ti.i, "UpdateViewModel", "Unable to observe update settings", e2);
                }
                return dm3.a;
            case 1:
                y50 y50Var2 = y50.f;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        y02.Q(obj);
                        go3 go3Var2 = this.l;
                        t92 t92Var2 = (t92) go3Var2.c.i;
                        co3 co3Var2 = new co3(go3Var2, i);
                        this.k = 1;
                        if (t92Var2.a(co3Var2, this) == y50Var2) {
                            return y50Var2;
                        }
                    } else {
                        if (i3 != 1) {
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
                    ui.c(ti.i, "UpdateViewModel", "Unable to observe pre-release setting", e4);
                }
                return dm3.a;
            default:
                y50 y50Var3 = y50.f;
                int i4 = this.k;
                try {
                    if (i4 == 0) {
                        y02.Q(obj);
                        pi piVar = this.l.c;
                        this.k = 1;
                        if (piVar.G(this) == y50Var3) {
                            return y50Var3;
                        }
                    } else {
                        if (i4 != 1) {
                            c.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y02.Q(obj);
                    }
                    break;
                } catch (CancellationException e5) {
                    throw e5;
                } catch (Exception e6) {
                    ti tiVar3 = ui.a;
                    ui.c(ti.i, "UpdateViewModel", "Unable to save update check timestamp", e6);
                }
                return dm3.a;
        }
    }
}
