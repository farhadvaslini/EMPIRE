package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class y9 {
    public final ca a;
    public final int b;
    public final long c;
    public final ng3 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y9(ca caVar, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        h83 h83Var;
        int i8;
        int i9;
        int i10;
        char c;
        h83 h83Var2;
        TextUtils.TruncateAt truncateAt;
        TextUtils.TruncateAt truncateAt2;
        ng3 ng3VarB;
        int i11;
        y9 y9Var;
        int i12;
        int i13;
        int i14;
        Layout layout;
        p13[] p13VarArr;
        CharSequence charSequence;
        List list;
        jk2 jk2Var;
        float fK;
        int iC;
        float fJ;
        int iC2;
        int i15;
        this.a = caVar;
        this.b = i;
        this.c = j;
        if (m30.j(j) != 0 || m30.k(j) != 0) {
            n21.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            n21.a("maxLines should be greater than 0");
        }
        gh3 gh3Var = caVar.b;
        CharSequence charSequence2 = caVar.h;
        if (i2 == 2) {
            i3 = 0;
            if (!jh3.a(gh3Var.a.h, oz2.w(0)) && !jh3.a(gh3Var.a.h, jh3.c) && (i15 = gh3Var.b.a) != 0 && i15 != 5 && i15 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!g12.R(spannableString, i11.class)) {
                    spannableString.setSpan(new i11(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        x32 x32Var = gh3Var.b;
        h83 h83Var3 = gh3Var.a;
        int i16 = x32Var.a;
        int i17 = 3;
        int i18 = i16 == 1 ? 3 : i16 == 2 ? 4 : i16 == 3 ? 2 : (i16 != 5 && i16 == 6) ? 1 : i3;
        int i19 = i16 == 4 ? 1 : i3;
        int i20 = x32Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i21 = x32Var.g;
        int i22 = i21 & 255;
        if (i22 != 1) {
            if (i22 == 2) {
                i4 = i21;
                i5 = i19;
                i6 = 1;
            } else if (i22 == 3) {
                i4 = i21;
                i5 = i19;
                i6 = 2;
            } else {
                i4 = i21;
                i5 = i19;
                i6 = i3;
            }
        }
        int i23 = (i4 >> 8) & 255;
        if (i23 != 1) {
            if (i23 == 2) {
                i17 = 1;
            } else if (i23 == 3) {
                i17 = 2;
            } else if (i23 != 4) {
                i17 = i3;
            }
        }
        int i24 = (i4 >> 16) & 255;
        if (i24 != 1) {
            i7 = 2;
            if (i24 == 2) {
                h83Var = h83Var3;
                i8 = i18;
                i9 = 1;
            }
            if (i2 != i7) {
                truncateAt2 = TextUtils.TruncateAt.END;
            } else if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else {
                if (i2 != 4) {
                    i10 = i20;
                    c = ' ';
                    h83Var2 = h83Var;
                    truncateAt = null;
                    ng3VarB = b(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
                    Layout layout2 = ng3VarB.f;
                    i11 = i8;
                    if (Build.VERSION.SDK_INT >= 35 || caVar.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                        y9Var = this;
                        i12 = i;
                        i13 = i11;
                        i14 = 2;
                    } else {
                        int ellipsisStart = layout2.getEllipsisStart(0);
                        i14 = 2;
                        CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(layout2.getEllipsisCount(0) + ellipsisStart, charSequence3.length())};
                        y9Var = this;
                        i12 = i;
                        i13 = i11;
                        ng3VarB = y9Var.b(i13, i5, truncateAt, i12, i10, i6, i17, i9, TextUtils.concat(charSequenceArr));
                    }
                    int i25 = ng3VarB.g;
                    if (i2 != i14 || ng3VarB.a() <= m30.h(j) || i12 <= 1) {
                        y9Var.d = ng3VarB;
                    } else {
                        int iH = m30.h(j);
                        int i26 = 0;
                        while (true) {
                            if (i26 >= i25) {
                                i26 = i25;
                                break;
                            } else if (ng3VarB.e(i26) > iH) {
                                break;
                            } else {
                                i26++;
                            }
                        }
                        if (i26 >= 0 && i26 != y9Var.b) {
                            ng3VarB = y9Var.b(i13, i5, truncateAt, i26 < 1 ? 1 : i26, i10, i6, i17, i9, y9Var.e);
                        }
                        y9Var.d = ng3VarB;
                    }
                    y9Var.f = y9Var.d.a();
                    y9Var.a.g.c(h83Var2.a.b(), (((long) Float.floatToRawIntBits(y9Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(y9Var.d())) << c), h83Var2.a.t());
                    layout = y9Var.d.f;
                    if (layout.getText() instanceof Spanned) {
                        CharSequence text = layout.getText();
                        text.getClass();
                        Spanned spanned = (Spanned) text;
                        if (spanned.nextSpanTransition(-1, spanned.length(), p13.class) != spanned.length()) {
                            CharSequence text2 = layout.getText();
                            text2.getClass();
                            p13VarArr = (p13[]) ((Spanned) text2).getSpans(0, layout.getText().length(), p13.class);
                        }
                    } else {
                        p13VarArr = null;
                    }
                    if (p13VarArr != null) {
                        for (p13 p13Var : p13VarArr) {
                            p13Var.h.setValue(new h43((((long) Float.floatToRawIntBits(y9Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(y9Var.d())) << c)));
                        }
                    }
                    charSequence = y9Var.e;
                    if (charSequence instanceof Spanned) {
                        Spanned spanned2 = (Spanned) charSequence;
                        Object[] spans = spanned2.getSpans(0, charSequence.length(), l62.class);
                        ArrayList arrayList = new ArrayList(spans.length);
                        for (Object obj : spans) {
                            l62 l62Var = (l62) obj;
                            int spanStart = spanned2.getSpanStart(l62Var);
                            int spanEnd = spanned2.getSpanEnd(l62Var);
                            int iG = y9Var.d.g(spanStart);
                            boolean z = iG >= y9Var.b;
                            boolean z2 = y9Var.d.f.getEllipsisCount(iG) > 0 && spanEnd > y9Var.d.f.getEllipsisStart(iG) + y9Var.d.f.getLineStart(iG);
                            boolean z3 = spanEnd > y9Var.d.f(iG);
                            if (z2 || z3 || z) {
                                jk2Var = null;
                            } else {
                                boolean z4 = y9Var.d.f.getParagraphDirection(iG) == 1;
                                boolean zIsRtlCharAt = y9Var.d.f.isRtlCharAt(spanStart);
                                if (!z4 || zIsRtlCharAt) {
                                    if (z4 && zIsRtlCharAt) {
                                        fJ = y9Var.d.k(spanStart, false);
                                        iC2 = l62Var.c();
                                    } else {
                                        ng3 ng3Var = y9Var.d;
                                        if (zIsRtlCharAt) {
                                            fJ = ng3Var.j(spanStart, false);
                                            iC2 = l62Var.c();
                                        } else {
                                            fK = ng3Var.k(spanStart, false);
                                            iC = l62Var.c();
                                        }
                                    }
                                    fK = fJ - iC2;
                                    ng3 ng3Var2 = y9Var.d;
                                    l62Var.getClass();
                                    float fD = ng3Var2.d(iG) - l62Var.b();
                                    jk2Var = new jk2(fK, fD, fJ, l62Var.b() + fD);
                                } else {
                                    fK = y9Var.d.j(spanStart, false);
                                    iC = l62Var.c();
                                }
                                fJ = iC + fK;
                                ng3 ng3Var22 = y9Var.d;
                                l62Var.getClass();
                                float fD2 = ng3Var22.d(iG) - l62Var.b();
                                jk2Var = new jk2(fK, fD2, fJ, l62Var.b() + fD2);
                            }
                            arrayList.add(jk2Var);
                        }
                        list = arrayList;
                    } else {
                        list = ni0.f;
                    }
                    y9Var.g = list;
                }
                truncateAt2 = TextUtils.TruncateAt.START;
            }
            i10 = i20;
            c = ' ';
            h83Var2 = h83Var;
            truncateAt = truncateAt2;
            ng3VarB = b(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
            Layout layout22 = ng3VarB.f;
            i11 = i8;
            if (Build.VERSION.SDK_INT >= 35) {
                y9Var = this;
                i12 = i;
                i13 = i11;
                i14 = 2;
            }
            int i252 = ng3VarB.g;
            if (i2 != i14) {
                y9Var.d = ng3VarB;
            }
            y9Var.f = y9Var.d.a();
            y9Var.a.g.c(h83Var2.a.b(), (((long) Float.floatToRawIntBits(y9Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(y9Var.d())) << c), h83Var2.a.t());
            layout = y9Var.d.f;
            if (layout.getText() instanceof Spanned) {
            }
            if (p13VarArr != null) {
            }
            charSequence = y9Var.e;
            if (charSequence instanceof Spanned) {
            }
            y9Var.g = list;
        }
        i7 = 2;
        h83Var = h83Var3;
        i8 = i18;
        i9 = i3;
        if (i2 != i7) {
        }
        i10 = i20;
        c = ' ';
        h83Var2 = h83Var;
        truncateAt = truncateAt2;
        ng3VarB = b(i8, i5, truncateAt, i, i10, i6, i17, i9, charSequence3);
        Layout layout222 = ng3VarB.f;
        i11 = i8;
        if (Build.VERSION.SDK_INT >= 35) {
        }
        int i2522 = ng3VarB.g;
        if (i2 != i14) {
        }
        y9Var.f = y9Var.d.a();
        y9Var.a.g.c(h83Var2.a.b(), (((long) Float.floatToRawIntBits(y9Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(y9Var.d())) << c), h83Var2.a.t());
        layout = y9Var.d.f;
        if (layout.getText() instanceof Spanned) {
        }
        if (p13VarArr != null) {
        }
        charSequence = y9Var.e;
        if (charSequence instanceof Spanned) {
        }
        y9Var.g = list;
    }

    public static final void a(y9 y9Var, pr prVar) {
        y9Var.getClass();
        Canvas canvasA = o6.a(prVar);
        ng3 ng3Var = y9Var.d;
        if (ng3Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, y9Var.d(), y9Var.f);
        }
        int i = ng3Var.h;
        if (canvasA.getClipBounds(ng3Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = rg3.a;
            Object nd3Var = threadLocal.get();
            if (nd3Var == null) {
                nd3Var = new nd3();
                threadLocal.set(nd3Var);
            }
            nd3 nd3Var2 = (nd3) nd3Var;
            nd3Var2.a = canvasA;
            try {
                ng3Var.f.draw(nd3Var2);
                if (i != 0) {
                    canvasA.translate(0.0f, (-1.0f) * i);
                }
            } finally {
                nd3Var2.a = null;
            }
        }
        if (ng3Var.d) {
            canvasA.restore();
        }
    }

    public final ng3 b(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        w62 w62Var;
        float fD = d();
        ca caVar = this.a;
        bc bcVar = caVar.g;
        int i8 = caVar.l;
        gb1 gb1Var = caVar.i;
        gh3 gh3Var = caVar.b;
        z9 z9Var = aa.a;
        k72 k72Var = gh3Var.c;
        return new ng3(charSequence, fD, bcVar, i, truncateAt, i8, (k72Var == null || (w62Var = k72Var.b) == null) ? false : w62Var.a, i3, i5, i6, i7, i4, i2, gb1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Type inference failed for: r10v26, types: [j9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(jk2 jk2Var, int i, qn1 qn1Var) {
        lt2 mw0Var;
        int i2;
        int[] rangeForRect;
        SegmentFinder segmentFinderK;
        RectF rectFG = w22.G(jk2Var);
        boolean z = i != 0 && i == 1;
        final u uVar = new u(2, qn1Var);
        ng3 ng3Var = this.d;
        TextPaint textPaint = ng3Var.a;
        Layout layout = ng3Var.f;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 8;
        if (i3 >= 34) {
            if (z) {
                segmentFinderK = new nf(new ar2(i4, layout.getText(), ng3Var.l()));
            } else {
                i9.o();
                segmentFinderK = i9.k(i9.j(layout.getText(), textPaint));
            }
            rangeForRect = layout.getRangeForRect(rectFG, segmentFinderK, new Layout.TextInclusionStrategy() { // from class: j9
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) uVar.f(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            qk qkVarC = ng3Var.c();
            if (z) {
                mw0Var = new ar2(i4, layout.getText(), ng3Var.l());
            } else {
                CharSequence text = layout.getText();
                mw0Var = i3 >= 29 ? new mw0(text, textPaint) : new nw0(text);
            }
            lt2 lt2Var = mw0Var;
            int lineForVertical = layout.getLineForVertical((int) rectFG.top);
            if (rectFG.top <= ng3Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < ng3Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFG.bottom);
                if (lineForVertical2 != 0 || rectFG.bottom >= ng3Var.i(0)) {
                    int iQ = b32.q(ng3Var, layout, qkVarC, i5, rectFG, lt2Var, uVar, true);
                    while (true) {
                        i2 = i5;
                        if (iQ != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iQ = b32.q(ng3Var, layout, qkVarC, i5, rectFG, lt2Var, uVar, true);
                    }
                    if (iQ == -1) {
                        rangeForRect = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iQ2 = b32.q(ng3Var, layout, qkVarC, i6, rectFG, lt2Var, uVar, false);
                        while (iQ2 == -1 && i2 < i6) {
                            i6--;
                            iQ2 = b32.q(ng3Var, layout, qkVarC, i6, rectFG, lt2Var, uVar, false);
                        }
                        if (iQ2 != -1) {
                            rangeForRect = new int[]{lt2Var.b(iQ + 1), lt2Var.c(iQ2 - 1)};
                        }
                    }
                }
            }
        }
        return rangeForRect == null ? yg3.b : d32.f(rangeForRect[0], rangeForRect[1]);
    }

    public final float d() {
        return m30.i(this.c);
    }

    public final void e(pr prVar, long j, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        bc bcVar = this.a.g;
        int i = bcVar.c;
        bcVar.d(j);
        bcVar.f(r13Var);
        bcVar.g(ne3Var);
        bcVar.e(rf0Var);
        bcVar.b(3);
        a(this, prVar);
        bcVar.b(i);
    }

    public final void f(pr prVar, dp dpVar, float f, r13 r13Var, ne3 ne3Var, rf0 rf0Var) {
        bc bcVar = this.a.g;
        int i = bcVar.c;
        bcVar.c(dpVar, (((long) Float.floatToRawIntBits(d())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        bcVar.f(r13Var);
        bcVar.g(ne3Var);
        bcVar.e(rf0Var);
        bcVar.b(3);
        a(this, prVar);
        bcVar.b(i);
    }
}
