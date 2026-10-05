package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dp2 implements cn1, ap2 {
    public final ij a;
    public final um b;

    public dp2(ij ijVar, um umVar) {
        this.a = ijVar;
        this.b = umVar;
    }

    @Override // defpackage.cn1
    public final int a(k51 k51Var, List list, int i) {
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
                int iMin2 = Math.min(xm1Var.u0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, xm1Var.y(iMin2));
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
                iMax = Math.max(iMax, xm1Var2.y(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cn1
    public final int b(k51 k51Var, List list, int i) {
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
            int iU0 = xm1Var.u0(i);
            if (fS == 0.0f) {
                i2 += iU0;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iU0 / fS));
            }
        }
        return ((list.size() - 1) * iP0) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.cn1
    public final dn1 c(en1 en1Var, List list, long j) {
        return d32.u(this, m30.k(j), m30.j(j), m30.i(j), m30.h(j), en1Var.p0(this.a.a()), en1Var, list, new i62[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.cn1
    public final int d(k51 k51Var, List list, int i) {
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
                int iMin2 = Math.min(xm1Var.u0(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, xm1Var.x0(iMin2));
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
                iMax = Math.max(iMax, xm1Var2.x0(iRound != Integer.MAX_VALUE ? Math.round(iRound * fS2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.cn1
    public final int e(k51 k51Var, List list, int i) {
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
            int iM0 = xm1Var.m0(i);
            if (fS == 0.0f) {
                i2 += iM0;
            } else if (fS > 0.0f) {
                f += fS;
                iMax = Math.max(iMax, Math.round(iM0 / fS));
            }
        }
        return ((list.size() - 1) * iP0) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp2)) {
            return false;
        }
        dp2 dp2Var = (dp2) obj;
        return this.a.equals(dp2Var.a) && s51.n(this.b, dp2Var.b);
    }

    @Override // defpackage.ap2
    public final void f(int i, int[] iArr, int[] iArr2, en1 en1Var) {
        this.a.f(en1Var, i, iArr, en1Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.ap2
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? n30.a(i, i2, 0, i3) : lq.y(i, i2, 0, i3);
    }

    @Override // defpackage.ap2
    public final int h(i62 i62Var) {
        return i62Var.g;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.ap2
    public final int i(i62 i62Var) {
        return i62Var.f;
    }

    @Override // defpackage.ap2
    public final dn1 j(i62[] i62VarArr, en1 en1Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return en1Var.I0(i, i2, oi0.f, new b5(i62VarArr, this, i2, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ")";
    }
}
