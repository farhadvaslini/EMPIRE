package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class gd {
    public static final s83 a = n92.F(0.0f, 0.0f, null, 7);

    static {
        jk2 jk2Var = mr3.a;
        n92.F(0.0f, 0.0f, new jd0(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final e93 a(float f, s83 s83Var, nv0 nv0Var) {
        return c(new jd0(f), rn.h1, s83Var, null, "DpAnimation", nv0Var, 0, 8);
    }

    public static final e93 b(float f, s83 s83Var, String str, nv0 nv0Var, int i, int i2) {
        int i3 = i2 & 2;
        s83 s83Var2 = a;
        if (i3 != 0) {
            s83Var = s83Var2;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (s83Var == s83Var2) {
            nv0Var.a0(1144115775);
            boolean zC = nv0Var.c(0.01f);
            Object objO = nv0Var.O();
            if (zC || objO == c20.a) {
                objO = n92.F(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                nv0Var.j0(objO);
            }
            s83Var = (s83) objO;
            nv0Var.p(false);
        } else {
            nv0Var.a0(1144225701);
            nv0Var.p(false);
        }
        return c(Float.valueOf(f), rn.f1, s83Var, null, str2, nv0Var, (i << 3) & 57344, 0);
    }

    public static final e93 c(Object obj, bl3 bl3Var, oe oeVar, Float f, String str, nv0 nv0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objO = nv0Var.O();
        Object obj2 = c20.a;
        if (objO == obj2) {
            objO = b32.w(null);
            nv0Var.j0(objO);
        }
        os1 os1Var = (os1) objO;
        Object objO2 = nv0Var.O();
        if (objO2 == obj2) {
            objO2 = new ed(obj, bl3Var, f);
            nv0Var.j0(objO2);
        }
        ed edVar = (ed) objO2;
        Object objZ = b32.z(null, nv0Var);
        if (f != null && (oeVar instanceof s83)) {
            s83 s83Var = (s83) oeVar;
            if (!s51.n(s83Var.c, f)) {
                oeVar = new s83(s83Var.a, s83Var.b, f);
            }
        }
        Object objZ2 = b32.z(oeVar, nv0Var);
        Object objO3 = nv0Var.O();
        if (objO3 == obj2) {
            objO3 = lr.a(-1, 6, null);
            nv0Var.j0(objO3);
        }
        Object obj3 = (js) objO3;
        boolean zH = nv0Var.h(obj3) | nv0Var.h(obj);
        Object objO4 = nv0Var.O();
        if (zH || objO4 == obj2) {
            objO4 = new u1(4, obj3, obj);
            nv0Var.j0(objO4);
        }
        rn.t((cs0) objO4, nv0Var);
        boolean zH2 = nv0Var.h(obj3) | nv0Var.h(edVar) | nv0Var.f(objZ2) | nv0Var.f(objZ);
        Object objO5 = nv0Var.O();
        if (zH2 || objO5 == obj2) {
            Object fdVar = new fd(obj3, edVar, objZ2, objZ, null, 0);
            nv0Var.j0(fdVar);
            objO5 = fdVar;
        }
        rn.l((rs0) objO5, nv0Var, obj3);
        e93 e93Var = (e93) os1Var.getValue();
        return e93Var == null ? edVar.c : e93Var;
    }
}
