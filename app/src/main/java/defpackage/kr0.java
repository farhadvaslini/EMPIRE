package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements cr3, yy1, d4, wq2 {
    public final wf f;
    public final Handler g;
    public final vr0 h;
    public final /* synthetic */ wf i;

    public kr0(wf wfVar) {
        this.i = wfVar;
        Handler handler = new Handler();
        this.h = new vr0();
        this.f = wfVar;
        this.g = handler;
    }

    @Override // defpackage.d4
    public final z3 getActivityResultRegistry() {
        return this.i.getActivityResultRegistry();
    }

    @Override // defpackage.of1
    public final gf1 getLifecycle() {
        return this.i.mFragmentLifecycleRegistry;
    }

    @Override // defpackage.yy1
    public final xy1 getOnBackPressedDispatcher() {
        return this.i.getOnBackPressedDispatcher();
    }

    @Override // defpackage.wq2
    public final tq2 getSavedStateRegistry() {
        return this.i.getSavedStateRegistry();
    }

    @Override // defpackage.cr3
    public final br3 getViewModelStore() {
        return this.i.getViewModelStore();
    }
}
