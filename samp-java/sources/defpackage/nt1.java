package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class nt1 extends View {
    public static final int l = Color.rgb(180, 25, 29);
    public static final int m = Color.rgb(54, 104, 44);
    public static final int n = Color.rgb(50, 60, 127);
    public static final int o = Color.rgb(168, 110, 252);
    public static final int p = Color.rgb(226, 192, 99);
    public static final int q = Color.rgb(225, 225, 225);
    public final LinkedHashMap f;
    public final HashMap g;
    public final HashMap h;
    public final Typeface i;
    public final TextPaint j;
    public final xb3 k;

    public nt1(GameActivity gameActivity) {
        super(gameActivity);
        this.f = new LinkedHashMap();
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = Typeface.DEFAULT;
        this.j = new TextPaint(129);
        this.k = new xb3(new it1(0, this));
        setWillNotDraw(false);
        setClickable(false);
        setFocusable(false);
        setImportantForAccessibility(2);
        setPadding(0, 0, 0, 0);
    }

    public static final void e(qk2 qk2Var, ArrayList arrayList, nk2 nk2Var, float f, nk2 nk2Var2, ok2 ok2Var, mk2 mk2Var) {
        if (((CharSequence) qk2Var.f).length() > 0) {
            arrayList.add(new ht1(((StringBuilder) qk2Var.f).toString(), nk2Var.f, f, nk2Var2.f, ok2Var.f, mk2Var.f));
            qk2Var.f = new StringBuilder();
        }
    }

    private final float getFallbackGlyphHeight() {
        return ((Number) this.k.getValue()).floatValue();
    }

    public final TextPaint a(gt1 gt1Var, int i) {
        float fAbs = Math.abs(gt1Var.f);
        if (fAbs < 0.05f) {
            fAbs = 0.05f;
        }
        float fAbs2 = Math.abs(gt1Var.e);
        float f = fAbs2 >= 0.05f ? fAbs2 : 0.05f;
        TextPaint textPaint = new TextPaint(129);
        textPaint.setColor(i);
        textPaint.setTypeface(this.i);
        textPaint.setTextSize(y02.g(((fAbs * 8.0f) * 100.0f) / getFallbackGlyphHeight(), 1.0f, 256.0f));
        textPaint.setTextScaleX(y02.g(f / (fAbs * 0.25f), 0.1f, 8.0f));
        return textPaint;
    }

    public final void b(Canvas canvas, gt1 gt1Var, String str, int i, float f, float f2) {
        TextPaint textPaintA = a(gt1Var, i);
        int i2 = gt1Var.i;
        int i3 = gt1Var.j;
        float f3 = f2 - textPaintA.getFontMetrics().ascent;
        int i4 = gt1Var.h;
        if (Color.alpha(i4) == 0) {
            i4 = -16777216;
        }
        if (i3 > 0) {
            TextPaint textPaintA2 = a(gt1Var, i4);
            textPaintA2.setStyle(Paint.Style.STROKE);
            float f4 = i3;
            if (f4 < 1.0f) {
                f4 = 1.0f;
            }
            textPaintA2.setStrokeWidth(f4 * 2.0f);
            canvas.drawText(str, f, f3, textPaintA2);
        } else if (i2 > 0) {
            TextPaint textPaintA3 = a(gt1Var, i4);
            float f5 = i2;
            canvas.drawText(str, f + f5, f5 + f3, textPaintA3);
        }
        canvas.drawText(str, f, f3, textPaintA);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r15, defpackage.gt1 r16) {
        /*
            r14 = this;
            r2 = r16
            java.util.List r0 = r14.d(r2)
            float r7 = r2.c
            r8 = r0
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r9 = r8.size()
            r0 = 0
            r1 = r0
        L11:
            if (r1 >= r9) goto L85
            java.lang.Object r3 = r8.get(r1)
            int r10 = r1 + 1
            int r11 = r0 + 1
            if (r0 < 0) goto L80
            lt1 r3 = (defpackage.lt1) r3
            int r1 = r2.l
            r4 = 1
            if (r1 == r4) goto L2e
            r4 = 2
            if (r1 == r4) goto L29
            r1 = r7
            goto L34
        L29:
            float r1 = r3.b
        L2b:
            float r1 = r7 - r1
            goto L34
        L2e:
            float r1 = r3.b
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            goto L2b
        L34:
            float r4 = r2.d
            float r0 = (float) r0
            float r5 = r2.f
            float r5 = java.lang.Math.abs(r5)
            r6 = 1028443341(0x3d4ccccd, float:0.05)
            int r12 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r12 >= 0) goto L45
            r5 = r6
        L45:
            r6 = 1091567616(0x41100000, float:9.0)
            float r5 = r5 * r6
            float r5 = r5 * r0
            float r6 = r5 + r4
            java.util.List r0 = r3.a
            java.util.Iterator r12 = r0.iterator()
            r5 = r1
        L52:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r12.next()
            mt1 r0 = (defpackage.mt1) r0
            int r1 = r2.g
            android.text.TextPaint r1 = r14.a(r2, r1)
            java.lang.String r3 = r0.a
            float r13 = r1.measureText(r3)
            boolean r1 = r0.c
            if (r1 == 0) goto L77
            java.lang.String r3 = r0.a
            int r4 = r0.b
            r0 = r14
            r1 = r15
            r0.b(r1, r2, r3, r4, r5, r6)
        L77:
            float r5 = r5 + r13
            r2 = r16
            goto L52
        L7b:
            r2 = r16
            r1 = r10
            r0 = r11
            goto L11
        L80:
            defpackage.vr.b0()
            r14 = 0
            throw r14
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.c(android.graphics.Canvas, gt1):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r9.equals("s") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0102, code lost:
    
        if (r9.equals("w") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
    
        r9 = defpackage.nt1.q;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(defpackage.gt1 r18) {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt1.d(gt1):java.util.List");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws Throwable {
        Canvas canvas2;
        nt1 nt1Var;
        Canvas canvas3;
        canvas.getClass();
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.scale(getWidth() / 640.0f, getHeight() / 448.0f, 0.0f, 0.0f);
        try {
            Collection<gt1> collectionValues = this.f.values();
            collectionValues.getClass();
            for (gt1 gt1Var : collectionValues) {
                List<ht1> list = (List) this.h.get(Integer.valueOf(gt1Var.a));
                if (list != null) {
                    for (ht1 ht1Var : list) {
                        String str = ht1Var.a;
                        int i = ht1Var.e;
                        float f = ht1Var.b;
                        float f2 = ht1Var.c;
                        nt1 nt1Var2 = this;
                        canvas2 = canvas;
                        try {
                            nt1Var2.b(canvas2, gt1Var, str, i, f, f2);
                            this = nt1Var2;
                            canvas = canvas2;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            canvas2.restoreToCount(iSave);
                            throw th2;
                        }
                    }
                    nt1Var = this;
                    canvas3 = canvas;
                } else {
                    nt1Var = this;
                    canvas3 = canvas;
                    nt1Var.c(canvas3, gt1Var);
                }
                this = nt1Var;
                canvas = canvas3;
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th3) {
            th = th3;
            canvas2 = canvas;
        }
    }
}
