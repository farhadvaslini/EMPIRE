package defpackage;

import android.os.Trace;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ h7 g;

    public /* synthetic */ x6(h7 h7Var, int i) {
        this.f = i;
        this.g = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        h7 h7Var = this.g;
        switch (i) {
            case 0:
                mj mjVar = h7Var.n;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!mjVar.isEmpty()) {
                    try {
                        ((cs0) mjVar.removeLast()).a();
                    } finally {
                        Trace.endSection();
                    }
                    break;
                }
                return;
            case 1:
                h7Var.C0 = false;
                MotionEvent motionEvent = h7Var.s0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    h7Var.J(motionEvent);
                    return;
                } else {
                    c.q("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                h7.l(h7Var.getRoot());
                return;
            default:
                h7.l(h7Var.getRoot());
                return;
        }
    }
}
