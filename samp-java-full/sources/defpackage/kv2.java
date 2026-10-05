package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class kv2 extends kt2 {
    public final /* synthetic */ AtomicReferenceArray g;

    public kv2(long j, kv2 kv2Var, int i) {
        super(j, kv2Var, i);
        this.g = new AtomicReferenceArray(jv2.f);
    }

    @Override // defpackage.kt2
    public final int k() {
        return jv2.f;
    }

    @Override // defpackage.kt2
    public final void l(int i, o50 o50Var) {
        this.g.set(i, jv2.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
