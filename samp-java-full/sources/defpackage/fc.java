package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class fc implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ gc f;

    public fc(gc gcVar) {
        this.f = gcVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f.i.removeCallbacks(this);
        gc.F(this.f);
        gc gcVar = this.f;
        synchronized (gcVar.j) {
            if (gcVar.o) {
                gcVar.o = false;
                ArrayList arrayList = gcVar.l;
                gcVar.l = gcVar.m;
                gcVar.m = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gc.F(this.f);
        gc gcVar = this.f;
        synchronized (gcVar.j) {
            if (gcVar.l.isEmpty()) {
                gcVar.h.removeFrameCallback(this);
                gcVar.o = false;
            }
        }
    }
}
