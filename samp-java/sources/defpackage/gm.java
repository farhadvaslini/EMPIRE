package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class gm implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ gm(bq1 bq1Var, h53 h53Var, boolean z, qr1 qr1Var, d00 d00Var, d00 d00Var2, int i) {
        this.f = 5;
        this.i = bq1Var;
        this.j = h53Var;
        this.g = z;
        this.k = qr1Var;
        this.m = d00Var;
        this.l = d00Var2;
        this.h = i;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        int i2 = this.h;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.m;
        Object obj7 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                vm1.o((ub2) obj7, (jj3) obj5, (x50) obj4, this.g, (os1) obj3, (d00) obj6, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(i2 | 1);
                pq.b(this.g, (mi3) obj7, (bq1) obj5, (dt) obj4, (ga3) obj3, (ga3) obj6, (nv0) obj, iY2);
                break;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(i2 | 1);
                m40.c((String) obj7, this.g, (j40) obj5, (bq1) obj4, (ss0) obj3, (cs0) obj6, (nv0) obj, iY3);
                break;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                ((Integer) obj2).getClass();
                int iY4 = jo3.y(i2 | 1);
                gv3.g((bq1) obj7, (cs0) obj5, this.g, (z13) obj4, (m01) obj3, (rs0) obj6, (nv0) obj, iY4);
                break;
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                ((Integer) obj2).getClass();
                int iY5 = jo3.y(i2 | 1);
                gv3.r((cs0) obj7, (bq1) obj5, this.g, (z13) obj4, (m01) obj3, (d00) obj6, (nv0) obj, iY5);
                break;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                ((Integer) obj2).getClass();
                int iY6 = jo3.y(i2 | 1);
                g53.d((bq1) obj7, (h53) obj5, this.g, (qr1) obj4, (d00) obj6, (d00) obj3, (nv0) obj, iY6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY7 = jo3.y(i2 | 1);
                gj3.b((ub2) obj7, (d00) obj6, (jj3) obj5, (bq1) obj4, this.g, (d00) obj3, (nv0) obj, iY7);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ gm(ub2 ub2Var, d00 d00Var, jj3 jj3Var, bq1 bq1Var, boolean z, d00 d00Var2, int i) {
        this.f = 6;
        this.i = ub2Var;
        this.m = d00Var;
        this.j = jj3Var;
        this.k = bq1Var;
        this.g = z;
        this.l = d00Var2;
        this.h = i;
    }

    public /* synthetic */ gm(ub2 ub2Var, jj3 jj3Var, x50 x50Var, boolean z, os1 os1Var, d00 d00Var, int i) {
        this.f = 0;
        this.i = ub2Var;
        this.j = jj3Var;
        this.k = x50Var;
        this.g = z;
        this.l = os1Var;
        this.m = d00Var;
        this.h = i;
    }

    public /* synthetic */ gm(Object obj, Object obj2, boolean z, z13 z13Var, m01 m01Var, rs0 rs0Var, int i, int i2) {
        this.f = i2;
        this.i = obj;
        this.j = obj2;
        this.g = z;
        this.k = z13Var;
        this.l = m01Var;
        this.m = rs0Var;
        this.h = i;
    }

    public /* synthetic */ gm(String str, boolean z, j40 j40Var, bq1 bq1Var, ss0 ss0Var, cs0 cs0Var, int i) {
        this.f = 2;
        this.i = str;
        this.g = z;
        this.j = j40Var;
        this.k = bq1Var;
        this.l = ss0Var;
        this.m = cs0Var;
        this.h = i;
    }

    public /* synthetic */ gm(boolean z, mi3 mi3Var, bq1 bq1Var, dt dtVar, ga3 ga3Var, ga3 ga3Var2, int i) {
        this.f = 1;
        this.g = z;
        this.i = mi3Var;
        this.j = bq1Var;
        this.k = dtVar;
        this.l = ga3Var;
        this.m = ga3Var2;
        this.h = i;
    }
}
