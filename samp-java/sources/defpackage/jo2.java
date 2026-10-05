package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class jo2 extends View {
    public static final int[] k = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] l = new int[0];
    public jm3 f;
    public Boolean g;
    public Long h;
    public v i;
    public ja j;

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.i;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l2 = this.h;
        long jLongValue = jCurrentAnimationTimeMillis - (l2 != null ? l2.longValue() : 0L);
        if (z || jLongValue >= 5) {
            int[] iArr = z ? k : l;
            jm3 jm3Var = this.f;
            if (jm3Var != null) {
                jm3Var.setState(iArr);
            }
        } else {
            v vVar = new v(12, this);
            this.i = vVar;
            postDelayed(vVar, 50L);
        }
        this.h = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(jo2 jo2Var) {
        jm3 jm3Var = jo2Var.f;
        if (jm3Var != null) {
            jm3Var.setState(l);
        }
        jo2Var.i = null;
    }

    public final void b(zc2 zc2Var, boolean z, long j, int i, long j2, ja jaVar) {
        if (this.f == null || !Boolean.valueOf(z).equals(this.g)) {
            jm3 jm3Var = new jm3(z);
            setBackground(jm3Var);
            this.f = jm3Var;
            this.g = Boolean.valueOf(z);
        }
        jm3 jm3Var2 = this.f;
        jm3Var2.getClass();
        this.j = jaVar;
        e(j, i, j2);
        if (z) {
            jm3Var2.setHotspot(Float.intBitsToFloat((int) (zc2Var.a >> 32)), Float.intBitsToFloat((int) (zc2Var.a & 4294967295L)));
        } else {
            jm3Var2.setHotspot(jm3Var2.getBounds().centerX(), jm3Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.j = null;
        v vVar = this.i;
        if (vVar != null) {
            removeCallbacks(vVar);
            v vVar2 = this.i;
            vVar2.getClass();
            vVar2.run();
        } else {
            jm3 jm3Var = this.f;
            if (jm3Var != null) {
                jm3Var.setState(l);
            }
        }
        jm3 jm3Var2 = this.f;
        if (jm3Var2 == null) {
            return;
        }
        jm3Var2.setVisible(false, false);
        unscheduleDrawable(jm3Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i, long j2) {
        jm3 jm3Var = this.f;
        if (jm3Var == null) {
            return;
        }
        if (jm3Var.getRadius() != i) {
            jm3Var.setRadius(i);
        }
        float f = Build.VERSION.SDK_INT < 28 ? 0.2f : 0.1f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        long jB = wx.b(f, j2);
        wx wxVar = jm3Var.g;
        if (!(wxVar == null ? false : wx.c(wxVar.a, jB))) {
            jm3Var.g = new wx(jB);
            jm3Var.setColor(ColorStateList.valueOf(vp.T(jB)));
        }
        Rect rect = new Rect(0, 0, vm1.M(Float.intBitsToFloat((int) (j >> 32))), vm1.M(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        jm3Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ja jaVar = this.j;
        if (jaVar != null) {
            jaVar.a();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
