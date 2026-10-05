package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa implements cs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qa(x50 x50Var, lf2 lf2Var, String str, cf2 cf2Var, os1 os1Var) {
        this.f = 3;
        this.g = x50Var;
        this.h = lf2Var;
        this.j = str;
        this.i = cf2Var;
        this.k = os1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    @Override // defpackage.cs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj = this.k;
        Object obj2 = this.i;
        Object obj3 = this.j;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                ((rb2) obj5).o((cs0) obj4, (vb2) obj2, (String) obj3, (bb1) obj);
                break;
            case 1:
                ns0 ns0Var = (ns0) obj4;
                ns0 ns0Var2 = (ns0) obj2;
                a42 a42Var = (a42) obj3;
                b42 b42Var = (b42) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i2 = ((n72) obj5).a;
                if (i2 == a42Var.g()) {
                    long jG = jCurrentTimeMillis - b42Var.g();
                    if (1 <= jG && jG < 501) {
                        a42Var.h(-1);
                        b42Var.h(0L);
                        ns0Var.h(-1);
                        ns0Var2.h(Integer.valueOf(i2));
                    } else {
                        a42Var.h(i2);
                        b42Var.h(jCurrentTimeMillis);
                        ns0Var.h(Integer.valueOf(i2));
                    }
                    break;
                }
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((ot0) obj5).h(new d82((String) obj3, ((e92) obj4).b, ((z82) ((d92) obj2)).a, "number", String.valueOf(((z32) obj).g())));
                break;
            default:
                cl3.t((x50) obj5, null, new n9((lf2) obj4, (String) obj3, (cf2) obj2, (os1) obj, null, 16), 3);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ qa(ot0 ot0Var, String str, e92 e92Var, d92 d92Var, z32 z32Var) {
        this.f = 2;
        this.g = ot0Var;
        this.j = str;
        this.h = e92Var;
        this.i = d92Var;
        this.k = z32Var;
    }

    public /* synthetic */ qa(Object obj, zs0 zs0Var, Object obj2, Object obj3, Object obj4, int i) {
        this.f = i;
        this.g = obj;
        this.h = zs0Var;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
    }
}
