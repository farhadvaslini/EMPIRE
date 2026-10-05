package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ng3 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public xh e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final Paint.FontMetricsInt m;
    public final int n;
    public final fg1[] o;
    public final Rect p = new Rect();
    public qk q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3 A[PHI: r14
      0x01a3: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:102:0x01b5, B:95:0x019c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [android.graphics.Paint$FontMetricsInt] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ng3(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, gb1 gb1Var) throws Throwable {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutQ;
        fg1[] fg1VarArr;
        int i10;
        int i11;
        int i12;
        int i13;
        Throwable th;
        char c;
        long j;
        int i14;
        int i15;
        long jA;
        ?? IsFallbackLineSpacingEnabled;
        long jA2;
        int i16;
        ?? r6;
        int i17;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = rg3.b(i2);
        Layout.Alignment alignment = md3.a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : md3.b : md3.a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z2 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, ol.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = gb1Var.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || gb1Var.c() > f || z2) {
                this.l = false;
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutQ = w22.q(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
            } else {
                this.l = true;
                if (iCeil < 0) {
                    n21.a("negative width");
                }
                if (iCeil < 0) {
                    n21.a("negative ellipsized width");
                }
                layoutQ = Build.VERSION.SDK_INT >= 33 ? l1.d(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f = layoutQ;
            Trace.endSection();
            int iMin = Math.min(layoutQ.getLineCount(), i9);
            this.g = iMin;
            int i18 = iMin - 1;
            this.d = iMin >= i9 && (layoutQ.getEllipsisCount(i18) > 0 || layoutQ.getLineEnd(i18) != charSequence.length());
            if (layoutQ.getText() instanceof Spanned) {
                CharSequence text = layoutQ.getText();
                text.getClass();
                if (g12.R((Spanned) text, fg1.class) || layoutQ.getText().length() <= 0) {
                    CharSequence text2 = layoutQ.getText();
                    text2.getClass();
                    i10 = 0;
                    fg1VarArr = (fg1[]) ((Spanned) text2).getSpans(0, layoutQ.getText().length(), fg1.class);
                }
            } else {
                fg1VarArr = null;
                i10 = 0;
            }
            this.o = fg1VarArr;
            if (fg1VarArr == null) {
                i11 = 2;
                i12 = i10;
            } else {
                fg1 fg1Var = fg1VarArr.length == 0 ? null : fg1VarArr[i10];
                if (fg1Var != null) {
                    if (fg1Var.h) {
                        i11 = 2;
                        i17 = fg1Var.k == 2 ? 1 : i17;
                        i12 = i17;
                    } else {
                        i11 = 2;
                    }
                    i17 = i10;
                    i12 = i17;
                }
            }
            if (fg1VarArr == null) {
                i13 = i10;
            } else {
                fg1 fg1Var2 = fg1VarArr.length == 0 ? null : fg1VarArr[i10];
                if (fg1Var2 != null && fg1Var2.i && fg1Var2.k == i11) {
                    i13 = 1;
                }
            }
            if (i12 == 0 || i13 == 0) {
                long jA3 = rg3.b;
                if (z) {
                    th = null;
                    c = ' ';
                    j = 4294967295L;
                    i14 = 1;
                    i15 = 33;
                } else if (this.l) {
                    i15 = 33;
                    IsFallbackLineSpacingEnabled = Build.VERSION.SDK_INT >= 33 ? ((BoringLayout) layoutQ).isFallbackLineSpacingEnabled() : i10;
                    if (IsFallbackLineSpacingEnabled == 0) {
                        th = null;
                        c = ' ';
                        j = 4294967295L;
                        i14 = 1;
                    } else {
                        TextPaint paint = layoutQ.getPaint();
                        CharSequence text3 = layoutQ.getText();
                        th = null;
                        c = ' ';
                        Rect rectO = n32.o(paint, text3, layoutQ.getLineStart(i10), layoutQ.getLineEnd(i10));
                        int lineAscent = layoutQ.getLineAscent(i10);
                        j = 4294967295L;
                        int i19 = rectO.top;
                        int topPadding = i19 < lineAscent ? lineAscent - i19 : layoutQ.getTopPadding();
                        i14 = 1;
                        rectO = iMin != 1 ? n32.o(paint, text3, layoutQ.getLineStart(i18), layoutQ.getLineEnd(i18)) : rectO;
                        int lineDescent = layoutQ.getLineDescent(i18);
                        int i20 = rectO.bottom;
                        int bottomPadding = i20 > lineDescent ? i20 - lineDescent : layoutQ.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = rg3.a(topPadding, bottomPadding);
                        }
                    }
                } else {
                    i15 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutQ;
                    int i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 33) {
                        IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                    } else if (i21 >= 28) {
                        IsFallbackLineSpacingEnabled = 1;
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                    }
                }
                jA = rg3.a(i12 != 0 ? i10 : (int) (jA3 >> c), i13 != 0 ? i10 : (int) (jA3 & j));
            } else {
                jA = rg3.b;
                th = null;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i15 = 33;
            }
            if (fg1VarArr != null) {
                int length2 = fg1VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i22 = iMax2; i22 < length2; i22++) {
                    fg1 fg1Var3 = fg1VarArr[i22];
                    int i23 = fg1Var3.p;
                    iMax = i23 < 0 ? Math.max(iMax, Math.abs(i23)) : iMax;
                    int i24 = fg1Var3.q;
                    if (i24 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i24));
                    }
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? rg3.b : rg3.a(iMax, iMax2);
            } else {
                jA2 = rg3.b;
            }
            this.h = Math.max((int) (jA >> c), (int) (jA2 >> c));
            this.i = Math.max((int) (jA & j), (int) (jA2 & j));
            TextPaint textPaint2 = this.a;
            fg1[] fg1VarArr2 = this.o;
            int i25 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i25) != layout.getLineEnd(i25) || fg1VarArr2 == null || fg1VarArr2.length == 0) {
                i16 = i10;
                r6 = th;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                if (fg1VarArr2.length == 0) {
                    c.m("Array is empty.");
                    throw th;
                }
                fg1 fg1Var4 = fg1VarArr2[i10];
                spannableString.setSpan(new fg1(fg1Var4.f, spannableString.length(), (i25 == 0 || !fg1Var4.i) ? fg1Var4.i : i10, fg1Var4.i, fg1Var4.j, fg1Var4.k), i10, spannableString.length(), i15);
                i16 = i10;
                StaticLayout staticLayoutQ = w22.q(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, za1.a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutQ.getLineAscent(i16);
                fontMetricsInt.descent = staticLayoutQ.getLineDescent(i16);
                fontMetricsInt.top = staticLayoutQ.getLineTop(i16);
                fontMetricsInt.bottom = staticLayoutQ.getLineBottom(i16);
                r6 = fontMetricsInt;
            }
            this.n = r6 != 0 ? ((Paint.FontMetricsInt) r6).bottom - ((int) h(i18)) : i16;
            this.m = r6;
            Layout layout2 = this.f;
            this.j = uq.r(layout2, i18, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = uq.s(layout3, i18, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.n;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final qk c() {
        qk qkVar = this.q;
        if (qkVar != null) {
            return qkVar;
        }
        qk qkVar2 = new qk(this.f);
        this.q = qkVar2;
        return qkVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.m) == null) ? this.f.getLineBaseline(i) : i(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.m) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        ThreadLocal threadLocal = rg3.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int g(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float h(int i) {
        return e(i) - i(i);
    }

    public final float i(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float j(int i, boolean z) {
        return b(g(i)) + c().j(i, true, z);
    }

    public final float k(int i, boolean z) {
        return b(g(i)) + c().j(i, false, z);
    }

    public final xh l() {
        xh xhVar = this.e;
        if (xhVar != null) {
            return xhVar;
        }
        Layout layout = this.f;
        xh xhVar2 = new xh(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = xhVar2;
        return xhVar2;
    }
}
