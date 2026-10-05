package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ er0 g;

    public /* synthetic */ dr0(er0 er0Var, int i) {
        this.f = i;
        this.g = er0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        er0 er0Var = this.g;
        switch (i) {
            case 0:
                ViewParent parent = er0Var.i.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                er0Var.a();
                View view = er0Var.i;
                if (view.isEnabled() && !view.isLongClickable() && er0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    er0Var.l = true;
                    break;
                }
                break;
        }
    }
}
