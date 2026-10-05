package defpackage;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class nv1 {
    public vp a;
    public boolean b;
    public lv1 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(kv1 kv1Var);

    public abstract void d(kv1 kv1Var);

    public final void e() {
        lv1 lv1Var = this.c;
        if (lv1Var == null || !lv1Var.c.remove(this)) {
            return;
        }
        qv1 qv1Var = lv1Var.b;
        qv1Var.getClass();
        if (equals(qv1Var.f)) {
            if (qv1Var.g == -1) {
                a();
            }
            qv1Var.f = null;
            qv1Var.g = 0;
            qv1Var.h = null;
        }
        qv1Var.d.remove(this);
        qv1Var.e.remove(this);
        this.c = null;
        qv1Var.b();
    }

    public final void f(boolean z) {
        qv1 qv1Var;
        if (this.b == z) {
            return;
        }
        this.b = z;
        lv1 lv1Var = this.c;
        if (lv1Var == null || (qv1Var = lv1Var.b) == null) {
            return;
        }
        qv1Var.b();
    }
}
