package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kw0 extends ja0 implements of0 {
    public final /* synthetic */ int v = 1;
    public final w8 w;
    public final ug0 x;
    public Object y;

    public kw0(sb3 sb3Var, w8 w8Var, ug0 ug0Var, x12 x12Var) {
        this.w = w8Var;
        this.x = ug0Var;
        this.y = x12Var;
        p1(sb3Var);
    }

    public static boolean s1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean t1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.of0
    public final void m0(vb1 vb1Var) {
        boolean zT1;
        long j;
        char c;
        boolean z;
        boolean zS1;
        float f;
        float f2;
        int i = this.v;
        w8 w8Var = this.w;
        ug0 ug0Var = this.x;
        switch (i) {
            case 0:
                x12 x12Var = (x12) this.y;
                rr rrVar = vb1Var.f;
                w8Var.j(rrVar.a());
                if (h43.c(rrVar.a())) {
                    vb1Var.c();
                    return;
                }
                vb1Var.c();
                w8Var.d.getValue();
                Canvas canvasA = o6.a(rrVar.g.k());
                if (ug0.f(ug0Var.f)) {
                    zT1 = t1(270.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (rrVar.a() & 4294967295L)))) << 32) | (((long) Float.floatToRawIntBits(vb1Var.T(x12Var.a(vb1Var.getLayoutDirection())))) & 4294967295L), ug0Var.c(), canvasA);
                } else {
                    zT1 = false;
                }
                if (ug0.f(ug0Var.d)) {
                    EdgeEffect edgeEffectE = ug0Var.e();
                    zT1 = t1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(vb1Var.T(x12Var.d()))) & 4294967295L), edgeEffectE, canvasA) || zT1;
                }
                if (ug0.f(ug0Var.g)) {
                    EdgeEffect edgeEffectD = ug0Var.d();
                    zT1 = t1(90.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(vb1Var.T(x12Var.b(vb1Var.getLayoutDirection())) + (-((float) vm1.M(Float.intBitsToFloat((int) (rrVar.a() >> 32))))))) & 4294967295L), edgeEffectD, canvasA) || zT1;
                }
                if (ug0.f(ug0Var.e)) {
                    EdgeEffect edgeEffectB = ug0Var.b();
                    float fT = vb1Var.T(x12Var.c());
                    zT1 = t1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (rrVar.a() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (rrVar.a() & 4294967295L))) + fT)) & 4294967295L), edgeEffectB, canvasA) || zT1;
                }
                if (zT1) {
                    w8Var.d();
                    return;
                }
                return;
            default:
                rr rrVar2 = vb1Var.f;
                w8Var.j(rrVar2.a());
                Canvas canvasA2 = o6.a(rrVar2.g.k());
                w8Var.d.getValue();
                if (h43.c(rrVar2.a())) {
                    vb1Var.c();
                    return;
                }
                if (!canvasA2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = ug0Var.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = ug0Var.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = ug0Var.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = ug0Var.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = ug0Var.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = ug0Var.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = ug0Var.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = ug0Var.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    vb1Var.c();
                    return;
                }
                float fT2 = vb1Var.T(30.0f);
                boolean z2 = ug0.f(ug0Var.d) || ug0.g(ug0Var.h) || ug0.f(ug0Var.e) || ug0.g(ug0Var.i);
                boolean z3 = ug0.f(ug0Var.f) || ug0.g(ug0Var.j) || ug0.f(ug0Var.g) || ug0.g(ug0Var.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    u1().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        u1().setPosition(0, 0, (vm1.M(fT2) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                    } else {
                        if (!z3) {
                            vb1Var.c();
                            return;
                        }
                        u1().setPosition(0, 0, canvasA2.getWidth(), (vm1.M(fT2) * 2) + canvasA2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = u1().beginRecording();
                boolean zG = ug0.g(ug0Var.j);
                t02 t02Var = t02.g;
                if (zG) {
                    EdgeEffect edgeEffectA = ug0Var.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = ug0Var.a(t02Var);
                        ug0Var.j = edgeEffectA;
                    }
                    s1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (ug0.f(ug0Var.f)) {
                    EdgeEffect edgeEffectC = ug0Var.c();
                    zS1 = s1(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (ug0.g(ug0Var.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (w8Var.c() & j));
                        EdgeEffect edgeEffectA2 = ug0Var.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = ug0Var.a(t02Var);
                            ug0Var.j = edgeEffectA2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fC = i2 >= 31 ? lf.c(edgeEffectC) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            lf.d(edgeEffectA2, fC, f3);
                        } else {
                            edgeEffectA2.onPull(fC, f3);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zS1 = false;
                }
                boolean zG2 = ug0.g(ug0Var.h);
                t02 t02Var2 = t02.f;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = ug0Var.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = ug0Var.a(t02Var2);
                        ug0Var.h = edgeEffectA3;
                    }
                    s1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (ug0.f(ug0Var.d)) {
                    EdgeEffect edgeEffectE2 = ug0Var.e();
                    zS1 = s1(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zS1;
                    if (ug0.g(ug0Var.d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (w8Var.c() >> c));
                        EdgeEffect edgeEffectA4 = ug0Var.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = ug0Var.a(t02Var2);
                            ug0Var.h = edgeEffectA4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fC2 = i3 >= 31 ? lf.c(edgeEffectE2) : 0.0f;
                        if (i3 >= 31) {
                            lf.d(edgeEffectA4, fC2, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fC2, fIntBitsToFloat2);
                        }
                    }
                }
                if (ug0.g(ug0Var.k)) {
                    EdgeEffect edgeEffectA5 = ug0Var.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = ug0Var.a(t02Var);
                        ug0Var.k = edgeEffectA5;
                    }
                    s1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (ug0.f(ug0Var.g)) {
                    EdgeEffect edgeEffectD2 = ug0Var.d();
                    zS1 = s1(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zS1;
                    if (ug0.g(ug0Var.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (w8Var.c() & j));
                        EdgeEffect edgeEffectA6 = ug0Var.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = ug0Var.a(t02Var);
                            ug0Var.k = edgeEffectA6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fC3 = i4 >= 31 ? lf.c(edgeEffectD2) : 0.0f;
                        if (i4 >= 31) {
                            lf.d(edgeEffectA6, fC3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fC3, fIntBitsToFloat3);
                        }
                    }
                }
                if (ug0.g(ug0Var.i)) {
                    EdgeEffect edgeEffectA7 = ug0Var.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = ug0Var.a(t02Var2);
                        ug0Var.i = edgeEffectA7;
                    }
                    s1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (ug0.f(ug0Var.e)) {
                    EdgeEffect edgeEffectB2 = ug0Var.b();
                    boolean z4 = s1(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zS1;
                    if (ug0.g(ug0Var.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (w8Var.c() >> c));
                        EdgeEffect edgeEffectA8 = ug0Var.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = ug0Var.a(t02Var2);
                            ug0Var.i = edgeEffectA8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fC4 = i5 >= 31 ? lf.c(edgeEffectB2) : 0.0f;
                        float f4 = 1.0f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            lf.d(edgeEffectA8, fC4, f4);
                        } else {
                            edgeEffectA8.onPull(fC4, f4);
                        }
                    }
                    zS1 = z4;
                }
                if (zS1) {
                    w8Var.d();
                }
                float f5 = z ? 0.0f : fT2;
                float f6 = z2 ? 0.0f : fT2;
                bb1 layoutDirection = vb1Var.getLayoutDirection();
                n6 n6Var = new n6();
                n6Var.a = recordingCanvasBeginRecording;
                long jA = rrVar2.a();
                ua0 ua0VarO = rrVar2.g.o();
                bb1 bb1VarW = rrVar2.g.w();
                pr prVarK = rrVar2.g.k();
                long jA2 = rrVar2.g.A();
                pi piVar = rrVar2.g;
                qw0 qw0Var = (qw0) piVar.h;
                piVar.N(vb1Var);
                piVar.O(layoutDirection);
                piVar.M(n6Var);
                piVar.Q(jA);
                piVar.h = null;
                n6Var.l();
                try {
                    ((yl1) rrVar2.g.g).H(f5, f6);
                    try {
                        vb1Var.c();
                        n6Var.i();
                        pi piVar2 = rrVar2.g;
                        piVar2.N(ua0VarO);
                        piVar2.O(bb1VarW);
                        piVar2.M(prVarK);
                        piVar2.Q(jA2);
                        piVar2.h = qw0Var;
                        u1().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f, f2);
                        canvasA2.drawRenderNode(u1());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((yl1) rrVar2.g.g).H(-f5, -f6);
                    }
                } catch (Throwable th) {
                    n6Var.i();
                    pi piVar3 = rrVar2.g;
                    piVar3.N(ua0VarO);
                    piVar3.O(bb1VarW);
                    piVar3.M(prVarK);
                    piVar3.Q(jA2);
                    piVar3.h = qw0Var;
                    throw th;
                }
        }
    }

    public RenderNode u1() {
        RenderNode renderNode = (RenderNode) this.y;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeC = w93.c();
        this.y = renderNodeC;
        return renderNodeC;
    }

    public kw0(sb3 sb3Var, w8 w8Var, ug0 ug0Var) {
        this.w = w8Var;
        this.x = ug0Var;
        p1(sb3Var);
    }
}
