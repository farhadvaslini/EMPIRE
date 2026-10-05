package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pa1 extends mb3 implements ss0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ gn0 l;
    public /* synthetic */ Throwable m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa1(int i, p40 p40Var, int i2) {
        super(i, p40Var);
        this.j = i2;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        int i2 = 3;
        gn0 gn0Var = (gn0) obj;
        Throwable th = (Throwable) obj2;
        p40 p40Var = (p40) obj3;
        switch (i) {
            case 0:
                pa1 pa1Var = new pa1(i2, p40Var, 0);
                pa1Var.l = gn0Var;
                pa1Var.m = th;
                return pa1Var.o(dm3Var);
            default:
                pa1 pa1Var2 = new pa1(i2, p40Var, 1);
                pa1Var2.l = gn0Var;
                pa1Var2.m = th;
                return pa1Var2.o(dm3Var);
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        switch (this.j) {
            case 0:
                gn0 gn0Var = this.l;
                Throwable th = this.m;
                y50 y50Var = y50.f;
                int i = this.k;
                if (i == 0) {
                    y02.Q(obj);
                    ti tiVar = ui.a;
                    ui.c(ti.i, "LauncherViewModel", "Unable to read default server", th);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (gn0Var.k("", this) == y50Var) {
                    }
                } else if (i != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
            default:
                gn0 gn0Var2 = this.l;
                Throwable th2 = this.m;
                y50 y50Var2 = y50.f;
                int i2 = this.k;
                if (i2 == 0) {
                    y02.Q(obj);
                    ti tiVar2 = ui.a;
                    ui.c(ti.i, "LauncherViewModel", "Unable to read saved servers", th2);
                    ni0 ni0Var = ni0.f;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (gn0Var2.k(ni0Var, this) == y50Var2) {
                    }
                } else if (i2 != 1) {
                    c.q("call to 'resume' before 'invoke' with coroutine");
                } else {
                    y02.Q(obj);
                }
                break;
        }
        return dm3.a;
    }
}
