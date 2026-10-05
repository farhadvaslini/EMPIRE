package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class hc implements Choreographer.FrameCallback {
    public final /* synthetic */ jr f;
    public final /* synthetic */ ns0 g;

    public hc(jr jrVar, ic icVar, ns0 ns0Var) {
        this.f = jrVar;
        this.g = ns0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object qn2Var;
        try {
            qn2Var = this.g.h(Long.valueOf(j));
        } catch (Throwable th) {
            qn2Var = new qn2(th);
        }
        this.f.t(qn2Var);
    }
}
