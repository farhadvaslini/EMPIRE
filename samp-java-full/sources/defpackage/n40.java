package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class n40 implements x50 {
    public final o50 f;

    public n40(o50 o50Var) {
        this.f = o50Var;
    }

    @Override // defpackage.x50
    public final o50 h() {
        return this.f;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f + ')';
    }
}
