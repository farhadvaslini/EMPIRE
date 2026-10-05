package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ee2 {
    public final qe1 a;

    public ee2(cs0 cs0Var) {
        this.a = new qe1(cs0Var);
    }

    public abstract he2 a(Object obj);

    public oo3 b() {
        return this.a;
    }

    public final he2 c(ns0 ns0Var) {
        return new he2(this, null, false, null, ns0Var, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034 A[PHI: r4
      0x0034: PHI (r4v2 oo3) = (r4v6 oo3), (r4v7 oo3) binds: [B:21:0x0040, B:16:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final oo3 d(he2 he2Var, oo3 oo3Var) {
        oo3 oo3Var2;
        oo3 oo3Var3 = null;
        oo3Var3 = null;
        oo3Var3 = null;
        oo3Var3 = null;
        oo3Var3 = null;
        oo3Var3 = null;
        if (oo3Var instanceof mg0) {
            if (he2Var.e) {
                mg0 mg0Var = (mg0) oo3Var;
                mg0Var.a.setValue(he2Var.a());
                oo3Var3 = mg0Var;
            }
        } else if (oo3Var instanceof s93) {
            if ((he2Var.b || he2Var.f != null) && !he2Var.e) {
                s93 s93Var = (s93) oo3Var;
                boolean zN = s51.n(he2Var.a(), s93Var.a);
                oo3Var2 = s93Var;
                if (zN) {
                    oo3Var3 = oo3Var2;
                }
            }
        } else if (oo3Var instanceof u20) {
            ns0 ns0Var = he2Var.d;
            u20 u20Var = (u20) oo3Var;
            ns0 ns0Var2 = u20Var.a;
            oo3Var2 = u20Var;
            if (ns0Var == ns0Var2) {
            }
        }
        if (oo3Var3 != null) {
            return oo3Var3;
        }
        if (!he2Var.e) {
            ns0 ns0Var3 = he2Var.d;
            return ns0Var3 != null ? new u20(ns0Var3) : new s93(he2Var.a());
        }
        Object obj = he2Var.f;
        h73 h73Var = he2Var.c;
        if (h73Var == null) {
            h73Var = m22.u;
        }
        return new mg0(new d42(obj, h73Var));
    }
}
