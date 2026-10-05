package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class rv implements ss0 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ ie1 g;
    public final /* synthetic */ ns0 h;
    public final /* synthetic */ List i;
    public final /* synthetic */ ns0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ zs0 n;
    public final /* synthetic */ Object o;

    public /* synthetic */ rv(ie1 ie1Var, z31 z31Var, ns0 ns0Var, List list, List list2, rs0 rs0Var, ns0 ns0Var2, ns0 ns0Var3, boolean z) {
        this.g = ie1Var;
        this.l = z31Var;
        this.h = ns0Var;
        this.i = list;
        this.m = list2;
        this.n = rs0Var;
        this.j = ns0Var2;
        this.o = ns0Var3;
        this.k = z;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        zj zjVar = c20.a;
        Object obj4 = this.o;
        zs0 zs0Var = this.n;
        Object obj5 = this.m;
        Object obj6 = this.l;
        switch (i) {
            case 0:
                String str = (String) obj6;
                bv bvVar = (bv) obj5;
                cs0 cs0Var = (cs0) zs0Var;
                hv hvVar = (hv) obj4;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nv0Var.U();
                } else {
                    gm0 gm0Var = j43.c;
                    jj jjVar = new jj(12.0f, true, new c(1));
                    boolean zF = nv0Var.f(str);
                    ns0 ns0Var = this.h;
                    boolean zF2 = zF | nv0Var.f(ns0Var) | nv0Var.h(bvVar) | nv0Var.f(cs0Var);
                    boolean z = this.k;
                    boolean zG = zF2 | nv0Var.g(z);
                    List list = this.i;
                    boolean zH = zG | nv0Var.h(list) | nv0Var.h(hvVar);
                    ns0 ns0Var2 = this.j;
                    boolean zF3 = zH | nv0Var.f(ns0Var2);
                    Object objO = nv0Var.O();
                    if (zF3 || objO == zjVar) {
                        uv uvVar = new uv(bvVar, str, ns0Var, cs0Var, z, list, hvVar, ns0Var2);
                        nv0Var.j0(uvVar);
                        objO = uvVar;
                    }
                    dn0.a(gm0Var, this.g, null, jjVar, (ns0) objO, nv0Var, 3078, 4);
                }
                break;
            case 1:
                z31 z31Var = (z31) obj6;
                List list2 = (List) obj5;
                rs0 rs0Var = (rs0) zs0Var;
                ns0 ns0Var3 = (ns0) obj4;
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    gm0 gm0Var2 = j43.c;
                    jj jjVar2 = new jj(12.0f, true, new c(1));
                    boolean zD = nv0Var2.d(z31Var.ordinal());
                    ns0 ns0Var4 = this.h;
                    boolean zF4 = zD | nv0Var2.f(ns0Var4);
                    List list3 = this.i;
                    boolean zH2 = zF4 | nv0Var2.h(list3) | nv0Var2.h(list2) | nv0Var2.f(rs0Var);
                    ns0 ns0Var5 = this.j;
                    boolean zF5 = zH2 | nv0Var2.f(ns0Var5) | nv0Var2.f(ns0Var3);
                    boolean z2 = this.k;
                    boolean zG2 = zF5 | nv0Var2.g(z2);
                    Object objO2 = nv0Var2.O();
                    if (zG2 || objO2 == zjVar) {
                        uv uvVar2 = new uv(list3, list2, z31Var, ns0Var4, rs0Var, ns0Var5, ns0Var3, z2);
                        nv0Var2.j0(uvVar2);
                        objO2 = uvVar2;
                    }
                    dn0.a(gm0Var2, this.g, null, jjVar2, (ns0) objO2, nv0Var2, 3078, 4);
                }
                break;
            default:
                String str2 = (String) obj6;
                c82 c82Var = (c82) obj5;
                cs0 cs0Var2 = (cs0) zs0Var;
                i92 i92Var = (i92) obj4;
                nv0 nv0Var3 = (nv0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nv0Var3.U();
                } else {
                    gm0 gm0Var3 = j43.c;
                    jj jjVar3 = new jj(12.0f, true, new c(1));
                    boolean zF6 = nv0Var3.f(str2);
                    ns0 ns0Var6 = this.h;
                    boolean zF7 = zF6 | nv0Var3.f(ns0Var6) | nv0Var3.h(c82Var) | nv0Var3.f(cs0Var2);
                    List list4 = this.i;
                    boolean zH3 = zF7 | nv0Var3.h(list4) | nv0Var3.h(i92Var);
                    boolean z3 = this.k;
                    boolean zG3 = zH3 | nv0Var3.g(z3);
                    ns0 ns0Var7 = this.j;
                    boolean zF8 = zG3 | nv0Var3.f(ns0Var7);
                    Object objO3 = nv0Var3.O();
                    if (zF8 || objO3 == zjVar) {
                        objO3 = new uv(c82Var, str2, ns0Var6, cs0Var2, list4, i92Var, z3, ns0Var7);
                        nv0Var3.j0(objO3);
                    }
                    dn0.a(gm0Var3, this.g, null, jjVar3, (ns0) objO3, nv0Var3, 3078, 4);
                }
                break;
        }
        return dm3Var;
    }

    public /* synthetic */ rv(ie1 ie1Var, String str, ns0 ns0Var, bv bvVar, cs0 cs0Var, boolean z, List list, hv hvVar, ns0 ns0Var2) {
        this.g = ie1Var;
        this.l = str;
        this.h = ns0Var;
        this.m = bvVar;
        this.n = cs0Var;
        this.k = z;
        this.i = list;
        this.o = hvVar;
        this.j = ns0Var2;
    }

    public /* synthetic */ rv(ie1 ie1Var, String str, ns0 ns0Var, c82 c82Var, cs0 cs0Var, List list, i92 i92Var, boolean z, ns0 ns0Var2) {
        this.g = ie1Var;
        this.l = str;
        this.h = ns0Var;
        this.m = c82Var;
        this.n = cs0Var;
        this.i = list;
        this.o = i92Var;
        this.k = z;
        this.j = ns0Var2;
    }
}
