package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v4 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ zs0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ v4(d00 d00Var, Object obj, Object obj2, Object obj3, int i) {
        this.f = 2;
        this.g = d00Var;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.h = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        int i2 = this.h;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.k;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e5.d((cs0) obj4, (bq1) obj3, (nb0) obj5, (d00) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                vm1.f((ub2) obj4, (d00) zs0Var, (jj3) obj3, (d00) obj5, (nv0) obj, jo3.y(i2 | 1));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2) | 1;
                ((d00) zs0Var).n(this.i, this.j, this.k, (nv0) obj, iY);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                lq.i((Boolean) obj4, this.j, (of1) obj5, (ns0) zs0Var, (nv0) obj, iY2);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                fh1.a((ep2) obj5, (cs0) obj4, (bq1) obj3, (d00) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                um1.b((fy) obj4, (f23) obj3, (ol3) obj5, (d00) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(1);
                p03.g(this.h, (cs0) obj4, (cs0) obj3, (ir) obj5, (gt0) zs0Var, (nv0) obj, iY3);
                break;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                int iY4 = jo3.y(1);
                p03.i(this.h, (cs0) obj4, (cs0) obj3, (ot0) obj5, (qt0) zs0Var, (nv0) obj, iY4);
                break;
            case 8:
                cs0 cs0Var = (cs0) obj4;
                cs0 cs0Var2 = (cs0) zs0Var;
                ((Integer) obj2).intValue();
                int iY5 = jo3.y(i2 | 1);
                g12.c(iY5, cs0Var, cs0Var2, (ns0) obj5, (nv0) obj, (String) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                g12.g((String) obj3, (String) obj5, (cs0) obj4, (d00) zs0Var, (nv0) obj, jo3.y(i2 | 1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ v4(int i, cs0 cs0Var, cs0 cs0Var2, zs0 zs0Var, zs0 zs0Var2, int i2, int i3) {
        this.f = i3;
        this.h = i;
        this.i = cs0Var;
        this.j = cs0Var2;
        this.k = zs0Var;
        this.g = zs0Var2;
    }

    public /* synthetic */ v4(ub2 ub2Var, d00 d00Var, jj3 jj3Var, d00 d00Var2, int i) {
        this.f = 1;
        this.i = ub2Var;
        this.g = d00Var;
        this.j = jj3Var;
        this.k = d00Var2;
        this.h = i;
    }

    public /* synthetic */ v4(ep2 ep2Var, cs0 cs0Var, bq1 bq1Var, d00 d00Var, int i) {
        this.f = 4;
        this.k = ep2Var;
        this.i = cs0Var;
        this.j = bq1Var;
        this.g = d00Var;
        this.h = i;
    }

    public /* synthetic */ v4(Object obj, Object obj2, Object obj3, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.i = obj;
        this.j = obj2;
        this.k = obj3;
        this.g = zs0Var;
        this.h = i;
    }

    public /* synthetic */ v4(String str, Object obj, cs0 cs0Var, zs0 zs0Var, int i, int i2) {
        this.f = i2;
        this.j = str;
        this.k = obj;
        this.i = cs0Var;
        this.g = zs0Var;
        this.h = i;
    }
}
