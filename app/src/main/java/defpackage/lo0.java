package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lo0 {
    public final void a(xm1 xm1Var, xm1 xm1Var2, long j) {
        long jU = ur.u(j, ic1.f);
        if (xm1Var != null) {
            int iM0 = xm1Var.m0(m30.h(jU));
            new d41(d41.a(iM0, xm1Var.x0(iM0)));
        }
        if (xm1Var2 != null) {
            int iM02 = xm1Var2.m0(m30.h(jU));
            new d41(d41.a(iM02, xm1Var2.x0(iM02)));
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof lo0);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + nc2.b(0, ko0.f.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + ko0.f + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
