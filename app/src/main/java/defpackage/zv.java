package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ zv(nm2 nm2Var, cs0 cs0Var, boolean z, int i) {
        this.f = 2;
        this.h = nm2Var;
        this.i = cs0Var;
        this.g = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.i;
        boolean z = this.g;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                w7.l((x31) obj4, z, (cs0) obj3, (nv0) obj, jo3.y(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((kk0) obj4).a(z, (bq1) obj3, (nv0) obj, jo3.y(385));
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                gv3.k((nm2) obj4, (cs0) obj3, z, (nv0) obj, jo3.y(1));
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                ((qt2) obj4).b(z, (rs0) obj3, (nv0) obj, jo3.y(3073));
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                p03.d((im0) obj4, z, (ns0) obj3, (nv0) obj, jo3.y(1));
                break;
            default:
                ((Integer) obj2).getClass();
                p03.f((rw1) obj4, z, (ns0) obj3, (nv0) obj, jo3.y(1));
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ zv(Object obj, boolean z, Object obj2, int i, int i2) {
        this.f = i2;
        this.h = obj;
        this.g = z;
        this.i = obj2;
    }
}
