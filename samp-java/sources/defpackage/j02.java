package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class j02 extends o02 {
    public static final j02 c = new j02(1, 0, 2);

    @Override // defpackage.o02
    public final void a(lx lxVar, wi wiVar, m53 m53Var, zk2 zk2Var, p02 p02Var) {
        int iD = lxVar.d(0);
        int i = m53Var.v;
        int iN = m53Var.N(m53Var.b, m53Var.r(i));
        int iG = m53Var.g(m53Var.b, m53Var.r(i + 1));
        for (int iMax = Math.max(iN, iG - iD); iMax < iG; iMax++) {
            Object obj = m53Var.c[m53Var.h(iMax)];
            if (obj instanceof rv0) {
                zk2Var.e((rv0) obj);
            } else if (obj instanceof xj2) {
                ((xj2) obj).c();
            }
        }
        if (iD <= 0) {
            e20.a("Check failed");
        }
        int i2 = m53Var.v;
        int iN2 = m53Var.N(m53Var.b, m53Var.r(i2));
        int iG2 = m53Var.g(m53Var.b, m53Var.r(i2 + 1)) - iD;
        if (iG2 < iN2) {
            e20.a("Check failed");
        }
        m53Var.J(iG2, iD, i2);
        int i3 = m53Var.i;
        if (i3 >= iN2) {
            m53Var.i = i3 - iD;
        }
    }
}
