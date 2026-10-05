package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6c0b98a496b39c94623be7f94db3802dc9fd57238d8c9cafbc19343a9e5954ee */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/EMPIRE/samp-client-src/classes.dex */
@xv1("composable")
public final class h10 extends yv1 {
    public final d42 c = b32.w(Boolean.FALSE);

    @Override // defpackage.yv1
    public final fu1 a() {
        return new g10(this, f00.a);
    }

    @Override // defpackage.yv1
    public final void d(List list, vu1 vu1Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qt1 qt1Var = (qt1) it.next();
            ut1 ut1VarB = b();
            cj2 cj2Var = ut1VarB.e;
            qt1Var.getClass();
            i93 i93Var = ut1VarB.c;
            Iterable iterable = (Iterable) i93Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((qt1) it2.next()) == qt1Var) {
                        Iterable iterable2 = (Iterable) cj2Var.f.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((qt1) it3.next()) == qt1Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            qt1 qt1Var2 = (qt1) qx.z0((List) cj2Var.f.getValue());
            if (qt1Var2 != null) {
                i93Var.j(null, oz2.F((Set) i93Var.getValue(), qt1Var2));
            }
            i93Var.j(null, oz2.F((Set) i93Var.getValue(), qt1Var));
            ut1VarB.f(qt1Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.yv1
    public final void e(qt1 qt1Var, boolean z) {
        b().e(qt1Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(qt1 qt1Var) {
        ut1 ut1VarB = b();
        qt1Var.getClass();
        i93 i93Var = ut1VarB.c;
        i93Var.j(null, oz2.F((Set) i93Var.getValue(), qt1Var));
        wt1 wt1Var = ut1VarB.h.b;
        wt1Var.getClass();
        if (wt1Var.f.contains(qt1Var)) {
            qt1Var.a(ff1.i);
        } else {
            c.q("Cannot transition entry that is not in the back stack");
        }
    }
}
