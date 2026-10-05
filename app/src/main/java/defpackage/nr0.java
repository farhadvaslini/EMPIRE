package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public final class nr0 {
    public final kr0 a;

    public nr0(kr0 kr0Var) {
        this.a = kr0Var;
    }

    public final void a() {
        vr0 vr0Var = this.a.h;
        if (vr0Var.r == null) {
            return;
        }
        vr0Var.y = false;
        vr0Var.z = false;
        vr0Var.E.getClass();
        Iterator it = vr0Var.c.v().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                qn1.b();
                return;
            }
        }
    }
}
