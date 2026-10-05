package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class q80 {
    public static final ga0 a;

    static {
        String property;
        ga0 ga0Var;
        int i = cc3.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            j90 j90Var = ac0.a;
            jx0 jx0Var = tl1.a;
            jx0 jx0Var2 = jx0Var.k;
            ga0Var = jx0Var;
            if (jx0Var == null) {
                ga0Var = p80.q;
            }
        } else {
            ga0Var = p80.q;
        }
        a = ga0Var;
    }
}
