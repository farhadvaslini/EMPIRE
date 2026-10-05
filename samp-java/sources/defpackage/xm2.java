package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class xm2 implements ss0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ hd0 g;
    public final /* synthetic */ al0 h;
    public final /* synthetic */ nm2 i;
    public final /* synthetic */ cs0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ g83 l;
    public final /* synthetic */ os1 m;
    public final /* synthetic */ ns0 n;
    public final /* synthetic */ cs0 o;
    public final /* synthetic */ cs0 p;
    public final /* synthetic */ ns0 q;
    public final /* synthetic */ cs0 r;
    public final /* synthetic */ cs0 s;
    public final /* synthetic */ ns0 t;
    public final /* synthetic */ cs0 u;
    public final /* synthetic */ cs0 v;
    public final /* synthetic */ vl1 w;

    public /* synthetic */ xm2(hd0 hd0Var, al0 al0Var, nm2 nm2Var, cs0 cs0Var, boolean z, g83 g83Var, os1 os1Var, ns0 ns0Var, cs0 cs0Var2, cs0 cs0Var3, ns0 ns0Var2, cs0 cs0Var4, cs0 cs0Var5, ns0 ns0Var3, cs0 cs0Var6, cs0 cs0Var7, vl1 vl1Var, int i) {
        this.f = i;
        this.g = hd0Var;
        this.h = al0Var;
        this.i = nm2Var;
        this.j = cs0Var;
        this.k = z;
        this.l = g83Var;
        this.m = os1Var;
        this.n = ns0Var;
        this.o = cs0Var2;
        this.p = cs0Var3;
        this.q = ns0Var2;
        this.r = cs0Var4;
        this.s = cs0Var5;
        this.t = ns0Var3;
        this.u = cs0Var6;
        this.v = cs0Var7;
        this.w = vl1Var;
    }

    @Override // defpackage.ss0
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        switch (i) {
            case 0:
                ry ryVar = (ry) obj;
                nv0 nv0Var = (nv0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ryVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= nv0Var.f(ryVar) ? 4 : 2;
                }
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    nv0Var.U();
                } else {
                    hd0 hd0Var = this.g;
                    boolean z = hd0Var instanceof gd0;
                    al0 al0Var = this.h;
                    boolean z2 = (z && (al0Var instanceof zk0)) ? false : true;
                    ij0 ij0VarA = dj0.e(13).a(dj0.f(null, 3));
                    ek0 ek0VarA = dj0.j(13).a(dj0.g(null, 3));
                    cs0 cs0Var = this.r;
                    cs0 cs0Var2 = this.s;
                    ns0 ns0Var = this.t;
                    ns0 ns0Var2 = this.q;
                    vm1.b(ryVar, z2, null, ij0VarA, ek0VarA, null, gq.N(1563630404, new bz2(hd0Var, al0Var, cs0Var, cs0Var2, ns0Var, ns0Var2, this.u, this.v), nv0Var), nv0Var, (iIntValue & 14) | 1600512, 18);
                    gv3.k(this.i, this.j, this.k, nv0Var, 0);
                    os1 os1Var = this.m;
                    String str = (String) os1Var.getValue();
                    boolean z3 = hd0Var instanceof ed0;
                    boolean zF = nv0Var.f(os1Var);
                    Object objO = nv0Var.O();
                    if (zF || objO == c20.a) {
                        objO = new zb(os1Var, 20);
                        nv0Var.j0(objO);
                    }
                    w7.v(this.l, str, z3, (ns0) objO, this.n, this.o, this.p, ns0Var2, nv0Var, 0);
                    gv3.m(oz2.M(2131624307, nv0Var), gq.N(-1824855293, new ir(11, this.w), nv0Var), nv0Var, 48);
                }
                break;
            default:
                nv0 nv0Var2 = (nv0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((io) obj).getClass();
                if (!nv0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nv0Var2.U();
                } else {
                    gv3.i(oz2.M(2131624345, nv0Var2), gq.N(-1604366052, new xm2(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, 0), nv0Var2), nv0Var2, 48);
                }
                break;
        }
        return dm3Var;
    }
}
