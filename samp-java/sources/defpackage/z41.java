package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class z41 extends mb3 implements rs0 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a51 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z41(a51 a51Var, p40 p40Var, int i) {
        super(2, p40Var);
        this.j = i;
        this.l = a51Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        x50 x50Var = (x50) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((z41) m(p40Var, x50Var)).o(dm3Var);
                break;
            case 1:
                ((z41) m(p40Var, x50Var)).o(dm3Var);
                break;
            default:
                ((z41) m(p40Var, x50Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        a51 a51Var = this.l;
        switch (i) {
            case 0:
                z41 z41Var = new z41(a51Var, p40Var, 0);
                z41Var.k = obj;
                return z41Var;
            case 1:
                z41 z41Var2 = new z41(a51Var, p40Var, 1);
                z41Var2.k = obj;
                return z41Var2;
            default:
                z41 z41Var3 = new z41(a51Var, p40Var, 2);
                z41Var3.k = obj;
                return z41Var3;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        a51 a51Var = this.l;
        p40 p40Var = null;
        int i2 = 3;
        x50 x50Var = (x50) this.k;
        switch (i) {
            case 0:
                y02.Q(obj);
                cl3.t(x50Var, null, new y41(a51Var, p40Var, 0), 3);
                cl3.t(x50Var, null, new y41(a51Var, p40Var, 1), 3);
                break;
            case 1:
                y02.Q(obj);
                cl3.t(x50Var, null, new y41(a51Var, p40Var, 2), 3);
                cl3.t(x50Var, null, new y41(a51Var, p40Var, i2), 3);
                break;
            default:
                y02.Q(obj);
                cl3.t(x50Var, null, new y41(a51Var, p40Var, 4), 3);
                cl3.t(x50Var, null, new y41(a51Var, p40Var, 5), 3);
                break;
        }
        return dm3Var;
    }
}
