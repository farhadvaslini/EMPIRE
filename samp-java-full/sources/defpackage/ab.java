package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ab implements sc2, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long m;
    public final View f;
    public boolean h;
    public boolean k;
    public long l;
    public final PriorityQueue g = new PriorityQueue(11, new ya(0));
    public final Choreographer i = Choreographer.getInstance();
    public final za j = new za();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ab(View view) {
        float refreshRate;
        this.f = view;
        if (m == 0) {
            Display display = view.getDisplay();
            if (view.isInEditMode() || display == null) {
                refreshRate = 60.0f;
                m = (long) (1.0E9f / refreshRate);
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                }
                m = (long) (1.0E9f / refreshRate);
            }
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.k = true;
        }
    }

    @Override // defpackage.sc2
    public final void a(rc2 rc2Var) {
        this.g.add(new ed2(1, rc2Var));
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.post(this);
    }

    public final boolean b() {
        za zaVar = this.j;
        long jA = zaVar.a();
        s51.J(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.g;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((ed2) objPeek).b.c(zaVar)) {
                priorityQueue.poll();
                z = false;
            }
            zaVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.k) {
            this.l = j;
            this.f.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.k = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = false;
        this.f.removeCallbacks(this);
        this.i.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.g;
        if (!priorityQueue.isEmpty() && this.h && this.k) {
            View view = this.f;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * m) + nanos;
                za zaVar = this.j;
                zaVar.a = z;
                zaVar.b = Math.max(this.l, nanos) + m;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (zaVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.i.postFrameCallback(this);
                } else {
                    this.h = false;
                }
                s51.J(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.h = false;
    }
}
