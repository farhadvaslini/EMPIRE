package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class yw0 implements sw0 {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public u10 G;
    public int H;
    public final sr b;
    public final rr c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public yx k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public yw0() {
        sr srVar = new sr();
        rr rrVar = new rr();
        this.b = srVar;
        this.c = rrVar;
        RenderNode renderNodeF = xw0.f();
        this.d = renderNodeF;
        this.e = 0L;
        renderNodeF.setClipToBounds(false);
        c(renderNodeF, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = wx.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.H = 0;
    }

    @Override // defpackage.sw0
    public final u10 A() {
        return this.G;
    }

    @Override // defpackage.sw0
    public final long B() {
        return this.s;
    }

    @Override // defpackage.sw0
    public final void C(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }

    @Override // defpackage.sw0
    public final float D() {
        return this.w;
    }

    @Override // defpackage.sw0
    public final void E() {
        this.d.discardDisplayList();
    }

    @Override // defpackage.sw0
    public final void F(ua0 ua0Var, bb1 bb1Var, qw0 qw0Var, kd kdVar) {
        rr rrVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            sr srVar = this.b;
            n6 n6Var = srVar.a;
            Canvas canvas = n6Var.a;
            n6Var.a = recordingCanvasBeginRecording;
            pi piVar = rrVar.g;
            piVar.N(ua0Var);
            piVar.O(bb1Var);
            piVar.h = qw0Var;
            piVar.Q(this.e);
            piVar.M(n6Var);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                n6Var.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                kdVar.h(rrVar);
                n6Var.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                kdVar.h(rrVar);
            }
            srVar.a.a = canvas;
            this.d.endRecording();
        } catch (Throwable th) {
            this.d.endRecording();
            throw th;
        }
    }

    @Override // defpackage.sw0
    public final void G(long j, int i, int i2) {
        this.E = i;
        this.F = i2;
        boolean zA = h43.a(this.e, lr.T(j));
        this.e = lr.T(j);
        U();
        if (zA || !gy1.b(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // defpackage.sw0
    public final float H() {
        return this.o;
    }

    @Override // defpackage.sw0
    public final void I(pr prVar) {
        Canvas canvas = o6.a;
        ((n6) prVar).a.drawRenderNode(this.d);
    }

    @Override // defpackage.sw0
    public final int J() {
        return this.H;
    }

    @Override // defpackage.sw0
    public final float K() {
        return this.t;
    }

    @Override // defpackage.sw0
    public final yx L() {
        return this.k;
    }

    @Override // defpackage.sw0
    public final void M(int i) {
        this.H = i;
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
        return this.u;
    }

    @Override // defpackage.sw0
    public final float P() {
        return this.q;
    }

    @Override // defpackage.sw0
    public final boolean Q() {
        return this.d.hasDisplayList();
    }

    @Override // defpackage.sw0
    public final float R() {
        return this.v;
    }

    @Override // defpackage.sw0
    public final void S(long j) {
        this.l = j;
        i();
    }

    @Override // defpackage.sw0
    public final long T() {
        return this.r;
    }

    public final void U() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    public final void a() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    @Override // defpackage.sw0
    public final void b(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    public final void c(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // defpackage.sw0
    public final void d(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // defpackage.sw0
    public final float e() {
        return this.m;
    }

    @Override // defpackage.sw0
    public final void f(yx yxVar) {
        this.k = yxVar;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(yxVar != null ? yxVar.a : null);
        h();
    }

    @Override // defpackage.sw0
    public final void g(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    public final void h() {
        int i = this.H;
        if (i != 1 && this.j == 3 && this.k == null && this.G == null) {
            c(this.d, i);
        } else {
            c(this.d, 1);
        }
    }

    public final void i() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    @Override // defpackage.sw0
    public final void j(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // defpackage.sw0
    public final void k(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // defpackage.sw0
    public final void l(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(vp.T(j));
    }

    @Override // defpackage.sw0
    public final void m(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // defpackage.sw0
    public final void n(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(r51.B(i));
        h();
    }

    @Override // defpackage.sw0
    public final void o(boolean z) {
        this.x = z;
        a();
    }

    @Override // defpackage.sw0
    public final void p(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // defpackage.sw0
    public final void q(long j) {
        this.s = j;
        this.d.setSpotShadowColor(vp.T(j));
    }

    @Override // defpackage.sw0
    public final void r(u10 u10Var) {
        this.G = u10Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(u10Var != null ? u10Var.c() : null);
        }
    }

    @Override // defpackage.sw0
    public final void s(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // defpackage.sw0
    public final float t() {
        return this.i;
    }

    @Override // defpackage.sw0
    public final void u(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // defpackage.sw0
    public final float v() {
        return this.n;
    }

    @Override // defpackage.sw0
    public final void w(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // defpackage.sw0
    public final int x() {
        return this.j;
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
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        U();
        if (z) {
            i();
        }
    }

    @Override // defpackage.sw0
    public final float z() {
        return this.p;
    }
}
