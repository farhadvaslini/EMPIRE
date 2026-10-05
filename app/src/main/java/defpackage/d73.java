package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class d73 extends p93 {
    public int c;

    public d73(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.p93
    public final void a(p93 p93Var) {
        p93Var.getClass();
        this.c = ((d73) p93Var).c;
    }

    @Override // defpackage.p93
    public final p93 b(long j) {
        return new d73(this.c, j);
    }
}
