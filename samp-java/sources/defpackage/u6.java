package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final /* synthetic */ class u6 implements Executor {
    public final /* synthetic */ h7 f;

    public /* synthetic */ u6(h7 h7Var) {
        this.f = h7Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h7 h7VarM8getOutOfFrameExecutor = this.f.m8getOutOfFrameExecutor();
        if (h7VarM8getOutOfFrameExecutor != null) {
            h7VarM8getOutOfFrameExecutor.G(new c7(0, runnable, Runnable.class, "run", "run()V", 0, 0, 1));
        }
    }
}
