package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public class jx1 {
    public final qs1 a = new qs1(new xw1[16]);
    public final as1 b = new as1(10);

    public boolean a(xk1 xk1Var, ab1 ab1Var, g51 g51Var, boolean z) {
        qs1 qs1Var = this.a;
        Object[] objArr = qs1Var.f;
        int i = qs1Var.h;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((xw1) objArr[i2]).a(xk1Var, ab1Var, g51Var, z) || z2;
        }
        return z2;
    }

    public void b(g51 g51Var) {
        qs1 qs1Var = this.a;
        int i = qs1Var.h;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((xw1) qs1Var.f[i]).d.a == 0) {
                qs1Var.k(i);
            }
        }
    }
}
