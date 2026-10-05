package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fw2 extends mb3 implements rs0 {
    public final /* synthetic */ int j = 1;
    public /* synthetic */ Object k;
    public final /* synthetic */ String l;
    public final /* synthetic */ qy2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw2(qy2 qy2Var, String str, p40 p40Var) {
        super(2, p40Var);
        this.m = qy2Var;
        this.l = str;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        es1 es1Var = (es1) obj;
        p40 p40Var = (p40) obj2;
        switch (i) {
            case 0:
                ((fw2) m(p40Var, es1Var)).o(dm3Var);
                break;
            default:
                ((fw2) m(p40Var, es1Var)).o(dm3Var);
                break;
        }
        return dm3Var;
    }

    @Override // defpackage.ml
    public final p40 m(p40 p40Var, Object obj) {
        int i = this.j;
        qy2 qy2Var = this.m;
        String str = this.l;
        switch (i) {
            case 0:
                fw2 fw2Var = new fw2(qy2Var, str, p40Var);
                fw2Var.k = obj;
                return fw2Var;
            default:
                fw2 fw2Var2 = new fw2(str, qy2Var, p40Var);
                fw2Var2.k = obj;
                return fw2Var2;
        }
    }

    @Override // defpackage.ml
    public final Object o(Object obj) {
        int i = this.j;
        dm3 dm3Var = dm3.a;
        String str = this.l;
        switch (i) {
            case 0:
                es1 es1Var = (es1) this.k;
                y02.Q(obj);
                ec2 ec2Var = qy2.w;
                String str2 = (String) es1Var.c(ec2Var);
                if (str2 == null) {
                    str2 = "";
                }
                qy2 qy2Var = this.m;
                es1Var.e(ec2Var, qx.x0(pv2.L(new jm0(pv2.J(new vj(4, str2), new e91(1, qy2Var, qy2.class, "decodeServer", "decodeServer(Ljava/lang/String;)Ltop/th1nk/samp/core/config/SavedServer;", 0, 0, 29)), false, new im(8, str))), "\n", null, null, new e91(1, qy2Var, qy2.class, "encodeServer", "encodeServer(Ltop/th1nk/samp/core/config/SavedServer;)Ljava/lang/String;", 0, 0, 28), 30));
                break;
            default:
                es1 es1Var2 = (es1) this.k;
                y02.Q(obj);
                String string = y93.G0(str).toString();
                boolean zQ0 = y93.q0(string);
                ec2 ec2Var2 = qy2.A;
                if (!zQ0) {
                    es1Var2.d(ec2Var2, qy2.f(string, qp2.i));
                } else {
                    es1Var2.getClass();
                    ec2Var2.getClass();
                    es1Var2.b();
                    es1Var2.a.remove(ec2Var2);
                }
                break;
        }
        return dm3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw2(String str, qy2 qy2Var, p40 p40Var) {
        super(2, p40Var);
        this.l = str;
        this.m = qy2Var;
    }
}
