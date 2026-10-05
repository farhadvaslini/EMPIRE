package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ax0 implements sw0 {
    public static final zw0 I = new zw0();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public u10 H;
    public final mf0 b;
    public final sr c;
    public final tq3 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public yx o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public ax0(mf0 mf0Var) {
        sr srVar = new sr();
        rr rrVar = new rr();
        this.b = mf0Var;
        this.c = srVar;
        tq3 tq3Var = new tq3(mf0Var, srVar, rrVar);
        this.d = tq3Var;
        this.e = mf0Var.getResources();
        this.f = new Rect();
        mf0Var.addView(tq3Var);
        tq3Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = wx.b;
        this.y = j;
        this.z = j;
    }

    @Override // defpackage.sw0
    public final u10 A() {
        return this.H;
    }

    @Override // defpackage.sw0
    public final long B() {
        return this.z;
    }

    @Override // defpackage.sw0
    public final void C(Outline outline, long j) {
        tq3 tq3Var = this.d;
        tq3Var.j = outline;
        tq3Var.invalidateOutline();
        if ((this.m || tq3Var.getClipToOutline()) && outline != null) {
            tq3Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // defpackage.sw0
    public final float D() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // defpackage.sw0
    public final void E() {
        this.b.removeViewInLayout(this.d);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.sw0
    public final void F(ua0 ua0Var, bb1 bb1Var, qw0 qw0Var, kd kdVar) {
        tq3 tq3Var = this.d;
        ViewParent parent = tq3Var.getParent();
        mf0 mf0Var = this.b;
        if (parent == null) {
            mf0Var.addView(tq3Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        tq3Var.l = ua0Var;
        tq3Var.m = bb1Var;
        tq3Var.n = kdVar;
        tq3Var.o = qw0Var;
        tq3Var.p = fIntBitsToFloat;
        tq3Var.q = fIntBitsToFloat2;
        if (tq3Var.isAttachedToWindow()) {
            tq3Var.setVisibility(4);
            tq3Var.setVisibility(0);
            try {
                sr srVar = this.c;
                zw0 zw0Var = I;
                n6 n6Var = srVar.a;
                Canvas canvas = n6Var.a;
                n6Var.a = zw0Var;
                mf0Var.a(n6Var, tq3Var, tq3Var.getDrawingTime());
                srVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // defpackage.sw0
    public final void G(long j, int i, int i2) {
        if (!p41.b(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            c();
            return;
        }
        int i3 = this.h;
        tq3 tq3Var = this.d;
        if (i3 != i) {
            tq3Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            tq3Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.sw0
    public final float H() {
        return this.v;
    }

    @Override // defpackage.sw0
    public final void I(pr prVar) {
        Rect rect;
        boolean z = this.k;
        tq3 tq3Var = this.d;
        if (z) {
            if ((this.m || tq3Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = tq3Var.getWidth();
                rect.bottom = tq3Var.getHeight();
            } else {
                rect = null;
            }
            tq3Var.setClipBounds(rect);
        }
        Canvas canvas = o6.a;
        if (((n6) prVar).a.isHardwareAccelerated()) {
            this.b.a(prVar, tq3Var, tq3Var.getDrawingTime());
        }
    }

    @Override // defpackage.sw0
    public final int J() {
        return this.p;
    }

    @Override // defpackage.sw0
    public final float K() {
        return this.A;
    }

    @Override // defpackage.sw0
    public final yx L() {
        return this.o;
    }

    @Override // defpackage.sw0
    public final void M(int i) {
        this.p = i;
        h();
    }

    @Override // defpackage.sw0
    public final Matrix N() {
        return this.d.getMatrix();
    }

    @Override // defpackage.sw0
    public final float O() {
        return this.B;
    }

    @Override // defpackage.sw0
    public final float P() {
        return this.x;
    }

    @Override // defpackage.sw0
    public final float R() {
        return this.C;
    }

    @Override // defpackage.sw0
    public final void S(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        i();
    }

    @Override // defpackage.sw0
    public final long T() {
        return this.y;
    }

    public final void a(int i) {
        tq3 tq3Var = this.d;
        boolean z = true;
        if (i == 1) {
            tq3Var.setLayerType(2, this.g);
        } else {
            Paint paint = this.g;
            if (i == 2) {
                tq3Var.setLayerType(0, paint);
                z = false;
            } else {
                tq3Var.setLayerType(0, paint);
            }
        }
        tq3Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    @Override // defpackage.sw0
    public final void b(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    public final void c() {
        boolean z = this.m;
        tq3 tq3Var = this.d;
        if (z || tq3Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        tq3Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    @Override // defpackage.sw0
    public final void d(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.sw0
    public final float e() {
        return this.t;
    }

    @Override // defpackage.sw0
    public final void f(yx yxVar) {
        this.o = yxVar;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(yxVar != null ? yxVar.a : null);
        h();
    }

    @Override // defpackage.sw0
    public final void g(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    public final void h() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            a(i);
        } else {
            a(1);
        }
    }

    public final void i() {
        boolean z = this.r;
        tq3 tq3Var = this.d;
        if (z || gy1.b(this.s, 9205357640488583168L)) {
            tq3Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            tq3Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            tq3Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            tq3Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // defpackage.sw0
    public final void j(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.sw0
    public final void k(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.sw0
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            this.d.setOutlineAmbientShadowColor(vp.T(j));
        }
    }

    @Override // defpackage.sw0
    public final void m(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.sw0
    public final void n(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(r51.D(i)));
        h();
    }

    @Override // defpackage.sw0
    public final void o(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // defpackage.sw0
    public final void p(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.sw0
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            this.d.setOutlineSpotShadowColor(vp.T(j));
        }
    }

    @Override // defpackage.sw0
    public final void r(u10 u10Var) {
        this.H = u10Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(u10Var != null ? u10Var.c() : null);
        }
    }

    @Override // defpackage.sw0
    public final void s(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.sw0
    public final float t() {
        return this.q;
    }

    @Override // defpackage.sw0
    public final void u(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // defpackage.sw0
    public final float v() {
        return this.u;
    }

    @Override // defpackage.sw0
    public final void w(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.sw0
    public final int x() {
        return this.n;
    }

    @Override // defpackage.sw0
    public final void y(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbL = nc2.l("Outsets cannot be negative! Left: ", i, ", Top: ", i2, ", Right: ");
            sbL.append(i3);
            sbL.append(", Bottom: ");
            sbL.append(i4);
            l21.a(sbL.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        c();
        if (z) {
            i();
        }
    }

    @Override // defpackage.sw0
    public final float z() {
        return this.w;
    }
}
