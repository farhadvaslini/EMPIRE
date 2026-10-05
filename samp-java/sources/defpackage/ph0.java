package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class ph0 extends vr {
    public final /* synthetic */ vr l;
    public final /* synthetic */ ThreadPoolExecutor m;

    public ph0(vr vrVar, ThreadPoolExecutor threadPoolExecutor) {
        this.l = vrVar;
        this.m = threadPoolExecutor;
    }

    @Override // defpackage.vr
    public final void O(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.m;
        try {
            this.l.O(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.vr
    public final void P(pl plVar) {
        ThreadPoolExecutor threadPoolExecutor = this.m;
        try {
            this.l.P(plVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
