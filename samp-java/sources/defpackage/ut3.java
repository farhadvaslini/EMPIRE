package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class ut3 {
    public static final or1 a;
    public static final st3[] b;

    static {
        or1 or1Var = new or1(8);
        st3.a.getClass();
        tt3 tt3Var = rt3.g;
        or1Var.i(1, tt3Var);
        tt3 tt3Var2 = rt3.f;
        or1Var.i(2, tt3Var2);
        tt3 tt3Var3 = rt3.b;
        or1Var.i(4, tt3Var3);
        tt3 tt3Var4 = rt3.d;
        or1Var.i(8, tt3Var4);
        tt3 tt3Var5 = rt3.h;
        or1Var.i(16, tt3Var5);
        tt3 tt3Var6 = rt3.e;
        or1Var.i(32, tt3Var6);
        tt3 tt3Var7 = rt3.i;
        or1Var.i(64, tt3Var7);
        tt3 tt3Var8 = rt3.c;
        or1Var.i(128, tt3Var8);
        a = or1Var;
        b = new st3[]{tt3Var, tt3Var2, tt3Var3, tt3Var7, tt3Var5, tt3Var6, tt3Var4, rt3.j, tt3Var8};
    }

    public static final void a(zk1 zk1Var, t21 t21Var, long j, int i, int i2) {
        if (w22.r(j, -1L)) {
            return;
        }
        zk1Var.i(t21Var.b(), (int) ((j >>> 48) & 65535));
        zk1Var.i(t21Var.d(), (int) ((j >>> 32) & 65535));
        zk1Var.i(t21Var.c(), i - ((int) ((j >>> 16) & 65535)));
        zk1Var.i(t21Var.a(), i2 - ((int) (j & 65535)));
    }
}
