package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class ti2 implements rs0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ ti2(int i, boolean z) {
        this.f = i;
        this.g = z;
    }

    @Override // defpackage.rs0
    public final Object f(Object obj, Object obj2) {
        w01 w01VarB;
        long j;
        long j2;
        float f;
        int i = this.f;
        yp1 yp1Var = yp1.a;
        dm3 dm3Var = dm3.a;
        boolean z = this.g;
        switch (i) {
            case 0:
                nv0 nv0Var = (nv0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!nv0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nv0Var.U();
                } else {
                    if (z) {
                        w01VarB = lq.H();
                    } else {
                        w01VarB = pq.f;
                        if (w01VarB == null) {
                            v01 v01Var = new v01("Filled.LockOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = vo3.a;
                            w73 w73Var = new w73(wx.b);
                            tx0 tx0Var = new tx0(1);
                            tx0Var.j(12.0f, 17.0f);
                            tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            tx0Var.l(-0.9f, -2.0f, -2.0f, -2.0f);
                            tx0Var.l(-2.0f, 0.9f, -2.0f, 2.0f);
                            tx0Var.l(0.9f, 2.0f, 2.0f, 2.0f);
                            tx0Var.c();
                            tx0Var.j(18.0f, 8.0f);
                            tx0Var.g(-1.0f);
                            tx0Var.h(17.0f, 6.0f);
                            tx0Var.e(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
                            tx0Var.k(7.0f, 3.24f, 7.0f, 6.0f);
                            tx0Var.g(1.9f);
                            tx0Var.e(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
                            tx0Var.e(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
                            tx0Var.o(2.0f);
                            tx0Var.h(6.0f, 8.0f);
                            tx0Var.e(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                            tx0Var.o(10.0f);
                            tx0Var.e(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                            tx0Var.g(12.0f);
                            tx0Var.e(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                            tx0Var.h(20.0f, 10.0f);
                            tx0Var.e(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                            tx0Var.c();
                            tx0Var.j(18.0f, 20.0f);
                            tx0Var.h(6.0f, 20.0f);
                            tx0Var.h(6.0f, 10.0f);
                            tx0Var.g(12.0f);
                            tx0Var.o(10.0f);
                            tx0Var.c();
                            v01.a(v01Var, tx0Var.a, w73Var);
                            w01VarB = v01Var.b();
                            pq.f = w01VarB;
                        }
                    }
                    w01 w01Var = w01VarB;
                    String strM = oz2.M(2131624539, nv0Var);
                    if (z) {
                        nv0Var.a0(-280538735);
                        j = ((fy) nv0Var.j(hy.a)).a;
                        nv0Var.p(false);
                    } else {
                        nv0Var.a0(-280460088);
                        j = ((fy) nv0Var.j(hy.a)).s;
                        nv0Var.p(false);
                    }
                    s01.a(w01Var, strM, null, j, nv0Var, 0, 4);
                }
                break;
            case 1:
                nv0 nv0Var2 = (nv0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!nv0Var2.R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    nv0Var2.U();
                } else if (!z) {
                    nv0Var2.a0(590078003);
                    s01.a(d32.q(), oz2.M(2131624120, nv0Var2), null, 0L, nv0Var2, 0, 12);
                    nv0Var2.p(false);
                } else {
                    nv0Var2.a0(589883540);
                    xd2.a(j43.k(yp1Var, 20.0f), 0L, 2.0f, 0L, 0, 0.0f, nv0Var2, 390, 58);
                    nv0Var2.p(false);
                }
                break;
            default:
                nv0 nv0Var3 = (nv0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!nv0Var3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    nv0Var3.U();
                } else {
                    w01 w01VarB2 = gv3.B();
                    String strM2 = oz2.M(2131624071, nv0Var3);
                    if (z) {
                        nv0Var3.a0(281097272);
                        j2 = ((fy) nv0Var3.j(hy.a)).q;
                        f = 0.2f;
                    } else {
                        nv0Var3.a0(281099192);
                        j2 = ((fy) nv0Var3.j(hy.a)).q;
                        f = 0.7f;
                    }
                    long jB = wx.b(f, j2);
                    nv0Var3.p(false);
                    s01.a(w01VarB2, strM2, j43.k(yp1Var, 22.0f), jB, nv0Var3, 384, 0);
                }
                break;
        }
        return dm3Var;
    }
}
