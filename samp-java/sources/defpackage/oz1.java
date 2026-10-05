package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class oz1 extends o02 {
    public static final oz1 c = new oz1(0, 2, 1);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        int i;
        n41 n41Var = (n41) lxVar.e(0);
        int iC = m53Var.c((iv0) lxVar.e(1));
        if (m53Var.t >= iC) {
            e20.a("Check failed");
        }
        pq.R(m53Var, wiVar, iC);
        int i2 = m53Var.t;
        int iE = m53Var.v;
        while (iE >= 0 && !m53Var.y(iE)) {
            iE = m53Var.E(m53Var.b, iE);
        }
        int iU = iE + 1;
        int iL = 0;
        while (iU < i2) {
            if (m53Var.v(i2, iU)) {
                if (m53Var.y(iU)) {
                    iL = 0;
                }
                iU++;
            } else {
                iL += m53Var.y(iU) ? 1 : m53Var.b[(m53Var.r(iU) * 5) + 1] & 67108863;
                iU += m53Var.u(iU);
            }
        }
        while (true) {
            i = m53Var.t;
            if (i >= iC) {
                break;
            }
            if (m53Var.v(iC, i)) {
                int i3 = m53Var.t;
                if (i3 < m53Var.u && (m53Var.b[(m53Var.r(i3) * 5) + 1] & 1073741824) != 0) {
                    wiVar.d(m53Var.D(m53Var.t));
                    iL = 0;
                }
                m53Var.P();
            } else {
                iL += m53Var.L();
            }
        }
        if (i != iC) {
            e20.a("Check failed");
        }
        n41Var.a = iL;
    }
}
