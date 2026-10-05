package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class ru implements ns0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ AtomicReference g;

    public /* synthetic */ ru(AtomicReference atomicReference, int i) {
        this.f = i;
        this.g = atomicReference;
    }

    @Override // defpackage.ns0
    public final Object h(Object obj) {
        int i = this.f;
        dm3 dm3Var = dm3.a;
        AtomicReference atomicReference = this.g;
        switch (i) {
            case 0:
                ij2 ij2Var = (ij2) atomicReference.get();
                if (ij2Var != null) {
                    ij2Var.d();
                }
                break;
            default:
                ij2 ij2Var2 = (ij2) atomicReference.get();
                if (ij2Var2 != null) {
                    ij2Var2.d();
                }
                break;
        }
        return dm3Var;
    }
}
