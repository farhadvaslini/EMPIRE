package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class g73 extends p93 {
    public Object c;

    public g73(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.p93
    public final void a(p93 p93Var) {
        p93Var.getClass();
        this.c = ((g73) p93Var).c;
    }

    @Override // defpackage.p93
    public final p93 b(long j) {
        return new g73(j, this.c);
    }
}
