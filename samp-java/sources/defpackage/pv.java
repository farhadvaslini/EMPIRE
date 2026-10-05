package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class pv implements rs0 {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ cs0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ns0 j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ pv(cs0 cs0Var, boolean z, boolean z2, ns0 ns0Var, ns0 ns0Var2, cs0 cs0Var2, int i) {
        this.g = cs0Var;
        this.h = z;
        this.i = z2;
        this.j = ns0Var;
        this.k = ns0Var2;
        this.l = cs0Var2;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        Object obj3 = this.l;
        Object obj4 = this.k;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = jo3.y(196609);
                w7.m((List) obj4, (ie1) obj3, this.h, this.g, this.i, this.j, (nv0) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = jo3.y(1);
                g12.l(this.g, this.h, this.i, this.j, (ns0) obj4, (cs0) obj3, (nv0) obj, iY2);
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ pv(List list, ie1 ie1Var, boolean z, cs0 cs0Var, boolean z2, ns0 ns0Var, int i) {
        this.k = list;
        this.l = ie1Var;
        this.h = z;
        this.g = cs0Var;
        this.i = z2;
        this.j = ns0Var;
    }
}
