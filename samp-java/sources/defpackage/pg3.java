package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pg3 {
    public final og3 a;
    public final br1 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public pg3(og3 og3Var, br1 br1Var, long j) {
        this.a = og3Var;
        this.b = br1Var;
        this.c = j;
        ArrayList arrayList = br1Var.h;
        float fD = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((t32) arrayList.get(0)).a.d.d(0) + 0.0f;
        if (!arrayList.isEmpty()) {
            t32 t32Var = (t32) qx.y0(arrayList);
            fD = t32Var.a.d.d(r4.g - 1) + 0.0f + t32Var.f;
        }
        this.e = fD;
        this.f = br1Var.g;
    }

    public final sl2 a(int i) {
        br1 br1Var = this.b;
        br1Var.l(i);
        int length = ((af) br1Var.a.a).g.length();
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(i == length ? vr.C(arrayList) : lr.A(i, arrayList));
        return t32Var.a.d.f.isRtlCharAt(t32Var.d(i)) ? sl2.g : sl2.f;
    }

    public final jk2 b(int i) {
        float fK;
        float fK2;
        float fJ;
        float fJ2;
        br1 br1Var = this.b;
        br1Var.k(i);
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(lr.A(i, arrayList));
        y9 y9Var = t32Var.a;
        int iD = t32Var.d(i);
        CharSequence charSequence = y9Var.e;
        if (iD < 0 || iD >= charSequence.length()) {
            n21.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + ")");
        }
        ng3 ng3Var = y9Var.d;
        int iG = ng3Var.g(iD);
        float fI = ng3Var.i(iG);
        float fE = ng3Var.e(iG);
        Layout layout = ng3Var.f;
        boolean z = layout.getParagraphDirection(iG) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iD);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fJ = ng3Var.k(iD, false);
                fJ2 = ng3Var.k(iD + 1, true);
            } else if (zIsRtlCharAt) {
                fJ = ng3Var.j(iD, false);
                fJ2 = ng3Var.j(iD + 1, true);
            } else {
                fK = ng3Var.k(iD, false);
                fK2 = ng3Var.k(iD + 1, true);
            }
            float f = fJ;
            fK = fJ2;
            fK2 = f;
        } else {
            fK = ng3Var.j(iD, false);
            fK2 = ng3Var.j(iD + 1, true);
        }
        RectF rectF = new RectF(fK, fI, fK2, fE);
        return t32Var.a(new jk2(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final jk2 c(int i) {
        br1 br1Var = this.b;
        br1Var.l(i);
        int length = ((af) br1Var.a.a).g.length();
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(i == length ? vr.C(arrayList) : lr.A(i, arrayList));
        y9 y9Var = t32Var.a;
        int iD = t32Var.d(i);
        CharSequence charSequence = y9Var.e;
        ng3 ng3Var = y9Var.d;
        if (iD < 0 || iD > charSequence.length()) {
            n21.a("offset(" + iD + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float fJ = ng3Var.j(iD, false);
        int iG = ng3Var.g(iD);
        return t32Var.a(new jk2(fJ, ng3Var.i(iG) + 0.0f, fJ, ng3Var.e(iG) + 0.0f));
    }

    public final boolean d() {
        long j = this.c;
        float f = (int) (j >> 32);
        br1 br1Var = this.b;
        return f < br1Var.d || br1Var.c || ((float) ((int) (j & 4294967295L))) < br1Var.e;
    }

    public final float e(int i) {
        br1 br1Var = this.b;
        br1Var.m(i);
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(lr.B(i, arrayList));
        y9 y9Var = t32Var.a;
        int i2 = i - t32Var.d;
        ng3 ng3Var = y9Var.d;
        return ng3Var.f.getLineLeft(i2) + (i2 == ng3Var.g + (-1) ? ng3Var.j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pg3) {
            pg3 pg3Var = (pg3) obj;
            if (s51.n(this.a, pg3Var.a) && this.b == pg3Var.b && p41.b(this.c, pg3Var.c) && this.d == pg3Var.d && this.e == pg3Var.e && s51.n(this.f, pg3Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final float f(int i) {
        br1 br1Var = this.b;
        br1Var.m(i);
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(lr.B(i, arrayList));
        y9 y9Var = t32Var.a;
        int i2 = i - t32Var.d;
        ng3 ng3Var = y9Var.d;
        return ng3Var.f.getLineRight(i2) + (i2 == ng3Var.g + (-1) ? ng3Var.k : 0.0f);
    }

    public final int g(int i) {
        br1 br1Var = this.b;
        br1Var.m(i);
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(lr.B(i, arrayList));
        y9 y9Var = t32Var.a;
        return y9Var.d.f.getLineStart(i - t32Var.d) + t32Var.b;
    }

    public final sl2 h(int i) {
        br1 br1Var = this.b;
        br1Var.l(i);
        int length = ((af) br1Var.a.a).g.length();
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(i == length ? vr.C(arrayList) : lr.A(i, arrayList));
        y9 y9Var = t32Var.a;
        int iD = t32Var.d(i);
        ng3 ng3Var = y9Var.d;
        return ng3Var.f.getParagraphDirection(ng3Var.g(iD)) == 1 ? sl2.f : sl2.g;
    }

    public final int hashCode() {
        return this.f.hashCode() + nc2.a(nc2.a(nc2.c(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), this.d, 31), this.e, 31);
    }

    public final da i(int i, int i2) {
        br1 br1Var = this.b;
        af afVar = (af) br1Var.a.a;
        if (i < 0 || i > i2 || i2 > afVar.g.length()) {
            int length = afVar.g.length();
            StringBuilder sbL = nc2.l("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbL.append(length);
            sbL.append("), or start > end!");
            n21.a(sbL.toString());
        }
        if (i == i2) {
            return ga.a();
        }
        da daVarA = ga.a();
        lr.D(br1Var.h, d32.f(i, i2), new n31(daVarA, i, i2, 3));
        return daVarA;
    }

    public final long j(int i) {
        int iL;
        int iJ;
        int iJ2;
        br1 br1Var = this.b;
        br1Var.l(i);
        int length = ((af) br1Var.a.a).g.length();
        ArrayList arrayList = br1Var.h;
        t32 t32Var = (t32) arrayList.get(i == length ? vr.C(arrayList) : lr.A(i, arrayList));
        y9 y9Var = t32Var.a;
        int iD = t32Var.d(i);
        xh xhVarL = y9Var.d.l();
        if (xhVarL.i(xhVarL.l(iD))) {
            xhVarL.b(iD);
            iL = iD;
            while (iL != -1 && (!xhVarL.i(iL) || xhVarL.e(iL))) {
                iL = xhVarL.l(iL);
            }
        } else {
            xhVarL.b(iD);
            iL = xhVarL.h(iD) ? (!xhVarL.f(iD) || xhVarL.d(iD)) ? xhVarL.l(iD) : iD : xhVarL.d(iD) ? xhVarL.l(iD) : -1;
        }
        if (iL == -1) {
            iL = iD;
        }
        if (xhVarL.e(xhVarL.j(iD))) {
            xhVarL.b(iD);
            iJ = iD;
            while (iJ != -1 && (xhVarL.i(iJ) || !xhVarL.e(iJ))) {
                iJ = xhVarL.j(iJ);
            }
        } else {
            xhVarL.b(iD);
            if (xhVarL.d(iD)) {
                if (!xhVarL.f(iD) || xhVarL.h(iD)) {
                    iJ2 = xhVarL.j(iD);
                    iJ = iJ2;
                } else {
                    iJ = iD;
                }
            } else if (xhVarL.h(iD)) {
                iJ2 = xhVarL.j(iD);
                iJ = iJ2;
            } else {
                iJ = -1;
            }
        }
        if (iJ != -1) {
            iD = iJ;
        }
        return t32Var.b(d32.f(iL, iD), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + p41.c(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
