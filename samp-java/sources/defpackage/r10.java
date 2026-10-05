package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.r10 r8, android.view.ScrollCaptureSession r9, defpackage.m41 r10, defpackage.q40 r11) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r10.a(r10, android.view.ScrollCaptureSession, m41, q40):java.lang.Object");
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
