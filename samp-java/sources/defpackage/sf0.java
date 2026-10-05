package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class sf0 extends CharacterStyle implements UpdateAppearance {
    public final rf0 f;

    public sf0(rf0 rf0Var) {
        this.f = rf0Var;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            fm0 fm0Var = fm0.a;
            rf0 rf0Var = this.f;
            if (s51.n(rf0Var, fm0Var)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(rf0Var instanceof ga3)) {
                c.k();
                return;
            }
            textPaint.setStyle(Paint.Style.STROKE);
            ga3 ga3Var = (ga3) rf0Var;
            textPaint.setStrokeWidth(ga3Var.a);
            textPaint.setStrokeMiter(ga3Var.b);
            int i = ga3Var.d;
            textPaint.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 1 ? Paint.Join.ROUND : i == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
            int i2 = ga3Var.c;
            textPaint.setStrokeCap(i2 == 0 ? Paint.Cap.BUTT : i2 == 1 ? Paint.Cap.ROUND : i2 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
            textPaint.setPathEffect(null);
        }
    }
}
