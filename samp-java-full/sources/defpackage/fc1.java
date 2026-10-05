package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 implements qa3 {
    public final pr1 a;
    public final /* synthetic */ hc1 b;
    public final /* synthetic */ Object c;

    public fc1(hc1 hc1Var, Object obj) {
        this.b = hc1Var;
        this.c = obj;
        int[] iArr = o41.a;
        this.a = new pr1();
    }

    @Override // defpackage.qa3
    public final void a() {
        hc1.a(this.b, this.c);
    }

    @Override // defpackage.qa3
    public final void b(t6 t6Var) {
        ax1 ax1Var;
        tb1 tb1Var = (tb1) this.b.o.g(this.c);
        aq1 aq1Var = (tb1Var == null || (ax1Var = tb1Var.L) == null) ? null : ax1Var.f;
        if (aq1Var == null || !aq1Var.s) {
            return;
        }
        n32.D(aq1Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", t6Var);
    }

    @Override // defpackage.qa3
    public final int c() {
        tb1 tb1Var = (tb1) this.b.o.g(this.c);
        if (tb1Var != null) {
            return ((qs1) ((yr1) tb1Var.n()).g).h;
        }
        return 0;
    }

    @Override // defpackage.qa3
    public final void d(int i, long j) {
        hc1 hc1Var = this.b;
        tb1 tb1Var = (tb1) hc1Var.o.g(this.c);
        if (tb1Var == null || !tb1Var.H()) {
            return;
        }
        int i2 = ((qs1) ((yr1) tb1Var.n()).g).h;
        if (i < 0 || i >= i2) {
            m21.e("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (tb1Var.I()) {
            m21.a("Pre-measure called on node that is not placed");
        }
        tb1 tb1Var2 = hc1Var.f;
        tb1Var2.w = true;
        ((h7) wb1.a(tb1Var)).u((tb1) ((yr1) tb1Var.n()).get(i), j);
        tb1Var2.w = false;
        this.a.a(i);
    }
}
