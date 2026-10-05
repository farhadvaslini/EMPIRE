package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public final class fl implements gl {
    public final gl a;
    public final rs0 b;
    public final boolean c;

    public fl(gl glVar, rs0 rs0Var) {
        glVar.getClass();
        rs0Var.getClass();
        this.a = glVar;
        this.b = rs0Var;
        this.c = glVar.a();
    }

    @Override // defpackage.gl
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.gl
    public final void b(qf0 qf0Var, ua0 ua0Var, ab1 ab1Var, ns0 ns0Var) {
        qf0Var.getClass();
        ua0Var.getClass();
        this.b.f(qf0Var, new bd(this, ua0Var, ab1Var, ns0Var));
    }
}
