package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m12 {
    public static final t20 a = new t20(new fi1(29));

    public static final bq1 a(bq1 bq1Var) {
        return bq1Var.d(new n12());
    }

    public static final w8 b(nv0 nv0Var) {
        nv0Var.a0(282942128);
        x8 x8Var = (x8) nv0Var.j(a);
        if (x8Var == null) {
            nv0Var.p(false);
            return null;
        }
        boolean zF = nv0Var.f(x8Var);
        Object objO = nv0Var.O();
        if (zF || objO == c20.a) {
            Object w8Var = new w8(x8Var.a, x8Var.b, x8Var.c, x8Var.d);
            nv0Var.j0(w8Var);
            objO = w8Var;
        }
        w8 w8Var2 = (w8) objO;
        nv0Var.p(false);
        return w8Var2;
    }
}
