package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ho implements cn1 {
    public final h5 a;
    public final boolean b;

    public ho(h5 h5Var, boolean z) {
        this.a = h5Var;
        this.b = z;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        int iK;
        int iJ;
        i62 i62VarT;
        boolean zIsEmpty = list.isEmpty();
        oi0 oi0Var = oi0.f;
        if (zIsEmpty) {
            return en1Var.I0(m30.k(j), m30.j(j), oi0Var, new u0(19));
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            xm1 xm1Var = (xm1) list.get(0);
            Object objE = xm1Var.E();
            bo boVar = objE instanceof bo ? (bo) objE : null;
            if (boVar != null ? boVar.u : false) {
                iK = m30.k(j);
                iJ = m30.j(j);
                int iK2 = m30.k(j);
                int iJ2 = m30.j(j);
                if (!((iJ2 >= 0) & (iK2 >= 0))) {
                    o21.a("width and height must be >= 0");
                }
                i62VarT = xm1Var.t(n30.h(iK2, iK2, iJ2, iJ2));
            } else {
                i62VarT = xm1Var.t(j2);
                iK = Math.max(m30.k(j), i62VarT.f);
                iJ = Math.max(m30.j(j), i62VarT.g);
            }
            int i = iJ;
            int i2 = iK;
            return en1Var.I0(i2, i, oi0Var, new fo(i62VarT, xm1Var, en1Var, i2, i, this));
        }
        i62[] i62VarArr = new i62[list.size()];
        ok2 ok2Var = new ok2();
        ok2Var.f = m30.k(j);
        ok2 ok2Var2 = new ok2();
        ok2Var2.f = m30.j(j);
        int size = list.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            xm1 xm1Var2 = (xm1) list.get(i3);
            Object objE2 = xm1Var2.E();
            bo boVar2 = objE2 instanceof bo ? (bo) objE2 : null;
            if (boVar2 != null ? boVar2.u : false) {
                z = true;
            } else {
                i62 i62VarT2 = xm1Var2.t(j2);
                i62VarArr[i3] = i62VarT2;
                ok2Var.f = Math.max(ok2Var.f, i62VarT2.f);
                ok2Var2.f = Math.max(ok2Var2.f, i62VarT2.g);
            }
        }
        if (z) {
            int i4 = ok2Var.f;
            int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
            int i6 = ok2Var2.f;
            long jA = n30.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                xm1 xm1Var3 = (xm1) list.get(i7);
                Object objE3 = xm1Var3.E();
                bo boVar3 = objE3 instanceof bo ? (bo) objE3 : null;
                if (boVar3 != null ? boVar3.u : false) {
                    i62VarArr[i7] = xm1Var3.t(jA);
                }
            }
        }
        return en1Var.I0(ok2Var.f, ok2Var2.f, oi0Var, new go(i62VarArr, list, en1Var, ok2Var, ok2Var2, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho)) {
            return false;
        }
        ho hoVar = (ho) obj;
        return s51.n(this.a, hoVar.a) && this.b == hoVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ")";
    }
}
