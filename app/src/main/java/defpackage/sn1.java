package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class sn1 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public sn1(Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ur0 ur0Var = ((rr0) ((qo1) it.next())).a;
            if (ur0Var.q >= 1) {
                Iterator it2 = ur0Var.c.v().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        qn1.b();
                        return;
                    }
                }
            }
        }
    }

    public final void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ur0 ur0Var = ((rr0) ((qo1) it.next())).a;
            if (ur0Var.q >= 1) {
                Iterator it2 = ur0Var.c.v().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        qn1.b();
                        return;
                    }
                }
            }
        }
    }

    public final void c() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ur0 ur0Var = ((rr0) ((qo1) it.next())).a;
            if (ur0Var.q >= 1) {
                Iterator it2 = ur0Var.c.v().iterator();
                while (it2.hasNext()) {
                    if (it2.next() != null) {
                        qn1.b();
                        return;
                    }
                }
            }
        }
    }

    public final void d(qo1 qo1Var) {
        this.b.remove(qo1Var);
        rn1 rn1Var = (rn1) this.c.remove(qo1Var);
        if (rn1Var != null) {
            rn1Var.a.b(rn1Var.b);
            rn1Var.b = null;
        }
        this.a.run();
    }
}
