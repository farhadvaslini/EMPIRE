package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gc1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gc1(hc1 hc1Var, Object obj, int i) {
        this.a = i;
        this.b = hc1Var;
        this.c = obj;
    }

    public zb1 b() {
        hc1 hc1Var = this.b;
        tb1 tb1Var = (tb1) hc1Var.o.g(this.c);
        if (tb1Var != null) {
            return (zb1) hc1Var.k.g(tb1Var);
        }
        return null;
    }

    public final boolean c() {
        g52 g52Var;
        switch (this.a) {
            case 0:
                return true;
            default:
                zb1 zb1VarB = b();
                if (zb1VarB == null || (g52Var = zb1VarB.f) == null) {
                    return true;
                }
                return g52Var.c();
        }
    }

    private final void a() {
    }
}
