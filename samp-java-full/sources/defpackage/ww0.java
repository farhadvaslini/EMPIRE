package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ww0 implements sw0 {
    public static final AtomicBoolean K = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public u10 J;
    public final sr b;
    public final rr c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public yx l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public ww0(h7 h7Var, sr srVar, rr rrVar) {
        this.b = srVar;
        this.c = rrVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", h7Var);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (K.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                fl2.c(renderNodeCreate, fl2.a(renderNodeCreate));
                fl2.d(renderNodeCreate, fl2.b(renderNodeCreate));
            }
            el2.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        c(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = wx.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // defpackage.sw0
    public final u10 A() {
        return this.J;
    }

    @Override // defpackage.sw0
    public final long B() {
        return this.v;
    }

    @Override // defpackage.sw0
    public final void C(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }

    @Override // defpackage.sw0
    public final float D() {
        return this.z;
    }

    @Override // defpackage.sw0
    public final void E() {
        el2.a(this.d);
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
    public final void F(ua0 ua0Var, bb1 bb1Var, qw0 qw0Var, kd kdVar) throws Throwable {
        DisplayListCanvas displayListCanvas;
        n6 n6Var;
        Canvas canvas;
        DisplayListCanvas displayListCanvas2;
        ua0 ua0VarO;
        bb1 bb1VarW;
        pr prVarK;
        Canvas canvas2;
        long jA;
        qw0 qw0Var2;
        long j;
        int i;
        int i2;
        rr rrVar = this.c;
        pi piVar = rrVar.g;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            n6Var = this.b.a;
            canvas = n6Var.a;
            n6Var.a = (Canvas) displayListCanvasStart;
        } catch (Throwable th) {
            th = th;
            displayListCanvas = displayListCanvasStart;
        }
        try {
        } catch (Throwable th2) {
            th = th2;
            displayListCanvas = displayListCanvas2;
            this.d.end(displayListCanvas);
            throw th;
        }
        try {
            if (this.B <= 0.0f) {
                try {
                    if (this.C <= 0.0f) {
                        long jT = lr.T(this.e);
                        ua0VarO = piVar.o();
                        bb1VarW = piVar.w();
                        prVarK = piVar.k();
                        canvas2 = canvas;
                        jA = piVar.A();
                        displayListCanvas2 = displayListCanvasStart;
                        qw0Var2 = (qw0) piVar.h;
                        piVar.N(ua0Var);
                        piVar.O(bb1Var);
                        piVar.M(n6Var);
                        piVar.Q(jT);
                        piVar.h = qw0Var;
                        n6Var.l();
                        try {
                            kdVar.h(rrVar);
                            n6Var.a = canvas2;
                            this.d.end(displayListCanvas2);
                            return;
                        } finally {
                            n6Var.i();
                            piVar.N(ua0VarO);
                            piVar.O(bb1VarW);
                            piVar.M(prVarK);
                            piVar.Q(jA);
                            piVar.h = qw0Var2;
                        }
                    }
                    displayListCanvas2 = displayListCanvasStart;
                    j = 4294967295L;
                    canvas2 = canvas;
                } catch (Throwable th3) {
                    th = th3;
                    displayListCanvas2 = displayListCanvasStart;
                    displayListCanvas = displayListCanvas2;
                }
                this.d.end(displayListCanvas);
                throw th;
            }
            displayListCanvas2 = displayListCanvasStart;
            canvas2 = canvas;
            j = 4294967295L;
            kdVar.h(rrVar);
            n6Var.i();
            piVar.N(ua0VarO);
            piVar.O(bb1VarW);
            piVar.M(prVarK);
            piVar.Q(jA);
            piVar.h = qw0Var2;
            n6Var.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            n6Var.a = canvas2;
            this.d.end(displayListCanvas2);
            return;
        } catch (Throwable th4) {
            displayListCanvas = displayListCanvas2;
            try {
                throw th4;
            } catch (Throwable th5) {
                th = th5;
            }
        }
        i = (int) (jFloatToRawIntBits >> 32);
        i2 = (int) (jFloatToRawIntBits & j);
        n6Var.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        long jT2 = lr.T(this.e);
        ua0VarO = piVar.o();
        bb1VarW = piVar.w();
        prVarK = piVar.k();
        jA = piVar.A();
        qw0Var2 = (qw0) piVar.h;
        piVar.N(ua0Var);
        piVar.O(bb1Var);
        piVar.M(n6Var);
        piVar.Q(jT2);
        piVar.h = qw0Var;
        n6Var.l();
    }

    @Override // defpackage.sw0
    public final void G(long j, int i, int i2) {
        this.H = i;
        this.I = i2;
        boolean zB = p41.b(this.e, j);
        this.e = j;
        U();
        if (zB) {
            return;
        }
        if (this.n || gy1.b(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // defpackage.sw0
    public final float H() {
        return this.r;
    }

    @Override // defpackage.sw0
    public final void I(pr prVar) {
        Canvas canvas = o6.a;
        DisplayListCanvas displayListCanvas = ((n6) prVar).a;
        displayListCanvas.getClass();
        displayListCanvas.drawRenderNode(this.d);
    }

    @Override // defpackage.sw0
    public final int J() {
        return this.j;
    }

    @Override // defpackage.sw0
    public final float K() {
        return this.w;
    }

    @Override // defpackage.sw0
    public final yx L() {
        return this.l;
    }

    @Override // defpackage.sw0
    public final void M(int i) {
        this.j = i;
        h();
    }

    @Override // defpackage.sw0
    public final Matrix N() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }

    @Override // defpackage.sw0
    public final float O() {
        return this.x;
    }

    @Override // defpackage.sw0
    public final float P() {
        return this.t;
    }

    @Override // defpackage.sw0
    public final boolean Q() {
        return this.d.isValid();
    }

    @Override // defpackage.sw0
    public final float R() {
        return this.y;
    }

    @Override // defpackage.sw0
    public final void S(long j) {
        this.o = j;
        i();
    }

    @Override // defpackage.sw0
    public final long T() {
        return this.u;
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    public final void a() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.sw0
    public final void b(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    public final void c(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.sw0
    public final void d(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.sw0
    public final float e() {
        return this.p;
    }

    @Override // defpackage.sw0
    public final void f(yx yxVar) {
        this.l = yxVar;
        if (yxVar == null) {
            h();
            return;
        }
        c(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(yxVar.a);
        renderNode.setLayerPaint(paint);
    }

    @Override // defpackage.sw0
    public final void g(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    public final void h() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            c(i);
        } else {
            c(1);
        }
    }

    public final void i() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    @Override // defpackage.sw0
    public final void j(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // defpackage.sw0
    public final void k(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.sw0
    public final void l(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            fl2.c(this.d, vp.T(j));
        }
    }

    @Override // defpackage.sw0
    public final void m(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.sw0
    public final void n(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(r51.D(i)));
        h();
    }

    @Override // defpackage.sw0
    public final void o(boolean z) {
        this.A = z;
        a();
    }

    @Override // defpackage.sw0
    public final void p(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.sw0
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            fl2.d(this.d, vp.T(j));
        }
    }

    @Override // defpackage.sw0
    public final void r(u10 u10Var) {
        this.J = u10Var;
    }

    @Override // defpackage.sw0
    public final void s(float f) {
        this.q = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.sw0
    public final float t() {
        return this.m;
    }

    @Override // defpackage.sw0
    public final void u(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // defpackage.sw0
    public final float v() {
        return this.q;
    }

    @Override // defpackage.sw0
    public final void w(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.sw0
    public final int x() {
        return this.k;
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        U();
        if (z) {
            i();
        }
    }

    @Override // defpackage.sw0
    public final float z() {
        return this.s;
    }
}
