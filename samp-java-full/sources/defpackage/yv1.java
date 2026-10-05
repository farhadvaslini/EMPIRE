package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class yv1 {
    public ut1 a;
    public boolean b;

    public abstract fu1 a();

    public final ut1 b() {
        ut1 ut1Var = this.a;
        if (ut1Var != null) {
            return ut1Var;
        }
        c.q("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, vu1 vu1Var) {
        zl0 zl0Var = new zl0(new jm0(new sc3(new vj(1, list), new xc1(11, this, vu1Var), 1), false, new cr2(17)));
        while (zl0Var.hasNext()) {
            b().f((qt1) zl0Var.next());
        }
    }

    public void e(qt1 qt1Var, boolean z) {
        List list = (List) b().e.f.getValue();
        if (!list.contains(qt1Var)) {
            qn1.o("popBackStack was called with ", qt1Var, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        qt1 qt1Var2 = null;
        while (f()) {
            qt1Var2 = (qt1) listIterator.previous();
            if (s51.n(qt1Var2, qt1Var)) {
                break;
            }
        }
        if (qt1Var2 != null) {
            b().d(qt1Var2, z);
        }
    }

    public boolean f() {
        return true;
    }

    public fu1 c(fu1 fu1Var) {
        return fu1Var;
    }
}
