package defpackage;

import com.nvidia.devtech.NvEventQueueActivity;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class vf implements zy1 {
    public final /* synthetic */ NvEventQueueActivity a;

    public vf(NvEventQueueActivity nvEventQueueActivity) {
        this.a = nvEventQueueActivity;
    }

    @Override // defpackage.zy1
    public final void a(xz xzVar) {
        NvEventQueueActivity nvEventQueueActivity = this.a;
        jg delegate = nvEventQueueActivity.getDelegate();
        delegate.a();
        nvEventQueueActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.d();
    }
}
