package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class k32 {
    public static final j32 a;
    public static final y22 b;

    static {
        j32 j32Var = new j32(0);
        a = j32Var;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        b = new y22(i, i2, i3, i4, 0, 0, m22.t, new je1(1), ur.c(li0.f), j32Var, n30.b(0, 0, 0, 0, 15));
    }

    public static final long a(y22 y22Var, int i) {
        int i2 = y22Var.c;
        long j = (((((long) i) * ((long) (y22Var.b + i2))) + ((long) (-y22Var.f))) + ((long) y22Var.d)) - ((long) i2);
        int i3 = (int) (y22Var.e == t02.g ? y22Var.i() >> 32 : y22Var.i() & 4294967295L);
        y22Var.n.getClass();
        long jH = j - ((long) (i3 - y02.h(0, 0, i3)));
        if (jH < 0) {
            return 0L;
        }
        return jH;
    }

    public static final i90 b(cs0 cs0Var, nv0 nv0Var, int i) {
        Object[] objArr = new Object[0];
        ar2 ar2Var = i90.G;
        boolean zD = ((((i & 896) ^ 384) > 256 && nv0Var.f(cs0Var)) || (i & 384) == 256) | nv0Var.d(0) | nv0Var.c(0.0f);
        Object objO = nv0Var.O();
        if (zD || objO == c20.a) {
            objO = new lx0(cs0Var, 3);
            nv0Var.j0(objO);
        }
        i90 i90Var = (i90) oz2.H(objArr, ar2Var, (cs0) objO, nv0Var, 0);
        i90Var.F.setValue(cs0Var);
        return i90Var;
    }
}
