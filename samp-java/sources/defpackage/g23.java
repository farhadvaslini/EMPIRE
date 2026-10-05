package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class g23 {
    public static final r93 a = new r93(new f62(16));

    public static final z13 a(b23 b23Var, nv0 nv0Var) {
        f23 f23Var = (f23) nv0Var.j(a);
        switch (b23Var.ordinal()) {
            case 0:
                return f23Var.h;
            case 1:
                return f23Var.e;
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                return f23Var.g;
            case oc2.INTEGER_FIELD_NUMBER /* 3 */:
                return b(f23Var.e);
            case oc2.LONG_FIELD_NUMBER /* 4 */:
                return f23Var.a;
            case oc2.STRING_FIELD_NUMBER /* 5 */:
                return b(f23Var.a);
            case oc2.STRING_SET_FIELD_NUMBER /* 6 */:
                return uo2.a;
            case oc2.DOUBLE_FIELD_NUMBER /* 7 */:
                return f23Var.d;
            case 8:
                to2 to2Var = f23Var.d;
                kd0 kd0Var = a23.i;
                return to2.b(to2Var, kd0Var, null, null, kd0Var, 6);
            case vr.g /* 9 */:
                return f23Var.f;
            case vr.h /* 10 */:
                to2 to2Var2 = f23Var.d;
                kd0 kd0Var2 = a23.i;
                return to2.b(to2Var2, null, kd0Var2, kd0Var2, null, 9);
            case 11:
                return b(f23Var.d);
            case vr.i /* 12 */:
                return f23Var.c;
            case 13:
                return cl3.q0;
            case 14:
                return f23Var.b;
            default:
                c.k();
                return null;
        }
    }

    public static to2 b(to2 to2Var) {
        kd0 kd0Var = a23.i;
        return to2.b(to2Var, null, null, kd0Var, kd0Var, 3);
    }
}
