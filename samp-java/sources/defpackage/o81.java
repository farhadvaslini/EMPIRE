package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class o81 implements rs0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ ns0 g;
    public final /* synthetic */ cs0 h;
    public final /* synthetic */ cs0 i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ zs0 n;
    public final /* synthetic */ zs0 o;

    public /* synthetic */ o81(cs0 cs0Var, cs0 cs0Var2, cs0 cs0Var3, cs0 cs0Var4, cs0 cs0Var5, cs0 cs0Var6, cs0 cs0Var7, ns0 ns0Var, us0 us0Var, int i) {
        this.h = cs0Var;
        this.i = cs0Var2;
        this.j = cs0Var3;
        this.k = cs0Var4;
        this.l = cs0Var5;
        this.m = cs0Var6;
        this.n = cs0Var7;
        this.g = ns0Var;
        this.o = us0Var;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.o;
        zs0 zs0Var2 = this.n;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(1);
                w7.o(this.h, this.i, (cs0) obj6, (cs0) obj5, (cs0) obj4, (cs0) obj3, (cs0) zs0Var2, this.g, (us0) zs0Var, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                p03.q((y92) obj6, (List) obj5, (List) obj4, (Set) obj3, this.g, (rs0) zs0Var2, (ot0) zs0Var, this.h, this.i, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ o81(y92 y92Var, List list, List list2, Set set, ns0 ns0Var, rs0 rs0Var, ot0 ot0Var, cs0 cs0Var, cs0 cs0Var2, int i) {
        this.j = y92Var;
        this.k = list;
        this.l = list2;
        this.m = set;
        this.g = ns0Var;
        this.n = rs0Var;
        this.o = ot0Var;
        this.h = cs0Var;
        this.i = cs0Var2;
    }
}
