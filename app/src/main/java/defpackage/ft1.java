package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ft1 extends View {
    public final Paint f;
    public final Paint g;
    public int h;
    public int i;
    public int j;

    public ft1(GameActivity gameActivity) {
        super(gameActivity);
        Paint paint = new Paint(1);
        paint.setColor(1711276032);
        this.f = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-637534209);
        this.g = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        if (width <= 0.0f || height <= 0.0f || this.h <= this.i) {
            return;
        }
        float f = width / 2.0f;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f);
        float fG = y02.g((this.i * height) / this.h, 8.0f * getResources().getDisplayMetrics().density, height);
        float fH = (height - fG) * (y02.h(r0 - this.j, 0, r0) / (this.h - this.i));
        canvas.drawRoundRect(0.0f, fH, width, fH + fG, f, f, this.g);
    }
}
