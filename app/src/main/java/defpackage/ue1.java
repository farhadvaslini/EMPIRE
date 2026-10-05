package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ue1 {
    public final l9 a;
    public final a31 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public bg3 j;
    public pg3 k;
    public iy1 l;
    public jk2 m;
    public jk2 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = wm1.a();
    public final Matrix q = new Matrix();

    public ue1(l9 l9Var, a31 a31Var) {
        this.a = l9Var;
        this.b = a31Var;
    }

    public final void a() {
        float f;
        float f2;
        a31 a31Var = this.b;
        InputMethodManager inputMethodManagerT = a31Var.t();
        View view = (View) a31Var.g;
        if (!inputMethodManagerT.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        wm1.d(fArr);
        ab1 ab1Var = (ab1) this.a.m.w.getValue();
        if (ab1Var != null) {
            if (!ab1Var.t0()) {
                ab1Var = null;
            }
            if (ab1Var != null) {
                ab1Var.Y(fArr);
            }
        }
        jk2 jk2Var = this.n;
        jk2Var.getClass();
        float f3 = -jk2Var.a;
        jk2 jk2Var2 = this.n;
        jk2Var2.getClass();
        wm1.f(fArr, f3, -jk2Var2.b);
        Matrix matrix = this.q;
        vm1.O(matrix, fArr);
        bg3 bg3Var = this.j;
        bg3Var.getClass();
        long j = bg3Var.b;
        iy1 iy1Var = this.l;
        iy1Var.getClass();
        pg3 pg3Var = this.k;
        pg3Var.getClass();
        br1 br1Var = pg3Var.b;
        jk2 jk2Var3 = this.m;
        jk2Var3.getClass();
        float f4 = jk2Var3.d;
        float f5 = jk2Var3.b;
        jk2 jk2Var4 = this.n;
        jk2Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        yg3 yg3Var = bg3Var.c;
        int iF = yg3.f(j);
        builder.setSelectionRange(iF, yg3.e(j));
        sl2 sl2Var = sl2.g;
        if (!z || iF < 0) {
            f = f4;
            f2 = f5;
        } else {
            int iR = iy1Var.r(iF);
            jk2 jk2VarC = pg3Var.c(iR);
            f = f4;
            f2 = f5;
            float fG = y02.g(jk2VarC.a, 0.0f, (int) (pg3Var.c >> 32));
            boolean zV = vr.v(jk2Var3, fG, jk2VarC.b);
            boolean zV2 = vr.v(jk2Var3, fG, jk2VarC.d);
            boolean z5 = pg3Var.a(iR) == sl2Var;
            int i = (zV || zV2) ? 1 : 0;
            if (!zV || !zV2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f6 = jk2VarC.b;
            float f7 = jk2VarC.d;
            builder.setInsertionMarkerLocation(fG, f6, f7, f7, i);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z2) {
            int iF2 = yg3Var != null ? yg3.f(yg3Var.a) : -1;
            int iE = yg3Var != null ? yg3.e(yg3Var.a) : -1;
            if (iF2 >= 0 && iF2 < iE) {
                builder2.setComposingText(iF2, bg3Var.a.g.subSequence(iF2, iE));
                int iR2 = iy1Var.r(iF2);
                int iR3 = iy1Var.r(iE);
                float[] fArr2 = new float[(iR3 - iR2) * 4];
                br1Var.a(d32.f(iR2, iR3), fArr2);
                while (iF2 < iE) {
                    int iR4 = iy1Var.r(iF2);
                    int i2 = (iR4 - iR2) * 4;
                    float f8 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f9 = fArr2[i2 + 1];
                    int i3 = iR2;
                    float f10 = fArr2[i2 + 2];
                    float f11 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (jk2Var3.a < f10 ? 1 : 0) & (f8 < jk2Var3.c ? 1 : 0) & (f2 < f11 ? 1 : 0) & (f9 < f ? 1 : 0);
                    if (!vr.v(jk2Var3, f8, f9) || !vr.v(jk2Var3, f10, f11)) {
                        i5 |= 2;
                    }
                    if (pg3Var.a(iR4) == sl2Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f8, f9, f10, f11, i5);
                    builder2 = builder3;
                    iF2 = i6 + 1;
                    iR2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            builder2.setEditorBoundsInfo(l1.h().setEditorBounds(w22.G(jk2Var4)).setHandwritingBounds(w22.G(jk2Var4)).build());
        }
        if (i7 >= 34 && z4 && !jk2Var3.f()) {
            int i8 = br1Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iH = y02.h(br1Var.e(f2), 0, i8);
            int iH2 = y02.h(br1Var.e(f), 0, i8);
            if (iH <= iH2) {
                while (true) {
                    builder2.addVisibleLineBounds(pg3Var.e(iH), br1Var.f(iH), pg3Var.f(iH), br1Var.b(iH));
                    if (iH == iH2) {
                        break;
                    } else {
                        iH++;
                    }
                }
            }
        }
        a31Var.t().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
