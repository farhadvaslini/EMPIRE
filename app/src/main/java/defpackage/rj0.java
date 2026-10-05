package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class rj0 extends tj0 {
    public final jr h;
    public final /* synthetic */ vj0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj0(vj0 vj0Var, long j, jr jrVar) {
        super(j);
        this.i = vj0Var;
        this.h = jrVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws vb0 {
        this.h.H(this.i);
    }

    @Override // defpackage.tj0
    public final String toString() {
        return super.toString() + this.h;
    }
}
