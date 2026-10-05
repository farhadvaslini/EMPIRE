package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e61 extends m61 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(e61.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final k m;

    public e61(k kVar) {
        this.m = kVar;
    }

    @Override // defpackage.m61
    public final boolean r() {
        return true;
    }

    @Override // defpackage.m61
    public final void s(Throwable th) {
        if (n.compareAndSet(this, 0, 1)) {
            this.m.h(th);
        }
    }
}
