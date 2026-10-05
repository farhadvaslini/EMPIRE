package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class m73 extends p93 {
    public o52 c;
    public int d;

    public m73(long j, o52 o52Var) {
        super(j);
        this.c = o52Var;
    }

    @Override // defpackage.p93
    public final void a(p93 p93Var) {
        p93Var.getClass();
        m73 m73Var = (m73) p93Var;
        synchronized (rn.c1) {
            this.c = m73Var.c;
            this.d = m73Var.d;
        }
    }

    @Override // defpackage.p93
    public final p93 b(long j) {
        return new m73(j, this.c);
    }
}
