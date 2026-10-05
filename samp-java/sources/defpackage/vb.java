package defpackage;

import android.view.ActionMode;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import top.th1nk.samp.feature.game.GameActivity;
import top.th1nk.samp.feature.game.GameAudioPlayer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class vb implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vb(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f) {
            case 0:
                wb wbVar = (wb) this.g;
                tb tbVar = (tb) this.h;
                ub ubVar = (ub) this.i;
                ActionMode actionModeStartActionMode = wbVar.a.startActionMode(new en0(tbVar), 1);
                wbVar.h = actionModeStartActionMode;
                if (actionModeStartActionMode == null) {
                    ubVar.close();
                    return;
                }
                return;
            case 1:
                qh0 qh0Var = (qh0) this.g;
                vr vrVar = (vr) this.h;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.i;
                try {
                    jq0 jq0VarU = lr.u(qh0Var.a);
                    if (jq0VarU == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    iq0 iq0Var = (iq0) jq0VarU.a;
                    synchronized (iq0Var.d) {
                        iq0Var.f = threadPoolExecutor;
                        break;
                    }
                    jq0VarU.a.a(new ph0(vrVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    vrVar.O(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case oc2.FLOAT_FIELD_NUMBER /* 2 */:
                GameActivity.runCleoDialogMutation$lambda$0((AtomicBoolean) this.g, (cs0) this.h, (CountDownLatch) this.i);
                return;
            default:
                GameAudioPlayer.cleoLoadStream$lambda$0((ok2) this.g, (gv0) this.h, (String) this.i);
                return;
        }
    }
}
