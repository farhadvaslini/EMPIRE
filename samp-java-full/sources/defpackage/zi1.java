package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class zi1 implements View.OnTouchListener {
    public static final int w = ViewConfiguration.getTapTimeout();
    public final dk f;
    public final AccelerateInterpolator g;
    public final cg0 h;
    public e7 i;
    public final float[] j;
    public final float[] k;
    public final int l;
    public final int m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final cg0 v;

    public zi1(cg0 cg0Var) {
        dk dkVar = new dk();
        dkVar.e = Long.MIN_VALUE;
        dkVar.g = -1L;
        dkVar.f = 0L;
        this.f = dkVar;
        this.g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.p = fArr5;
        this.h = cg0Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.m = w;
        dkVar.a = 500;
        dkVar.b = 500;
        this.v = cg0Var;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(int i, float f, float f2, float f3) {
        float fB;
        float interpolation;
        float fB2 = b(this.j[i] * f2, 0.0f, this.k[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.g;
        if (fC < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fC);
        } else {
            if (fC <= 0.0f) {
                fB = 0.0f;
                if (fB != 0.0f) {
                    return 0.0f;
                }
                float f4 = this.n[i];
                float f5 = this.o[i];
                float f6 = this.p[i];
                float f7 = f4 * f3;
                return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
            }
            interpolation = accelerateInterpolator.getInterpolation(fC);
        }
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB != 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.l;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.t && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.r) {
            this.t = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        dk dkVar = this.f;
        int i2 = (int) (jCurrentAnimationTimeMillis - dkVar.e);
        int i3 = dkVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        dkVar.i = i;
        dkVar.h = dkVar.a(jCurrentAnimationTimeMillis);
        dkVar.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        cg0 cg0Var;
        int count;
        dk dkVar = this.f;
        float f = dkVar.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(dkVar.c);
        if (iAbs != 0 && (count = (cg0Var = this.v).getCount()) != 0) {
            int childCount = cg0Var.getChildCount();
            int firstVisiblePosition = cg0Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && cg0Var.getChildAt(0).getTop() >= 0)) : !(i >= count && cg0Var.getChildAt(childCount - 1).getBottom() <= cg0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.u) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.s = true;
            this.q = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            cg0 cg0Var = this.h;
            float fA = a(0, x, width, cg0Var.getWidth());
            float fA2 = a(1, motionEvent.getY(), view.getHeight(), cg0Var.getHeight());
            dk dkVar = this.f;
            dkVar.c = fA;
            dkVar.d = fA2;
            if (!this.t && e()) {
                if (this.i == null) {
                    this.i = new e7(i2, this);
                }
                this.t = true;
                this.r = true;
                if (this.q || (i = this.m) <= 0) {
                    this.i.run();
                } else {
                    e7 e7Var = this.i;
                    long j = i;
                    WeakHashMap weakHashMap = mq3.a;
                    cg0Var.postOnAnimationDelayed(e7Var, j);
                }
                this.q = true;
            }
        }
        return false;
    }
}
