package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class h30 {
    public static final or1 a;

    static {
        eo2 eo2Var = ky.e;
        int i = eo2Var.c;
        e30 e30Var = new e30(eo2Var, eo2Var, 1);
        int i2 = eo2Var.c;
        ny1 ny1Var = ky.x;
        int i3 = (ny1Var.c << 6) | i2;
        g30 g30Var = new g30(eo2Var, ny1Var, 0);
        int i4 = (i2 << 6) | ny1Var.c;
        g30 g30Var2 = new g30(ny1Var, eo2Var, 0);
        or1 or1Var = h41.a;
        or1 or1Var2 = new or1();
        or1Var2.i(i | (i << 6), e30Var);
        or1Var2.i(i3, g30Var);
        or1Var2.i(i4, g30Var2);
        a = or1Var2;
    }
}
