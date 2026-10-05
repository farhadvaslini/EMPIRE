package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class wa1 {
    public static final wa1 a;

    static {
        wa1 wa1Var = new wa1();
        if (jd0.a(0.0f, 0.0f) < 0 || jd0.a(0.0f, 0.0f) < 0 || jd0.a(0.0f, 0.0f) < 0 || jd0.a(0.0f, 0.0f) < 0) {
            l21.a("Layer outsets must be non-negative");
        }
        a = wa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa1) && jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f) && jd0.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + nc2.a(nc2.a(Float.hashCode(0.0f) * 31, 0.0f, 31), 0.0f, 31);
    }

    public final String toString() {
        String strC = jd0.c(0.0f);
        String strC2 = jd0.c(0.0f);
        String strC3 = jd0.c(0.0f);
        String strC4 = jd0.c(0.0f);
        StringBuilder sbN = nc2.n("LayerOutsets(left=", strC, ", top=", strC2, ", right=");
        sbN.append(strC3);
        sbN.append(", bottom=");
        sbN.append(strC4);
        sbN.append(")");
        return sbN.toString();
    }
}
