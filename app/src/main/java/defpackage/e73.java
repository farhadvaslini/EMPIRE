package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class e73 extends p93 {
    public long c;

    public e73(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.p93
    public final void a(p93 p93Var) {
        p93Var.getClass();
        this.c = ((e73) p93Var).c;
    }

    @Override // defpackage.p93
    public final p93 b(long j) {
        return new e73(j, this.c);
    }
}
