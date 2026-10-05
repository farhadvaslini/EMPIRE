package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ue3 {
    public static final String a = fa3.b0(10, "H");

    public static long a(gh3 gh3Var, ua0 ua0Var, zp0 zp0Var) {
        y9 y9VarB = b(gh3Var, ua0Var, zp0Var, 1, false);
        return (((long) w22.j(y9VarB.a.a())) << 32) | (((long) w22.j(y9VarB.f)) & 4294967295L);
    }

    public static final y9 b(gh3 gh3Var, ua0 ua0Var, zp0 zp0Var, int i, boolean z) {
        String strX0 = qx.x0(y02.S(0, i), "\n", null, null, new db3(4), 30);
        ni0 ni0Var = ni0.f;
        return new y9(new ca(strX0, gh3Var, ni0Var, ni0Var, zp0Var, ua0Var, z), i, 1, n30.b(0, 0, 0, 0, 15));
    }
}
