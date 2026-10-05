package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nd0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nd0) && jd0.b(10.0f, 10.0f) && jd0.b(40.0f, 40.0f) && jd0.b(10.0f, 10.0f) && jd0.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + nc2.a(nc2.a(nc2.a(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        String strC = jd0.c(10.0f);
        String strC2 = jd0.c(40.0f);
        String strC3 = jd0.c(10.0f);
        String strC4 = jd0.c(40.0f);
        StringBuilder sbN = nc2.n("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end=");
        sbN.append(strC3);
        sbN.append(", bottom=");
        sbN.append(strC4);
        sbN.append(", isLayoutDirectionAware=true)");
        return sbN.toString();
    }
}
