package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t81 implements cs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ os1 g;
    public final /* synthetic */ os1 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ t81(us0 us0Var, os1 os1Var, os1 os1Var2, os1 os1Var3, os1 os1Var4, os1 os1Var5, os1 os1Var6) {
        this.i = us0Var;
        this.g = os1Var;
        this.h = os1Var2;
        this.j = os1Var3;
        this.k = os1Var4;
        this.l = os1Var5;
        this.m = os1Var6;
    }

    @Override // defpackage.cs0
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        os1 os1Var = this.h;
        os1 os1Var2 = this.g;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                us0 us0Var = (us0) obj5;
                os1 os1Var3 = (os1) obj4;
                os1 os1Var4 = (os1) obj3;
                os1 os1Var5 = (os1) obj2;
                os1 os1Var6 = (os1) obj;
                if (!y93.q0((String) os1Var2.getValue())) {
                    Integer numF0 = fa3.f0((String) os1Var.getValue());
                    us0Var.j(y93.G0((String) os1Var2.getValue()).toString(), Integer.valueOf(numF0 != null ? numF0.intValue() : 7777), y93.G0((String) os1Var3.getValue()).toString(), (xy2) os1Var4.getValue(), (String) os1Var5.getValue());
                    os1Var6.setValue(Boolean.FALSE);
                    os1Var2.setValue("");
                    os1Var.setValue("7777");
                    os1Var3.setValue("");
                    os1Var5.setValue("");
                    os1Var4.setValue(ak2.n(xy2.h));
                }
                break;
            default:
                n82 n82Var = (n82) obj5;
                os1Var2.setValue(n82Var.a);
                os1Var.setValue(Boolean.FALSE);
                ((ot0) obj4).h(new d82((String) obj3, ((e92) obj2).b, ((s82) ((d92) obj)).a, "string", n82Var.a));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ t81(n82 n82Var, ot0 ot0Var, String str, e92 e92Var, d92 d92Var, os1 os1Var, os1 os1Var2) {
        this.i = n82Var;
        this.j = ot0Var;
        this.k = str;
        this.l = e92Var;
        this.m = d92Var;
        this.g = os1Var;
        this.h = os1Var2;
    }
}
