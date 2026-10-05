package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class lv1 {
    public final b4 a;
    public final qv1 b = new qv1();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public lv1(b4 b4Var) {
        this.a = b4Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(lv1 lv1Var, nv1 nv1Var) {
        lv1Var.getClass();
        nv1Var.getClass();
        if (lv1Var.c.add(nv1Var)) {
            qv1 qv1Var = lv1Var.b;
            qv1Var.getClass();
            if (nv1Var.c != null) {
                qn1.m(nv1Var, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            qv1Var.e.addFirst(nv1Var);
            nv1Var.c = lv1Var;
            qv1Var.b();
        }
    }

    public final void b(pv1 pv1Var) {
        if (this.d.add(pv1Var)) {
            this.b.a(this, pv1Var, -1);
        }
    }

    public final void c(py1 py1Var, int i) {
        if (i != 1 && i != 0) {
            c.g(by1.e(i, "Unsupported priority value: "));
        } else if (this.d.add(py1Var)) {
            this.b.a(this, py1Var, i);
        }
    }

    public final void d(pv1 pv1Var, kv1 kv1Var) {
        qv1 qv1Var = this.b;
        qv1Var.getClass();
        if (qv1Var.g != 0) {
            return;
        }
        nv1 nv1VarC = qv1Var.c(-1);
        qv1Var.f = nv1VarC;
        qv1Var.g = -1;
        qv1Var.h = pv1Var;
        if (kv1Var != null) {
            if (nv1VarC != null) {
                nv1VarC.d(kv1Var);
            }
            i93 i93Var = qv1Var.a;
            sv1 sv1Var = new sv1(kv1Var);
            i93Var.getClass();
            i93Var.j(null, sv1Var);
        }
    }
}
