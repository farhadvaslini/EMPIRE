package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class wy implements gl {
    public final gl a;
    public final gl b;
    public final boolean c;

    public wy(gl glVar, gl glVar2) {
        glVar.getClass();
        glVar2.getClass();
        this.a = glVar;
        this.b = glVar2;
        this.c = glVar.a() || glVar2.a();
    }

    @Override // defpackage.gl
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.gl
    public final void b(qf0 qf0Var, ua0 ua0Var, ab1 ab1Var, ns0 ns0Var) {
        qf0Var.getClass();
        ua0Var.getClass();
        this.a.b(qf0Var, ua0Var, ab1Var, ns0Var);
        this.b.b(qf0Var, ua0Var, ab1Var, ns0Var);
    }
}
