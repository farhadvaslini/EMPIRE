package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class h33 {
    public static final d33 a;
    public static final is1 b;

    static {
        n92.F(0.0f, 400.0f, mr3.a, 1);
        a = new d33();
        b = new is1();
    }

    public static final void a(bq1 bq1Var, d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(646379026);
        int i2 = i | 6;
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            b(gq.N(1948801580, new e33(d00Var), nv0Var), nv0Var, 6);
            bq1Var = yp1.a;
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new f33(bq1Var, d00Var, i);
        }
    }

    public static final void b(d00 d00Var, nv0 nv0Var, int i) {
        nv0Var.b0(1908320054);
        if (nv0Var.R(i & 1, (i & 3) != 2)) {
            ur.e(gq.N(2062852661, new g33(d00Var), nv0Var), nv0Var, 6);
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new ld(d00Var, i);
        }
    }
}
