package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class sv implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ ie1 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ cs0 k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ ns0 m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ zs0 q;

    public /* synthetic */ sv(List list, c82 c82Var, z31 z31Var, ns0 ns0Var, ie1 ie1Var, boolean z, cs0 cs0Var, boolean z2, rs0 rs0Var, ns0 ns0Var2, ns0 ns0Var3, int i) {
        this.f = 1;
        this.g = list;
        this.n = c82Var;
        this.o = z31Var;
        this.h = ns0Var;
        this.i = ie1Var;
        this.j = z;
        this.k = cs0Var;
        this.l = z2;
        this.p = rs0Var;
        this.m = ns0Var2;
        this.q = ns0Var3;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zs0 zs0Var = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(2097153);
                w7.f((bv) obj5, this.g, (String) obj4, this.h, this.i, this.j, (hv) obj3, this.l, this.k, (cs0) zs0Var, this.m, (nv0) obj, iY);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                rn.k(this.g, (c82) obj5, (z31) obj4, this.h, this.i, this.j, this.k, this.l, (rs0) obj3, this.m, (ns0) zs0Var, (nv0) obj, iY2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY3 = jo3.y(1);
                rn.d((c82) obj5, this.g, (String) obj4, this.h, this.i, this.j, (i92) obj3, this.l, this.k, (cs0) zs0Var, this.m, (nv0) obj, iY3);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ sv(Object obj, List list, String str, ns0 ns0Var, ie1 ie1Var, boolean z, Object obj2, boolean z2, cs0 cs0Var, cs0 cs0Var2, ns0 ns0Var2, int i, int i2) {
        this.f = i2;
        this.n = obj;
        this.g = list;
        this.o = str;
        this.h = ns0Var;
        this.i = ie1Var;
        this.j = z;
        this.p = obj2;
        this.l = z2;
        this.k = cs0Var;
        this.q = cs0Var2;
        this.m = ns0Var2;
    }
}
