package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class qy implements cn1, ap2 {
    public final kj a;
    public final tm b;

    public qy(kj kjVar, tm tmVar) {
        this.a = kjVar;
        this.b = tmVar;
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
        int iP0 = k51Var.p0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            xm1 xm1Var = (xm1) list.get(i3);
            float fS = b32.s(b32.p(xm1Var));
            int iY = xm1Var.y(i);
            if (fS == 0.0f) {
                i2 += iY;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iY / fS));
            }
        }
        return ((list.size() - 1) * iP0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
        int iP0 = k51Var.p0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iP0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            xm1 xm1Var = (xm1) list.get(i2);
            float fS = b32.s(b32.p(xm1Var));
            if (fS == 0.0f) {
                int iMin2 = Math.min(xm1Var.y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, xm1Var.u0(iMin2));
            } else if (fS > 0.0f) {
                f += fS;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            xm1 xm1Var2 = (xm1) list.get(i3);
            float fS2 = b32.s(b32.p(xm1Var2));
            if (fS2 > 0.0f) {
                iMax = Math.max(iMax, xm1Var2.u0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        return d32.u(this, m30.j(j), m30.k(j), m30.h(j), m30.i(j), en1Var.p0(this.a.a()), en1Var, list, new i62[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
        int iP0 = k51Var.p0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            xm1 xm1Var = (xm1) list.get(i3);
            float fS = b32.s(b32.p(xm1Var));
            int iX0 = xm1Var.x0(i);
            if (fS == 0.0f) {
                i2 += iX0;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iX0 / fS));
            }
        }
        return ((list.size() - 1) * iP0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
        int iP0 = k51Var.p0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iP0, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            xm1 xm1Var = (xm1) list.get(i2);
            float fS = b32.s(b32.p(xm1Var));
            if (fS == 0.0f) {
                int iMin2 = Math.min(xm1Var.y(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, xm1Var.m0(iMin2));
            } else if (fS > 0.0f) {
                f += fS;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            xm1 xm1Var2 = (xm1) list.get(i3);
            float fS2 = b32.s(b32.p(xm1Var2));
            if (fS2 > 0.0f) {
                iMax = Math.max(iMax, xm1Var2.m0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy)) {
            return false;
        }
        qy qyVar = (qy) obj;
        return this.a.equals(qyVar.a) && this.b.equals(qyVar.b);
    }

    @Override // defpackage.ap2
    public final void f(int i, int[] iArr, int[] iArr2, en1 en1Var) {
        this.a.g(en1Var, i, iArr, iArr2);
    }

    @Override // defpackage.ap2
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? n30.a(0, i3, i, i2) : lq.x(0, i3, i, i2);
    }

    @Override // defpackage.ap2
    public final int h(i62 i62Var) {
        return i62Var.f;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ap2
    public final int i(i62 i62Var) {
        return i62Var.g;
    }

    @Override // defpackage.ap2
    public final dn1 j(i62[] i62VarArr, en1 en1Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return en1Var.I0(i2, i, oi0.f, new py(i62VarArr, this, i2, en1Var, iArr));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ")";
    }
}
