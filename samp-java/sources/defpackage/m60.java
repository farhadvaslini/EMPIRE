package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class m60 {
    public final h7 a;
    public final pi b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public bg3 j;
    public pg3 k;
    public iy1 l;
    public jk2 n;
    public jk2 o;
    public final Object c = new Object();
    public ns0 m = ua.i;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = wm1.a();
    public final Matrix r = new Matrix();

    public m60(h7 h7Var, pi piVar) {
        this.a = h7Var;
        this.b = piVar;
    }

    public final void a() {
        View view;
        pi piVar = this.b;
        lc1 lc1Var = (lc1) piVar.h;
        InputMethodManager inputMethodManager = (InputMethodManager) lc1Var.getValue();
        View view2 = (View) piVar.g;
        if (inputMethodManager.isActive(view2)) {
            ns0 ns0Var = this.m;
            float[] fArr = this.q;
            ns0Var.h(new wm1(fArr));
            this.a.r(fArr);
            Matrix matrix = this.r;
            vm1.O(matrix, fArr);
            bg3 bg3Var = this.j;
            bg3Var.getClass();
            long j = bg3Var.b;
            iy1 iy1Var = this.l;
            iy1Var.getClass();
            pg3 pg3Var = this.k;
            pg3Var.getClass();
            br1 br1Var = pg3Var.b;
            jk2 jk2Var = this.n;
            jk2Var.getClass();
            float f = jk2Var.d;
            float f2 = jk2Var.b;
            jk2 jk2Var2 = this.o;
            jk2Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            yg3 yg3Var = bg3Var.c;
            int iF = yg3.f(j);
            builder.setSelectionRange(iF, yg3.e(j));
            sl2 sl2Var = sl2.g;
            if (!z || iF < 0) {
                view = view2;
            } else {
                int iR = iy1Var.r(iF);
                jk2 jk2VarC = pg3Var.c(iR);
                view = view2;
                float fG = y02.g(jk2VarC.a, 0.0f, (int) (pg3Var.c >> 32));
                boolean zW = gq.w(jk2Var, fG, jk2VarC.b);
                boolean zW2 = gq.w(jk2Var, fG, jk2VarC.d);
                boolean z5 = pg3Var.a(iR) == sl2Var;
                int i = (zW || zW2) ? 1 : 0;
                if (!zW || !zW2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = jk2VarC.b;
                float f4 = jk2VarC.d;
                builder.setInsertionMarkerLocation(fG, f3, f4, f4, i);
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
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (jk2Var.a < f7 ? 1 : 0) & (f5 < jk2Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!gq.w(jk2Var, f5, f6) || !gq.w(jk2Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (pg3Var.a(iR4) == sl2Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(l1.h().setEditorBounds(w22.G(jk2Var2)).setHandwritingBounds(w22.G(jk2Var2)).build());
            }
            if (i6 >= 34 && z4 && !jk2Var.f()) {
                int i7 = br1Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iH = y02.h(br1Var.e(f2), 0, i7);
                int iH2 = y02.h(br1Var.e(f), 0, i7);
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
            ((InputMethodManager) lc1Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
