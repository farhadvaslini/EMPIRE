package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ra implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ rs0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ra(d00 d00Var, bq1 bq1Var, d00 d00Var2, ss0 ss0Var, int i, int i2) {
        this.f = 1;
        this.g = d00Var;
        this.j = bq1Var;
        this.k = d00Var2;
        this.l = ss0Var;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        rs0 rs0Var = this.g;
        dm3 dm3Var = dm3.a;
        int i2 = this.h;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xa.a((ub2) obj5, (cs0) obj4, (vb2) obj3, (d00) rs0Var, (nv0) obj, jo3.y(i2 | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                br.k((d00) rs0Var, (bq1) obj5, (d00) obj4, (ss0) obj3, (nv0) obj, jo3.y(i2 | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY = jo3.y(i2 | 1);
                rn.o((List) obj5, (Set) obj4, (ns0) obj3, this.g, (nv0) obj, iY, this.i);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ ra(Object obj, Object obj2, Object obj3, rs0 rs0Var, int i, int i2, int i3) {
        this.f = i3;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
        this.g = rs0Var;
        this.h = i;
        this.i = i2;
    }
}
