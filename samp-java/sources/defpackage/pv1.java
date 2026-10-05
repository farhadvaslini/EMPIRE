package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
public abstract class pv1 {
    public lv1 a;
    public boolean b;

    public final void a() {
        lv1 lv1Var = this.a;
        if (lv1Var == null) {
            c.q("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            lv1Var.d(this, null);
        }
        qv1 qv1Var = lv1Var.b;
        b4 b4Var = lv1Var.a;
        qv1Var.getClass();
        if (equals(qv1Var.h) && -1 == qv1Var.g) {
            nv1 nv1VarC = qv1Var.f;
            if (nv1VarC == null) {
                nv1VarC = qv1Var.c(-1);
            }
            qv1Var.f = null;
            qv1Var.g = 0;
            qv1Var.h = null;
            if (nv1VarC == null) {
                ((xy1) b4Var.b).a.run();
            } else {
                nv1VarC.b();
            }
            i93 i93Var = qv1Var.a;
            i93Var.getClass();
            i93Var.j(null, rv1.h);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
