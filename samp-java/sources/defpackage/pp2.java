package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import top.th1nk.samp.feature.game.GameActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class pp2 extends View {
    public final gt0 f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final LinkedHashMap j;
    public String[] k;
    public float[] l;
    public int[] m;
    public boolean n;
    public boolean o;

    public pp2(GameActivity gameActivity, gt0 gt0Var) {
        super(gameActivity, null, 0);
        this.f = gt0Var;
        this.g = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.h = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.DEFAULT);
        paint2.setSubpixelText(true);
        this.i = paint2;
        this.j = new LinkedHashMap();
        this.k = new String[0];
        this.l = new float[0];
        this.m = new int[0];
        setWillNotDraw(false);
    }

    public final List a() {
        float[] fArr = this.l;
        if (fArr.length >= 4 && fArr[0] > 0.0f) {
            if (fArr[1] > 0.0f) {
                float width = getWidth() / this.l[0];
                float height = getHeight();
                float[] fArr2 = this.l;
                float f = height / fArr2[1];
                l41 l41VarS = y02.S(0, Math.min(this.k.length, Math.min((fArr2.length - 4) / 4, this.o ? Integer.MAX_VALUE : 1)));
                ArrayList arrayList = new ArrayList(rx.d0(l41VarS, 10));
                Iterator it = l41VarS.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((e41) it).nextInt() * 4;
                    float[] fArr3 = this.l;
                    float f2 = fArr3[iNextInt + 4];
                    float f3 = fArr3[iNextInt + 5];
                    arrayList.add(new RectF(f2 * width, f3 * f, (f2 + fArr3[iNextInt + 6]) * width, (f3 + fArr3[iNextInt + 7]) * f));
                }
                return arrayList;
            }
        }
        return ni0.f;
    }

    public final void b(boolean z, boolean z2) {
        if (!z && this.n) {
            LinkedHashMap linkedHashMap = this.j;
            if (!linkedHashMap.isEmpty()) {
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                for (Integer num : qx.N0(setKeySet)) {
                    num.getClass();
                    this.f.l(3, num, 0, 0);
                }
                linkedHashMap.clear();
            }
        }
        this.n = z;
        this.o = z2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        canvas.getClass();
        super.onDraw(canvas);
        if (this.n) {
            float[] fArr = this.l;
            if (fArr.length < 4 || this.m.length < 4 || fArr[0] <= 0.0f || fArr[1] <= 0.0f) {
                return;
            }
            List listA = a();
            float width = getWidth() / this.l[0];
            float height = getHeight();
            float[] fArr2 = this.l;
            float f = height / fArr2[1];
            float f2 = fArr2[2] * f;
            Paint paint = this.i;
            paint.setTextSize(f2);
            float f3 = ((width + f) * this.l[3]) / 2.0f;
            Paint paint2 = this.h;
            paint2.setStrokeWidth(f3);
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            float f4 = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
            int i2 = 0;
            for (Object obj : listA) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    vr.b0();
                    throw null;
                }
                RectF rectF = (RectF) obj;
                Collection collectionValues = this.j.values();
                collectionValues.getClass();
                Collection<Integer> collection = collectionValues;
                if ((collection instanceof Collection) && collection.isEmpty()) {
                    i = this.m[0];
                } else {
                    for (Integer num : collection) {
                        if (num != null && num.intValue() == i2) {
                            i = this.m[1];
                            break;
                        }
                    }
                    i = this.m[0];
                }
                Paint paint3 = this.g;
                paint3.setColor(i);
                canvas.drawRect(rectF.left, rectF.top, rectF.right, rectF.bottom, paint3);
                canvas.drawRect(paint2.getStrokeWidth() + rectF.left, paint2.getStrokeWidth() + rectF.top, rectF.right - paint2.getStrokeWidth(), rectF.bottom - paint2.getStrokeWidth(), paint2);
                canvas.drawText(this.k[i2], (rectF.left + rectF.right) / 2.0f, ((rectF.top + rectF.bottom) / 2.0f) + f4, paint);
                i2 = i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }
}
