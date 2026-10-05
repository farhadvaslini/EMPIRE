package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class r10 implements ScrollCaptureCallback {
    public final vu2 a;
    public final m41 b;
    public final k71 c;
    public final h7 d;
    public final n40 e;
    public final sy0 f;

    public r10(vu2 vu2Var, m41 m41Var, n40 n40Var, k71 k71Var, h7 h7Var) {
        this.a = vu2Var;
        this.b = m41Var;
        this.c = k71Var;
        this.d = h7Var;
        this.e = new n40(n40Var.f.k(ub0.g));
        this.f = new sy0(m41Var.b(), new q10(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r10 r10Var, ScrollCaptureSession scrollCaptureSession, m41 m41Var, q40 q40Var) {
        p10 p10Var;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionJ;
        int i3;
        m41 m41Var2;
        int i4;
        int iH;
        int iH2;
        if (q40Var instanceof p10) {
            p10Var = (p10) q40Var;
            int i5 = p10Var.o;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                p10Var.o = i5 - Integer.MIN_VALUE;
            } else {
                p10Var = new p10(r10Var, q40Var);
            }
        }
        Object obj = p10Var.m;
        int i6 = p10Var.o;
        y50 y50Var = y50.f;
        if (i6 == 0) {
            y02.Q(obj);
            i = m41Var.b;
            i2 = m41Var.d;
            sy0 sy0Var = r10Var.f;
            p10Var.i = scrollCaptureSession;
            p10Var.j = m41Var;
            p10Var.k = i;
            p10Var.l = i2;
            p10Var.o = 1;
            if (i > i2) {
                sy0Var.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i7 = i2 - i;
            int i8 = sy0Var.a;
            if (i7 > i8) {
                c.g(nc2.g(i7, i8, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            Object objB = sy0Var.b((((i7 / 2) + i) - (i8 / 2)) - sy0Var.b, p10Var);
            Object obj2 = dm3.a;
            if (objB != y50Var) {
                objB = obj2;
            }
            if (objB == y50Var) {
                obj2 = objB;
            }
            if (obj2 != y50Var) {
            }
            return y50Var;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                c.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = p10Var.l;
            i4 = p10Var.k;
            m41Var2 = p10Var.j;
            scrollCaptureSessionJ = s7.j(p10Var.i);
            y02.Q(obj);
            sy0 sy0Var2 = r10Var.f;
            iH = y02.h(i4 - vm1.M(sy0Var2.b), 0, sy0Var2.a);
            sy0 sy0Var3 = r10Var.f;
            iH2 = y02.h(i3 - vm1.M(sy0Var3.b), 0, sy0Var3.a);
            int i9 = m41Var2.a;
            int i10 = m41Var2.c;
            if (iH != iH2) {
                return m41.e;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionJ.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i9, -iH);
                m41 m41Var3 = r10Var.b;
                canvasLockHardwareCanvas.translate(-m41Var3.a, -m41Var3.b);
                r10Var.d.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionJ.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iM = vm1.M(r10Var.f.b);
                return new m41(i9, iH + iM, i10, iH2 + iM);
            } catch (Throwable th) {
                scrollCaptureSessionJ.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i11 = p10Var.l;
        int i12 = p10Var.k;
        m41 m41Var4 = p10Var.j;
        ScrollCaptureSession scrollCaptureSessionJ2 = s7.j(p10Var.i);
        y02.Q(obj);
        i = i12;
        m41Var = m41Var4;
        i2 = i11;
        scrollCaptureSession = scrollCaptureSessionJ2;
        fi1 fi1Var = new fi1(6);
        p10Var.i = scrollCaptureSession;
        p10Var.j = m41Var;
        p10Var.k = i;
        p10Var.l = i2;
        p10Var.o = 2;
        o50 o50Var = p10Var.g;
        o50Var.getClass();
        if (lq.I(o50Var).a(fi1Var, p10Var) != y50Var) {
            scrollCaptureSessionJ = scrollCaptureSession;
            i3 = i2;
            m41Var2 = m41Var;
            i4 = i;
            sy0 sy0Var22 = r10Var.f;
            iH = y02.h(i4 - vm1.M(sy0Var22.b), 0, sy0Var22.a);
            sy0 sy0Var32 = r10Var.f;
            iH2 = y02.h(i3 - vm1.M(sy0Var32.b), 0, sy0Var32.a);
            int i92 = m41Var2.a;
            int i102 = m41Var2.c;
            if (iH != iH2) {
            }
        }
        return y50Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        cl3.t(this.e, kx1.g, new j(this, runnable, null, 13), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        w83 w83VarT = cl3.t(this.e, null, new n9(this, scrollCaptureSession, rect, consumer, null, 2), 3);
        w83VarT.r(new s(16, cancellationSignal));
        cancellationSignal.setOnCancelListener(new s10(0, w83VarT));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(w22.F(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((d42) this.c.g).setValue(Boolean.TRUE);
        runnable.run();
    }
}
