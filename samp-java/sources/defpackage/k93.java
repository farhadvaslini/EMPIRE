package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class k93 extends p93 {
    public j0 c;
    public int d;
    public int e;

    public k93(long j, j0 j0Var) {
        super(j);
        this.c = j0Var;
    }

    @Override // defpackage.p93
    public final void a(p93 p93Var) {
        synchronized (w7.g0) {
            p93Var.getClass();
            this.c = ((k93) p93Var).c;
            this.d = ((k93) p93Var).d;
            this.e = ((k93) p93Var).e;
        }
    }

    @Override // defpackage.p93
    public final p93 b(long j) {
        return new k93(j, this.c);
    }
}
