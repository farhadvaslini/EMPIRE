package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class l62 extends ReplacementSpan {
    public Paint.FontMetricsInt f;
    public int g;
    public int h;
    public boolean i;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        s51.F("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.i) {
            n21.b("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }

    public final int c() {
        if (!this.i) {
            n21.b("PlaceholderSpan is not laid out yet.");
        }
        return this.g;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.i = true;
        paint.getTextSize();
        this.f = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            n21.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.g = (int) Math.ceil(0.0d);
        this.h = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        return c();
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }
}
