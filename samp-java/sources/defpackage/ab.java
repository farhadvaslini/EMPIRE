package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
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
        To view partially-correct add '--show-bad-code' argument
    */
    public ab(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            ya r1 = new ya
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.g = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.i = r0
            za r0 = new za
            r0.<init>()
            r4.j = r0
            long r0 = defpackage.ab.m
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.ab.m = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.k = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab.<init>(android.view.View):void");
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
