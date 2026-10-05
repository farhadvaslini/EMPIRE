package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class gc extends q50 {
    public static final xb3 r = new xb3(new v3(12));
    public static final ec s = new ec(0);
    public final Choreographer h;
    public final Handler i;
    public boolean n;
    public boolean o;
    public final ic q;
    public final Object j = new Object();
    public final mj k = new mj();
    public ArrayList l = new ArrayList();
    public ArrayList m = new ArrayList();
    public final fc p = new fc(this);

    public gc(Choreographer choreographer, Handler handler) {
        this.h = choreographer;
        this.i = handler;
        this.q = new ic(choreographer, this);
    }

    public static final void F(gc gcVar) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (gcVar.j) {
                mj mjVar = gcVar.k;
                runnable = (Runnable) (mjVar.isEmpty() ? null : mjVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (gcVar.j) {
                    mj mjVar2 = gcVar.k;
                    runnable = (Runnable) (mjVar2.isEmpty() ? null : mjVar2.removeFirst());
                }
            }
            synchronized (gcVar.j) {
                if (gcVar.k.isEmpty()) {
                    z = false;
                    gcVar.n = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.q50
    public final void B(o50 o50Var, Runnable runnable) {
        synchronized (this.j) {
            this.k.addLast(runnable);
            if (!this.n) {
                this.n = true;
                this.i.post(this.p);
                if (!this.o) {
                    this.o = true;
                    this.h.postFrameCallback(this.p);
                }
            }
        }
    }
}
