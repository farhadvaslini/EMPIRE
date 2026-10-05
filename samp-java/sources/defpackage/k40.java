package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k40 {
    public final l73 a = new l73();

    public static void b(k40 k40Var, rs0 rs0Var, d00 d00Var, cs0 cs0Var, int i) {
        if ((i & 8) != 0) {
            d00Var = null;
        }
        k40Var.a.add(new d00(-1789283891, new bd1(rs0Var, k40Var, d00Var, cs0Var), true));
    }

    public final void a(j40 j40Var, nv0 nv0Var, int i) {
        nv0Var.b0(-798501095);
        int i2 = (nv0Var.f(j40Var) ? 4 : 2) | i | (nv0Var.f(this) ? 32 : 16);
        if (nv0Var.R(i2 & 1, (i2 & 19) != 18)) {
            l73 l73Var = this.a;
            int size = l73Var.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ss0) l73Var.get(i3)).e(j40Var, nv0Var, Integer.valueOf(i2 & 14));
            }
        } else {
            nv0Var.U();
        }
        xj2 xj2VarT = nv0Var.t();
        if (xj2VarT != null) {
            xj2VarT.d = new y7(i, 6, this, j40Var);
        }
    }
}
