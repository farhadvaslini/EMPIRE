package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class hh0 {
    public static final zk3 a;
    public static final zk3 b;
    public static final zk3 c;

    static {
        l60 l60Var = new l60(0.4f, 0.0f, 0.6f, 1.0f);
        a = new zk3(120, 0, pg0.a);
        b = new zk3(150, 0, l60Var);
        c = new zk3(120, 0, l60Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 zk3) = (r1v0 zk3), (r1v0 zk3), (r1v0 zk3), (r1v4 zk3), (r1v4 zk3), (r1v4 zk3), (r1v4 zk3) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ed edVar, float f, s41 s41Var, s41 s41Var2, mb3 mb3Var) {
        zk3 zk3Var;
        zk3 zk3Var2 = null;
        if (s41Var2 != null) {
            boolean z = s41Var2 instanceof zc2;
            zk3Var = a;
            if (z || (s41Var2 instanceof ue0) || (s41Var2 instanceof zy0) || (s41Var2 instanceof wo0)) {
                zk3Var2 = zk3Var;
            }
        } else if (s41Var != null) {
            boolean z2 = s41Var instanceof zc2;
            zk3Var = b;
            if (!z2 && !(s41Var instanceof ue0)) {
                if (s41Var instanceof zy0) {
                    zk3Var2 = c;
                } else if (s41Var instanceof wo0) {
                }
            }
        }
        zk3 zk3Var3 = zk3Var2;
        y50 y50Var = y50.f;
        if (zk3Var3 != null) {
            Object objC = ed.c(edVar, new jd0(f), zk3Var3, null, mb3Var, 12);
            if (objC == y50Var) {
                return objC;
            }
        } else {
            Object objF = edVar.f(mb3Var, new jd0(f));
            if (objF == y50Var) {
                return objF;
            }
        }
        return dm3.a;
    }
}
